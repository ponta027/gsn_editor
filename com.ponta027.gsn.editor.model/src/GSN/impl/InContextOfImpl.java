/**
 */
package GSN.impl;

import GSN.DecomposableSpinalElement;
import GSN.InContextOf;
import GSN.InTheContextOfTargetElement;
import GSN.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Context Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.impl.InContextOfImpl#getContextualElement <em>Contextual Element</em>}</li>
 *   <li>{@link GSN.impl.InContextOfImpl#getContextOfSpinalElement <em>Context Of Spinal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InContextOfImpl extends MinimalEObjectImpl.Container implements InContextOf {
	/**
	 * The cached value of the '{@link #getContextualElement() <em>Contextual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualElement()
	 * @generated
	 * @ordered
	 */
	protected InTheContextOfTargetElement contextualElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InContextOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IN_CONTEXT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InTheContextOfTargetElement getContextualElement() {
		if (contextualElement != null && contextualElement.eIsProxy()) {
			InternalEObject oldContextualElement = (InternalEObject)contextualElement;
			contextualElement = (InTheContextOfTargetElement)eResolveProxy(oldContextualElement);
			if (contextualElement != oldContextualElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
			}
		}
		return contextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InTheContextOfTargetElement basicGetContextualElement() {
		return contextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualElement(InTheContextOfTargetElement newContextualElement) {
		InTheContextOfTargetElement oldContextualElement = contextualElement;
		contextualElement = newContextualElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposableSpinalElement getContextOfSpinalElement() {
		if (eContainerFeatureID() != ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT) return null;
		return (DecomposableSpinalElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextOfSpinalElement(DecomposableSpinalElement newContextOfSpinalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContextOfSpinalElement, ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOfSpinalElement(DecomposableSpinalElement newContextOfSpinalElement) {
		if (newContextOfSpinalElement != eInternalContainer() || (eContainerFeatureID() != ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT && newContextOfSpinalElement != null)) {
			if (EcoreUtil.isAncestor(this, newContextOfSpinalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContextOfSpinalElement != null)
				msgs = ((InternalEObject)newContextOfSpinalElement).eInverseAdd(this, ModelPackage.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT, DecomposableSpinalElement.class, msgs);
			msgs = basicSetContextOfSpinalElement(newContextOfSpinalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT, newContextOfSpinalElement, newContextOfSpinalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContextOfSpinalElement((DecomposableSpinalElement)otherEnd, msgs);
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
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return basicSetContextOfSpinalElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT, DecomposableSpinalElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				if (resolve) return getContextualElement();
				return basicGetContextualElement();
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return getContextOfSpinalElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				setContextualElement((InTheContextOfTargetElement)newValue);
				return;
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				setContextOfSpinalElement((DecomposableSpinalElement)newValue);
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
			case ModelPackage.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				setContextualElement((InTheContextOfTargetElement)null);
				return;
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				setContextOfSpinalElement((DecomposableSpinalElement)null);
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
			case ModelPackage.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				return contextualElement != null;
			case ModelPackage.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return getContextOfSpinalElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //InContextOfImpl
