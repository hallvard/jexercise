/**
 */
package no.hal.learning.sharing.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sharing</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharingTests extends TestSuite {

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
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SharingTests("sharing Tests");
		suite.addTestSuite(AbstractAttributeEditTest.class);
		suite.addTestSuite(AbstractReferenceEditTest.class);
		suite.addTestSuite(SetAttributeEditTest.class);
		suite.addTestSuite(SetReferenceEditTest.class);
		suite.addTestSuite(AddAttributeEditTest.class);
		suite.addTestSuite(AddReferenceEditTest.class);
		suite.addTestSuite(RemoveFeatureEditTest.class);
		suite.addTestSuite(ChangeEditTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingTests(String name) {
		super(name);
	}

} //SharingTests
