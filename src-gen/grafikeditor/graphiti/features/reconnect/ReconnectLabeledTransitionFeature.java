package grafikeditor.graphiti.features.reconnect;

import graphmodel.*;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.impl.ReconnectionContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;


import de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError;

public class ReconnectLabeledTransitionFeature extends DefaultReconnectionFeature{

	private ECincoError error = ECincoError.OK;

	public ReconnectLabeledTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canReconnect(IReconnectionContext context, boolean apiCall) {
		if (apiCall) {
			Anchor newAnchor = context.getNewAnchor();
			Anchor oldAnchor = context.getOldAnchor();
				if (newAnchor != null && newAnchor.equals(oldAnchor))
					return true;
			if (newAnchor != null) {
				Object bo = getBusinessObjectForPictogramElement(context.getNewAnchor().getParent());
				if (ReconnectionContext.RECONNECT_TARGET.equals(context.getReconnectType())) {
					return ((graphmodel.Node) bo).canEnd(grafikeditor.meineditor.LabeledTransition.class);
				}
				
				if (ReconnectionContext.RECONNECT_SOURCE.equals(context.getReconnectType())) {
					return ((graphmodel.Node) bo).canStart(grafikeditor.meineditor.LabeledTransition.class);
				}
			}
			return false;
		}
		return false;
	}
	
	@Override
	public boolean canReconnect(IReconnectionContext context) {
		return canReconnect(context, true);
	}	

	@Override
	public void postReconnect(IReconnectionContext context) {
		if (context.getNewAnchor().equals(context.getOldAnchor()))
			return;		

		Object boNode = getBusinessObjectForPictogramElement(context.getNewAnchor().getParent());
		Object boEdge = getBusinessObjectForPictogramElement(context.getConnection());
		
		if (ReconnectionContext.RECONNECT_TARGET.equalsIgnoreCase(context.getReconnectType()) && 
				boEdge instanceof Edge) {
			
			Edge edge = (Edge) boEdge;
			edge.setTargetElement((Node) boNode);
		}

		if (ReconnectionContext.RECONNECT_SOURCE.equals(context.getReconnectType()) && 
			boEdge instanceof Edge) {
			Edge edge = (Edge) boEdge;
			edge.setSourceElement((Node) boNode);
		}

		UpdateContext uc = new UpdateContext(context.getConnection());
		IUpdateFeature uf = getFeatureProvider().getUpdateFeature(uc);
		if (uf != null && uf.canUpdate(uc))
			uf.update(uc);
	}

	private boolean checkSource(Object source) {
		if (source instanceof grafikeditor.meineditor.Start) {
			if (((grafikeditor.meineditor.Start) source).getOutgoing(grafikeditor.meineditor.LabeledTransition.class).size() < 1)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (source instanceof grafikeditor.meineditor.Variable) {
			if (true)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (source instanceof grafikeditor.meineditor.Terminal) {
			if (true)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (source instanceof grafikeditor.meineditor.Gateway) {
			if (true)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (getError().equals(ECincoError.OK))
			setError(ECincoError.INVALID_SOURCE);

		return false;
	}

	private boolean checkTarget(Object target){
		if (target instanceof grafikeditor.meineditor.Variable) {
			if (true)
				return true;
			else setError(ECincoError.MAX_IN);
		}
		if (target instanceof grafikeditor.meineditor.Terminal) {
			if (true)
				return true;
			else setError(ECincoError.MAX_IN);
		}
		if (target instanceof grafikeditor.meineditor.Gateway) {
			if (true)
				return true;
			else setError(ECincoError.MAX_IN);
		}
		if (target instanceof grafikeditor.meineditor.End) {
			if (true)
				return true;
			else setError(ECincoError.MAX_IN);
		}
		if (getError().equals(ECincoError.OK))
			setError(ECincoError.INVALID_TARGET);

		return false;
	}

	public ECincoError getError() {
		return error;
	}

	public void setError(ECincoError error) {
		this.error = error;
	}

	
}
