package grafikeditor.graphiti.features.create.nodes;

import grafikeditor.graphiti.*;

import graphmodel.Container;

import org.eclipse.emf.ecore.*;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.*;
import org.eclipse.graphiti.features.impl.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.*;

import de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError;

public class CreateEndFeature extends AbstractCreateFeature {

	private ECincoError error = ECincoError.OK;

	public CreateEndFeature(IFeatureProvider fp) {
		super(fp, "End", "Create End");
	}

	@Override
	public String getCreateImageId() {
		return "icons/Stop.png";
	}
	
	public boolean canCreate(ICreateContext context, boolean apiCall) {
		if (apiCall) {
			Object target = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(context.getTargetContainer());
			if (target instanceof graphmodel.ModelElementContainer)
				if (! ((graphmodel.ModelElementContainer) target).canContain(grafikeditor.meineditor.End.class)) {
					if (getError().equals(ECincoError.OK))
						setError(ECincoError.MAX_CARDINALITY);
				} else return true;
			return false;
		}
		return false;
	}


	@Override
	public boolean canCreate(ICreateContext context) {
		return canCreate(context, true);
	}

	public Object[] create(ICreateContext context) {
		grafikeditor.meineditor.End end = grafikeditor.meineditor.MeineditorFactory.eINSTANCE.createEnd();
		PictogramElement target = context.getTargetContainer();
		EObject bo = (EObject) getBusinessObjectForPictogramElement(target);
		grafikeditor.meineditor.MeinEditor meineditor = MeinEditorGraphitiUtils.addToResource(getDiagram(), this.getFeatureProvider());		

		if (bo instanceof Container) {
			Container nc = (Container) bo;
			nc.getModelElements().add(end);
		} else {
			meineditor.getModelElements().add(end);
		}

		//TODO: Add for loop over attributes and initialize them
		addGraphicalRepresentation(context, end);

		return new Object[] {end}; 
	}

	public ECincoError getError() {
		return error;
	}

	public void setError(ECincoError error) {
		this.error = error;
	}

}
