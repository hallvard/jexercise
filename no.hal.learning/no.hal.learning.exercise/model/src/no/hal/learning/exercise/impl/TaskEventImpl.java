/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

import no.hal.learning.fv.impl.EFeatureObjectImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.TaskEventImpl#getProposal <em>Proposal</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.TaskEventImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.TaskEventImpl#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskEventImpl extends EFeatureObjectImpl implements TaskEvent {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.TASK_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskProposal<?> getProposal() {
		if (eContainerFeatureID() != ExercisePackage.TASK_EVENT__PROPOSAL) return null;
		return (TaskProposal<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProposal(TaskProposal<?> newProposal, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProposal, ExercisePackage.TASK_EVENT__PROPOSAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposal(TaskProposal<?> newProposal) {
		if (newProposal != eInternalContainer() || (eContainerFeatureID() != ExercisePackage.TASK_EVENT__PROPOSAL && newProposal != null)) {
			if (EcoreUtil.isAncestor(this, newProposal))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProposal != null)
				msgs = ((InternalEObject)newProposal).eInverseAdd(this, ExercisePackage.TASK_PROPOSAL__ATTEMPTS, TaskProposal.class, msgs);
			msgs = basicSetProposal(newProposal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_EVENT__PROPOSAL, newProposal, newProposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_EVENT__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_EVENT__COMPLETION, oldCompletion, completion));
	}

//	private Date tempDate = new Date();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getText() {
//		tempDate.setTime(getTimestamp());
		return getTaskProposal().getText(); // + " @ " + tempDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProposal((TaskProposal<?>)otherEnd, msgs);
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
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				return basicSetProposal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				return eInternalContainer().eInverseRemove(this, ExercisePackage.TASK_PROPOSAL__ATTEMPTS, TaskProposal.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	protected TaskProposal<? extends TaskAnswer> getTaskProposal() {
		return (TaskProposal<? extends TaskAnswer>) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				return getProposal();
			case ExercisePackage.TASK_EVENT__TIMESTAMP:
				return getTimestamp();
			case ExercisePackage.TASK_EVENT__COMPLETION:
				return getCompletion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				setProposal((TaskProposal<?>)newValue);
				return;
			case ExercisePackage.TASK_EVENT__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case ExercisePackage.TASK_EVENT__COMPLETION:
				setCompletion((Double)newValue);
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
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				setProposal((TaskProposal<?>)null);
				return;
			case ExercisePackage.TASK_EVENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case ExercisePackage.TASK_EVENT__COMPLETION:
				setCompletion(COMPLETION_EDEFAULT);
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
			case ExercisePackage.TASK_EVENT__PROPOSAL:
				return getProposal() != null;
			case ExercisePackage.TASK_EVENT__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case ExercisePackage.TASK_EVENT__COMPLETION:
				return completion != COMPLETION_EDEFAULT;
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
			case ExercisePackage.TASK_EVENT___GET_TEXT:
				return getText();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", completion: ");
		result.append(completion);
		result.append(')');
		return result.toString();
	}

} //TaskEventImpl
