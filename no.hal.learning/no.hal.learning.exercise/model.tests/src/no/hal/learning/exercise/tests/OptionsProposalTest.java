/**
 */
package no.hal.learning.exercise.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.OptionsProposal;
import no.hal.learning.exercise.ExerciseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Options Proposal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsProposalTest extends ProposalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionsProposalTest.class);
	}

	/**
	 * Constructs a new Options Proposal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsProposalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Options Proposal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OptionsProposal getFixture() {
		return (OptionsProposal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createOptionsProposal());
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

} //OptionsProposalTest
