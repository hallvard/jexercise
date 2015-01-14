/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.EmfsFile#getContentProvider <em>Content Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getEmfsFile()
 * @model
 * @generated
 */
public interface EmfsFile extends EmfsResource, EmfsFileContentProvider {
	/**
	 * Returns the value of the '<em><b>Content Provider</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link no.hal.emfs.EmfsFileContentProvider#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Provider</em>' containment reference.
	 * @see #setContentProvider(EmfsFileContentProvider)
	 * @see no.hal.emfs.EmfsPackage#getEmfsFile_ContentProvider()
	 * @see no.hal.emfs.EmfsFileContentProvider#getFile
	 * @model opposite="file" containment="true"
	 * @generated
	 */
	EmfsFileContentProvider getContentProvider();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfsFile#getContentProvider <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Provider</em>' containment reference.
	 * @see #getContentProvider()
	 * @generated
	 */
	void setContentProvider(EmfsFileContentProvider value);

} // EmfsFile
