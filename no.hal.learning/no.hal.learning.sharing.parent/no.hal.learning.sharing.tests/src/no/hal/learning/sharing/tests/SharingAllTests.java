/**
 */
package no.hal.learning.sharing.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import no.hal.learning.sharing.runtime.tests.SharingTransportTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Sharing</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharingAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new SharingAllTests("Sharing Tests");
		suite.addTest(SharingTests.suite());
		suite.addTestSuite(SharingTransportTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingAllTests(String name) {
		super(name);
	}

} //SharingAllTests
