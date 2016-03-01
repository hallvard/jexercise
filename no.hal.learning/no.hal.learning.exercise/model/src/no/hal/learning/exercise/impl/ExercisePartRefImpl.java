/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.AbstractTask;
import no.hal.learning.exercise.ExercisePart;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.ExercisePartRef;
import no.hal.learning.exercise.ExercisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.ExercisePartRefImpl#getPartRef <em>Part Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExercisePartRefImpl extends AbstractExercisePartImpl implements ExercisePartRef {
	/**
	 * The cached value of the '{@link #getPartRef() <em>Part Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartRef()
	 * @generated
	 * @ordered
	 */
	protected ExercisePart partRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExercisePartRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.EXERCISE_PART_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExercisePart getPartRef() {
		if (partRef != null && partRef.eIsProxy()) {
			InternalEObject oldPartRef = (InternalEObject)partRef;
			partRef = (ExercisePart)eResolveProxy(oldPartRef);
			if (partRef != oldPartRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.EXERCISE_PART_REF__PART_REF, oldPartRef, partRef));
			}
		}
		return partRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePart basicGetPartRef() {
		return partRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartRef(ExercisePart newPartRef) {
		ExercisePart oldPartRef = partRef;
		partRef = newPartRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE_PART_REF__PART_REF, oldPartRef, partRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.EXERCISE_PART_REF__PART_REF:
				if (resolve) return getPartRef();
				return basicGetPartRef();
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
			case ExercisePackage.EXERCISE_PART_REF__PART_REF:
				setPartRef((ExercisePart)newValue);
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
			case ExercisePackage.EXERCISE_PART_REF__PART_REF:
				setPartRef((ExercisePart)null);
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
			case ExercisePackage.EXERCISE_PART_REF__PART_REF:
				return partRef != null;
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public EList<AbstractTask> getTasks() {
		return getPartRef().getTasks();
	}

	@Override
	public String getTitle() {
		return getPartRef().getTitle();
	}
	
	//
	
	@Override
	public ExercisePartProposals createProposals() {
		return getPartRef().createProposals();
	}
	
} //QuizPartRefImpl
