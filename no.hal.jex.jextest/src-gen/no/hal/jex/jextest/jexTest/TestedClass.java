/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tested Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedClass#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedClass#getSuperInterfaces <em>Super Interfaces</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TestedClass#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass()
 * @model
 * @generated
 */
public interface TestedClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' attribute.
   * @see #setInterface(boolean)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass_Interface()
   * @model
   * @generated
   */
  boolean isInterface();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedClass#isInterface <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' attribute.
   * @see #isInterface()
   * @generated
   */
  void setInterface(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedClass#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class</em>' containment reference.
   * @see #setSuperClass(JvmParameterizedTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass_SuperClass()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getSuperClass();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TestedClass#getSuperClass <em>Super Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Class</em>' containment reference.
   * @see #getSuperClass()
   * @generated
   */
  void setSuperClass(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Super Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmParameterizedTypeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Interfaces</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass_SuperInterfaces()
   * @model containment="true"
   * @generated
   */
  EList<JvmParameterizedTypeReference> getSuperInterfaces();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.jex.jextest.jexTest.TestedOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTestedClass_Methods()
   * @model containment="true"
   * @generated
   */
  EList<TestedOperation> getMethods();

} // TestedClass
