/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Bytes Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.emfs.EmfsPackage#getAbstractBytesContentProvider()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBytesContentProvider extends EmfsFileContentProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	byte[] getByteContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setByteContents(byte[] contents);

} // AbstractBytesContentProvider
