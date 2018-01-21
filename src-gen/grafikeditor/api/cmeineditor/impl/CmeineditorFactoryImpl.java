/**
 */
package grafikeditor.api.cmeineditor.impl;

import grafikeditor.api.cmeineditor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmeineditorFactoryImpl extends EFactoryImpl implements CmeineditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmeineditorFactory init() {
		try {
			CmeineditorFactory theCmeineditorFactory = (CmeineditorFactory)EPackage.Registry.INSTANCE.getEFactory(CmeineditorPackage.eNS_URI);
			if (theCmeineditorFactory != null) {
				return theCmeineditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CmeineditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmeineditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CmeineditorPackage.CMEIN_EDITOR: return createCMeinEditor();
			case CmeineditorPackage.CSTART: return createCStart();
			case CmeineditorPackage.CEND: return createCEnd();
			case CmeineditorPackage.CTERMINAL: return createCTerminal();
			case CmeineditorPackage.CVARIABLE: return createCVariable();
			case CmeineditorPackage.CGATEWAY: return createCGateway();
			case CmeineditorPackage.CTRANSITION: return createCTransition();
			case CmeineditorPackage.CLABELED_TRANSITION: return createCLabeledTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMeinEditor createCMeinEditor() {
		CMeinEditorImpl cMeinEditor = new CMeinEditorImpl();
		return cMeinEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStart createCStart() {
		CStartImpl cStart = new CStartImpl();
		return cStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnd createCEnd() {
		CEndImpl cEnd = new CEndImpl();
		return cEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTerminal createCTerminal() {
		CTerminalImpl cTerminal = new CTerminalImpl();
		return cTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVariable createCVariable() {
		CVariableImpl cVariable = new CVariableImpl();
		return cVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGateway createCGateway() {
		CGatewayImpl cGateway = new CGatewayImpl();
		return cGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTransition createCTransition() {
		CTransitionImpl cTransition = new CTransitionImpl();
		return cTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLabeledTransition createCLabeledTransition() {
		CLabeledTransitionImpl cLabeledTransition = new CLabeledTransitionImpl();
		return cLabeledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmeineditorPackage getCmeineditorPackage() {
		return (CmeineditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CmeineditorPackage getPackage() {
		return CmeineditorPackage.eINSTANCE;
	}

} //CmeineditorFactoryImpl
