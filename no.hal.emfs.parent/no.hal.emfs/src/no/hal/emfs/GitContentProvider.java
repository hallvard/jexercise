/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.GitContentProvider#getGitRef <em>Git Ref</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getGitContentProvider()
 * @model
 * @generated
 */
public interface GitContentProvider extends EmfsContainerContentProvider {
	/**
	 * Returns the value of the '<em><b>Git Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Git Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git Ref</em>' containment reference.
	 * @see #setGitRef(GitContentRef)
	 * @see no.hal.emfs.EmfsPackage#getGitContentProvider_GitRef()
	 * @model containment="true"
	 * @generated
	 */
	GitContentRef getGitRef();

	/**
	 * Sets the value of the '{@link no.hal.emfs.GitContentProvider#getGitRef <em>Git Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git Ref</em>' containment reference.
	 * @see #getGitRef()
	 * @generated
	 */
	void setGitRef(GitContentRef value);

} // GitHubContentProvider
