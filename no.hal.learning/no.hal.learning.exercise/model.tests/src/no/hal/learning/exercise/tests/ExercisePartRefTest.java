/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.ExercisePartRef;
import no.hal.learning.exercise.ExerciseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Part Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExercisePartRefTest extends AbstractExercisePartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExercisePartRefTest.class);
	}

	/**
	 * Constructs a new Part Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePartRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Part Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExercisePartRef getFixture() {
		return (ExercisePartRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createExercisePartRef());
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

} //QuizPartRefTest
