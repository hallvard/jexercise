/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JavaMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link no.hal.jex.JavaMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.jex.JavaMethod#getThrowables <em>Throwables</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJavaMethod()
 * @model
 * @generated
 */
public interface JavaMethod extends Member {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see no.hal.jex.JexPackage#getJavaMethod_ReturnType()
	 * @model dataType="no.hal.jex.DeclarationType"
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaMethod#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see no.hal.jex.JexPackage#getJavaMethod_Parameters()
	 * @model unique="false" dataType="no.hal.jex.DeclarationType"
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Throwables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throwables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throwables</em>' attribute list.
	 * @see no.hal.jex.JexPackage#getJavaMethod_Throwables()
	 * @model dataType="no.hal.jex.ClassName"
	 * @generated
	 */
	EList<String> getThrowables();

} // JavaMethod
