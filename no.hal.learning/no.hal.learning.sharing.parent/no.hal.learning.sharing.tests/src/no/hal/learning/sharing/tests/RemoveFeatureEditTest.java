/**
 */
package no.hal.learning.sharing.tests;

import junit.textui.TestRunner;
import no.hal.learning.sharing.RemoveFeatureEdit;
import no.hal.learning.sharing.SharingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Feature Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveFeatureEditTest extends AbstractFeatureEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveFeatureEditTest.class);
	}

	/**
	 * Constructs a new Remove Feature Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveFeatureEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Feature Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoveFeatureEdit getFixture() {
		return (RemoveFeatureEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharingFactory.eINSTANCE.createRemoveFeatureEdit());
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

} //RemoveFeatureEditTest
