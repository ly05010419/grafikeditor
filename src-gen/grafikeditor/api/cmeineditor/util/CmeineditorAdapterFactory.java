/**
 */
package grafikeditor.api.cmeineditor.util;

import grafikeditor.api.cmeineditor.*;

import graphicalgraphmodel.CEdge;
import graphicalgraphmodel.CGraphModel;
import graphicalgraphmodel.CModelElement;
import graphicalgraphmodel.CModelElementContainer;
import graphicalgraphmodel.CNode;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see grafikeditor.api.cmeineditor.CmeineditorPackage
 * @generated
 */
public class CmeineditorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmeineditorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmeineditorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CmeineditorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmeineditorSwitch<Adapter> modelSwitch =
		new CmeineditorSwitch<Adapter>() {
			@Override
			public Adapter caseCMeinEditor(CMeinEditor object) {
				return createCMeinEditorAdapter();
			}
			@Override
			public Adapter caseCStart(CStart object) {
				return createCStartAdapter();
			}
			@Override
			public Adapter caseCEnd(CEnd object) {
				return createCEndAdapter();
			}
			@Override
			public Adapter caseCTerminal(CTerminal object) {
				return createCTerminalAdapter();
			}
			@Override
			public Adapter caseCVariable(CVariable object) {
				return createCVariableAdapter();
			}
			@Override
			public Adapter caseCGateway(CGateway object) {
				return createCGatewayAdapter();
			}
			@Override
			public Adapter caseCTransition(CTransition object) {
				return createCTransitionAdapter();
			}
			@Override
			public Adapter caseCLabeledTransition(CLabeledTransition object) {
				return createCLabeledTransitionAdapter();
			}
			@Override
			public Adapter caseCModelElementContainer(CModelElementContainer object) {
				return createCModelElementContainerAdapter();
			}
			@Override
			public Adapter caseCGraphModel(CGraphModel object) {
				return createCGraphModelAdapter();
			}
			@Override
			public Adapter caseCModelElement(CModelElement object) {
				return createCModelElementAdapter();
			}
			@Override
			public Adapter caseCNode(CNode object) {
				return createCNodeAdapter();
			}
			@Override
			public Adapter caseCEdge(CEdge object) {
				return createCEdgeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CMeinEditor <em>CMein Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CMeinEditor
	 * @generated
	 */
	public Adapter createCMeinEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CStart <em>CStart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CStart
	 * @generated
	 */
	public Adapter createCStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CEnd <em>CEnd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CEnd
	 * @generated
	 */
	public Adapter createCEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CTerminal <em>CTerminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CTerminal
	 * @generated
	 */
	public Adapter createCTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CVariable <em>CVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CVariable
	 * @generated
	 */
	public Adapter createCVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CGateway <em>CGateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CGateway
	 * @generated
	 */
	public Adapter createCGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CTransition <em>CTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CTransition
	 * @generated
	 */
	public Adapter createCTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link grafikeditor.api.cmeineditor.CLabeledTransition <em>CLabeled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see grafikeditor.api.cmeineditor.CLabeledTransition
	 * @generated
	 */
	public Adapter createCLabeledTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphicalgraphmodel.CModelElementContainer <em>CModel Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphicalgraphmodel.CModelElementContainer
	 * @generated
	 */
	public Adapter createCModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphicalgraphmodel.CGraphModel <em>CGraph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphicalgraphmodel.CGraphModel
	 * @generated
	 */
	public Adapter createCGraphModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphicalgraphmodel.CModelElement <em>CModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphicalgraphmodel.CModelElement
	 * @generated
	 */
	public Adapter createCModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphicalgraphmodel.CNode <em>CNode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphicalgraphmodel.CNode
	 * @generated
	 */
	public Adapter createCNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphicalgraphmodel.CEdge <em>CEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphicalgraphmodel.CEdge
	 * @generated
	 */
	public Adapter createCEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CmeineditorAdapterFactory
