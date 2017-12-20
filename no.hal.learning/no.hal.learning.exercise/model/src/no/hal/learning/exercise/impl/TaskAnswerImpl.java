/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.TaskAnswerImpl#getRequiredCount <em>Required Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskAnswerImpl extends AnswerImpl implements TaskAnswer {
	/**
	 * The default value of the '{@link #getRequiredCount() <em>Required Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_COUNT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRequiredCount() <em>Required Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCount()
	 * @generated
	 * @ordered
	 */
	protected int requiredCount = REQUIRED_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.TASK_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredCount() {
		return requiredCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCount(int newRequiredCount) {
		int oldRequiredCount = requiredCount;
		requiredCount = newRequiredCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_ANSWER__REQUIRED_COUNT, oldRequiredCount, requiredCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean acceptEvent(TaskEvent event) {
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.TASK_ANSWER__REQUIRED_COUNT:
				return getRequiredCount();
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
			case ExercisePackage.TASK_ANSWER__REQUIRED_COUNT:
				setRequiredCount((Integer)newValue);
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
			case ExercisePackage.TASK_ANSWER__REQUIRED_COUNT:
				setRequiredCount(REQUIRED_COUNT_EDEFAULT);
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
			case ExercisePackage.TASK_ANSWER__REQUIRED_COUNT:
				return requiredCount != REQUIRED_COUNT_EDEFAULT;
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
			case ExercisePackage.TASK_ANSWER___ACCEPT_EVENT__TASKEVENT:
				return acceptEvent((TaskEvent)arguments.get(0));
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
		result.append(" (requiredCount: ");
		result.append(requiredCount);
		result.append(')');
		return result.toString();
	}
} //TaskAnswerImpl
