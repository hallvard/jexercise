/**
 */
package no.hal.learning.quiz.tests;

import junit.textui.TestRunner;
import no.hal.learning.quiz.QuizFactory;
import no.hal.learning.quiz.StringAnswer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringAnswerTest extends SimpleAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringAnswerTest.class);
	}

	/**
	 * Constructs a new String Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringAnswer getFixture() {
		return (StringAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createStringAnswer());
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
	}
	
	@Override
	public void testAccept__Object() {
		testDefault(false);
		testIgnoreCase(false);
		testRegex(false);
		testIgnoreCaseRegex(false);
	}
	
	//

	private void setup(boolean ignoreCase, boolean regex) {
		getFixture().setIgnoreCase(ignoreCase);
		getFixture().setRegexp(regex);
	}

	private void testDefault(boolean ignore) {
		String value = "Hallvard";
		StringAnswer stringAnswer = getFixture();
		stringAnswer.setValue(value);
		setup(false, false);
		assertTrue(stringAnswer.accept(value));
		assertFalse(stringAnswer.accept(value.toLowerCase()));
	}
	
	private void testIgnoreCase(boolean ignore) {
		String value = "Hallvard";
		StringAnswer stringAnswer = getFixture();
		stringAnswer.setValue(value);
		setup(true, false);
		assertTrue(stringAnswer.accept(value));
		assertTrue(stringAnswer.accept(value.toLowerCase()));
		assertFalse(stringAnswer.accept(value.substring(1)));
	}
	
	private void testRegex(boolean ignore) {
		String value = "Hal(l?)vard";
		StringAnswer stringAnswer = getFixture();
		stringAnswer.setValue(value);
		setup(false, true);
		assertTrue(stringAnswer.accept("Hallvard"));
		assertTrue(stringAnswer.accept("Halvard"));
		assertFalse(stringAnswer.accept("Havard"));
		assertFalse(stringAnswer.accept("Halllvard"));
	}
	
	private void testIgnoreCaseRegex(boolean ignore) {
		String value = "Hal(l?)vard";
		StringAnswer stringAnswer = getFixture();
		stringAnswer.setValue(value);
		setup(true, true);
		assertTrue(stringAnswer.accept("Hallvard"));
		assertTrue(stringAnswer.accept("hallVard"));
		assertTrue(stringAnswer.accept("Halvard"));
		assertTrue(stringAnswer.accept("halVard"));
		assertFalse(stringAnswer.accept("Havard"));
		assertFalse(stringAnswer.accept("havVrd"));
		assertFalse(stringAnswer.accept("Halllvard"));
		assertFalse(stringAnswer.accept("halllVard"));
	}

} //StringAnswerTest
