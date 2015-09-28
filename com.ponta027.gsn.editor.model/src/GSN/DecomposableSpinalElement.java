/**
 */
package GSN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposable Spinal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.DecomposableSpinalElement#getToBeDeveloped <em>To Be Developed</em>}</li>
 *   <li>{@link GSN.DecomposableSpinalElement#getChildSolvedBy <em>Child Solved By</em>}</li>
 *   <li>{@link GSN.DecomposableSpinalElement#getHasContext <em>Has Context</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getDecomposableSpinalElement()
 * @model abstract="true"
 * @generated
 */
public interface DecomposableSpinalElement extends SpinalElement {
	/**
	 * Returns the value of the '<em><b>To Be Developed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Developed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Developed</em>' attribute.
	 * @see #setToBeDeveloped(Boolean)
	 * @see GSN.ModelPackage#getDecomposableSpinalElement_ToBeDeveloped()
	 * @model default="false"
	 * @generated
	 */
	Boolean getToBeDeveloped();

	/**
	 * Sets the value of the '{@link GSN.DecomposableSpinalElement#getToBeDeveloped <em>To Be Developed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Developed</em>' attribute.
	 * @see #getToBeDeveloped()
	 * @generated
	 */
	void setToBeDeveloped(Boolean value);

	/**
	 * Returns the value of the '<em><b>Child Solved By</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.SolvedBy}.
	 * It is bidirectional and its opposite is '{@link GSN.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Solved By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Solved By</em>' containment reference list.
	 * @see GSN.ModelPackage#getDecomposableSpinalElement_ChildSolvedBy()
	 * @see GSN.SolvedBy#getParentSpinalElement
	 * @model opposite="parentSpinalElement" containment="true"
	 * @generated
	 */
	EList<SolvedBy> getChildSolvedBy();

	/**
	 * Returns the value of the '<em><b>Has Context</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.InContextOf}.
	 * It is bidirectional and its opposite is '{@link GSN.InContextOf#getContextOfSpinalElement <em>Context Of Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Context</em>' containment reference list.
	 * @see GSN.ModelPackage#getDecomposableSpinalElement_HasContext()
	 * @see GSN.InContextOf#getContextOfSpinalElement
	 * @model opposite="contextOfSpinalElement" containment="true"
	 * @generated
	 */
	EList<InContextOf> getHasContext();

} // DecomposableSpinalElement
