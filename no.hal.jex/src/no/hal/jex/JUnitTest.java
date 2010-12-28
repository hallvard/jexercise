/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JUnit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JUnitTest#getTestRunnable <em>Test Runnable</em>}</li>
 *   <li>{@link no.hal.jex.JUnitTest#getPoints <em>Points</em>}</li>
 *   <li>{@link no.hal.jex.JUnitTest#getTestStatus <em>Test Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJUnitTest()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PositivePoints'"
 * @generated
 */
public interface JUnitTest extends JavaRequirement {
	/**
	 * Returns the value of the '<em><b>Test Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Runnable</em>' reference.
	 * @see #setTestRunnable(TestRunnable)
	 * @see no.hal.jex.JexPackage#getJUnitTest_TestRunnable()
	 * @model
	 * @generated
	 */
	TestRunnable getTestRunnable();

	/**
	 * Sets the value of the '{@link no.hal.jex.JUnitTest#getTestRunnable <em>Test Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Runnable</em>' reference.
	 * @see #getTestRunnable()
	 * @generated
	 */
	void setTestRunnable(TestRunnable value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see no.hal.jex.JexPackage#getJUnitTest_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link no.hal.jex.JUnitTest#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Test Status</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Status</em>' attribute.
	 * @see #setTestStatus(int)
	 * @see no.hal.jex.JexPackage#getJUnitTest_TestStatus()
	 * @model default="-1" transient="true"
	 * @generated
	 */
	int getTestStatus();

	/**
	 * Sets the value of the '{@link no.hal.jex.JUnitTest#getTestStatus <em>Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Status</em>' attribute.
	 * @see #getTestStatus()
	 * @generated
	 */
	void setTestStatus(int value);

} // JUnitTest