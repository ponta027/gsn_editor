/**
 */
package GSN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.AwayContext#getPointsTo <em>Points To</em>}</li>
 *   <li>{@link GSN.AwayContext#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @see GSN.ModelPackage#getAwayContext()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='gsnfigures.GSNAwayContext' tool.small.path='GSN_tooling_icons/AwayContext.gif' tool.large.path='GSN_tooling_icons/AwayContext.gif' tool.small.bundle='GSN' tool.large.bundle='GSN' size='120,80'"
 * @generated
 */
public interface AwayContext extends ContextualElement {
	/**
	 * Returns the value of the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points To</em>' reference.
	 * @see #setPointsTo(Goal)
	 * @see GSN.ModelPackage#getAwayContext_PointsTo()
	 * @model required="true"
	 * @generated
	 */
	Goal getPointsTo();

	/**
	 * Sets the value of the '{@link GSN.AwayContext#getPointsTo <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points To</em>' reference.
	 * @see #getPointsTo()
	 * @generated
	 */
	void setPointsTo(Goal value);

	/**
	 * Returns the value of the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Identifier</em>' attribute.
	 * @see #setModuleIdentifier(String)
	 * @see GSN.ModelPackage#getAwayContext_ModuleIdentifier()
	 * @model required="true"
	 *        annotation="gmf.label label='moduleIdentifier'"
	 * @generated
	 */
	String getModuleIdentifier();

	/**
	 * Sets the value of the '{@link GSN.AwayContext#getModuleIdentifier <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Identifier</em>' attribute.
	 * @see #getModuleIdentifier()
	 * @generated
	 */
	void setModuleIdentifier(String value);

} // AwayContext
