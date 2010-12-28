/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import org.eclipse.jdt.core.IField;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JavaField#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJavaField()
 * @model
 * @generated
 */
public interface JavaField extends Member {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see no.hal.jex.JexPackage#getJavaField_Type()
	 * @model dataType="no.hal.jex.DeclarationType"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	// support methods
	
	public Boolean validateType(IField field);

} // JavaField
