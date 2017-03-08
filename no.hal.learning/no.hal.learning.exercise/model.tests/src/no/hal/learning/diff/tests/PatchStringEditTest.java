/**
 */
package no.hal.learning.diff.tests;

import junit.textui.TestRunner;
import no.hal.learning.diff.DiffFactory;
import no.hal.learning.diff.DiffPackage;
import no.hal.learning.diff.PatchStringEdit;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.tests.AbstractStringEditTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Patch String Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class PatchStringEditTest extends AbstractStringEditTest {

	/**
	 * The fixture for this Patch String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatchStringEdit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatchStringEditTest.class);
	}

	/**
	 * Constructs a new Patch String Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatchStringEditTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Patch String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PatchStringEdit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Patch String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatchStringEdit getFixture() {
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
		setFixture(DiffFactory.eINSTANCE.createPatchStringEdit());
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
	
	//

	@Override
	public void testGetString() {
	}
	
	protected String INITIAL_STRING = "a\nstring", TEST_STRINGS[] = {
			"another\nstring", "a\nstring!", "a", "string", "str", "just\na",
			INITIAL_STRING, INITIAL_STRING + "\n" + INITIAL_STRING, INITIAL_STRING + "\nx\n" + INITIAL_STRING
	};

	@Override
	public void testInitStringEdit__String_AbstractStringEdit() {
		super.testInitStringEdit__String_AbstractStringEdit(DiffPackage.eINSTANCE.getPatchStringEdit(), INITIAL_STRING, TEST_STRINGS);
	}
} //PatchStringEditTest
