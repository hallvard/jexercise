/**
 */
package no.hal.learning.exercise.workbench.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.workbench.DebugEventAnswer;
import no.hal.learning.exercise.workbench.DebugEventProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debug Event Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DebugEventAnswerImpl extends WorkbenchTaskAnswerImpl implements DebugEventAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebugEventAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.DEBUG_EVENT_ANSWER;
	}
	
	//
	
	@Override
	public Proposal<?> createProposal() {
		DebugEventProposal proposal = WorkbenchFactory.eINSTANCE.createDebugEventProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //DebugEventAnswerImpl
