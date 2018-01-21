/**
 */
package grafikeditor.meineditor.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import grafikeditor.meineditor.End;
import grafikeditor.meineditor.Gateway;
import grafikeditor.meineditor.MeinEditor;
import grafikeditor.meineditor.MeineditorPackage;
import grafikeditor.meineditor.Start;
import grafikeditor.meineditor.Terminal;
import grafikeditor.meineditor.Variable;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.Node;

import graphmodel.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grafikeditor.meineditor.impl.EndImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link grafikeditor.meineditor.impl.EndImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndImpl extends ModelElementImpl implements End {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeineditorPackage.Literals.END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, MeineditorPackage.END__INCOMING, GraphmodelPackage.EDGE__TARGET_ELEMENT);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, MeineditorPackage.END__OUTGOING, GraphmodelPackage.EDGE__SOURCE_ELEMENT);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint incomingConstraint0 = new ConnectionConstraint(false,1,-1,grafikeditor.meineditor.Transition.class,grafikeditor.meineditor.LabeledTransition.class);
		
		return new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>(java.util.Arrays.asList(incomingConstraint0));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminalPredecessors() {
		
		
		return getPredecessors(grafikeditor.meineditor.Terminal.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Start> getStartPredecessors() {
		
		
		return getPredecessors(grafikeditor.meineditor.Start.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariablePredecessors() {
		
		
		return getPredecessors(grafikeditor.meineditor.Variable.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gateway> getGatewayPredecessors() {
		
		
		return getPredecessors(grafikeditor.meineditor.Gateway.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getPredecessors() {
		
		
		return getPredecessors(Node.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeinEditor getRootElement() {
		return (grafikeditor.meineditor.MeinEditor)super.getRootElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <M extends Node> EList<M> getSuccessors() {
		return new org.eclipse.emf.common.util.BasicEList<M>();
				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> EList<T> getSuccessors(final Class<T> clazz) {
		EList<T> list = new org.eclipse.emf.common.util.BasicEList<T>();
				if(clazz!=null){
					for(Edge e: this.getOutgoing()){
						if(clazz.isInstance(e.getTargetElement())){
							list.add(clazz.cast(e.getTargetElement()));
						}
					}
				}else{
					throw new NullPointerException("Class must not be null.");
				}
				
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Node> EList<T> getPredecessors(final Class<T> clazz) {
		EList<T> list = new org.eclipse.emf.common.util.BasicEList<T>();
				if(clazz!=null){
					for(Edge e: this.getIncoming()){
						if(clazz.isInstance(e.getSourceElement())){
							list.add(clazz.cast(e.getSourceElement()));
						}
					}
				}else{
					throw new NullPointerException("Class must not be null.");
				}
				
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> EList<T> getIncoming(final Class<T> clazz) {
		EList<T> list = new org.eclipse.emf.common.util.BasicEList<T>();
				if(clazz!=null){
					for(Edge e: this.getIncoming()){
						if(clazz.isInstance(e)){
							list.add(clazz.cast(e));
						}
					}
				}else{
					throw new NullPointerException("Class must not be null.");
				}
				
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Edge> EList<T> getOutgoing(final Class<T> clazz) {
		EList<T> list = new org.eclipse.emf.common.util.BasicEList<T>();
				if(clazz!=null){
					for(Edge e: this.getOutgoing()){
						if(clazz.isInstance(e)){
							list.add(clazz.cast(e));
						}
					}
				}else{
					throw new NullPointerException("Class must not be null.");
				}
				
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canConnect(final Edge with, final Node to) {
		return canStart(with.getClass())&& to.canEnd(with.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		return new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canStart(final Class<? extends Edge> edgeType) {
		EList<ConnectionConstraint> outConstraints = getOutgoingConstraints();
				long constraintCount = outConstraints.stream().filter(c -> c.isInEdges(edgeType)).count();
				return constraintCount>0&&outConstraints.stream().filter(c -> c.isInEdges(edgeType)).allMatch(c -> c.canConnect(this,edgeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canEnd(final Class<? extends Edge> edgeType) {
		EList<ConnectionConstraint> inConstraints = getIncomingConstraints();
				long constraintCount = inConstraints.stream().filter(c -> c.isInEdges(edgeType)).count();
				return constraintCount>0&&inConstraints.stream().filter(c -> c.isInEdges(edgeType)).allMatch(c -> c.canConnect(this,edgeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeineditorPackage.END__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case MeineditorPackage.END__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeineditorPackage.END__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case MeineditorPackage.END__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeineditorPackage.END__INCOMING:
				return getIncoming();
			case MeineditorPackage.END__OUTGOING:
				return getOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeineditorPackage.END__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Edge>)newValue);
				return;
			case MeineditorPackage.END__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Edge>)newValue);
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
			case MeineditorPackage.END__INCOMING:
				getIncoming().clear();
				return;
			case MeineditorPackage.END__OUTGOING:
				getOutgoing().clear();
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
			case MeineditorPackage.END__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case MeineditorPackage.END__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndImpl
