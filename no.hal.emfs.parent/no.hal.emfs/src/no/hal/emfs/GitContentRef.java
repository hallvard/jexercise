/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub Content Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.GitContentRef#getPath <em>Path</em>}</li>
 *   <li>{@link no.hal.emfs.GitContentRef#getUrlString <em>Url String</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getGitContentRef()
 * @model
 * @generated
 */
public interface GitContentRef extends GitRepoRef {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see no.hal.emfs.EmfsPackage#getGitContentRef_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link no.hal.emfs.GitContentRef#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url String</em>' attribute.
	 * @see no.hal.emfs.EmfsPackage#getGitContentRef_UrlString()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getUrlString();

} // GitHubContentRef
