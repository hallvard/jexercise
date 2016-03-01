/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.OptionsAnswer#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getOptionsAnswer()
 * @model
 * @generated
 */
public interface OptionsAnswer extends Answer {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see no.hal.learning.exercise.ExercisePackage#getOptionsAnswer_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // OptionsAnswer
