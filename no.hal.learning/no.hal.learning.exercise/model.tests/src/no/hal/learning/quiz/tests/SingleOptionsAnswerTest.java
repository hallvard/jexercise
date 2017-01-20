/**
 */
package no.hal.learning.quiz.tests;

import junit.textui.TestRunner;
import no.hal.learning.quiz.QuizFactory;
import no.hal.learning.quiz.SingleOptionsAnswer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Options Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleOptionsAnswerTest extends OptionsAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleOptionsAnswerTest.class);
	}

	/**
	 * Constructs a new Single Options Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOptionsAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Options Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleOptionsAnswer getFixture() {
		return (SingleOptionsAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createSingleOptionsAnswer());
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

} //SingleOptionsAnswerTest
