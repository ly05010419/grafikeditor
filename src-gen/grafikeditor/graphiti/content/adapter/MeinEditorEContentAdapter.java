package grafikeditor.graphiti.content.adapter;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;


import grafikeditor.graphiti.*;

public class MeinEditorEContentAdapter extends EContentAdapter {

	private MeinEditorDiagramTypeProvider dtp;
	private static MeinEditorEContentAdapter instance;
	private static List<GFPropertySection> sections = new ArrayList<>();
	
	protected MeinEditorEContentAdapter() {
		dtp = (MeinEditorDiagramTypeProvider) MeinEditorGraphitiUtils.getInstance().getDTP();
	}

	public static MeinEditorEContentAdapter getInstance() {
		if (instance == null)
			instance = new MeinEditorEContentAdapter();
		return instance;
	}

	protected Diagram getDiagram(){
		if (MeinEditorGraphitiUtils.getInstance().getDTP() == null)
			return null;
		return MeinEditorGraphitiUtils.getInstance().getDTP().getDiagram();
	}
	
	protected IFeatureProvider getFeatureProvider() {
		return MeinEditorGraphitiUtils.getInstance().getDTP().getFeatureProvider();
	}
	

	@Override
	public void notifyChanged(Notification notification) {
		Object o = notification.getNotifier();
		if (o instanceof grafikeditor.meineditor.MeinEditor) {
			grafikeditor.meineditor.MeinEditor tmp = (grafikeditor.meineditor.MeinEditor) o;
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

			try {
				org.eclipse.graphiti.features.context.impl.CustomContext cc = new org.eclipse.graphiti.features.context.impl.CustomContext();
				cc.setPictogramElements(new PictogramElement[] {pe});
			} catch (Exception e) {
				e.printStackTrace();
			}
			refreshPropertyView();
		}
		
		
	}

	public void addAdapter(EObject bo) {
		if (bo instanceof grafikeditor.meineditor.MeinEditor) {
			if (!((grafikeditor.meineditor.MeinEditor) bo).eAdapters().contains(getInstance()))
				((grafikeditor.meineditor.MeinEditor) bo).eAdapters().add(getInstance());
		}
		if (bo instanceof grafikeditor.meineditor.Start) {
			if (!((grafikeditor.meineditor.Start) bo).eAdapters().contains(StartEContentAdapter.getInstance()))
				((grafikeditor.meineditor.Start) bo).eAdapters().add(StartEContentAdapter.getInstance());
		}

		if (bo instanceof grafikeditor.meineditor.End) {
			if (!((grafikeditor.meineditor.End) bo).eAdapters().contains(EndEContentAdapter.getInstance()))
				((grafikeditor.meineditor.End) bo).eAdapters().add(EndEContentAdapter.getInstance());
		}

		if (bo instanceof grafikeditor.meineditor.Terminal) {
			if (!((grafikeditor.meineditor.Terminal) bo).eAdapters().contains(TerminalEContentAdapter.getInstance()))
				((grafikeditor.meineditor.Terminal) bo).eAdapters().add(TerminalEContentAdapter.getInstance());
		}

		if (bo instanceof grafikeditor.meineditor.Variable) {
			if (!((grafikeditor.meineditor.Variable) bo).eAdapters().contains(VariableEContentAdapter.getInstance()))
				((grafikeditor.meineditor.Variable) bo).eAdapters().add(VariableEContentAdapter.getInstance());
		}

		if (bo instanceof grafikeditor.meineditor.Gateway) {
			if (!((grafikeditor.meineditor.Gateway) bo).eAdapters().contains(GatewayEContentAdapter.getInstance()))
				((grafikeditor.meineditor.Gateway) bo).eAdapters().add(GatewayEContentAdapter.getInstance());
		}

		if (bo instanceof grafikeditor.meineditor.Transition) {
			if (!((grafikeditor.meineditor.Transition) bo).eAdapters().contains(TransitionEContentAdapter.getInstance()))
				((grafikeditor.meineditor.Transition) bo).eAdapters().add(TransitionEContentAdapter.getInstance());
		}

		if (bo instanceof grafikeditor.meineditor.LabeledTransition) {
			if (!((grafikeditor.meineditor.LabeledTransition) bo).eAdapters().contains(LabeledTransitionEContentAdapter.getInstance()))
				((grafikeditor.meineditor.LabeledTransition) bo).eAdapters().add(LabeledTransitionEContentAdapter.getInstance());
		}


	}
	
	protected void refreshPropertyView() {
		for (GFPropertySection gfPS : sections) {
			if (gfPS != null)
				gfPS.refresh();
		}
	}

	public static List<GFPropertySection> getSections() {
		return sections;
	}
	
	public void addSection(GFPropertySection gfPS) {
		if (!sections.contains(gfPS))
			sections.add(gfPS);
	}

	public void remove(GFPropertySection gfPS) {
		sections.remove(gfPS);
	}
	
}
