/**
 */
package no.hal.learning.exercise.jdt.impl;

import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchProposal;
import no.hal.learning.exercise.jdt.JdtPackage;

import no.hal.learning.exercise.workspace.impl.LaunchProposalImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JdtLaunchProposalImpl extends LaunchProposalImpl<JdtLaunchAnswer> implements JdtLaunchProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JdtLaunchProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdtPackage.Literals.JDT_LAUNCH_PROPOSAL;
	}

	//
	
	@Override
	public String getText() {
		return "Launched " + getAnswer().getClassName();
	}
} //JdtLaunchProposalImpl
