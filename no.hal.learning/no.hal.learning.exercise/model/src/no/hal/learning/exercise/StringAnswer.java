/**
 */
package no.hal.learning.exercise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.StringAnswer#getValue <em>Value</em>}</li>
 *   <li>{@link no.hal.learning.exercise.StringAnswer#getFormat <em>Format</em>}</li>
 *   <li>{@link no.hal.learning.exercise.StringAnswer#isRegexp <em>Regexp</em>}</li>
 *   <li>{@link no.hal.learning.exercise.StringAnswer#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getStringAnswer()
 * @model superTypes="no.hal.learning.exercise.SimpleAnswer<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface StringAnswer extends SimpleAnswer<String> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see no.hal.learning.exercise.ExercisePackage#getStringAnswer_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.StringAnswer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see no.hal.learning.exercise.ExercisePackage#getStringAnswer_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.StringAnswer#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' attribute.
	 * @see #setRegexp(boolean)
	 * @see no.hal.learning.exercise.ExercisePackage#getStringAnswer_Regexp()
	 * @model
	 * @generated
	 */
	boolean isRegexp();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.StringAnswer#isRegexp <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' attribute.
	 * @see #isRegexp()
	 * @generated
	 */
	void setRegexp(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see no.hal.learning.exercise.ExercisePackage#getStringAnswer_IgnoreCase()
	 * @model
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.StringAnswer#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

} // StringAnswer
