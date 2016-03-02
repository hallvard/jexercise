/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.URLContentProvider#getUrlString <em>Url String</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getURLContentProvider()
 * @model
 * @generated
 */
public interface URLContentProvider extends AbstractURLContentProvider {
	/**
	 * Returns the value of the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url String</em>' attribute.
	 * @see #setUrlString(String)
	 * @see no.hal.emfs.EmfsPackage#getURLContentProvider_UrlString()
	 * @model
	 * @generated
	 */
	String getUrlString();

	/**
	 * Sets the value of the '{@link no.hal.emfs.URLContentProvider#getUrlString <em>Url String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url String</em>' attribute.
	 * @see #getUrlString()
	 * @generated
	 */
	void setUrlString(String value);

} // URLContentProvider
