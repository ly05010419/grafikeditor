package grafikeditor.graphiti.wizard;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.emf.ecore.util.EcoreUtil;


import grafikeditor.graphiti.*;

public class NewMeinEditorDiagramWizard extends Wizard implements INewWizard {

	private IWizardPage page;

	private IStructuredSelection ssel;
	
	public NewMeinEditorDiagramWizard() {
	}

	@Override
	public void addPages() {
		page = new CreateMeinEditorWizardPage("newMeinEditor");
		addPage(page);
		
		super.addPages();
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		ssel = selection;
	}

	@Override
	public boolean performFinish() {
		if (page instanceof CreateMeinEditorWizardPage) {
			CreateMeinEditorWizardPage p = (CreateMeinEditorWizardPage) page;
			final String dir = p.getDirectory();
			final String fileName = p.getFileName();
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					createResource(dir, fileName);
				}
			};
			
			try {
				getContainer().run(false, false, operation);
	
				//IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow(); 
				//PlatformUI.getWorkbench().showPerspective(MeinEditorPerspectiveFactory.ID_PERSPECTIVE, window);

			} catch (InvocationTargetException | InterruptedException e) {
				e.printStackTrace();
				return false;
			}/* catch (WorkbenchException e) {
				e.printStackTrace();
				return false;
			}*/
		}
		return true;
	}

	private void createResource(String folder, String fileName) {
		String extension = "meineditor";
		String fNameWithExt = (fileName.contains(".")) ? fileName : fileName.concat("." + extension);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource containerResource = root.getContainerForLocation(new Path(folder));
		if (containerResource instanceof IContainer) {
			IPath filePath = new Path(containerResource.getFullPath().append(fNameWithExt).toOSString());
			IFile file = root.getFile(filePath);
			String content = "MeinEditor " + EcoreUtil.generateUUID() + " {\n\n}";
			createFile(file, content);
			try {
				URI resUri = URI.createPlatformResourceURI(filePath.toOSString() ,true);
				Resource res = new ResourceSetImpl().getResource(resUri, true);
				Diagram diagram = (Diagram) res.getContents().get(0);
				grafikeditor.meineditor.MeinEditor graph = (grafikeditor.meineditor.MeinEditor) res.getContents().get(1);

				
				res.save(null);
				
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IDE.openEditor(page, file, "grafikeditor.MeinEditorMultiPageEditor", true);
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public IFile createFile(IFile file, String content) {
		try {
			final InputStream stream = new ByteArrayInputStream(
					content.getBytes(file.getCharset()));
			if (file.exists()) 
				file.setContents(stream, true, true, null);
			else
				file.create(stream, true, null);
			stream.close();
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
		return file;
	}
	
	public IStructuredSelection getSelection() {
		return this.ssel;
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
	}
	
	@Override
	public boolean canFinish() {
		return page.isPageComplete(); 
	}
		
}
