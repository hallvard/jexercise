/**
 */
package no.hal.learning.exercise.workbench.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;
import no.hal.learning.exercise.workbench.CommandExecutionProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Execution Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommandExecutionAnswerImpl extends WorkbenchTaskAnswerImpl implements CommandExecutionAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandExecutionAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.COMMAND_EXECUTION_ANSWER;
	}
	
	//

	@Override
	public Proposal<?> createProposal() {
		CommandExecutionProposal proposal = WorkbenchFactory.eINSTANCE.createCommandExecutionProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //CommandExecutionAnswerImpl
