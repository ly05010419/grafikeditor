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

public class UpdateVariableFeature extends AbstractUpdateFeature {

	private static ExpressionFactoryImpl factory = new ExpressionFactoryImpl();
	private static ExpressionLanguageContext elContext;

	public UpdateVariableFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		return (bo instanceof grafikeditor.meineditor.Variable);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		grafikeditor.meineditor.Variable bo =(grafikeditor.meineditor.Variable) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
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
		grafikeditor.meineditor.Variable bo = (grafikeditor.meineditor.Variable) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		updateText(bo, pe);
		LayoutContext lContext = new LayoutContext(context.getPictogramElement());
		ILayoutFeature lf = getFeatureProvider().getLayoutFeature(lContext);
		if (lf.canLayout(lContext)) {
			return lf.layout(lContext);
		}		

		return false;
	}
	
	private void updateText(grafikeditor.meineditor.Variable variable, PictogramElement pe) {
		if (pe instanceof ContainerShape) {
			PictogramElement tmp = pe;
			Object o = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(tmp);
			if (variable.equals(o) || o == null)
			for (Shape _s : ((ContainerShape) pe).getChildren()) {
				updateText(variable, _s);
			}
		} 
		if (pe instanceof Connection) {
			Connection connection = (Connection) pe;
			for (ConnectionDecorator cd : connection.getConnectionDecorators()) {
				updateText(variable, cd);
			}
		} else {
			if (pe.getGraphicsAlgorithm() instanceof AbstractText) {
				ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
				AbstractText t = (AbstractText) pe.getGraphicsAlgorithm();
				try {
					Thread.currentThread().setContextClassLoader(UpdateVariableFeature.class.getClassLoader());
					elContext = new ExpressionLanguageContext(variable);
					Object tmp2Value = factory.createValueExpression(elContext, "${name}", Object.class).getValue(elContext);

					String formatString = Graphiti.getPeService().getPropertyValue(t, MeinEditorGraphitiUtils.KEY_FORMAT_STRING);
					t.setValue(String.format(formatString , tmp2Value));
				} catch (java.util.IllegalFormatException ife) {
					t.setValue("STRING FORMAT ERROR");
				} finally {
					Thread.currentThread().setContextClassLoader(contextClassLoader);
				}
			}
		}
	}

	public static boolean checkUpdateNeeded(grafikeditor.meineditor.Variable variable, PictogramElement pe) {
		boolean updateNeeded;
		if (pe instanceof ContainerShape) {
			for (Shape _s : ((ContainerShape) pe).getChildren()) {
				return checkUpdateNeeded(variable, _s);
			}
		} 
		if (pe instanceof Connection) {
			Connection connection = (Connection) pe;
			for (ConnectionDecorator cd : connection.getConnectionDecorators()) {
				updateNeeded = checkUpdateNeeded(variable, cd);
				if (updateNeeded)
					return true;
			}
		} else {
			Object o = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (pe.getGraphicsAlgorithm() instanceof AbstractText && variable.equals(o)) {
				ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
				try {
					Thread.currentThread().setContextClassLoader(UpdateVariableFeature.class.getClassLoader());
					AbstractText t = (AbstractText) pe.getGraphicsAlgorithm();
					elContext = new ExpressionLanguageContext(variable);
					Object tmp2Value = factory.createValueExpression(elContext, "${name}", Object.class).getValue(elContext);

					String formatString = Graphiti.getPeService().getPropertyValue(t, MeinEditorGraphitiUtils.KEY_FORMAT_STRING);
					String oldVal = String.format(formatString , tmp2Value);
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
	