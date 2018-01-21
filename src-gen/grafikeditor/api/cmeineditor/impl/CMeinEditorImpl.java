/**
 */
package grafikeditor.api.cmeineditor.impl;

import grafikeditor.api.cmeineditor.CEnd;
import grafikeditor.api.cmeineditor.CGateway;
import grafikeditor.api.cmeineditor.CLabeledTransition;
import grafikeditor.api.cmeineditor.CMeinEditor;
import grafikeditor.api.cmeineditor.CStart;
import grafikeditor.api.cmeineditor.CTerminal;
import grafikeditor.api.cmeineditor.CTransition;
import grafikeditor.api.cmeineditor.CVariable;
import grafikeditor.api.cmeineditor.CmeineditorPackage;

import grafikeditor.meineditor.End;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.LabeledTransition;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Transition;
import grafikeditor.meineditor.Variable;

import graphicalgraphmodel.CEdge;
import graphicalgraphmodel.CModelElement;
import graphicalgraphmodel.CModelElementContainer;
import graphicalgraphmodel.CNode;

import graphicalgraphmodel.impl.CGraphModelImpl;

import graphmodel.Edge;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMein Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CMeinEditorImpl extends CGraphModelImpl implements CMeinEditor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMeinEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmeineditorPackage.Literals.CMEIN_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
		org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider("grafikeditor.MeinEditorDiagramTypeProvider");
		grafikeditor.graphiti.MeinEditorFeatureProvider fp = (grafikeditor.graphiti.MeinEditorFeatureProvider) dtp.getFeatureProvider();
		
		org.eclipse.graphiti.features.context.impl.UpdateContext uc = new org.eclipse.graphiti.features.context.impl.UpdateContext(getDiagram());
		org.eclipse.graphiti.features.IUpdateFeature uf = fp.getUpdateFeature(uc);
		if (uf.canUpdate(uc))
			uf.update(uc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return ((grafikeditor.meineditor.MeinEditor) this.getModelElement()).getModelName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(final String arg) {
		org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(modelElement.eResource().getResourceSet());
		if (dom == null)
			dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(modelElement.eResource().getResourceSet());
		dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		
			@Override
			protected void doExecute() {
				((grafikeditor.meineditor.MeinEditor) modelElement).setModelName(arg);
				update();
			}
		});
		      
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CStart> getCStarts() {
		return getCModelElements(CStart.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEnd> getCEnds() {
		return getCModelElements(CEnd.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTerminal> getCTerminals() {
		return getCModelElements(CTerminal.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVariable> getCVariables() {
		return getCModelElements(CVariable.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CGateway> getCGateways() {
		return getCModelElements(CGateway.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTransition> getCTransitions() {
		return getCModelElements(CTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CLabeledTransition> getCLabeledTransitions() {
		return getCModelElements(CLabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Class<?>> getAllNodeTypes() {
		
		return new org.eclipse.emf.common.util.BasicEList<Class<?>>(java.util.Arrays.asList(grafikeditor.api.cmeineditor.CStart.class,grafikeditor.api.cmeineditor.CEnd.class,grafikeditor.api.cmeineditor.CTerminal.class,grafikeditor.api.cmeineditor.CVariable.class,grafikeditor.api.cmeineditor.CGateway.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStart newCStart(final int x, final int y, final int width, final int height) {
		final CStart retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateStartFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateStartFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setX(x);
		cc.setY(y);
		if (width > -1 && height > -1) {
			cc.setWidth(width);
			cc.setHeight(height);
		}
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
			if (cf.canCreate(cc, true)) {
				org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			      	if (dom == null)
					dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					Object[] newObject = cf.create(cc);
					if (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Start) {
						retval.setModelElement((graphmodel.Node) newObject[0]);
						retval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) 
							org.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));
						getModelElements().add(retval);
						getCRootElement().getMap().put(retval.getModelElement() ,retval);
						getMap().put(retval.getModelElement() ,retval);
					}
				}
				});
			} else {
				if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + this.getModelElement()+"' exceeded. Can not create Start in the specified container");
			}
		    
		return retval; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStart newCStart(final int x, final int y) {
		return newCStart(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCStart() {
		final CStart retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateStartFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateStartFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
		return cf.canCreate(cc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnd newCEnd(final int x, final int y, final int width, final int height) {
		final CEnd retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateEndFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateEndFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setX(x);
		cc.setY(y);
		if (width > -1 && height > -1) {
			cc.setWidth(width);
			cc.setHeight(height);
		}
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
			if (cf.canCreate(cc, true)) {
				org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			      	if (dom == null)
					dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					Object[] newObject = cf.create(cc);
					if (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.End) {
						retval.setModelElement((graphmodel.Node) newObject[0]);
						retval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) 
							org.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));
						getModelElements().add(retval);
						getCRootElement().getMap().put(retval.getModelElement() ,retval);
						getMap().put(retval.getModelElement() ,retval);
					}
				}
				});
			} else {
				if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + this.getModelElement()+"' exceeded. Can not create End in the specified container");
			}
		    
		return retval; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnd newCEnd(final int x, final int y) {
		return newCEnd(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCEnd() {
		final CEnd retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateEndFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateEndFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
		return cf.canCreate(cc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminal newCTerminal(final int x, final int y, final int width, final int height) {
		final CTerminal retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCTerminal();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setX(x);
		cc.setY(y);
		if (width > -1 && height > -1) {
			cc.setWidth(width);
			cc.setHeight(height);
		}
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
			if (cf.canCreate(cc, true)) {
				org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			      	if (dom == null)
					dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					Object[] newObject = cf.create(cc);
					if (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Terminal) {
						retval.setModelElement((graphmodel.Node) newObject[0]);
						retval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) 
							org.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));
						getModelElements().add(retval);
						getCRootElement().getMap().put(retval.getModelElement() ,retval);
						getMap().put(retval.getModelElement() ,retval);
					}
				}
				});
			} else {
				if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + this.getModelElement()+"' exceeded. Can not create Terminal in the specified container");
			}
		    
		return retval; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminal newCTerminal(final int x, final int y) {
		return newCTerminal(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCTerminal() {
		final CTerminal retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCTerminal();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
		return cf.canCreate(cc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVariable newCVariable(final int x, final int y, final int width, final int height) {
		final CVariable retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCVariable();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateVariableFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateVariableFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setX(x);
		cc.setY(y);
		if (width > -1 && height > -1) {
			cc.setWidth(width);
			cc.setHeight(height);
		}
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
			if (cf.canCreate(cc, true)) {
				org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			      	if (dom == null)
					dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					Object[] newObject = cf.create(cc);
					if (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Variable) {
						retval.setModelElement((graphmodel.Node) newObject[0]);
						retval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) 
							org.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));
						getModelElements().add(retval);
						getCRootElement().getMap().put(retval.getModelElement() ,retval);
						getMap().put(retval.getModelElement() ,retval);
					}
				}
				});
			} else {
				if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + this.getModelElement()+"' exceeded. Can not create Variable in the specified container");
			}
		    
		return retval; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVariable newCVariable(final int x, final int y) {
		return newCVariable(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCVariable() {
		final CVariable retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCVariable();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateVariableFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateVariableFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
		return cf.canCreate(cc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGateway newCGateway(final int x, final int y, final int width, final int height) {
		final CGateway retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCGateway();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setX(x);
		cc.setY(y);
		if (width > -1 && height > -1) {
			cc.setWidth(width);
			cc.setHeight(height);
		}
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
			if (cf.canCreate(cc, true)) {
				org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());
			      	if (dom == null)
					dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());
				dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {
		        
				@Override
				protected void doExecute() {
					Object[] newObject = cf.create(cc);
					if (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Gateway) {
						retval.setModelElement((graphmodel.Node) newObject[0]);
						retval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) 
							org.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));
						getModelElements().add(retval);
						getCRootElement().getMap().put(retval.getModelElement() ,retval);
						getMap().put(retval.getModelElement() ,retval);
					}
				}
				});
			} else {
				if (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))
					throw new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException("Cardinality of '" + this.getModelElement()+"' exceeded. Can not create Gateway in the specified container");
			}
		    
		return retval; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGateway newCGateway(final int x, final int y) {
		return newCGateway(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canNewCGateway() {
		final CGateway retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCGateway();
		   
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		    
		final grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature(provider);
		final org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();
		cc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());
		return cf.canCreate(cc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTransition getCTransition(final Transition me) {
		CTransition retval = (CTransition) this.getMap().get(me);
		if (retval != null && retval.getContainer().equals(this))
			return retval;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition getCLabeledTransition(final LabeledTransition me) {
		CLabeledTransition retval = (CLabeledTransition) this.getMap().get(me);
		if (retval != null && retval.getContainer().equals(this))
			return retval;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStart findCStart(final Start me) {
		CStart retval = (CStart) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnd findCEnd(final End me) {
		CEnd retval = (CEnd) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminal findCTerminal(final Terminal me) {
		CTerminal retval = (CTerminal) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVariable findCVariable(final Variable me) {
		CVariable retval = (CVariable) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGateway findCGateway(final Gateway me) {
		CGateway retval = (CGateway) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTransition findCTransition(final Transition me) {
		CTransition retval = (CTransition) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition findCLabeledTransition(final LabeledTransition me) {
		CLabeledTransition retval = (CLabeledTransition) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMeinEditor getCRootElement() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CModelElement findCModelElement(final ModelElement me) {
		CModelElement retval = (CModelElement) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNode findCNode(final Node me) {
		CNode retval = (CNode) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEdge findCEdge(final Edge me) {
		CEdge retval = (CEdge) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CModelElementContainer findCModelElementContainer(final ModelElementContainer me) {
		CModelElementContainer retval = (CModelElementContainer) this.getMap().get(me);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canDeleteModelElement(final CModelElement me) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, me.getModelElement());
		    if (pes == null || pes.isEmpty())
		    	return false;
		org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));
		org.eclipse.graphiti.features.IDeleteFeature df = provider.getDeleteFeature(dc);
		
		 return df.canDelete(dc);
		
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deleteModelElement(final CModelElement me) {
		org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();
		grafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, me.getModelElement());
		    if (pes == null || pes.isEmpty())
		    	return false;
		org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));
		de.jabc.cinco.meta.core.ui.features.CincoDeleteFeature df = (de.jabc.cinco.meta.core.ui.features.CincoDeleteFeature) provider.getDeleteFeature(dc);
		
		if (this.getMap().get(me.getModelElement()) != null) {
			this.getMap().remove(me.getModelElement());
		}
		
		if ( this.getCRootElement().getMap().get(me.getModelElement()) != null) {
			this.getCRootElement().getMap().remove(me.getModelElement());
		}
		
		if (df.canDelete(dc, true)) {
			df.delete(dc);
			return true;
		}
		return false;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void highlight(final EList<CModelElement> elements) {
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = new java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement>();
		for (graphicalgraphmodel.CModelElement cme : elements) {
			pes.add(cme.getPictogramElement());
		}
		org.eclipse.graphiti.platform.IDiagramBehavior diagramBehavior = grafikeditor.graphiti.MeinEditorGraphitiUtils.getInstance().getDTP().getDiagramBehavior();
		if (diagramBehavior instanceof org.eclipse.graphiti.ui.editor.DiagramBehavior) {
			org.eclipse.graphiti.ui.editor.DiagramBehavior db = (org.eclipse.graphiti.ui.editor.DiagramBehavior) diagramBehavior;
			org.eclipse.graphiti.mm.pictograms.PictogramElement[] selected = diagramBehavior.getDiagramContainer().getSelectedPictogramElements();
			org.eclipse.graphiti.mm.pictograms.PictogramElement[] select = pes.toArray(new org.eclipse.graphiti.mm.pictograms.PictogramElement[pes.size()]);
			java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> lastSelected = new java.util.HashSet<org.eclipse.graphiti.mm.pictograms.PictogramElement>();
			java.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> toSelect = new java.util.HashSet<org.eclipse.graphiti.mm.pictograms.PictogramElement>();
			lastSelected.addAll(java.util.Arrays.asList(selected));
			toSelect.addAll(java.util.Arrays.asList(select));
			for (org.eclipse.graphiti.mm.pictograms.PictogramElement pe : select) {
				if (!lastSelected.contains(pe)) {
					diagramBehavior.getDiagramContainer().selectPictogramElements(select);
					break;
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMeinEditor getCMeinEditor(final LabeledTransition me) {
		CMeinEditor retval = this;
		return retval;
	}

} //CMeinEditorImpl
