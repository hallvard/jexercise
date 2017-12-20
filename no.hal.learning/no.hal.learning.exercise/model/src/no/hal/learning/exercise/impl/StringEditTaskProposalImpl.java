/**
 */
package no.hal.learning.exercise.impl;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;
import no.hal.learning.exercise.TaskEvent;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
	
	@Override
	protected TaskEvent prepareTaskEvent(TaskEvent taskEvent) {
		taskEvent = (AbstractStringEditEvent) super.prepareTaskEvent(taskEvent);
		if (taskEvent instanceof AbstractStringEditEvent) {
			AbstractStringEditEvent stringEditEvent = (AbstractStringEditEvent) taskEvent; 
			EList<TaskEvent> attempts = getAttempts();
			AbstractStringEditEvent lastEvent = null;
			if (! attempts.isEmpty()) {
				lastEvent = (AbstractStringEditEvent) attempts.get(attempts.size() - 1);
			}
			AbstractStringEdit stringEdit = stringEditEvent.createStringEdit(stringEditEvent.getString(), lastEvent);
			stringEditEvent.setEdit(stringEdit);
		}
		return taskEvent;
	}

} //StringEditTaskProposalImpl
