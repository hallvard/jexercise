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
		suite.addTestSuite(StyledStringTest.class);
		suite.addTestSuite(ProposalTest.class);
		suite.addTestSuite(SimpleProposalTest.class);
		suite.addTestSuite(StringAnswerTest.class);
		suite.addTestSuite(NumberAnswerTest.class);
		suite.addTestSuite(BooleanAnswerTest.class);
		suite.addTestSuite(OptionsAnswerTest.class);
		suite.addTestSuite(OptionsProposalTest.class);
		suite.addTestSuite(SingleOptionsAnswerTest.class);
		suite.addTestSuite(ManyOptionsAnswerTest.class);
		suite.addTestSuite(TaskAnswerTest.class);
		suite.addTestSuite(TaskProposalTest.class);
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
