package grafikeditor.graphiti.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DirectoryDialog;

public class CreateMeinEditorWizardPage extends WizardPage {

	private IContainer container;

	private Text dirText;
	private Text fileNameText;
	
	private Button browseButton;

	protected CreateMeinEditorWizardPage(String pageName) {
		super(pageName);
		setTitle("Create new MeinEditor diagram");
		setMessage("Create a new diagram in an existing or new project");
	}

	public String getDirectory() {
		return dirText.getText();
	}
	
	public String getFileName() {
		return fileNameText.getText();
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(3, false);
		composite.setLayout(layout);
		
		Label projectLbl = new Label(composite, SWT.NONE);
		projectLbl.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		projectLbl.setText("Di&rectory: ");

		dirText = new Text(composite, SWT.BORDER);
		dirText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		dirText.setEditable(false);
		dirText.setEnabled(false);
				
		browseButton = new Button(composite, SWT.PUSH);
		browseButton.setText("Brows&e...");
		browseButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));

		Label pNameLbl = new Label(composite, SWT.NONE);
		pNameLbl.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		pNameLbl.setText("Fi&le name: ");
		
		fileNameText = new Text(composite, SWT.BORDER);
		fileNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		fileNameText.setText("");
		
		dirText.addKeyListener(textKeyListener);
		fileNameText.addKeyListener(textKeyListener);
		browseButton.addSelectionListener(buttonListener);
		
		IStructuredSelection selection = null; 
		if (getWizard() instanceof NewMeinEditorDiagramWizard) 
			selection = ((NewMeinEditorDiagramWizard) getWizard()).getSelection();
		
		if (selection != null && selection.getFirstElement() instanceof IContainer) {
			container = (IContainer) selection.getFirstElement();
			dirText.setText(container.getLocation().toOSString());
		}

		dialogChanged();
		
		setControl(composite);
	}
	
	private String validateProjectName() {
		String directory = dirText.getText();
		if (directory.isEmpty())
			return "Select existing project or enter new project name";
		else return null;
	}
	
	private String validateFileName() {
		String fileName = fileNameText.getText();
		String fileExtension = "meineditor";
		if (fileName.isEmpty()) {
			return "Enter file name";
		} else if (fileName.contains(".") && !fileName.endsWith(fileExtension)) {
			return "Worng file extension";
		} else return null;
	}
	
	private boolean checkFileExists() {
		String fileName = (fileNameText.getText().contains(".") ? fileNameText.getText() : fileNameText.getText().concat(".meineditor"));
		try {
			if (container == null)
				return false;
			for (IResource res : container.members()) {
				if (res.getName().equals(fileName)) 
					return true;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void dialogChanged() {
		String projectNameError = validateProjectName();
		String fileNameError = validateFileName();
		boolean fileExists = checkFileExists();
		if (projectNameError != null) {
			updateStatus(projectNameError);
		} else if (fileNameError != null) {
			updateStatus(fileNameError);
		} else if (fileExists) {
			updateStatus("File already exists");
		}
		else updateStatus(null);
	}
	
	private void updateStatus(String msg) {
		setErrorMessage(msg);
		if (getContainer().getCurrentPage() != null) {
			getWizard().getContainer().updateMessage();
			getWizard().getContainer().updateButtons();
		}
		setPageComplete(getErrorMessage() == null);
	}
	
	
	private SelectionListener buttonListener = new SelectionListener() {
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			DirectoryDialog dialog = new DirectoryDialog(getShell());
			dialog.setText("Select a directory");
			String rootLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			dialog.setFilterPath(rootLocation);
			String dirName = dialog.open();
			if (dirName != null) {
				dirText.setText(dirName);
			}
			dialogChanged();
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	private KeyListener textKeyListener = new KeyListener() {
		
		@Override
		public void keyReleased(KeyEvent e) {
			dialogChanged();
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
}
