/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.TaskEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtLaunchEvent#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchEvent()
 * @model
 * @generated
 */
public interface JdtLaunchEvent extends TaskEvent {

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchEvent_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtLaunchEvent#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);
} // JdtLaunchEvent
