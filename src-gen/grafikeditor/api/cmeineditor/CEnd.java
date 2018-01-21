/**
 */
package grafikeditor.api.cmeineditor;

import graphicalgraphmodel.CNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEnd</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage#getCEnd()
 * @model
 * @generated
 */
public interface CEnd extends CNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider(\"grafikeditor.MeinEditorDiagramTypeProvider\");\ngrafikeditor.graphiti.MeinEditorFeatureProvider fp = (grafikeditor.graphiti.MeinEditorFeatureProvider) dtp.getFeatureProvider();\n\norg.eclipse.graphiti.features.context.impl.UpdateContext uc = new org.eclipse.graphiti.features.context.impl.UpdateContext(getPictogramElement());\norg.eclipse.graphiti.features.IUpdateFeature uf = fp.getUpdateFeature(uc);\nif (uf.canUpdate(uc))\n\tuf.update(uc);'"
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(CStart.class);'"
	 * @generated
	 */
	EList<CStart> getStartPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(CGateway.class);'"
	 * @generated
	 */
	EList<CGateway> getGatewayPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(CTerminal.class);'"
	 * @generated
	 */
	EList<CTerminal> getTerminalPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(CVariable.class);'"
	 * @generated
	 */
	EList<CVariable> getVariablePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (CMeinEditor)super.getCRootElement();'"
	 * @generated
	 */
	CMeinEditor getCRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Deletes this modelElement.
	 * 
	 * @return true, if the modelElement was successfully removed, false otherwise
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());\n    if (pes == null || pes.isEmpty())\n    \treturn false;\nfinal org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));\nfinal grafikeditor.graphiti.features.delete.DeleteEndFeature df = (grafikeditor.graphiti.features.delete.DeleteEndFeature) provider.getDeleteFeature(dc);\n\nif (this.getContainer().getMap().get(this.getModelElement()) != null) {\n\tthis.getContainer().getMap().remove(this.getModelElement());\n}\n\nif ( this.getCRootElement().getMap().get(this.getModelElement()) != null) {\n\tthis.getCRootElement().getMap().remove(this.getModelElement());\n}\n\nif (df.canDelete(dc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n      \tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t@Override\n\tprotected void doExecute() {\n\t\tdf.delete(dc);\n\t}\n\t});\n\t\n\treturn true;\n}\nreturn false;\n'"
	 * @generated
	 */
	boolean delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());\n    if (pes == null || pes.isEmpty())\n    \treturn false;\nfinal org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));\nfinal org.eclipse.graphiti.features.IDeleteFeature df = provider.getDeleteFeature(dc);\nreturn df.canDelete(dc);\n'"
	 * @generated
	 */
	boolean canDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\norg.eclipse.graphiti.platform.IDiagramBehavior idb = grafikeditor.graphiti.MeinEditorGraphitiUtils.getInstance().getDTP().getDiagramBehavior();\nif (idb instanceof org.eclipse.graphiti.ui.editor.DiagramBehavior) {\n\torg.eclipse.graphiti.ui.editor.DiagramBehavior db = (org.eclipse.graphiti.ui.editor.DiagramBehavior) idb;\n\tdb.setPictogramElementForSelection(getPictogramElement());\n\tdb.selectBufferedPictogramElements();\n}'"
	 * @generated
	 */
	void highlight();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Moves this node to the specified container. The node is placed at (x,y). ATTENTION: Each container element has an own coordinate system!
	 * @param container The target container
	 * @param x The new x position
	 * @param y The new y position
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException if the maximum number of contained nodes in the target container is reached
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());\nif (pes != null && !pes.isEmpty()) {\nfinal org.eclipse.graphiti.features.context.impl.MoveShapeContext mc = new org.eclipse.graphiti.features.context.impl.MoveShapeContext((org.eclipse.graphiti.mm.pictograms.Shape)pes.get(0));\n\tmc.setLocation(x, y);\n\tif (this.getContainer() instanceof graphicalgraphmodel.CGraphModel)\n\t\tmc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CGraphModel) this.getContainer()).getPictogramElement());\n\tif (this.getContainer() instanceof graphicalgraphmodel.CContainer)\n\t\tmc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CContainer) this.getContainer()).getPictogramElement());\n\tmc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) container.getPictogramElement());\n\n\tfinal grafikeditor.graphiti.features.move.MoveEndFeature mf = (grafikeditor.graphiti.features.move.MoveEndFeature) provider.getMoveShapeFeature(mc);\n\n\tif (mf.canMoveShape(mc, true)) {\n\t\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(container.getModelElement().eResource().getResourceSet());\n\t      \tif (dom == null)\n\t\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(container.getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t\t@Override\n\t\t\tprotected void doExecute() {\n\t\t\t\tmf.moveShape(mc);\n\t\t\t}\n\t\t});\n\t} else {\n\t\tif (mf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + container.getModelElement() +\"\' exceeded. Can not move End in the specified container\");\n\t}\n}\n'"
	 * @generated
	 */
	void moveTo(CMeinEditor container, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());\nif (pes != null && !pes.isEmpty()) {\n\tfinal org.eclipse.graphiti.features.context.impl.MoveShapeContext mc = new org.eclipse.graphiti.features.context.impl.MoveShapeContext((org.eclipse.graphiti.mm.pictograms.Shape)pes.get(0));\n\tif (this.getContainer() instanceof graphicalgraphmodel.CGraphModel)\n\t\tmc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CGraphModel) this.getContainer()).getPictogramElement());\n\tif (this.getContainer() instanceof graphicalgraphmodel.CContainer)\n\t\tmc.setSourceContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) ((graphicalgraphmodel.CContainer) this.getContainer()).getPictogramElement());\n\tmc.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) container.getPictogramElement());\n\tfinal grafikeditor.graphiti.features.move.MoveEndFeature mf = (grafikeditor.graphiti.features.move.MoveEndFeature) provider.getMoveShapeFeature(mc);\n\n\treturn mf.canMoveShape(mc);\n}\nreturn false;'"
	 * @generated
	 */
	boolean canMoveTo(CMeinEditor container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='final CEnd clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();\norg.eclipse.graphiti.mm.pictograms.PictogramElement copy = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.flatCopy(getPictogramElement());\nclone.setPictogramElement(copy);\nclone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));\n\norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) target.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\t    \nfinal org.eclipse.graphiti.features.context.impl.AddContext ac = new org.eclipse.graphiti.features.context.impl.AddContext();\nac.setNewObject(clone.getModelElement());\nac.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) target.getPictogramElement());\n\ngrafikeditor.graphiti.features.create.nodes.CreateEndFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateEndFeature(provider);\norg.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer(target.getPictogramElement());\n\nfinal grafikeditor.graphiti.features.add.AddEndFeature af = (grafikeditor.graphiti.features.add.AddEndFeature) provider.getAddFeature(ac);\n\nreturn cf.canCreate(cc);'"
	 * @generated
	 */
	boolean canClone(CMeinEditor target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates an clone (persisting the modelElement's id) of this modelElement
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='final CEnd clone = grafikeditor.api.cmeineditor.CmeineditorFactory.eINSTANCE.createCEnd();\norg.eclipse.graphiti.mm.pictograms.PictogramElement copy = de.jabc.cinco.meta.core.ui.utils.CincoCopyUtils.flatCopy(getPictogramElement());\nclone.setPictogramElement(copy);\nclone.setModelElement((graphmodel.ModelElement) copy.getLink().getBusinessObjects().get(0));\n\norg.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) target.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\t    \nfinal org.eclipse.graphiti.features.context.impl.AddContext ac = new org.eclipse.graphiti.features.context.impl.AddContext();\nac.setNewObject(clone.getModelElement());\nac.setLocation(clone.getX(), clone.getY());\nac.setWidth(clone.getWidth());\nac.setHeight(clone.getHeight());\nac.setTargetContainer((org.eclipse.graphiti.mm.pictograms.ContainerShape) target.getPictogramElement());\n\ngrafikeditor.graphiti.features.create.nodes.CreateEndFeature cf = new grafikeditor.graphiti.features.create.nodes.CreateEndFeature(provider);\norg.eclipse.graphiti.features.context.impl.CreateContext cc = new org.eclipse.graphiti.features.context.impl.CreateContext();\ncc.setTargetContainer(target.getPictogramElement());\n\nfinal grafikeditor.graphiti.features.add.AddEndFeature af = (grafikeditor.graphiti.features.add.AddEndFeature) provider.getAddFeature(ac);\nif (af != null && af.canAdd(ac) && cf.canCreate(cc)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(target.getModelElement().eResource().getResourceSet());\n      \tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(target.getModelElement().eResource().getResourceSet());\n\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t@Override\n\tprotected void doExecute() {\n\t\tclone.setPictogramElement(af.add(ac));\n\t\tclone.setContainer(target);\n\t\ttarget.getCRootElement().getMap().put(clone.getModelElement(), clone);\n\t\ttarget.getCRootElement().getModelElement().getModelElements().add(clone.getModelElement());\n\t\ttarget.getMap().put(clone.getModelElement(), clone);\n\t}\n\t});\n}  else {\n\tif (cf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_CARDINALITY))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Cardinality of \'\" + target.getModelElement()+\"\' exceeded. Can not create \'\" + this.getModelElement()+\"\'\' in the specified container\");\n}\n\nreturn clone;'"
	 * @generated
	 */
	CEnd clone(CMeinEditor target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Creates an clone (persisting the modelElement's id) of this modelElement
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) getCRootElement().getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\nfinal org.eclipse.graphiti.features.context.impl.ResizeShapeContext rc = new org.eclipse.graphiti.features.context.impl.ResizeShapeContext((org.eclipse.graphiti.mm.pictograms.Shape) getPictogramElement());\nrc.setSize(width, height);\nrc.setX(getX());\nrc.setY(getY());\nfinal grafikeditor.graphiti.features.resize.ResizeEndFeature rf = (grafikeditor.graphiti.features.resize.ResizeEndFeature) provider.getResizeShapeFeature((org.eclipse.graphiti.features.context.impl.ResizeShapeContext) rc);\nif (rf != null && rf.canResizeShape((org.eclipse.graphiti.features.context.impl.ResizeShapeContext) rc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n      \tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t@Override\n\tprotected void doExecute() {\n\t\trf.resizeShape((org.eclipse.graphiti.features.context.impl.ResizeShapeContext) rc);\n\t}\n\t});\n}'"
	 * @generated
	 */
	void resize(int width, int height);

} // CEnd
