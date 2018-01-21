package grafikeditor.graphiti.features.delete;

import graphmodel.Edge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;



public class DeleteGatewayFeature extends de.jabc.cinco.meta.core.ui.features.CincoDeleteFeature {

	public DeleteGatewayFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	
	public boolean canDelete(IDeleteContext context, boolean apiCall) {
		if (apiCall) {
			PictogramElement pe = context.getPictogramElement();
			EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof grafikeditor.meineditor.Gateway) {
				return true;
			}
			return super.canDelete(context);
		}
		return false;
	}
	
	@Override
	public boolean canDelete(IDeleteContext context) {
		return canDelete(context, true);
	}
	

	@Override
	public void delete(IDeleteContext context) {
		super.delete(context);		

		/*PictogramElement pe = context.getPictogramElement();
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
		
		if (bo instanceof graphmodel.Node) {
			graphmodel.Node n = (graphmodel.Node) bo;
			List<Edge> delEdges = new ArrayList<Edge>();
			
			delEdges.addAll(n.getIncoming());
			delEdges.addAll(n.getOutgoing());
			
			Map<Object, Connection> bo2edge = new HashMap<Object, Connection>();
			for (Connection c : getDiagram().getConnections()) {
				Object o = getBusinessObjectForPictogramElement(c);
				bo2edge.put(o, c);
			}
			
			for (Edge e : delEdges) {
				PictogramElement edgePE = bo2edge.get(e);
				RemoveContext remContext = new RemoveContext(edgePE);
				IRemoveFeature rf = getFeatureProvider().getRemoveFeature(remContext);
				if (rf != null && rf.canRemove(remContext)) {
					rf.remove(remContext);
					EcoreUtil.delete(e, true);
				}
			}
		}*/
	}

	@Override
	protected boolean getUserDecision(IDeleteContext context) {
		return true;
	}

}
