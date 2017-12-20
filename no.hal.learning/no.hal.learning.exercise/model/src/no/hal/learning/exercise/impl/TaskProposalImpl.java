/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.TaskProposalImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.TaskProposalImpl#getProof <em>Proof</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.TaskProposalImpl#getAttemptCount <em>Attempt Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.TaskProposalImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.TaskProposalImpl#getPerformedCount <em>Performed Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskProposalImpl<T extends TaskAnswer> extends ProposalImpl<T> implements TaskProposal<T> {
	/**
	 * The default value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPLETION_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected double completion = COMPLETION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProof()
	 * @generated
	 * @ordered
	 */
	protected static final String PROOF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProof()
	 * @generated
	 * @ordered
	 */
	protected String proof = PROOF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttemptCount() <em>Attempt Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttemptCount() <em>Attempt Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptCount()
	 * @generated
	 * @ordered
	 */
	protected int attemptCount = ATTEMPT_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttempts() <em>Attempts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskEvent> attempts;

	/**
	 * The default value of the '{@link #getPerformedCount() <em>Performed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PERFORMED_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPerformedCount() <em>Performed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedCount()
	 * @generated
	 * @ordered
	 */
	protected int performedCount = PERFORMED_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.TASK_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAnswer(T newAnswer) {
		super.setAnswer(newAnswer);
	}
	
	protected boolean useAttempts() {
		return getAttempts().size() > attemptCount;
	}
	
	protected TaskEvent lastAttempt() {
		return getAttempts().get(getAttempts().size() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(double newCompletion) {
		double oldCompletion = completion;
		completion = newCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_PROPOSAL__COMPLETION, oldCompletion, completion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProof() {
		return proof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProof(String newProof) {
		String oldProof = proof;
		proof = newProof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_PROPOSAL__PROOF, oldProof, proof));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAttemptCount() {
		return (useAttempts() ? getAttempts().size() : attemptCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttemptCount(int newAttemptCount) {
		int oldAttemptCount = attemptCount;
		attemptCount = newAttemptCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT, oldAttemptCount, attemptCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskEvent> getAttempts() {
		if (attempts == null) {
			attempts = new EObjectContainmentWithInverseEList<TaskEvent>(TaskEvent.class, this, ExercisePackage.TASK_PROPOSAL__ATTEMPTS, ExercisePackage.TASK_EVENT__PROPOSAL);
		}
		return attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPerformedCount() {
		return performedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedCount(int newPerformedCount) {
		int oldPerformedCount = performedCount;
		performedCount = newPerformedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT, oldPerformedCount, performedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean addTaskEvent(TaskEvent taskEvent) {
		if (getAnswer() != null && getAnswer().acceptEvent(taskEvent)) {
			TaskEvent preparedEvent = prepareTaskEvent(taskEvent);
			if (preparedEvent != null) {
				getAttempts().add(preparedEvent);
				return true;
			}
		}
		return false;
	}

	protected TaskEvent prepareTaskEvent(TaskEvent taskEvent) {
		if (taskEvent.eContainer() != null) {
			taskEvent = EcoreUtil.copy(taskEvent);
		}
		return taskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.TASK_PROPOSAL__ATTEMPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttempts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.TASK_PROPOSAL__ATTEMPTS:
				return ((InternalEList<?>)getAttempts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.TASK_PROPOSAL__COMPLETION:
				return getCompletion();
			case ExercisePackage.TASK_PROPOSAL__PROOF:
				return getProof();
			case ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				return getAttemptCount();
			case ExercisePackage.TASK_PROPOSAL__ATTEMPTS:
				return getAttempts();
			case ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT:
				return getPerformedCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExercisePackage.TASK_PROPOSAL__COMPLETION:
				setCompletion((Double)newValue);
				return;
			case ExercisePackage.TASK_PROPOSAL__PROOF:
				setProof((String)newValue);
				return;
			case ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				setAttemptCount((Integer)newValue);
				return;
			case ExercisePackage.TASK_PROPOSAL__ATTEMPTS:
				getAttempts().clear();
				getAttempts().addAll((Collection<? extends TaskEvent>)newValue);
				return;
			case ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT:
				setPerformedCount((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExercisePackage.TASK_PROPOSAL__COMPLETION:
				setCompletion(COMPLETION_EDEFAULT);
				return;
			case ExercisePackage.TASK_PROPOSAL__PROOF:
				setProof(PROOF_EDEFAULT);
				return;
			case ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				setAttemptCount(ATTEMPT_COUNT_EDEFAULT);
				return;
			case ExercisePackage.TASK_PROPOSAL__ATTEMPTS:
				getAttempts().clear();
				return;
			case ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT:
				setPerformedCount(PERFORMED_COUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExercisePackage.TASK_PROPOSAL__COMPLETION:
				return completion != COMPLETION_EDEFAULT;
			case ExercisePackage.TASK_PROPOSAL__PROOF:
				return PROOF_EDEFAULT == null ? proof != null : !PROOF_EDEFAULT.equals(proof);
			case ExercisePackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				return attemptCount != ATTEMPT_COUNT_EDEFAULT;
			case ExercisePackage.TASK_PROPOSAL__ATTEMPTS:
				return attempts != null && !attempts.isEmpty();
			case ExercisePackage.TASK_PROPOSAL__PERFORMED_COUNT:
				return performedCount != PERFORMED_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExercisePackage.TASK_PROPOSAL___GET_TEXT:
				return getText();
			case ExercisePackage.TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT:
				return addTaskEvent((TaskEvent)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (completion: ");
		result.append(completion);
		result.append(", proof: ");
		result.append(proof);
		result.append(", attemptCount: ");
		result.append(attemptCount);
		result.append(", performedCount: ");
		result.append(performedCount);
		result.append(')');
		return result.toString();
	}

} //TaskProposalImpl
