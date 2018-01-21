/**
 */
package grafikeditor.api.cmeineditor.util;

import grafikeditor.api.cmeineditor.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage
 * @generated
 */
public class CmeineditorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CmeineditorValidator INSTANCE = new CmeineditorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "grafikeditor.api.cmeineditor";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmeineditorValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CmeineditorPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CmeineditorPackage.CMEIN_EDITOR:
				return validateCMeinEditor((CMeinEditor)value, diagnostics, context);
			case CmeineditorPackage.CSTART:
				return validateCStart((CStart)value, diagnostics, context);
			case CmeineditorPackage.CEND:
				return validateCEnd((CEnd)value, diagnostics, context);
			case CmeineditorPackage.CTERMINAL:
				return validateCTerminal((CTerminal)value, diagnostics, context);
			case CmeineditorPackage.CVARIABLE:
				return validateCVariable((CVariable)value, diagnostics, context);
			case CmeineditorPackage.CGATEWAY:
				return validateCGateway((CGateway)value, diagnostics, context);
			case CmeineditorPackage.CTRANSITION:
				return validateCTransition((CTransition)value, diagnostics, context);
			case CmeineditorPackage.CLABELED_TRANSITION:
				return validateCLabeledTransition((CLabeledTransition)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMeinEditor(CMeinEditor cMeinEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cMeinEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCStart(CStart cStart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cStart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cStart, diagnostics, context);
		if (result || diagnostics != null) result &= validateCStart_checkOutgoingStartLabeledTransition0(cStart, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingStartLabeledTransition0 constraint of '<em>CStart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CSTART__CHECK_OUTGOING_START_LABELED_TRANSITION0__EEXPRESSION = "self.outgoing->select(elem: elem.oclIsTypeOf())->size()==1";

	/**
	 * Validates the checkOutgoingStartLabeledTransition0 constraint of '<em>CStart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCStart_checkOutgoingStartLabeledTransition0(CStart cStart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CSTART,
				 cStart,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingStartLabeledTransition0",
				 CSTART__CHECK_OUTGOING_START_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCEnd(CEnd cEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTerminal(CTerminal cTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cTerminal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateCTerminal_checkOutgoingTerminalLabeledTransition0(cTerminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateCTerminal_checkIncomingTerminalLabeledTransitionTransition0(cTerminal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingTerminalLabeledTransition0 constraint of '<em>CTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CTERMINAL__CHECK_OUTGOING_TERMINAL_LABELED_TRANSITION0__EEXPRESSION = "self.outgoingElements->select(elem: elem.oclIsTypeOf())->size()>=1";

	/**
	 * Validates the checkOutgoingTerminalLabeledTransition0 constraint of '<em>CTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTerminal_checkOutgoingTerminalLabeledTransition0(CTerminal cTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CTERMINAL,
				 cTerminal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingTerminalLabeledTransition0",
				 CTERMINAL__CHECK_OUTGOING_TERMINAL_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkIncomingTerminalLabeledTransitionTransition0 constraint of '<em>CTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CTERMINAL__CHECK_INCOMING_TERMINAL_LABELED_TRANSITION_TRANSITION0__EEXPRESSION = "self.incoming->select(elem: elem.oclIsTypeOf())->size()>=1";

	/**
	 * Validates the checkIncomingTerminalLabeledTransitionTransition0 constraint of '<em>CTerminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTerminal_checkIncomingTerminalLabeledTransitionTransition0(CTerminal cTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CTERMINAL,
				 cTerminal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkIncomingTerminalLabeledTransitionTransition0",
				 CTERMINAL__CHECK_INCOMING_TERMINAL_LABELED_TRANSITION_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCVariable(CVariable cVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateCVariable_checkOutgoingVariableLabeledTransition0(cVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateCVariable_checkIncomingVariableLabeledTransitionTransition0(cVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingVariableLabeledTransition0 constraint of '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CVARIABLE__CHECK_OUTGOING_VARIABLE_LABELED_TRANSITION0__EEXPRESSION = "self.outgoingElements->select(elem: elem.oclIsTypeOf())->size()>=1";

	/**
	 * Validates the checkOutgoingVariableLabeledTransition0 constraint of '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCVariable_checkOutgoingVariableLabeledTransition0(CVariable cVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CVARIABLE,
				 cVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingVariableLabeledTransition0",
				 CVARIABLE__CHECK_OUTGOING_VARIABLE_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkIncomingVariableLabeledTransitionTransition0 constraint of '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CVARIABLE__CHECK_INCOMING_VARIABLE_LABELED_TRANSITION_TRANSITION0__EEXPRESSION = "self.incoming->select(elem: elem.oclIsTypeOf())->size()>=1";

	/**
	 * Validates the checkIncomingVariableLabeledTransitionTransition0 constraint of '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCVariable_checkIncomingVariableLabeledTransitionTransition0(CVariable cVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CVARIABLE,
				 cVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkIncomingVariableLabeledTransitionTransition0",
				 CVARIABLE__CHECK_INCOMING_VARIABLE_LABELED_TRANSITION_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCGateway(CGateway cGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cGateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateCGateway_checkOutgoingGatewayLabeledTransition0(cGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateCGateway_checkIncomingGatewayLabeledTransitionTransition0(cGateway, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingGatewayLabeledTransition0 constraint of '<em>CGateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CGATEWAY__CHECK_OUTGOING_GATEWAY_LABELED_TRANSITION0__EEXPRESSION = "self.outgoingElements->select(elem: elem.oclIsTypeOf())->size()>=1";

	/**
	 * Validates the checkOutgoingGatewayLabeledTransition0 constraint of '<em>CGateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCGateway_checkOutgoingGatewayLabeledTransition0(CGateway cGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CGATEWAY,
				 cGateway,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingGatewayLabeledTransition0",
				 CGATEWAY__CHECK_OUTGOING_GATEWAY_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkIncomingGatewayLabeledTransitionTransition0 constraint of '<em>CGateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CGATEWAY__CHECK_INCOMING_GATEWAY_LABELED_TRANSITION_TRANSITION0__EEXPRESSION = "self.incoming->select(elem: elem.oclIsTypeOf())->size()>=1";

	/**
	 * Validates the checkIncomingGatewayLabeledTransitionTransition0 constraint of '<em>CGateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCGateway_checkIncomingGatewayLabeledTransitionTransition0(CGateway cGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CmeineditorPackage.Literals.CGATEWAY,
				 cGateway,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkIncomingGatewayLabeledTransitionTransition0",
				 CGATEWAY__CHECK_INCOMING_GATEWAY_LABELED_TRANSITION_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTransition(CTransition cTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLabeledTransition(CLabeledTransition cLabeledTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cLabeledTransition, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CmeineditorValidator
