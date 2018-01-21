package grafikeditor.graphiti;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionDelegate;



public class CreateMeinEditorDiagram implements IActionDelegate {

	private ISelection sel;
	private grafikeditor.meineditor.MeinEditor gm;
	private Diagram diagram;
	
	public CreateMeinEditorDiagram() {
	}

	@Override
	public void run(IAction action) {
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) sel;
			if (!ssel.isEmpty() && ssel.getFirstElement() instanceof IFile) {
				IFile file = (IFile) ssel.getFirstElement();
				URI fileUri = URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);
				
				Resource res = new ResourceSetImpl().getResource(fileUri, true);
				if (res != null) {
					for (Object o : res.getContents()) {
						if (o instanceof grafikeditor.meineditor.MeinEditor) {
							gm = (grafikeditor.meineditor.MeinEditor) o;
						}
						if (o instanceof Diagram) {
							diagram = (Diagram) o;
						}
					}
				}
				
				if (gm == null) {
					MessageDialog.openError(Display.getCurrent().getActiveShell(), 
							"Error", 
							"No MeinEditor model in file: " + file.getName());
					return;
				}
				
				if (diagram != null) {
					boolean yes = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(), "Warning",
							"There already exists a diagram for MeinEditor. Do you want to override it?");
					if (!yes)
						return;
				}
				diagram = Graphiti.getPeService().createDiagram("MeinEditor", file.getName().split("\\.")[0], true);
				
				try {
					
					res = gm.eResource();
					res.getContents().clear();
					res.getContents().add(diagram);
					res.getContents().add(gm);
					ResourceSet rs = res.getResourceSet();
					TransactionalEditingDomain dom = TransactionUtil.getEditingDomain(rs);
					if (dom == null) {
						dom = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
					}
					
					MeinEditorCreator command = new MeinEditorCreator(dom, gm, diagram);
					
					dom.getCommandStack().execute(command);
					
					res.save(null);
					
					dom.dispose();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.sel = selection;
	}

}
