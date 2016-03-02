/**
 */
package no.hal.emfs.sync.tests;

import junit.textui.TestRunner;

import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.sync.TagsRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tags Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagsRuleTest extends EmfsResourceRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TagsRuleTest.class);
	}

	/**
	 * Constructs a new Tags Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tags Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TagsRule getFixture() {
		return (TagsRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SyncFactory.eINSTANCE.createTagsRule());
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

} //TagsRuleTest
