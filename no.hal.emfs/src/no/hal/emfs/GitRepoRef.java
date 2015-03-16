/**
 */
package no.hal.emfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Repo Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.GitRepoRef#getHost <em>Host</em>}</li>
 *   <li>{@link no.hal.emfs.GitRepoRef#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.emfs.GitRepoRef#getRepo <em>Repo</em>}</li>
 *   <li>{@link no.hal.emfs.GitRepoRef#getRemoteString <em>Remote String</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getGitRepoRef()
 * @model
 * @generated
 */
public interface GitRepoRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see no.hal.emfs.EmfsPackage#getGitRepoRef_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link no.hal.emfs.GitRepoRef#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see no.hal.emfs.EmfsPackage#getGitRepoRef_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link no.hal.emfs.GitRepoRef#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo</em>' attribute.
	 * @see #setRepo(String)
	 * @see no.hal.emfs.EmfsPackage#getGitRepoRef_Repo()
	 * @model
	 * @generated
	 */
	String getRepo();

	/**
	 * Sets the value of the '{@link no.hal.emfs.GitRepoRef#getRepo <em>Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo</em>' attribute.
	 * @see #getRepo()
	 * @generated
	 */
	void setRepo(String value);

	/**
	 * Returns the value of the '<em><b>Remote String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote String</em>' attribute.
	 * @see no.hal.emfs.EmfsPackage#getGitRepoRef_RemoteString()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getRemoteString();

} // GitRepoRef
