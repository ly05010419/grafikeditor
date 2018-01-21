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

public class CreateStartFeature extends AbstractCreateFeature {

	private ECincoError error = ECincoError.OK;

	public CreateStartFeature(IFeatureProvider fp) {
		super(fp, "Start", "Create Start");
	}

	@Override
	public String getCreateImageId() {
		return "icons/Start.png";
	}
	
	public boolean canCreate(ICreateContext context, boolean apiCall) {
		if (apiCall) {
			Object target = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(context.getTargetContainer());
			if (target instanceof graphmodel.ModelElementContainer)
				if (! ((graphmodel.ModelElementContainer) target).canContain(grafikeditor.meineditor.Start.class)) {
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
		grafikeditor.meineditor.Start start = grafikeditor.meineditor.MeineditorFactory.eINSTANCE.createStart();
		PictogramElement target = context.getTargetContainer();
		EObject bo = (EObject) getBusinessObjectForPictogramElement(target);
		grafikeditor.meineditor.MeinEditor meineditor = MeinEditorGraphitiUtils.addToResource(getDiagram(), this.getFeatureProvider());		

		if (bo instanceof Container) {
			Container nc = (Container) bo;
			nc.getModelElements().add(start);
		} else {
			meineditor.getModelElements().add(start);
		}

		//TODO: Add for loop over attributes and initialize them
		start.setName("");

		addGraphicalRepresentation(context, start);

		return new Object[] {start}; 
	}

	public ECincoError getError() {
		return error;
	}

	public void setError(ECincoError error) {
		this.error = error;
	}

}
