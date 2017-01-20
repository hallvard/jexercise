/**
 */
package no.hal.learning.quiz.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.tests.QuestionTest;
import no.hal.learning.quiz.QuizFactory;
import no.hal.learning.quiz.StyledStringQuestion;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Styled String Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyledStringQuestionTest extends QuestionTest {

	/**
	 * The fixture for this Styled String Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyledStringQuestion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StyledStringQuestionTest.class);
	}

	/**
	 * Constructs a new Styled String Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyledStringQuestionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Styled String Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StyledStringQuestion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Styled String Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StyledStringQuestion getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createStyledStringQuestion());
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

} //StyledStringQuestionTest
