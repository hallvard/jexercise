/**
 */
package no.hal.learning.diff;

import no.hal.learning.exercise.RelativeStringEdit;
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
 *   <li>{@link no.hal.learning.diff.PatchStringEdit#getPatches <em>Patches</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.diff.DiffPackage#getPatchStringEdit()
 * @model
 * @generated
 */
public interface PatchStringEdit extends RelativeStringEdit {
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
