/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.TagsCondition#getIncludes <em>Includes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.TagsCondition#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getTagsCondition()
 * @model
 * @generated
 */
public interface TagsCondition extends ResourceCondition {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' attribute list.
	 * @see no.hal.emfs.sync.SyncPackage#getTagsCondition_Includes()
	 * @model
	 * @generated
	 */
	EList<String> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' attribute list.
	 * @see no.hal.emfs.sync.SyncPackage#getTagsCondition_Excludes()
	 * @model
	 * @generated
	 */
	EList<String> getExcludes();

} // TagsCondition
