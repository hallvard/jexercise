/**
 */
package no.hal.learning.quiz.tests;

import junit.textui.TestRunner;
import no.hal.learning.quiz.ManyOptionsAnswer;
import no.hal.learning.quiz.QuizFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Many Options Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManyOptionsAnswerTest extends OptionsAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManyOptionsAnswerTest.class);
	}

	/**
	 * Constructs a new Many Options Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyOptionsAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Many Options Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ManyOptionsAnswer getFixture() {
		return (ManyOptionsAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createManyOptionsAnswer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ManyOptionsAnswerTest
