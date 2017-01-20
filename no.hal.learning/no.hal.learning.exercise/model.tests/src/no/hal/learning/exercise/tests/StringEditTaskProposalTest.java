/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StringEditTaskProposal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Edit Task Proposal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringEditTaskProposalTest extends TaskProposalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringEditTaskProposalTest.class);
	}

	/**
	 * Constructs a new String Edit Task Proposal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringEditTaskProposalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Edit Task Proposal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringEditTaskProposal<?> getFixture() {
		return (StringEditTaskProposal<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createStringEditTaskProposal());
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

} //StringEditTaskProposalTest
