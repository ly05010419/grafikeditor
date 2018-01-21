/**
 */
package grafikeditor.meineditor;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.Node;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafikeditor.meineditor.Start#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafikeditor.meineditor.MeineditorPackage#getStart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkOutgoingStartLabeledTransition0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL checkOutgoingStartLabeledTransition0='(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())=1'"
 * @generated
 */
public interface Start extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see grafikeditor.meineditor.MeineditorPackage#getStart_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grafikeditor.meineditor.Start#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ConnectionConstraint outgoingConstraint0 = new ConnectionConstraint(true,1,1,grafikeditor.meineditor.LabeledTransition.class);\n\nreturn new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>(java.util.Arrays.asList(outgoingConstraint0));\n'"
	 * @generated
	 */
	EList<ConnectionConstraint> getOutgoingConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getSuccessors(grafikeditor.meineditor.End.class);'"
	 * @generated
	 */
	EList<End> getEndSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getSuccessors(grafikeditor.meineditor.Terminal.class);'"
	 * @generated
	 */
	EList<Terminal> getTerminalSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getSuccessors(grafikeditor.meineditor.Variable.class);'"
	 * @generated
	 */
	EList<Variable> getVariableSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getSuccessors(grafikeditor.meineditor.Gateway.class);'"
	 * @generated
	 */
	EList<Gateway> getGatewaySuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getSuccessors(Node.class);'"
	 * @generated
	 */
	EList<Node> getSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (grafikeditor.meineditor.MeinEditor)super.getRootElement();'"
	 * @generated
	 */
	MeinEditor getRootElement();

} // Start
