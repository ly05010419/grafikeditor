package grafikeditor.graphiti.features.add;

import de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractAddFeature;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.*;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.impl.*;
import org.eclipse.graphiti.mm.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.*;
import org.eclipse.graphiti.util.*;

import com.sun.el.ExpressionFactoryImpl;

import grafikeditor.graphiti.content.adapter.MeinEditorEContentAdapter;
import grafikeditor.graphiti.*;
import grafikeditor.graphiti.expression.*;
import grafikeditor.graphiti.features.layout.*;
import org.eclipse.emf.ecore.util.EcoreUtil;

import graphmodel.ModelElementContainer;

public class AddTransitionFeature extends CincoAbstractAddFeature {


	private ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
	private ExpressionLanguageContext elContext = null;

  	public AddTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		grafikeditor.meineditor.Transition transition = (grafikeditor.meineditor.Transition) context.getNewObject();
		if (transition.getId() == null || transition.getId().isEmpty())
			transition.setId(EcoreUtil.generateUUID());
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
       
		Connection connection = peCreateService
		.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());
		
		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		MeinEditorLayoutUtils.setdefaultStyle(polyline, getDiagram());
		
		Object sourceBo = addConContext.getSourceAnchor().getParent().getLink().getBusinessObjects().get(0);
		Object targetBo = addConContext.getTargetAnchor().getParent().getLink().getBusinessObjects().get(0);
		
		ClassLoader contextClassLoader;

		if (sourceBo != null && sourceBo.equals(targetBo)) {
			int x = addConContext.getSourceAnchor().getParent().getGraphicsAlgorithm().getX();
			int y = addConContext.getSourceAnchor().getParent().getGraphicsAlgorithm().getY();
			Point p1 = gaService.createPoint(x - 30, y + 40);
			Point p2 = gaService.createPoint(x - 30, y - 20);
			((FreeFormConnection) connection).getBendpoints().add(p1);
			((FreeFormConnection) connection).getBendpoints().add(p2);
		}
		
		// create link and wire it
		link(connection, transition);

		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		MeinEditorLayoutUtils.createARROW(cd);
		MeinEditorLayoutUtils.setdefaultStyle(cd.getGraphicsAlgorithm(), getDiagram());
		/*link(cd, transition);*/


		grafikeditor.meineditor.MeinEditor meineditor = MeinEditorGraphitiUtils.addToResource(getDiagram(), this.getFeatureProvider());
		ModelElementContainer container = MeinEditorGraphitiUtils.getInstance().getCommonContainer(meineditor, transition);
		container.getModelElements().add(transition);

		if (hook) {
		}
		MeinEditorEContentAdapter.getInstance().addAdapter(transition);

		UpdateContext uc = new UpdateContext(connection);
		IUpdateFeature uf = getFeatureProvider().getUpdateFeature(uc);
		if (uf.canUpdate(uc))
			uf.update(uc);

		return connection;
	}

	public boolean canAdd(IAddContext context) {
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof grafikeditor.meineditor.Transition) {
			return true;
		}
		return false;
	}

}