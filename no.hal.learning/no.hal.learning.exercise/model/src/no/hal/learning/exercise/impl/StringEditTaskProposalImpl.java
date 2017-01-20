/**
 */
package no.hal.learning.exercise.impl;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Edit Task Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StringEditTaskProposalImpl<A extends StringEditAnswer> extends TaskProposalImpl<A> implements StringEditTaskProposal<A> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringEditTaskProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.STRING_EDIT_TASK_PROPOSAL;
	}

} //StringEditTaskProposalImpl
