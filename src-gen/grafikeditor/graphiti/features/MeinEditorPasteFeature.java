package grafikeditor.graphiti.features;

import graphmodel.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.AbstractPasteFeature;

import grafikeditor.graphiti.*;
import de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError;

public class MeinEditorPasteFeature extends AbstractPasteFeature {

	private Integer xMin = null;
	private Integer yMin = null;

	private Integer xMinAbs = null;
	private Integer yMinAbs = null;
	
	private int xContext, yContext, xContainerShift, yContainerShift;
	private ECincoError error = ECincoError.OK;
	
	public MeinEditorPasteFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

		@Override
	public boolean canPaste(IPasteContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes == null || pes.length != 1) 
			return false;
		Object bo = getBusinessObjectForPictogramElement(pes[0]);
		if (!(bo instanceof grafikeditor.meineditor.MeinEditor) && !(bo instanceof Container))
			return false;
		
		Object[] bos = getFromClipboard();
		if (bos == null || bos.length == 0)
			return false;
		EList<Class<? extends graphmodel.Node>> classes = new BasicEList<Class<? extends graphmodel.Node>>();
		for (Object obj : bos)
			if (obj instanceof Node)
				classes.add(((graphmodel.Node) obj).getClass());
		if (bo instanceof ModelElementContainer) {
			return ((ModelElementContainer) bo).canContain(classes);
		}
		return true;
	}

	@Override
	public void paste(IPasteContext context) {
		xContext = context.getX();
		yContext = context.getY();
		
		xMin = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.getUpperLeft().x;
		yMin = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.getUpperLeft().y;
		
		xMinAbs = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.getUpperLeft().x;
		yMinAbs = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.getUpperLeft().y;
		
		xContainerShift = 0;
		yContainerShift = 0;
	
		List<PictogramElement> subGraph = createList(getFromClipboard());
		Set<PictogramElement> copies = new HashSet<>(); 
		copies = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(subGraph, getDiagram());
		
		List<PictogramElement> graphicalContainer = new ArrayList<>();
		List<Connection> connections = new ArrayList<>();
		
		computeContainerShift(context.getPictogramElements()[0]);

		for (PictogramElement pe : copies) {
			if (pe instanceof Connection && !connections.contains(pe)) {
				translate(pe);
				connections.add((Connection) pe);
			}
			
			if (pe instanceof Shape && !graphicalContainer.contains(pe)) {
				translate(pe);
				graphicalContainer.add(pe);
			}
		}
		
		PictogramElement target = context.getPictogramElements()[0];
		ContainerShape container = null;
		
		if (target instanceof ContainerShape)
			container = (ContainerShape) target;
		if (container == null)
			return;
		ModelElementContainer model = (ModelElementContainer) getBusinessObjectForPictogramElement(container);
		for (PictogramElement pe : graphicalContainer) {
			container.getChildren().add((Shape) pe);
			model.getModelElements().add((ModelElement) pe.getLink().getBusinessObjects().get(0));
			((ModelElement) pe.getLink().getBusinessObjects().get(0)).setId(EcoreUtil.generateUUID());
			addLinks(getDiagram(), pe);
		}
		for (Connection pe : connections) {
			getDiagram().getConnections().add((Connection) pe);
			getDiagram().getPictogramLinks().add(pe.getLink());
			if (pe.getLink().getBusinessObjects().get(0) instanceof Edge) {
				Edge e = (Edge) pe.getLink().getBusinessObjects().get(0);
				e.setId(EcoreUtil.generateUUID());
				ModelElementContainer common = MeinEditorGraphitiUtils.getInstance().getCommonContainer(model, e);
				model.getModelElements().remove(e);
				common.getModelElements().add(e);
			}
		}
		resovleExternalRefs(copies.toArray(new PictogramElement[] {}));
	}

	private void computeContainerShift(PictogramElement pe) {
		xContainerShift = 0;
		yContainerShift = 0;
		
		while (pe instanceof Shape &&  !(pe instanceof Diagram)) {
			xContainerShift += pe.getGraphicsAlgorithm().getX();
			yContainerShift += pe.getGraphicsAlgorithm().getY();
			pe = ((Shape) pe).getContainer();
		}
	}

	private void addLinks(Diagram diagram, PictogramElement pe) {
		if (pe.getLink() != null && !diagram.getPictogramLinks().contains(pe.getLink())) {
			diagram.getPictogramLinks().add(pe.getLink());
		}
		if (pe instanceof ContainerShape) {
			for (Shape s : ((ContainerShape) pe).getChildren()) {
				if (s.getLink() != null && !diagram.getPictogramLinks().contains(s.getLink()))
					diagram.getPictogramLinks().add(s.getLink());
				addLinks(diagram, s);
			}
		}
	}
	
	private boolean canPaste(Object bo, Object target) {
		if (bo instanceof grafikeditor.meineditor.Start) {
		}

		if (bo instanceof grafikeditor.meineditor.End) {
		}

		if (bo instanceof grafikeditor.meineditor.Terminal) {
		}

		if (bo instanceof grafikeditor.meineditor.Variable) {
		}

		if (bo instanceof grafikeditor.meineditor.Gateway) {
		}



		if (bo instanceof Edge)
			return true;
		return false;
	}

	private void translate(PictogramElement pe) {
		if (pe instanceof Connection) {
			translateConnection((Connection) pe);
		} else {
			GraphicsAlgorithm ga =  pe.getGraphicsAlgorithm();
			ga.setX(xContext - xContainerShift + (ga.getX() - xMin));
			ga.setY(yContext - yContainerShift + (ga.getY() - yMin));
		}
	}
	
	private void translateConnection(Connection c) {
		if (c instanceof FreeFormConnection) {
			FreeFormConnection ffc = (FreeFormConnection) c;
			for (Point p : ffc.getBendpoints()) {
				p.setX(xContext + (p.getX() - xMinAbs));
				p.setY(yContext + (p.getY() - yMinAbs));
			}
		}
	}
	
	private List<PictogramElement> createList(Object[] fromClipboard) {
		List<PictogramElement> pes = new ArrayList<>();
		for (Object o : fromClipboard) {
			if (o instanceof PictogramElement)
				pes.add((PictogramElement) o);
		}
		return pes;
	}

	private void resovleExternalRefs(PictogramElement[] pictogramElements) {
		for (PictogramElement pe : pictogramElements) {
			resolveExternalRefs(pe);
			if (pe instanceof ContainerShape) {
				PictogramElement[] array = ((ContainerShape) pe).getChildren().toArray(new PictogramElement[] {});
				resovleExternalRefs(array);
			}
		}
	}
	
	private void resolveExternalRefs(PictogramElement pe) {
		GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
		ga.setBackground(addColor(getDiagram(), ga.getBackground()));
		ga.setForeground(addColor(getDiagram(), ga.getForeground()));
		if (ga instanceof Text) {
			((Text) ga).setFont(addFont(getDiagram(), ((Text) ga).getFont()));
		}
	}
	
	private Color addColor(Diagram d, Color c) {
		if (c == null)
			return null;
		for (Color color : getDiagram().getColors()) {
			if (color.getBlue() == c.getBlue() && color.getGreen() == c.getGreen() && color.getRed() == c.getRed())
				return color;
		}
		Color cc = EcoreUtil.copy(c);
		getDiagram().getColors().add(cc);
		return cc;
	}
	
	private Font addFont(Diagram d, Font f) {
		for (Font font : getDiagram().getFonts()) {
			if (font.getName().equals(f.getName()) && font.getSize() == f.getSize()) 
				return font;
		}
		Font cf = EcoreUtil.copy(f);
		getDiagram().getFonts().add(cf);
		return cf;
	}

	public ECincoError getError() {
		return error;
	}

	public void setError(ECincoError error) {
		this.error = error;
	}

	
}
