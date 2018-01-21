package grafikeditor.graphiti;

import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import java.io.IOException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.core.runtime.NullProgressMonitor;
import java.lang.Exception;

import graphicalgraphmodel.*;
import graphmodel.*;

public class MeinEditorWrapper {
	
	private static HashMap<ModelElement, CModelElement> map;
	private static IDiagramTypeProvider dtp;
	
	public static final String DTP_ID = "grafikeditor.MeinEditorDiagramTypeProvider";
/**
	public static grafikeditor.api.cmeineditor.C new(String graphModelName) throws IOException, CoreException, Exception {
		String fileName = "";
		IPath path = null;
		FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell());
		dialog.setText("Choose a file...");
		String ret = dialog.open();
		if (ret == null || ret.isEmpty()) {
			return null;
		}
		
		else path = new Path(ret);
		
		return newMeinEditor(path, fileName);
	}
**/
	public static grafikeditor.api.cmeineditor.CMeinEditor newMeinEditor(IPath path, String fileName) throws IOException, CoreException, Exception {
		IPath filePath = path.append(fileName).addFileExtension("meineditor");
		URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		Resource res = new ResourceSetImpl().createResource(uri);
		Diagram diagram = Graphiti.getPeCreateService().createDiagram("MeinEditor", fileName, true);
		grafikeditor.meineditor.MeinEditor graph = grafikeditor.meineditor.MeineditorFactory.eINSTANCE.createMeinEditor();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(diagram);
		res.getContents().add(graph);
		
		IDiagramTypeProvider dtp = GraphitiUi.getExtensionManager().createDiagramTypeProvider(diagram, DTP_ID);
		MeinEditorGraphitiUtils.addToResource(diagram, dtp.getFeatureProvider());
		dtp.getFeatureProvider().link(diagram, graph);
		res.save(null);

		grafikeditor.api.cmeineditor.CMeinEditor retval = wrapGraphModel(graph, diagram);

		return retval;
	}

	public static grafikeditor.api.cmeineditor.CMeinEditor wrapGraphModel(GraphModel sg, Diagram d) {
		grafikeditor.api.cmeineditor.CMeinEditor gsg = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCMeinEditor();
		dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider(d, DTP_ID);
		map = new HashMap<>();
		for (Node n : sg.getAllNodes()) {
			CNode gNode = wrap(n);
			gsg.getMap().put(n, gNode);
			gsg.getModelElements().add(gNode);
		}
		
		for (Edge e : sg.getAllEdges()) {
			CEdge gEdge = wrap(e);
			gsg.getMap().put(e, gEdge);
			gsg.getModelElements().add(gEdge);
		}
		
		gsg.getMap().putAll(map);
		gsg.setModelElement(sg);
		gsg.setShape(dtp.getDiagram());
		gsg.setDiagram(d);
		
		return gsg;
	}
	
	private static CNode getNode(Node n) {
		if (n instanceof grafikeditor.meineditor.Start)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();
		if (n instanceof grafikeditor.meineditor.End)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();
		if (n instanceof grafikeditor.meineditor.Terminal)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCTerminal();
		if (n instanceof grafikeditor.meineditor.Variable)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCVariable();
		if (n instanceof grafikeditor.meineditor.Gateway)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCGateway();

		return null;
	}

	private static CNode wrap(Node n){
		CNode gNode = null;
		
		if (map.get(n) != null)
			return (CNode) map.get(n);
		
		if (n instanceof Container) {
			gNode = wrap((Container) n);
		} else {

			gNode = getNode(n);
				
			gNode.setModelElement(n);
			gNode.setPictogramElementSupplier(
					new PictogramElementSupplier(dtp.getDiagram(), n));

			map.put(n, gNode);
			
			for (Edge e : n.getIncoming()) {
				gNode.getIncoming().add(wrap(e));
			}
			
			for (Edge e : n.getOutgoing()) {
				gNode.getOutgoing().add(wrap(e));
			}
		}
		
		return gNode;
	}
	
	private static CContainer getContainer(Node c) {
		return null;
	}

	private static CNode wrap(Container c) {
		CContainer gCont = null;
		
		if (map.get(c) != null)
			return (CNode) map.get(c);
		
		gCont = getContainer(c);

		gCont.setModelElement(c);
		gCont.setPictogramElementSupplier(
				new PictogramElementSupplier(dtp.getDiagram(), c));

		map.put(c, gCont);
		
		for (ModelElement me : c.getModelElements()) {
			CModelElement gme = null;
			if (me instanceof Node)
				gme = wrap((Node) me);
			if (me instanceof Edge)
				gme = wrap((Edge) me);
			
			gCont.getModelElements().add(gme);
			gCont.getMap().put(me, gme);
		}
		
		return gCont;
	}
	
	private static CEdge getEdge(Edge e) {
		if (e instanceof grafikeditor.meineditor.Transition)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCTransition();
		if (e instanceof grafikeditor.meineditor.LabeledTransition)
			return grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();

		return null;
	}

	private static CEdge wrap(Edge e) {
		CEdge gEdge = null;
		if (map.get(e) != null)
			return (CEdge) map.get(e);
		
		gEdge = getEdge(e);

		gEdge.setModelElement(e);
		gEdge.setPictogramElementSupplier(
				new PictogramElementSupplier(dtp.getDiagram(), e));

		map.put(e, gEdge);
		
		gEdge.setSourceElement(wrap(e.getSourceElement()));
		gEdge.setTargetElement(wrap(e.getTargetElement()));

		return gEdge;
	}
	
	private static class PictogramElementSupplier implements Supplier<PictogramElement> {
		
		private Diagram diagram;
		private ModelElement me;
		
		public PictogramElementSupplier(Diagram diagram, ModelElement me) {
			this.diagram = diagram;
			this.me = me;
		}

		@Override
		public PictogramElement get() {
			List<PictogramElement> pes = 
					GraphitiUi.getLinkService().getPictogramElements(diagram, me);
			if (pes == null || pes.isEmpty()) {
				throw new RuntimeException("No pictogram element for: " + me);
			}
			else return pes.get(0);
		}
	}
}
