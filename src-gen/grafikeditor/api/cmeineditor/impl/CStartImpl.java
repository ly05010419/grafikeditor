/**
 */
package grafikeditor.api.cmeineditor.impl;

import grafikeditor.api.cmeineditor.CEnd;
import grafikeditor.api.cmeineditor.CGateway;
import grafikeditor.api.cmeineditor.CLabeledTransition;
import grafikeditor.api.cmeineditor.CMeinEditor;
import grafikeditor.api.cmeineditor.CStart;
import grafikeditor.api.cmeineditor.CTerminal;
import grafikeditor.api.cmeineditor.CVariable;
import grafikeditor.api.cmeineditor.CmeineditorPackage;

import graphicalgraphmodel.impl.CNodeImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CStart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CStartImpl extends CNodeImpl implements CStart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmeineditorPackage.Literals.CSTART;
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
	public String getName() {
		return ((grafikeditor.meineditor.Start) this.getModelElement()).getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(final String arg) {
		org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(modelElement.eResource().getResourceSet());
		if (dom == null)
			dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(modelElement.eResource().getResourceSet());
		dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.Start) modelElement).setName(arg);
				update();
			}
		});
		      
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEnd> getEndSuccessors() {
		
		
		return getSuccessors(CEnd.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTerminal> getTerminalSuccessors() {
		
		
		return getSuccessors(CTerminal.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVariable> getVariableSuccessors() {
		
		
		return getSuccessors(CVariable.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CGateway> getGatewaySuccessors() {
		
		
		return getSuccessors(CGateway.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMeinEditor getCRootElement() {
		return (CMeinEditor)super.getCRootElement();
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
		final grafikeditor.graphiti.features.delete.DeleteStartFeature df = (grafikeditor.graphiti.features.delete.DeleteStartFeature) provider.getDeleteFeature(dc);
		
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveTo(final CMeinEditor container, final int x, final int y) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());
		if (pes != null && !pes.isEmpty()) {
		final org.eclipse.graphiti.features.context.impl.MoveShapeContext mc = new org.eclipse.graphiti.features.context.impl.MoveShapeContext((org.eclipse.graphiti.mm.pictograms.Shape)pes.get(0));
			mc.setLocation(x, y);
			if (this.getContainer() instanceof graphicalgraphmodel.CGraphModel)
				mc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CGraphModel) this.getContainer()).getPictogramElement());
			if (this.getContainer() instanceof graphicalgraphmodel.CContainer)
				mc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CContainer) this.getContainer()).getPictogramElement());
			mc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) container.getPictogramElement());
		
			final grafikeditor.graphiti.features.move.MoveStartFeature mf = (grafikeditor.graphiti.features.move.MoveStartFeature) provider.getMoveShapeFeature(mc);
		
			if (mf.canMoveShape(mc, true)) {
				org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(container.getModelElement().eResource().getResourceSet());
			      	if (dom == null)
					dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(container.getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
					@Override
					protected void doExecute() {
						mf.moveShape(mc);
					}
				});
			} else {
				if (mf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + container.getModelElement() +"' exceeded. Can not move Start in the specified container");
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canMoveTo(final CMeinEditor container) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());
		if (pes != null && !pes.isEmpty()) {
			final org.eclipse.graphiti.features.context.impl.MoveShapeContext mc = new org.eclipse.graphiti.features.context.impl.MoveShapeContext((org.eclipse.graphiti.mm.pictograms.Shape)pes.get(0));
			if (this.getContainer() instanceof graphicalgraphmodel.CGraphModel)
				mc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CGraphModel) this.getContainer()).getPictogramElement());
			if (this.getContainer() instanceof graphicalgraphmodel.CContainer)
				mc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CContainer) this.getContainer()).getPictogramElement());
			mc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) container.getPictogramElement());
			final grafikeditor.graphiti.features.move.MoveStartFeature mf = (grafikeditor.graphiti.features.move.MoveStartFeature) provider.getMoveShapeFeature(mc);
		
			return mf.canMoveShape(mc);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canClone(final CMeinEditor target) {
		final CStart clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();
		org.eclipse.graphiti.mm.pictograms.PictogramElement copy = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.flatCopy(getPictogramElement());
		clone.setPictogramElement(copy);
		clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) target.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			    
		final org.eclipse.graphiti.features.context.impl.AddContext ac = new org.eclipse.graphiti.features.context.impl.AddContext();
		ac.setNewObject(clone.getModelElement());
		ac.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) target.getPictogramElement());
		
		grafikeditor.graphiti.features.create.nodes.CreateStartFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateStartFeature(provider);
		org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer(target.getPictogramElement());
		
		final grafikeditor.graphiti.features.add.AddStartFeature af = (grafikeditor.graphiti.features.add.AddStartFeature) provider.getAddFeature(ac);
		
		return cf.canCreate(cc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStart clone(final CMeinEditor target) {
		final CStart clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();
		org.eclipse.graphiti.mm.pictograms.PictogramElement copy = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.flatCopy(getPictogramElement());
		clone.setPictogramElement(copy);
		clone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));
		
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) target.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
			    
		final org.eclipse.graphiti.features.context.impl.AddContext ac = new org.eclipse.graphiti.features.context.impl.AddContext();
		ac.setNewObject(clone.getModelElement());
		ac.setLocation(clone.getX(), clone.getY());
		ac.setWidth(clone.getWidth());
		ac.setHeight(clone.getHeight());
		ac.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) target.getPictogramElement());
		
		grafikeditor.graphiti.features.create.nodes.CreateStartFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateStartFeature(provider);
		org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer(target.getPictogramElement());
		
		final grafikeditor.graphiti.features.add.AddStartFeature af = (grafikeditor.graphiti.features.add.AddStartFeature) provider.getAddFeature(ac);
		if (af != null && af.canAdd(ac) && cf.canCreate(cc)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				clone.setPictogramElement(af.add(ac));
				clone.setContainer(target);
				target.getCRootElement().getMap().put(clone.getModelElement(), clone);
				target.getCRootElement().getModelElement().getModelElements().add(clone.getModelElement());
				target.getMap().put(clone.getModelElement(), clone);
			}
			});
		}  else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + target.getModelElement()+"' exceeded. Can not create '" + this.getModelElement()+"'' in the specified container");
		}
		
		return clone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resize(final int width, final int height) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) getCRootElement().getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final org.eclipse.graphiti.features.context.impl.ResizeShapeContext rc = new org.eclipse.graphiti.features.context.impl.ResizeShapeContext((org.eclipse.graphiti.mm.pictograms.Shape) getPictogramElement());
		rc.setSize(width, height);
		rc.setX(getX());
		rc.setY(getY());
		final grafikeditor.graphiti.features.resize.ResizeStartFeature rf = (grafikeditor.graphiti.features.resize.ResizeStartFeature) provider.getResizeShapeFeature((org.eclipse.graphiti.features.context.impl.ResizeShapeContext) rc);
		if (rf != null && rf.canResizeShape((org.eclipse.graphiti.features.context.impl.ResizeShapeContext) rc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
		      	if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
			@Override
			protected void doExecute() {
				rf.resizeShape((org.eclipse.graphiti.features.context.impl.ResizeShapeContext) rc);
			}
			});
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition newCLabeledTransition(final CEnd target) {
		final CLabeledTransition retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
			  
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		if (cf.canCreate(ccc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					org.eclipse.graphiti.mm.pictograms.Connection conn = cf.create(ccc);
					retval.setPictogramElement(conn);
					retval.setModelElement((graphmodel.Edge) conn.getLink().getBusinessObjects().get(0));
				}
			});
			retval.setSourceElement(this);
			retval.setTargetElement(target);
			this.getContainer().getModelElements().add(retval);
			this.getCRootElement().getMap().put(retval.getModelElement() ,retval);
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
		
		}
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCLabeledTransition(final CEnd target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition newCLabeledTransition(final CTerminal target) {
		final CLabeledTransition retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
			  
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		if (cf.canCreate(ccc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					org.eclipse.graphiti.mm.pictograms.Connection conn = cf.create(ccc);
					retval.setPictogramElement(conn);
					retval.setModelElement((graphmodel.Edge) conn.getLink().getBusinessObjects().get(0));
				}
			});
			retval.setSourceElement(this);
			retval.setTargetElement(target);
			this.getContainer().getModelElements().add(retval);
			this.getCRootElement().getMap().put(retval.getModelElement() ,retval);
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
		
		}
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCLabeledTransition(final CTerminal target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition newCLabeledTransition(final CVariable target) {
		final CLabeledTransition retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
			  
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		if (cf.canCreate(ccc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					org.eclipse.graphiti.mm.pictograms.Connection conn = cf.create(ccc);
					retval.setPictogramElement(conn);
					retval.setModelElement((graphmodel.Edge) conn.getLink().getBusinessObjects().get(0));
				}
			});
			retval.setSourceElement(this);
			retval.setTargetElement(target);
			this.getContainer().getModelElements().add(retval);
			this.getCRootElement().getMap().put(retval.getModelElement() ,retval);
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
		
		}
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCLabeledTransition(final CVariable target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		return cf.canCreate(ccc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition newCLabeledTransition(final CGateway target) {
		final CLabeledTransition retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCLabeledTransition();
			  
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		if (cf.canCreate(ccc, true)) {
			org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			if (dom == null)
				dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
			dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					org.eclipse.graphiti.mm.pictograms.Connection conn = cf.create(ccc);
					retval.setPictogramElement(conn);
					retval.setModelElement((graphmodel.Edge) conn.getLink().getBusinessObjects().get(0));
				}
			});
			retval.setSourceElement(this);
			retval.setTargetElement(target);
			this.getContainer().getModelElements().add(retval);
			this.getCRootElement().getMap().put(retval.getModelElement() ,retval);
		} else {
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_OUT))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Outgoing edge cardinality of '" + getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
			if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Incoming edge cardinality of '" + target.getModelElement()+"' exceeded. \nCan not create 'LabeledTransition' from \n'" +getModelElement()+"' to \n'"+target.getModelElement()+"'");
		
		}
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCLabeledTransition(final CGateway target) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		final grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature cf = 
			new grafikeditor.graphiti.features.create.edges.CreateLabeledTransitionFeature(provider);
			  
		final org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = 
			new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		
		ccc.setSourceAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) this.getPictogramElement()).getAnchors().get(0));
		ccc.setTargetAnchor(((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0));
		
		return cf.canCreate(ccc);
	}

} //CStartImpl
