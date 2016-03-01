/**
 */
package no.hal.learning.exercise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.ExercisePackage;

import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.ExerciseProposalsImpl#getExercise <em>Exercise</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.ExerciseProposalsImpl#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.ExerciseProposalsImpl#getAllProposals <em>All Proposals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExerciseProposalsImpl extends MinimalEObjectImpl.Container implements ExerciseProposals {
	/**
	 * The cached value of the '{@link #getExercise() <em>Exercise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExercise()
	 * @generated
	 * @ordered
	 */
	protected Exercise exercise;
	/**
	 * The cached value of the '{@link #getProposals() <em>Proposals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<ExercisePartProposals> proposals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExerciseProposalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.EXERCISE_PROPOSALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise getExercise() {
		if (exercise != null && exercise.eIsProxy()) {
			InternalEObject oldExercise = (InternalEObject)exercise;
			exercise = (Exercise)eResolveProxy(oldExercise);
			if (exercise != oldExercise) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.EXERCISE_PROPOSALS__EXERCISE, oldExercise, exercise));
			}
		}
		return exercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise basicGetExercise() {
		return exercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExercise(Exercise newExercise) {
		Exercise oldExercise = exercise;
		exercise = newExercise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.EXERCISE_PROPOSALS__EXERCISE, oldExercise, exercise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExercisePartProposals> getProposals() {
		if (proposals == null) {
			proposals = new EObjectContainmentEList<ExercisePartProposals>(ExercisePartProposals.class, this, ExercisePackage.EXERCISE_PROPOSALS__PROPOSALS);
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Proposal<?>> getAllProposals() {
		EList<Proposal<?>> proposals = new BasicEList<Proposal<?>>();
		for (ExercisePartProposals proposal : getProposals()) {
			proposals.addAll(proposal.getProposals());
		}
		return ECollections.<Proposal<?>>unmodifiableEList(proposals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.EXERCISE_PROPOSALS__PROPOSALS:
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
			case ExercisePackage.EXERCISE_PROPOSALS__EXERCISE:
				if (resolve) return getExercise();
				return basicGetExercise();
			case ExercisePackage.EXERCISE_PROPOSALS__PROPOSALS:
				return getProposals();
			case ExercisePackage.EXERCISE_PROPOSALS__ALL_PROPOSALS:
				return getAllProposals();
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
			case ExercisePackage.EXERCISE_PROPOSALS__EXERCISE:
				setExercise((Exercise)newValue);
				return;
			case ExercisePackage.EXERCISE_PROPOSALS__PROPOSALS:
				getProposals().clear();
				getProposals().addAll((Collection<? extends ExercisePartProposals>)newValue);
				return;
			case ExercisePackage.EXERCISE_PROPOSALS__ALL_PROPOSALS:
				getAllProposals().clear();
				getAllProposals().addAll((Collection<? extends Proposal<?>>)newValue);
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
			case ExercisePackage.EXERCISE_PROPOSALS__EXERCISE:
				setExercise((Exercise)null);
				return;
			case ExercisePackage.EXERCISE_PROPOSALS__PROPOSALS:
				getProposals().clear();
				return;
			case ExercisePackage.EXERCISE_PROPOSALS__ALL_PROPOSALS:
				getAllProposals().clear();
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
			case ExercisePackage.EXERCISE_PROPOSALS__EXERCISE:
				return exercise != null;
			case ExercisePackage.EXERCISE_PROPOSALS__PROPOSALS:
				return proposals != null && !proposals.isEmpty();
			case ExercisePackage.EXERCISE_PROPOSALS__ALL_PROPOSALS:
				return !getAllProposals().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuizProposalsImpl
