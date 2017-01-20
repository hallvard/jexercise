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
 *   <li>{@link no.hal.learning.exercise.StringEdit#getStoredString <em>Stored String</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getStringEdit()
 * @model
 * @generated
 */
public interface StringEdit extends AbstractStringEdit {
	/**
	 * Returns the value of the '<em><b>Stored String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored String</em>' attribute.
	 * @see #setStoredString(String)
	 * @see no.hal.learning.exercise.ExercisePackage#getStringEdit_StoredString()
	 * @model
	 * @generated
	 */
	String getStoredString();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.StringEdit#getStoredString <em>Stored String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stored String</em>' attribute.
	 * @see #getStoredString()
	 * @generated
	 */
	void setStoredString(String value);

} // StringEdit
