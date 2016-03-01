/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskRef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskRefTest extends AbstractTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskRefTest.class);
	}

	/**
	 * Constructs a new Task Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskRef getFixture() {
		return (TaskRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createTaskRef());
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

} //QARefTest
