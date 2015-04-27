/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSuite#getSuiteClassName <em>Suite Class Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSuite#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSuite()
 * @model
 * @generated
 */
public interface JexTestSuite extends TestMemberContext
{
  /**
   * Returns the value of the '<em><b>Suite Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suite Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suite Class Name</em>' attribute.
   * @see #setSuiteClassName(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSuite_SuiteClassName()
   * @model
   * @generated
   */
  String getSuiteClassName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestSuite#getSuiteClassName <em>Suite Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suite Class Name</em>' attribute.
   * @see #getSuiteClassName()
   * @generated
   */
  void setSuiteClassName(String value);

  /**
   * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.JexTestCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Cases</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSuite_TestCases()
   * @model containment="true"
   * @generated
   */
  EList<JexTestCase> getTestCases();

} // JexTestSuite
