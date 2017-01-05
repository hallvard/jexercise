/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tested Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedOperation#getPreExpression <em>Pre Expression</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedOperation#getPostExpression <em>Post Expression</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedOperation()
 * @model
 * @generated
 */
public interface TestedOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterList)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedOperation_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedOperation#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedOperation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedOperation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Pre Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Expression</em>' containment reference.
   * @see #setPreExpression(XExpression)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedOperation_PreExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getPreExpression();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedOperation#getPreExpression <em>Pre Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Expression</em>' containment reference.
   * @see #getPreExpression()
   * @generated
   */
  void setPreExpression(XExpression value);

  /**
   * Returns the value of the '<em><b>Post Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Expression</em>' containment reference.
   * @see #setPostExpression(XExpression)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedOperation_PostExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getPostExpression();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedOperation#getPostExpression <em>Post Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Expression</em>' containment reference.
   * @see #getPostExpression()
   * @generated
   */
  void setPostExpression(XExpression value);

} // TestedOperation
