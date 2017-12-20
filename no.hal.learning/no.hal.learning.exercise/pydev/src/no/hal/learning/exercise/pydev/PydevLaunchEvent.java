/**
 */
package no.hal.learning.exercise.pydev;

import no.hal.learning.exercise.workspace.LaunchEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.pydev.PydevLaunchEvent#getModuleName <em>Module Name</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.pydev.PydevPackage#getPydevLaunchEvent()
 * @model
 * @generated
 */
public interface PydevLaunchEvent extends LaunchEvent {

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see no.hal.learning.exercise.pydev.PydevPackage#getPydevLaunchEvent_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.pydev.PydevLaunchEvent#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);
} // PydevLaunchEvent
