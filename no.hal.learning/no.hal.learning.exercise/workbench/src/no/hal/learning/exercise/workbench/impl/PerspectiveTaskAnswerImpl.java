/**
 */
package no.hal.learning.exercise.workbench.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;
import no.hal.learning.exercise.workbench.PerspectiveTaskProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Activation Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PerspectiveTaskAnswerImpl extends WorkbenchTaskAnswerImpl implements PerspectiveTaskAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveTaskAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.PERSPECTIVE_TASK_ANSWER;
	}

	//
	
	@Override
	public Proposal<?> createProposal() {
		PerspectiveTaskProposal proposal = WorkbenchFactory.eINSTANCE.createPerspectiveTaskProposal();
		proposal.setAnswer(this);
		return proposal;
	}
	
} //PerspectiveActivationAnswerImpl
