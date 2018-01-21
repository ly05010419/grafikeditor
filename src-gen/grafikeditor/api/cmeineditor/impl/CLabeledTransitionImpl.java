/**
 */
package grafikeditor.api.cmeineditor.impl;

import grafikeditor.api.cmeineditor.CEnd;
import grafikeditor.api.cmeineditor.CGateway;
import grafikeditor.api.cmeineditor.CLabeledTransition;
import grafikeditor.api.cmeineditor.CStart;
import grafikeditor.api.cmeineditor.CTerminal;
import grafikeditor.api.cmeineditor.CVariable;
import grafikeditor.api.cmeineditor.CmeineditorPackage;

import graphicalgraphmodel.impl.CEdgeImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLabeled Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CLabeledTransitionImpl extends CEdgeImpl implements CLabeledTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLabeledTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmeineditorPackage.Literals.CLABELED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
		org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider("grafikeditor.MeinEditorDiagramTypeProvider");
		grafikeditor.graphiti.MeinEditorFeatureProvider fp = (grafikeditor.graphiti.MeinEditorFeatureProvider) dtp.getFeatureProvider();
		
		org.eclipse.graphiti.features.context.impl.UpdateContext uc = new org.eclipse.graphiti.features.context.impl.UpdateContext(getPictogramElement());
		org.eclipse.graphiti.features.IUpdateFeature uf = fp.getUpdateFeature(uc);
		if (uf.canUpdate(uc))
			uf.update(uc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return ((grafikeditor.meineditor.LabeledTransition) this.getModelElement()).getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(final String arg) {
		org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(modelElement.eResource().getResourceSet());
		if (dom == null)
			dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(modelElement.eResource().getResourceSet());
		dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) modelElement).setLabel(arg);
				update();
			}
		});
		      
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectSource(final CStart source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectSource(final CStart source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
						rf.reconnect(rc);
				}
				});
			this.setSourceElement(source);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + source.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' source from \n'" +getSourceElement().getModelElement()+"' to \n'"+source.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectSource(final CGateway source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectSource(final CGateway source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
						rf.reconnect(rc);
				}
				});
			this.setSourceElement(source);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + source.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' source from \n'" +getSourceElement().getModelElement()+"' to \n'"+source.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectSource(final CTerminal source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectSource(final CTerminal source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
						rf.reconnect(rc);
				}
				});
			this.setSourceElement(source);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + source.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' source from \n'" +getSourceElement().getModelElement()+"' to \n'"+source.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectSource(final CVariable source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectSource(final CVariable source) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor =((org.eclipse.graphiti.mm.pictograms.Shape) source.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_SOURCE);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
						rf.reconnect(rc);
				}
				});
			this.setSourceElement(source);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + source.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' source from \n'" +getSourceElement().getModelElement()+"' to \n'"+source.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectTarget(final CEnd target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectTarget(final CEnd target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
					@Override
					protected void doExecute() {
						rf.reconnect(rc);
					}
				});
			this.setTargetElement(target);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' target from \n'" +getSourceElement().getModelElement()+"' to \n'"+target.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectTarget(final CTerminal target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectTarget(final CTerminal target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
					@Override
					protected void doExecute() {
						rf.reconnect(rc);
					}
				});
			this.setTargetElement(target);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' target from \n'" +getSourceElement().getModelElement()+"' to \n'"+target.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectTarget(final CVariable target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectTarget(final CVariable target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
					@Override
					protected void doExecute() {
						rf.reconnect(rc);
					}
				});
			this.setTargetElement(target);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' target from \n'" +getSourceElement().getModelElement()+"' to \n'"+target.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canReconnectTarget(final CGateway target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		return rf.canReconnect(rc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectTarget(final CGateway target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectLabeledTransitionFeature)provider.getReconnectionFeature(rc);
		
		if (rf.canReconnect(rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
					@Override
					protected void doExecute() {
						rf.reconnect(rc);
					}
				});
			this.setTargetElement(target);
		} else {
			if (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not reconnect '" + this.getModelElement()+"'' target from \n'" +getSourceElement().getModelElement()+"' to \n'"+target.getModelElement()+"'");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CStart source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CStart source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CStart source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CStart source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CStart source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CStart source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CStart source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CStart source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CGateway source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CGateway source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CGateway source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CGateway source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CGateway source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CGateway source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CGateway source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CGateway source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CTerminal source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CTerminal source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CTerminal source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CTerminal source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CTerminal source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CTerminal source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CTerminal source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CTerminal source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CVariable source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CVariable source, final CEnd target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CVariable source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CVariable source, final CTerminal target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CVariable source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CVariable source, final CVariable target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CVariable source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition clone(final CVariable source, final CGateway target) {
		final CLabeledTransition clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
		java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement> pe = new java.util.ArrayList<>();
		pe.add(this.getPictogramElement());
		java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> set = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.targetCopy(pe, getDiagram());
		if (set != null && !set.isEmpty()) {
			org.eclipse.graphiti.mm.pictograms.PictogramElement copy = set.iterator().next();
			clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
			clone.setPictogramElement(copy);
		}
		clone.setSourceElement(source);
		clone.setTargetElement(target);
		final grafikeditor.api.cmeineditor.CMeinEditor container = (grafikeditor.api.cmeineditor.CMeinEditor)source.getCRootElement();
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) container.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			  
		org.eclipse.graphiti.mm.pictograms.Anchor sourceAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getSourceElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor targetAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) clone.getTargetElement().getPictogramElement()).getAnchors().get(0);
			  
		final org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sourceAnchor, targetAnchor);
		acc.setNewObject(clone.getModelElement());
		
		grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourceAnchor(sourceAnchor);
		ccc.setTargetAnchor(targetAnchor);
		
		final grafikeditor.graphiti.features.add.AddLabeledTransitionFeature af = (grafikeditor.graphiti.features.add.AddLabeledTransitionFeature) provider.getAddFeature(acc);
		if (af != null && af.canAdd(acc) && cf.canCreate(ccc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setSourceElement((graphmodel.Node) clone.getSourceElement().getModelElement());
				((grafikeditor.meineditor.LabeledTransition) clone.getModelElement()).setTargetElement((graphmodel.Node) clone.getTargetElement().getModelElement());
				clone.setPictogramElement(af.add(acc));
				container.getModelElements().add(clone);
				container.getCRootElement().getMap().put(clone.getModelElement(), clone);
				container.getMap().put(clone.getModelElement(), clone);
			}
			});
			
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + clone.getSourceElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + clone.getTargetElement().getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +clone.getSourceElement().getModelElement()+"' to \n'"+clone.getTargetElement().getModelElement()+"'");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBendpoint(final int x, final int y) {
		org.eclipse.graphiti.mm.algorithms.styles.Point p = org.eclipse.graphiti.services.Graphiti.getGaService().createPoint(x,y);
		((org.eclipse.graphiti.mm.pictograms.FreeFormConnection) getPictogramElement()).getBendpoints().add(p);
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean delete() {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());
		    if (pes == null || pes.isEmpty())
		    	return false;
		final org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));
		final grafikeditor.graphiti.features.delete.DeleteLabeledTransitionFeature df = (grafikeditor.graphiti.features.delete.DeleteLabeledTransitionFeature) provider.getDeleteFeature(dc);
		
		if (this.getContainer().getMap().get(this.getModelElement()) != null) {
			this.getContainer().getMap().remove(this.getModelElement());
		}
		
		if ( this.getCRootElement().getMap().get(this.getModelElement()) != null) {
			this.getCRootElement().getMap().remove(this.getModelElement());
		}
		
		if (df.canDelete(dc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				df.delete(dc);
			}
			});
			
			return true;
		}
		return false;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canDelete() {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());
		    if (pes == null || pes.isEmpty())
		    	return false;
		final org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));
		final org.eclipse.graphiti.features.IDeleteFeature df = provider.getDeleteFeature(dc);
		return df.canDelete(dc);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void highlight() {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		org.eclipse.graphiti.platform.IDiagramBehavior idb = grafikeditor.graphiti.MeinEditorGraphitiUtils.getInstance().getDTP().getDiagramBehavior();
		if (idb instanceof org.eclipse.graphiti.ui.editor.DiagramBehavior) {
			org.eclipse.graphiti.ui.editor.DiagramBehavior db = (org.eclipse.graphiti.ui.editor.DiagramBehavior) idb;
			db.setPictogramElementForSelection(getPictogramElement());
			db.selectBufferedPictogramElements();
		}
	}

} //CLabeledTransitionImpl
