/**
 */
package no.hal.learning.sharing.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.SharingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Share</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractShareTest extends TestCase {

	/**
	 * The fixture for this Abstract Share test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractShare fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractShareTest.class);
	}

	/**
	 * Constructs a new Abstract Share test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractShareTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Share test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractShare fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Share test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractShare getFixture() {
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
		setFixture(SharingFactory.eINSTANCE.createAbstractShare());
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

} //AbstractShareTest
