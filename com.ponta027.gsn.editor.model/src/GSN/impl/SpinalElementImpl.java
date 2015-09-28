/**
 */
package GSN.impl;

import GSN.ModelPackage;
import GSN.SolvedBy;
import GSN.SolvedByTargetElement;
import GSN.SpinalElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.impl.SpinalElementImpl#getParentSolvedBy <em>Parent Solved By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpinalElementImpl extends ArgumentElementImpl implements SpinalElement {
	/**
	 * The cached value of the '{@link #getParentSolvedBy() <em>Parent Solved By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSolvedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SolvedBy> parentSolvedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpinalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SPINAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolvedBy> getParentSolvedBy() {
		if (parentSolvedBy == null) {
			parentSolvedBy = new EObjectWithInverseResolvingEList<SolvedBy>(SolvedBy.class, this, ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY, ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT);
		}
		return parentSolvedBy;
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
			case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentSolvedBy()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				return ((InternalEList<?>)getParentSolvedBy()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				return getParentSolvedBy();
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
			case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				getParentSolvedBy().clear();
				getParentSolvedBy().addAll((Collection<? extends SolvedBy>)newValue);
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
			case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				getParentSolvedBy().clear();
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
			case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				return parentSolvedBy != null && !parentSolvedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SolvedByTargetElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY: return ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SolvedByTargetElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY: return ModelPackage.SPINAL_ELEMENT__PARENT_SOLVED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SpinalElementImpl
