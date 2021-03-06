package grafikeditor.graphiti.features.move;

import java.util.HashSet;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import graphmodel.Container;
import graphmodel.ModelElementContainer;
import graphmodel.Edge;

import de.jabc.cinco.meta.core.ge.style.model.features.CincoMoveShapeFeature;

import grafikeditor.graphiti.*;


import de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError;

public class MoveTerminalFeature extends CincoMoveShapeFeature{

	private ECincoError error = ECincoError.OK;

	public MoveTerminalFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	
	public boolean canMoveShape(IMoveShapeContext context, boolean apiCall) {
		if (apiCall) {
			Object o = getBusinessObjectForPictogramElement(context.getShape());
			Object source = getBusinessObjectForPictogramElement(context.getSourceContainer());
			Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
			if (false)
				return false;
			if (source != null && source.equals(target))
				return true;
			if (target instanceof graphmodel.ModelElementContainer)
				return ((graphmodel.ModelElementContainer) target).canContain(grafikeditor.meineditor.Terminal.class);
			if (getError().equals(ECincoError.OK))
				setError(ECincoError.INVALID_CONTAINER);
			return false;
		}
		return false;
	}


	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		return canMoveShape(context, true);
	}
	
	@Override
	public void moveShape(IMoveShapeContext context) {
		Object o = getBusinessObjectForPictogramElement(context.getShape());
		Object source = getBusinessObjectForPictogramElement(context.getSourceContainer());
		Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
		if (source instanceof Container) {
			Container nc = (Container) source;
			nc.getModelElements().remove((grafikeditor.meineditor.Terminal) o);
		}
		if (source instanceof grafikeditor.meineditor.MeinEditor) {
			grafikeditor.meineditor.MeinEditor tmp = (grafikeditor.meineditor.MeinEditor) source;
			tmp.getModelElements().remove((grafikeditor.meineditor.Terminal) o);
		}
		if (target instanceof grafikeditor.meineditor.MeinEditor) {
			grafikeditor.meineditor.MeinEditor tmp = (grafikeditor.meineditor.MeinEditor) target;
			tmp.getModelElements().add((grafikeditor.meineditor.Terminal) o);
		}
		if (target instanceof Container) {
			Container tmp = (Container) target;
			tmp.getModelElements().add((grafikeditor.meineditor.Terminal) o);
		}
			
		HashSet<Edge> all = new HashSet<>();
		grafikeditor.meineditor.Terminal tmp = (grafikeditor.meineditor.Terminal) o;
		all.addAll(tmp.getIncoming());
		all.addAll(tmp.getOutgoing());
		for (Edge e : all) {
			ModelElementContainer ce = e.getContainer();
			ModelElementContainer common = MeinEditorGraphitiUtils.getInstance().getCommonContainer(ce, e);
			ce.getModelElements().remove(e);
			common.getModelElements().add(e);
		}

		super.moveShape(context);
	}

	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		try {
			grafikeditor.meineditor.Terminal _s = (grafikeditor.meineditor.Terminal) getBusinessObjectForPictogramElement(context.getPictogramElement());
			grafikeditor.meineditor.MeinEditor _root = _s.getRootElement();
			grafikeditor.api.cmeineditor.CMeinEditor _wrapped = MeinEditorWrapper.wrapGraphModel(_root, getDiagram());
			
			int x = context.getX();
			int y = context.getY();
			int deltaX = context.getDeltaX();
			int deltaY = context.getDeltaY();
			
			ModelElementContainer source = (ModelElementContainer) getBusinessObjectForPictogramElement(context.getSourceContainer());
			ModelElementContainer target = (ModelElementContainer) getBusinessObjectForPictogramElement(context.getTargetContainer());
		
			grafikeditor.api.cmeineditor.CTerminal cModelElement= _wrapped.findCTerminal(_s);
			graphicalgraphmodel.CModelElementContainer cSource = _wrapped.findCModelElementContainer(source);
			graphicalgraphmodel.CModelElementContainer cTarget= _wrapped.findCModelElementContainer(target);
			
		} catch (Exception e) {
			
		}
		super.postMoveShape(context);
	}

	public ECincoError getError() {
		return error;
	}

	public void setError(ECincoError error) {
		this.error = error;
	}


}
