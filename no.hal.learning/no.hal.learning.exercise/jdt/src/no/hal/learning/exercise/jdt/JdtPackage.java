/**
 */
package no.hal.learning.exercise.jdt;

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
 * @see no.hal.learning.exercise.jdt.JdtFactory
 * @model kind="package"
 * @generated
 */
public interface JdtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jdt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jdt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JdtPackage eINSTANCE = no.hal.learning.exercise.jdt.impl.JdtPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditAnswerImpl <em>Source Edit Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.jdt.impl.JdtSourceEditAnswerImpl
	 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtSourceEditAnswer()
	 * @generated
	 */
	int JDT_SOURCE_EDIT_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER__REQUIRED_COUNT = ExercisePackage.STRING_EDIT_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER__CLASS_NAME = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER_FEATURE_COUNT = ExercisePackage.STRING_EDIT_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER___ACCEPT__OBJECT = ExercisePackage.STRING_EDIT_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER___VALIDATE__OBJECT = ExercisePackage.STRING_EDIT_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER___CREATE_PROPOSAL = ExercisePackage.STRING_EDIT_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Editor Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER___GET_EDITOR_PATH = ExercisePackage.STRING_EDIT_ANSWER___GET_EDITOR_PATH;

	/**
	 * The number of operations of the '<em>Source Edit Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_ANSWER_OPERATION_COUNT = ExercisePackage.STRING_EDIT_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditProposalImpl <em>Source Edit Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.jdt.impl.JdtSourceEditProposalImpl
	 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtSourceEditProposal()
	 * @generated
	 */
	int JDT_SOURCE_EDIT_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__QUESTION = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__ANSWER = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__COMPLETION = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__PROOF = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__ATTEMPTS = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL__PERFORMED_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Source Edit Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL_FEATURE_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL___GET_PROPOSAL = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL___ACCEPT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL___VALIDATE = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL___GET_TEXT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL___GET_TEXT;

	/**
	 * The number of operations of the '<em>Source Edit Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_PROPOSAL_OPERATION_COUNT = ExercisePackage.STRING_EDIT_TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl <em>Source Edit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl
	 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtSourceEditEvent()
	 * @generated
	 */
	int JDT_SOURCE_EDIT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__TIMESTAMP = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__COMPLETION = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__EDIT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT;

	/**
	 * The feature id for the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__SOURCE_CODE = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__ERROR_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Warning Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT__WARNING_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Source Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT_FEATURE_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT___GET_TEXT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_TEXT;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT___GET_STRING = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_STRING;

	/**
	 * The operation id for the '<em>Create String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT;

	/**
	 * The number of operations of the '<em>Source Edit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_SOURCE_EDIT_EVENT_OPERATION_COUNT = ExercisePackage.ABSTRACT_STRING_EDIT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.jdt.impl.JdtLaunchAnswerImpl <em>Launch Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.jdt.impl.JdtLaunchAnswerImpl
	 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtLaunchAnswer()
	 * @generated
	 */
	int JDT_LAUNCH_ANSWER = 3;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER__REQUIRED_COUNT = ExercisePackage.TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER__MODE = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER__CLASS_NAME = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Launch Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER_FEATURE_COUNT = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER___ACCEPT__OBJECT = ExercisePackage.TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER___VALIDATE__OBJECT = ExercisePackage.TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER___CREATE_PROPOSAL = ExercisePackage.TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Launch Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_ANSWER_OPERATION_COUNT = ExercisePackage.TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.jdt.impl.JdtLaunchProposalImpl <em>Launch Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.jdt.impl.JdtLaunchProposalImpl
	 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtLaunchProposal()
	 * @generated
	 */
	int JDT_LAUNCH_PROPOSAL = 4;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Launch Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The number of operations of the '<em>Launch Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.jdt.impl.JdtLaunchEventImpl <em>Launch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.jdt.impl.JdtLaunchEventImpl
	 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtLaunchEvent()
	 * @generated
	 */
	int JDT_LAUNCH_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_EVENT__TIMESTAMP = ExercisePackage.TASK_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_EVENT__COMPLETION = ExercisePackage.TASK_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_EVENT__MODE = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Launch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_EVENT_FEATURE_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_EVENT___GET_TEXT = ExercisePackage.TASK_EVENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Launch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_LAUNCH_EVENT_OPERATION_COUNT = ExercisePackage.TASK_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer <em>Source Edit Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Edit Answer</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditAnswer
	 * @generated
	 */
	EClass getJdtSourceEditAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getClassName()
	 * @see #getJdtSourceEditAnswer()
	 * @generated
	 */
	EAttribute getJdtSourceEditAnswer_ClassName();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getMethodNames <em>Method Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Method Names</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getMethodNames()
	 * @see #getJdtSourceEditAnswer()
	 * @generated
	 */
	EAttribute getJdtSourceEditAnswer_MethodNames();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.jdt.JdtSourceEditProposal <em>Source Edit Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Edit Proposal</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditProposal
	 * @generated
	 */
	EClass getJdtSourceEditProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent <em>Source Edit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Edit Event</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditEvent
	 * @generated
	 */
	EClass getJdtSourceEditEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSourceCode <em>Source Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Code</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSourceCode()
	 * @see #getJdtSourceEditEvent()
	 * @generated
	 */
	EAttribute getJdtSourceEditEvent_SourceCode();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSizeMeasure <em>Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Measure</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSizeMeasure()
	 * @see #getJdtSourceEditEvent()
	 * @generated
	 */
	EAttribute getJdtSourceEditEvent_SizeMeasure();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getErrorCount <em>Error Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Count</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditEvent#getErrorCount()
	 * @see #getJdtSourceEditEvent()
	 * @generated
	 */
	EAttribute getJdtSourceEditEvent_ErrorCount();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getWarningCount <em>Warning Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning Count</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtSourceEditEvent#getWarningCount()
	 * @see #getJdtSourceEditEvent()
	 * @generated
	 */
	EAttribute getJdtSourceEditEvent_WarningCount();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer <em>Launch Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Answer</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtLaunchAnswer
	 * @generated
	 */
	EClass getJdtLaunchAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtLaunchAnswer#getMode()
	 * @see #getJdtLaunchAnswer()
	 * @generated
	 */
	EAttribute getJdtLaunchAnswer_Mode();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtLaunchAnswer#getClassName()
	 * @see #getJdtLaunchAnswer()
	 * @generated
	 */
	EAttribute getJdtLaunchAnswer_ClassName();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.jdt.JdtLaunchProposal <em>Launch Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Proposal</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtLaunchProposal
	 * @generated
	 */
	EClass getJdtLaunchProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.jdt.JdtLaunchEvent <em>Launch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Event</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtLaunchEvent
	 * @generated
	 */
	EClass getJdtLaunchEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.jdt.JdtLaunchEvent#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see no.hal.learning.exercise.jdt.JdtLaunchEvent#getMode()
	 * @see #getJdtLaunchEvent()
	 * @generated
	 */
	EAttribute getJdtLaunchEvent_Mode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JdtFactory getJdtFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditAnswerImpl <em>Source Edit Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.jdt.impl.JdtSourceEditAnswerImpl
		 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtSourceEditAnswer()
		 * @generated
		 */
		EClass JDT_SOURCE_EDIT_ANSWER = eINSTANCE.getJdtSourceEditAnswer();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_SOURCE_EDIT_ANSWER__CLASS_NAME = eINSTANCE.getJdtSourceEditAnswer_ClassName();

		/**
		 * The meta object literal for the '<em><b>Method Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES = eINSTANCE.getJdtSourceEditAnswer_MethodNames();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditProposalImpl <em>Source Edit Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.jdt.impl.JdtSourceEditProposalImpl
		 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtSourceEditProposal()
		 * @generated
		 */
		EClass JDT_SOURCE_EDIT_PROPOSAL = eINSTANCE.getJdtSourceEditProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl <em>Source Edit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl
		 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtSourceEditEvent()
		 * @generated
		 */
		EClass JDT_SOURCE_EDIT_EVENT = eINSTANCE.getJdtSourceEditEvent();

		/**
		 * The meta object literal for the '<em><b>Source Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_SOURCE_EDIT_EVENT__SOURCE_CODE = eINSTANCE.getJdtSourceEditEvent_SourceCode();

		/**
		 * The meta object literal for the '<em><b>Size Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE = eINSTANCE.getJdtSourceEditEvent_SizeMeasure();

		/**
		 * The meta object literal for the '<em><b>Error Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_SOURCE_EDIT_EVENT__ERROR_COUNT = eINSTANCE.getJdtSourceEditEvent_ErrorCount();

		/**
		 * The meta object literal for the '<em><b>Warning Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_SOURCE_EDIT_EVENT__WARNING_COUNT = eINSTANCE.getJdtSourceEditEvent_WarningCount();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.jdt.impl.JdtLaunchAnswerImpl <em>Launch Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.jdt.impl.JdtLaunchAnswerImpl
		 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtLaunchAnswer()
		 * @generated
		 */
		EClass JDT_LAUNCH_ANSWER = eINSTANCE.getJdtLaunchAnswer();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_LAUNCH_ANSWER__MODE = eINSTANCE.getJdtLaunchAnswer_Mode();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_LAUNCH_ANSWER__CLASS_NAME = eINSTANCE.getJdtLaunchAnswer_ClassName();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.jdt.impl.JdtLaunchProposalImpl <em>Launch Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.jdt.impl.JdtLaunchProposalImpl
		 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtLaunchProposal()
		 * @generated
		 */
		EClass JDT_LAUNCH_PROPOSAL = eINSTANCE.getJdtLaunchProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.jdt.impl.JdtLaunchEventImpl <em>Launch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.jdt.impl.JdtLaunchEventImpl
		 * @see no.hal.learning.exercise.jdt.impl.JdtPackageImpl#getJdtLaunchEvent()
		 * @generated
		 */
		EClass JDT_LAUNCH_EVENT = eINSTANCE.getJdtLaunchEvent();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_LAUNCH_EVENT__MODE = eINSTANCE.getJdtLaunchEvent_Mode();

	}

} //JdtPackage
