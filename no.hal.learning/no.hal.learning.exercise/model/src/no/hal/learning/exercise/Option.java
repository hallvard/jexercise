/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.Option#isCorrect <em>Correct</em>}</li>
 *   <li>{@link no.hal.learning.exercise.Option#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct</em>' attribute.
	 * @see #setCorrect(boolean)
	 * @see no.hal.learning.exercise.ExercisePackage#getOption_Correct()
	 * @model
	 * @generated
	 */
	boolean isCorrect();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.Option#isCorrect <em>Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct</em>' attribute.
	 * @see #isCorrect()
	 * @generated
	 */
	void setCorrect(boolean value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(OptionAnswer)
	 * @see no.hal.learning.exercise.ExercisePackage#getOption_Option()
	 * @model containment="true"
	 * @generated
	 */
	OptionAnswer getOption();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.Option#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(OptionAnswer value);

} // Option
