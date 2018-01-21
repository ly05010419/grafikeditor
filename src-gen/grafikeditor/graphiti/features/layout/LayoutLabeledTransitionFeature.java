package grafikeditor.graphiti.features.layout;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;


public class LayoutLabeledTransitionFeature extends AbstractLayoutFeature {

	public LayoutLabeledTransitionFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof grafikeditor.meineditor.LabeledTransition)
			return true;
		return false;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof grafikeditor.meineditor.LabeledTransition) {
			if (pe instanceof Connection) {
				Connection conn = (Connection) pe;
				for (ConnectionDecorator cd : conn.getConnectionDecorators()) {
					if (cd.getGraphicsAlgorithm() instanceof Text) {
						Text t = (Text) cd.getGraphicsAlgorithm();
						IDimension dim = MeinEditorLayoutUtils.getTextDimension(t);
						Graphiti.getGaService().setSize(t, dim.getWidth(), dim.getHeight());
					}
				}
			}
		}
		return true;
	}

}