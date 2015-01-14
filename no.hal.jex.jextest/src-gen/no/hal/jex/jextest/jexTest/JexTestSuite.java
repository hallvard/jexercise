/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSuite#getPack <em>Pack</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSuite#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSuite#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSuite()
 * @model
 * @generated
 */
public interface JexTestSuite extends EObject
{
  /**
   * Returns the value of the '<em><b>Pack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pack</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pack</em>' attribute.
   * @see #setPack(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSuite_Pack()
   * @model
   * @generated
   */
  String getPack();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestSuite#getPack <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pack</em>' attribute.
   * @see #getPack()
   * @generated
   */
  void setPack(String value);

  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSuite_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestSuite#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

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
