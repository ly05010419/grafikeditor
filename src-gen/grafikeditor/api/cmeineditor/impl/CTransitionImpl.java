/**
 */
package grafikeditor.api.cmeineditor.impl;

import grafikeditor.api.cmeineditor.CEnd;
import grafikeditor.api.cmeineditor.CGateway;
import grafikeditor.api.cmeineditor.CTerminal;
import grafikeditor.api.cmeineditor.CTransition;
import grafikeditor.api.cmeineditor.CVariable;
import grafikeditor.api.cmeineditor.CmeineditorPackage;

import graphicalgraphmodel.impl.CEdgeImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTransition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CTransitionImpl extends CEdgeImpl implements CTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmeineditorPackage.Literals.CTRANSITION;
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
	public boolean canReconnectTarget(final CEnd target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		org.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);
		org.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);
		
		final org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);
		rc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);
		
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
		final grafikeditor.graphiti.features.delete.DeleteTransitionFeature df = (grafikeditor.graphiti.features.delete.DeleteTransitionFeature) provider.getDeleteFeature(dc);
		
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

} //CTransitionImpl
