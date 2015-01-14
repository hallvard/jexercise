/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Array Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.ByteArrayContentProvider#getByteContents <em>Byte Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getByteArrayContentProvider()
 * @model
 * @generated
 */
public interface ByteArrayContentProvider extends AbstractBytesContentProvider {
	/**
	 * Returns the value of the '<em><b>Byte Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Contents</em>' attribute.
	 * @see #setByteContents(byte[])
	 * @see no.hal.emfs.EmfsPackage#getByteArrayContentProvider_ByteContents()
	 * @model
	 * @generated
	 */
	byte[] getByteContents();

	/**
	 * Sets the value of the '{@link no.hal.emfs.ByteArrayContentProvider#getByteContents <em>Byte Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Contents</em>' attribute.
	 * @see #getByteContents()
	 * @generated
	 */
	void setByteContents(byte[] value);

} // ByteArrayContentProvider
