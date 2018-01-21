/**
 */
package grafikeditor.meineditor.util;

import grafikeditor.meineditor.*;

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
 * @see grafikeditor.meineditor.MeineditorPackage
 * @generated
 */
public class MeineditorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeineditorValidator INSTANCE = new MeineditorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "grafikeditor.meineditor";

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
	public MeineditorValidator() {
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
	  return MeineditorPackage.eINSTANCE;
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
			case MeineditorPackage.MEIN_EDITOR:
				return validateMeinEditor((MeinEditor)value, diagnostics, context);
			case MeineditorPackage.START:
				return validateStart((Start)value, diagnostics, context);
			case MeineditorPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case MeineditorPackage.TERMINAL:
				return validateTerminal((Terminal)value, diagnostics, context);
			case MeineditorPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case MeineditorPackage.GATEWAY:
				return validateGateway((Gateway)value, diagnostics, context);
			case MeineditorPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case MeineditorPackage.LABELED_TRANSITION:
				return validateLabeledTransition((LabeledTransition)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeinEditor(MeinEditor meinEditor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meinEditor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(start, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateStart_checkOutgoingStartLabeledTransition0(start, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingStartLabeledTransition0 constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START__CHECK_OUTGOING_START_LABELED_TRANSITION0__EEXPRESSION = "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())=1";

	/**
	 * Validates the checkOutgoingStartLabeledTransition0 constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart_checkOutgoingStartLabeledTransition0(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.START,
				 start,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingStartLabeledTransition0",
				 START__CHECK_OUTGOING_START_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(end, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(terminal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_checkOutgoingTerminalLabeledTransition0(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_checkIncomingTerminalLabeledTransitionTransition0(terminal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingTerminalLabeledTransition0 constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TERMINAL__CHECK_OUTGOING_TERMINAL_LABELED_TRANSITION0__EEXPRESSION = "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1";

	/**
	 * Validates the checkOutgoingTerminalLabeledTransition0 constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_checkOutgoingTerminalLabeledTransition0(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.TERMINAL,
				 terminal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingTerminalLabeledTransition0",
				 TERMINAL__CHECK_OUTGOING_TERMINAL_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkIncomingTerminalLabeledTransitionTransition0 constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TERMINAL__CHECK_INCOMING_TERMINAL_LABELED_TRANSITION_TRANSITION0__EEXPRESSION = "(self.incoming->select(elem| elem.oclIsKindOf(Transition))->size())+(self.incoming->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1";

	/**
	 * Validates the checkIncomingTerminalLabeledTransitionTransition0 constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_checkIncomingTerminalLabeledTransitionTransition0(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.TERMINAL,
				 terminal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkIncomingTerminalLabeledTransitionTransition0",
				 TERMINAL__CHECK_INCOMING_TERMINAL_LABELED_TRANSITION_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_checkOutgoingVariableLabeledTransition0(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_checkIncomingVariableLabeledTransitionTransition0(variable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingVariableLabeledTransition0 constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE__CHECK_OUTGOING_VARIABLE_LABELED_TRANSITION0__EEXPRESSION = "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1";

	/**
	 * Validates the checkOutgoingVariableLabeledTransition0 constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_checkOutgoingVariableLabeledTransition0(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.VARIABLE,
				 variable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingVariableLabeledTransition0",
				 VARIABLE__CHECK_OUTGOING_VARIABLE_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkIncomingVariableLabeledTransitionTransition0 constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE__CHECK_INCOMING_VARIABLE_LABELED_TRANSITION_TRANSITION0__EEXPRESSION = "(self.incoming->select(elem| elem.oclIsKindOf(Transition))->size())+(self.incoming->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1";

	/**
	 * Validates the checkIncomingVariableLabeledTransitionTransition0 constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_checkIncomingVariableLabeledTransitionTransition0(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.VARIABLE,
				 variable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkIncomingVariableLabeledTransitionTransition0",
				 VARIABLE__CHECK_INCOMING_VARIABLE_LABELED_TRANSITION_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateGateway_checkOutgoingGatewayLabeledTransition0(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateGateway_checkIncomingGatewayLabeledTransitionTransition0(gateway, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkOutgoingGatewayLabeledTransition0 constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATEWAY__CHECK_OUTGOING_GATEWAY_LABELED_TRANSITION0__EEXPRESSION = "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1";

	/**
	 * Validates the checkOutgoingGatewayLabeledTransition0 constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway_checkOutgoingGatewayLabeledTransition0(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.GATEWAY,
				 gateway,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkOutgoingGatewayLabeledTransition0",
				 GATEWAY__CHECK_OUTGOING_GATEWAY_LABELED_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkIncomingGatewayLabeledTransitionTransition0 constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATEWAY__CHECK_INCOMING_GATEWAY_LABELED_TRANSITION_TRANSITION0__EEXPRESSION = "(self.incoming->select(elem| elem.oclIsKindOf(Transition))->size())+(self.incoming->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1";

	/**
	 * Validates the checkIncomingGatewayLabeledTransitionTransition0 constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway_checkIncomingGatewayLabeledTransitionTransition0(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MeineditorPackage.Literals.GATEWAY,
				 gateway,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "checkIncomingGatewayLabeledTransitionTransition0",
				 GATEWAY__CHECK_INCOMING_GATEWAY_LABELED_TRANSITION_TRANSITION0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledTransition(LabeledTransition labeledTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labeledTransition, diagnostics, context);
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

} //MeineditorValidator
