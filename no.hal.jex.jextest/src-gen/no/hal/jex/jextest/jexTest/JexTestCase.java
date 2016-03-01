/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClasses <em>Tested Classes</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClassRef <em>Tested Class Ref</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestClassName <em>Test Class Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getUrl <em>Url</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestSequences <em>Test Sequences</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase()
 * @model
 * @generated
 */
public interface JexTestCase extends TestMemberContext
{
  /**
   * Returns the value of the '<em><b>Tested Classes</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.TestedClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tested Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tested Classes</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_TestedClasses()
   * @model containment="true"
   * @generated
   */
  EList<TestedClass> getTestedClasses();

  /**
   * Returns the value of the '<em><b>Tested Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tested Class Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tested Class Ref</em>' containment reference.
   * @see #setTestedClassRef(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getJexTestCase_TestedClassRef()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getTestedClassRef();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClassRef <em>Tested Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tested Class Ref</em>' containment reference.
   * @see #getTestedClassRef()
   * @generated
   */
  void setTestedClassRef(JvmParameterizedTypeReference value);

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

} // JexTestCase
