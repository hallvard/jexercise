/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.PathRule#getPath <em>Path</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PathRule#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PathRule#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PathRule#getIncludes <em>Includes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PathRule#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PathRule#getTags <em>Tags</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PathRule#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getPathRule()
 * @model
 * @generated
 */
public interface PathRule<R extends PathRule<R>> extends EmfsResourceRule {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(ResourcePath)
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_Path()
	 * @model containment="true"
	 * @generated
	 */
	ResourcePath getPath();

	/**
	 * Sets the value of the '{@link no.hal.emfs.sync.PathRule#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(ResourcePath value);

	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_FullPath()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getFullPath();

	/**
	 * Returns the value of the '<em><b>Target Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Path</em>' containment reference.
	 * @see #setTargetPath(ResourcePath)
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_TargetPath()
	 * @model containment="true"
	 * @generated
	 */
	ResourcePath getTargetPath();

	/**
	 * Sets the value of the '{@link no.hal.emfs.sync.PathRule#getTargetPath <em>Target Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Path</em>' containment reference.
	 * @see #getTargetPath()
	 * @generated
	 */
	void setTargetPath(ResourcePath value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<R> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_Excludes()
	 * @model containment="true"
	 * @generated
	 */
	EList<R> getExcludes();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.sync.TagsRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<TagsRule> getTags();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.sync.PropertiesRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPathRule_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertiesRule> getProperties();

} // PathRule
