package grafikeditor.graphiti;

import graphmodel.Node;
import graphmodel.Edge;
import graphmodel.Container;

import org.eclipse.emf.ecore.*;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.*;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.*;


import grafikeditor.graphiti.features.*;
import grafikeditor.graphiti.features.create.nodes.*;
import grafikeditor.graphiti.features.create.edges.*;
import grafikeditor.graphiti.features.reconnect.*;
import grafikeditor.graphiti.features.add.*;
import grafikeditor.graphiti.features.delete.*;
import grafikeditor.graphiti.features.update.*;
import grafikeditor.graphiti.features.move.*;
import grafikeditor.graphiti.features.resize.*;
import grafikeditor.graphiti.features.layout.*;

import de.jabc.cinco.meta.core.ge.style.model.featureprovider.CincoFeatureProvider;
import de.jabc.cinco.meta.core.ge.style.model.addfeature.LibraryComponentAddFeature;

public class MeinEditorFeatureProvider extends DefaultFeatureProvider implements CincoFeatureProvider {
	
	public MeinEditorFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
	public IAddFeature[] getAllLibComponentAddFeatures() {
		return new IAddFeature[] {
		};
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		Object o =  context.getNewObject();
		if (o instanceof IFile) {
			o = getGraphModel((IFile) o);
			if (context instanceof AddContext)
				((AddContext) context).setNewObject(o);
		}
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			boolean sameResource = bo.eResource() != null ? bo.eResource().equals(getDiagramTypeProvider().getDiagram().eResource()) : true ;
			if (sameResource && bo instanceof grafikeditor.meineditor.Start)
				return new AddStartFeature(this);
			if (sameResource && bo instanceof grafikeditor.meineditor.End)
				return new AddEndFeature(this);
			if (sameResource && bo instanceof grafikeditor.meineditor.Terminal)
				return new AddTerminalFeature(this);
			if (sameResource && bo instanceof grafikeditor.meineditor.Variable)
				return new AddVariableFeature(this);
			if (sameResource && bo instanceof grafikeditor.meineditor.Gateway)
				return new AddGatewayFeature(this);

			if (bo.eClass().getName().equals("LabeledTransition"))
				return new AddLabeledTransitionFeature(this);

	
		}

		return super.getAddFeature(context);
	}

	private Object getGraphModel(IFile file) {
		URI fileUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		Resource res = new ResourceSetImpl().getResource(fileUri, true);
		if (res != null) {
			for (EObject o : res.getContents()) {
				if (o instanceof graphmodel.GraphModel) {
					return o;
				}
			}
		}
		return null;
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {
			new CreateStartFeature(this),
			new CreateEndFeature(this),
			new CreateTerminalFeature(this),
			new CreateVariableFeature(this),
			new CreateGatewayFeature(this),

		};
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {
			new CreateLabeledTransitionFeature(this),

		};
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		if (bo instanceof grafikeditor.meineditor.Start)
			return new DeleteStartFeature(this);
		if (bo instanceof grafikeditor.meineditor.End)
			return new DeleteEndFeature(this);
		if (bo instanceof grafikeditor.meineditor.Terminal)
			return new DeleteTerminalFeature(this);
		if (bo instanceof grafikeditor.meineditor.Variable)
			return new DeleteVariableFeature(this);
		if (bo instanceof grafikeditor.meineditor.Gateway)
			return new DeleteGatewayFeature(this);

		if (bo instanceof grafikeditor.meineditor.LabeledTransition)
			return new DeleteLabeledTransitionFeature(this);

		
		return super.getDeleteFeature(context);
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object o = getBusinessObjectForPictogramElement(pe);
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			if (bo.eClass().getName().equals("Start"))
				return new UpdateStartFeature(this);
			if (bo.eClass().getName().equals("End"))
				return new UpdateEndFeature(this);
			if (bo.eClass().getName().equals("Terminal"))
				return new UpdateTerminalFeature(this);
			if (bo.eClass().getName().equals("Variable"))
				return new UpdateVariableFeature(this);
			if (bo.eClass().getName().equals("Gateway"))
				return new UpdateGatewayFeature(this);

			if (bo.eClass().getName().equals("LabeledTransition"))
				return new UpdateLabeledTransitionFeature(this);

		}
		return super.getUpdateFeature(context);
	}

	@Override
	public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
		Object o = getBusinessObjectForPictogramElement(context.getConnection());
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			if (bo.eClass().getName().equals("LabeledTransition"))
				return new ReconnectLabeledTransitionFeature(this);

		}
		return super.getReconnectionFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Object o = getBusinessObjectForPictogramElement(context.getShape());
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			if (bo.eClass().getName().equals("Start"))
				return new MoveStartFeature(this);
			if (bo.eClass().getName().equals("End"))
				return new MoveEndFeature(this);
			if (bo.eClass().getName().equals("Terminal"))
				return new MoveTerminalFeature(this);
			if (bo.eClass().getName().equals("Variable"))
				return new MoveVariableFeature(this);
			if (bo.eClass().getName().equals("Gateway"))
				return new MoveGatewayFeature(this);

		}
		return super.getMoveShapeFeature(context);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		Object o = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			if (bo.eClass().getName().equals("Start"))
				return new LayoutStartFeature(this);
			if (bo.eClass().getName().equals("End"))
				return new LayoutEndFeature(this);
			if (bo.eClass().getName().equals("Terminal"))
				return new LayoutTerminalFeature(this);
			if (bo.eClass().getName().equals("Variable"))
				return new LayoutVariableFeature(this);
			if (bo.eClass().getName().equals("Gateway"))
				return new LayoutGatewayFeature(this);

			if (bo.eClass().getName().equals("LabeledTransition"))
				return new LayoutLabeledTransitionFeature(this);

		}
		return super.getLayoutFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Object o = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			if (bo.eClass().getName().equals("Start"))
				return new ResizeStartFeature(this);
			if (bo.eClass().getName().equals("End"))
				return new ResizeEndFeature(this);
			if (bo.eClass().getName().equals("Terminal"))
				return new ResizeTerminalFeature(this);
			if (bo.eClass().getName().equals("Variable"))
				return new ResizeVariableFeature(this);
			if (bo.eClass().getName().equals("Gateway"))
				return new ResizeGatewayFeature(this);

			if (bo.eClass().getName().equals("MeinEditor"))
				return new ResizeMeinEditorFeature(this);
		}
		return super.getResizeShapeFeature(context);
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return new MeinEditorCopyFeature(this);
	}
	
	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new MeinEditorPasteFeature(this);
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		PictogramElement pe = context.getPictogramElements()[0];
		Object o = getBusinessObjectForPictogramElement(pe);
		if (o instanceof EObject) {
			EObject bo = (EObject) o;
			if (bo.eClass().getName().equals("Start")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("End")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("Terminal")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("Variable")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("Gateway")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("Transition")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("LabeledTransition")) {
				return new ICustomFeature[] {};
			}if (bo.eClass().getName().equals("MeinEditor")) {
				return new ICustomFeature[] {new pruefung.Korrektheischeck(this), };
			}
		}
		return new ICustomFeature[] {};
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		return null;
	}
}