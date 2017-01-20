/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskProposal;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Activation Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PartTaskProposalImpl extends TaskProposalImpl<PartTaskAnswer> implements PartTaskProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartTaskProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.PART_TASK_PROPOSAL;
	}

	//
	
	@Override
	public String getText() {
		return "Part " + getAnswer().getElementId() + " " + getAnswer().getAction();
	}

} //PartActivationProposalImpl
