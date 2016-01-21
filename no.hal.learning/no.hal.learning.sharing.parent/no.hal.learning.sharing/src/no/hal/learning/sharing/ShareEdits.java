/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Share Edits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.ShareEdits#getEdits <em>Edits</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.sharing.SharingPackage#getShareEdits()
 * @model
 * @generated
 */
public interface ShareEdits extends AbstractShare {
	/**
	 * Returns the value of the '<em><b>Edits</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.sharing.ModelEdit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edits</em>' containment reference list.
	 * @see no.hal.learning.sharing.SharingPackage#getShareEdits_Edits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelEdit> getEdits();

} // ShareEdits
