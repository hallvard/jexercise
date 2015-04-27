/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jvm Operation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.JvmOperationRef#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JvmOperationRef#getParameterTypes <em>Parameter Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJvmOperationRef()
 * @model
 * @generated
 */
public interface JvmOperationRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' attribute.
   * @see #setMethodName(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJvmOperationRef_MethodName()
   * @model
   * @generated
   */
  String getMethodName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JvmOperationRef#getMethodName <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' attribute.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(String value);

  /**
   * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmParameterizedTypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Types</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJvmOperationRef_ParameterTypes()
   * @model containment="true"
   * @generated
   */
  EList<JvmParameterizedTypeReference> getParameterTypes();

} // JvmOperationRef
