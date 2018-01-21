package grafikeditor.graphiti.features.delete;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;



public class DeleteTransitionFeature extends de.jabc.cinco.meta.core.ui.features.CincoDeleteFeature {

	public DeleteTransitionFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	public boolean canDelete(IDeleteContext context, boolean apiCall) {
		if (apiCall) {
			EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElement());
			if (bo instanceof grafikeditor.meineditor.Transition) {
				return true;
			}
			return super.canDelete(context);
		}
		return false;
	}

	@Override
	public boolean canDelete(IDeleteContext context) {
		return canDelete(context, true);
	}
	

	@Override
	public void delete(IDeleteContext context) {
		super.delete(context);
	}
	
	@Override
	protected boolean getUserDecision(IDeleteContext context) {
		return true;
	}
	
}
