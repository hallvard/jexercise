/**
 */
package no.hal.learning.exercise.workspace;

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
 * @see no.hal.learning.exercise.workspace.WorkspaceFactory
 * @model kind="package"
 * @generated
 */
public interface WorkspacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workspace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.workspace/model/workspace-exercise.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workspace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkspacePackage eINSTANCE = no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workspace.impl.SourceFileEditAnswerImpl <em>Source File Edit Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workspace.impl.SourceFileEditAnswerImpl
	 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getSourceFileEditAnswer()
	 * @generated
	 */
	int SOURCE_FILE_EDIT_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER__REQUIRED_COUNT = ExercisePackage.STRING_EDIT_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source File Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER_FEATURE_COUNT = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER___ACCEPT__OBJECT = ExercisePackage.STRING_EDIT_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER___VALIDATE__OBJECT = ExercisePackage.STRING_EDIT_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER___CREATE_PROPOSAL = ExercisePackage.STRING_EDIT_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Editor Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER___GET_EDITOR_PATH = ExercisePackage.STRING_EDIT_ANSWER___GET_EDITOR_PATH;

	/**
	 * The number of operations of the '<em>Source File Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_ANSWER_OPERATION_COUNT = ExercisePackage.STRING_EDIT_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workspace.impl.SourceFileEditProposalImpl <em>Source File Edit Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workspace.impl.SourceFileEditProposalImpl
	 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getSourceFileEditProposal()
	 * @generated
	 */
	int SOURCE_FILE_EDIT_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__QUESTION = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__ANSWER = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__COMPLETION = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__PROOF = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__ATTEMPTS = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL__PERFORMED_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Source File Edit Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL_FEATURE_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL___GET_PROPOSAL = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL___ACCEPT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL___VALIDATE = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL___GET_TEXT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___GET_TEXT;

	/**
	 * The number of operations of the '<em>Source File Edit Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_PROPOSAL_OPERATION_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl <em>Source File Edit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl
	 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getSourceFileEditEvent()
	 * @generated
	 */
	int SOURCE_FILE_EDIT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__PROPOSAL = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__TIMESTAMP = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__COMPLETION = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__EDIT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__MARKERS = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__SOURCE_CODE = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__ERROR_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Warning Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT__WARNING_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Source File Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT_FEATURE_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___GET_FEATURE_NAMES = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___GET_FEATURE_VALUE__STRING = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___HAS_FEATURE__STRING = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___TO_FEATURE_LIST = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___GET_TEXT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_TEXT;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___GET_STRING = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_STRING;

	/**
	 * The operation id for the '<em>Create String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT;

	/**
	 * The number of operations of the '<em>Source File Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_EDIT_EVENT_OPERATION_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl <em>Launch Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl
	 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getLaunchAnswer()
	 * @generated
	 */
	int LAUNCH_ANSWER = 3;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER__REQUIRED_COUNT = ExercisePackage.TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER__MODE = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Launch Attr Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER__LAUNCH_ATTR_NAMES = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Launch Attr Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER__LAUNCH_ATTR_VALUES = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Launch Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER_FEATURE_COUNT = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER___ACCEPT__OBJECT = ExercisePackage.TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER___VALIDATE__OBJECT = ExercisePackage.TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER___CREATE_PROPOSAL = ExercisePackage.TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Launch Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_ANSWER_OPERATION_COUNT = ExercisePackage.TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workspace.impl.LaunchProposalImpl <em>Launch Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workspace.impl.LaunchProposalImpl
	 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getLaunchProposal()
	 * @generated
	 */
	int LAUNCH_PROPOSAL = 4;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Launch Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The number of operations of the '<em>Launch Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl <em>Launch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.workspace.impl.LaunchEventImpl
	 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getLaunchEvent()
	 * @generated
	 */
	int LAUNCH_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT__PROPOSAL = ExercisePackage.TASK_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT__TIMESTAMP = ExercisePackage.TASK_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT__COMPLETION = ExercisePackage.TASK_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT__MODE = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Launch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT_FEATURE_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT___GET_FEATURE_NAMES = ExercisePackage.TASK_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT___GET_FEATURE_VALUE__STRING = ExercisePackage.TASK_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT___HAS_FEATURE__STRING = ExercisePackage.TASK_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT___TO_FEATURE_LIST = ExercisePackage.TASK_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT___GET_TEXT = ExercisePackage.TASK_EVENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Launch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EVENT_OPERATION_COUNT = ExercisePackage.TASK_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workspace.SourceFileEditAnswer <em>Source File Edit Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Edit Answer</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditAnswer
	 * @generated
	 */
	EClass getSourceFileEditAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.SourceFileEditAnswer#getResourcePath <em>Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Path</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditAnswer#getResourcePath()
	 * @see #getSourceFileEditAnswer()
	 * @generated
	 */
	EAttribute getSourceFileEditAnswer_ResourcePath();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workspace.SourceFileEditProposal <em>Source File Edit Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Edit Proposal</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditProposal
	 * @generated
	 */
	EClass getSourceFileEditProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent <em>Source File Edit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File Edit Event</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditEvent
	 * @generated
	 */
	EClass getSourceFileEditEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getSourceCode <em>Source Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Code</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditEvent#getSourceCode()
	 * @see #getSourceFileEditEvent()
	 * @generated
	 */
	EAttribute getSourceFileEditEvent_SourceCode();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getSizeMeasure <em>Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Measure</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditEvent#getSizeMeasure()
	 * @see #getSourceFileEditEvent()
	 * @generated
	 */
	EAttribute getSourceFileEditEvent_SizeMeasure();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getErrorCount <em>Error Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Count</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditEvent#getErrorCount()
	 * @see #getSourceFileEditEvent()
	 * @generated
	 */
	EAttribute getSourceFileEditEvent_ErrorCount();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getWarningCount <em>Warning Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning Count</em>'.
	 * @see no.hal.learning.exercise.workspace.SourceFileEditEvent#getWarningCount()
	 * @see #getSourceFileEditEvent()
	 * @generated
	 */
	EAttribute getSourceFileEditEvent_WarningCount();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workspace.LaunchAnswer <em>Launch Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Answer</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchAnswer
	 * @generated
	 */
	EClass getLaunchAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.LaunchAnswer#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchAnswer#getMode()
	 * @see #getLaunchAnswer()
	 * @generated
	 */
	EAttribute getLaunchAnswer_Mode();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.workspace.LaunchAnswer#getLaunchAttrNames <em>Launch Attr Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Launch Attr Names</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchAnswer#getLaunchAttrNames()
	 * @see #getLaunchAnswer()
	 * @generated
	 */
	EAttribute getLaunchAnswer_LaunchAttrNames();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.workspace.LaunchAnswer#getLaunchAttrValues <em>Launch Attr Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Launch Attr Values</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchAnswer#getLaunchAttrValues()
	 * @see #getLaunchAnswer()
	 * @generated
	 */
	EAttribute getLaunchAnswer_LaunchAttrValues();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workspace.LaunchProposal <em>Launch Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Proposal</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchProposal
	 * @generated
	 */
	EClass getLaunchProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.workspace.LaunchEvent <em>Launch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Event</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchEvent
	 * @generated
	 */
	EClass getLaunchEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.workspace.LaunchEvent#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see no.hal.learning.exercise.workspace.LaunchEvent#getMode()
	 * @see #getLaunchEvent()
	 * @generated
	 */
	EAttribute getLaunchEvent_Mode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkspaceFactory getWorkspaceFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.exercise.workspace.impl.SourceFileEditAnswerImpl <em>Source File Edit Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workspace.impl.SourceFileEditAnswerImpl
		 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getSourceFileEditAnswer()
		 * @generated
		 */
		EClass SOURCE_FILE_EDIT_ANSWER = eINSTANCE.getSourceFileEditAnswer();

		/**
		 * The meta object literal for the '<em><b>Resource Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH = eINSTANCE.getSourceFileEditAnswer_ResourcePath();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workspace.impl.SourceFileEditProposalImpl <em>Source File Edit Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workspace.impl.SourceFileEditProposalImpl
		 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getSourceFileEditProposal()
		 * @generated
		 */
		EClass SOURCE_FILE_EDIT_PROPOSAL = eINSTANCE.getSourceFileEditProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl <em>Source File Edit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl
		 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getSourceFileEditEvent()
		 * @generated
		 */
		EClass SOURCE_FILE_EDIT_EVENT = eINSTANCE.getSourceFileEditEvent();

		/**
		 * The meta object literal for the '<em><b>Source Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_EDIT_EVENT__SOURCE_CODE = eINSTANCE.getSourceFileEditEvent_SourceCode();

		/**
		 * The meta object literal for the '<em><b>Size Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE = eINSTANCE.getSourceFileEditEvent_SizeMeasure();

		/**
		 * The meta object literal for the '<em><b>Error Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_EDIT_EVENT__ERROR_COUNT = eINSTANCE.getSourceFileEditEvent_ErrorCount();

		/**
		 * The meta object literal for the '<em><b>Warning Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE_EDIT_EVENT__WARNING_COUNT = eINSTANCE.getSourceFileEditEvent_WarningCount();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl <em>Launch Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl
		 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getLaunchAnswer()
		 * @generated
		 */
		EClass LAUNCH_ANSWER = eINSTANCE.getLaunchAnswer();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_ANSWER__MODE = eINSTANCE.getLaunchAnswer_Mode();

		/**
		 * The meta object literal for the '<em><b>Launch Attr Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_ANSWER__LAUNCH_ATTR_NAMES = eINSTANCE.getLaunchAnswer_LaunchAttrNames();

		/**
		 * The meta object literal for the '<em><b>Launch Attr Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_ANSWER__LAUNCH_ATTR_VALUES = eINSTANCE.getLaunchAnswer_LaunchAttrValues();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workspace.impl.LaunchProposalImpl <em>Launch Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workspace.impl.LaunchProposalImpl
		 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getLaunchProposal()
		 * @generated
		 */
		EClass LAUNCH_PROPOSAL = eINSTANCE.getLaunchProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl <em>Launch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.workspace.impl.LaunchEventImpl
		 * @see no.hal.learning.exercise.workspace.impl.WorkspacePackageImpl#getLaunchEvent()
		 * @generated
		 */
		EClass LAUNCH_EVENT = eINSTANCE.getLaunchEvent();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH_EVENT__MODE = eINSTANCE.getLaunchEvent_Mode();

	}

} //WorkspacePackage
