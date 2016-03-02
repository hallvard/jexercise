/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tags Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.TagsOwner#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getTagsOwner()
 * @model
 * @generated
 */
public interface TagsOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see no.hal.emfs.EmfsPackage#getTagsOwner_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

} // TagsOwner
