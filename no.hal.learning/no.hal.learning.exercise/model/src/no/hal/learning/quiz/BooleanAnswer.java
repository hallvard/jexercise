/**
 */
package no.hal.learning.quiz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.BooleanAnswer#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.quiz.QuizPackage#getBooleanAnswer()
 * @model superTypes="no.hal.learning.quiz.SimpleAnswer<org.eclipse.emf.ecore.EBooleanObject>"
 * @generated
 */
public interface BooleanAnswer extends SimpleAnswer<Boolean> {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see no.hal.learning.quiz.QuizPackage#getBooleanAnswer_Value()
	 * @model
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link no.hal.learning.quiz.BooleanAnswer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);
} // BooleanAnswer
