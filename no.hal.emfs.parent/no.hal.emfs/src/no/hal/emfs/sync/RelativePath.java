/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.RelativePath#getSegments <em>Segments</em>}</li>
 *   <li>{@link no.hal.emfs.sync.RelativePath#getContainer <em>Container</em>}</li>
 *   <li>{@link no.hal.emfs.sync.RelativePath#getFullPath <em>Full Path</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getRelativePath()
 * @model
 * @generated
 */
public interface RelativePath extends ResourcePath {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' attribute list.
	 * @see no.hal.emfs.sync.SyncPackage#getRelativePath_Segments()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSegments();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(ResourcePath)
	 * @see no.hal.emfs.sync.SyncPackage#getRelativePath_Container()
	 * @model
	 * @generated
	 */
	ResourcePath getContainer();

	/**
	 * Sets the value of the '{@link no.hal.emfs.sync.RelativePath#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ResourcePath value);

	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see no.hal.emfs.sync.SyncPackage#getRelativePath_FullPath()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getFullPath();

} // RelativePath
