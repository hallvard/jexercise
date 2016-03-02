/**
 */
package no.hal.emfs.sync.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Emfs-sync</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfssyncAllTests extends TestSuite {

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
		TestSuite suite = new EmfssyncAllTests("Emfs-sync Tests");
		suite.addTest(SyncTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfssyncAllTests(String name) {
		super(name);
	}

} //EmfssyncAllTests
