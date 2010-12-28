/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JavaElement#getPresent <em>Present</em>}</li>
 *   <li>{@link no.hal.jex.JavaElement#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJavaElement()
 * @model abstract="true"
 * @generated
 */
public interface JavaElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Present</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present</em>' attribute.
	 * @see #setPresent(Boolean)
	 * @see no.hal.jex.JexPackage#getJavaElement_Present()
	 * @model transient="true"
	 * @generated
	 */
	Boolean getPresent();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaElement#getPresent <em>Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Present</em>' attribute.
	 * @see #getPresent()
	 * @generated
	 */
	void setPresent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see no.hal.jex.JexPackage#getJavaElement_Time()
	 * @model transient="true"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaElement#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="no.hal.jex.JavaCoreElement" projectDataType="no.hal.jex.JavaCoreProject"
	 * @generated
	 */
	IJavaElement findJavaCoreElement(IJavaProject project);

} // JavaElement
