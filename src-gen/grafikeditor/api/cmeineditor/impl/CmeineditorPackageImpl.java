/**
 */
package grafikeditor.api.cmeineditor.impl;

import grafikeditor.api.cmeineditor.CEnd;
import grafikeditor.api.cmeineditor.CGateway;
import grafikeditor.api.cmeineditor.CLabeledTransition;
import grafikeditor.api.cmeineditor.CMeinEditor;
import grafikeditor.api.cmeineditor.CStart;
import grafikeditor.api.cmeineditor.CTerminal;
import grafikeditor.api.cmeineditor.CTransition;
import grafikeditor.api.cmeineditor.CVariable;
import grafikeditor.api.cmeineditor.CmeineditorFactory;
import grafikeditor.api.cmeineditor.CmeineditorPackage;

import grafikeditor.api.cmeineditor.util.CmeineditorValidator;

import grafikeditor.meineditor.MeineditorPackage;

import graphicalgraphmodel.GraphicalgraphmodelPackage;

import graphmodel.GraphmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.graphiti.mm.algorithms.AlgorithmsPackage;

import org.eclipse.graphiti.mm.algorithms.styles.StylesPackage;

import org.eclipse.graphiti.mm.pictograms.PictogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmeineditorPackageImpl extends EPackageImpl implements CmeineditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cMeinEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cLabeledTransitionEClass = null;

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
	 * @see grafikeditor.api.cmeineditor.CmeineditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmeineditorPackageImpl() {
		super(eNS_URI, CmeineditorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CmeineditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmeineditorPackage init() {
		if (isInited) return (CmeineditorPackage)EPackage.Registry.INSTANCE.getEPackage(CmeineditorPackage.eNS_URI);

		// Obtain or create and register package
		CmeineditorPackageImpl theCmeineditorPackage = (CmeineditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CmeineditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CmeineditorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MeineditorPackage.eINSTANCE.eClass();
		GraphicalgraphmodelPackage.eINSTANCE.eClass();
		PictogramsPackage.eINSTANCE.eClass();
		StylesPackage.eINSTANCE.eClass();
		AlgorithmsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCmeineditorPackage.createPackageContents();

		// Initialize created meta-data
		theCmeineditorPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCmeineditorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CmeineditorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCmeineditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmeineditorPackage.eNS_URI, theCmeineditorPackage);
		return theCmeineditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMeinEditor() {
		return cMeinEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCStart() {
		return cStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEnd() {
		return cEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTerminal() {
		return cTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVariable() {
		return cVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCGateway() {
		return cGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTransition() {
		return cTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLabeledTransition() {
		return cLabeledTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmeineditorFactory getCmeineditorFactory() {
		return (CmeineditorFactory)getEFactoryInstance();
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
		cMeinEditorEClass = createEClass(CMEIN_EDITOR);

		cStartEClass = createEClass(CSTART);

		cEndEClass = createEClass(CEND);

		cTerminalEClass = createEClass(CTERMINAL);

		cVariableEClass = createEClass(CVARIABLE);

		cGatewayEClass = createEClass(CGATEWAY);

		cTransitionEClass = createEClass(CTRANSITION);

		cLabeledTransitionEClass = createEClass(CLABELED_TRANSITION);
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
		GraphicalgraphmodelPackage theGraphicalgraphmodelPackage = (GraphicalgraphmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GraphicalgraphmodelPackage.eNS_URI);
		MeineditorPackage theMeineditorPackage = (MeineditorPackage)EPackage.Registry.INSTANCE.getEPackage(MeineditorPackage.eNS_URI);
		GraphmodelPackage theGraphmodelPackage = (GraphmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cMeinEditorEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCGraphModel());
		cStartEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCNode());
		cEndEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCNode());
		cTerminalEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCNode());
		cVariableEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCNode());
		cGatewayEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCNode());
		cTransitionEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCEdge());
		cLabeledTransitionEClass.getESuperTypes().add(theGraphicalgraphmodelPackage.getCEdge());

		// Initialize classes and features; add operations and parameters
		initEClass(cMeinEditorEClass, CMeinEditor.class, "CMeinEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cMeinEditorEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, ecorePackage.getEString(), "getModelName", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(cMeinEditorEClass, null, "setModelName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "arg", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCStart(), "getCStarts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCEnd(), "getCEnds", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCTerminal(), "getCTerminals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCVariable(), "getCVariables", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCGateway(), "getCGateways", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCTransition(), "getCTransitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCLabeledTransition(), "getCLabeledTransitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, null, "getAllNodeTypes", 0, -1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(cMeinEditorEClass, this.getCStart(), "newCStart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCStart(), "newCStart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "canNewCStart", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCEnd(), "newCEnd", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCEnd(), "newCEnd", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "canNewCEnd", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCTerminal(), "newCTerminal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCTerminal(), "newCTerminal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "canNewCTerminal", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCVariable(), "newCVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCVariable(), "newCVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "canNewCVariable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCGateway(), "newCGateway", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCGateway(), "newCGateway", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "canNewCGateway", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCTransition(), "getCTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getTransition(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCLabeledTransition(), "getCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getLabeledTransition(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCStart(), "findCStart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getStart(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCEnd(), "findCEnd", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getEnd(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCTerminal(), "findCTerminal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getTerminal(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCVariable(), "findCVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getVariable(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCGateway(), "findCGateway", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getGateway(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCTransition(), "findCTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getTransition(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCLabeledTransition(), "findCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getLabeledTransition(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cMeinEditorEClass, this.getCMeinEditor(), "getCRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, theGraphicalgraphmodelPackage.getCModelElement(), "findCModelElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphmodelPackage.getModelElement(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, theGraphicalgraphmodelPackage.getCNode(), "findCNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphmodelPackage.getNode(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, theGraphicalgraphmodelPackage.getCEdge(), "findCEdge", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphmodelPackage.getEdge(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, theGraphicalgraphmodelPackage.getCModelElementContainer(), "findCModelElementContainer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphmodelPackage.getModelElementContainer(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "canDeleteModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphicalgraphmodelPackage.getCModelElement(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, ecorePackage.getEBoolean(), "deleteModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphicalgraphmodelPackage.getCModelElement(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphicalgraphmodelPackage.getCModelElement(), "elements", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cMeinEditorEClass, this.getCMeinEditor(), "getCMeinEditor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMeineditorPackage.getLabeledTransition(), "me", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cStartEClass, CStart.class, "CStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cStartEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "arg", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, this.getCEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, this.getCTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, this.getCVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, this.getCGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, this.getCMeinEditor(), "getCRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cStartEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, null, "moveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canMoveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, this.getCStart(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, null, "resize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cStartEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cEndEClass, CEnd.class, "CEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cEndEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, this.getCStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, this.getCGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, this.getCTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, this.getCVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, this.getCMeinEditor(), "getCRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cEndEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cEndEClass, null, "moveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cEndEClass, ecorePackage.getEBoolean(), "canMoveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cEndEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cEndEClass, this.getCEnd(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cEndEClass, null, "resize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cTerminalEClass, CTerminal.class, "CTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cTerminalEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "arg", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, this.getCMeinEditor(), "getCRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTerminalEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, null, "moveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canMoveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, this.getCTerminal(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, null, "resize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTerminalEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cVariableEClass, CVariable.class, "CVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cVariableEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "arg", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, this.getCMeinEditor(), "getCRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cVariableEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, null, "moveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canMoveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, this.getCVariable(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, null, "resize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cVariableEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cGatewayEClass, CGateway.class, "CGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cGatewayEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "arg", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCStart(), "getStartPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCGateway(), "getGatewayPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCTerminal(), "getTerminalPredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCVariable(), "getVariablePredecessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCEnd(), "getEndSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCTerminal(), "getTerminalSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCVariable(), "getVariableSuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCGateway(), "getGatewaySuccessors", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, this.getCMeinEditor(), "getCRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cGatewayEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, null, "moveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canMoveTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, this.getCGateway(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCMeinEditor(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, null, "resize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, this.getCLabeledTransition(), "newCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cGatewayEClass, ecorePackage.getEBoolean(), "canNewCLabeledTransition", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cTransitionEClass, CTransition.class, "CTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cTransitionEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cTransitionEClass, null, "addBendpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTransitionEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTransitionEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cTransitionEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cLabeledTransitionEClass, CLabeledTransition.class, "CLabeledTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(cLabeledTransitionEClass, null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cLabeledTransitionEClass, ecorePackage.getEString(), "getLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "setLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "arg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canReconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "reconnectTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCStart(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCEnd(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCTerminal(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canClone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, this.getCLabeledTransition(), "clone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCVariable(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCGateway(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cLabeledTransitionEClass, null, "addBendpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cLabeledTransitionEClass, ecorePackage.getEBoolean(), "canDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(cLabeledTransitionEClass, null, "highlight", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (cStartEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingStartLabeledTransition0"
		   });	
		addAnnotation
		  (cTerminalEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingTerminalLabeledTransition0 checkIncomingTerminalLabeledTransitionTransition0"
		   });	
		addAnnotation
		  (cVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkOutgoingVariableLabeledTransition0 checkIncomingVariableLabeledTransitionTransition0"
		   });	
		addAnnotation
		  (cGatewayEClass, 
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
		  (cStartEClass, 
		   source, 
		   new String[] {
			 "checkOutgoingStartLabeledTransition0", "self.outgoing->select(elem: elem.oclIsTypeOf())->size()==1"
		   });	
		addAnnotation
		  (cTerminalEClass, 
		   source, 
		   new String[] {
			 "checkIncomingTerminalLabeledTransitionTransition0", "self.incoming->select(elem: elem.oclIsTypeOf())->size()>=1",
			 "checkOutgoingTerminalLabeledTransition0", "self.outgoingElements->select(elem: elem.oclIsTypeOf())->size()>=1"
		   });	
		addAnnotation
		  (cVariableEClass, 
		   source, 
		   new String[] {
			 "checkIncomingVariableLabeledTransitionTransition0", "self.incoming->select(elem: elem.oclIsTypeOf())->size()>=1",
			 "checkOutgoingVariableLabeledTransition0", "self.outgoingElements->select(elem: elem.oclIsTypeOf())->size()>=1"
		   });	
		addAnnotation
		  (cGatewayEClass, 
		   source, 
		   new String[] {
			 "checkIncomingGatewayLabeledTransitionTransition0", "self.incoming->select(elem: elem.oclIsTypeOf())->size()>=1",
			 "checkOutgoingGatewayLabeledTransition0", "self.outgoingElements->select(elem: elem.oclIsTypeOf())->size()>=1"
		   });
	}

} //CmeineditorPackageImpl
