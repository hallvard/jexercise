/**
 */
package no.hal.learning.exercise.pydev;

import no.hal.learning.exercise.StringEditAnswer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Edit Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.pydev.PydevSourceEditAnswer#getModuleName <em>Module Name</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.pydev.PydevPackage#getPydevSourceEditAnswer()
 * @model
 * @generated
 */
public interface PydevSourceEditAnswer extends StringEditAnswer {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see no.hal.learning.exercise.pydev.PydevPackage#getPydevSourceEditAnswer_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.pydev.PydevSourceEditAnswer#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

} // PydevSourceEditAnswer
