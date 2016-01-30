/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Model Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.AbstractModelEdit#getEObject <em>EObject</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.sharing.SharingPackage#getAbstractModelEdit()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModelEdit extends ModelEdit {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(EObject)
	 * @see no.hal.learning.sharing.SharingPackage#getAbstractModelEdit_EObject()
	 * @model
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.AbstractModelEdit#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

} // AbstractModelEdit
