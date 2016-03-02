/**
 */
package no.hal.emfs.sync.tests;

import junit.textui.TestRunner;

import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.SyncFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Import Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportRuleTest extends PathRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImportRuleTest.class);
	}

	/**
	 * Constructs a new Import Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Import Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImportRule getFixture() {
		return (ImportRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SyncFactory.eINSTANCE.createImportRule());
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

} //ImportRuleTest
