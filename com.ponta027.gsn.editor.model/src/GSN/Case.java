/**
 */
package GSN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Case#getContains <em>Contains</em>}</li>
 *   <li>{@link GSN.Case#getAutoID <em>Auto ID</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getCase()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Case extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see GSN.ModelPackage#getCase_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getContains();

	/**
	 * Returns the value of the '<em><b>Auto ID</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto ID</em>' attribute.
	 * @see #setAutoID(Boolean)
	 * @see GSN.ModelPackage#getCase_AutoID()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAutoID();

	/**
	 * Sets the value of the '{@link GSN.Case#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto ID</em>' attribute.
	 * @see #getAutoID()
	 * @generated
	 */
	void setAutoID(Boolean value);

} // Case
