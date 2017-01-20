/**
 */
package no.hal.learning.exercise.tests;

import org.junit.Assert;

import junit.textui.TestRunner;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StringEdit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringEditTest extends AbstractStringEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringEditTest.class);
	}

	/**
	 * Constructs a new String Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringEdit getFixture() {
		return (StringEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createStringEdit());
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

	public void testGetString() {
		getFixture().setStoredString("Java er gøy");
		Assert.assertEquals("Java er gøy", getFixture().getString());
	}
} //StringEditTest
