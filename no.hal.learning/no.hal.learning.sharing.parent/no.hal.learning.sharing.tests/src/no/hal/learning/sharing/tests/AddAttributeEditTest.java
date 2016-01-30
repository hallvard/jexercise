/**
 */
package no.hal.learning.sharing.tests;

import junit.textui.TestRunner;
import no.hal.learning.sharing.AddAttributeEdit;
import no.hal.learning.sharing.SharingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Attribute Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddAttributeEditTest extends AddFeatureEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddAttributeEditTest.class);
	}

	/**
	 * Constructs a new Add Attribute Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAttributeEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Attribute Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddAttributeEdit getFixture() {
		return (AddAttributeEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharingFactory.eINSTANCE.createAddAttributeEdit());
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

} //AddAttributeEditTest
