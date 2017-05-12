/**
 */
package no.hal.learning.exercise.workspace.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;

import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchProposal;
import no.hal.learning.exercise.workspace.WorkspacePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LaunchProposalImpl<T extends LaunchAnswer> extends TaskProposalImpl<T> implements LaunchProposal<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaunchProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.LAUNCH_PROPOSAL;
	}

} //LaunchProposalImpl
