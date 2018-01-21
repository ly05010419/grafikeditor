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

public class CreateVariableFeature extends AbstractCreateFeature {

	private ECincoError error = ECincoError.OK;

	public CreateVariableFeature(IFeatureProvider fp) {
		super(fp, "Variable", "Create Variable");
	}

	@Override
	public String getCreateImageId() {
		return "icons/Rectangle.png";
	}
	
	public boolean canCreate(ICreateContext context, boolean apiCall) {
		if (apiCall) {
			Object target = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(context.getTargetContainer());
			if (target instanceof graphmodel.ModelElementContainer)
				if (! ((graphmodel.ModelElementContainer) target).canContain(grafikeditor.meineditor.Variable.class)) {
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
		grafikeditor.meineditor.Variable variable = grafikeditor.meineditor.MeineditorFactory.eINSTANCE.createVariable();
		PictogramElement target = context.getTargetContainer();
		EObject bo = (EObject) getBusinessObjectForPictogramElement(target);
		grafikeditor.meineditor.MeinEditor meineditor = MeinEditorGraphitiUtils.addToResource(getDiagram(), this.getFeatureProvider());		

		if (bo instanceof Container) {
			Container nc = (Container) bo;
			nc.getModelElements().add(variable);
		} else {
			meineditor.getModelElements().add(variable);
		}

		//TODO: Add for loop over attributes and initialize them
		variable.setName("");

		addGraphicalRepresentation(context, variable);

		return new Object[] {variable}; 
	}

	public ECincoError getError() {
		return error;
	}

	public void setError(ECincoError error) {
		this.error = error;
	}

}
