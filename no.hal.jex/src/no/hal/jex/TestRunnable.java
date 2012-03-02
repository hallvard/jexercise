/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.TestRunnable#getTestedElement <em>Tested Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getTestRunnable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TestRunnable extends Member {
	/**
	 * Returns the value of the '<em><b>Tested Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tested Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tested Element</em>' reference.
	 * @see #setTestedElement(Member)
	 * @see no.hal.jex.JexPackage#getTestRunnable_TestedElement()
	 * @model
	 * @generated
	 */
	Member getTestedElement();

	/**
	 * Sets the value of the '{@link no.hal.jex.TestRunnable#getTestedElement <em>Tested Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tested Element</em>' reference.
	 * @see #getTestedElement()
	 * @generated
	 */
	void setTestedElement(Member value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TestRunnable> getTestRuns();

} // TestRunnable