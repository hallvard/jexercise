/**
 */
package no.hal.learning.exercise.junit.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;
import no.hal.learning.exercise.junit.JunitPackage;
import no.hal.learning.exercise.junit.JunitTestAnswer;
import no.hal.learning.exercise.junit.JunitTestProposal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JunitTestProposalImpl extends TaskProposalImpl<JunitTestAnswer> implements JunitTestProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunitTestProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JunitPackage.Literals.JUNIT_TEST_PROPOSAL;
	}

} //JunitTestProposalImpl
