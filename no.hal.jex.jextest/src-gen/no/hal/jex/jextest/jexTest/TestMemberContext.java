/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Member Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestMemberContext#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestMemberContext#getInstances <em>Instances</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestMemberContext#getStateFunctions <em>State Functions</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestMemberContext#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestMemberContext()
 * @model
 * @generated
 */
public interface TestMemberContext extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestMemberContext_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestMemberContext#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestMemberContext_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

  /**
   * Returns the value of the '<em><b>State Functions</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.StateFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Functions</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestMemberContext_StateFunctions()
   * @model containment="true"
   * @generated
   */
  EList<StateFunction> getStateFunctions();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestMemberContext_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // TestMemberContext
