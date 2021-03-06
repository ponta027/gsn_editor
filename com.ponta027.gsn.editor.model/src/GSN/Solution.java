/**
 */
package GSN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Solution#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getSolution()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='gsnfigures.GSNSolution' tool.small.path='GSN_tooling_icons/Solution.gif' tool.large.path='GSN_tooling_icons/Solution.gif' tool.small.bundle='GSN' tool.large.bundle='GSN' size='100,100'"
 * @generated
 */
public interface Solution extends SpinalElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link GSN.ElementVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see GSN.ElementVisibility
	 * @see #setVisibility(ElementVisibility)
	 * @see GSN.ModelPackage#getSolution_Visibility()
	 * @model
	 * @generated
	 */
	ElementVisibility getVisibility();

	/**
	 * Sets the value of the '{@link GSN.Solution#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see GSN.ElementVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(ElementVisibility value);

} // Solution
