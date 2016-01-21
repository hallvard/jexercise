/**
 */
package no.hal.learning.sharing.tests;

import junit.textui.TestRunner;
import no.hal.learning.sharing.ShareEdits;
import no.hal.learning.sharing.SharingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Share Edits</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShareEditsTest extends AbstractShareTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShareEditsTest.class);
	}

	/**
	 * Constructs a new Share Edits test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareEditsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Share Edits test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShareEdits getFixture() {
		return (ShareEdits)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SharingFactory.eINSTANCE.createShareEdits());
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

} //ShareEditsTest
