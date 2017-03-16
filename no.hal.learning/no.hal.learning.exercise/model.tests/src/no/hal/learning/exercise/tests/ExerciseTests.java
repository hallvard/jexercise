/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>quiz</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExerciseTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ExerciseTests("exercise Tests");
		suite.addTestSuite(ExerciseTest.class);
		suite.addTestSuite(ExerciseProposalsTest.class);
		suite.addTestSuite(ExercisePartRefTest.class);
		suite.addTestSuite(ExercisePartTest.class);
		suite.addTestSuite(TaskRefTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(ProposalTest.class);
		suite.addTestSuite(TaskAnswerTest.class);
		suite.addTestSuite(TaskProposalTest.class);
		suite.addTestSuite(TaskEventTest.class);
		suite.addTestSuite(StringEditTaskProposalTest.class);
		suite.addTestSuite(AbstractStringEditEventTest.class);
		suite.addTestSuite(RelativeStringEditTest.class);
		suite.addTestSuite(StringEditTest.class);
		suite.addTestSuite(ReplaceSubstringEditTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseTests(String name) {
		super(name);
	}

} //QuizTests
