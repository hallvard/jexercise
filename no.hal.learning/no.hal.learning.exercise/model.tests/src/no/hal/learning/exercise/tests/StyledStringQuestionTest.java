/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StyledStringQuestion;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Styled String Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyledStringQuestionTest extends QuestionTest {

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
	 * Returns the fixture for this Styled String Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StyledStringQuestion getFixture() {
		return (StyledStringQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createStyledStringQuestion());
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
