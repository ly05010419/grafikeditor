/**
 */
package grafikeditor.meineditor.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import grafikeditor.meineditor.End;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.LabeledTransition;
import grafikeditor.meineditor.MeinEditor;
import grafikeditor.meineditor.MeineditorPackage;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Transition;
import grafikeditor.meineditor.Variable;

import graphmodel.Node;

import graphmodel.impl.ModelElementContainerImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mein Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grafikeditor.meineditor.impl.MeinEditorImpl#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeinEditorImpl extends ModelElementContainerImpl implements MeinEditor {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeinEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeineditorPackage.Literals.MEIN_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeineditorPackage.MEIN_EDITOR__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		return getModelElements(Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabeledTransition> getLabeledTransitions() {
		return getModelElements(LabeledTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Start> getStarts() {
		return this.getModelElements(grafikeditor.meineditor.Start.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<End> getEnds() {
		return this.getModelElements(grafikeditor.meineditor.End.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		return this.getModelElements(grafikeditor.meineditor.Terminal.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		return this.getModelElements(grafikeditor.meineditor.Variable.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gateway> getGateways() {
		return this.getModelElements(grafikeditor.meineditor.Gateway.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainmentConstraint> getContainmentConstraints() {
		@SuppressWarnings("unchecked")
		de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint constraint0 = 
		    new de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint(0,-1,grafikeditor.meineditor.Start.class,grafikeditor.meineditor.End.class,grafikeditor.meineditor.Terminal.class,grafikeditor.meineditor.Variable.class,grafikeditor.meineditor.Gateway.class);
		
		        org.eclipse.emf.common.util.BasicEList<de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint>constraints = 
		            new org.eclipse.emf.common.util.BasicEList<de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint>(java.util.Arrays.asList(constraint0)); 
		        constraints.addAll(super.getContainmentConstraints());
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Class<? extends Node>> getAllNodeTypes() {
		
		return new org.eclipse.emf.common.util.BasicEList<Class<? extends Node>>(java.util.Arrays.asList(grafikeditor.meineditor.Start.class,grafikeditor.meineditor.End.class,grafikeditor.meineditor.Terminal.class,grafikeditor.meineditor.Variable.class,grafikeditor.meineditor.Gateway.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeineditorPackage.MEIN_EDITOR__MODEL_NAME:
				return getModelName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeineditorPackage.MEIN_EDITOR__MODEL_NAME:
				setModelName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MeineditorPackage.MEIN_EDITOR__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MeineditorPackage.MEIN_EDITOR__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //MeinEditorImpl
