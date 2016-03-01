/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.Task;
import no.hal.learning.exercise.TaskRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.TaskRefImpl#getTaskRef <em>Task Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRefImpl extends AbstractTaskImpl implements TaskRef {
	/**
	 * The cached value of the '{@link #getTaskRef() <em>Task Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRef()
	 * @generated
	 * @ordered
	 */
	protected Task taskRef;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.TASK_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getTaskRef() {
		if (taskRef != null && taskRef.eIsProxy()) {
			InternalEObject oldTaskRef = (InternalEObject)taskRef;
			taskRef = (Task)eResolveProxy(oldTaskRef);
			if (taskRef != oldTaskRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.TASK_REF__TASK_REF, oldTaskRef, taskRef));
			}
		}
		return taskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTaskRef() {
		return taskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskRef(Task newTaskRef) {
		Task oldTaskRef = taskRef;
		taskRef = newTaskRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.TASK_REF__TASK_REF, oldTaskRef, taskRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.TASK_REF__TASK_REF:
				if (resolve) return getTaskRef();
				return basicGetTaskRef();
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
			case ExercisePackage.TASK_REF__TASK_REF:
				setTaskRef((Task)newValue);
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
			case ExercisePackage.TASK_REF__TASK_REF:
				setTaskRef((Task)null);
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
			case ExercisePackage.TASK_REF__TASK_REF:
				return taskRef != null;
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public Question getQ() {
		return getTaskRef().getQ();
	}
	
	@Override
	public Answer getA() {
		return getTaskRef().getA();
	}

} //QARefImpl
