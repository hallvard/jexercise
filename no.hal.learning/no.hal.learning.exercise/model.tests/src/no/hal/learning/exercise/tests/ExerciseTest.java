/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.exercise.Exercise#createProposals() <em>Create Proposals</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExerciseTest extends TestCase {

	/**
	 * The fixture for this Exercise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Exercise fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExerciseTest.class);
	}

	/**
	 * Constructs a new Exercise test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Exercise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Exercise fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Exercise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Exercise getFixture() {
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
		setFixture(ExerciseFactory.eINSTANCE.createExercise());
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

	/**
	 * Tests the '{@link no.hal.learning.exercise.Exercise#createProposals() <em>Create Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.Exercise#createProposals()
	 * @generated NOT
	 */
	public void testCreateProposals() {
		// TODO: implement this operation test method
//		fail();
	}

} //QuizTest
