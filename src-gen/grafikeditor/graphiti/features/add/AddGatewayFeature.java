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

public class AddGatewayFeature extends CincoAbstractAddFeature {
	
	private ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
	private ExpressionLanguageContext elContext = null;

	public AddGatewayFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	public boolean canAdd(IAddContext context) {
		Object bo = context.getNewObject();
		Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
		if (bo instanceof grafikeditor.meineditor.Gateway) {
			return true;
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {
		grafikeditor.meineditor.Gateway gateway = (grafikeditor.meineditor.Gateway) context.getNewObject();
		if (gateway.getId() == null || gateway.getId().isEmpty())
			gateway.setId(EcoreUtil.generateUUID());
		ContainerShape d = (ContainerShape) context.getTargetContainer();

		IPeService peService = Graphiti.getPeService();
		IGaService gaService = Graphiti.getGaService();
		
		ArrayList<Shape> linkingList = new ArrayList<Shape>();

		boolean parentIsDiagram = false;
		int width = 0,  height = 0, minX = 0, minY = 0, maxX = 0, maxY = 0;
		int[] points, xs, ys;
		String _pointsString = "";

		ClassLoader contextClassLoader;


		points = new int[] {0,0,10,10,20,0,10,-10,0,0,};
				
		xs = new int[] {0, 10, 20, 10, 0, };
		ys = new int[] {0, 10, 0, -10, 0, };
				
		minX = MeinEditorGraphitiUtils.getInstance().min(xs);
		maxX = MeinEditorGraphitiUtils.getInstance().max(xs);

		minY = MeinEditorGraphitiUtils.getInstance().min(ys);
		maxY = MeinEditorGraphitiUtils.getInstance().max(ys);

		width = maxX - minX;
		height = maxY - minY;

		MeinEditorGraphitiUtils.getInstance().transform(points, -minX, -minY);

		ContainerShape Shape0 = peService.createContainerShape(d, true);
		Polygon polygon0 = gaService.createPolygon(Shape0, points);

		/*ContainerShape Shape0 = peService.createContainerShape(d, true);
		Polygon polygon0 = gaService.createPolygon(Shape0, new int[] {0,0,10,10,20,0,10,-10,0,0,});
		int xMin = MeinEditorGraphitiUtils.getInstance().min(new int[] {0, 10, 20, 10, 0, });
		int yMin =MeinEditorGraphitiUtils.getInstance().min(new int[] {0, 10, 0, -10, 0, });
		int width = Math.abs(xMin) + MeinEditorGraphitiUtils.getInstance().max(new int[] {0, 10, 20, 10, 0, });
		int height= Math.abs(yMin) +MeinEditorGraphitiUtils.getInstance().max(new int[] {0, 10, 0, -10, 0, });

		for (Point _p : polygon0.getPoints()) {
			_p.setX(_p.getX() + Math.abs(xMin));
			_p.setY(_p.getY() + Math.abs(yMin));
		}
		*/
		gaService.setSize(polygon0, width, height);

		_pointsString = "";
		for (int i : points) {
			_pointsString += String.valueOf(i)+",";
		}

		peService.setPropertyValue(polygon0, MeinEditorLayoutUtils.KEY_INITIAL_POINTS, _pointsString);
		if (!(Shape0.getContainer() instanceof org.eclipse.graphiti.mm.pictograms.Diagram))
			peService.setPropertyValue(polygon0, MeinEditorLayoutUtils.KEY_INITIAL_PARENT_SIZE, "" + Shape0.getContainer().getGraphicsAlgorithm().getWidth() + "," + Shape0.getContainer().getGraphicsAlgorithm().getHeight()); 
		else peService.setPropertyValue(polygon0, MeinEditorLayoutUtils.KEY_INITIAL_PARENT_SIZE, "" + Shape0.getGraphicsAlgorithm().getWidth() + "," + Shape0.getGraphicsAlgorithm().getHeight()); 


		MeinEditorLayoutUtils.set_Appearance1Style(polygon0, getDiagram());
		if (context.getWidth() < 0 && context.getHeight() < 0) {
			gaService.setLocation(polygon0, context.getX() + 0, context.getY() + 0);
		} else {
			gaService.setLocation(polygon0, context.getX(), context.getY());
		}
		peService.setPropertyValue(polygon0, MeinEditorLayoutUtils.KEY_HORIZONTAL, MeinEditorLayoutUtils.KEY_HORIZONTAL_UNDEFINED);
		peService.setPropertyValue(polygon0, MeinEditorLayoutUtils.KEY_VERTICAL, MeinEditorLayoutUtils.KEY_VERTICAL_UNDEFINED);



		MeinEditorEContentAdapter.getInstance().addAdapter(gateway);

		linkAllShapes(Shape0, gateway);
		//link(Shape0, gateway);


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