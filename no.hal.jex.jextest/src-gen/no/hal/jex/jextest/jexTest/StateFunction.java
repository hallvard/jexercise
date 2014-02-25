/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.StateFunction#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.StateFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getStateFunction()
 * @model
 * @generated
 */
public interface StateFunction extends StateTestContext, PropertiesTestOwner
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getStateFunction_Type()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getType();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.StateFunction#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getStateFunction_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // StateFunction
