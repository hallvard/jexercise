/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.MarkerInfo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Marker Info</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkerInfoTest extends TestCase {

	/**
	 * The fixture for this Marker Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerInfo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MarkerInfoTest.class);
	}

	/**
	 * Constructs a new Marker Info test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkerInfoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Marker Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MarkerInfo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Marker Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerInfo getFixture() {
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
		setFixture(ExerciseFactory.eINSTANCE.createMarkerInfo());
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

} //MarkerInfoTest
