/**
 */
package GSN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.ModelElement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link GSN.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link GSN.ModelElement#getContainsAdditional <em>Contains Additional</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see GSN.ModelPackage#getModelElement_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link GSN.ModelElement#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see GSN.ModelPackage#getModelElement_Description()
	 * @model required="true"
	 *        annotation="gmf.label label='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link GSN.ModelElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contains Additional</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Additional</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Additional</em>' containment reference list.
	 * @see GSN.ModelPackage#getModelElement_ContainsAdditional()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaggedValue> getContainsAdditional();

} // ModelElement
