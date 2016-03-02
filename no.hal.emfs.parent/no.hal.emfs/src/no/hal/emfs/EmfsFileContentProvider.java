/**
 */
package no.hal.emfs;

import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.EmfsFileContentProvider#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getEmfsFileContentProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EmfsFileContentProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.emfs.EmfsFile#getContentProvider <em>Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' container reference.
	 * @see #setFile(EmfsFile)
	 * @see no.hal.emfs.EmfsPackage#getEmfsFileContentProvider_File()
	 * @see no.hal.emfs.EmfsFile#getContentProvider
	 * @model opposite="contentProvider" transient="false"
	 * @generated
	 */
	EmfsFile getFile();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfsFileContentProvider#getFile <em>File</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' container reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(EmfsFile value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="no.hal.emfs.EInputStream"
	 * @generated
	 */
	InputStream getInputStream(int options);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="no.hal.emfs.EOutputStream"
	 * @generated
	 */
	OutputStream getOutputStream(int options);

} // EmfsResourceContentProvider
