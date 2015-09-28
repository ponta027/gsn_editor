/**
 */
package GSN.impl;

import GSN.ArgumentElement;
import GSN.Goal;
import GSN.InContextOfModular;
import GSN.ModelPackage;
import GSN.Module;
import GSN.SolvedBy;
import GSN.SolvedByModular;
import GSN.SolvedByTargetElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.impl.ModuleImpl#getParentSolvedBy <em>Parent Solved By</em>}</li>
 *   <li>{@link GSN.impl.ModuleImpl#getParentModuleOf <em>Parent Module Of</em>}</li>
 *   <li>{@link GSN.impl.ModuleImpl#getAssociatedWithOther <em>Associated With Other</em>}</li>
 *   <li>{@link GSN.impl.ModuleImpl#getHasTopLevel <em>Has Top Level</em>}</li>
 *   <li>{@link GSN.impl.ModuleImpl#getContainsElement <em>Contains Element</em>}</li>
 *   <li>{@link GSN.impl.ModuleImpl#getParentSolvedByModular <em>Parent Solved By Modular</em>}</li>
 *   <li>{@link GSN.impl.ModuleImpl#getHasContext <em>Has Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModuleImpl extends ModelElementImpl implements Module {
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
	 * The cached value of the '{@link #getParentModuleOf() <em>Parent Module Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentModuleOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> parentModuleOf;

	/**
	 * The cached value of the '{@link #getAssociatedWithOther() <em>Associated With Other</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedWithOther()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> associatedWithOther;

	/**
	 * The cached value of the '{@link #getHasTopLevel() <em>Has Top Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTopLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> hasTopLevel;

	/**
	 * The cached value of the '{@link #getContainsElement() <em>Contains Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> containsElement;

	/**
	 * The cached value of the '{@link #getParentSolvedByModular() <em>Parent Solved By Modular</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSolvedByModular()
	 * @generated
	 * @ordered
	 */
	protected EList<SolvedByModular> parentSolvedByModular;

	/**
	 * The cached value of the '{@link #getHasContext() <em>Has Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasContext()
	 * @generated
	 * @ordered
	 */
	protected EList<InContextOfModular> hasContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolvedBy> getParentSolvedBy() {
		if (parentSolvedBy == null) {
			parentSolvedBy = new EObjectWithInverseResolvingEList<SolvedBy>(SolvedBy.class, this, ModelPackage.MODULE__PARENT_SOLVED_BY, ModelPackage.SOLVED_BY__CHILD_SPINALELEMENT);
		}
		return parentSolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getParentModuleOf() {
		if (parentModuleOf == null) {
			parentModuleOf = new EObjectResolvingEList<Module>(Module.class, this, ModelPackage.MODULE__PARENT_MODULE_OF);
		}
		return parentModuleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getAssociatedWithOther() {
		if (associatedWithOther == null) {
			associatedWithOther = new EObjectResolvingEList<Module>(Module.class, this, ModelPackage.MODULE__ASSOCIATED_WITH_OTHER);
		}
		return associatedWithOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getHasTopLevel() {
		if (hasTopLevel == null) {
			hasTopLevel = new EObjectContainmentWithInverseEList<Goal>(Goal.class, this, ModelPackage.MODULE__HAS_TOP_LEVEL, ModelPackage.GOAL__IS_TOP_LEVEL_GOAL_OF);
		}
		return hasTopLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getContainsElement() {
		if (containsElement == null) {
			containsElement = new EObjectWithInverseResolvingEList<ArgumentElement>(ArgumentElement.class, this, ModelPackage.MODULE__CONTAINS_ELEMENT, ModelPackage.ARGUMENT_ELEMENT__IS_PART_OF);
		}
		return containsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolvedByModular> getParentSolvedByModular() {
		if (parentSolvedByModular == null) {
			parentSolvedByModular = new EObjectContainmentWithInverseEList<SolvedByModular>(SolvedByModular.class, this, ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR, ModelPackage.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT);
		}
		return parentSolvedByModular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InContextOfModular> getHasContext() {
		if (hasContext == null) {
			hasContext = new EObjectContainmentWithInverseEList<InContextOfModular>(InContextOfModular.class, this, ModelPackage.MODULE__HAS_CONTEXT, ModelPackage.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT);
		}
		return hasContext;
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
			case ModelPackage.MODULE__PARENT_SOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentSolvedBy()).basicAdd(otherEnd, msgs);
			case ModelPackage.MODULE__HAS_TOP_LEVEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasTopLevel()).basicAdd(otherEnd, msgs);
			case ModelPackage.MODULE__CONTAINS_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsElement()).basicAdd(otherEnd, msgs);
			case ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentSolvedByModular()).basicAdd(otherEnd, msgs);
			case ModelPackage.MODULE__HAS_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasContext()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.MODULE__PARENT_SOLVED_BY:
				return ((InternalEList<?>)getParentSolvedBy()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODULE__HAS_TOP_LEVEL:
				return ((InternalEList<?>)getHasTopLevel()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODULE__CONTAINS_ELEMENT:
				return ((InternalEList<?>)getContainsElement()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR:
				return ((InternalEList<?>)getParentSolvedByModular()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODULE__HAS_CONTEXT:
				return ((InternalEList<?>)getHasContext()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.MODULE__PARENT_SOLVED_BY:
				return getParentSolvedBy();
			case ModelPackage.MODULE__PARENT_MODULE_OF:
				return getParentModuleOf();
			case ModelPackage.MODULE__ASSOCIATED_WITH_OTHER:
				return getAssociatedWithOther();
			case ModelPackage.MODULE__HAS_TOP_LEVEL:
				return getHasTopLevel();
			case ModelPackage.MODULE__CONTAINS_ELEMENT:
				return getContainsElement();
			case ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR:
				return getParentSolvedByModular();
			case ModelPackage.MODULE__HAS_CONTEXT:
				return getHasContext();
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
			case ModelPackage.MODULE__PARENT_SOLVED_BY:
				getParentSolvedBy().clear();
				getParentSolvedBy().addAll((Collection<? extends SolvedBy>)newValue);
				return;
			case ModelPackage.MODULE__PARENT_MODULE_OF:
				getParentModuleOf().clear();
				getParentModuleOf().addAll((Collection<? extends Module>)newValue);
				return;
			case ModelPackage.MODULE__ASSOCIATED_WITH_OTHER:
				getAssociatedWithOther().clear();
				getAssociatedWithOther().addAll((Collection<? extends Module>)newValue);
				return;
			case ModelPackage.MODULE__HAS_TOP_LEVEL:
				getHasTopLevel().clear();
				getHasTopLevel().addAll((Collection<? extends Goal>)newValue);
				return;
			case ModelPackage.MODULE__CONTAINS_ELEMENT:
				getContainsElement().clear();
				getContainsElement().addAll((Collection<? extends ArgumentElement>)newValue);
				return;
			case ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR:
				getParentSolvedByModular().clear();
				getParentSolvedByModular().addAll((Collection<? extends SolvedByModular>)newValue);
				return;
			case ModelPackage.MODULE__HAS_CONTEXT:
				getHasContext().clear();
				getHasContext().addAll((Collection<? extends InContextOfModular>)newValue);
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
			case ModelPackage.MODULE__PARENT_SOLVED_BY:
				getParentSolvedBy().clear();
				return;
			case ModelPackage.MODULE__PARENT_MODULE_OF:
				getParentModuleOf().clear();
				return;
			case ModelPackage.MODULE__ASSOCIATED_WITH_OTHER:
				getAssociatedWithOther().clear();
				return;
			case ModelPackage.MODULE__HAS_TOP_LEVEL:
				getHasTopLevel().clear();
				return;
			case ModelPackage.MODULE__CONTAINS_ELEMENT:
				getContainsElement().clear();
				return;
			case ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR:
				getParentSolvedByModular().clear();
				return;
			case ModelPackage.MODULE__HAS_CONTEXT:
				getHasContext().clear();
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
			case ModelPackage.MODULE__PARENT_SOLVED_BY:
				return parentSolvedBy != null && !parentSolvedBy.isEmpty();
			case ModelPackage.MODULE__PARENT_MODULE_OF:
				return parentModuleOf != null && !parentModuleOf.isEmpty();
			case ModelPackage.MODULE__ASSOCIATED_WITH_OTHER:
				return associatedWithOther != null && !associatedWithOther.isEmpty();
			case ModelPackage.MODULE__HAS_TOP_LEVEL:
				return hasTopLevel != null && !hasTopLevel.isEmpty();
			case ModelPackage.MODULE__CONTAINS_ELEMENT:
				return containsElement != null && !containsElement.isEmpty();
			case ModelPackage.MODULE__PARENT_SOLVED_BY_MODULAR:
				return parentSolvedByModular != null && !parentSolvedByModular.isEmpty();
			case ModelPackage.MODULE__HAS_CONTEXT:
				return hasContext != null && !hasContext.isEmpty();
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
				case ModelPackage.MODULE__PARENT_SOLVED_BY: return ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY;
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
				case ModelPackage.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY: return ModelPackage.MODULE__PARENT_SOLVED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModuleImpl
