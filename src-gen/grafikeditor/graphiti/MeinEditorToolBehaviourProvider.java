package grafikeditor.graphiti;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;



import grafikeditor.graphiti.features.create.nodes.*;
import grafikeditor.graphiti.features.create.edges.*;
import grafikeditor.graphiti.features.reconnect.*;

public class MeinEditorToolBehaviourProvider extends DefaultToolBehaviorProvider {

	public MeinEditorToolBehaviourProvider(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IContextButtonPadData getContextButtonPad(
			IPictogramElementContext context) {
		
		IContextButtonPadData data = super.getContextButtonPad(context);
		PictogramElement pe = context.getPictogramElement();
		

		setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_UPDATE);
		
		CreateConnectionContext ccc = new CreateConnectionContext();
		ccc.setSourcePictogramElement(pe);
		Anchor anchor = null;
		if (pe instanceof Anchor) {
			anchor = (Anchor) pe;
		} else if (pe instanceof AnchorContainer) {
			anchor = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) pe);
		}
		ccc.setSourceAnchor(anchor);
		
		ContextButtonEntry contextButtonEntry = new ContextButtonEntry(null, context);
		contextButtonEntry.setText("Create connection");
		contextButtonEntry.setIconId("_Connection.gif");
		
		ICreateConnectionFeature[] ccf = getFeatureProvider().getCreateConnectionFeatures();
		for (ICreateConnectionFeature f : ccf) {
			if (f.isAvailable(ccc) && f.canStartConnection(ccc)) {
				contextButtonEntry.addDragAndDropFeature(f);
			}
		}
		
		if (contextButtonEntry.getDragAndDropFeatures().size() > 0) {
			data.getDomainSpecificContextButtons().add(contextButtonEntry);
		}
		
		return data;
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		List<IPaletteCompartmentEntry> palette = new ArrayList<>();
		IPaletteCompartmentEntry[] p = super.getPalette();
		/**for (IPaletteCompartmentEntry compartment : p) {
			if (!compartment.getLabel().equals("Connections")) {
				palette.add(compartment);
			}
		}**/	

		ICreateFeature cf = null;
		ICreateConnectionFeature ccf = null;
		ObjectCreationToolEntry objectCreationToolEntry = null;
		ConnectionCreationToolEntry connectionCreationToolEntry = null;
		PaletteCompartmentEntry compartmentEntry = null;
		compartmentEntry = new PaletteCompartmentEntry("Nodes", null);
		palette.add(compartmentEntry);

		cf = new CreateStartFeature(getFeatureProvider());

		objectCreationToolEntry = new ObjectCreationToolEntry(
			cf.getCreateName(),
			cf.getCreateDescription(),
			cf.getCreateImageId(),
			cf.getCreateLargeImageId(), 
			cf);

		compartmentEntry.addToolEntry(objectCreationToolEntry);
		cf = new CreateEndFeature(getFeatureProvider());

		objectCreationToolEntry = new ObjectCreationToolEntry(
			cf.getCreateName(),
			cf.getCreateDescription(),
			cf.getCreateImageId(),
			cf.getCreateLargeImageId(), 
			cf);

		compartmentEntry.addToolEntry(objectCreationToolEntry);
		cf = new CreateTerminalFeature(getFeatureProvider());

		objectCreationToolEntry = new ObjectCreationToolEntry(
			cf.getCreateName(),
			cf.getCreateDescription(),
			cf.getCreateImageId(),
			cf.getCreateLargeImageId(), 
			cf);

		compartmentEntry.addToolEntry(objectCreationToolEntry);
		cf = new CreateVariableFeature(getFeatureProvider());

		objectCreationToolEntry = new ObjectCreationToolEntry(
			cf.getCreateName(),
			cf.getCreateDescription(),
			cf.getCreateImageId(),
			cf.getCreateLargeImageId(), 
			cf);

		compartmentEntry.addToolEntry(objectCreationToolEntry);
		cf = new CreateGatewayFeature(getFeatureProvider());

		objectCreationToolEntry = new ObjectCreationToolEntry(
			cf.getCreateName(),
			cf.getCreateDescription(),
			cf.getCreateImageId(),
			cf.getCreateLargeImageId(), 
			cf);

		compartmentEntry.addToolEntry(objectCreationToolEntry);
		
	
		return palette.toArray(new IPaletteCompartmentEntry[palette.size()]);
	}

	@Override
	public boolean equalsBusinessObjects(Object o1, Object o2) {
		if (o1 != null)
			return o1.equals(o2);
		else return o2 == null;
	}
	
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (! (pes != null && pes.length == 1 && pes[0].getLink() != null) ) {
			return super.getDoubleClickFeature(context);
		}
		Object bo = pes[0].getLink().getBusinessObjects().get(0);
		return super.getDoubleClickFeature(context);
	}

	@Override
	public PictogramElement getSelection(PictogramElement originalPe, PictogramElement[] oldSelection) {
		EObject bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(originalPe);
		return super.getSelection(originalPe, oldSelection);
	}

}
