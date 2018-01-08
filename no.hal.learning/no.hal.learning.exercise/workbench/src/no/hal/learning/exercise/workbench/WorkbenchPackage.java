/**
 */
package no.hal.learning.exercise.workbench;

import no.hal.learning.exercise.ExercisePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see no.hal.learning.exercise.workbench.WorkbenchFactory
 * @model kind="package"
 * @generated
 */
public interface WorkbenchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workbench";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workbench";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkbenchPackage eINSTANCE = no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.WorkbenchTaskAnswerImpl <em>Task Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchTaskAnswerImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getWorkbenchTaskAnswer()
	 * @generated
	 */
	int WORKBENCH_TASK_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER__REQUIRED_COUNT = ExercisePackage.TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER__ELEMENT_ID = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER__ACTION = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER__TEXT = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER_FEATURE_COUNT = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER___ACCEPT__OBJECT = ExercisePackage.TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER___VALIDATE__OBJECT = ExercisePackage.TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER___CREATE_PROPOSAL = ExercisePackage.TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT = ExercisePackage.TASK_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_ANSWER_OPERATION_COUNT = ExercisePackage.TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.WorkbenchTaskEventImpl <em>Task Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchTaskEventImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getWorkbenchTaskEvent()
	 * @generated
	 */
	int WORKBENCH_TASK_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT__PROPOSAL = ExercisePackage.TASK_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT__TIMESTAMP = ExercisePackage.TASK_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT__COMPLETION = ExercisePackage.TASK_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT__ELEMENT_ID = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT__ACTION = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT_FEATURE_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT___GET_FEATURE_NAMES = ExercisePackage.TASK_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT___GET_FEATURE_VALUE__STRING = ExercisePackage.TASK_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT___HAS_FEATURE__STRING = ExercisePackage.TASK_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT___TO_FEATURE_LIST = ExercisePackage.TASK_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT___GET_TEXT = ExercisePackage.TASK_EVENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_TASK_EVENT_OPERATION_COUNT = ExercisePackage.TASK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.PartTaskAnswerImpl <em>Part Task Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.PartTaskAnswerImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPartTaskAnswer()
	 * @generated
	 */
	int PART_TASK_ANSWER = 2;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER__REQUIRED_COUNT = WORKBENCH_TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER__ELEMENT_ID = WORKBENCH_TASK_ANSWER__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER__ACTION = WORKBENCH_TASK_ANSWER__ACTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER__TEXT = WORKBENCH_TASK_ANSWER__TEXT;

	/**
	 * The feature id for the '<em><b>Input Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER__INPUT_URI = WORKBENCH_TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER_FEATURE_COUNT = WORKBENCH_TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER___ACCEPT__OBJECT = WORKBENCH_TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER___VALIDATE__OBJECT = WORKBENCH_TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER___CREATE_PROPOSAL = WORKBENCH_TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT = WORKBENCH_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Part Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_ANSWER_OPERATION_COUNT = WORKBENCH_TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.PartTaskProposalImpl <em>Part Task Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.PartTaskProposalImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPartTaskProposal()
	 * @generated
	 */
	int PART_TASK_PROPOSAL = 3;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Part Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = ExercisePackage.TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Part Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.PartTaskEventImpl <em>Part Task Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.PartTaskEventImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPartTaskEvent()
	 * @generated
	 */
	int PART_TASK_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT__PROPOSAL = WORKBENCH_TASK_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT__TIMESTAMP = WORKBENCH_TASK_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT__COMPLETION = WORKBENCH_TASK_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT__ELEMENT_ID = WORKBENCH_TASK_EVENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT__ACTION = WORKBENCH_TASK_EVENT__ACTION;

	/**
	 * The feature id for the '<em><b>Input Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT__INPUT_URI = WORKBENCH_TASK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT_FEATURE_COUNT = WORKBENCH_TASK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT___GET_FEATURE_NAMES = WORKBENCH_TASK_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT___GET_FEATURE_VALUE__STRING = WORKBENCH_TASK_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT___HAS_FEATURE__STRING = WORKBENCH_TASK_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT___TO_FEATURE_LIST = WORKBENCH_TASK_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT___GET_TEXT = WORKBENCH_TASK_EVENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Part Task Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_TASK_EVENT_OPERATION_COUNT = WORKBENCH_TASK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.PerspectiveTaskAnswerImpl <em>Perspective Task Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.PerspectiveTaskAnswerImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPerspectiveTaskAnswer()
	 * @generated
	 */
	int PERSPECTIVE_TASK_ANSWER = 5;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER__REQUIRED_COUNT = WORKBENCH_TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER__ELEMENT_ID = WORKBENCH_TASK_ANSWER__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER__ACTION = WORKBENCH_TASK_ANSWER__ACTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER__TEXT = WORKBENCH_TASK_ANSWER__TEXT;

	/**
	 * The number of structural features of the '<em>Perspective Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER_FEATURE_COUNT = WORKBENCH_TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER___ACCEPT__OBJECT = WORKBENCH_TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER___VALIDATE__OBJECT = WORKBENCH_TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER___CREATE_PROPOSAL = WORKBENCH_TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT = WORKBENCH_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Perspective Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_ANSWER_OPERATION_COUNT = WORKBENCH_TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.PerspectiveTaskProposalImpl <em>Perspective Task Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.PerspectiveTaskProposalImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPerspectiveTaskProposal()
	 * @generated
	 */
	int PERSPECTIVE_TASK_PROPOSAL = 6;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Perspective Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = ExercisePackage.TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Perspective Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_TASK_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.CommandExecutionAnswerImpl <em>Command Execution Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.CommandExecutionAnswerImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getCommandExecutionAnswer()
	 * @generated
	 */
	int COMMAND_EXECUTION_ANSWER = 7;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER__REQUIRED_COUNT = WORKBENCH_TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER__ELEMENT_ID = WORKBENCH_TASK_ANSWER__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER__ACTION = WORKBENCH_TASK_ANSWER__ACTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER__TEXT = WORKBENCH_TASK_ANSWER__TEXT;

	/**
	 * The number of structural features of the '<em>Command Execution Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER_FEATURE_COUNT = WORKBENCH_TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER___ACCEPT__OBJECT = WORKBENCH_TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER___VALIDATE__OBJECT = WORKBENCH_TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER___CREATE_PROPOSAL = WORKBENCH_TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER___ACCEPT_EVENT__TASKEVENT = WORKBENCH_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Command Execution Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_ANSWER_OPERATION_COUNT = WORKBENCH_TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.CommandExecutionProposalImpl <em>Command Execution Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.CommandExecutionProposalImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getCommandExecutionProposal()
	 * @generated
	 */
	int COMMAND_EXECUTION_PROPOSAL = 8;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Command Execution Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = ExercisePackage.TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Command Execution Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EXECUTION_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.DebugEventAnswerImpl <em>Debug Event Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.DebugEventAnswerImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getDebugEventAnswer()
	 * @generated
	 */
	int DEBUG_EVENT_ANSWER = 9;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER__REQUIRED_COUNT = WORKBENCH_TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER__ELEMENT_ID = WORKBENCH_TASK_ANSWER__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER__ACTION = WORKBENCH_TASK_ANSWER__ACTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER__TEXT = WORKBENCH_TASK_ANSWER__TEXT;

	/**
	 * The number of structural features of the '<em>Debug Event Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER_FEATURE_COUNT = WORKBENCH_TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER___ACCEPT__OBJECT = WORKBENCH_TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER___VALIDATE__OBJECT = WORKBENCH_TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER___CREATE_PROPOSAL = WORKBENCH_TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER___ACCEPT_EVENT__TASKEVENT = WORKBENCH_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Debug Event Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_ANSWER_OPERATION_COUNT = WORKBENCH_TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.DebugEventProposalImpl <em>Debug Event Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.DebugEventProposalImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getDebugEventProposal()
	 * @generated
	 */
	int DEBUG_EVENT_PROPOSAL = 10;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Debug Event Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = ExercisePackage.TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Debug Event Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_EVENT_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.BrowserEventAnswerImpl <em>Browser Event Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.BrowserEventAnswerImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getBrowserEventAnswer()
	 * @generated
	 */
	int BROWSER_EVENT_ANSWER = 11;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER__REQUIRED_COUNT = WORKBENCH_TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER__ELEMENT_ID = WORKBENCH_TASK_ANSWER__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER__ACTION = WORKBENCH_TASK_ANSWER__ACTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER__TEXT = WORKBENCH_TASK_ANSWER__TEXT;

	/**
	 * The number of structural features of the '<em>Browser Event Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER_FEATURE_COUNT = WORKBENCH_TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER___ACCEPT__OBJECT = WORKBENCH_TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER___VALIDATE__OBJECT = WORKBENCH_TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER___CREATE_PROPOSAL = WORKBENCH_TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER___ACCEPT_EVENT__TASKEVENT = WORKBENCH_TASK_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Browser Event Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_ANSWER_OPERATION_COUNT = WORKBENCH_TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workbench.impl.BrowserEventProposalImpl <em>Browser Event Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workbench.impl.BrowserEventProposalImpl
	 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getBrowserEventProposal()
	 * @generated
	 */
	int BROWSER_EVENT_PROPOSAL = 12;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Browser Event Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = ExercisePackage.TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Browser Event Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_EVENT_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.WorkbenchTaskAnswer <em>Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Answer</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskAnswer
	 * @generated
	 */
	EClass getWorkbenchTaskAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.WorkbenchTaskAnswer#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskAnswer#getElementId()
	 * @see #getWorkbenchTaskAnswer()
	 * @generated
	 */
	EAttribute getWorkbenchTaskAnswer_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.WorkbenchTaskAnswer#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskAnswer#getAction()
	 * @see #getWorkbenchTaskAnswer()
	 * @generated
	 */
	EAttribute getWorkbenchTaskAnswer_Action();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.WorkbenchTaskAnswer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskAnswer#getText()
	 * @see #getWorkbenchTaskAnswer()
	 * @generated
	 */
	EAttribute getWorkbenchTaskAnswer_Text();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent <em>Task Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Event</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskEvent
	 * @generated
	 */
	EClass getWorkbenchTaskEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getElementId()
	 * @see #getWorkbenchTaskEvent()
	 * @generated
	 */
	EAttribute getWorkbenchTaskEvent_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getAction()
	 * @see #getWorkbenchTaskEvent()
	 * @generated
	 */
	EAttribute getWorkbenchTaskEvent_Action();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.PartTaskAnswer <em>Part Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Task Answer</em>'.
	 * @see no.hal.learning.exercise.workbench.PartTaskAnswer
	 * @generated
	 */
	EClass getPartTaskAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.PartTaskAnswer#getInputUri <em>Input Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Uri</em>'.
	 * @see no.hal.learning.exercise.workbench.PartTaskAnswer#getInputUri()
	 * @see #getPartTaskAnswer()
	 * @generated
	 */
	EAttribute getPartTaskAnswer_InputUri();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.PartTaskProposal <em>Part Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Task Proposal</em>'.
	 * @see no.hal.learning.exercise.workbench.PartTaskProposal
	 * @generated
	 */
	EClass getPartTaskProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.PartTaskEvent <em>Part Task Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Task Event</em>'.
	 * @see no.hal.learning.exercise.workbench.PartTaskEvent
	 * @generated
	 */
	EClass getPartTaskEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workbench.PartTaskEvent#getInputUri <em>Input Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Uri</em>'.
	 * @see no.hal.learning.exercise.workbench.PartTaskEvent#getInputUri()
	 * @see #getPartTaskEvent()
	 * @generated
	 */
	EAttribute getPartTaskEvent_InputUri();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.PerspectiveTaskAnswer <em>Perspective Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective Task Answer</em>'.
	 * @see no.hal.learning.exercise.workbench.PerspectiveTaskAnswer
	 * @generated
	 */
	EClass getPerspectiveTaskAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.PerspectiveTaskProposal <em>Perspective Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective Task Proposal</em>'.
	 * @see no.hal.learning.exercise.workbench.PerspectiveTaskProposal
	 * @generated
	 */
	EClass getPerspectiveTaskProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.CommandExecutionAnswer <em>Command Execution Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Execution Answer</em>'.
	 * @see no.hal.learning.exercise.workbench.CommandExecutionAnswer
	 * @generated
	 */
	EClass getCommandExecutionAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.CommandExecutionProposal <em>Command Execution Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Execution Proposal</em>'.
	 * @see no.hal.learning.exercise.workbench.CommandExecutionProposal
	 * @generated
	 */
	EClass getCommandExecutionProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.DebugEventAnswer <em>Debug Event Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debug Event Answer</em>'.
	 * @see no.hal.learning.exercise.workbench.DebugEventAnswer
	 * @generated
	 */
	EClass getDebugEventAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.DebugEventProposal <em>Debug Event Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debug Event Proposal</em>'.
	 * @see no.hal.learning.exercise.workbench.DebugEventProposal
	 * @generated
	 */
	EClass getDebugEventProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.BrowserEventAnswer <em>Browser Event Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser Event Answer</em>'.
	 * @see no.hal.learning.exercise.workbench.BrowserEventAnswer
	 * @generated
	 */
	EClass getBrowserEventAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workbench.BrowserEventProposal <em>Browser Event Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser Event Proposal</em>'.
	 * @see no.hal.learning.exercise.workbench.BrowserEventProposal
	 * @generated
	 */
	EClass getBrowserEventProposal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkbenchFactory getWorkbenchFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.WorkbenchTaskAnswerImpl <em>Task Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchTaskAnswerImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getWorkbenchTaskAnswer()
		 * @generated
		 */
		EClass WORKBENCH_TASK_ANSWER = eINSTANCE.getWorkbenchTaskAnswer();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKBENCH_TASK_ANSWER__ELEMENT_ID = eINSTANCE.getWorkbenchTaskAnswer_ElementId();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKBENCH_TASK_ANSWER__ACTION = eINSTANCE.getWorkbenchTaskAnswer_Action();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKBENCH_TASK_ANSWER__TEXT = eINSTANCE.getWorkbenchTaskAnswer_Text();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.WorkbenchTaskEventImpl <em>Task Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchTaskEventImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getWorkbenchTaskEvent()
		 * @generated
		 */
		EClass WORKBENCH_TASK_EVENT = eINSTANCE.getWorkbenchTaskEvent();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKBENCH_TASK_EVENT__ELEMENT_ID = eINSTANCE.getWorkbenchTaskEvent_ElementId();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKBENCH_TASK_EVENT__ACTION = eINSTANCE.getWorkbenchTaskEvent_Action();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.PartTaskAnswerImpl <em>Part Task Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.PartTaskAnswerImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPartTaskAnswer()
		 * @generated
		 */
		EClass PART_TASK_ANSWER = eINSTANCE.getPartTaskAnswer();

		/**
		 * The meta object literal for the '<em><b>Input Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_TASK_ANSWER__INPUT_URI = eINSTANCE.getPartTaskAnswer_InputUri();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.PartTaskProposalImpl <em>Part Task Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.PartTaskProposalImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPartTaskProposal()
		 * @generated
		 */
		EClass PART_TASK_PROPOSAL = eINSTANCE.getPartTaskProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.PartTaskEventImpl <em>Part Task Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.PartTaskEventImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPartTaskEvent()
		 * @generated
		 */
		EClass PART_TASK_EVENT = eINSTANCE.getPartTaskEvent();

		/**
		 * The meta object literal for the '<em><b>Input Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_TASK_EVENT__INPUT_URI = eINSTANCE.getPartTaskEvent_InputUri();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.PerspectiveTaskAnswerImpl <em>Perspective Task Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.PerspectiveTaskAnswerImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPerspectiveTaskAnswer()
		 * @generated
		 */
		EClass PERSPECTIVE_TASK_ANSWER = eINSTANCE.getPerspectiveTaskAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.PerspectiveTaskProposalImpl <em>Perspective Task Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.PerspectiveTaskProposalImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getPerspectiveTaskProposal()
		 * @generated
		 */
		EClass PERSPECTIVE_TASK_PROPOSAL = eINSTANCE.getPerspectiveTaskProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.CommandExecutionAnswerImpl <em>Command Execution Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.CommandExecutionAnswerImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getCommandExecutionAnswer()
		 * @generated
		 */
		EClass COMMAND_EXECUTION_ANSWER = eINSTANCE.getCommandExecutionAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.CommandExecutionProposalImpl <em>Command Execution Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.CommandExecutionProposalImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getCommandExecutionProposal()
		 * @generated
		 */
		EClass COMMAND_EXECUTION_PROPOSAL = eINSTANCE.getCommandExecutionProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.DebugEventAnswerImpl <em>Debug Event Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.DebugEventAnswerImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getDebugEventAnswer()
		 * @generated
		 */
		EClass DEBUG_EVENT_ANSWER = eINSTANCE.getDebugEventAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.DebugEventProposalImpl <em>Debug Event Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.DebugEventProposalImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getDebugEventProposal()
		 * @generated
		 */
		EClass DEBUG_EVENT_PROPOSAL = eINSTANCE.getDebugEventProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.BrowserEventAnswerImpl <em>Browser Event Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.BrowserEventAnswerImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getBrowserEventAnswer()
		 * @generated
		 */
		EClass BROWSER_EVENT_ANSWER = eINSTANCE.getBrowserEventAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workbench.impl.BrowserEventProposalImpl <em>Browser Event Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workbench.impl.BrowserEventProposalImpl
		 * @see no.hal.learning.exercise.workbench.impl.WorkbenchPackageImpl#getBrowserEventProposal()
		 * @generated
		 */
		EClass BROWSER_EVENT_PROPOSAL = eINSTANCE.getBrowserEventProposal();

	}

} //WorkbenchPackage
