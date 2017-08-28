/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import no.hal.learning.diff.tests.DiffTests;
import no.hal.learning.fv.tests.FvTests;
import no.hal.learning.quiz.tests.QuizTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Quiz</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExerciseAllTests extends TestSuite {

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
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new ExerciseAllTests("Exercise Tests");
		suite.addTest(FvTests.suite());
		suite.addTest(DiffTests.suite());
		suite.addTest(QuizTests.suite());
		suite.addTest(ExerciseTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseAllTests(String name) {
		super(name);
	}

} //QuizAllTests
