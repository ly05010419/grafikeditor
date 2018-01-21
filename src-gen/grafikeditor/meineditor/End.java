/**
 */
package grafikeditor.meineditor;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.Node;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see grafikeditor.meineditor.MeineditorPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ConnectionConstraint incomingConstraint0 = new ConnectionConstraint(false,1,-1,grafikeditor.meineditor.Transition.class,grafikeditor.meineditor.LabeledTransition.class);\n\nreturn new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>(java.util.Arrays.asList(incomingConstraint0));\n'"
	 * @generated
	 */
	EList<ConnectionConstraint> getIncomingConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(grafikeditor.meineditor.Start.class);'"
	 * @generated
	 */
	EList<Start> getStartPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(grafikeditor.meineditor.Terminal.class);'"
	 * @generated
	 */
	EList<Terminal> getTerminalPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(grafikeditor.meineditor.Gateway.class);'"
	 * @generated
	 */
	EList<Gateway> getGatewayPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(grafikeditor.meineditor.Variable.class);'"
	 * @generated
	 */
	EList<Variable> getVariablePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\nreturn getPredecessors(Node.class);'"
	 * @generated
	 */
	EList<Node> getPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (grafikeditor.meineditor.MeinEditor)super.getRootElement();'"
	 * @generated
	 */
	MeinEditor getRootElement();

} // End
