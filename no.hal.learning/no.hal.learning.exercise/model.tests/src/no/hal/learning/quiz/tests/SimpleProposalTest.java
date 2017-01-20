/**
 */
package no.hal.learning.quiz.tests;

import junit.textui.TestRunner;
import no.hal.learning.exercise.tests.ProposalTest;
import no.hal.learning.quiz.QuizFactory;
import no.hal.learning.quiz.SimpleProposal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Proposal</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class SimpleProposalTest extends ProposalTest {

	/**
	 * The fixture for this Simple Proposal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleProposal<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleProposalTest.class);
	}

	/**
	 * Constructs a new Simple Proposal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleProposalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simple Proposal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimpleProposal<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simple Proposal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleProposal<?> getFixture() {
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
		setFixture(QuizFactory.eINSTANCE.createSimpleProposal());
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

} //SimpleProposalTest
