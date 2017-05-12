/**
 */
package no.hal.learning.exercise.pydev.impl;

import no.hal.learning.exercise.pydev.PydevLaunchAnswer;
import no.hal.learning.exercise.pydev.PydevLaunchProposal;
import no.hal.learning.exercise.pydev.PydevPackage;

import no.hal.learning.exercise.workspace.impl.LaunchProposalImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PydevLaunchProposalImpl extends LaunchProposalImpl<PydevLaunchAnswer> implements PydevLaunchProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PydevLaunchProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PydevPackage.Literals.PYDEV_LAUNCH_PROPOSAL;
	}

	//
	
	@Override
	public String getText() {
		return "Launched " + getAnswer().getModuleName();
	}

} //PydevLaunchProposalImpl
