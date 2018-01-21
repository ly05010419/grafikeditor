package grafikeditor.graphiti;

import graphmodel.*;

import java.util.HashMap;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.AreaContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.services.GraphitiUi;


public class MeinEditorCreator extends RecordingCommand{
	
	private Diagram d;
	private grafikeditor.meineditor.MeinEditor gm;

	
	public MeinEditorCreator(TransactionalEditingDomain domain) {
		super(domain);
	}

	public MeinEditorCreator(TransactionalEditingDomain domain, grafikeditor.meineditor.MeinEditor gm, Diagram diagrm) {
		super(domain);
		this.d = diagrm;
		this.gm = gm;
	}
	

	@Override
	protected void doExecute() {
		IDiagramTypeProvider dtp = GraphitiUi.getExtensionManager().createDiagramTypeProvider(d,
				"grafikeditor.MeinEditorDiagramTypeProvider");
		IFeatureProvider fp = dtp.getFeatureProvider();
		
		fp.link(d, gm);
		
		HashMap<Object, ContainerShape> addedElements = new HashMap<Object, ContainerShape>();
		int x = 0;
		for (Node n : gm.getAllNodes()) {
			if (n.getContainer() != null && n.getContainer() instanceof grafikeditor.meineditor.MeinEditor) {
				AreaContext ac = new AreaContext();
				ac.setLocation(x, 10);
				AddContext addContext = new AddContext(ac, n);
				addContext.setTargetContainer(d);
				IAddFeature af = fp.getAddFeature(addContext);
				if (af != null && af.canAdd(addContext)) {
					ContainerShape cs = (ContainerShape) af.add(addContext);
					addedElements.put(n, cs);
				}
				x += 150;
			}
		}

		for (Container nc : gm.getAllContainers()) {
			AreaContext ac = new AreaContext();
			ac.setLocation(x, 10);
			AddContext addContext = new AddContext(ac, nc);
			addContext.setTargetContainer(d);
			IAddFeature af = fp.getAddFeature(addContext);
			if (af != null && af.canAdd(addContext)) {
				ContainerShape cs = (ContainerShape) af.add(addContext);
				addedElements.put(nc, cs);
				int i = 0;
				for (Node n : nc.getModelElements(Node.class)) {
					ac = new AreaContext();
					ac.setLocation(i+=5, 10);
					addContext = new AddContext(ac, n);
					addContext.setTargetContainer(cs);
					af = fp.getAddFeature(addContext);
					if (af != null && af.canAdd(addContext)) {
						ContainerShape nodeContainerCS = (ContainerShape) af.add(addContext);
						addedElements.put(n, nodeContainerCS);
					}
					x += 150;
				}
			}
			x += 150;
			
		}
		
		for (Edge e : gm.getAllEdges()){
			Anchor ta = null, sa = null;
			ContainerShape cs;
			cs = addedElements.get(e.getTargetElement());
			if (cs != null) {
				ta = cs.getAnchors().get(0);
				cs = null;
			}
			cs = addedElements.get(e.getSourceElement());
			if (cs != null) {
				sa = cs.getAnchors().get(0);
			}
			
			AddConnectionContext acc = new AddConnectionContext(sa, ta);
			acc.setNewObject(e);
			acc.setTargetContainer(d);
			IAddFeature af = fp.getAddFeature(acc);
			if (af != null && af.canAdd(acc)) {
				PictogramElement pe = af.add(acc);
			}
			
		}
	}
	
}
