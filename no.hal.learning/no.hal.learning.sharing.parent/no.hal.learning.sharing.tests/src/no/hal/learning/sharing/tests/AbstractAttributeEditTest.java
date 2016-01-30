/**
 */
package no.hal.learning.sharing.tests;

import junit.textui.TestRunner;
import no.hal.learning.sharing.AbstractAttributeEdit;
import no.hal.learning.sharing.SharingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Attribute Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractAttributeEditTest extends AbstractFeatureEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractAttributeEditTest.class);
	}

	/**
	 * Constructs a new Abstract Attribute Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAttributeEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Attribute Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractAttributeEdit getFixture() {
		return (AbstractAttributeEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharingFactory.eINSTANCE.createAbstractAttributeEdit());
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

} //AbstractAttributeEditTest
