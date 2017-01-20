/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;
import no.hal.learning.exercise.workbench.CommandExecutionProposal;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Execution Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommandExecutionProposalImpl extends TaskProposalImpl<CommandExecutionAnswer> implements CommandExecutionProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandExecutionProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.COMMAND_EXECUTION_PROPOSAL;
	}

	//
	
	@Override
	public String getText() {
		return "Command " + getAnswer().getElementId() + " executed";
	}

} //CommandExecutionProposalImpl
