/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tested Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedMethod#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedMethod#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedMethod()
 * @model
 * @generated
 */
public interface TestedMethod extends TestedOperation
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedMethod_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedMethod#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedMethod_ReturnType()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getReturnType();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedMethod#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TestedMethod
