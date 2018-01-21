/**
 */
package grafikeditor.meineditor;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.GraphModel;
import graphmodel.Node;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mein Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafikeditor.meineditor.MeinEditor#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafikeditor.meineditor.MeineditorPackage#getMeinEditor()
 * @model
 * @generated
 */
public interface MeinEditor extends GraphModel {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see grafikeditor.meineditor.MeineditorPackage#getMeinEditor_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link grafikeditor.meineditor.MeinEditor#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getModelElements(Transition.class);'"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getModelElements(LabeledTransition.class);'"
	 * @generated
	 */
	EList<LabeledTransition> getLabeledTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getModelElements(grafikeditor.meineditor.Start.class);'"
	 * @generated
	 */
	EList<Start> getStarts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getModelElements(grafikeditor.meineditor.End.class);'"
	 * @generated
	 */
	EList<End> getEnds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getModelElements(grafikeditor.meineditor.Terminal.class);'"
	 * @generated
	 */
	EList<Terminal> getTerminals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getModelElements(grafikeditor.meineditor.Variable.class);'"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getModelElements(grafikeditor.meineditor.Gateway.class);'"
	 * @generated
	 */
	EList<Gateway> getGateways();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='@SuppressWarnings(\"unchecked\")\nde.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint constraint0 = \n    new de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint(0,-1,grafikeditor.meineditor.Start.class,grafikeditor.meineditor.End.class,grafikeditor.meineditor.Terminal.class,grafikeditor.meineditor.Variable.class,grafikeditor.meineditor.Gateway.class);\n\n        org.eclipse.emf.common.util.BasicEList<de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint>constraints = \n            new org.eclipse.emf.common.util.BasicEList<de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint>(java.util.Arrays.asList(constraint0)); \n        constraints.addAll(super.getContainmentConstraints());\nreturn constraints;'"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nreturn new org.eclipse.emf.common.util.BasicEList<Class<? extends Node>>(java.util.Arrays.asList(grafikeditor.meineditor.Start.class,grafikeditor.meineditor.End.class,grafikeditor.meineditor.Terminal.class,grafikeditor.meineditor.Variable.class,grafikeditor.meineditor.Gateway.class));'"
	 * @generated
	 */
	EList<Class<? extends Node>> getAllNodeTypes();

} // MeinEditor
