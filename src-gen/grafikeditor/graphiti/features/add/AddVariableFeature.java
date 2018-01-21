package grafikeditor.graphiti.features.add;

import java.util.ArrayList;

import de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractAddFeature;

import grafikeditor.graphiti.*;
import grafikeditor.graphiti.content.adapter.MeinEditorEContentAdapter;
import grafikeditor.graphiti.expression.*;
import grafikeditor.graphiti.features.layout.*;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.features.impl.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.*;
import org.eclipse.graphiti.util.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import com.sun.el.ExpressionFactoryImpl;

public class AddVariableFeature extends CincoAbstractAddFeature {
	
	private ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
	private ExpressionLanguageContext elContext = null;

	public AddVariableFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	public boolean canAdd(IAddContext context) {
		Object bo = context.getNewObject();
		Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
		if (bo instanceof grafikeditor.meineditor.Variable) {
			return true;
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {
		grafikeditor.meineditor.Variable variable = (grafikeditor.meineditor.Variable) context.getNewObject();
		if (variable.getId() == null || variable.getId().isEmpty())
			variable.setId(EcoreUtil.generateUUID());
		ContainerShape d = (ContainerShape) context.getTargetContainer();

		IPeService peService = Graphiti.getPeService();
		IGaService gaService = Graphiti.getGaService();
		
		ArrayList<Shape> linkingList = new ArrayList<Shape>();

		boolean parentIsDiagram = false;
		int width = 0,  height = 0, minX = 0, minY = 0, maxX = 0, maxY = 0;
		int[] points, xs, ys;
		String _pointsString = "";

		ClassLoader contextClassLoader;

		ContainerShape Shape0 = peService.createContainerShape(d, true);
		Rectangle rectangle0 = gaService.createPlainRectangle(Shape0);

		gaService.setSize(rectangle0, 96, 32);

		MeinEditorLayoutUtils.set_Appearance26Style(rectangle0, getDiagram());
		if (context.getWidth() < 0 && context.getHeight() < 0) {
			gaService.setLocation(rectangle0, context.getX() + 0, context.getY() + 0);
		} else {
			gaService.setLocation(rectangle0, context.getX(), context.getY());
		}
		peService.setPropertyValue(rectangle0, MeinEditorLayoutUtils.KEY_HORIZONTAL, MeinEditorLayoutUtils.KEY_HORIZONTAL_UNDEFINED);
		peService.setPropertyValue(rectangle0, MeinEditorLayoutUtils.KEY_VERTICAL, MeinEditorLayoutUtils.KEY_VERTICAL_UNDEFINED);

		Shape Shape1 = peService.createShape(Shape0, false);
		Text text0 = gaService.createPlainText(Shape1);
		linkingList.add(Shape1);
		contextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			text0.setFilled(false);
			Thread.currentThread().setContextClassLoader(AddVariableFeature.class.getClassLoader());
			elContext = new ExpressionLanguageContext(variable);
			Object tmp0Value = factory.createValueExpression(elContext, "${name}", Object.class).getValue(elContext);

			peService.setPropertyValue(text0, MeinEditorGraphitiUtils.KEY_FORMAT_STRING, "%s");
			peService.setPropertyValue(text0, "Params", "${name} ");
			text0.setValue(String.format("%s" , tmp0Value));
		} catch (java.util.IllegalFormatException ife) {
			text0.setValue("STRING FORMAT ERROR");
		} finally {
			Thread.currentThread().setContextClassLoader(contextClassLoader);
		}
		gaService.setSize(text0, 50, 50);

		MeinEditorLayoutUtils.set_MeinEditorDefaultAppearanceStyle(text0, getDiagram());
		gaService.setLocation(text0, 23, -9);
		peService.setPropertyValue(text0, MeinEditorLayoutUtils.KEY_HORIZONTAL, MeinEditorLayoutUtils.KEY_HORIZONTAL_CENTER);
		peService.setPropertyValue(text0, MeinEditorLayoutUtils.KEY_VERTICAL, MeinEditorLayoutUtils.KEY_VERTICAL_MIDDLE);

		peService.setPropertyValue(text0, MeinEditorLayoutUtils.KEY_MARGIN_HORIZONTAL, "0");
		peService.setPropertyValue(text0, MeinEditorLayoutUtils.KEY_MARGIN_VERTICAL, "0");


		MeinEditorEContentAdapter.getInstance().addAdapter(variable);

		linkAllShapes(Shape0, variable);
		//link(Shape0, variable);


		if (context.getWidth() != -1 && context.getHeight() != -1)  {
			ResizeShapeContext rc = new ResizeShapeContext(Shape0);
			rc.setWidth(context.getWidth());
			rc.setHeight(context.getHeight());
			rc.setX(context.getX());
			rc.setY(context.getY());
			de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractResizeFeature rf = 
				(de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractResizeFeature) getFeatureProvider().getResizeShapeFeature(rc);
			rf.activateApiCall(!hook);
			if (rf != null && rf.canResizeShape(rc))
			rf.resizeShape(rc);
		} else if (parentIsDiagram)  {
			ResizeShapeContext rc = new ResizeShapeContext(Shape0);
			rc.setWidth(width);
			rc.setHeight(height);
			rc.setX(context.getX() + minX);
			rc.setY(context.getY() + minY);
			de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractResizeFeature rf = 
				(de.jabc.cinco.meta.core.ge.style.model.features.CincoAbstractResizeFeature) getFeatureProvider().getResizeShapeFeature(rc);
			rf.activateApiCall(!hook);
			if (rf != null && rf.canResizeShape(rc))
				rf.resizeShape(rc);
		}

		/*if (context.getWidth() != -1 && context.getHeight() != -1)  {
			ResizeShapeContext rc = new ResizeShapeContext(Shape0);
			rc.setWidth(context.getWidth());
			rc.setHeight(context.getHeight());
			rc.setX(context.getX());
			rc.setY(context.getY());
			CincoAbstractResizeFeature rf = 
				(CincoAbstractResizeFeature) getFeatureProvider().getResizeShapeFeature(rc);
			rf.activateApiCall(!hook);
			if (rf != null && rf.canResizeShape(rc))
				rf.resizeShape(rc);
		}*/

		peService.createChopboxAnchor(Shape0);
		layoutPictogramElement(Shape0);
		
		if (hook) {
		}

		return Shape0;
	}

	private void linkAllShapes(Shape s, EObject eObject) {
		link(s, eObject);
		if (s instanceof ContainerShape)
			((ContainerShape) s).getChildren().forEach(c -> linkAllShapes(c, eObject));
	}
}