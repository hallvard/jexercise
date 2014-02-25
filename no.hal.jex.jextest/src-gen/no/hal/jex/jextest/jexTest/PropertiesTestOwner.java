/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Test Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.PropertiesTestOwner#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getPropertiesTestOwner()
 * @model
 * @generated
 */
public interface PropertiesTestOwner extends EObject
{
  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(XBlockExpression)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getPropertiesTestOwner_Test()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getTest();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.PropertiesTestOwner#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(XBlockExpression value);

} // PropertiesTestOwner
