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
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.TestSuite#getTestRuns <em>Test Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends JavaClass, TestRunnable {
	/**
	 * Returns the value of the '<em><b>Test Runs</b></em>' reference list.
	 * The list contents are of type {@link no.hal.jex.TestRunnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Runs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Runs</em>' reference list.
	 * @see no.hal.jex.JexPackage#getTestSuite_TestRuns()
	 * @model
	 * @generated
	 */
	EList<TestRunnable> getTestRuns();

} // TestSuite