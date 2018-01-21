package grafikeditor.graphiti.features.create.edges;

import graphmodel.ModelElementContainer;
import graphmodel.ModelElement;
import graphmodel.Node;

import grafikeditor.graphiti.*;
import grafikeditor.graphiti.content.adapter.*;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.impl.*;
import org.eclipse.graphiti.features.context.*;
import org.eclipse.graphiti.features.context.impl.*;
import org.eclipse.graphiti.mm.pictograms.*;

import de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError;

public class CreateLabeledTransitionFeature extends AbstractCreateConnectionFeature {
	
	private ECincoError error = ECincoError.OK;

	public CreateLabeledTransitionFeature(IFeatureProvider fp) {
		super(fp, "LabeledTransition", "Create a new edge: LabeledTransition");
	}


	public boolean canCreate(ICreateConnectionContext context, boolean apiCall) {
		if (apiCall) {
			Object source = getBusinessObject(context.getSourceAnchor());
			Object target = getBusinessObject(context.getTargetAnchor());
		
			boolean srcOK = false;
			boolean trgOK = false;
			if (source != null && target != null) {
				srcOK=((graphmodel.Node) source).canStart(grafikeditor.meineditor.LabeledTransition.class);
				trgOK=((graphmodel.Node) target).canEnd(grafikeditor.meineditor.LabeledTransition.class);
			}
			if (! (srcOK && trgOK) && getError().equals(ECincoError.OK))
				setError(ECincoError.MAX_IN);
			return (srcOK && trgOK);
		}
		return false;
	}


	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		return canCreate(context, true);
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Object source = getBusinessObject(context.getSourceAnchor());
		if (source instanceof graphmodel.Node) {	
			if (! ((graphmodel.Node) source).canStart(grafikeditor.meineditor.LabeledTransition.class)) {
				if (getError().equals(ECincoError.OK))
					setError(ECincoError.MAX_OUT);
			}
			else return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection connection = null;
		Object source = getBusinessObject(context.getSourceAnchor());
		Object target = getBusinessObject(context.getTargetAnchor());

		if (source != null && target != null) {
			grafikeditor.meineditor.LabeledTransition labeledTransition = grafikeditor.meineditor.MeineditorFactory.eINSTANCE.createLabeledTransition();
			labeledTransition.setLabel("");

				if (source instanceof ModelElement) {
					labeledTransition.setSourceElement( (Node) source);
				}
				if (target instanceof ModelElement) {
					labeledTransition.setTargetElement( (Node) target);
				}

			AddConnectionContext addContext = 
				new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(labeledTransition);
			connection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}
		return connection;
	}	

	private Object getBusinessObject(Anchor anchor) {
		if (anchor != null) {
			Object bo = getBusinessObjectForPictogramElement(anchor.getParent());
			return bo;
		}
		return null;
	}

	private boolean checkSource(Object source) {
		if (source instanceof grafikeditor.meineditor.Terminal) {
			if (true)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (source instanceof grafikeditor.meineditor.Start) {
			if (((grafikeditor.meineditor.Start) source).getOutgoing(grafikeditor.meineditor.LabeledTransition.class).size() < 1)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (source instanceof grafikeditor.meineditor.Gateway) {
			if (true)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (source instanceof grafikeditor.meineditor.Variable) {
			if (true)
				return true;
			else setError(ECincoError.MAX_OUT);
		} 
		if (getError().equals(ECincoError.OK))
			setError(ECincoError.INVALID_SOURCE);

		return false;
	}

	private boolean checkTarget(Object target){
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
		if (target instanceof grafikeditor.meineditor.Variable) {
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