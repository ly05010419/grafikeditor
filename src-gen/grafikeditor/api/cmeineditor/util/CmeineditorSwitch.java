/**
 */
package grafikeditor.api.cmeineditor.util;

import grafikeditor.api.cmeineditor.*;

import graphicalgraphmodel.CEdge;
import graphicalgraphmodel.CGraphModel;
import graphicalgraphmodel.CModelElement;
import graphicalgraphmodel.CModelElementContainer;
import graphicalgraphmodel.CNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage
 * @generated
 */
public class CmeineditorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmeineditorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmeineditorSwitch() {
		if (modelPackage == null) {
			modelPackage = CmeineditorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CmeineditorPackage.CMEIN_EDITOR: {
				CMeinEditor cMeinEditor = (CMeinEditor)theEObject;
				T result = caseCMeinEditor(cMeinEditor);
				if (result == null) result = caseCGraphModel(cMeinEditor);
				if (result == null) result = caseCModelElementContainer(cMeinEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CSTART: {
				CStart cStart = (CStart)theEObject;
				T result = caseCStart(cStart);
				if (result == null) result = caseCNode(cStart);
				if (result == null) result = caseCModelElement(cStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CEND: {
				CEnd cEnd = (CEnd)theEObject;
				T result = caseCEnd(cEnd);
				if (result == null) result = caseCNode(cEnd);
				if (result == null) result = caseCModelElement(cEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CTERMINAL: {
				CTerminal cTerminal = (CTerminal)theEObject;
				T result = caseCTerminal(cTerminal);
				if (result == null) result = caseCNode(cTerminal);
				if (result == null) result = caseCModelElement(cTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CVARIABLE: {
				CVariable cVariable = (CVariable)theEObject;
				T result = caseCVariable(cVariable);
				if (result == null) result = caseCNode(cVariable);
				if (result == null) result = caseCModelElement(cVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CGATEWAY: {
				CGateway cGateway = (CGateway)theEObject;
				T result = caseCGateway(cGateway);
				if (result == null) result = caseCNode(cGateway);
				if (result == null) result = caseCModelElement(cGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CTRANSITION: {
				CTransition cTransition = (CTransition)theEObject;
				T result = caseCTransition(cTransition);
				if (result == null) result = caseCEdge(cTransition);
				if (result == null) result = caseCModelElement(cTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmeineditorPackage.CLABELED_TRANSITION: {
				CLabeledTransition cLabeledTransition = (CLabeledTransition)theEObject;
				T result = caseCLabeledTransition(cLabeledTransition);
				if (result == null) result = caseCEdge(cLabeledTransition);
				if (result == null) result = caseCModelElement(cLabeledTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMein Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMein Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMeinEditor(CMeinEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CStart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CStart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCStart(CStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEnd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEnd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEnd(CEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTerminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTerminal(CTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVariable(CVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CGateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CGateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCGateway(CGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTransition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTransition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTransition(CTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLabeled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLabeled Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLabeledTransition(CLabeledTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CModel Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CModel Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCModelElementContainer(CModelElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CGraph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CGraph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCGraphModel(CGraphModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCModelElement(CModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CNode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CNode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCNode(CNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEdge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEdge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEdge(CEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CmeineditorSwitch
