/**
 */
package GSN.impl;

import GSN.DecomposableSpinalElement;
import GSN.ModelPackage;
import GSN.SolvedBy;
import GSN.SolvedByMultiplicityExtension;
import GSN.SolvedByTargetElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solved By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.impl.SolvedByImpl#getParentSpinalElement <em>Parent Spinal Element</em>}</li>
 *   <li>{@link GSN.impl.SolvedByImpl#getChildSpinalelement <em>Child Spinalelement</em>}</li>
 *   <li>{@link GSN.impl.SolvedByImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link GSN.impl.SolvedByImpl#getMultiextension <em>Multiextension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolvedByImpl extends MinimalEObjectImpl.Container implements SolvedBy {
	/**
	 * The cached value of the '{@link #getChildSpinalelement() <em>Child Spinalelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSpinalelement()
	 * @generated
	 * @ordered
	 */
	protected SolvedByTargetElement childSpinalelement;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiextension() <em>Multiextension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiextension()
	 * @generated
	 * @ordered
	 */
	protected static final SolvedByMultiplicityExtension MULTIEXTENSION_EDEFAULT = SolvedByMultiplicityExtension.NORMAL;

	/**
	 * The cached value of the '{@link #getMultiextension() <em>Multiextension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiextension()
	 * @generated
	 * @ordered
	 */
	protected SolvedByMultiplicityExtension multiextension = MULTIEXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolvedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOLVED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposableSpinalElement getParentSpinalElement() {
		if (eContainerFeatureID() != ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT) return null;
		return (DecomposableSpinalElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSpinalElement(DecomposableSpinalElement newParentSpinalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSpinalElement, ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSpinalElement(DecomposableSpinalElement newParentSpinalElement) {
		if (newParentSpinalElement != eInternalContainer() || (eContainerFeatureID() != ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT && newParentSpinalElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentSpinalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSpinalElement != null)
				msgs = ((InternalEObject)newParentSpinalElement).eInverseAdd(this, ModelPackage.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY, DecomposableSpinalElement.class, msgs);
			msgs = basicSetParentSpinalElement(newParentSpinalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT, newParentSpinalElement, newParentSpinalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedByTargetElement getChildSpinalelement() {
		if (childSpinalelement != null && childSpinalelement.eIsProxy()) {
			InternalEObject oldChildSpinalelement = (InternalEObject)childSpinalelement;
			childSpinalelement = (SolvedByTargetElement)eResolveProxy(oldChildSpinalelement);
			if (childSpinalelement != oldChildSpinalelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT, oldChildSpinalelement, childSpinalelement));
			}
		}
		return childSpinalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedByTargetElement basicGetChildSpinalelement() {
		return childSpinalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildSpinalelement(SolvedByTargetElement newChildSpinalelement, NotificationChain msgs) {
		SolvedByTargetElement oldChildSpinalelement = childSpinalelement;
		childSpinalelement = newChildSpinalelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT, oldChildSpinalelement, newChildSpinalelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildSpinalelement(SolvedByTargetElement newChildSpinalelement) {
		if (newChildSpinalelement != childSpinalelement) {
			NotificationChain msgs = null;
			if (childSpinalelement != null)
				msgs = ((InternalEObject)childSpinalelement).eInverseRemove(this, ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY, SolvedByTargetElement.class, msgs);
			if (newChildSpinalelement != null)
				msgs = ((InternalEObject)newChildSpinalelement).eInverseAdd(this, ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY, SolvedByTargetElement.class, msgs);
			msgs = basicSetChildSpinalelement(newChildSpinalelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT, newChildSpinalelement, newChildSpinalelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOLVED_BY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedByMultiplicityExtension getMultiextension() {
		return multiextension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiextension(SolvedByMultiplicityExtension newMultiextension) {
		SolvedByMultiplicityExtension oldMultiextension = multiextension;
		multiextension = newMultiextension == null ? MULTIEXTENSION_EDEFAULT : newMultiextension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOLVED_BY__MULTIEXTENSION, oldMultiextension, multiextension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSpinalElement((DecomposableSpinalElement)otherEnd, msgs);
			case ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT:
				if (childSpinalelement != null)
					msgs = ((InternalEObject)childSpinalelement).eInverseRemove(this, ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY, SolvedByTargetElement.class, msgs);
				return basicSetChildSpinalelement((SolvedByTargetElement)otherEnd, msgs);
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
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return basicSetParentSpinalElement(null, msgs);
			case ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT:
				return basicSetChildSpinalelement(null, msgs);
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
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY, DecomposableSpinalElement.class, msgs);
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
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return getParentSpinalElement();
			case ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT:
				if (resolve) return getChildSpinalelement();
				return basicGetChildSpinalelement();
			case ModelPackage.SOLVED_BY__CARDINALITY:
				return getCardinality();
			case ModelPackage.SOLVED_BY__MULTIEXTENSION:
				return getMultiextension();
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
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				setParentSpinalElement((DecomposableSpinalElement)newValue);
				return;
			case ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT:
				setChildSpinalelement((SolvedByTargetElement)newValue);
				return;
			case ModelPackage.SOLVED_BY__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case ModelPackage.SOLVED_BY__MULTIEXTENSION:
				setMultiextension((SolvedByMultiplicityExtension)newValue);
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
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				setParentSpinalElement((DecomposableSpinalElement)null);
				return;
			case ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT:
				setChildSpinalelement((SolvedByTargetElement)null);
				return;
			case ModelPackage.SOLVED_BY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case ModelPackage.SOLVED_BY__MULTIEXTENSION:
				setMultiextension(MULTIEXTENSION_EDEFAULT);
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
			case ModelPackage.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return getParentSpinalElement() != null;
			case ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT:
				return childSpinalelement != null;
			case ModelPackage.SOLVED_BY__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case ModelPackage.SOLVED_BY__MULTIEXTENSION:
				return multiextension != MULTIEXTENSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", multiextension: ");
		result.append(multiextension);
		result.append(')');
		return result.toString();
	}

} //SolvedByImpl
