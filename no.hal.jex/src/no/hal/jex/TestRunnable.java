/**
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
 *   <li>{@link no.hal.jex.TestRunnable#getTestedElements <em>Tested Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getTestRunnable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TestRunnable extends Member {
	/**
	 * Returns the value of the '<em><b>Tested Elements</b></em>' reference list.
	 * The list contents are of type {@link no.hal.jex.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tested Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tested Elements</em>' reference list.
	 * @see no.hal.jex.JexPackage#getTestRunnable_TestedElements()
	 * @model
	 * @generated
	 */
	EList<Member> getTestedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TestRunnable> getTestRuns();

} // TestRunnable
