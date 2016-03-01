/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskProposal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Proposal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskProposalTest extends ProposalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskProposalTest.class);
	}

	/**
	 * Constructs a new Task Proposal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskProposalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Proposal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaskProposal<?> getFixture() {
		return (TaskProposal<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createTaskProposal());
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

} //TaskProposalTest
