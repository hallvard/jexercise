/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.ecore.change.ChangeDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.ChangeEdit#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.sharing.SharingPackage#getChangeEdit()
 * @model
 * @generated
 */
public interface ChangeEdit extends AbstractModelEdit {
	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference.
	 * @see #setChange(ChangeDescription)
	 * @see no.hal.learning.sharing.SharingPackage#getChangeEdit_Change()
	 * @model containment="true"
	 * @generated
	 */
	ChangeDescription getChange();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.ChangeEdit#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ChangeDescription value);

} // ChangeEdit
