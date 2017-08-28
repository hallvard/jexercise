/**
 */
package no.hal.learning.exercise;

import no.hal.learning.fv.FvPackage;
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
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.AnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 11;

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
	int PROPOSAL = 12;

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
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskAnswerImpl <em>Task Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskAnswer()
	 * @generated
	 */
	int TASK_ANSWER = 13;

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
	int TASK_PROPOSAL = 14;

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
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___GET_TEXT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.TaskEventImpl <em>Task Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.TaskEventImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getTaskEvent()
	 * @generated
	 */
	int TASK_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT__PROPOSAL = FvPackage.EFEATURE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT__TIMESTAMP = FvPackage.EFEATURE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT__COMPLETION = FvPackage.EFEATURE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT_FEATURE_COUNT = FvPackage.EFEATURE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT___GET_FEATURE_NAMES = FvPackage.EFEATURE_OBJECT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT___GET_FEATURE_VALUE__STRING = FvPackage.EFEATURE_OBJECT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT___HAS_FEATURE__STRING = FvPackage.EFEATURE_OBJECT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT___TO_FEATURE_LIST = FvPackage.EFEATURE_OBJECT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT___GET_TEXT = FvPackage.EFEATURE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EVENT_OPERATION_COUNT = FvPackage.EFEATURE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StringEditTaskProposalImpl <em>String Edit Task Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StringEditTaskProposalImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringEditTaskProposal()
	 * @generated
	 */
	int STRING_EDIT_TASK_PROPOSAL = 16;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__QUESTION = TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__ANSWER = TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__COMPLETION = TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__PROOF = TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__ATTEMPT_COUNT = TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__ATTEMPTS = TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL__PERFORMED_COUNT = TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>String Edit Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL_FEATURE_COUNT = TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL___GET_PROPOSAL = TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL___ACCEPT = TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL___VALIDATE = TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL___GET_TEXT = TASK_PROPOSAL___GET_TEXT;

	/**
	 * The number of operations of the '<em>String Edit Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_TASK_PROPOSAL_OPERATION_COUNT = TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StringEditAnswerImpl <em>String Edit Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StringEditAnswerImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringEditAnswer()
	 * @generated
	 */
	int STRING_EDIT_ANSWER = 17;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER__REQUIRED_COUNT = TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The number of structural features of the '<em>String Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER_FEATURE_COUNT = TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER___ACCEPT__OBJECT = TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER___VALIDATE__OBJECT = TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER___CREATE_PROPOSAL = TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Editor Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER___GET_EDITOR_PATH = TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_ANSWER_OPERATION_COUNT = TASK_ANSWER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.AbstractStringEditEventImpl <em>Abstract String Edit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.AbstractStringEditEventImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractStringEditEvent()
	 * @generated
	 */
	int ABSTRACT_STRING_EDIT_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT__PROPOSAL = TASK_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT__TIMESTAMP = TASK_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT__COMPLETION = TASK_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT__EDIT = TASK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT__MARKERS = TASK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract String Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT = TASK_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___GET_FEATURE_NAMES = TASK_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___GET_FEATURE_VALUE__STRING = TASK_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___HAS_FEATURE__STRING = TASK_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___TO_FEATURE_LIST = TASK_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___GET_TEXT = TASK_EVENT___GET_TEXT;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___GET_STRING = TASK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT = TASK_EVENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract String Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_EVENT_OPERATION_COUNT = TASK_EVENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.AbstractStringEditImpl <em>Abstract String Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.AbstractStringEditImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractStringEdit()
	 * @generated
	 */
	int ABSTRACT_STRING_EDIT = 19;

	/**
	 * The number of structural features of the '<em>Abstract String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT___GET_STRING = 0;

	/**
	 * The operation id for the '<em>Init String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT = 1;

	/**
	 * The number of operations of the '<em>Abstract String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_EDIT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.RelativeStringEditImpl <em>Relative String Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.RelativeStringEditImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getRelativeStringEdit()
	 * @generated
	 */
	int RELATIVE_STRING_EDIT = 20;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_STRING_EDIT__EDIT = ABSTRACT_STRING_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_STRING_EDIT_FEATURE_COUNT = ABSTRACT_STRING_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_STRING_EDIT___GET_STRING = ABSTRACT_STRING_EDIT___GET_STRING;

	/**
	 * The operation id for the '<em>Init String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT = ABSTRACT_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT;

	/**
	 * The number of operations of the '<em>Relative String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_STRING_EDIT_OPERATION_COUNT = ABSTRACT_STRING_EDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.StringEditImpl <em>String Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.StringEditImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringEdit()
	 * @generated
	 */
	int STRING_EDIT = 21;

	/**
	 * The feature id for the '<em><b>Stored String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT__STORED_STRING = ABSTRACT_STRING_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_FEATURE_COUNT = ABSTRACT_STRING_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT___GET_STRING = ABSTRACT_STRING_EDIT___GET_STRING;

	/**
	 * The operation id for the '<em>Init String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT = ABSTRACT_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT;

	/**
	 * The number of operations of the '<em>String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDIT_OPERATION_COUNT = ABSTRACT_STRING_EDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.ReplaceSubstringEditImpl <em>Replace Substring Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ReplaceSubstringEditImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getReplaceSubstringEdit()
	 * @generated
	 */
	int REPLACE_SUBSTRING_EDIT = 22;

	/**
	 * The feature id for the '<em><b>Stored String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT__STORED_STRING = STRING_EDIT__STORED_STRING;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT__EDIT = STRING_EDIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT__START = STRING_EDIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT__END = STRING_EDIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Replace Substring Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT_FEATURE_COUNT = STRING_EDIT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT___GET_STRING = STRING_EDIT___GET_STRING;

	/**
	 * The operation id for the '<em>Init String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT = STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT;

	/**
	 * The number of operations of the '<em>Replace Substring Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_SUBSTRING_EDIT_OPERATION_COUNT = STRING_EDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.impl.MarkerInfoImpl <em>Marker Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.MarkerInfoImpl
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getMarkerInfo()
	 * @generated
	 */
	int MARKER_INFO = 23;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_INFO__LINE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_INFO__CHAR_START = 1;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_INFO__CHAR_END = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_INFO__SEVERITY = 3;

	/**
	 * The number of structural features of the '<em>Marker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Marker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>ETimestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getETimestamp()
	 * @generated
	 */
	int ETIMESTAMP = 24;

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
	 * Returns the meta object for the '{@link no.hal.learning.exercise.TaskProposal#getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see no.hal.learning.exercise.TaskProposal#getText()
	 * @generated
	 */
	EOperation getTaskProposal__GetText();

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
	 * Returns the meta object for the container reference '{@link no.hal.learning.exercise.TaskEvent#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proposal</em>'.
	 * @see no.hal.learning.exercise.TaskEvent#getProposal()
	 * @see #getTaskEvent()
	 * @generated
	 */
	EReference getTaskEvent_Proposal();

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
	 * Returns the meta object for the '{@link no.hal.learning.exercise.TaskEvent#getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see no.hal.learning.exercise.TaskEvent#getText()
	 * @generated
	 */
	EOperation getTaskEvent__GetText();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StringEditTaskProposal <em>String Edit Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Edit Task Proposal</em>'.
	 * @see no.hal.learning.exercise.StringEditTaskProposal
	 * @generated
	 */
	EClass getStringEditTaskProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StringEditAnswer <em>String Edit Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Edit Answer</em>'.
	 * @see no.hal.learning.exercise.StringEditAnswer
	 * @generated
	 */
	EClass getStringEditAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.StringEditAnswer#getEditorPath() <em>Get Editor Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Editor Path</em>' operation.
	 * @see no.hal.learning.exercise.StringEditAnswer#getEditorPath()
	 * @generated
	 */
	EOperation getStringEditAnswer__GetEditorPath();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.AbstractStringEditEvent <em>Abstract String Edit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract String Edit Event</em>'.
	 * @see no.hal.learning.exercise.AbstractStringEditEvent
	 * @generated
	 */
	EClass getAbstractStringEditEvent();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.exercise.AbstractStringEditEvent#getEdit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edit</em>'.
	 * @see no.hal.learning.exercise.AbstractStringEditEvent#getEdit()
	 * @see #getAbstractStringEditEvent()
	 * @generated
	 */
	EReference getAbstractStringEditEvent_Edit();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.exercise.AbstractStringEditEvent#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see no.hal.learning.exercise.AbstractStringEditEvent#getMarkers()
	 * @see #getAbstractStringEditEvent()
	 * @generated
	 */
	EReference getAbstractStringEditEvent_Markers();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractStringEditEvent#getString() <em>Get String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get String</em>' operation.
	 * @see no.hal.learning.exercise.AbstractStringEditEvent#getString()
	 * @generated
	 */
	EOperation getAbstractStringEditEvent__GetString();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractStringEditEvent#createStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEditEvent) <em>Create String Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create String Edit</em>' operation.
	 * @see no.hal.learning.exercise.AbstractStringEditEvent#createStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEditEvent)
	 * @generated
	 */
	EOperation getAbstractStringEditEvent__CreateStringEdit__String_AbstractStringEditEvent();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.AbstractStringEdit <em>Abstract String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract String Edit</em>'.
	 * @see no.hal.learning.exercise.AbstractStringEdit
	 * @generated
	 */
	EClass getAbstractStringEdit();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractStringEdit#getString() <em>Get String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get String</em>' operation.
	 * @see no.hal.learning.exercise.AbstractStringEdit#getString()
	 * @generated
	 */
	EOperation getAbstractStringEdit__GetString();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.exercise.AbstractStringEdit#initStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEdit) <em>Init String Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init String Edit</em>' operation.
	 * @see no.hal.learning.exercise.AbstractStringEdit#initStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEdit)
	 * @generated
	 */
	EOperation getAbstractStringEdit__InitStringEdit__String_AbstractStringEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.RelativeStringEdit <em>Relative String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative String Edit</em>'.
	 * @see no.hal.learning.exercise.RelativeStringEdit
	 * @generated
	 */
	EClass getRelativeStringEdit();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.exercise.RelativeStringEdit#getEdit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edit</em>'.
	 * @see no.hal.learning.exercise.RelativeStringEdit#getEdit()
	 * @see #getRelativeStringEdit()
	 * @generated
	 */
	EReference getRelativeStringEdit_Edit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.StringEdit <em>String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Edit</em>'.
	 * @see no.hal.learning.exercise.StringEdit
	 * @generated
	 */
	EClass getStringEdit();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.StringEdit#getStoredString <em>Stored String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stored String</em>'.
	 * @see no.hal.learning.exercise.StringEdit#getStoredString()
	 * @see #getStringEdit()
	 * @generated
	 */
	EAttribute getStringEdit_StoredString();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.ReplaceSubstringEdit <em>Replace Substring Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Substring Edit</em>'.
	 * @see no.hal.learning.exercise.ReplaceSubstringEdit
	 * @generated
	 */
	EClass getReplaceSubstringEdit();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.ReplaceSubstringEdit#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see no.hal.learning.exercise.ReplaceSubstringEdit#getStart()
	 * @see #getReplaceSubstringEdit()
	 * @generated
	 */
	EAttribute getReplaceSubstringEdit_Start();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.ReplaceSubstringEdit#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see no.hal.learning.exercise.ReplaceSubstringEdit#getEnd()
	 * @see #getReplaceSubstringEdit()
	 * @generated
	 */
	EAttribute getReplaceSubstringEdit_End();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.MarkerInfo <em>Marker Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker Info</em>'.
	 * @see no.hal.learning.exercise.MarkerInfo
	 * @generated
	 */
	EClass getMarkerInfo();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.MarkerInfo#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see no.hal.learning.exercise.MarkerInfo#getLineNumber()
	 * @see #getMarkerInfo()
	 * @generated
	 */
	EAttribute getMarkerInfo_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.MarkerInfo#getCharStart <em>Char Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Start</em>'.
	 * @see no.hal.learning.exercise.MarkerInfo#getCharStart()
	 * @see #getMarkerInfo()
	 * @generated
	 */
	EAttribute getMarkerInfo_CharStart();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.MarkerInfo#getCharEnd <em>Char End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char End</em>'.
	 * @see no.hal.learning.exercise.MarkerInfo#getCharEnd()
	 * @see #getMarkerInfo()
	 * @generated
	 */
	EAttribute getMarkerInfo_CharEnd();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.MarkerInfo#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see no.hal.learning.exercise.MarkerInfo#getSeverity()
	 * @see #getMarkerInfo()
	 * @generated
	 */
	EAttribute getMarkerInfo_Severity();

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
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_PROPOSAL___GET_TEXT = eINSTANCE.getTaskProposal__GetText();

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
		 * The meta object literal for the '<em><b>Proposal</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EVENT__PROPOSAL = eINSTANCE.getTaskEvent_Proposal();

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
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_EVENT___GET_TEXT = eINSTANCE.getTaskEvent__GetText();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StringEditTaskProposalImpl <em>String Edit Task Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StringEditTaskProposalImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringEditTaskProposal()
		 * @generated
		 */
		EClass STRING_EDIT_TASK_PROPOSAL = eINSTANCE.getStringEditTaskProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StringEditAnswerImpl <em>String Edit Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StringEditAnswerImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringEditAnswer()
		 * @generated
		 */
		EClass STRING_EDIT_ANSWER = eINSTANCE.getStringEditAnswer();

		/**
		 * The meta object literal for the '<em><b>Get Editor Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_EDIT_ANSWER___GET_EDITOR_PATH = eINSTANCE.getStringEditAnswer__GetEditorPath();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.AbstractStringEditEventImpl <em>Abstract String Edit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.AbstractStringEditEventImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractStringEditEvent()
		 * @generated
		 */
		EClass ABSTRACT_STRING_EDIT_EVENT = eINSTANCE.getAbstractStringEditEvent();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STRING_EDIT_EVENT__EDIT = eINSTANCE.getAbstractStringEditEvent_Edit();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STRING_EDIT_EVENT__MARKERS = eINSTANCE.getAbstractStringEditEvent_Markers();

		/**
		 * The meta object literal for the '<em><b>Get String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STRING_EDIT_EVENT___GET_STRING = eINSTANCE.getAbstractStringEditEvent__GetString();

		/**
		 * The meta object literal for the '<em><b>Create String Edit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STRING_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT = eINSTANCE.getAbstractStringEditEvent__CreateStringEdit__String_AbstractStringEditEvent();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.AbstractStringEditImpl <em>Abstract String Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.AbstractStringEditImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getAbstractStringEdit()
		 * @generated
		 */
		EClass ABSTRACT_STRING_EDIT = eINSTANCE.getAbstractStringEdit();

		/**
		 * The meta object literal for the '<em><b>Get String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STRING_EDIT___GET_STRING = eINSTANCE.getAbstractStringEdit__GetString();

		/**
		 * The meta object literal for the '<em><b>Init String Edit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT = eINSTANCE.getAbstractStringEdit__InitStringEdit__String_AbstractStringEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.RelativeStringEditImpl <em>Relative String Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.RelativeStringEditImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getRelativeStringEdit()
		 * @generated
		 */
		EClass RELATIVE_STRING_EDIT = eINSTANCE.getRelativeStringEdit();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_STRING_EDIT__EDIT = eINSTANCE.getRelativeStringEdit_Edit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.StringEditImpl <em>String Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.StringEditImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getStringEdit()
		 * @generated
		 */
		EClass STRING_EDIT = eINSTANCE.getStringEdit();

		/**
		 * The meta object literal for the '<em><b>Stored String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EDIT__STORED_STRING = eINSTANCE.getStringEdit_StoredString();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.ReplaceSubstringEditImpl <em>Replace Substring Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.ReplaceSubstringEditImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getReplaceSubstringEdit()
		 * @generated
		 */
		EClass REPLACE_SUBSTRING_EDIT = eINSTANCE.getReplaceSubstringEdit();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_SUBSTRING_EDIT__START = eINSTANCE.getReplaceSubstringEdit_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_SUBSTRING_EDIT__END = eINSTANCE.getReplaceSubstringEdit_End();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.impl.MarkerInfoImpl <em>Marker Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.impl.MarkerInfoImpl
		 * @see no.hal.learning.exercise.impl.ExercisePackageImpl#getMarkerInfo()
		 * @generated
		 */
		EClass MARKER_INFO = eINSTANCE.getMarkerInfo();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER_INFO__LINE_NUMBER = eINSTANCE.getMarkerInfo_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Char Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER_INFO__CHAR_START = eINSTANCE.getMarkerInfo_CharStart();

		/**
		 * The meta object literal for the '<em><b>Char End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER_INFO__CHAR_END = eINSTANCE.getMarkerInfo_CharEnd();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER_INFO__SEVERITY = eINSTANCE.getMarkerInfo_Severity();

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
