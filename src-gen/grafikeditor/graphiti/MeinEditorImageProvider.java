package grafikeditor.graphiti;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;


import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.graphiti.ui.platform.IImageProvider;
import org.osgi.framework.Bundle;

public class MeinEditorImageProvider extends AbstractImageProvider 
	implements IImageProvider {

	private Hashtable<String, String> images;
	
	public MeinEditorImageProvider() {
		MeinEditorGraphitiUtils.getInstance().setImageProvider(this);
	}

	public void addImage(String id, String path) {
		if (images == null) {
			images = new Hashtable<String, String>();
		}
		images.put(id, path);
		addAvailableImages();
	}
	
	public String getImageId(String path) {
		for (Entry<String, String> e : images.entrySet()){
			if (e.getValue().equals(path))
				return e.getKey();
		}
		try {
			java.util.List<IFile> files = de.jabc.cinco.meta.core.utils.WorkspaceUtil.getFiles(f -> f.getFullPath().toString().contains(path));
			if (files.size() == 1) {
				IFile f = files.get(0);
				URL url = f.getLocationURI().toURL();
				addImage(path, url.toString());
			}  else {
				java.io.File f = new java.io.File(path);
				if (f.exists()) {
					addImage(path, f.toURI().toURL().toString());
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return path;
	}

	@Override
	protected void addAvailableImages() {
		if (images == null) {
			images = new Hashtable<String, String>();
		}
		for (Entry<String, String> e : images.entrySet()) {
			if (getImageFilePath(e.getKey()) == null)
				addImageFilePath(e.getKey(), e.getValue());
		}
	}

	public void initImages() {
		Bundle b = Platform.getBundle("grafikeditor");
		File file;
		try {
			URL url = null;
			/*addImage("/grafikeditor/icons/Rectangle.png", "icons/Rectangle.png");*/

			url = FileLocator.find(b, new Path("icons/Rectangle.png"), null);
			addImage("icons/Rectangle.png", url.getPath());
			/*addImage("/grafikeditor/icons/Circle.png", "icons/Circle.png");*/

			url = FileLocator.find(b, new Path("icons/Circle.png"), null);
			addImage("icons/Circle.png", url.getPath());
			/*addImage("/grafikeditor/icons/Gateway.png", "icons/Gateway.png");*/

			url = FileLocator.find(b, new Path("icons/Gateway.png"), null);
			addImage("icons/Gateway.png", url.getPath());
			/*addImage("/grafikeditor/icons/Start.png", "icons/Start.png");*/

			url = FileLocator.find(b, new Path("icons/Start.png"), null);
			addImage("icons/Start.png", url.getPath());
			/*addImage("/grafikeditor/icons/Stop.png", "icons/Stop.png");*/

			url = FileLocator.find(b, new Path("icons/Stop.png"), null);
			addImage("icons/Stop.png", url.getPath());


			file = FileLocator.getBundleFile(b);
			File genIconsFile = file.toPath().resolve("resources-gen/icons").toFile();
			if (genIconsFile.exists()) {
				for (File f : genIconsFile.listFiles()){
					String fileName = f.getName();
					String id = fileName;
					addImage(id, "/resources-gen/icons/"+fileName);
				}
			}
			if (!genIconsFile.exists() ) {
				Enumeration<URL> entries = b.findEntries("resources-gen/icons/", "*", true);
				while(entries.hasMoreElements()){
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					File i = path.toFile();
					String fileName = i.getName();
					String id = fileName;
					addImage(id, path.toString());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}