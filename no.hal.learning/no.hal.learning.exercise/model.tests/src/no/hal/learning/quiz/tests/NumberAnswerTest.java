/**
 */
package no.hal.learning.quiz.tests;

import org.junit.Assert;

import junit.textui.TestRunner;
import no.hal.learning.quiz.NumberAnswer;
import no.hal.learning.quiz.QuizFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberAnswerTest extends SimpleAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberAnswerTest.class);
	}

	/**
	 * Constructs a new Number Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberAnswer getFixture() {
		return (NumberAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createNumberAnswer());
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
	
	//
	
	@Override
	public void testValidate__Object() {
		NumberAnswer numberAnswer = getFixture();
		Assert.assertNull(numberAnswer.validate("1"));
		Assert.assertNull(numberAnswer.validate("1.0"));
		Assert.assertNotNull(numberAnswer.validate("true"));
	}
	
	@Override
	public void testAccept__Object() {
		NumberAnswer numberAnswer = getFixture();
		numberAnswer.setValue(2.0);
		assertTrue(numberAnswer.accept(2.0d));
		assertTrue(numberAnswer.accept(2.0));
		assertTrue(numberAnswer.accept(2));
		assertTrue(numberAnswer.accept("2.0"));
		assertTrue(numberAnswer.accept("2"));

		assertFalse(numberAnswer.accept(1.0d));
		assertFalse(numberAnswer.accept(1.0));
		assertFalse(numberAnswer.accept(1));
		assertFalse(numberAnswer.accept("1.0"));
		assertFalse(numberAnswer.accept("1"));
		
		numberAnswer.setErrorMargin(0.5);
		assertTrue(numberAnswer.accept(1.5d));
		assertTrue(numberAnswer.accept(2.0d));
		assertTrue(numberAnswer.accept(2.5d));
		assertFalse(numberAnswer.accept(2.51d));
		assertFalse(numberAnswer.accept(1.49d));
	}

} //NumberAnswerTest
