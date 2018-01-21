package grafikeditor.graphiti;

import graphmodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;


public class MeinEditorGraphitiUtils {

	public static final String KEY_FORMAT_STRING = "formatString";
	private MeinEditorImageProvider ip;
	private IDiagramTypeProvider dtp;

	private static MeinEditorGraphitiUtils instance;

	private MeinEditorGraphitiUtils() {
	}
	
	public static MeinEditorGraphitiUtils getInstance() {
		if (instance == null)
			instance = new MeinEditorGraphitiUtils();
		return instance;
	}

	public static grafikeditor.meineditor.MeinEditor addToResource(Diagram d, IFeatureProvider fp) {
		grafikeditor.meineditor.MeinEditor meineditor = null;
		for (Object o : d.eResource().getContents()){
			if (o instanceof grafikeditor.meineditor.MeinEditor) {
				meineditor = (grafikeditor.meineditor.MeinEditor) o;
				break;
			}
		}
		if (meineditor == null) {
			meineditor = grafikeditor.meineditor.MeineditorFactory.eINSTANCE.createMeinEditor();
			d.eResource().getContents().add(meineditor);
			fp.link(d, meineditor);
		}
		
	return meineditor;
		/*if (obj instanceof Node) {
			meineditor.getAllNodes().add((Node) obj);
		}
		if (obj instanceof Edge) {
			meineditor.getAllEdges().add((Edge) obj);
		}*/
		
	}

	public String loadGraphitiImage(String path, EObject bo) {
		try{
		
			File file = new File(path);
			Bundle b = Platform.getBundle("grafikeditor");
			File bundleFile = FileLocator.getBundleFile(b);
		
			if (!file.exists()) {
				String filePath = bo.eResource().getURI().toPlatformString(true);
				IFile resFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
				IProject p = resFile.getProject();
				IFile iFile = p.getFile(path);
				if (iFile.exists()) {
					file = iFile.getLocation().toFile();
				}
				else {
					throw new FileNotFoundException("No file with path: " + path +" found...");
				}
			}
			
			FileInputStream fis = new FileInputStream(file);
			File trgFile = bundleFile.toPath().resolve("icons/"+file.getName()).toFile();
			trgFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(trgFile);
			
			copy(fis, fos);
			
			String id = (file.getName().contains(".") ? file.getName().split("\\.")[0] : file.getName());
			String relPath = "icons/" + file.getName();
			addImage(id, relPath);
			return id;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return null;
		
	}

	public void addImage(String id, String path) {
		ip.addImage(id, path);
	}

	public String getImageId(String path) {
		return ip.getImageId(path);
	}

	public void setImageProvider(MeinEditorImageProvider ip) {
		this.ip = ip;
	}

	public void loadImages() {
		ip.initImages();
	}

	public void setDTP(IDiagramTypeProvider dtp) {
		this.dtp = dtp;
	}
	
	public IDiagramTypeProvider getDTP() {
		if (PlatformUI.getWorkbench().getActiveWorkbenchWindow() == null ||
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() == null) 
			return loadByDarkFeature();
		IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (part instanceof MeinEditorDiagramEditor)
			return ((MeinEditorDiagramEditor) part).getDiagramTypeProvider();
		if (part instanceof MultiPageEditorPart) {
			Object page = ((MultiPageEditorPart) part).getSelectedPage();
			if (page instanceof MeinEditorDiagramEditor)
				return ((MeinEditorDiagramEditor) page).getDiagramTypeProvider();
		}
		return this.dtp;
	}

	private IDiagramTypeProvider loadByDarkFeature() {
		IDiagramTypeProvider dtp = GraphitiUi.getExtensionManager().createDiagramTypeProvider(MeinEditorWrapper.DTP_ID);
		return dtp;
	}

	private void copy(FileInputStream fis, FileOutputStream fos) {
		int b = 0;
		try {
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
			fis.close();
			fos.flush();fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ModelElementContainer getCommonContainer(ModelElementContainer ce, Edge e) {
		ModelElement source = e.getSourceElement();
		ModelElement target = e.getTargetElement();
		if (EcoreUtil.isAncestor(ce, source) && EcoreUtil.isAncestor(ce, target)) {
			for (Container c : ce.getAllContainers()) {
				if (EcoreUtil.isAncestor(c, source) && EcoreUtil.isAncestor(c, target)) {
					return getCommonContainer(c, e);
				}
			}
		} else if (ce instanceof ModelElement) {
			return getCommonContainer(((ModelElement) ce).getContainer(), e);
		}
		return ce;
		
	}

	public int max(int[] values) {
		java.util.OptionalInt max = Arrays.stream(values).max();
		if (max.isPresent())
			return max.getAsInt();
		else return 0;
	}

	public int min(int[] values) {
		java.util.OptionalInt min = Arrays.stream(values).min();
		if (min.isPresent())
			return min.getAsInt();
		else return 0;
	}
	
	public int[] transform(int[] values, int deltaX, int deltaY) {
		if (values.length > 0) {
			for (int i=0; i<values.length;i+=2){
				values[i] = values[i] + deltaX;
				values[i+1] = values[i+1] + deltaY;
			}
		}
		return values;
	}

}