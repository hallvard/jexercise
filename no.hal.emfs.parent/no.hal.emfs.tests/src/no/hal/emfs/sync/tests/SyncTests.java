/**
 */
package no.hal.emfs.sync.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sync</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncTests extends TestSuite {

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
		TestSuite suite = new SyncTests("sync Tests");
		suite.addTestSuite(PathRuleTest.class);
		suite.addTestSuite(ExportRuleTest.class);
		suite.addTestSuite(CompositeResourceConditionTest.class);
		suite.addTestSuite(NameConditionTest.class);
		suite.addTestSuite(FullPathConditionTest.class);
		suite.addTestSuite(TagsConditionTest.class);
		suite.addTestSuite(PropertiesConditionTest.class);
		suite.addTestSuite(RelativePathTest.class);
		suite.addTestSuite(ImportRuleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncTests(String name) {
		super(name);
	}

} //SyncTests
