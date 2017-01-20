/**
 */
package no.hal.learning.exercise.workbench.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Activation Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PartTaskAnswerImpl extends WorkbenchTaskAnswerImpl implements PartTaskAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartTaskAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.PART_TASK_ANSWER;
	}

	//
	
	@Override
	public Proposal<?> createProposal() {
		PartTaskProposal proposal = WorkbenchFactory.eINSTANCE.createPartTaskProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //PartActivationAnswerImpl
