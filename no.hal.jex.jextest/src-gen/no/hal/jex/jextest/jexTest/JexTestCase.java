/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClass <em>Tested Class</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestClassName <em>Test Class Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getUrl <em>Url</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getInstances <em>Instances</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getStateFunctions <em>State Functions</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestSequences <em>Test Sequences</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase()
 * @model
 * @generated
 */
public interface JexTestCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Tested Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tested Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tested Class</em>' containment reference.
   * @see #setTestedClass(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_TestedClass()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getTestedClass();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClass <em>Tested Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tested Class</em>' containment reference.
   * @see #getTestedClass()
   * @generated
   */
  void setTestedClass(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Test Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Class Name</em>' attribute.
   * @see #setTestClassName(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_TestClassName()
   * @model
   * @generated
   */
  String getTestClassName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestClassName <em>Test Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Class Name</em>' attribute.
   * @see #getTestClassName()
   * @generated
   */
  void setTestClassName(String value);

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestCase#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestCase#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestCase#getImportSection <em>Import Section</em>}' containment reference.
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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_Instances()
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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_StateFunctions()
   * @model containment="true"
   * @generated
   */
  EList<StateFunction> getStateFunctions();

  /**
   * Returns the value of the '<em><b>Test Sequences</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.JexTestSequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Sequences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Sequences</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_TestSequences()
   * @model containment="true"
   * @generated
   */
  EList<JexTestSequence> getTestSequences();

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // JexTestCase
