/**
 */
package GSN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Context Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.InContextOf#getContextualElement <em>Contextual Element</em>}</li>
 *   <li>{@link GSN.InContextOf#getContextOfSpinalElement <em>Context Of Spinal Element</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getInContextOf()
 * @model annotation="gmf.link source='contextOfSpinalElement' target='contextualElement' style='solid' width='1' target.decoration='closedarrow' tool.small.path='GSN_tooling_icons/inTheContextOf.gif' tool.large.path='GSN_tooling_icons/inTheContextOf.gif' tool.small.bundle='GSN' tool.large.bundle='GSN'"
 * @generated
 */
public interface InContextOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Contextual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextual Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Element</em>' reference.
	 * @see #setContextualElement(InTheContextOfTargetElement)
	 * @see GSN.ModelPackage#getInContextOf_ContextualElement()
	 * @model required="true"
	 * @generated
	 */
	InTheContextOfTargetElement getContextualElement();

	/**
	 * Sets the value of the '{@link GSN.InContextOf#getContextualElement <em>Contextual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Element</em>' reference.
	 * @see #getContextualElement()
	 * @generated
	 */
	void setContextualElement(InTheContextOfTargetElement value);

	/**
	 * Returns the value of the '<em><b>Context Of Spinal Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN.DecomposableSpinalElement#getHasContext <em>Has Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Of Spinal Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Of Spinal Element</em>' container reference.
	 * @see #setContextOfSpinalElement(DecomposableSpinalElement)
	 * @see GSN.ModelPackage#getInContextOf_ContextOfSpinalElement()
	 * @see GSN.DecomposableSpinalElement#getHasContext
	 * @model opposite="hasContext" required="true" transient="false"
	 * @generated
	 */
	DecomposableSpinalElement getContextOfSpinalElement();

	/**
	 * Sets the value of the '{@link GSN.InContextOf#getContextOfSpinalElement <em>Context Of Spinal Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Of Spinal Element</em>' container reference.
	 * @see #getContextOfSpinalElement()
	 * @generated
	 */
	void setContextOfSpinalElement(DecomposableSpinalElement value);

} // InContextOf
