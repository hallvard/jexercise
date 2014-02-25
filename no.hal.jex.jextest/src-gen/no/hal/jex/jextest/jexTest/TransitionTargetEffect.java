/**
 */
package no.hal.jex.jextest.jexTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Target Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect#getState <em>State</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionTargetEffect()
 * @model
 * @generated
 */
public interface TransitionTargetEffect extends TransitionEffect
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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionTargetEffect_State()
   * @model containment="true"
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect#getState <em>State</em>}' containment reference.
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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionTargetEffect_StateRef()
   * @model
   * @generated
   */
  State getStateRef();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect#getStateRef <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Ref</em>' reference.
   * @see #getStateRef()
   * @generated
   */
  void setStateRef(State value);

} // TransitionTargetEffect
