/**
 */
package GSN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solved By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}</li>
 *   <li>{@link GSN.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}</li>
 *   <li>{@link GSN.SolvedBy#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link GSN.SolvedBy#getMultiextension <em>Multiextension</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getSolvedBy()
 * @model annotation="gmf.link source='parentSpinalElement' label='cardinality' target='childSpinalelement' style='solid' width='1' target.decoration='filledclosedarrow' tool.small.path='GSN_tooling_icons/solvedBy.gif' tool.large.path='GSN_tooling_icons/solvedBy.gif' tool.small.bundle='GSN' tool.large.bundle='GSN'"
 * @generated
 */
public interface SolvedBy extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Spinal Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN.DecomposableSpinalElement#getChildSolvedBy <em>Child Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Spinal Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Spinal Element</em>' container reference.
	 * @see #setParentSpinalElement(DecomposableSpinalElement)
	 * @see GSN.ModelPackage#getSolvedBy_ParentSpinalElement()
	 * @see GSN.DecomposableSpinalElement#getChildSolvedBy
	 * @model opposite="childSolvedBy" required="true" transient="false"
	 * @generated
	 */
	DecomposableSpinalElement getParentSpinalElement();

	/**
	 * Sets the value of the '{@link GSN.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Spinal Element</em>' container reference.
	 * @see #getParentSpinalElement()
	 * @generated
	 */
	void setParentSpinalElement(DecomposableSpinalElement value);

	/**
	 * Returns the value of the '<em><b>Child Spinalelement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GSN.SolvedByTargetElement#getParentSolvedBy <em>Parent Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Spinalelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Spinalelement</em>' reference.
	 * @see #setChildSpinalelement(SolvedByTargetElement)
	 * @see GSN.ModelPackage#getSolvedBy_ChildSpinalelement()
	 * @see GSN.SolvedByTargetElement#getParentSolvedBy
	 * @model opposite="parentSolvedBy" required="true"
	 * @generated
	 */
	SolvedByTargetElement getChildSpinalelement();

	/**
	 * Sets the value of the '{@link GSN.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Spinalelement</em>' reference.
	 * @see #getChildSpinalelement()
	 * @generated
	 */
	void setChildSpinalelement(SolvedByTargetElement value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see GSN.ModelPackage#getSolvedBy_Cardinality()
	 * @model
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link GSN.SolvedBy#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Multiextension</b></em>' attribute.
	 * The literals are from the enumeration {@link GSN.SolvedByMultiplicityExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiextension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiextension</em>' attribute.
	 * @see GSN.SolvedByMultiplicityExtension
	 * @see #setMultiextension(SolvedByMultiplicityExtension)
	 * @see GSN.ModelPackage#getSolvedBy_Multiextension()
	 * @model
	 * @generated
	 */
	SolvedByMultiplicityExtension getMultiextension();

	/**
	 * Sets the value of the '{@link GSN.SolvedBy#getMultiextension <em>Multiextension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiextension</em>' attribute.
	 * @see GSN.SolvedByMultiplicityExtension
	 * @see #getMultiextension()
	 * @generated
	 */
	void setMultiextension(SolvedByMultiplicityExtension value);

} // SolvedBy
