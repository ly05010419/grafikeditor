package grafikeditor.graphiti.features.resize;

import graphmodel.*;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import grafikeditor.meineditor.Terminal;
import grafikeditor.graphiti.*;
import grafikeditor.graphiti.features.layout.MeinEditorLayoutUtils;

public class ResizeTerminalFeature extends de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractResizeFeature {

	private grafikeditor.meineditor.Terminal bo;

	public ResizeTerminalFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	
	public boolean canResizeShape(IResizeShapeContext context, boolean apiCall) {
		if (apiCall) {
			Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
			return (bo instanceof grafikeditor.meineditor.Terminal);
		}
		return false;
	}
	
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		return canResizeShape(context, true);
	}

	@Override
	public void resizeShape(final IResizeShapeContext context) {
		TransactionalEditingDomain dom = TransactionUtil.getEditingDomain(getDiagram());
		if (dom == null) 
			dom = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getDiagram().eResource().getResourceSet());
		dom.getCommandStack().execute(new RecordingCommand(dom, "Resize") {
			
			@Override
			protected void doExecute() {
				bo = (grafikeditor.meineditor.Terminal) getBusinessObjectForPictogramElement(context.getPictogramElement());
				de.jabc.cinco.meta.core.ui.features.CincoResizeFeature.resize(context);
				try {	
					if (!isApiCall()) {
						grafikeditor.api.cmeineditor.CMeinEditor wrapped = MeinEditorWrapper.wrapGraphModel(bo.getRootElement(), getDiagram());
						grafikeditor.api.cmeineditor.CTerminal tmp = wrapped.findCTerminal(bo);
							
					}
				} catch (Exception e) {
					
				}
				layoutPictogramElement(context.getPictogramElement());
			}

		});

	}

}
