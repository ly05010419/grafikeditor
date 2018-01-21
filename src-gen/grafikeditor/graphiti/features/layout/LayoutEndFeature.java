package grafikeditor.graphiti.features.layout;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;



public class LayoutEndFeature extends AbstractLayoutFeature {

	public LayoutEndFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (bo instanceof grafikeditor.meineditor.End)
			return true;
		return false;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (pe instanceof ContainerShape) {
			layout((ContainerShape) pe);
			return true;
		}
		return false;
	}

	private boolean layout(ContainerShape cs) {
		for (Shape child : cs.getChildren()) {
			MeinEditorLayoutUtils.layout(cs.getGraphicsAlgorithm(), child.getGraphicsAlgorithm());
			if (child instanceof ContainerShape) {
				layout((ContainerShape) child);
			}
		}
		return true;
	}
	
}
