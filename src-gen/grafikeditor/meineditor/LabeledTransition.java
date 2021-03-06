/**
 */
package grafikeditor.meineditor;

import graphmodel.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafikeditor.meineditor.LabeledTransition#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafikeditor.meineditor.MeineditorPackage#getLabeledTransition()
 * @model
 * @generated
 */
public interface LabeledTransition extends Edge {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see grafikeditor.meineditor.MeineditorPackage#getLabeledTransition_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link grafikeditor.meineditor.LabeledTransition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // LabeledTransition
