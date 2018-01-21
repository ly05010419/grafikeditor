/**
 */
package grafikeditor.api.cmeineditor;

import graphicalgraphmodel.GraphicalgraphmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see grafikeditor.api.cmeineditor.CmeineditorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CmeineditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmeineditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/cmeineditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cmeineditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmeineditorPackage eINSTANCE = grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CMeinEditorImpl <em>CMein Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CMeinEditorImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCMeinEditor()
	 * @generated
	 */
	int CMEIN_EDITOR = 0;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMEIN_EDITOR__MODEL_ELEMENTS = GraphicalgraphmodelPackage.CGRAPH_MODEL__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMEIN_EDITOR__MAP = GraphicalgraphmodelPackage.CGRAPH_MODEL__MAP;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMEIN_EDITOR__MODEL_ELEMENT = GraphicalgraphmodelPackage.CGRAPH_MODEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMEIN_EDITOR__DIAGRAM = GraphicalgraphmodelPackage.CGRAPH_MODEL__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMEIN_EDITOR__SHAPE = GraphicalgraphmodelPackage.CGRAPH_MODEL__SHAPE;

	/**
	 * The number of structural features of the '<em>CMein Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMEIN_EDITOR_FEATURE_COUNT = GraphicalgraphmodelPackage.CGRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CStartImpl <em>CStart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CStartImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCStart()
	 * @generated
	 */
	int CSTART = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTART__CONTAINER = GraphicalgraphmodelPackage.CNODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTART__MODEL_ELEMENT = GraphicalgraphmodelPackage.CNODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTART__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CNODE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTART__INCOMING = GraphicalgraphmodelPackage.CNODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTART__OUTGOING = GraphicalgraphmodelPackage.CNODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>CStart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTART_FEATURE_COUNT = GraphicalgraphmodelPackage.CNODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CEndImpl <em>CEnd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CEndImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCEnd()
	 * @generated
	 */
	int CEND = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEND__CONTAINER = GraphicalgraphmodelPackage.CNODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEND__MODEL_ELEMENT = GraphicalgraphmodelPackage.CNODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEND__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CNODE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEND__INCOMING = GraphicalgraphmodelPackage.CNODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEND__OUTGOING = GraphicalgraphmodelPackage.CNODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>CEnd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEND_FEATURE_COUNT = GraphicalgraphmodelPackage.CNODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CTerminalImpl <em>CTerminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CTerminalImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCTerminal()
	 * @generated
	 */
	int CTERMINAL = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINAL__CONTAINER = GraphicalgraphmodelPackage.CNODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINAL__MODEL_ELEMENT = GraphicalgraphmodelPackage.CNODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINAL__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CNODE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINAL__INCOMING = GraphicalgraphmodelPackage.CNODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINAL__OUTGOING = GraphicalgraphmodelPackage.CNODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>CTerminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERMINAL_FEATURE_COUNT = GraphicalgraphmodelPackage.CNODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CVariableImpl <em>CVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CVariableImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCVariable()
	 * @generated
	 */
	int CVARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__CONTAINER = GraphicalgraphmodelPackage.CNODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__MODEL_ELEMENT = GraphicalgraphmodelPackage.CNODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CNODE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__INCOMING = GraphicalgraphmodelPackage.CNODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__OUTGOING = GraphicalgraphmodelPackage.CNODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>CVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE_FEATURE_COUNT = GraphicalgraphmodelPackage.CNODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CGatewayImpl <em>CGateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CGatewayImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCGateway()
	 * @generated
	 */
	int CGATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CGATEWAY__CONTAINER = GraphicalgraphmodelPackage.CNODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CGATEWAY__MODEL_ELEMENT = GraphicalgraphmodelPackage.CNODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CGATEWAY__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CNODE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CGATEWAY__INCOMING = GraphicalgraphmodelPackage.CNODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CGATEWAY__OUTGOING = GraphicalgraphmodelPackage.CNODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>CGateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CGATEWAY_FEATURE_COUNT = GraphicalgraphmodelPackage.CNODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CTransitionImpl <em>CTransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CTransitionImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCTransition()
	 * @generated
	 */
	int CTRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSITION__CONTAINER = GraphicalgraphmodelPackage.CEDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSITION__MODEL_ELEMENT = GraphicalgraphmodelPackage.CEDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSITION__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CEDGE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSITION__SOURCE_ELEMENT = GraphicalgraphmodelPackage.CEDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSITION__TARGET_ELEMENT = GraphicalgraphmodelPackage.CEDGE__TARGET_ELEMENT;

	/**
	 * The number of structural features of the '<em>CTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSITION_FEATURE_COUNT = GraphicalgraphmodelPackage.CEDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafikeditor.api.cmeineditor.impl.CLabeledTransitionImpl <em>CLabeled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafikeditor.api.cmeineditor.impl.CLabeledTransitionImpl
	 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCLabeledTransition()
	 * @generated
	 */
	int CLABELED_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABELED_TRANSITION__CONTAINER = GraphicalgraphmodelPackage.CEDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABELED_TRANSITION__MODEL_ELEMENT = GraphicalgraphmodelPackage.CEDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pictogram Element Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABELED_TRANSITION__PICTOGRAM_ELEMENT_SUPPLIER = GraphicalgraphmodelPackage.CEDGE__PICTOGRAM_ELEMENT_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABELED_TRANSITION__SOURCE_ELEMENT = GraphicalgraphmodelPackage.CEDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABELED_TRANSITION__TARGET_ELEMENT = GraphicalgraphmodelPackage.CEDGE__TARGET_ELEMENT;

	/**
	 * The number of structural features of the '<em>CLabeled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABELED_TRANSITION_FEATURE_COUNT = GraphicalgraphmodelPackage.CEDGE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CMeinEditor <em>CMein Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMein Editor</em>'.
	 * @see grafikeditor.api.cmeineditor.CMeinEditor
	 * @generated
	 */
	EClass getCMeinEditor();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CStart <em>CStart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CStart</em>'.
	 * @see grafikeditor.api.cmeineditor.CStart
	 * @generated
	 */
	EClass getCStart();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CEnd <em>CEnd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEnd</em>'.
	 * @see grafikeditor.api.cmeineditor.CEnd
	 * @generated
	 */
	EClass getCEnd();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CTerminal <em>CTerminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTerminal</em>'.
	 * @see grafikeditor.api.cmeineditor.CTerminal
	 * @generated
	 */
	EClass getCTerminal();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CVariable <em>CVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVariable</em>'.
	 * @see grafikeditor.api.cmeineditor.CVariable
	 * @generated
	 */
	EClass getCVariable();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CGateway <em>CGateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CGateway</em>'.
	 * @see grafikeditor.api.cmeineditor.CGateway
	 * @generated
	 */
	EClass getCGateway();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CTransition <em>CTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTransition</em>'.
	 * @see grafikeditor.api.cmeineditor.CTransition
	 * @generated
	 */
	EClass getCTransition();

	/**
	 * Returns the meta object for class '{@link grafikeditor.api.cmeineditor.CLabeledTransition <em>CLabeled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLabeled Transition</em>'.
	 * @see grafikeditor.api.cmeineditor.CLabeledTransition
	 * @generated
	 */
	EClass getCLabeledTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmeineditorFactory getCmeineditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CMeinEditorImpl <em>CMein Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CMeinEditorImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCMeinEditor()
		 * @generated
		 */
		EClass CMEIN_EDITOR = eINSTANCE.getCMeinEditor();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CStartImpl <em>CStart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CStartImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCStart()
		 * @generated
		 */
		EClass CSTART = eINSTANCE.getCStart();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CEndImpl <em>CEnd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CEndImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCEnd()
		 * @generated
		 */
		EClass CEND = eINSTANCE.getCEnd();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CTerminalImpl <em>CTerminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CTerminalImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCTerminal()
		 * @generated
		 */
		EClass CTERMINAL = eINSTANCE.getCTerminal();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CVariableImpl <em>CVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CVariableImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCVariable()
		 * @generated
		 */
		EClass CVARIABLE = eINSTANCE.getCVariable();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CGatewayImpl <em>CGateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CGatewayImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCGateway()
		 * @generated
		 */
		EClass CGATEWAY = eINSTANCE.getCGateway();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CTransitionImpl <em>CTransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CTransitionImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCTransition()
		 * @generated
		 */
		EClass CTRANSITION = eINSTANCE.getCTransition();

		/**
		 * The meta object literal for the '{@link grafikeditor.api.cmeineditor.impl.CLabeledTransitionImpl <em>CLabeled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafikeditor.api.cmeineditor.impl.CLabeledTransitionImpl
		 * @see grafikeditor.api.cmeineditor.impl.CmeineditorPackageImpl#getCLabeledTransition()
		 * @generated
		 */
		EClass CLABELED_TRANSITION = eINSTANCE.getCLabeledTransition();

	}

} //CmeineditorPackage
