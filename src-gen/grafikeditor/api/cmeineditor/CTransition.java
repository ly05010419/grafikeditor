/**
 */
package grafikeditor.api.cmeineditor;

import graphicalgraphmodel.CEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTransition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage#getCTransition()
 * @model
 * @generated
 */
public interface CTransition extends CEdge {
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nreturn rf.canReconnect(rc);'"
	 * @generated
	 */
	boolean canReconnectTarget(CEnd target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Reconnects the edge's target.
	 * @param node The new target node of this edge.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoEdgeCardinalityInException if the maximum number of incoming edges for the target node is reached
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nif (rf.canReconnect(rc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t\t@Override\n\t\t\tprotected void doExecute() {\n\t\t\t\trf.reconnect(rc);\n\t\t\t}\n\t\t});\n\tthis.setTargetElement(target);\n} else {\n\tif (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Incoming edge cardinality of \'\" + target.getModelElement()+\"\' exceeded. \\nCan not reconnect \'\" + this.getModelElement()+\"\'\' target from \\n\'\" +getSourceElement().getModelElement()+\"\' to \\n\'\"+target.getModelElement()+\"\'\");\n}\n'"
	 * @generated
	 */
	void reconnectTarget(CEnd target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nreturn rf.canReconnect(rc);'"
	 * @generated
	 */
	boolean canReconnectTarget(CTerminal target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Reconnects the edge's target.
	 * @param node The new target node of this edge.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoEdgeCardinalityInException if the maximum number of incoming edges for the target node is reached
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nif (rf.canReconnect(rc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t\t@Override\n\t\t\tprotected void doExecute() {\n\t\t\t\trf.reconnect(rc);\n\t\t\t}\n\t\t});\n\tthis.setTargetElement(target);\n} else {\n\tif (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Incoming edge cardinality of \'\" + target.getModelElement()+\"\' exceeded. \\nCan not reconnect \'\" + this.getModelElement()+\"\'\' target from \\n\'\" +getSourceElement().getModelElement()+\"\' to \\n\'\"+target.getModelElement()+\"\'\");\n}\n'"
	 * @generated
	 */
	void reconnectTarget(CTerminal target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nreturn rf.canReconnect(rc);'"
	 * @generated
	 */
	boolean canReconnectTarget(CVariable target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Reconnects the edge's target.
	 * @param node The new target node of this edge.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoEdgeCardinalityInException if the maximum number of incoming edges for the target node is reached
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nif (rf.canReconnect(rc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t\t@Override\n\t\t\tprotected void doExecute() {\n\t\t\t\trf.reconnect(rc);\n\t\t\t}\n\t\t});\n\tthis.setTargetElement(target);\n} else {\n\tif (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Incoming edge cardinality of \'\" + target.getModelElement()+\"\' exceeded. \\nCan not reconnect \'\" + this.getModelElement()+\"\'\' target from \\n\'\" +getSourceElement().getModelElement()+\"\' to \\n\'\"+target.getModelElement()+\"\'\");\n}\n'"
	 * @generated
	 */
	void reconnectTarget(CVariable target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nreturn rf.canReconnect(rc);'"
	 * @generated
	 */
	boolean canReconnectTarget(CGateway target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Reconnects the edge's target.
	 * @param node The new target node of this edge.
	 * 
	 * @exception de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoEdgeCardinalityInException if the maximum number of incoming edges for the target node is reached
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\norg.eclipse.graphiti.mm.pictograms.Anchor oldAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) getTargetElement().getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.mm.pictograms.Anchor newAnchor = ((org.eclipse.graphiti.mm.pictograms.Shape) target.getPictogramElement()).getAnchors().get(0);\norg.eclipse.graphiti.datatypes.ILocation targetLocation = org.eclipse.graphiti.ui.services.GraphitiUi.getPeService().getLocationRelativeToDiagram(newAnchor);\n\nfinal org.eclipse.graphiti.features.context.impl.ReconnectionContext rc = new org.eclipse.graphiti.features.context.impl.ReconnectionContext((org.eclipse.graphiti.mm.pictograms.Connection) getPictogramElement(), oldAnchor, newAnchor, targetLocation);\nrc.setReconnectType(org.eclipse.graphiti.features.context.impl.ReconnectionContext.RECONNECT_TARGET);\nfinal grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature rf = (grafikeditor.graphiti.features.reconnect.ReconnectTransitionFeature)provider.getReconnectionFeature(rc);\n\nif (rf.canReconnect(rc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n\tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\t\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t\t\t@Override\n\t\t\tprotected void doExecute() {\n\t\t\t\trf.reconnect(rc);\n\t\t\t}\n\t\t});\n\tthis.setTargetElement(target);\n} else {\n\tif (rf.getError().equals(de.jabc.cinco.meta.core.ge.style.model.errorhandling.ECincoError.MAX_IN))\n\t\t\tthrow new de.jabc.cinco.meta.core.ge.style.model.errorhandling.CincoContainerCardinalityException(\"Incoming edge cardinality of \'\" + target.getModelElement()+\"\' exceeded. \\nCan not reconnect \'\" + this.getModelElement()+\"\'\' target from \\n\'\" +getSourceElement().getModelElement()+\"\' to \\n\'\"+target.getModelElement()+\"\'\");\n}\n'"
	 * @generated
	 */
	void reconnectTarget(CGateway target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.algorithms.styles.Point p = org.eclipse.graphiti.services.Graphiti.getGaService().createPoint(x,y);\n((org.eclipse.graphiti.mm.pictograms.FreeFormConnection) getPictogramElement()).getBendpoints().add(p);\n\n'"
	 * @generated
	 */
	void addBendpoint(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b><em>Cinco API</em></b></p>
	 * Deletes this modelElement.
	 * 
	 * @return true, if the modelElement was successfully removed, false otherwise
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.graphiti.mm.pictograms.Diagram d = (org.eclipse.graphiti.mm.pictograms.Diagram) this.getDiagram();\ngrafikeditor.graphiti.MeinEditorFeatureProvider provider = (grafikeditor.graphiti.MeinEditorFeatureProvider) org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(d);\n\njava.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.ui.services.GraphitiUi.getLinkService().getPictogramElements(d, this.getModelElement());\n    if (pes == null || pes.isEmpty())\n    \treturn false;\nfinal org.eclipse.graphiti.features.context.impl.DeleteContext dc = new org.eclipse.graphiti.features.context.impl.DeleteContext(pes.get(0));\nfinal grafikeditor.graphiti.features.delete.DeleteTransitionFeature df = (grafikeditor.graphiti.features.delete.DeleteTransitionFeature) provider.getDeleteFeature(dc);\n\nif (this.getContainer().getMap().get(this.getModelElement()) != null) {\n\tthis.getContainer().getMap().remove(this.getModelElement());\n}\n\nif ( this.getCRootElement().getMap().get(this.getModelElement()) != null) {\n\tthis.getCRootElement().getMap().remove(this.getModelElement());\n}\n\nif (df.canDelete(dc, true)) {\n\torg.eclipse.emf.transaction.TransactionalEditingDomain dom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(getModelElement().eResource().getResourceSet());\n      \tif (dom == null)\n\t\tdom = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(getModelElement().eResource().getResourceSet());\n\tdom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(dom) {\n        \n\t@Override\n\tprotected void doExecute() {\n\t\tdf.delete(dc);\n\t}\n\t});\n\t\n\treturn true;\n}\nreturn false;\n'"
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

} // CTransition
