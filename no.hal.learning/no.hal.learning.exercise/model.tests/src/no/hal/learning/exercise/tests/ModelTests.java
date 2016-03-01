/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>model</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTests extends TestSuite {

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
		TestSuite suite = new ModelTests("model Tests");
		suite.addTestSuite(StringAnswerTest.class);
		suite.addTestSuite(NumberAnswerTest.class);
		suite.addTestSuite(BooleanAnswerTest.class);
		suite.addTestSuite(OptionsAnswerTest.class);
		suite.addTestSuite(SingleOptionsAnswerTest.class);
		suite.addTestSuite(ManyOptionsAnswerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTests(String name) {
		super(name);
	}

} //ModelTests
