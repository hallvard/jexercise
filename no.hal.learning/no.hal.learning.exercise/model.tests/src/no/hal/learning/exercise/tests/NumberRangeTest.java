/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.learning.exercise.NumberRange;
import no.hal.learning.exercise.ExerciseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberRangeTest extends TestCase {

	/**
	 * The fixture for this Number Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberRange fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberRangeTest.class);
	}

	/**
	 * Constructs a new Number Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Number Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NumberRange fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Number Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberRange getFixture() {
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
		setFixture(ExerciseFactory.eINSTANCE.createNumberRange());
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

} //NumberRangeTest
