/**
 */
package grafikeditor.api.cmeineditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage
 * @generated
 */
public interface CmeineditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmeineditorFactory eINSTANCE = grafikeditor.api.cmeineditor.impl.CmeineditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CMein Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMein Editor</em>'.
	 * @generated
	 */
	CMeinEditor createCMeinEditor();

	/**
	 * Returns a new object of class '<em>CStart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CStart</em>'.
	 * @generated
	 */
	CStart createCStart();

	/**
	 * Returns a new object of class '<em>CEnd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEnd</em>'.
	 * @generated
	 */
	CEnd createCEnd();

	/**
	 * Returns a new object of class '<em>CTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTerminal</em>'.
	 * @generated
	 */
	CTerminal createCTerminal();

	/**
	 * Returns a new object of class '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVariable</em>'.
	 * @generated
	 */
	CVariable createCVariable();

	/**
	 * Returns a new object of class '<em>CGateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CGateway</em>'.
	 * @generated
	 */
	CGateway createCGateway();

	/**
	 * Returns a new object of class '<em>CTransition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTransition</em>'.
	 * @generated
	 */
	CTransition createCTransition();

	/**
	 * Returns a new object of class '<em>CLabeled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CLabeled Transition</em>'.
	 * @generated
	 */
	CLabeledTransition createCLabeledTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CmeineditorPackage getCmeineditorPackage();

} //CmeineditorFactory
