/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.learning.exercise.AbstractExercisePart;
import no.hal.learning.exercise.AbstractTask;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.ExercisePackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Quiz Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractExercisePartImpl extends MinimalEObjectImpl.Container implements AbstractExercisePart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExercisePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.ABSTRACT_EXERCISE_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTask> getTasks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePartProposals createProposals() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExercisePackage.ABSTRACT_EXERCISE_PART___GET_TASKS:
				return getTasks();
			case ExercisePackage.ABSTRACT_EXERCISE_PART___GET_TITLE:
				return getTitle();
			case ExercisePackage.ABSTRACT_EXERCISE_PART___CREATE_PROPOSALS:
				return createProposals();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractQuizPartImpl
