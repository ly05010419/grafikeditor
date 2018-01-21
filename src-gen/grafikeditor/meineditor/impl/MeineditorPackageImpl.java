/**
 */
package grafikeditor.meineditor.impl;

import grafikeditor.meineditor.End;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.LabeledTransition;
import grafikeditor.meineditor.MeinEditor;
import grafikeditor.meineditor.MeineditorFactory;
import grafikeditor.meineditor.MeineditorPackage;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Transition;
import grafikeditor.meineditor.Variable;

import grafikeditor.meineditor.util.MeineditorValidator;

import graphmodel.GraphmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeineditorPackageImpl extends EPackageImpl implements MeineditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meinEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledTransitionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see grafikeditor.meineditor.MeineditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeineditorPackageImpl() {
		super(eNS_URI, MeineditorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MeineditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeineditorPackage init() {
		if (isInited) return (MeineditorPackage)EPackage.Registry.INSTANCE.getEPackage(MeineditorPackage.eNS_URI);

		// Obtain or create and register package
		MeineditorPackageImpl theMeineditorPackage = (MeineditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeineditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeineditorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMeineditorPackage.createPackageContents();

		// Initialize created meta-data
		theMeineditorPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMeineditorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MeineditorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMeineditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeineditorPackage.eNS_URI, theMeineditorPackage);
		return theMeineditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeinEditor() {
		return meinEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeinEditor_ModelName() {
		return (EAttribute)meinEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Name() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Name() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_Name() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledTransition() {
		return labeledTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledTransition_Label() {
		return (EAttribute)labeledTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeineditorFactory getMeineditorFactory() {
		return (MeineditorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		meinEditorEClass = createEClass(MEIN_EDITOR);
		createEAttribute(meinEditorEClass, MEIN_EDITOR__MODEL_NAME);

		startEClass = createEClass(START);
		createEAttribute(startEClass, START__NAME);

		endEClass = createEClass(END);

		terminalEClass = createEClass(TERMINAL);
		createEAttribute(terminalEClass, TERMINAL__NAME);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__NAME);

		transitionEClass = createEClass(TRANSITION);

		labeledTransitionEClass = createEClass(LABELED_TRANSITION);
		createEAttribute(labeledTransitionEClass, LABELED_TRANSITION__LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphmodelPackage theGraphmodelPackage = (GraphmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		meinEditorEClass.getESuperTypes().add(theGraphmodelPackage.getGraphModel());
		startEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		endEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		terminalEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		variableEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		gatewayEClass.getESuperTypes().add(theGraphmodelPackage.getNode());
		transitionEClass.getESuperTypes().add(theGraphmodelPackage.getEdge());
		labeledTransitionEClass.getESuperTypes().add(theGraphmodelPackage.getEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(meinEditorEClass, MeinEditor.class, "MeinEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeinEditor_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, MeinEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getTransition(), "getTransitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getLabeledTransition(), "getLabeledTransitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getStart(), "getStarts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getEnd(), "getEnds", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getTerminal(), "getTerminals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getVariable(), "getVariables", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, this.getGateway(), "getGateways", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(meinEditorEClass, theGraphmodelPackage.getContainmentConstraint(), "getContainmentConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(meinEditorEClass, null, "getAllNodeTypes", 0, -1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theGraphmodelPackage.getNode());
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(startEClass, theGraphmodelPackage.getConnectionConstraint(), "getOutgoingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(startEClass, this.getEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(startEClass, this.getTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(startEClass, this.getVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(startEClass, this.getGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(startEClass, theGraphmodelPackage.getNode(), "getSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(startEClass, this.getMeinEditor(), "getRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(endEClass, theGraphmodelPackage.getConnectionConstraint(), "getIncomingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endEClass, this.getTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endEClass, this.getStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endEClass, this.getVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endEClass, this.getGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endEClass, theGraphmodelPackage.getNode(), "getPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(endEClass, this.getMeinEditor(), "getRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(terminalEClass, theGraphmodelPackage.getConnectionConstraint(), "getIncomingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, theGraphmodelPackage.getConnectionConstraint(), "getOutgoingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, theGraphmodelPackage.getNode(), "getPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, theGraphmodelPackage.getNode(), "getSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(terminalEClass, this.getMeinEditor(), "getRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableEClass, theGraphmodelPackage.getConnectionConstraint(), "getIncomingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, theGraphmodelPackage.getConnectionConstraint(), "getOutgoingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, theGraphmodelPackage.getNode(), "getPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, theGraphmodelPackage.getNode(), "getSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(variableEClass, this.getMeinEditor(), "getRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(gatewayEClass, theGraphmodelPackage.getConnectionConstraint(), "getIncomingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, theGraphmodelPackage.getConnectionConstraint(), "getOutgoingConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, theGraphmodelPackage.getNode(), "getPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, theGraphmodelPackage.getNode(), "getSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(gatewayEClass, this.getMeinEditor(), "getRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labeledTransitionEClass, LabeledTransition.class, "LabeledTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledTransition_Label(), ecorePackage.getEString(), "label", null, 0, 1, LabeledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (startEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingStartLabeledTransition0"
		   });	
		addAnnotation
		  (terminalEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingTerminalLabeledTransition0 checkIncomingTerminalLabeledTransitionTransition0"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingVariableLabeledTransition0 checkIncomingVariableLabeledTransitionTransition0"
		   });	
		addAnnotation
		  (gatewayEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingGatewayLabeledTransition0 checkIncomingGatewayLabeledTransitionTransition0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (startEClass, 
		   source, 
		   new String[] {
			 "checkOutgoingStartLabeledTransition0", "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())=1"
		   });	
		addAnnotation
		  (terminalEClass, 
		   source, 
		   new String[] {
			 "checkIncomingTerminalLabeledTransitionTransition0", "(self.incoming->select(elem| elem.oclIsKindOf(Transition))->size())+(self.incoming->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1",
			 "checkOutgoingTerminalLabeledTransition0", "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "checkIncomingVariableLabeledTransitionTransition0", "(self.incoming->select(elem| elem.oclIsKindOf(Transition))->size())+(self.incoming->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1",
			 "checkOutgoingVariableLabeledTransition0", "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1"
		   });	
		addAnnotation
		  (gatewayEClass, 
		   source, 
		   new String[] {
			 "checkIncomingGatewayLabeledTransitionTransition0", "(self.incoming->select(elem| elem.oclIsKindOf(Transition))->size())+(self.incoming->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1",
			 "checkOutgoingGatewayLabeledTransition0", "(self.outgoing->select(elem| elem.oclIsKindOf(LabeledTransition))->size())>=1"
		   });
	}

} //MeineditorPackageImpl
