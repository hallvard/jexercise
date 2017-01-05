/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Callback Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getInstance <em>Instance</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getCallbackClass <em>Callback Class</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionCallbackEffect()
 * @model
 * @generated
 */
public interface TransitionCallbackEffect extends TransitionEffect2
{
  /**
   * Returns the value of the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' reference.
   * @see #setInstance(Instance)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionCallbackEffect_Instance()
   * @model
   * @generated
   */
  Instance getInstance();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(Instance value);

  /**
   * Returns the value of the '<em><b>Callback Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callback Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callback Class</em>' containment reference.
   * @see #setCallbackClass(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionCallbackEffect_CallbackClass()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getCallbackClass();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getCallbackClass <em>Callback Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callback Class</em>' containment reference.
   * @see #getCallbackClass()
   * @generated
   */
  void setCallbackClass(JvmParameterizedTypeReference value);

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionCallbackEffect_MethodName()
   * @model
   * @generated
   */
  String getMethodName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getMethodName <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' attribute.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(String value);

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionCallbackEffect_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(XBlockExpression)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionCallbackEffect_Arguments()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getArguments();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(XBlockExpression value);

} // TransitionCallbackEffect
