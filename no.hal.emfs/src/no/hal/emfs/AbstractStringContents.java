/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract String Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.AbstractStringContents#isWriteable <em>Writeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getAbstractStringContents()
 * @model abstract="true"
 * @generated
 */
public interface AbstractStringContents extends TagsOwner, PropertyOwner {
	/**
	 * Returns the value of the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeable</em>' attribute.
	 * @see #setWriteable(boolean)
	 * @see no.hal.emfs.EmfsPackage#getAbstractStringContents_Writeable()
	 * @model
	 * @generated
	 */
	boolean isWriteable();

	/**
	 * Sets the value of the '{@link no.hal.emfs.AbstractStringContents#isWriteable <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeable</em>' attribute.
	 * @see #isWriteable()
	 * @generated
	 */
	void setWriteable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getStringContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setStringContent(String contents);

} // AbstractStringContents
