/**
 */
package no.hal.emfs.sync.tests;

import junit.textui.TestRunner;

import no.hal.emfs.sync.FullPathCondition;
import no.hal.emfs.sync.SyncFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Full Path Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FullPathConditionTest extends StringConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FullPathConditionTest.class);
	}

	/**
	 * Constructs a new Full Path Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullPathConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Full Path Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FullPathCondition getFixture() {
		return (FullPathCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SyncFactory.eINSTANCE.createFullPathCondition());
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

} //FullPathConditionTest
