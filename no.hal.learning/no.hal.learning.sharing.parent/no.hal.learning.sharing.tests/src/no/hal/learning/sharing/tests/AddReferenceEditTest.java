/**
 */
package no.hal.learning.sharing.tests;

import junit.textui.TestRunner;
import no.hal.learning.sharing.AddReferenceEdit;
import no.hal.learning.sharing.SharingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Reference Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddReferenceEditTest extends AddFeatureEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddReferenceEditTest.class);
	}

	/**
	 * Constructs a new Add Reference Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferenceEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Reference Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddReferenceEdit getFixture() {
		return (AddReferenceEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharingFactory.eINSTANCE.createAddReferenceEdit());
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

} //AddReferenceEditTest
