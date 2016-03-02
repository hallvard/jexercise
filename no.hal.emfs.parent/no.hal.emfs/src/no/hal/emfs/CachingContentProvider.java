/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caching Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.CachingContentProvider#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link no.hal.emfs.CachingContentProvider#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getCachingContentProvider()
 * @model
 * @generated
 */
public interface CachingContentProvider extends EmfsFileContentProvider {
	/**
	 * Returns the value of the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Provider</em>' containment reference.
	 * @see #setContentProvider(EmfsFileContentProvider)
	 * @see no.hal.emfs.EmfsPackage#getCachingContentProvider_ContentProvider()
	 * @model containment="true"
	 * @generated
	 */
	EmfsFileContentProvider getContentProvider();

	/**
	 * Sets the value of the '{@link no.hal.emfs.CachingContentProvider#getContentProvider <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Provider</em>' containment reference.
	 * @see #getContentProvider()
	 * @generated
	 */
	void setContentProvider(EmfsFileContentProvider value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(byte[])
	 * @see no.hal.emfs.EmfsPackage#getCachingContentProvider_Cache()
	 * @model transient="true"
	 * @generated
	 */
	byte[] getCache();

	/**
	 * Sets the value of the '{@link no.hal.emfs.CachingContentProvider#getCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(byte[] value);

} // CachingContentProvider
