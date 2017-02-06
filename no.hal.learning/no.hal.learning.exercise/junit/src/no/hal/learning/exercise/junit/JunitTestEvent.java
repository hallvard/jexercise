/**
 */
package no.hal.learning.exercise.junit;

import no.hal.learning.exercise.TaskEvent;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestEvent#getSuccessCount <em>Success Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestEvent#getSuccessTests <em>Success Tests</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestEvent#getFailureCount <em>Failure Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestEvent#getFailureTests <em>Failure Tests</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestEvent#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestEvent#getErrorTests <em>Error Tests</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent()
 * @model annotation="exp4j successRatio='successCount / (successCount + failureCount + errorCount)'"
 * @generated
 */
public interface JunitTestEvent extends TaskEvent {
	/**
	 * Returns the value of the '<em><b>Success Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Count</em>' attribute.
	 * @see #setSuccessCount(int)
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent_SuccessCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='- '"
	 *        annotation="no.hal.emf.ui.parts.plot.IValueProvider priority='3'"
	 * @generated
	 */
	int getSuccessCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.junit.JunitTestEvent#getSuccessCount <em>Success Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Count</em>' attribute.
	 * @see #getSuccessCount()
	 * @generated
	 */
	void setSuccessCount(int value);

	/**
	 * Returns the value of the '<em><b>Success Tests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Tests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Tests</em>' attribute list.
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent_SuccessTests()
	 * @model
	 * @generated
	 */
	EList<String> getSuccessTests();

	/**
	 * Returns the value of the '<em><b>Failure Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Count</em>' attribute.
	 * @see #setFailureCount(int)
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent_FailureCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='- . '"
	 * @generated
	 */
	int getFailureCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.junit.JunitTestEvent#getFailureCount <em>Failure Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Count</em>' attribute.
	 * @see #getFailureCount()
	 * @generated
	 */
	void setFailureCount(int value);

	/**
	 * Returns the value of the '<em><b>Failure Tests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Tests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Tests</em>' attribute list.
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent_FailureTests()
	 * @model
	 * @generated
	 */
	EList<String> getFailureTests();

	/**
	 * Returns the value of the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Count</em>' attribute.
	 * @see #setErrorCount(int)
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent_ErrorCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='. '"
	 * @generated
	 */
	int getErrorCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.junit.JunitTestEvent#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Count</em>' attribute.
	 * @see #getErrorCount()
	 * @generated
	 */
	void setErrorCount(int value);

	/**
	 * Returns the value of the '<em><b>Error Tests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Tests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Tests</em>' attribute list.
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestEvent_ErrorTests()
	 * @model
	 * @generated
	 */
	EList<String> getErrorTests();

} // JunitTestEvent
