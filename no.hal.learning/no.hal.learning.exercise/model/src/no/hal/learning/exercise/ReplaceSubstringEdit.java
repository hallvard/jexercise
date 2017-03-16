/**
 */
package no.hal.learning.exercise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.ReplaceSubstringEdit#getStart <em>Start</em>}</li>
 *   <li>{@link no.hal.learning.exercise.ReplaceSubstringEdit#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getReplaceSubstringEdit()
 * @model
 * @generated
 */
public interface ReplaceSubstringEdit extends StringEdit, RelativeStringEdit {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getReplaceSubstringEdit_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.ReplaceSubstringEdit#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getReplaceSubstringEdit_End()
	 * @model default="-1"
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.ReplaceSubstringEdit#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

} // StringEdit
