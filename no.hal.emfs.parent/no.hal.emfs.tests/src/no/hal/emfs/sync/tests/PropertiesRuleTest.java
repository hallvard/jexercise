/**
 */
package no.hal.emfs.sync.tests;

import junit.textui.TestRunner;

import no.hal.emfs.sync.PropertiesRule;
import no.hal.emfs.sync.SyncFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Properties Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesRuleTest extends EmfsResourceRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertiesRuleTest.class);
	}

	/**
	 * Constructs a new Properties Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Properties Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertiesRule getFixture() {
		return (PropertiesRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SyncFactory.eINSTANCE.createPropertiesRule());
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

} //PropertiesRuleTest
