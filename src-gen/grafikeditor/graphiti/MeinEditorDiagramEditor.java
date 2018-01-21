package grafikeditor.graphiti;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;

import de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry;

import grafikeditor.graphiti.content.adapter.MeinEditorEContentAdapter;

public class MeinEditorDiagramEditor extends DiagramEditor {

	@Override
	public void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		
		ReferenceRegistry.getInstance().registerListener();

		/*FigureCanvas canvas = (FigureCanvas) getGraphicalControl();
		canvas.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				if (getDiagramTypeProvider() instanceof MeinEditorDiagramTypeProvider) {
					MeinEditorDiagramTypeProvider dtp = (MeinEditorDiagramTypeProvider) getDiagramTypeProvider();
					for (Shape child : dtp.getDiagram().getChildren()) {
						final ResizeShapeContext context = createContext(child);
						final IResizeShapeFeature rsf = dtp.getFeatureProvider().getResizeShapeFeature(context);
						if (rsf.canResizeShape(context)) {
							TransactionalEditingDomain dom = dtp.getDiagramBehavior().getEditingDomain();
							dom.getCommandStack().execute(new RecordingCommand(dom, "Resize Diagram") {
								
								@Override
								protected void doExecute() {
									rsf.resizeShape(context);
								}
							});
							
						}
					}
				}
			}
			
			@Override
			public void controlMoved(ControlEvent e) {
				System.err.println("Reciving move event");
			}
		});*/

		for (PictogramLink pl : MeinEditorGraphitiUtils.getInstance().getDTP().getDiagram().getPictogramLinks())
			for (EObject bo : pl.getBusinessObjects())
				MeinEditorEContentAdapter.getInstance().addAdapter(bo);
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		ReferenceRegistry.getInstance().save();
	}

	protected ResizeShapeContext createContext(Shape child) {
		GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
		ResizeShapeContext context = new ResizeShapeContext(child);
		context.setSize(ga.getWidth(), ga.getHeight());
		context.setLocation(ga.getX(), ga.getY());
		return context;
	}
}
