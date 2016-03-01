/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Proposals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.ExercisePartProposals#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.learning.exercise.ExercisePartProposals#getExercisePart <em>Exercise Part</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getExercisePartProposals()
 * @model
 * @generated
 */
public interface ExercisePartProposals extends EObject {
	/**
	 * Returns the value of the '<em><b>Proposals</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.Proposal}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposals</em>' containment reference list.
	 * @see no.hal.learning.exercise.ExercisePackage#getExercisePartProposals_Proposals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proposal<?>> getProposals();

	/**
	 * Returns the value of the '<em><b>Exercise Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quiz Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exercise Part</em>' reference.
	 * @see #setExercisePart(ExercisePart)
	 * @see no.hal.learning.exercise.ExercisePackage#getExercisePartProposals_ExercisePart()
	 * @model
	 * @generated
	 */
	ExercisePart getExercisePart();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.ExercisePartProposals#getExercisePart <em>Exercise Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exercise Part</em>' reference.
	 * @see #getExercisePart()
	 * @generated
	 */
	void setExercisePart(ExercisePart value);

} // QuizPartProposals
