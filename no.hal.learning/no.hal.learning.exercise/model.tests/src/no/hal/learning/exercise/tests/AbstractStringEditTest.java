/**
 */
package no.hal.learning.exercise.tests;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import junit.framework.TestCase;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StringEdit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract String Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.exercise.AbstractStringEdit#getString() <em>Get String</em>}</li>
 *   <li>{@link no.hal.learning.exercise.AbstractStringEdit#initStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEdit) <em>Init String Edit</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstractStringEditTest extends TestCase {

	/**
	 * The fixture for this Abstract String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringEdit fixture = null;

	/**
	 * Constructs a new Abstract String Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringEditTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractStringEdit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract String Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringEdit getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link no.hal.learning.exercise.AbstractStringEdit#getString() <em>Get String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.AbstractStringEdit#getString()
	 * @generated
	 */
	public void testGetString() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.hal.learning.exercise.AbstractStringEdit#initStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEdit) <em>Init String Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.AbstractStringEdit#initStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEdit)
	 * @generated
	 */
	public void testInitStringEdit__String_AbstractStringEdit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
	
	protected String INITIAL_STRING = "a string", TEST_STRINGS[] = {
			"another string", INITIAL_STRING + "!", INITIAL_STRING.substring(0, 1), INITIAL_STRING.substring(2), "str", "just a",
			INITIAL_STRING, INITIAL_STRING + INITIAL_STRING, INITIAL_STRING + "x" + INITIAL_STRING
	};
	
	protected StringEdit createStringEdit(String initial) {
		StringEdit lastStringEdit = ExerciseFactory.eINSTANCE.createStringEdit();
		lastStringEdit.setStoredString(initial);
		return lastStringEdit;
	}
	
	protected void testInitStringEdit__String_AbstractStringEdit(EClass stringEditClass, String initial, String... strings) {
		StringEdit lastStringEdit = createStringEdit(initial);
		for (int i = 0; i < strings.length; i++) {
			testInitStringEdit__String_AbstractStringEdit(stringEditClass, strings[i], lastStringEdit);			
		}
	}

	protected void testInitStringEdit__String_AbstractStringEdit(EClass stringEditClass, String string, StringEdit lastEdit) {
		testInitStringEdit__String_AbstractStringEdit((AbstractStringEdit) EcoreUtil.create(stringEditClass), string, lastEdit);
	}
	
	protected void testInitStringEdit__String_AbstractStringEdit(AbstractStringEdit stringEdit, String string, StringEdit lastEdit) {
		assertNotNull(stringEdit.getClass().getSimpleName() + " didn't handle '" + lastEdit.getString() + "' -> '" + string + "'", stringEdit.initStringEdit(string, lastEdit));
		assertEquals(string, stringEdit.getString());
	}

} //AbstractStringEditTest
