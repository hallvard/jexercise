/**
 */
package no.hal.learning.exercise.junit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import no.hal.learning.exercise.ExercisePackage;

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
 * @see no.hal.learning.exercise.junit.JunitFactory
 * @model kind="package"
 * @generated
 */
public interface JunitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "junit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "junit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JunitPackage eINSTANCE = no.hal.learning.exercise.junit.impl.JunitPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.junit.impl.JunitTestAnswerImpl <em>Test Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.junit.impl.JunitTestAnswerImpl
	 * @see no.hal.learning.exercise.junit.impl.JunitPackageImpl#getJunitTestAnswer()
	 * @generated
	 */
	int JUNIT_TEST_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER__REQUIRED_COUNT = ExercisePackage.TASK_ANSWER__REQUIRED_COUNT;

	/**
	 * The feature id for the '<em><b>Test Run Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER__TEST_RUN_NAME = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER__METHOD_NAMES = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER_FEATURE_COUNT = ExercisePackage.TASK_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER___ACCEPT__OBJECT = ExercisePackage.TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER___VALIDATE__OBJECT = ExercisePackage.TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER___CREATE_PROPOSAL = ExercisePackage.TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Test Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER_OPERATION_COUNT = ExercisePackage.TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.junit.impl.JunitTestProposalImpl <em>Test Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.junit.impl.JunitTestProposalImpl
	 * @see no.hal.learning.exercise.junit.impl.JunitPackageImpl#getJunitTestProposal()
	 * @generated
	 */
	int JUNIT_TEST_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__QUESTION = ExercisePackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__ANSWER = ExercisePackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__COMPLETION = ExercisePackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__PROOF = ExercisePackage.TASK_PROPOSAL__PROOF;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__ATTEMPT_COUNT = ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__ATTEMPTS = ExercisePackage.TASK_PROPOSAL__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__PERFORMED_COUNT = ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT;

	/**
	 * The number of structural features of the '<em>Test Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL_FEATURE_COUNT = ExercisePackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___GET_PROPOSAL = ExercisePackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___ACCEPT = ExercisePackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___VALIDATE = ExercisePackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___GET_TEXT = ExercisePackage.TASK_PROPOSAL___GET_TEXT;

	/**
	 * The number of operations of the '<em>Test Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL_OPERATION_COUNT = ExercisePackage.TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl <em>Test Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.junit.impl.JunitTestEventImpl
	 * @see no.hal.learning.exercise.junit.impl.JunitPackageImpl#getJunitTestEvent()
	 * @generated
	 */
	int JUNIT_TEST_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__PROPOSAL = ExercisePackage.TASK_EVENT__PROPOSAL;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__TIMESTAMP = ExercisePackage.TASK_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__COMPLETION = ExercisePackage.TASK_EVENT__COMPLETION;

	/**
	 * The feature id for the '<em><b>Test Run Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__TEST_RUN_NAME = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Success Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__SUCCESS_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Success Tests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__SUCCESS_TESTS = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__FAILURE_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Failure Tests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__FAILURE_TESTS = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__ERROR_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Error Tests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT__ERROR_TESTS = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Test Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT_FEATURE_COUNT = ExercisePackage.TASK_EVENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT___GET_FEATURE_NAMES = ExercisePackage.TASK_EVENT___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT___GET_FEATURE_VALUE__STRING = ExercisePackage.TASK_EVENT___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT___HAS_FEATURE__STRING = ExercisePackage.TASK_EVENT___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT___TO_FEATURE_LIST = ExercisePackage.TASK_EVENT___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT___GET_TEXT = ExercisePackage.TASK_EVENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Test Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_EVENT_OPERATION_COUNT = ExercisePackage.TASK_EVENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.junit.JunitTestAnswer <em>Test Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Answer</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestAnswer
	 * @generated
	 */
	EClass getJunitTestAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.junit.JunitTestAnswer#getTestRunName <em>Test Run Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Run Name</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestAnswer#getTestRunName()
	 * @see #getJunitTestAnswer()
	 * @generated
	 */
	EAttribute getJunitTestAnswer_TestRunName();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.junit.JunitTestAnswer#getMethodNames <em>Method Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Method Names</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestAnswer#getMethodNames()
	 * @see #getJunitTestAnswer()
	 * @generated
	 */
	EAttribute getJunitTestAnswer_MethodNames();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.junit.JunitTestProposal <em>Test Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Proposal</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestProposal
	 * @generated
	 */
	EClass getJunitTestProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.exercise.junit.JunitTestEvent <em>Test Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Event</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent
	 * @generated
	 */
	EClass getJunitTestEvent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.junit.JunitTestEvent#getTestRunName <em>Test Run Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Run Name</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getTestRunName()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_TestRunName();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.junit.JunitTestEvent#getSuccessCount <em>Success Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Count</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getSuccessCount()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_SuccessCount();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.junit.JunitTestEvent#getSuccessTests <em>Success Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Success Tests</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getSuccessTests()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_SuccessTests();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.junit.JunitTestEvent#getFailureCount <em>Failure Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Count</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getFailureCount()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_FailureCount();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.junit.JunitTestEvent#getFailureTests <em>Failure Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Failure Tests</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getFailureTests()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_FailureTests();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.exercise.junit.JunitTestEvent#getErrorCount <em>Error Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Count</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getErrorCount()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_ErrorCount();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.exercise.junit.JunitTestEvent#getErrorTests <em>Error Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Error Tests</em>'.
	 * @see no.hal.learning.exercise.junit.JunitTestEvent#getErrorTests()
	 * @see #getJunitTestEvent()
	 * @generated
	 */
	EAttribute getJunitTestEvent_ErrorTests();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JunitFactory getJunitFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.exercise.junit.impl.JunitTestAnswerImpl <em>Test Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.junit.impl.JunitTestAnswerImpl
		 * @see no.hal.learning.exercise.junit.impl.JunitPackageImpl#getJunitTestAnswer()
		 * @generated
		 */
		EClass JUNIT_TEST_ANSWER = eINSTANCE.getJunitTestAnswer();

		/**
		 * The meta object literal for the '<em><b>Test Run Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_ANSWER__TEST_RUN_NAME = eINSTANCE.getJunitTestAnswer_TestRunName();

		/**
		 * The meta object literal for the '<em><b>Method Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_ANSWER__METHOD_NAMES = eINSTANCE.getJunitTestAnswer_MethodNames();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.junit.impl.JunitTestProposalImpl <em>Test Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.junit.impl.JunitTestProposalImpl
		 * @see no.hal.learning.exercise.junit.impl.JunitPackageImpl#getJunitTestProposal()
		 * @generated
		 */
		EClass JUNIT_TEST_PROPOSAL = eINSTANCE.getJunitTestProposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl <em>Test Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.junit.impl.JunitTestEventImpl
		 * @see no.hal.learning.exercise.junit.impl.JunitPackageImpl#getJunitTestEvent()
		 * @generated
		 */
		EClass JUNIT_TEST_EVENT = eINSTANCE.getJunitTestEvent();

		/**
		 * The meta object literal for the '<em><b>Test Run Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__TEST_RUN_NAME = eINSTANCE.getJunitTestEvent_TestRunName();

		/**
		 * The meta object literal for the '<em><b>Success Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__SUCCESS_COUNT = eINSTANCE.getJunitTestEvent_SuccessCount();

		/**
		 * The meta object literal for the '<em><b>Success Tests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__SUCCESS_TESTS = eINSTANCE.getJunitTestEvent_SuccessTests();

		/**
		 * The meta object literal for the '<em><b>Failure Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__FAILURE_COUNT = eINSTANCE.getJunitTestEvent_FailureCount();

		/**
		 * The meta object literal for the '<em><b>Failure Tests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__FAILURE_TESTS = eINSTANCE.getJunitTestEvent_FailureTests();

		/**
		 * The meta object literal for the '<em><b>Error Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__ERROR_COUNT = eINSTANCE.getJunitTestEvent_ErrorCount();

		/**
		 * The meta object literal for the '<em><b>Error Tests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_EVENT__ERROR_TESTS = eINSTANCE.getJunitTestEvent_ErrorTests();

	}

} //JunitPackage
