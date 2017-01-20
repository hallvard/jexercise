/**
 */
package no.hal.learning.exercise.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.exercise.TaskEvent#getText() <em>Get Text</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TaskEventTest extends TestCase {

	/**
	 * The fixture for this Task Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskEvent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskEventTest.class);
	}

	/**
	 * Constructs a new Task Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskEventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskEvent getFixture() {
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
		setFixture(ExerciseFactory.eINSTANCE.createTaskEvent());
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
	 * Tests the '{@link no.hal.learning.exercise.TaskEvent#getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.TaskEvent#getText()
	 * @generated NOT
	 */
	public void testGetText() {
	}

} //TaskEventTest
