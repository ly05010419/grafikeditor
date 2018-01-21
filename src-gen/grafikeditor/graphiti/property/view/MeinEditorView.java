package grafikeditor.graphiti.property.view;

import de.jabc.cinco.meta.core.ui.properties.CincoPropertyView;

import grafikeditor.meineditor.*;
import grafikeditor.meineditor.impl.*;
import grafikeditor.graphiti.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.platform.GraphitiConnectionEditPart;
import org.eclipse.graphiti.ui.platform.GraphitiShapeEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

public class MeinEditorView implements ISelectionListener {

	private PictogramElement lastSelected;
	private static ISelectionListener listener;

	public static void initEStructuralFeatureInformation(){

		if (listener == null) {
			listener = new MeinEditorView();
			CincoPropertyView.addSelectionListener(listener);
		}

		CincoPropertyView.init_EStructuralFeatures(MeinEditorImpl.class, 
			new EStructuralFeature[] {
				MeineditorPackage.eINSTANCE.getMeinEditor_ModelName(),

			}
		);

		CincoPropertyView.init_EStructuralFeatures(StartImpl.class, 
			new EStructuralFeature[] {
				MeineditorPackage.eINSTANCE.getStart_Name(),

			}
		);

		CincoPropertyView.init_EStructuralFeatures(EndImpl.class, 
			new EStructuralFeature[] {
			}
		);

		CincoPropertyView.init_EStructuralFeatures(TerminalImpl.class, 
			new EStructuralFeature[] {
				MeineditorPackage.eINSTANCE.getTerminal_Name(),

			}
		);

		CincoPropertyView.init_EStructuralFeatures(VariableImpl.class, 
			new EStructuralFeature[] {
				MeineditorPackage.eINSTANCE.getVariable_Name(),

			}
		);

		CincoPropertyView.init_EStructuralFeatures(GatewayImpl.class, 
			new EStructuralFeature[] {
				MeineditorPackage.eINSTANCE.getGateway_Name(),

			}
		);

		CincoPropertyView.init_EStructuralFeatures(TransitionImpl.class, 
			new EStructuralFeature[] {
			}
		);

		CincoPropertyView.init_EStructuralFeatures(LabeledTransitionImpl.class, 
			new EStructuralFeature[] {
				MeineditorPackage.eINSTANCE.getLabeledTransition_Label(),

			}
		);




		CincoPropertyView.init_MultiLineAttributes(new EStructuralFeature[] {
		
		});

		CincoPropertyView.init_ReadOnlyAttributes(new EStructuralFeature[] {
		
		});

		CincoPropertyView.init_FileAttributes(new EStructuralFeature[] {
		
		});
	}
	

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (isStructuredSelection(selection)) {
			Object element = ((IStructuredSelection) selection).getFirstElement();
			PictogramElement pe = null;
			if (element instanceof GraphicalEditPart)
				pe = getPictogramElement(element);
			
			if (MeinEditorGraphitiUtils.getInstance().getDTP().getDiagramBehavior() instanceof DiagramBehavior) {
				DiagramBehavior db = (DiagramBehavior) MeinEditorGraphitiUtils.getInstance().getDTP().getDiagramBehavior();		
				EObject bo = getBusinessObject(pe);
			

				if (pe instanceof ConnectionDecorator && !pe.equals(lastSelected)) {
					Connection connection = ((ConnectionDecorator) pe).getConnection();
				
					lastSelected = pe;
					db.getDiagramContainer().selectPictogramElements(new PictogramElement[] {
						pe, connection
					});
				}
			}
			lastSelected = pe;
		}
		
	}


	private EObject getBusinessObject(PictogramElement pe) {
		return Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	}

	private PictogramElement getPictogramElement(Object element) {
		if (element instanceof GraphitiShapeEditPart) 
			return ((GraphitiShapeEditPart) element).getPictogramElement();
		
		if (element instanceof GraphitiConnectionEditPart)
			return ((GraphitiConnectionEditPart) element).getPictogramElement();
		
		return null;
	}

	private boolean isStructuredSelection(ISelection selection) {
		return selection instanceof IStructuredSelection;
	}
	
}
