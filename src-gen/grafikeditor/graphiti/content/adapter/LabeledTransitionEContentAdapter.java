package grafikeditor.graphiti.content.adapter;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;




public class LabeledTransitionEContentAdapter extends MeinEditorEContentAdapter{

	private static LabeledTransitionEContentAdapter instance;

	public static LabeledTransitionEContentAdapter getInstance() {
		if (instance == null) {
			instance = new LabeledTransitionEContentAdapter();
		}
		return instance;
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object o = notification.getNotifier();
		String featureName = ((EStructuralFeature) notification.getFeature()).getName();
		if (invalidFeature(featureName))
			return;
		if (o instanceof grafikeditor.meineditor.LabeledTransition) {
			grafikeditor.meineditor.LabeledTransition tmp = (grafikeditor.meineditor.LabeledTransition) o;
			if (getDiagram() == null)
				return;
			List<PictogramElement> pes = Graphiti.getLinkService().getPictogramElements(getDiagram(), tmp);
			if (pes == null || pes.isEmpty())
				return;
			
			PictogramElement pe = pes.get(0);
			
			UpdateContext uContext = new UpdateContext(pes.get(0));
			IFeatureProvider fp = getFeatureProvider();
			if (fp == null) 
				return;
			IUpdateFeature uf = fp.getUpdateFeature(uContext);
			if (uf != null && uf.canUpdate(uContext)) {
				uf.update(uContext);
			}
			
		}
		
		refreshPropertyView();
	}
	

	private boolean invalidFeature(String featureName) {
		switch (featureName) {
		case "incoming":
		case "outgoing":
		case "sourceElement":
		case "targetElement":
		case "modelElements":
			return true;

		default:
			break;
		}
		return false;
	}

}