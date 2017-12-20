/**
 */
package no.hal.learning.exercise.pydev;

import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.exercise.workspace.WorkspacePackage;

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
 * @see no.hal.learning.exercise.pydev.PydevFactory
 * @model kind="package"
 * @generated
 */
public interface PydevPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pydev";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.pydev/model/pydev-exercise.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pydev";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PydevPackage eINSTANCE = no.hal.learning.exercise.pydev.impl.PydevPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevSourceEditAnswerImpl <em>Source Edit Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevSourceEditAnswerImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevSourceEditAnswer()
	 * @generated
	 */
	int PYDEV_SOURCE_EDIT_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER__REQUIRED_COUNT = ExercisePackage.STRING_EDIT_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER__MODULE_NAME = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER_FEATURE_COUNT = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER___ACCEPT__OBJECT = ExercisePackage.STRING_EDIT_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER___VALIDATE__OBJECT = ExercisePackage.STRING_EDIT_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER___CREATE_PROPOSAL = ExercisePackage.STRING_EDIT_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER___ACCEPT_EVENT__TASKEVENT = ExercisePackage.STRING_EDIT_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The operation id for the '<em>Get Editor Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER___GET_EDITOR_PATH = ExercisePackage.STRING_EDIT_ANSWER___GET_EDITOR_PATH;

	/**
	 * The number of operations of the '<em>Source Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_ANSWER_OPERATION_COUNT = ExercisePackage.STRING_EDIT_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevSourceEditProposalImpl <em>Source Edit Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevSourceEditProposalImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevSourceEditProposal()
	 * @generated
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__QUESTION = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__ANSWER = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__COMPLETION = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__PROOF = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__ATTEMPTS = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL__PERFORMED_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Source Edit Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL_FEATURE_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL___GET_PROPOSAL = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL___ACCEPT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL___VALIDATE = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL___GET_TEXT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Source Edit Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_PROPOSAL_OPERATION_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevSourceEditEventImpl <em>Source Edit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevSourceEditEventImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevSourceEditEvent()
	 * @generated
	 */
	int PYDEV_SOURCE_EDIT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__PROPOSAL = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__TIMESTAMP = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__COMPLETION = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__EDIT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__EDIT;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__MARKERS = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__RESOURCE_PATH = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__SOURCE_CODE = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SOURCE_CODE;

	/**
	 * The feature id for the '<em><b>Size Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__SIZE_MEASURE = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE;

	/**
	 * The feature id for the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__ERROR_COUNT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__ERROR_COUNT;

	/**
	 * The feature id for the '<em><b>Warning Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT__WARNING_COUNT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT__WARNING_COUNT;

	/**
	 * The number of structural features of the '<em>Source Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT_FEATURE_COUNT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___GET_FEATURE_NAMES = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___GET_FEATURE_VALUE__STRING = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___HAS_FEATURE__STRING = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___TO_FEATURE_LIST = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___GET_TEXT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___GET_TEXT;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___GET_STRING = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___GET_STRING;

	/**
	 * The operation id for the '<em>Create String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT;

	/**
	 * The number of operations of the '<em>Source Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_SOURCE_EDIT_EVENT_OPERATION_COUNT = WorkspacePackage.SOURCE_FILE_EDIT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevMarkerInfoImpl <em>Marker Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevMarkerInfoImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevMarkerInfo()
	 * @generated
	 */
	int PYDEV_MARKER_INFO = 3;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_MARKER_INFO__LINE_NUMBER = ExercisePackage.MARKER_INFO__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_MARKER_INFO__CHAR_START = ExercisePackage.MARKER_INFO__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_MARKER_INFO__CHAR_END = ExercisePackage.MARKER_INFO__CHAR_END;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_MARKER_INFO__SEVERITY = ExercisePackage.MARKER_INFO__SEVERITY;

	/**
	 * The number of structural features of the '<em>Marker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_MARKER_INFO_FEATURE_COUNT = ExercisePackage.MARKER_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Marker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_MARKER_INFO_OPERATION_COUNT = ExercisePackage.MARKER_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevLaunchAnswerImpl <em>Launch Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevLaunchAnswerImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevLaunchAnswer()
	 * @generated
	 */
	int PYDEV_LAUNCH_ANSWER = 4;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER__REQUIRED_COUNT = WorkspacePackage.LAUNCH_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER__MODE = WorkspacePackage.LAUNCH_ANSWER__MODE;

	/**
	 * The feature id for the '<em><b>Launch Attr Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER__LAUNCH_ATTR_NAMES = WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_NAMES;

	/**
	 * The feature id for the '<em><b>Launch Attr Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER__LAUNCH_ATTR_VALUES = WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_VALUES;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER__MODULE_NAME = WorkspacePackage.LAUNCH_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Launch Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER_FEATURE_COUNT = WorkspacePackage.LAUNCH_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER___ACCEPT__OBJECT = WorkspacePackage.LAUNCH_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER___VALIDATE__OBJECT = WorkspacePackage.LAUNCH_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER___CREATE_PROPOSAL = WorkspacePackage.LAUNCH_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER___ACCEPT_EVENT__TASKEVENT = WorkspacePackage.LAUNCH_ANSWER___ACCEPT_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Launch Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_ANSWER_OPERATION_COUNT = WorkspacePackage.LAUNCH_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevLaunchProposalImpl <em>Launch Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevLaunchProposalImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevLaunchProposal()
	 * @generated
	 */
	int PYDEV_LAUNCH_PROPOSAL = 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__QUESTION = WorkspacePackage.LAUNCH_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__ANSWER = WorkspacePackage.LAUNCH_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__COMPLETION = WorkspacePackage.LAUNCH_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__PROOF = WorkspacePackage.LAUNCH_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__ATTEMPT_COUNT = WorkspacePackage.LAUNCH_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__ATTEMPTS = WorkspacePackage.LAUNCH_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL__PERFORMED_COUNT = WorkspacePackage.LAUNCH_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Launch Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL_FEATURE_COUNT = WorkspacePackage.LAUNCH_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL___GET_PROPOSAL = WorkspacePackage.LAUNCH_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL___ACCEPT = WorkspacePackage.LAUNCH_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL___VALIDATE = WorkspacePackage.LAUNCH_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL___GET_TEXT = WorkspacePackage.LAUNCH_PROPOSAL___GET_TEXT;

	/**
	 * The operation id for the '<em>Add Task Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL___ADD_TASK_EVENT__TASKEVENT = WorkspacePackage.LAUNCH_PROPOSAL___ADD_TASK_EVENT__TASKEVENT;

	/**
	 * The number of operations of the '<em>Launch Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_PROPOSAL_OPERATION_COUNT = WorkspacePackage.LAUNCH_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.pydev.impl.PydevLaunchEventImpl <em>Launch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.pydev.impl.PydevLaunchEventImpl
	 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevLaunchEvent()
	 * @generated
	 */
	int PYDEV_LAUNCH_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__PROPOSAL = WorkspacePackage.LAUNCH_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__TIMESTAMP = WorkspacePackage.LAUNCH_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__COMPLETION = WorkspacePackage.LAUNCH_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__MODE = WorkspacePackage.LAUNCH_EVENT__MODE;

	/**
	 * The feature id for the '<em><b>Launch Attr Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__LAUNCH_ATTR_NAMES = WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_NAMES;

	/**
	 * The feature id for the '<em><b>Launch Attr Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__LAUNCH_ATTR_VALUES = WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_VALUES;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT__MODULE_NAME = WorkspacePackage.LAUNCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Launch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT_FEATURE_COUNT = WorkspacePackage.LAUNCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT___GET_FEATURE_NAMES = WorkspacePackage.LAUNCH_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT___GET_FEATURE_VALUE__STRING = WorkspacePackage.LAUNCH_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT___HAS_FEATURE__STRING = WorkspacePackage.LAUNCH_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT___TO_FEATURE_LIST = WorkspacePackage.LAUNCH_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT___GET_TEXT = WorkspacePackage.LAUNCH_EVENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Launch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYDEV_LAUNCH_EVENT_OPERATION_COUNT = WorkspacePackage.LAUNCH_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevSourceEditAnswer <em>Source Edit Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Edit Answer</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevSourceEditAnswer
	 * @generated
	 */
	EClass getPydevSourceEditAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.pydev.PydevSourceEditAnswer#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevSourceEditAnswer#getModuleName()
	 * @see #getPydevSourceEditAnswer()
	 * @generated
	 */
	EAttribute getPydevSourceEditAnswer_ModuleName();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevSourceEditProposal <em>Source Edit Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Edit Proposal</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevSourceEditProposal
	 * @generated
	 */
	EClass getPydevSourceEditProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevSourceEditEvent <em>Source Edit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Edit Event</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevSourceEditEvent
	 * @generated
	 */
	EClass getPydevSourceEditEvent();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevMarkerInfo <em>Marker Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker Info</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevMarkerInfo
	 * @generated
	 */
	EClass getPydevMarkerInfo();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevLaunchAnswer <em>Launch Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Answer</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevLaunchAnswer
	 * @generated
	 */
	EClass getPydevLaunchAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.pydev.PydevLaunchAnswer#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevLaunchAnswer#getModuleName()
	 * @see #getPydevLaunchAnswer()
	 * @generated
	 */
	EAttribute getPydevLaunchAnswer_ModuleName();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevLaunchProposal <em>Launch Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Proposal</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevLaunchProposal
	 * @generated
	 */
	EClass getPydevLaunchProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.pydev.PydevLaunchEvent <em>Launch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Event</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevLaunchEvent
	 * @generated
	 */
	EClass getPydevLaunchEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.pydev.PydevLaunchEvent#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see no.hal.learning.exercise.pydev.PydevLaunchEvent#getModuleName()
	 * @see #getPydevLaunchEvent()
	 * @generated
	 */
	EAttribute getPydevLaunchEvent_ModuleName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PydevFactory getPydevFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevSourceEditAnswerImpl <em>Source Edit Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevSourceEditAnswerImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevSourceEditAnswer()
		 * @generated
		 */
		EClass PYDEV_SOURCE_EDIT_ANSWER = eINSTANCE.getPydevSourceEditAnswer();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYDEV_SOURCE_EDIT_ANSWER__MODULE_NAME = eINSTANCE.getPydevSourceEditAnswer_ModuleName();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevSourceEditProposalImpl <em>Source Edit Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevSourceEditProposalImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevSourceEditProposal()
		 * @generated
		 */
		EClass PYDEV_SOURCE_EDIT_PROPOSAL = eINSTANCE.getPydevSourceEditProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevSourceEditEventImpl <em>Source Edit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevSourceEditEventImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevSourceEditEvent()
		 * @generated
		 */
		EClass PYDEV_SOURCE_EDIT_EVENT = eINSTANCE.getPydevSourceEditEvent();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevMarkerInfoImpl <em>Marker Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevMarkerInfoImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevMarkerInfo()
		 * @generated
		 */
		EClass PYDEV_MARKER_INFO = eINSTANCE.getPydevMarkerInfo();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevLaunchAnswerImpl <em>Launch Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevLaunchAnswerImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevLaunchAnswer()
		 * @generated
		 */
		EClass PYDEV_LAUNCH_ANSWER = eINSTANCE.getPydevLaunchAnswer();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYDEV_LAUNCH_ANSWER__MODULE_NAME = eINSTANCE.getPydevLaunchAnswer_ModuleName();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevLaunchProposalImpl <em>Launch Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevLaunchProposalImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevLaunchProposal()
		 * @generated
		 */
		EClass PYDEV_LAUNCH_PROPOSAL = eINSTANCE.getPydevLaunchProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.pydev.impl.PydevLaunchEventImpl <em>Launch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.pydev.impl.PydevLaunchEventImpl
		 * @see no.hal.learning.exercise.pydev.impl.PydevPackageImpl#getPydevLaunchEvent()
		 * @generated
		 */
		EClass PYDEV_LAUNCH_EVENT = eINSTANCE.getPydevLaunchEvent();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PYDEV_LAUNCH_EVENT__MODULE_NAME = eINSTANCE.getPydevLaunchEvent_ModuleName();

	}

} //PydevPackage
