/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;
import no.hal.learning.exercise.workbench.PerspectiveTaskProposal;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Activation Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PerspectiveTaskProposalImpl extends TaskProposalImpl<PerspectiveTaskAnswer> implements PerspectiveTaskProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveTaskProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.PERSPECTIVE_TASK_PROPOSAL;
	}

	//
	
	@Override
	public String getText() {
		return "Perspective " + getAnswer().getElementId() + " " + getAnswer().getAction();
	}

} //PerspectiveActivationProposalImpl
