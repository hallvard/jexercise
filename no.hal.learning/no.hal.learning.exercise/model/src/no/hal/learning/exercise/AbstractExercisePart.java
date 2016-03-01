/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Quiz Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.learning.exercise.ExercisePackage#getAbstractExercisePart()
 * @model abstract="true"
 * @generated
 */
public interface AbstractExercisePart extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractTask> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ExercisePartProposals createProposals();
} // AbstractQuizPart
