package grafikeditor.graphiti.features.update;

import org.eclipse.emf.ecore.*;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.*;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.features.impl.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.*;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;


import grafikeditor.graphiti.*;

import grafikeditor.graphiti.expression.*;

import de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry;

import com.sun.el.ExpressionFactoryImpl;

public class UpdateStartFeature extends AbstractUpdateFeature {

	private static ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
	private static ExpressionLanguageContext elContext;

	public UpdateStartFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		return (bo instanceof grafikeditor.meineditor.Start);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		grafikeditor.meineditor.Start bo =(grafikeditor.meineditor.Start) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		if (checkUpdateNeeded(bo, pe)) {
			/*TransactionalEditingDomain dom = getDiagramBehavior().getEditingDomain();
			dom.getCommandStack().execute(new RecordingCommand(dom) {
				@Override
				protected void doExecute() {
					update(context);
				}
			});*/
			return Reason.createTrueReason();
		}
		return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		grafikeditor.meineditor.Start bo = (grafikeditor.meineditor.Start) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		updateText(bo, pe);
		LayoutContext lContext = new LayoutContext(context.getPictogramElement());
		ILayoutFeature lf = getFeatureProvider().getLayoutFeature(lContext);
		if (lf.canLayout(lContext)) {
			return lf.layout(lContext);
		}		

		return false;
	}
	
	private void updateText(grafikeditor.meineditor.Start start, PictogramElement pe) {
		if (pe instanceof ContainerShape) {
			PictogramElement tmp = pe;
			Object o = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(tmp);
			if (start.equals(o) || o == null)
			for (Shape _s : ((ContainerShape) pe).getChildren()) {
				updateText(start, _s);
			}
		} 
		if (pe instanceof Connection) {
			Connection connection = (Connection) pe;
			for (ConnectionDecorator cd : connection.getConnectionDecorators()) {
				updateText(start, cd);
			}
		} else {
			if (pe.getGraphicsAlgorithm() instanceof AbstractText) {
				ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
				AbstractText t = (AbstractText) pe.getGraphicsAlgorithm();
				try {
					Thread.currentThread().setContextClassLoader(UpdateStartFeature.class.getClassLoader());
					String formatString = Graphiti.getPeService().getPropertyValue(t, MeinEditorGraphitiUtils.KEY_FORMAT_STRING);
					t.setValue(String.format(formatString ));
				} catch (java.util.IllegalFormatException ife) {
					t.setValue("STRING FORMAT ERROR");
				} finally {
					Thread.currentThread().setContextClassLoader(contextClassLoader);
				}
			}
		}
	}

	public static boolean checkUpdateNeeded(grafikeditor.meineditor.Start start, PictogramElement pe) {
		boolean updateNeeded;
		if (pe instanceof ContainerShape) {
			for (Shape _s : ((ContainerShape) pe).getChildren()) {
				return checkUpdateNeeded(start, _s);
			}
		} 
		if (pe instanceof Connection) {
			Connection connection = (Connection) pe;
			for (ConnectionDecorator cd : connection.getConnectionDecorators()) {
				updateNeeded = checkUpdateNeeded(start, cd);
				if (updateNeeded)
					return true;
			}
		} else {
			Object o = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (pe.getGraphicsAlgorithm() instanceof AbstractText && start.equals(o)) {
				ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
				try {
					Thread.currentThread().setContextClassLoader(UpdateStartFeature.class.getClassLoader());
					AbstractText t = (AbstractText) pe.getGraphicsAlgorithm();
					String formatString = Graphiti.getPeService().getPropertyValue(t, MeinEditorGraphitiUtils.KEY_FORMAT_STRING);
					String oldVal = String.format(formatString );
					String newVal = t.getValue();
					return (!newVal.equals(oldVal));
				} finally {
					Thread.currentThread().setContextClassLoader(contextClassLoader);
				}
			}
		}
		return false;
	}

}	
	