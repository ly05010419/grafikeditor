/**
 */
package grafikeditor.api.cmeineditor;

import grafikeditor.meineditor.End;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.LabeledTransition;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Transition;
import grafikeditor.meineditor.Variable;

import graphicalgraphmodel.CEdge;
import graphicalgraphmodel.CGraphModel;
import graphicalgraphmodel.CModelElement;
import graphicalgraphmodel.CModelElementContainer;
import graphicalgraphmodel.CNode;

import graphmodel.Edge;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMein Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage#getCMeinEditor()
 * @model
 * @generated
 */
public interface CMeinEditor extends CGraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider(\"grafikeditor.MeinEditorDiagramTypeProvider\");\ngrafikeditor.graphiti.MeinEditorFeatureProvider fp = (grafikeditor.graphiti.MeinEditorFeatureProvider) dtp.getFeatureProvider();\n\norg.eclipse.graphiti.features.context.impl.UpdateContext uc = new org.eclipse.graphiti.features.context.impl.UpdateContext(getDiagram());\norg.eclipse.graphiti.features.IUpdateFeature uf = fp.getUpdateFeature(uc);\nif (uf.canUpdate(uc))\n\tuf.update(uc);'"
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Get the value of attribute modelName
	 * 
	 * @return Value of modelName
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((grafikeditor.meineditor.MeinEditor) this.getModelElement()).getModelName();'"
	 * @generated
	 */
	String getModelName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Set the value of attribute modelName
	 * 
	 * @param arg New value for modelName
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(modelElement.eResource().getResourceSet());\nif (dom == null)\n\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(modelElement.eResource().getResourceSet());\ndom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n\n\t@Override\n\tprotected void doExecute() {\n\t\t((grafikeditor.meineditor.MeinEditor) modelElement).setModelName(arg);\n\t\tupdate();\n\t}\n});\n      '"
	 * @generated
	 */
	void setModelName(String arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CStart.class);'"
	 * @generated
	 */
	EList<CStart> getCStarts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CEnd.class);'"
	 * @generated
	 */
	EList<CEnd> getCEnds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CTerminal.class);'"
	 * @generated
	 */
	EList<CTerminal> getCTerminals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CVariable.class);'"
	 * @generated
	 */
	EList<CVariable> getCVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CGateway.class);'"
	 * @generated
	 */
	EList<CGateway> getCGateways();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CTransition.class);'"
	 * @generated
	 */
	EList<CTransition> getCTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getCModelElements(CLabeledTransition.class);'"
	 * @generated
	 */
	EList<CLabeledTransition> getCLabeledTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nreturn new org.eclipse.emf.common.util.BasicEList<Class<?>>(java.util.Arrays.asList(grafikeditor.api.cmeineditor.CStart.class,grafikeditor.api.cmeineditor.CEnd.class,grafikeditor.api.cmeineditor.CTerminal.class,grafikeditor.api.cmeineditor.CVariable.class,grafikeditor.api.cmeineditor.CGateway.class));'"
	 * @generated
	 */
	EList<Class<?>> getAllNodeTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds an Start.
	 * @param x The x position of Start's graphical representation in the diagram
	 * @param y The y position of Start's graphical representation in the diagram
	 * @param width The width position of Start's graphical representation in the diagram
	 * @param height The height position of Start's graphical representation in the diagram
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Start instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CStart retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateStartFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateStartFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setX(x);\ncc.setY(y);\nif (width > -1 && height > -1) {\n\tcc.setWidth(width);\n\tcc.setHeight(height);\n}\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\n\tif (cf.canCreate(cc, true)) {\n\t\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\t      \tif (dom == null)\n\t\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t@Override\n\t\tprotected void doExecute() {\n\t\t\tObject[] newObject = cf.create(cc);\n\t\t\tif (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Start) {\n\t\t\t\tretval.setModelElement((graphmodel.Node) newObject[0]);\n\t\t\t\tretval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) \n\t\t\t\t\torg.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));\n\t\t\t\tgetModelElements().add(retval);\n\t\t\t\tgetCRootElement().getMap().put(retval.getModelElement() ,retval);\n\t\t\t\tgetMap().put(retval.getModelElement() ,retval);\n\t\t\t}\n\t\t}\n\t\t});\n\t} else {\n\t\tif (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + this.getModelElement()+\"\' exceeded. Can not create Start in the specified container\");\n\t}\n    \nreturn retval; '"
	 * @generated
	 */
	CStart newCStart(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds a new instance of Start if possible.
	 * @param x The x position of Start's graphical representation in the diagram.
	 * @param y The y position of Start's graphical representation in the diagram.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Start instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return newCStart(x, y, -1, -1);'"
	 * @generated
	 */
	CStart newCStart(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CStart retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCStart();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateStartFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateStartFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\nreturn cf.canCreate(cc);'"
	 * @generated
	 */
	boolean canNewCStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds an End.
	 * @param x The x position of End's graphical representation in the diagram
	 * @param y The y position of End's graphical representation in the diagram
	 * @param width The width position of End's graphical representation in the diagram
	 * @param height The height position of End's graphical representation in the diagram
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New End instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CEnd retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateEndFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateEndFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setX(x);\ncc.setY(y);\nif (width > -1 && height > -1) {\n\tcc.setWidth(width);\n\tcc.setHeight(height);\n}\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\n\tif (cf.canCreate(cc, true)) {\n\t\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\t      \tif (dom == null)\n\t\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t@Override\n\t\tprotected void doExecute() {\n\t\t\tObject[] newObject = cf.create(cc);\n\t\t\tif (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.End) {\n\t\t\t\tretval.setModelElement((graphmodel.Node) newObject[0]);\n\t\t\t\tretval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) \n\t\t\t\t\torg.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));\n\t\t\t\tgetModelElements().add(retval);\n\t\t\t\tgetCRootElement().getMap().put(retval.getModelElement() ,retval);\n\t\t\t\tgetMap().put(retval.getModelElement() ,retval);\n\t\t\t}\n\t\t}\n\t\t});\n\t} else {\n\t\tif (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + this.getModelElement()+\"\' exceeded. Can not create End in the specified container\");\n\t}\n    \nreturn retval; '"
	 * @generated
	 */
	CEnd newCEnd(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds a new instance of End if possible.
	 * @param x The x position of End's graphical representation in the diagram.
	 * @param y The y position of End's graphical representation in the diagram.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New End instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return newCEnd(x, y, -1, -1);'"
	 * @generated
	 */
	CEnd newCEnd(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CEnd retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateEndFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateEndFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\nreturn cf.canCreate(cc);'"
	 * @generated
	 */
	boolean canNewCEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds an Terminal.
	 * @param x The x position of Terminal's graphical representation in the diagram
	 * @param y The y position of Terminal's graphical representation in the diagram
	 * @param width The width position of Terminal's graphical representation in the diagram
	 * @param height The height position of Terminal's graphical representation in the diagram
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Terminal instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CTerminal retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCTerminal();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setX(x);\ncc.setY(y);\nif (width > -1 && height > -1) {\n\tcc.setWidth(width);\n\tcc.setHeight(height);\n}\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\n\tif (cf.canCreate(cc, true)) {\n\t\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\t      \tif (dom == null)\n\t\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t@Override\n\t\tprotected void doExecute() {\n\t\t\tObject[] newObject = cf.create(cc);\n\t\t\tif (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Terminal) {\n\t\t\t\tretval.setModelElement((graphmodel.Node) newObject[0]);\n\t\t\t\tretval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) \n\t\t\t\t\torg.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));\n\t\t\t\tgetModelElements().add(retval);\n\t\t\t\tgetCRootElement().getMap().put(retval.getModelElement() ,retval);\n\t\t\t\tgetMap().put(retval.getModelElement() ,retval);\n\t\t\t}\n\t\t}\n\t\t});\n\t} else {\n\t\tif (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + this.getModelElement()+\"\' exceeded. Can not create Terminal in the specified container\");\n\t}\n    \nreturn retval; '"
	 * @generated
	 */
	CTerminal newCTerminal(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds a new instance of Terminal if possible.
	 * @param x The x position of Terminal's graphical representation in the diagram.
	 * @param y The y position of Terminal's graphical representation in the diagram.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Terminal instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return newCTerminal(x, y, -1, -1);'"
	 * @generated
	 */
	CTerminal newCTerminal(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CTerminal retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCTerminal();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateTerminalFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\nreturn cf.canCreate(cc);'"
	 * @generated
	 */
	boolean canNewCTerminal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds an Variable.
	 * @param x The x position of Variable's graphical representation in the diagram
	 * @param y The y position of Variable's graphical representation in the diagram
	 * @param width The width position of Variable's graphical representation in the diagram
	 * @param height The height position of Variable's graphical representation in the diagram
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Variable instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CVariable retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCVariable();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateVariableFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateVariableFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setX(x);\ncc.setY(y);\nif (width > -1 && height > -1) {\n\tcc.setWidth(width);\n\tcc.setHeight(height);\n}\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\n\tif (cf.canCreate(cc, true)) {\n\t\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\t      \tif (dom == null)\n\t\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t@Override\n\t\tprotected void doExecute() {\n\t\t\tObject[] newObject = cf.create(cc);\n\t\t\tif (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Variable) {\n\t\t\t\tretval.setModelElement((graphmodel.Node) newObject[0]);\n\t\t\t\tretval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) \n\t\t\t\t\torg.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));\n\t\t\t\tgetModelElements().add(retval);\n\t\t\t\tgetCRootElement().getMap().put(retval.getModelElement() ,retval);\n\t\t\t\tgetMap().put(retval.getModelElement() ,retval);\n\t\t\t}\n\t\t}\n\t\t});\n\t} else {\n\t\tif (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + this.getModelElement()+\"\' exceeded. Can not create Variable in the specified container\");\n\t}\n    \nreturn retval; '"
	 * @generated
	 */
	CVariable newCVariable(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds a new instance of Variable if possible.
	 * @param x The x position of Variable's graphical representation in the diagram.
	 * @param y The y position of Variable's graphical representation in the diagram.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Variable instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return newCVariable(x, y, -1, -1);'"
	 * @generated
	 */
	CVariable newCVariable(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CVariable retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCVariable();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateVariableFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateVariableFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\nreturn cf.canCreate(cc);'"
	 * @generated
	 */
	boolean canNewCVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds an Gateway.
	 * @param x The x position of Gateway's graphical representation in the diagram
	 * @param y The y position of Gateway's graphical representation in the diagram
	 * @param width The width position of Gateway's graphical representation in the diagram
	 * @param height The height position of Gateway's graphical representation in the diagram
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Gateway instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CGateway retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCGateway();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setX(x);\ncc.setY(y);\nif (width > -1 && height > -1) {\n\tcc.setWidth(width);\n\tcc.setHeight(height);\n}\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\n\tif (cf.canCreate(cc, true)) {\n\t\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\t      \tif (dom == null)\n\t\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t@Override\n\t\tprotected void doExecute() {\n\t\t\tObject[] newObject = cf.create(cc);\n\t\t\tif (newObject.length == 1 && newObject[0] instanceof grafikeditor.meineditor.Gateway) {\n\t\t\t\tretval.setModelElement((graphmodel.Node) newObject[0]);\n\t\t\t\tretval.setPictogramElement((org.eclipse.graphiti.mm.pictograms.ContainerShape) \n\t\t\t\t\torg.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), retval.getModelElement()).get(0));\n\t\t\t\tgetModelElements().add(retval);\n\t\t\t\tgetCRootElement().getMap().put(retval.getModelElement() ,retval);\n\t\t\t\tgetMap().put(retval.getModelElement() ,retval);\n\t\t\t}\n\t\t}\n\t\t});\n\t} else {\n\t\tif (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + this.getModelElement()+\"\' exceeded. Can not create Gateway in the specified container\");\n\t}\n    \nreturn retval; '"
	 * @generated
	 */
	CGateway newCGateway(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates and adds a new instance of Gateway if possible.
	 * @param x The x position of Gateway's graphical representation in the diagram.
	 * @param y The y position of Gateway's graphical representation in the diagram.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes is reached
	 * 
	 * @return New Gateway instance if create and add is possible, null otherwise.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return newCGateway(x, y, -1, -1);'"
	 * @generated
	 */
	CGateway newCGateway(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final CGateway retval = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCGateway();\n   \norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n    \nfinal grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateGatewayFeature(provider);\nfinal org.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) getPictogramElement());\nreturn cf.canCreate(cc);'"
	 * @generated
	 */
	boolean canNewCGateway();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the wrapped Transition for the specified model element
	 * @param me The Transition for which the wrapped instance should be found
	 * 
	 * @return The wrapped Transition
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CTransition retval = (CTransition) this.getMap().get(me);\nif (retval != null && retval.getContainer().equals(this))\n\treturn retval;\nreturn null;'"
	 * @generated
	 */
	CTransition getCTransition(Transition me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the wrapped LabeledTransition for the specified model element
	 * @param me The LabeledTransition for which the wrapped instance should be found
	 * 
	 * @return The wrapped LabeledTransition
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CLabeledTransition retval = (CLabeledTransition) this.getMap().get(me);\nif (retval != null && retval.getContainer().equals(this))\n\treturn retval;\nreturn null;'"
	 * @generated
	 */
	CLabeledTransition getCLabeledTransition(LabeledTransition me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CStart for a Start if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CStart retval = (CStart) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CStart findCStart(Start me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CEnd for a End if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CEnd retval = (CEnd) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CEnd findCEnd(End me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CTerminal for a Terminal if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CTerminal retval = (CTerminal) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CTerminal findCTerminal(Terminal me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CVariable for a Variable if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CVariable retval = (CVariable) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CVariable findCVariable(Variable me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CGateway for a Gateway if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CGateway retval = (CGateway) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CGateway findCGateway(Gateway me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CTransition for a Transition if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CTransition retval = (CTransition) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CTransition findCTransition(Transition me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CLabeledTransition for a LabeledTransition if it is contained somewhere in this graphmodel.
	 * @param me The modelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CLabeledTransition retval = (CLabeledTransition) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CLabeledTransition findCLabeledTransition(LabeledTransition me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this;'"
	 * @generated
	 */
	CMeinEditor getCRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CModelElement for a graphmodel.ModelElement if it is contained somewhere in this graphmodel.
	 * @param me The graphmodel.ModelElement for which the wrapped element is searched
	 * 
	 * @return The wrapped graphmodel.Modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CModelElement retval = (CModelElement) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CModelElement findCModelElement(ModelElement me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CNode for a graphmodel.Node if it is contained somewhere in this graphmodel.
	 * @param me The graphmodel.Node for which the wrapped element is searched
	 * 
	 * @return The wrapped node if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CNode retval = (CNode) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CNode findCNode(Node me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CEdge for a graphmodel.Edge if it is contained somewhere in this graphmodel.
	 * @param me The graphmodel.Edge for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CEdge retval = (CEdge) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CEdge findCEdge(Edge me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Returns the CModelElementContainer for a graphmodel.ModelElementContainer if it is contained somewhere in this graphmodel.
	 * @param me The graphmodel.ModelElementContainer for which the wrapped element is searched
	 * 
	 * @return The wrapped modelelement if it is contained somewhere in the graphmodel.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CModelElementContainer retval = (CModelElementContainer) this.getMap().get(me);\nreturn retval;'"
	 * @generated
	 */
	CModelElementContainer findCModelElementContainer(ModelElementContainer me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, me.getModelElement());\n    if (pes == null || pes.isEmpty())\n    \treturn false;\norg.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));\norg.eclipse.graphiti.features.IDeleteFeature df = provider.getDeleteFeature(dc);\n\n return df.canDelete(dc);\n\n\n'"
	 * @generated
	 */
	boolean canDeleteModelElement(CModelElement me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Deletes the given modelElement from the MeinEditor and the diagram
	 * @param me The modelElement to delete
	 * @return true, if the modelElement was successfully removed, false otherwise
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, me.getModelElement());\n    if (pes == null || pes.isEmpty())\n    \treturn false;\norg.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));\nde.jabc.cinco.meta.core.ui.features.CincoDeleteFeature df = (de.jabc.cinco.meta.core.ui.features.CincoDeleteFeature) provider.getDeleteFeature(dc);\n\nif (this.getMap().get(me.getModelElement()) != null) {\n\tthis.getMap().remove(me.getModelElement());\n}\n\nif ( this.getCRootElement().getMap().get(me.getModelElement()) != null) {\n\tthis.getCRootElement().getMap().remove(me.getModelElement());\n}\n\nif (df.canDelete(dc, true)) {\n\tdf.delete(dc);\n\treturn true;\n}\nreturn false;\n'"
	 * @generated
	 */
	boolean deleteModelElement(CModelElement me);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = new java.util.ArrayList<org.eclipse.graphiti.mm.pictograms.PictogramElement>();\nfor (graphicalgraphmodel.CModelElement cme : elements) {\n\tpes.add(cme.getPictogramElement());\n}\norg.eclipse.graphiti.platform.IDiagramBehavior diagramBehavior = grafikeditor.graphiti.MeinEditorGraphitiUtils.getInstance().getDTP().getDiagramBehavior();\nif (diagramBehavior instanceof org.eclipse.graphiti.ui.editor.DiagramBehavior) {\n\torg.eclipse.graphiti.ui.editor.DiagramBehavior db = (org.eclipse.graphiti.ui.editor.DiagramBehavior) diagramBehavior;\n\torg.eclipse.graphiti.mm.pictograms.PictogramElement[] selected = diagramBehavior.getDiagramContainer().getSelectedPictogramElements();\n\torg.eclipse.graphiti.mm.pictograms.PictogramElement[] select = pes.toArray(new org.eclipse.graphiti.mm.pictograms.PictogramElement[pes.size()]);\n\tjava.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> lastSelected = new java.util.HashSet<org.eclipse.graphiti.mm.pictograms.PictogramElement>();\n\tjava.util.Set<org.eclipse.graphiti.mm.pictograms.PictogramElement> toSelect = new java.util.HashSet<org.eclipse.graphiti.mm.pictograms.PictogramElement>();\n\tlastSelected.addAll(java.util.Arrays.asList(selected));\n\ttoSelect.addAll(java.util.Arrays.asList(select));\n\tfor (org.eclipse.graphiti.mm.pictograms.PictogramElement pe : select) {\n\t\tif (!lastSelected.contains(pe)) {\n\t\t\tdiagramBehavior.getDiagramContainer().selectPictogramElements(select);\n\t\t\tbreak;\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	void highlight(EList<CModelElement> elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='CMeinEditor retval = this;\nreturn retval;'"
	 * @generated
	 */
	CMeinEditor getCMeinEditor(LabeledTransition me);

} // CMeinEditor
