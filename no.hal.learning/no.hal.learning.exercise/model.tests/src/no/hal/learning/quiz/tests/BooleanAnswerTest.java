/**
 */
package no.hal.learning.quiz.tests;

import org.junit.Assert;

import junit.textui.TestRunner;
import no.hal.learning.quiz.BooleanAnswer;
import no.hal.learning.quiz.QuizFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanAnswerTest extends SimpleAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanAnswerTest.class);
	}

	/**
	 * Constructs a new Boolean Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanAnswer getFixture() {
		return (BooleanAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createBooleanAnswer());
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
		BooleanAnswer booleanAnswer = getFixture();
		Assert.assertNull(booleanAnswer.validate("true"));
		Assert.assertNull(booleanAnswer.validate("false"));
	}
	
	@Override
	public void testAccept__Object() {
		BooleanAnswer booleanAnswer = getFixture();
		testAccept__Object(true);
		testAccept__Object(false);
		testAccept__Object(null);
		assertFalse(booleanAnswer.accept("yes"));
		assertFalse(booleanAnswer.accept("yes".toLowerCase()));
		assertFalse(booleanAnswer.accept("no"));
		assertFalse(booleanAnswer.accept("no".toLowerCase()));
	}

	private void testAccept__Object(Boolean value) {
		BooleanAnswer booleanAnswer = getFixture();
		booleanAnswer.setValue(value);
		if (value == null) {
			value = false;
		}
		assertTrue(booleanAnswer.accept(value));
		assertTrue(booleanAnswer.accept(value.toString()));
		assertTrue(booleanAnswer.accept(value.toString().toUpperCase()));
		assertFalse(booleanAnswer.accept(! value));
		assertFalse(booleanAnswer.accept(Boolean.valueOf(! value).toString()));
		assertFalse(booleanAnswer.accept(Boolean.valueOf(! value).toString().toUpperCase()));
	}
	
} //BooleanAnswerTest
