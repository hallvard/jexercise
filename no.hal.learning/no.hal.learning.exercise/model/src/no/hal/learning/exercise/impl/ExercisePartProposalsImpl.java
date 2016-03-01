/**
 */
package no.hal.learning.exercise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.learning.exercise.ExercisePart;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.ExercisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Proposals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.ExercisePartProposalsImpl#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.ExercisePartProposalsImpl#getExercisePart <em>Exercise Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExercisePartProposalsImpl extends MinimalEObjectImpl.Container implements ExercisePartProposals {
	/**
	 * The cached value of the '{@link #getProposals() <em>Proposals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposal<?>> proposals;

	/**
	 * The cached value of the '{@link #getExercisePart() <em>Exercise Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExercisePart()
	 * @generated
	 * @ordered
	 */
	protected ExercisePart exercisePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExercisePartProposalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.EXERCISE_PART_PROPOSALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proposal<?>> getProposals() {
		if (proposals == null) {
			proposals = new EObjectContainmentEList<Proposal<?>>(Proposal.class, this, ExercisePackage.EXERCISE_PART_PROPOSALS__PROPOSALS);
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePart getExercisePart() {
		if (exercisePart != null && exercisePart.eIsProxy()) {
			InternalEObject oldExercisePart = (InternalEObject)exercisePart;
			exercisePart = (ExercisePart)eResolveProxy(oldExercisePart);
			if (exercisePart != oldExercisePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.EXERCISE_PART_PROPOSALS__EXERCISE_PART, oldExercisePart, exercisePart));
			}
		}
		return exercisePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePart basicGetExercisePart() {
		return exercisePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExercisePart(ExercisePart newExercisePart) {
		ExercisePart oldExercisePart = exercisePart;
		exercisePart = newExercisePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE_PART_PROPOSALS__EXERCISE_PART, oldExercisePart, exercisePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.EXERCISE_PART_PROPOSALS__PROPOSALS:
				return ((InternalEList<?>)getProposals()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.EXERCISE_PART_PROPOSALS__PROPOSALS:
				return getProposals();
			case ExercisePackage.EXERCISE_PART_PROPOSALS__EXERCISE_PART:
				if (resolve) return getExercisePart();
				return basicGetExercisePart();
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
			case ExercisePackage.EXERCISE_PART_PROPOSALS__PROPOSALS:
				getProposals().clear();
				getProposals().addAll((Collection<? extends Proposal<?>>)newValue);
				return;
			case ExercisePackage.EXERCISE_PART_PROPOSALS__EXERCISE_PART:
				setExercisePart((ExercisePart)newValue);
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
			case ExercisePackage.EXERCISE_PART_PROPOSALS__PROPOSALS:
				getProposals().clear();
				return;
			case ExercisePackage.EXERCISE_PART_PROPOSALS__EXERCISE_PART:
				setExercisePart((ExercisePart)null);
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
			case ExercisePackage.EXERCISE_PART_PROPOSALS__PROPOSALS:
				return proposals != null && !proposals.isEmpty();
			case ExercisePackage.EXERCISE_PART_PROPOSALS__EXERCISE_PART:
				return exercisePart != null;
		}
		return super.eIsSet(featureID);
	}

} //QuizPartProposalsImpl
