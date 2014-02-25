/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionSource#getState <em>State</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionSource#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionSource()
 * @model
 * @generated
 */
public interface TransitionSource extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(State)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionSource_State()
   * @model containment="true"
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionSource#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Ref</em>' reference.
   * @see #setStateRef(State)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionSource_StateRef()
   * @model
   * @generated
   */
  State getStateRef();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionSource#getStateRef <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(State value);

} // TransitionSource
