package grafikeditor.graphiti.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import graphmodel.*;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.AbstractCopyFeature;

public class MeinEditorCopyFeature extends AbstractCopyFeature {

	public MeinEditorCopyFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canCopy(ICopyContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes == null || pes.length == 0)
			return false;
		return true;
		
	}

	@Override
	public void copy(ICopyContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		Set<PictogramElement> copiedSubGraph = new HashSet<>();
		List<PictogramElement> subGraphElements = getSubGraph(pes);

		copiedSubGraph = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.sourceCopy(subGraphElements, getDiagram());
		
		putToClipboard(copiedSubGraph.toArray(new Object[copiedSubGraph.size()]));
	}

	private List<PictogramElement> getSubGraph(PictogramElement[] pes) {
		ArrayList<PictogramElement> list = new ArrayList<>();
		HashMap<ModelElement, Object> map = new HashMap<>();
		List<Edge> edges = new ArrayList<Edge>();
		for (PictogramElement pe : pes) {
			Object bo = getBusinessObjectForPictogramElement(pe);
			if (bo instanceof Node) {
				if (bo instanceof Container) {
					Container container = (Container) bo;
					list.add(pe);
					map.put(container, true);
					for (Edge e : container.getIncoming())
						edges.add(e);
					for (Edge e : container.getOutgoing())
						edges.add(e);
				} else {
					Node node = (Node) bo;
					list.add(pe);
					map.put(node, true);
					for (Edge e : node.getIncoming())
						edges.add(e);
					for (Edge e : node.getOutgoing())
						edges.add(e);
				}
			}
			
			if (bo instanceof Edge)
				edges.add((Edge) bo);
		}
		
		for (Edge e : edges) {
			Object e1 = map.get(e.getSourceElement());
			Object e2 = map.get(e.getTargetElement());
			if (e1 != null && e2 != null) {
				if (!list.contains(Graphiti.getLinkService().getPictogramElements(getDiagram(), e).get(0)))
					list.add(Graphiti.getLinkService().getPictogramElements(getDiagram(), e).get(0));
			}
		}
		return list;
	}

	private void removeMissingLinks(Container container, List<ModelElement> remove) {
		for (ModelElement me : container.getModelElements()) {
			if (me instanceof Edge) {
				Edge e = (Edge) me;
				if (e.getSourceElement() == null || e.getTargetElement() == null) 
					remove.add(e);
			}
			if (me instanceof Container) {
				removeMissingLinks((Container) me, remove);
			}
		}
	}

}
