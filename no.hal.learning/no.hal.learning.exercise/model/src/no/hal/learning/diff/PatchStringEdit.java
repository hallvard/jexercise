/**
 */
package no.hal.learning.diff;

import no.hal.learning.exercise.AbstractStringEdit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patch String Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.diff.PatchStringEdit#getEdit <em>Edit</em>}</li>
 *   <li>{@link no.hal.learning.diff.PatchStringEdit#getPatches <em>Patches</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.diff.DiffPackage#getPatchStringEdit()
 * @model
 * @generated
 */
public interface PatchStringEdit extends AbstractStringEdit {
	/**
	 * Returns the value of the '<em><b>Edit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit</em>' reference.
	 * @see #setEdit(AbstractStringEdit)
	 * @see no.hal.learning.diff.DiffPackage#getPatchStringEdit_Edit()
	 * @model
	 * @generated
	 */
	AbstractStringEdit getEdit();

	/**
	 * Sets the value of the '{@link no.hal.learning.diff.PatchStringEdit#getEdit <em>Edit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit</em>' reference.
	 * @see #getEdit()
	 * @generated
	 */
	void setEdit(AbstractStringEdit value);

	/**
	 * Returns the value of the '<em><b>Patches</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patches</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patches</em>' attribute list.
	 * @see no.hal.learning.diff.DiffPackage#getPatchStringEdit_Patches()
	 * @model
	 * @generated
	 */
	EList<String> getPatches();

} // PatchStringEdit
