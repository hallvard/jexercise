/**
 */
package no.hal.learning.exercise.junit;

import org.eclipse.emf.common.util.EList;

import no.hal.learning.exercise.TaskAnswer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestAnswer#getTestRunName <em>Test Run Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.JunitTestAnswer#getMethodNames <em>Method Names</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestAnswer()
 * @model
 * @generated
 */
public interface JunitTestAnswer extends TaskAnswer {
	/**
	 * Returns the value of the '<em><b>Test Run Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Run Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Run Name</em>' attribute.
	 * @see #setTestRunName(String)
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestAnswer_TestRunName()
	 * @model
	 * @generated
	 */
	String getTestRunName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.junit.JunitTestAnswer#getTestRunName <em>Test Run Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Run Name</em>' attribute.
	 * @see #getTestRunName()
	 * @generated
	 */
	void setTestRunName(String value);

	/**
	 * Returns the value of the '<em><b>Method Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Names</em>' attribute list.
	 * @see no.hal.learning.exercise.junit.JunitPackage#getJunitTestAnswer_MethodNames()
	 * @model
	 * @generated
	 */
	EList<String> getMethodNames();

} // JunitTestAnswer
