/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.Transition#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.Transition#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(TransitionSource)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransition_Source()
   * @model containment="true"
   * @generated
   */
  TransitionSource getSource();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.Transition#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(TransitionSource value);

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransition_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.Transition#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.TransitionAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransition_Actions()
   * @model containment="true"
   * @generated
   */
  EList<TransitionAction> getActions();

  /**
   * Returns the value of the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' containment reference.
   * @see #setEffect(TransitionEffect)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransition_Effect()
   * @model containment="true"
   * @generated
   */
  TransitionEffect getEffect();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.Transition#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(TransitionEffect value);

} // Transition
