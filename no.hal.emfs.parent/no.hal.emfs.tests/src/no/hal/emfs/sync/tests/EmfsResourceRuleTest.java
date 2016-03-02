/**
 */
package no.hal.emfs.sync.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.emfs.sync.EmfsResourceRule;
import no.hal.emfs.sync.SyncFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Emfs Resource Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfsResourceRuleTest extends TestCase {

	/**
	 * The fixture for this Emfs Resource Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsResourceRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmfsResourceRuleTest.class);
	}

	/**
	 * Constructs a new Emfs Resource Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsResourceRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Emfs Resource Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EmfsResourceRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Emfs Resource Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsResourceRule getFixture() {
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
		setFixture(SyncFactory.eINSTANCE.createEmfsResourceRule());
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

} //EmfsResourceRuleTest
