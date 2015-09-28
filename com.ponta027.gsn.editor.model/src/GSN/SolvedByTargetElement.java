/**
 */
package GSN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solved By Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.SolvedByTargetElement#getParentSolvedBy <em>Parent Solved By</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getSolvedByTargetElement()
 * @model abstract="true"
 * @generated
 */
public interface SolvedByTargetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Solved By</b></em>' reference list.
	 * The list contents are of type {@link GSN.SolvedBy}.
	 * It is bidirectional and its opposite is '{@link GSN.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Solved By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Solved By</em>' reference list.
	 * @see GSN.ModelPackage#getSolvedByTargetElement_ParentSolvedBy()
	 * @see GSN.SolvedBy#getChildSpinalelement
	 * @model opposite="childSpinalelement"
	 * @generated
	 */
	EList<SolvedBy> getParentSolvedBy();

} // SolvedByTargetElement
