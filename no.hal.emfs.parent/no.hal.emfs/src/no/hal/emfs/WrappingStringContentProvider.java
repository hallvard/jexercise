/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegating String Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.WrappingStringContentProvider#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link no.hal.emfs.WrappingStringContentProvider#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link no.hal.emfs.WrappingStringContentProvider#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getWrappingStringContentProvider()
 * @model
 * @generated
 */
public interface WrappingStringContentProvider extends EmfsFileContentProvider {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(AbstractStringContents)
	 * @see no.hal.emfs.EmfsPackage#getWrappingStringContentProvider_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	AbstractStringContents getPrefix();

	/**
	 * Sets the value of the '{@link no.hal.emfs.WrappingStringContentProvider#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(AbstractStringContents value);

	/**
	 * Returns the value of the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Provider</em>' containment reference.
	 * @see #setContentProvider(EmfsFileContentProvider)
	 * @see no.hal.emfs.EmfsPackage#getWrappingStringContentProvider_ContentProvider()
	 * @model containment="true"
	 * @generated
	 */
	EmfsFileContentProvider getContentProvider();

	/**
	 * Sets the value of the '{@link no.hal.emfs.WrappingStringContentProvider#getContentProvider <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Provider</em>' containment reference.
	 * @see #getContentProvider()
	 * @generated
	 */
	void setContentProvider(EmfsFileContentProvider value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference.
	 * @see #setSuffix(AbstractStringContents)
	 * @see no.hal.emfs.EmfsPackage#getWrappingStringContentProvider_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	AbstractStringContents getSuffix();

	/**
	 * Sets the value of the '{@link no.hal.emfs.WrappingStringContentProvider#getSuffix <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' containment reference.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(AbstractStringContents value);

} // DelegatingStringContentProvider
