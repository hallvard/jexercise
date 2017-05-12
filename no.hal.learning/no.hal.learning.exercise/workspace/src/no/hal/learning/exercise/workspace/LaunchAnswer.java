/**
 */
package no.hal.learning.exercise.workspace;

import no.hal.learning.exercise.TaskAnswer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchAnswer#getMode <em>Mode</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchAnswer#getLaunchAttrNames <em>Launch Attr Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchAnswer#getLaunchAttrValues <em>Launch Attr Values</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchAnswer()
 * @model
 * @generated
 */
public interface LaunchAnswer extends TaskAnswer {
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
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchAnswer_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.LaunchAnswer#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Launch Attr Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Attr Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Attr Names</em>' attribute list.
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchAnswer_LaunchAttrNames()
	 * @model
	 * @generated
	 */
	EList<String> getLaunchAttrNames();

	/**
	 * Returns the value of the '<em><b>Launch Attr Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Attr Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Attr Values</em>' attribute list.
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchAnswer_LaunchAttrValues()
	 * @model
	 * @generated
	 */
	EList<String> getLaunchAttrValues();

} // LaunchAnswer
