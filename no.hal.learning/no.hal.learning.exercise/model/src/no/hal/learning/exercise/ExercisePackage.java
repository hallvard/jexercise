/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see no.hal.learning.exercise.ExerciseFactory
 * @model kind="package"
 * @generated
 */
public interface ExercisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exercise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exercise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExercisePackage eINSTANCE = no.hal.learning.exercise.impl.ExercisePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ExerciseImpl <em>Exercise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExerciseImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercise()
	 * @generated
	 */
	int EXERCISE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__PARTS = 2;

	/**
	 * The number of structural features of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE___CREATE_PROPOSALS = 0;

	/**
	 * The number of operations of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ExerciseProposalsImpl <em>Proposals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExerciseProposalsImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExerciseProposals()
	 * @generated
	 */
	int EXERCISE_PROPOSALS = 1;

	/**
	 * The feature id for the '<em><b>Exercise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PROPOSALS__EXERCISE = 0;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PROPOSALS__PROPOSALS = 1;

	/**
	 * The feature id for the '<em><b>All Proposals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PROPOSALS__ALL_PROPOSALS = 2;

	/**
	 * The number of structural features of the '<em>Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PROPOSALS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PROPOSALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.AbstractExercisePartImpl <em>Abstract Exercise Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.AbstractExercisePartImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractExercisePart()
	 * @generated
	 */
	int ABSTRACT_EXERCISE_PART = 2;

	/**
	 * The number of structural features of the '<em>Abstract Exercise Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXERCISE_PART_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXERCISE_PART___GET_TASKS = 0;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXERCISE_PART___GET_TITLE = 1;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXERCISE_PART___CREATE_PROPOSALS = 2;

	/**
	 * The number of operations of the '<em>Abstract Exercise Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXERCISE_PART_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ExercisePartProposalsImpl <em>Part Proposals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExercisePartProposalsImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercisePartProposals()
	 * @generated
	 */
	int EXERCISE_PART_PROPOSALS = 3;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_PROPOSALS__PROPOSALS = 0;

	/**
	 * The feature id for the '<em><b>Exercise Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_PROPOSALS__EXERCISE_PART = 1;

	/**
	 * The number of structural features of the '<em>Part Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_PROPOSALS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_PROPOSALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ExercisePartRefImpl <em>Part Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExercisePartRefImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercisePartRef()
	 * @generated
	 */
	int EXERCISE_PART_REF = 4;

	/**
	 * The feature id for the '<em><b>Part Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_REF__PART_REF = ABSTRACT_EXERCISE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_REF_FEATURE_COUNT = ABSTRACT_EXERCISE_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_REF___GET_TASKS = ABSTRACT_EXERCISE_PART___GET_TASKS;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_REF___GET_TITLE = ABSTRACT_EXERCISE_PART___GET_TITLE;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_REF___CREATE_PROPOSALS = ABSTRACT_EXERCISE_PART___CREATE_PROPOSALS;

	/**
	 * The number of operations of the '<em>Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_REF_OPERATION_COUNT = ABSTRACT_EXERCISE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ExercisePartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExercisePartImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercisePart()
	 * @generated
	 */
	int EXERCISE_PART = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__NAME = ABSTRACT_EXERCISE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__TITLE = ABSTRACT_EXERCISE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__TASKS = ABSTRACT_EXERCISE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_FEATURE_COUNT = ABSTRACT_EXERCISE_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART___GET_TASKS = ABSTRACT_EXERCISE_PART___GET_TASKS;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART___GET_TITLE = ABSTRACT_EXERCISE_PART___GET_TITLE;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART___CREATE_PROPOSALS = ABSTRACT_EXERCISE_PART___CREATE_PROPOSALS;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_OPERATION_COUNT = ABSTRACT_EXERCISE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.AbstractTaskImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractTask()
	 * @generated
	 */
	int ABSTRACT_TASK = 6;

	/**
	 * The number of structural features of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK___GET_A = 0;

	/**
	 * The operation id for the '<em>Get Q</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK___GET_Q = 1;

	/**
	 * The number of operations of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskRefImpl <em>Task Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskRefImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskRef()
	 * @generated
	 */
	int TASK_REF = 7;

	/**
	 * The feature id for the '<em><b>Task Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF__TASK_REF = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF___GET_A = ABSTRACT_TASK___GET_A;

	/**
	 * The operation id for the '<em>Get Q</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF___GET_Q = ABSTRACT_TASK___GET_Q;

	/**
	 * The number of operations of the '<em>Task Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__Q = ABSTRACT_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__A = ABSTRACT_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_A = ABSTRACT_TASK___GET_A;

	/**
	 * The operation id for the '<em>Get Q</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_Q = ABSTRACT_TASK___GET_Q;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.QuestionImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 9;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StringQuestionImpl <em>String Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StringQuestionImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringQuestion()
	 * @generated
	 */
	int STRING_QUESTION = 10;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_QUESTION__QUESTION = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StyledStringImpl <em>Styled String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StyledStringImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStyledString()
	 * @generated
	 */
	int STYLED_STRING = 12;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StyledStringQuestionImpl <em>Styled String Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StyledStringQuestionImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStyledStringQuestion()
	 * @generated
	 */
	int STYLED_STRING_QUESTION = 11;

	/**
	 * The feature id for the '<em><b>Styled Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION__STYLED_STRINGS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Styled String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Styled String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Char Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__CHAR_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Effective Char Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__EFFECTIVE_CHAR_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Styled String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__STYLED_STRING = 3;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__SUFFIX = 4;

	/**
	 * The number of structural features of the '<em>Styled String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Styled String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.CharStyleImpl <em>Char Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.CharStyleImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getCharStyle()
	 * @generated
	 */
	int CHAR_STYLE = 13;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__ITALIC = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__BOLD = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__FOREGROUND = 4;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__BACKGROUND = 5;

	/**
	 * The number of structural features of the '<em>Char Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Char Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.AnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 14;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___ACCEPT__OBJECT = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___VALIDATE__OBJECT = 1;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___CREATE_PROPOSAL = 2;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ProposalImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getProposal()
	 * @generated
	 */
	int PROPOSAL = 15;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__ANSWER = 1;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL___GET_PROPOSAL = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL___ACCEPT = 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL___VALIDATE = 2;

	/**
	 * The number of operations of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.OptionAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOptionAnswer()
	 * @generated
	 */
	int OPTION_ANSWER = 16;

	/**
	 * The number of structural features of the '<em>Option Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___ACCEPT__OBJECT = ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___VALIDATE__OBJECT = ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___CREATE_PROPOSAL = ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Option Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.SimpleAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getSimpleAnswer()
	 * @generated
	 */
	int SIMPLE_ANSWER = 17;

	/**
	 * The number of structural features of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_FEATURE_COUNT = OPTION_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___ACCEPT__OBJECT = OPTION_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___VALIDATE__OBJECT = OPTION_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___CREATE_PROPOSAL = OPTION_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___GET_VALUE = OPTION_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_OPERATION_COUNT = OPTION_ANSWER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.SimpleProposalImpl <em>Simple Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.SimpleProposalImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getSimpleProposal()
	 * @generated
	 */
	int SIMPLE_PROPOSAL = 18;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__QUESTION = PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__ANSWER = PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__PROPOSAL = PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL_FEATURE_COUNT = PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___GET_PROPOSAL = PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___ACCEPT = PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___VALIDATE = PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Simple Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StringAnswerImpl <em>String Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StringAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringAnswer()
	 * @generated
	 */
	int STRING_ANSWER = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__FORMAT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__REGEXP = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__IGNORE_CASE = SIMPLE_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.NumberAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getNumberAnswer()
	 * @generated
	 */
	int NUMBER_ANSWER = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__ERROR_MARGIN = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__RANGE = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.NumberRangeImpl <em>Number Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.NumberRangeImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getNumberRange()
	 * @generated
	 */
	int NUMBER_RANGE = 21;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__STEP = 2;

	/**
	 * The number of structural features of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.BooleanAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getBooleanAnswer()
	 * @generated
	 */
	int BOOLEAN_ANSWER = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.OptionsAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOptionsAnswer()
	 * @generated
	 */
	int OPTIONS_ANSWER = 23;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER__OPTIONS = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___ACCEPT__OBJECT = ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___VALIDATE__OBJECT = ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___CREATE_PROPOSAL = ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.OptionsProposalImpl <em>Options Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.OptionsProposalImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOptionsProposal()
	 * @generated
	 */
	int OPTIONS_PROPOSAL = 24;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__QUESTION = PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__ANSWER = PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__INDICES = PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL_FEATURE_COUNT = PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___GET_PROPOSAL = PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___ACCEPT = PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___VALIDATE = PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Options Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.OptionImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 25;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CORRECT = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.SingleOptionsAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getSingleOptionsAnswer()
	 * @generated
	 */
	int SINGLE_OPTIONS_ANSWER = 26;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER__OPTIONS = OPTIONS_ANSWER__OPTIONS;

	/**
	 * The number of structural features of the '<em>Single Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER_FEATURE_COUNT = OPTIONS_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___ACCEPT__OBJECT = OPTIONS_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___VALIDATE__OBJECT = OPTIONS_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___CREATE_PROPOSAL = OPTIONS_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Single Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER_OPERATION_COUNT = OPTIONS_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ManyOptionsAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getManyOptionsAnswer()
	 * @generated
	 */
	int MANY_OPTIONS_ANSWER = 27;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER__OPTIONS = OPTIONS_ANSWER__OPTIONS;

	/**
	 * The number of structural features of the '<em>Many Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER_FEATURE_COUNT = OPTIONS_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___ACCEPT__OBJECT = OPTIONS_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___VALIDATE__OBJECT = OPTIONS_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___CREATE_PROPOSAL = OPTIONS_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Many Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER_OPERATION_COUNT = OPTIONS_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskAnswerImpl <em>Task Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskAnswer()
	 * @generated
	 */
	int TASK_ANSWER = 28;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER__REQUIRED_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER___ACCEPT__OBJECT = ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER___VALIDATE__OBJECT = ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER___CREATE_PROPOSAL = ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskProposalImpl <em>Task Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskProposalImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskProposal()
	 * @generated
	 */
	int TASK_PROPOSAL = 29;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__QUESTION = PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__ANSWER = PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__COMPLETION = PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__PROOF = PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__ATTEMPT_COUNT = PROPOSAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__ATTEMPTS = PROPOSAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__PERFORMED_COUNT = PROPOSAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL_FEATURE_COUNT = PROPOSAL_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___GET_PROPOSAL = PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___ACCEPT = PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___VALIDATE = PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskEventImpl <em>Task Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskEventImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskEvent()
	 * @generated
	 */
	int TASK_EVENT = 30;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT__COMPLETION = 1;

	/**
	 * The number of structural features of the '<em>Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>RGB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.util.RGB
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 31;

	/**
	 * The meta object id for the '<em>ETimestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getETimestamp()
	 * @generated
	 */
	int ETIMESTAMP = 32;

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise</em>'.
	 * @see no.hal.learning.exercise.Exercise
	 * @generated
	 */
	EClass getExercise();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.Exercise#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.learning.exercise.Exercise#getName()
	 * @see #getExercise()
	 * @generated
	 */
	EAttribute getExercise_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.Exercise#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.hal.learning.exercise.Exercise#getTitle()
	 * @see #getExercise()
	 * @generated
	 */
	EAttribute getExercise_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.Exercise#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see no.hal.learning.exercise.Exercise#getParts()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Parts();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Exercise#createProposals() <em>Create Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proposals</em>' operation.
	 * @see no.hal.learning.exercise.Exercise#createProposals()
	 * @generated
	 */
	EOperation getExercise__CreateProposals();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.ExerciseProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposals</em>'.
	 * @see no.hal.learning.exercise.ExerciseProposals
	 * @generated
	 */
	EClass getExerciseProposals();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.ExerciseProposals#getExercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exercise</em>'.
	 * @see no.hal.learning.exercise.ExerciseProposals#getExercise()
	 * @see #getExerciseProposals()
	 * @generated
	 */
	EReference getExerciseProposals_Exercise();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.ExerciseProposals#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see no.hal.learning.exercise.ExerciseProposals#getProposals()
	 * @see #getExerciseProposals()
	 * @generated
	 */
	EReference getExerciseProposals_Proposals();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.learning.exercise.ExerciseProposals#getAllProposals <em>All Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Proposals</em>'.
	 * @see no.hal.learning.exercise.ExerciseProposals#getAllProposals()
	 * @see #getExerciseProposals()
	 * @generated
	 */
	EReference getExerciseProposals_AllProposals();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.AbstractExercisePart <em>Abstract Exercise Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Exercise Part</em>'.
	 * @see no.hal.learning.exercise.AbstractExercisePart
	 * @generated
	 */
	EClass getAbstractExercisePart();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractExercisePart#getTasks() <em>Get Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tasks</em>' operation.
	 * @see no.hal.learning.exercise.AbstractExercisePart#getTasks()
	 * @generated
	 */
	EOperation getAbstractExercisePart__GetTasks();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractExercisePart#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see no.hal.learning.exercise.AbstractExercisePart#getTitle()
	 * @generated
	 */
	EOperation getAbstractExercisePart__GetTitle();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractExercisePart#createProposals() <em>Create Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proposals</em>' operation.
	 * @see no.hal.learning.exercise.AbstractExercisePart#createProposals()
	 * @generated
	 */
	EOperation getAbstractExercisePart__CreateProposals();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.ExercisePartProposals <em>Part Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Proposals</em>'.
	 * @see no.hal.learning.exercise.ExercisePartProposals
	 * @generated
	 */
	EClass getExercisePartProposals();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.ExercisePartProposals#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see no.hal.learning.exercise.ExercisePartProposals#getProposals()
	 * @see #getExercisePartProposals()
	 * @generated
	 */
	EReference getExercisePartProposals_Proposals();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.ExercisePartProposals#getExercisePart <em>Exercise Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exercise Part</em>'.
	 * @see no.hal.learning.exercise.ExercisePartProposals#getExercisePart()
	 * @see #getExercisePartProposals()
	 * @generated
	 */
	EReference getExercisePartProposals_ExercisePart();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.ExercisePartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Ref</em>'.
	 * @see no.hal.learning.exercise.ExercisePartRef
	 * @generated
	 */
	EClass getExercisePartRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.ExercisePartRef#getPartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part Ref</em>'.
	 * @see no.hal.learning.exercise.ExercisePartRef#getPartRef()
	 * @see #getExercisePartRef()
	 * @generated
	 */
	EReference getExercisePartRef_PartRef();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.ExercisePart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see no.hal.learning.exercise.ExercisePart
	 * @generated
	 */
	EClass getExercisePart();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.ExercisePart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.learning.exercise.ExercisePart#getName()
	 * @see #getExercisePart()
	 * @generated
	 */
	EAttribute getExercisePart_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.ExercisePart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.hal.learning.exercise.ExercisePart#getTitle()
	 * @see #getExercisePart()
	 * @generated
	 */
	EAttribute getExercisePart_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.ExercisePart#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see no.hal.learning.exercise.ExercisePart#getTasks()
	 * @see #getExercisePart()
	 * @generated
	 */
	EReference getExercisePart_Tasks();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Task</em>'.
	 * @see no.hal.learning.exercise.AbstractTask
	 * @generated
	 */
	EClass getAbstractTask();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractTask#getA() <em>Get A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get A</em>' operation.
	 * @see no.hal.learning.exercise.AbstractTask#getA()
	 * @generated
	 */
	EOperation getAbstractTask__GetA();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractTask#getQ() <em>Get Q</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Q</em>' operation.
	 * @see no.hal.learning.exercise.AbstractTask#getQ()
	 * @generated
	 */
	EOperation getAbstractTask__GetQ();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.TaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ref</em>'.
	 * @see no.hal.learning.exercise.TaskRef
	 * @generated
	 */
	EClass getTaskRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.TaskRef#getTaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Ref</em>'.
	 * @see no.hal.learning.exercise.TaskRef#getTaskRef()
	 * @see #getTaskRef()
	 * @generated
	 */
	EReference getTaskRef_TaskRef();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see no.hal.learning.exercise.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.learning.exercise.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.Task#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see no.hal.learning.exercise.Task#getQ()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Q();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.Task#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see no.hal.learning.exercise.Task#getA()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_A();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see no.hal.learning.exercise.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StringQuestion <em>String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Question</em>'.
	 * @see no.hal.learning.exercise.StringQuestion
	 * @generated
	 */
	EClass getStringQuestion();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StringQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.learning.exercise.StringQuestion#getQuestion()
	 * @see #getStringQuestion()
	 * @generated
	 */
	EAttribute getStringQuestion_Question();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StyledStringQuestion <em>Styled String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled String Question</em>'.
	 * @see no.hal.learning.exercise.StyledStringQuestion
	 * @generated
	 */
	EClass getStyledStringQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.StyledStringQuestion#getStyledStrings <em>Styled Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styled Strings</em>'.
	 * @see no.hal.learning.exercise.StyledStringQuestion#getStyledStrings()
	 * @see #getStyledStringQuestion()
	 * @generated
	 */
	EReference getStyledStringQuestion_StyledStrings();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled String</em>'.
	 * @see no.hal.learning.exercise.StyledString
	 * @generated
	 */
	EClass getStyledString();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.StyledString#getCharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char Style</em>'.
	 * @see no.hal.learning.exercise.StyledString#getCharStyle()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_CharStyle();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.StyledString#getEffectiveCharStyle <em>Effective Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Char Style</em>'.
	 * @see no.hal.learning.exercise.StyledString#getEffectiveCharStyle()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_EffectiveCharStyle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StyledString#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see no.hal.learning.exercise.StyledString#getPrefix()
	 * @see #getStyledString()
	 * @generated
	 */
	EAttribute getStyledString_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.StyledString#getStyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styled String</em>'.
	 * @see no.hal.learning.exercise.StyledString#getStyledString()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_StyledString();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StyledString#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see no.hal.learning.exercise.StyledString#getSuffix()
	 * @see #getStyledString()
	 * @generated
	 */
	EAttribute getStyledString_Suffix();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.CharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Style</em>'.
	 * @see no.hal.learning.exercise.CharStyle
	 * @generated
	 */
	EClass getCharStyle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.CharStyle#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see no.hal.learning.exercise.CharStyle#getItalic()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.CharStyle#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see no.hal.learning.exercise.CharStyle#getBold()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Bold();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.CharStyle#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.hal.learning.exercise.CharStyle#getSize()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Size();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.CharStyle#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see no.hal.learning.exercise.CharStyle#getFamily()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Family();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.CharStyle#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see no.hal.learning.exercise.CharStyle#getForeground()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Foreground();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.CharStyle#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see no.hal.learning.exercise.CharStyle#getBackground()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Background();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see no.hal.learning.exercise.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Answer#accept(java.lang.Object) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.learning.exercise.Answer#accept(java.lang.Object)
	 * @generated
	 */
	EOperation getAnswer__Accept__Object();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Answer#validate(java.lang.Object) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see no.hal.learning.exercise.Answer#validate(java.lang.Object)
	 * @generated
	 */
	EOperation getAnswer__Validate__Object();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Answer#createProposal() <em>Create Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proposal</em>' operation.
	 * @see no.hal.learning.exercise.Answer#createProposal()
	 * @generated
	 */
	EOperation getAnswer__CreateProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see no.hal.learning.exercise.Proposal
	 * @generated
	 */
	EClass getProposal();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.Proposal#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see no.hal.learning.exercise.Proposal#getQuestion()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Question();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.Proposal#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answer</em>'.
	 * @see no.hal.learning.exercise.Proposal#getAnswer()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Answer();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Proposal#getProposal() <em>Get Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Proposal</em>' operation.
	 * @see no.hal.learning.exercise.Proposal#getProposal()
	 * @generated
	 */
	EOperation getProposal__GetProposal();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Proposal#accept() <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.learning.exercise.Proposal#accept()
	 * @generated
	 */
	EOperation getProposal__Accept();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.Proposal#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see no.hal.learning.exercise.Proposal#validate()
	 * @generated
	 */
	EOperation getProposal__Validate();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.OptionAnswer <em>Option Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Answer</em>'.
	 * @see no.hal.learning.exercise.OptionAnswer
	 * @generated
	 */
	EClass getOptionAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.SimpleAnswer <em>Simple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Answer</em>'.
	 * @see no.hal.learning.exercise.SimpleAnswer
	 * @generated
	 */
	EClass getSimpleAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.SimpleAnswer#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see no.hal.learning.exercise.SimpleAnswer#getValue()
	 * @generated
	 */
	EOperation getSimpleAnswer__GetValue();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.SimpleProposal <em>Simple Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Proposal</em>'.
	 * @see no.hal.learning.exercise.SimpleProposal
	 * @generated
	 */
	EClass getSimpleProposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.SimpleProposal#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposal</em>'.
	 * @see no.hal.learning.exercise.SimpleProposal#getProposal()
	 * @see #getSimpleProposal()
	 * @generated
	 */
	EAttribute getSimpleProposal_Proposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StringAnswer <em>String Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Answer</em>'.
	 * @see no.hal.learning.exercise.StringAnswer
	 * @generated
	 */
	EClass getStringAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StringAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.exercise.StringAnswer#getValue()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StringAnswer#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see no.hal.learning.exercise.StringAnswer#getFormat()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Format();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StringAnswer#isRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see no.hal.learning.exercise.StringAnswer#isRegexp()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Regexp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StringAnswer#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see no.hal.learning.exercise.StringAnswer#isIgnoreCase()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.NumberAnswer <em>Number Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Answer</em>'.
	 * @see no.hal.learning.exercise.NumberAnswer
	 * @generated
	 */
	EClass getNumberAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.NumberAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.exercise.NumberAnswer#getValue()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.NumberAnswer#getErrorMargin <em>Error Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Margin</em>'.
	 * @see no.hal.learning.exercise.NumberAnswer#getErrorMargin()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_ErrorMargin();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.NumberAnswer#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see no.hal.learning.exercise.NumberAnswer#getRange()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EReference getNumberAnswer_Range();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.NumberRange <em>Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Range</em>'.
	 * @see no.hal.learning.exercise.NumberRange
	 * @generated
	 */
	EClass getNumberRange();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.NumberRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see no.hal.learning.exercise.NumberRange#getMin()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.NumberRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see no.hal.learning.exercise.NumberRange#getMax()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.NumberRange#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see no.hal.learning.exercise.NumberRange#getStep()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Step();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Answer</em>'.
	 * @see no.hal.learning.exercise.BooleanAnswer
	 * @generated
	 */
	EClass getBooleanAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.BooleanAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.exercise.BooleanAnswer#getValue()
	 * @see #getBooleanAnswer()
	 * @generated
	 */
	EAttribute getBooleanAnswer_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.OptionsAnswer <em>Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Answer</em>'.
	 * @see no.hal.learning.exercise.OptionsAnswer
	 * @generated
	 */
	EClass getOptionsAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.OptionsAnswer#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see no.hal.learning.exercise.OptionsAnswer#getOptions()
	 * @see #getOptionsAnswer()
	 * @generated
	 */
	EReference getOptionsAnswer_Options();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.OptionsProposal <em>Options Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Proposal</em>'.
	 * @see no.hal.learning.exercise.OptionsProposal
	 * @generated
	 */
	EClass getOptionsProposal();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.OptionsProposal#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Indices</em>'.
	 * @see no.hal.learning.exercise.OptionsProposal#getIndices()
	 * @see #getOptionsProposal()
	 * @generated
	 */
	EAttribute getOptionsProposal_Indices();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see no.hal.learning.exercise.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.Option#isCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct</em>'.
	 * @see no.hal.learning.exercise.Option#isCorrect()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Correct();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.Option#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see no.hal.learning.exercise.Option#getOption()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Option();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.SingleOptionsAnswer <em>Single Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Options Answer</em>'.
	 * @see no.hal.learning.exercise.SingleOptionsAnswer
	 * @generated
	 */
	EClass getSingleOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.ManyOptionsAnswer <em>Many Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Options Answer</em>'.
	 * @see no.hal.learning.exercise.ManyOptionsAnswer
	 * @generated
	 */
	EClass getManyOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.TaskAnswer <em>Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Answer</em>'.
	 * @see no.hal.learning.exercise.TaskAnswer
	 * @generated
	 */
	EClass getTaskAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskAnswer#getRequiredCount <em>Required Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Count</em>'.
	 * @see no.hal.learning.exercise.TaskAnswer#getRequiredCount()
	 * @see #getTaskAnswer()
	 * @generated
	 */
	EAttribute getTaskAnswer_RequiredCount();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.TaskProposal <em>Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Proposal</em>'.
	 * @see no.hal.learning.exercise.TaskProposal
	 * @generated
	 */
	EClass getTaskProposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskProposal#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion</em>'.
	 * @see no.hal.learning.exercise.TaskProposal#getCompletion()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_Completion();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskProposal#getProof <em>Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proof</em>'.
	 * @see no.hal.learning.exercise.TaskProposal#getProof()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_Proof();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskProposal#getAttemptCount <em>Attempt Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempt Count</em>'.
	 * @see no.hal.learning.exercise.TaskProposal#getAttemptCount()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_AttemptCount();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.TaskProposal#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attempts</em>'.
	 * @see no.hal.learning.exercise.TaskProposal#getAttempts()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EReference getTaskProposal_Attempts();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskProposal#getPerformedCount <em>Performed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performed Count</em>'.
	 * @see no.hal.learning.exercise.TaskProposal#getPerformedCount()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_PerformedCount();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.TaskEvent <em>Task Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Event</em>'.
	 * @see no.hal.learning.exercise.TaskEvent
	 * @generated
	 */
	EClass getTaskEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see no.hal.learning.exercise.TaskEvent#getTimestamp()
	 * @see #getTaskEvent()
	 * @generated
	 */
	EAttribute getTaskEvent_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.TaskEvent#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion</em>'.
	 * @see no.hal.learning.exercise.TaskEvent#getCompletion()
	 * @see #getTaskEvent()
	 * @generated
	 */
	EAttribute getTaskEvent_Completion();

	/**
	 * Returns the meta object for data type '{@link no.hal.learning.exercise.util.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB</em>'.
	 * @see no.hal.learning.exercise.util.RGB
	 * @model instanceClass="no.hal.learning.exercise.util.RGB"
	 * @generated
	 */
	EDataType getRGB();

	/**
	 * Returns the meta object for data type '<em>ETimestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ETimestamp</em>'.
	 * @model instanceClass="long"
	 * @generated
	 */
	EDataType getETimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExerciseFactory getExerciseFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ExerciseImpl <em>Exercise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ExerciseImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercise()
		 * @generated
		 */
		EClass EXERCISE = eINSTANCE.getExercise();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE__NAME = eINSTANCE.getExercise_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE__TITLE = eINSTANCE.getExercise_Title();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__PARTS = eINSTANCE.getExercise_Parts();

		/**
		 * The meta object literal for the '<em><b>Create Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXERCISE___CREATE_PROPOSALS = eINSTANCE.getExercise__CreateProposals();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ExerciseProposalsImpl <em>Proposals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ExerciseProposalsImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExerciseProposals()
		 * @generated
		 */
		EClass EXERCISE_PROPOSALS = eINSTANCE.getExerciseProposals();

		/**
		 * The meta object literal for the '<em><b>Exercise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PROPOSALS__EXERCISE = eINSTANCE.getExerciseProposals_Exercise();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PROPOSALS__PROPOSALS = eINSTANCE.getExerciseProposals_Proposals();

		/**
		 * The meta object literal for the '<em><b>All Proposals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PROPOSALS__ALL_PROPOSALS = eINSTANCE.getExerciseProposals_AllProposals();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.AbstractExercisePartImpl <em>Abstract Exercise Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.AbstractExercisePartImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractExercisePart()
		 * @generated
		 */
		EClass ABSTRACT_EXERCISE_PART = eINSTANCE.getAbstractExercisePart();

		/**
		 * The meta object literal for the '<em><b>Get Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EXERCISE_PART___GET_TASKS = eINSTANCE.getAbstractExercisePart__GetTasks();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EXERCISE_PART___GET_TITLE = eINSTANCE.getAbstractExercisePart__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Create Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EXERCISE_PART___CREATE_PROPOSALS = eINSTANCE.getAbstractExercisePart__CreateProposals();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ExercisePartProposalsImpl <em>Part Proposals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ExercisePartProposalsImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercisePartProposals()
		 * @generated
		 */
		EClass EXERCISE_PART_PROPOSALS = eINSTANCE.getExercisePartProposals();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PART_PROPOSALS__PROPOSALS = eINSTANCE.getExercisePartProposals_Proposals();

		/**
		 * The meta object literal for the '<em><b>Exercise Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PART_PROPOSALS__EXERCISE_PART = eINSTANCE.getExercisePartProposals_ExercisePart();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ExercisePartRefImpl <em>Part Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ExercisePartRefImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercisePartRef()
		 * @generated
		 */
		EClass EXERCISE_PART_REF = eINSTANCE.getExercisePartRef();

		/**
		 * The meta object literal for the '<em><b>Part Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PART_REF__PART_REF = eINSTANCE.getExercisePartRef_PartRef();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ExercisePartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ExercisePartImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getExercisePart()
		 * @generated
		 */
		EClass EXERCISE_PART = eINSTANCE.getExercisePart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE_PART__NAME = eINSTANCE.getExercisePart_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE_PART__TITLE = eINSTANCE.getExercisePart_Title();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_PART__TASKS = eINSTANCE.getExercisePart_Tasks();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.AbstractTaskImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractTask()
		 * @generated
		 */
		EClass ABSTRACT_TASK = eINSTANCE.getAbstractTask();

		/**
		 * The meta object literal for the '<em><b>Get A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TASK___GET_A = eINSTANCE.getAbstractTask__GetA();

		/**
		 * The meta object literal for the '<em><b>Get Q</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TASK___GET_Q = eINSTANCE.getAbstractTask__GetQ();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.TaskRefImpl <em>Task Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.TaskRefImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskRef()
		 * @generated
		 */
		EClass TASK_REF = eINSTANCE.getTaskRef();

		/**
		 * The meta object literal for the '<em><b>Task Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REF__TASK_REF = eINSTANCE.getTaskRef_TaskRef();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.TaskImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__Q = eINSTANCE.getTask_Q();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__A = eINSTANCE.getTask_A();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.QuestionImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StringQuestionImpl <em>String Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StringQuestionImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringQuestion()
		 * @generated
		 */
		EClass STRING_QUESTION = eINSTANCE.getStringQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_QUESTION__QUESTION = eINSTANCE.getStringQuestion_Question();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StyledStringQuestionImpl <em>Styled String Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StyledStringQuestionImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStyledStringQuestion()
		 * @generated
		 */
		EClass STYLED_STRING_QUESTION = eINSTANCE.getStyledStringQuestion();

		/**
		 * The meta object literal for the '<em><b>Styled Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING_QUESTION__STYLED_STRINGS = eINSTANCE.getStyledStringQuestion_StyledStrings();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StyledStringImpl <em>Styled String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StyledStringImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStyledString()
		 * @generated
		 */
		EClass STYLED_STRING = eINSTANCE.getStyledString();

		/**
		 * The meta object literal for the '<em><b>Char Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__CHAR_STYLE = eINSTANCE.getStyledString_CharStyle();

		/**
		 * The meta object literal for the '<em><b>Effective Char Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__EFFECTIVE_CHAR_STYLE = eINSTANCE.getStyledString_EffectiveCharStyle();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_STRING__PREFIX = eINSTANCE.getStyledString_Prefix();

		/**
		 * The meta object literal for the '<em><b>Styled String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__STYLED_STRING = eINSTANCE.getStyledString_StyledString();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_STRING__SUFFIX = eINSTANCE.getStyledString_Suffix();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.CharStyleImpl <em>Char Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.CharStyleImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getCharStyle()
		 * @generated
		 */
		EClass CHAR_STYLE = eINSTANCE.getCharStyle();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__ITALIC = eINSTANCE.getCharStyle_Italic();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__BOLD = eINSTANCE.getCharStyle_Bold();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__SIZE = eINSTANCE.getCharStyle_Size();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__FAMILY = eINSTANCE.getCharStyle_Family();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__FOREGROUND = eINSTANCE.getCharStyle_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__BACKGROUND = eINSTANCE.getCharStyle_Background();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.AnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___ACCEPT__OBJECT = eINSTANCE.getAnswer__Accept__Object();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___VALIDATE__OBJECT = eINSTANCE.getAnswer__Validate__Object();

		/**
		 * The meta object literal for the '<em><b>Create Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___CREATE_PROPOSAL = eINSTANCE.getAnswer__CreateProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ProposalImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getProposal()
		 * @generated
		 */
		EClass PROPOSAL = eINSTANCE.getProposal();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__QUESTION = eINSTANCE.getProposal_Question();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__ANSWER = eINSTANCE.getProposal_Answer();

		/**
		 * The meta object literal for the '<em><b>Get Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPOSAL___GET_PROPOSAL = eINSTANCE.getProposal__GetProposal();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPOSAL___ACCEPT = eINSTANCE.getProposal__Accept();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPOSAL___VALIDATE = eINSTANCE.getProposal__Validate();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.OptionAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOptionAnswer()
		 * @generated
		 */
		EClass OPTION_ANSWER = eINSTANCE.getOptionAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.SimpleAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getSimpleAnswer()
		 * @generated
		 */
		EClass SIMPLE_ANSWER = eINSTANCE.getSimpleAnswer();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_ANSWER___GET_VALUE = eINSTANCE.getSimpleAnswer__GetValue();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.SimpleProposalImpl <em>Simple Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.SimpleProposalImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getSimpleProposal()
		 * @generated
		 */
		EClass SIMPLE_PROPOSAL = eINSTANCE.getSimpleProposal();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PROPOSAL__PROPOSAL = eINSTANCE.getSimpleProposal_Proposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StringAnswerImpl <em>String Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StringAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringAnswer()
		 * @generated
		 */
		EClass STRING_ANSWER = eINSTANCE.getStringAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__VALUE = eINSTANCE.getStringAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__FORMAT = eINSTANCE.getStringAnswer_Format();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__REGEXP = eINSTANCE.getStringAnswer_Regexp();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__IGNORE_CASE = eINSTANCE.getStringAnswer_IgnoreCase();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.NumberAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getNumberAnswer()
		 * @generated
		 */
		EClass NUMBER_ANSWER = eINSTANCE.getNumberAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__VALUE = eINSTANCE.getNumberAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Error Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__ERROR_MARGIN = eINSTANCE.getNumberAnswer_ErrorMargin();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_ANSWER__RANGE = eINSTANCE.getNumberAnswer_Range();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.NumberRangeImpl <em>Number Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.NumberRangeImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getNumberRange()
		 * @generated
		 */
		EClass NUMBER_RANGE = eINSTANCE.getNumberRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__MIN = eINSTANCE.getNumberRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__MAX = eINSTANCE.getNumberRange_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__STEP = eINSTANCE.getNumberRange_Step();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.BooleanAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getBooleanAnswer()
		 * @generated
		 */
		EClass BOOLEAN_ANSWER = eINSTANCE.getBooleanAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ANSWER__VALUE = eINSTANCE.getBooleanAnswer_Value();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.OptionsAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOptionsAnswer()
		 * @generated
		 */
		EClass OPTIONS_ANSWER = eINSTANCE.getOptionsAnswer();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_ANSWER__OPTIONS = eINSTANCE.getOptionsAnswer_Options();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.OptionsProposalImpl <em>Options Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.OptionsProposalImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOptionsProposal()
		 * @generated
		 */
		EClass OPTIONS_PROPOSAL = eINSTANCE.getOptionsProposal();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_PROPOSAL__INDICES = eINSTANCE.getOptionsProposal_Indices();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.OptionImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__CORRECT = eINSTANCE.getOption_Correct();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__OPTION = eINSTANCE.getOption_Option();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.SingleOptionsAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getSingleOptionsAnswer()
		 * @generated
		 */
		EClass SINGLE_OPTIONS_ANSWER = eINSTANCE.getSingleOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ManyOptionsAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getManyOptionsAnswer()
		 * @generated
		 */
		EClass MANY_OPTIONS_ANSWER = eINSTANCE.getManyOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.TaskAnswerImpl <em>Task Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.TaskAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskAnswer()
		 * @generated
		 */
		EClass TASK_ANSWER = eINSTANCE.getTaskAnswer();

		/**
		 * The meta object literal for the '<em><b>Required Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ANSWER__REQUIRED_COUNT = eINSTANCE.getTaskAnswer_RequiredCount();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.TaskProposalImpl <em>Task Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.TaskProposalImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskProposal()
		 * @generated
		 */
		EClass TASK_PROPOSAL = eINSTANCE.getTaskProposal();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__COMPLETION = eINSTANCE.getTaskProposal_Completion();

		/**
		 * The meta object literal for the '<em><b>Proof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__PROOF = eINSTANCE.getTaskProposal_Proof();

		/**
		 * The meta object literal for the '<em><b>Attempt Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__ATTEMPT_COUNT = eINSTANCE.getTaskProposal_AttemptCount();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROPOSAL__ATTEMPTS = eINSTANCE.getTaskProposal_Attempts();

		/**
		 * The meta object literal for the '<em><b>Performed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__PERFORMED_COUNT = eINSTANCE.getTaskProposal_PerformedCount();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.TaskEventImpl <em>Task Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.TaskEventImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskEvent()
		 * @generated
		 */
		EClass TASK_EVENT = eINSTANCE.getTaskEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_EVENT__TIMESTAMP = eINSTANCE.getTaskEvent_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_EVENT__COMPLETION = eINSTANCE.getTaskEvent_Completion();

		/**
		 * The meta object literal for the '<em>RGB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.util.RGB
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getRGB()
		 * @generated
		 */
		EDataType RGB = eINSTANCE.getRGB();

		/**
		 * The meta object literal for the '<em>ETimestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getETimestamp()
		 * @generated
		 */
		EDataType ETIMESTAMP = eINSTANCE.getETimestamp();

	}

} //QuizPackage
