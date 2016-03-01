/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.Task;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskTest extends AbstractTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskTest.class);
	}

	/**
	 * Constructs a new Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Task getFixture() {
		return (Task)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createTask());
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

} //QATest
