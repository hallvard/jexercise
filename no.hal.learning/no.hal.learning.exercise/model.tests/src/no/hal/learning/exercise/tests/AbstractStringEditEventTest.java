/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import org.junit.Assert;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StringEdit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract String Edit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.exercise.AbstractStringEditEvent#getString() <em>Get String</em>}</li>
 *   <li>{@link no.hal.learning.exercise.AbstractStringEditEvent#createStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEditEvent) <em>Create String Edit</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AbstractStringEditEventTest extends TaskEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractStringEditEventTest.class);
	}

	/**
	 * Constructs a new Abstract String Edit Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringEditEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract String Edit Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractStringEditEvent getFixture() {
		return (AbstractStringEditEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createAbstractStringEditEvent());
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

	/**
	 * Tests the '{@link no.hal.learning.exercise.AbstractStringEditEvent#getString() <em>Get String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.AbstractStringEditEvent#getString()
	 * @generated NOT
	 */
	public void testGetString() {
		StringEdit stringEdit = ExerciseFactory.eINSTANCE.createStringEdit();
		stringEdit.setStoredString("a string");
		getFixture().setEdit(stringEdit);
		Assert.assertEquals(stringEdit.getString(), getFixture().getString());
	}

	/**
	 * Tests the '{@link no.hal.learning.exercise.AbstractStringEditEvent#createStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEditEvent) <em>Create String Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.AbstractStringEditEvent#createStringEdit(java.lang.String, no.hal.learning.exercise.AbstractStringEditEvent)
	 * @generated NOT
	 */
	public void testCreateStringEdit__String_AbstractStringEditEvent() {
		AbstractStringEditEvent lastStringEditEvent = ExerciseFactory.eINSTANCE.createAbstractStringEditEvent();
		StringEdit lastStringEdit = ExerciseFactory.eINSTANCE.createStringEdit();
		lastStringEdit.setStoredString("a string");
		lastStringEditEvent.setEdit(lastStringEdit);
		testCreateStringEdit__String_AbstractStringEditEvent("another string", lastStringEditEvent);
		testCreateStringEdit__String_AbstractStringEditEvent("a string!", lastStringEditEvent);
		testCreateStringEdit__String_AbstractStringEditEvent("a", lastStringEditEvent);
		testCreateStringEdit__String_AbstractStringEditEvent("string", lastStringEditEvent);
		testCreateStringEdit__String_AbstractStringEditEvent("just a", lastStringEditEvent);
	}

	protected void testCreateStringEdit__String_AbstractStringEditEvent(String string, AbstractStringEditEvent lastStringEditEvent) {
		AbstractStringEdit stringEdit = getFixture().createStringEdit(string, lastStringEditEvent);
		Assert.assertEquals(string, stringEdit.getString());
	}

} //AbstractStringEditEventTest
