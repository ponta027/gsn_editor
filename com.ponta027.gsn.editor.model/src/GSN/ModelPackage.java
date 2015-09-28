/**
 */
package GSN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GSN.ModelFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GSN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "GSN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GSN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = GSN.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link GSN.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.CaseImpl
	 * @see GSN.impl.ModelPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__AUTO_ID = 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ModelElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ModelElementImpl
	 * @see GSN.impl.ModelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONTAINS_ADDITIONAL = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ArgumentElementImpl
	 * @see GSN.impl.ModelPackageImpl#getArgumentElement()
	 * @generated
	 */
	int ARGUMENT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__IDENTIFIER = MODEL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__CONTAINS_ADDITIONAL = MODEL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__TOBEINSTANTIATED = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__IS_PART_OF = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.SolvedByTargetElementImpl <em>Solved By Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.SolvedByTargetElementImpl
	 * @see GSN.impl.ModelPackageImpl#getSolvedByTargetElement()
	 * @generated
	 */
	int SOLVED_BY_TARGET_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY = 0;

	/**
	 * The number of structural features of the '<em>Solved By Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_TARGET_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Solved By Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_TARGET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.InTheContextOfTargetElementImpl <em>In The Context Of Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.InTheContextOfTargetElementImpl
	 * @see GSN.impl.ModelPackageImpl#getInTheContextOfTargetElement()
	 * @generated
	 */
	int IN_THE_CONTEXT_OF_TARGET_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>In The Context Of Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_THE_CONTEXT_OF_TARGET_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>In The Context Of Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_THE_CONTEXT_OF_TARGET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.SolvedByModularImpl <em>Solved By Modular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.SolvedByModularImpl
	 * @see GSN.impl.ModelPackageImpl#getSolvedByModular()
	 * @generated
	 */
	int SOLVED_BY_MODULAR = 4;

	/**
	 * The feature id for the '<em><b>Child Solved By Modular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR = 0;

	/**
	 * The feature id for the '<em><b>Parent Solved By Module Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Solved By Modular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_MODULAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Solved By Modular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_MODULAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.InContextOfModularImpl <em>In Context Of Modular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.InContextOfModularImpl
	 * @see GSN.impl.ModelPackageImpl#getInContextOfModular()
	 * @generated
	 */
	int IN_CONTEXT_OF_MODULAR = 5;

	/**
	 * The feature id for the '<em><b>Parent In Conext Of Module Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Modular Contextual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>In Context Of Modular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_MODULAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>In Context Of Modular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_MODULAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.SpinalElementImpl <em>Spinal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.SpinalElementImpl
	 * @see GSN.impl.ModelPackageImpl#getSpinalElement()
	 * @generated
	 */
	int SPINAL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__CONTAINS_ADDITIONAL = ARGUMENT_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__TOBEINSTANTIATED = ARGUMENT_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__IS_PART_OF = ARGUMENT_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__PARENT_SOLVED_BY = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spinal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spinal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.DecomposableSpinalElementImpl <em>Decomposable Spinal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.DecomposableSpinalElementImpl
	 * @see GSN.impl.ModelPackageImpl#getDecomposableSpinalElement()
	 * @generated
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__TOBEINSTANTIATED = SPINAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>To Be Developed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Solved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT = SPINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decomposable Spinal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Decomposable Spinal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT_OPERATION_COUNT = SPINAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ContextualElementImpl <em>Contextual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ContextualElementImpl
	 * @see GSN.impl.ModelPackageImpl#getContextualElement()
	 * @generated
	 */
	int CONTEXTUAL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL = ARGUMENT_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__TOBEINSTANTIATED = ARGUMENT_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__IS_PART_OF = ARGUMENT_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Contextual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contextual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT_OPERATION_COUNT = ARGUMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.SolvedByImpl <em>Solved By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.SolvedByImpl
	 * @see GSN.impl.ModelPackageImpl#getSolvedBy()
	 * @generated
	 */
	int SOLVED_BY = 9;

	/**
	 * The feature id for the '<em><b>Parent Spinal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__PARENT_SPINAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Child Spinalelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__CHILD_SPINALELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Multiextension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__MULTIEXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Solved By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Solved By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.InContextOfImpl
	 * @see GSN.impl.ModelPackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 10;

	/**
	 * The feature id for the '<em><b>Contextual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CONTEXTUAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Context Of Spinal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.GoalImpl
	 * @see GSN.impl.ModelPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IDENTIFIER = DECOMPOSABLE_SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = DECOMPOSABLE_SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTAINS_ADDITIONAL = DECOMPOSABLE_SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TOBEINSTANTIATED = DECOMPOSABLE_SPINAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_PART_OF = DECOMPOSABLE_SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>To Be Developed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TO_BE_DEVELOPED = DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED;

	/**
	 * The feature id for the '<em><b>Child Solved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CHILD_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HAS_CONTEXT = DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__VISIBILITY = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Top Level Goal Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_TOP_LEVEL_GOAL_OF = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TO_BE_SUPPORTED_BY_CONTRACT = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = DECOMPOSABLE_SPINAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.StrategyImpl
	 * @see GSN.impl.ModelPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IDENTIFIER = DECOMPOSABLE_SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = DECOMPOSABLE_SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTAINS_ADDITIONAL = DECOMPOSABLE_SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__TOBEINSTANTIATED = DECOMPOSABLE_SPINAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_PART_OF = DECOMPOSABLE_SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__PARENT_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>To Be Developed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__TO_BE_DEVELOPED = DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED;

	/**
	 * The feature id for the '<em><b>Child Solved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CHILD_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__HAS_CONTEXT = DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = DECOMPOSABLE_SPINAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.SolutionImpl
	 * @see GSN.impl.ModelPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TOBEINSTANTIATED = SPINAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__VISIBILITY = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = SPINAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ContextImpl
	 * @see GSN.impl.ModelPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TOBEINSTANTIATED = CONTEXTUAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VISIBILITY = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = CONTEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.JustificationImpl
	 * @see GSN.impl.ModelPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__TOBEINSTANTIATED = CONTEXTUAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = CONTEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.AssumptionImpl
	 * @see GSN.impl.ModelPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TOBEINSTANTIATED = CONTEXTUAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = CONTEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.AwayContextImpl
	 * @see GSN.impl.ModelPackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__TOBEINSTANTIATED = CONTEXTUAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__POINTS_TO = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__MODULE_IDENTIFIER = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_OPERATION_COUNT = CONTEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.AwaySolutionImpl
	 * @see GSN.impl.ModelPackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 18;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__TOBEINSTANTIATED = SPINAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__POINTS_TO = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__MODULE_IDENTIFIER = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_OPERATION_COUNT = SPINAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.AwayGoalImpl
	 * @see GSN.impl.ModelPackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__TOBEINSTANTIATED = SPINAL_ELEMENT__TOBEINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__POINTS_TO = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__MODULE_IDENTIFIER = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_OPERATION_COUNT = SPINAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ModuleImpl
	 * @see GSN.impl.ModelPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IDENTIFIER = MODEL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONTAINS_ADDITIONAL = MODEL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_SOLVED_BY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Module Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_MODULE_OF = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associated With Other</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ASSOCIATED_WITH_OTHER = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Top Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HAS_TOP_LEVEL = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONTAINS_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Solved By Modular</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_SOLVED_BY_MODULAR = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HAS_CONTEXT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ArgumentModuleImpl <em>Argument Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ArgumentModuleImpl
	 * @see GSN.impl.ModelPackageImpl#getArgumentModule()
	 * @generated
	 */
	int ARGUMENT_MODULE = 21;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__IDENTIFIER = MODULE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__DESCRIPTION = MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__CONTAINS_ADDITIONAL = MODULE__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__PARENT_SOLVED_BY = MODULE__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Parent Module Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__PARENT_MODULE_OF = MODULE__PARENT_MODULE_OF;

	/**
	 * The feature id for the '<em><b>Associated With Other</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER = MODULE__ASSOCIATED_WITH_OTHER;

	/**
	 * The feature id for the '<em><b>Has Top Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__HAS_TOP_LEVEL = MODULE__HAS_TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Contains Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__CONTAINS_ELEMENT = MODULE__CONTAINS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Solved By Modular</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__PARENT_SOLVED_BY_MODULAR = MODULE__PARENT_SOLVED_BY_MODULAR;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__HAS_CONTEXT = MODULE__HAS_CONTEXT;

	/**
	 * The number of structural features of the '<em>Argument Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.ContractModuleImpl <em>Contract Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.ContractModuleImpl
	 * @see GSN.impl.ModelPackageImpl#getContractModule()
	 * @generated
	 */
	int CONTRACT_MODULE = 22;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IDENTIFIER = MODULE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__DESCRIPTION = MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__CONTAINS_ADDITIONAL = MODULE__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__PARENT_SOLVED_BY = MODULE__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Parent Module Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__PARENT_MODULE_OF = MODULE__PARENT_MODULE_OF;

	/**
	 * The feature id for the '<em><b>Associated With Other</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__ASSOCIATED_WITH_OTHER = MODULE__ASSOCIATED_WITH_OTHER;

	/**
	 * The feature id for the '<em><b>Has Top Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__HAS_TOP_LEVEL = MODULE__HAS_TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Contains Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__CONTAINS_ELEMENT = MODULE__CONTAINS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Solved By Modular</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__PARENT_SOLVED_BY_MODULAR = MODULE__PARENT_SOLVED_BY_MODULAR;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__HAS_CONTEXT = MODULE__HAS_CONTEXT;

	/**
	 * The number of structural features of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.impl.TaggedValueImpl
	 * @see GSN.impl.ModelPackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.ElementVisibility <em>Element Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.ElementVisibility
	 * @see GSN.impl.ModelPackageImpl#getElementVisibility()
	 * @generated
	 */
	int ELEMENT_VISIBILITY = 25;

	/**
	 * The meta object id for the '{@link GSN.SolvedByMultiplicityExtension <em>Solved By Multiplicity Extension</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.SolvedByMultiplicityExtension
	 * @see GSN.impl.ModelPackageImpl#getSolvedByMultiplicityExtension()
	 * @generated
	 */
	int SOLVED_BY_MULTIPLICITY_EXTENSION = 26;


	/**
	 * Returns the meta object for class '{@link GSN.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see GSN.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Case#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see GSN.Case#getContains()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Contains();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Case#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see GSN.Case#getAutoID()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_AutoID();

	/**
	 * Returns the meta object for class '{@link GSN.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element</em>'.
	 * @see GSN.ArgumentElement
	 * @generated
	 */
	EClass getArgumentElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.ArgumentElement#getTobeinstantiated <em>Tobeinstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tobeinstantiated</em>'.
	 * @see GSN.ArgumentElement#getTobeinstantiated()
	 * @see #getArgumentElement()
	 * @generated
	 */
	EAttribute getArgumentElement_Tobeinstantiated();

	/**
	 * Returns the meta object for the reference '{@link GSN.ArgumentElement#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of</em>'.
	 * @see GSN.ArgumentElement#getIsPartOf()
	 * @see #getArgumentElement()
	 * @generated
	 */
	EReference getArgumentElement_IsPartOf();

	/**
	 * Returns the meta object for class '{@link GSN.SolvedByTargetElement <em>Solved By Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solved By Target Element</em>'.
	 * @see GSN.SolvedByTargetElement
	 * @generated
	 */
	EClass getSolvedByTargetElement();

	/**
	 * Returns the meta object for the reference list '{@link GSN.SolvedByTargetElement#getParentSolvedBy <em>Parent Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Solved By</em>'.
	 * @see GSN.SolvedByTargetElement#getParentSolvedBy()
	 * @see #getSolvedByTargetElement()
	 * @generated
	 */
	EReference getSolvedByTargetElement_ParentSolvedBy();

	/**
	 * Returns the meta object for class '{@link GSN.InTheContextOfTargetElement <em>In The Context Of Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In The Context Of Target Element</em>'.
	 * @see GSN.InTheContextOfTargetElement
	 * @generated
	 */
	EClass getInTheContextOfTargetElement();

	/**
	 * Returns the meta object for class '{@link GSN.SolvedByModular <em>Solved By Modular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solved By Modular</em>'.
	 * @see GSN.SolvedByModular
	 * @generated
	 */
	EClass getSolvedByModular();

	/**
	 * Returns the meta object for the reference '{@link GSN.SolvedByModular#getChildSolvedByModular <em>Child Solved By Modular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Solved By Modular</em>'.
	 * @see GSN.SolvedByModular#getChildSolvedByModular()
	 * @see #getSolvedByModular()
	 * @generated
	 */
	EReference getSolvedByModular_ChildSolvedByModular();

	/**
	 * Returns the meta object for the container reference '{@link GSN.SolvedByModular#getParentSolvedByModuleElement <em>Parent Solved By Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Solved By Module Element</em>'.
	 * @see GSN.SolvedByModular#getParentSolvedByModuleElement()
	 * @see #getSolvedByModular()
	 * @generated
	 */
	EReference getSolvedByModular_ParentSolvedByModuleElement();

	/**
	 * Returns the meta object for class '{@link GSN.InContextOfModular <em>In Context Of Modular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of Modular</em>'.
	 * @see GSN.InContextOfModular
	 * @generated
	 */
	EClass getInContextOfModular();

	/**
	 * Returns the meta object for the container reference '{@link GSN.InContextOfModular#getParentInConextOfModuleElement <em>Parent In Conext Of Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent In Conext Of Module Element</em>'.
	 * @see GSN.InContextOfModular#getParentInConextOfModuleElement()
	 * @see #getInContextOfModular()
	 * @generated
	 */
	EReference getInContextOfModular_ParentInConextOfModuleElement();

	/**
	 * Returns the meta object for the reference '{@link GSN.InContextOfModular#getModularContextualElement <em>Modular Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modular Contextual Element</em>'.
	 * @see GSN.InContextOfModular#getModularContextualElement()
	 * @see #getInContextOfModular()
	 * @generated
	 */
	EReference getInContextOfModular_ModularContextualElement();

	/**
	 * Returns the meta object for class '{@link GSN.SpinalElement <em>Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinal Element</em>'.
	 * @see GSN.SpinalElement
	 * @generated
	 */
	EClass getSpinalElement();

	/**
	 * Returns the meta object for class '{@link GSN.DecomposableSpinalElement <em>Decomposable Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposable Spinal Element</em>'.
	 * @see GSN.DecomposableSpinalElement
	 * @generated
	 */
	EClass getDecomposableSpinalElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.DecomposableSpinalElement#getToBeDeveloped <em>To Be Developed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Developed</em>'.
	 * @see GSN.DecomposableSpinalElement#getToBeDeveloped()
	 * @see #getDecomposableSpinalElement()
	 * @generated
	 */
	EAttribute getDecomposableSpinalElement_ToBeDeveloped();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.DecomposableSpinalElement#getChildSolvedBy <em>Child Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Solved By</em>'.
	 * @see GSN.DecomposableSpinalElement#getChildSolvedBy()
	 * @see #getDecomposableSpinalElement()
	 * @generated
	 */
	EReference getDecomposableSpinalElement_ChildSolvedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.DecomposableSpinalElement#getHasContext <em>Has Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Context</em>'.
	 * @see GSN.DecomposableSpinalElement#getHasContext()
	 * @see #getDecomposableSpinalElement()
	 * @generated
	 */
	EReference getDecomposableSpinalElement_HasContext();

	/**
	 * Returns the meta object for class '{@link GSN.ContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Element</em>'.
	 * @see GSN.ContextualElement
	 * @generated
	 */
	EClass getContextualElement();

	/**
	 * Returns the meta object for class '{@link GSN.SolvedBy <em>Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solved By</em>'.
	 * @see GSN.SolvedBy
	 * @generated
	 */
	EClass getSolvedBy();

	/**
	 * Returns the meta object for the container reference '{@link GSN.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Spinal Element</em>'.
	 * @see GSN.SolvedBy#getParentSpinalElement()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EReference getSolvedBy_ParentSpinalElement();

	/**
	 * Returns the meta object for the reference '{@link GSN.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Spinalelement</em>'.
	 * @see GSN.SolvedBy#getChildSpinalelement()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EReference getSolvedBy_ChildSpinalelement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.SolvedBy#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see GSN.SolvedBy#getCardinality()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EAttribute getSolvedBy_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link GSN.SolvedBy#getMultiextension <em>Multiextension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiextension</em>'.
	 * @see GSN.SolvedBy#getMultiextension()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EAttribute getSolvedBy_Multiextension();

	/**
	 * Returns the meta object for class '{@link GSN.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see GSN.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for the reference '{@link GSN.InContextOf#getContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contextual Element</em>'.
	 * @see GSN.InContextOf#getContextualElement()
	 * @see #getInContextOf()
	 * @generated
	 */
	EReference getInContextOf_ContextualElement();

	/**
	 * Returns the meta object for the container reference '{@link GSN.InContextOf#getContextOfSpinalElement <em>Context Of Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context Of Spinal Element</em>'.
	 * @see GSN.InContextOf#getContextOfSpinalElement()
	 * @see #getInContextOf()
	 * @generated
	 */
	EReference getInContextOf_ContextOfSpinalElement();

	/**
	 * Returns the meta object for class '{@link GSN.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see GSN.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Goal#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see GSN.Goal#getVisibility()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link GSN.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Top Level Goal Of</em>'.
	 * @see GSN.Goal#getIsTopLevelGoalOf()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_IsTopLevelGoalOf();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Goal#getToBeSupportedByContract <em>To Be Supported By Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Supported By Contract</em>'.
	 * @see GSN.Goal#getToBeSupportedByContract()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_ToBeSupportedByContract();

	/**
	 * Returns the meta object for class '{@link GSN.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see GSN.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for class '{@link GSN.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see GSN.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Solution#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see GSN.Solution#getVisibility()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Visibility();

	/**
	 * Returns the meta object for class '{@link GSN.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see GSN.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Context#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see GSN.Context#getVisibility()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Visibility();

	/**
	 * Returns the meta object for class '{@link GSN.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see GSN.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link GSN.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see GSN.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link GSN.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see GSN.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for the reference '{@link GSN.AwayContext#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see GSN.AwayContext#getPointsTo()
	 * @see #getAwayContext()
	 * @generated
	 */
	EReference getAwayContext_PointsTo();

	/**
	 * Returns the meta object for the attribute '{@link GSN.AwayContext#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see GSN.AwayContext#getModuleIdentifier()
	 * @see #getAwayContext()
	 * @generated
	 */
	EAttribute getAwayContext_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link GSN.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see GSN.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for the reference '{@link GSN.AwaySolution#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see GSN.AwaySolution#getPointsTo()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EReference getAwaySolution_PointsTo();

	/**
	 * Returns the meta object for the attribute '{@link GSN.AwaySolution#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see GSN.AwaySolution#getModuleIdentifier()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EAttribute getAwaySolution_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link GSN.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see GSN.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for the reference '{@link GSN.AwayGoal#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see GSN.AwayGoal#getPointsTo()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EReference getAwayGoal_PointsTo();

	/**
	 * Returns the meta object for the attribute '{@link GSN.AwayGoal#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see GSN.AwayGoal#getModuleIdentifier()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EAttribute getAwayGoal_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link GSN.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see GSN.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Module#getParentModuleOf <em>Parent Module Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Module Of</em>'.
	 * @see GSN.Module#getParentModuleOf()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ParentModuleOf();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Module#getAssociatedWithOther <em>Associated With Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated With Other</em>'.
	 * @see GSN.Module#getAssociatedWithOther()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_AssociatedWithOther();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Module#getHasTopLevel <em>Has Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Top Level</em>'.
	 * @see GSN.Module#getHasTopLevel()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_HasTopLevel();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Module#getContainsElement <em>Contains Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Element</em>'.
	 * @see GSN.Module#getContainsElement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ContainsElement();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Module#getParentSolvedByModular <em>Parent Solved By Modular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Solved By Modular</em>'.
	 * @see GSN.Module#getParentSolvedByModular()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ParentSolvedByModular();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Module#getHasContext <em>Has Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Context</em>'.
	 * @see GSN.Module#getHasContext()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_HasContext();

	/**
	 * Returns the meta object for class '{@link GSN.ArgumentModule <em>Argument Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Module</em>'.
	 * @see GSN.ArgumentModule
	 * @generated
	 */
	EClass getArgumentModule();

	/**
	 * Returns the meta object for class '{@link GSN.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module</em>'.
	 * @see GSN.ContractModule
	 * @generated
	 */
	EClass getContractModule();

	/**
	 * Returns the meta object for class '{@link GSN.ModelElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see GSN.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.ModelElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see GSN.ModelElement#getIdentifier()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link GSN.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see GSN.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.ModelElement#getContainsAdditional <em>Contains Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Additional</em>'.
	 * @see GSN.ModelElement#getContainsAdditional()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_ContainsAdditional();

	/**
	 * Returns the meta object for class '{@link GSN.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see GSN.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link GSN.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see GSN.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link GSN.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GSN.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for enum '{@link GSN.ElementVisibility <em>Element Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Visibility</em>'.
	 * @see GSN.ElementVisibility
	 * @generated
	 */
	EEnum getElementVisibility();

	/**
	 * Returns the meta object for enum '{@link GSN.SolvedByMultiplicityExtension <em>Solved By Multiplicity Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Solved By Multiplicity Extension</em>'.
	 * @see GSN.SolvedByMultiplicityExtension
	 * @generated
	 */
	EEnum getSolvedByMultiplicityExtension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GSN.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.CaseImpl
		 * @see GSN.impl.ModelPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONTAINS = eINSTANCE.getCase_Contains();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__AUTO_ID = eINSTANCE.getCase_AutoID();

		/**
		 * The meta object literal for the '{@link GSN.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ArgumentElementImpl
		 * @see GSN.impl.ModelPackageImpl#getArgumentElement()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT = eINSTANCE.getArgumentElement();

		/**
		 * The meta object literal for the '<em><b>Tobeinstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_ELEMENT__TOBEINSTANTIATED = eINSTANCE.getArgumentElement_Tobeinstantiated();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ELEMENT__IS_PART_OF = eINSTANCE.getArgumentElement_IsPartOf();

		/**
		 * The meta object literal for the '{@link GSN.impl.SolvedByTargetElementImpl <em>Solved By Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.SolvedByTargetElementImpl
		 * @see GSN.impl.ModelPackageImpl#getSolvedByTargetElement()
		 * @generated
		 */
		EClass SOLVED_BY_TARGET_ELEMENT = eINSTANCE.getSolvedByTargetElement();

		/**
		 * The meta object literal for the '<em><b>Parent Solved By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY = eINSTANCE.getSolvedByTargetElement_ParentSolvedBy();

		/**
		 * The meta object literal for the '{@link GSN.impl.InTheContextOfTargetElementImpl <em>In The Context Of Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.InTheContextOfTargetElementImpl
		 * @see GSN.impl.ModelPackageImpl#getInTheContextOfTargetElement()
		 * @generated
		 */
		EClass IN_THE_CONTEXT_OF_TARGET_ELEMENT = eINSTANCE.getInTheContextOfTargetElement();

		/**
		 * The meta object literal for the '{@link GSN.impl.SolvedByModularImpl <em>Solved By Modular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.SolvedByModularImpl
		 * @see GSN.impl.ModelPackageImpl#getSolvedByModular()
		 * @generated
		 */
		EClass SOLVED_BY_MODULAR = eINSTANCE.getSolvedByModular();

		/**
		 * The meta object literal for the '<em><b>Child Solved By Modular</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR = eINSTANCE.getSolvedByModular_ChildSolvedByModular();

		/**
		 * The meta object literal for the '<em><b>Parent Solved By Module Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT = eINSTANCE.getSolvedByModular_ParentSolvedByModuleElement();

		/**
		 * The meta object literal for the '{@link GSN.impl.InContextOfModularImpl <em>In Context Of Modular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.InContextOfModularImpl
		 * @see GSN.impl.ModelPackageImpl#getInContextOfModular()
		 * @generated
		 */
		EClass IN_CONTEXT_OF_MODULAR = eINSTANCE.getInContextOfModular();

		/**
		 * The meta object literal for the '<em><b>Parent In Conext Of Module Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT = eINSTANCE.getInContextOfModular_ParentInConextOfModuleElement();

		/**
		 * The meta object literal for the '<em><b>Modular Contextual Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT = eINSTANCE.getInContextOfModular_ModularContextualElement();

		/**
		 * The meta object literal for the '{@link GSN.impl.SpinalElementImpl <em>Spinal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.SpinalElementImpl
		 * @see GSN.impl.ModelPackageImpl#getSpinalElement()
		 * @generated
		 */
		EClass SPINAL_ELEMENT = eINSTANCE.getSpinalElement();

		/**
		 * The meta object literal for the '{@link GSN.impl.DecomposableSpinalElementImpl <em>Decomposable Spinal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.DecomposableSpinalElementImpl
		 * @see GSN.impl.ModelPackageImpl#getDecomposableSpinalElement()
		 * @generated
		 */
		EClass DECOMPOSABLE_SPINAL_ELEMENT = eINSTANCE.getDecomposableSpinalElement();

		/**
		 * The meta object literal for the '<em><b>To Be Developed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED = eINSTANCE.getDecomposableSpinalElement_ToBeDeveloped();

		/**
		 * The meta object literal for the '<em><b>Child Solved By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY = eINSTANCE.getDecomposableSpinalElement_ChildSolvedBy();

		/**
		 * The meta object literal for the '<em><b>Has Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT = eINSTANCE.getDecomposableSpinalElement_HasContext();

		/**
		 * The meta object literal for the '{@link GSN.impl.ContextualElementImpl <em>Contextual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ContextualElementImpl
		 * @see GSN.impl.ModelPackageImpl#getContextualElement()
		 * @generated
		 */
		EClass CONTEXTUAL_ELEMENT = eINSTANCE.getContextualElement();

		/**
		 * The meta object literal for the '{@link GSN.impl.SolvedByImpl <em>Solved By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.SolvedByImpl
		 * @see GSN.impl.ModelPackageImpl#getSolvedBy()
		 * @generated
		 */
		EClass SOLVED_BY = eINSTANCE.getSolvedBy();

		/**
		 * The meta object literal for the '<em><b>Parent Spinal Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY__PARENT_SPINAL_ELEMENT = eINSTANCE.getSolvedBy_ParentSpinalElement();

		/**
		 * The meta object literal for the '<em><b>Child Spinalelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY__CHILD_SPINALELEMENT = eINSTANCE.getSolvedBy_ChildSpinalelement();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVED_BY__CARDINALITY = eINSTANCE.getSolvedBy_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Multiextension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVED_BY__MULTIEXTENSION = eINSTANCE.getSolvedBy_Multiextension();

		/**
		 * The meta object literal for the '{@link GSN.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.InContextOfImpl
		 * @see GSN.impl.ModelPackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '<em><b>Contextual Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF__CONTEXTUAL_ELEMENT = eINSTANCE.getInContextOf_ContextualElement();

		/**
		 * The meta object literal for the '<em><b>Context Of Spinal Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT = eINSTANCE.getInContextOf_ContextOfSpinalElement();

		/**
		 * The meta object literal for the '{@link GSN.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.GoalImpl
		 * @see GSN.impl.ModelPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__VISIBILITY = eINSTANCE.getGoal_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Top Level Goal Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__IS_TOP_LEVEL_GOAL_OF = eINSTANCE.getGoal_IsTopLevelGoalOf();

		/**
		 * The meta object literal for the '<em><b>To Be Supported By Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TO_BE_SUPPORTED_BY_CONTRACT = eINSTANCE.getGoal_ToBeSupportedByContract();

		/**
		 * The meta object literal for the '{@link GSN.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.StrategyImpl
		 * @see GSN.impl.ModelPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '{@link GSN.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.SolutionImpl
		 * @see GSN.impl.ModelPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__VISIBILITY = eINSTANCE.getSolution_Visibility();

		/**
		 * The meta object literal for the '{@link GSN.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ContextImpl
		 * @see GSN.impl.ModelPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__VISIBILITY = eINSTANCE.getContext_Visibility();

		/**
		 * The meta object literal for the '{@link GSN.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.JustificationImpl
		 * @see GSN.impl.ModelPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link GSN.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.AssumptionImpl
		 * @see GSN.impl.ModelPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link GSN.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.AwayContextImpl
		 * @see GSN.impl.ModelPackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_CONTEXT__POINTS_TO = eINSTANCE.getAwayContext_PointsTo();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_CONTEXT__MODULE_IDENTIFIER = eINSTANCE.getAwayContext_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link GSN.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.AwaySolutionImpl
		 * @see GSN.impl.ModelPackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_SOLUTION__POINTS_TO = eINSTANCE.getAwaySolution_PointsTo();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_SOLUTION__MODULE_IDENTIFIER = eINSTANCE.getAwaySolution_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link GSN.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.AwayGoalImpl
		 * @see GSN.impl.ModelPackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_GOAL__POINTS_TO = eINSTANCE.getAwayGoal_PointsTo();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_GOAL__MODULE_IDENTIFIER = eINSTANCE.getAwayGoal_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link GSN.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ModuleImpl
		 * @see GSN.impl.ModelPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Parent Module Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARENT_MODULE_OF = eINSTANCE.getModule_ParentModuleOf();

		/**
		 * The meta object literal for the '<em><b>Associated With Other</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ASSOCIATED_WITH_OTHER = eINSTANCE.getModule_AssociatedWithOther();

		/**
		 * The meta object literal for the '<em><b>Has Top Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__HAS_TOP_LEVEL = eINSTANCE.getModule_HasTopLevel();

		/**
		 * The meta object literal for the '<em><b>Contains Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONTAINS_ELEMENT = eINSTANCE.getModule_ContainsElement();

		/**
		 * The meta object literal for the '<em><b>Parent Solved By Modular</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARENT_SOLVED_BY_MODULAR = eINSTANCE.getModule_ParentSolvedByModular();

		/**
		 * The meta object literal for the '<em><b>Has Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__HAS_CONTEXT = eINSTANCE.getModule_HasContext();

		/**
		 * The meta object literal for the '{@link GSN.impl.ArgumentModuleImpl <em>Argument Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ArgumentModuleImpl
		 * @see GSN.impl.ModelPackageImpl#getArgumentModule()
		 * @generated
		 */
		EClass ARGUMENT_MODULE = eINSTANCE.getArgumentModule();

		/**
		 * The meta object literal for the '{@link GSN.impl.ContractModuleImpl <em>Contract Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ContractModuleImpl
		 * @see GSN.impl.ModelPackageImpl#getContractModule()
		 * @generated
		 */
		EClass CONTRACT_MODULE = eINSTANCE.getContractModule();

		/**
		 * The meta object literal for the '{@link GSN.impl.ModelElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.ModelElementImpl
		 * @see GSN.impl.ModelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__IDENTIFIER = eINSTANCE.getModelElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Contains Additional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CONTAINS_ADDITIONAL = eINSTANCE.getModelElement_ContainsAdditional();

		/**
		 * The meta object literal for the '{@link GSN.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.impl.TaggedValueImpl
		 * @see GSN.impl.ModelPackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__KEY = eINSTANCE.getTaggedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link GSN.ElementVisibility <em>Element Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.ElementVisibility
		 * @see GSN.impl.ModelPackageImpl#getElementVisibility()
		 * @generated
		 */
		EEnum ELEMENT_VISIBILITY = eINSTANCE.getElementVisibility();

		/**
		 * The meta object literal for the '{@link GSN.SolvedByMultiplicityExtension <em>Solved By Multiplicity Extension</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.SolvedByMultiplicityExtension
		 * @see GSN.impl.ModelPackageImpl#getSolvedByMultiplicityExtension()
		 * @generated
		 */
		EEnum SOLVED_BY_MULTIPLICITY_EXTENSION = eINSTANCE.getSolvedByMultiplicityExtension();

	}

} //ModelPackage
