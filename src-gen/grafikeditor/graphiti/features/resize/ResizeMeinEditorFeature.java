package grafikeditor.graphiti.features.resize;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import grafikeditor.meineditor.MeinEditor;

public class ResizeMeinEditorFeature extends DefaultResizeShapeFeature {

	public ResizeMeinEditorFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
			Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
			return (bo instanceof grafikeditor.meineditor.MeinEditor);
	}
	
	@Override
	public void resizeShape(IResizeShapeContext context) {
		Shape s = context.getShape();
		if (s instanceof Diagram) {
			Diagram d = (Diagram) s;
			for (Shape child : d.getChildren()) {
				ResizeShapeContext resizeShapeContext = new ResizeShapeContext(child);
				IResizeShapeFeature rsf = getFeatureProvider().getResizeShapeFeature(resizeShapeContext);
				if (rsf != null && rsf.canResizeShape(resizeShapeContext)) {
					rsf.resizeShape(resizeShapeContext);
				}
			}
		}
	}
	
}
