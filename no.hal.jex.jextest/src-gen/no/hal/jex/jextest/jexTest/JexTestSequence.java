/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSequence#getTested <em>Tested</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSequence#getInstances <em>Instances</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestSequence#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSequence()
 * @model
 * @generated
 */
public interface JexTestSequence extends StateTestContext
{
  /**
   * Returns the value of the '<em><b>Tested</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.JvmOperationRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tested</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tested</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSequence_Tested()
   * @model containment="true"
   * @generated
   */
  EList<JvmOperationRef> getTested();

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSequence_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestSequence_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // JexTestSequence
