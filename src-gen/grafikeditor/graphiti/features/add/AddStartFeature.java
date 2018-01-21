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

public class AddStartFeature extends CincoAbstractAddFeature {
	
	private ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
	private ExpressionLanguageContext elContext = null;

	public AddStartFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	public boolean canAdd(IAddContext context) {
		Object bo = context.getNewObject();
		Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
		if (bo instanceof grafikeditor.meineditor.Start) {
			return true;
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {
		grafikeditor.meineditor.Start start = (grafikeditor.meineditor.Start) context.getNewObject();
		if (start.getId() == null || start.getId().isEmpty())
			start.setId(EcoreUtil.generateUUID());
		ContainerShape d = (ContainerShape) context.getTargetContainer();

		IPeService peService = Graphiti.getPeService();
		IGaService gaService = Graphiti.getGaService();
		
		ArrayList<Shape> linkingList = new ArrayList<Shape>();

		boolean parentIsDiagram = false;
		int width = 0,  height = 0, minX = 0, minY = 0, maxX = 0, maxY = 0;
		int[] points, xs, ys;
		String _pointsString = "";

		ClassLoader contextClassLoader;

		//MeinEditorGraphitiUtils.getInstance().addImage("icons/Start.png", "icons/Start.png");
		ContainerShape Shape0 = peService.createContainerShape(d, true);
		Image image0 = gaService.createImage(Shape0, "icons/Start.png");

		image0.setStretchH(true);
		image0.setStretchV(true);

		/*if (context.getWidth() != -1 && context.getHeight() != -1)  {
			gaService.setSize(image0, context.getWidth(), context.getHeight());
		} else*/ gaService.setSize(image0, 36, 36);

		MeinEditorLayoutUtils.set_MeinEditorDefaultAppearanceStyle(image0, getDiagram());
		if (context.getWidth() < 0 && context.getHeight() < 0) {
			gaService.setLocation(image0, context.getX() + 0, context.getY() + 0);
		} else {
			gaService.setLocation(image0, context.getX(), context.getY());
		}
		peService.setPropertyValue(image0, MeinEditorLayoutUtils.KEY_HORIZONTAL, MeinEditorLayoutUtils.KEY_HORIZONTAL_UNDEFINED);
		peService.setPropertyValue(image0, MeinEditorLayoutUtils.KEY_VERTICAL, MeinEditorLayoutUtils.KEY_VERTICAL_UNDEFINED);



		MeinEditorEContentAdapter.getInstance().addAdapter(start);

		linkAllShapes(Shape0, start);
		//link(Shape0, start);


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