/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.RelativeStringEdit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relative String Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelativeStringEditTest extends AbstractStringEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelativeStringEditTest.class);
	}

	/**
	 * Constructs a new Relative String Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeStringEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relative String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelativeStringEdit getFixture() {
		return (RelativeStringEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createRelativeStringEdit());
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

} //RelativeStringEditTest
