/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Exception Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionExceptionEffect#getExceptionClass <em>Exception Class</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionExceptionEffect()
 * @model
 * @generated
 */
public interface TransitionExceptionEffect extends TransitionEffect
{
  /**
   * Returns the value of the '<em><b>Exception Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Class</em>' containment reference.
   * @see #setExceptionClass(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionExceptionEffect_ExceptionClass()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getExceptionClass();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionExceptionEffect#getExceptionClass <em>Exception Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Class</em>' containment reference.
   * @see #getExceptionClass()
   * @generated
   */
  void setExceptionClass(JvmParameterizedTypeReference value);

} // TransitionExceptionEffect
