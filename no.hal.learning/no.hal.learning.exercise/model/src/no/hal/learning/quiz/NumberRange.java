/**
 */
package no.hal.learning.quiz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.NumberRange#getMin <em>Min</em>}</li>
 *   <li>{@link no.hal.learning.quiz.NumberRange#getMax <em>Max</em>}</li>
 *   <li>{@link no.hal.learning.quiz.NumberRange#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.quiz.QuizPackage#getNumberRange()
 * @model
 * @generated
 */
public interface NumberRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Double)
	 * @see no.hal.learning.quiz.QuizPackage#getNumberRange_Min()
	 * @model
	 * @generated
	 */
	Double getMin();

	/**
	 * Sets the value of the '{@link no.hal.learning.quiz.NumberRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Double)
	 * @see no.hal.learning.quiz.QuizPackage#getNumberRange_Max()
	 * @model
	 * @generated
	 */
	Double getMax();

	/**
	 * Sets the value of the '{@link no.hal.learning.quiz.NumberRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Double value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(Double)
	 * @see no.hal.learning.quiz.QuizPackage#getNumberRange_Step()
	 * @model
	 * @generated
	 */
	Double getStep();

	/**
	 * Sets the value of the '{@link no.hal.learning.quiz.NumberRange#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Double value);

} // NumberRange
