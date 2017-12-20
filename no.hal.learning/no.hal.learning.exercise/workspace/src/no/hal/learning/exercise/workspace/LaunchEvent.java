/**
 */
package no.hal.learning.exercise.workspace;

import no.hal.learning.exercise.TaskEvent;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchEvent#getMode <em>Mode</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchEvent#getLaunchAttrNames <em>Launch Attr Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchEvent#getLaunchAttrValues <em>Launch Attr Values</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchEvent#getConsoleOutput <em>Console Output</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.LaunchEvent#getConsoleOutputSizeMeasure <em>Console Output Size Measure</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchEvent()
 * @model
 * @generated
 */
public interface LaunchEvent extends TaskEvent {
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
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchEvent_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.LaunchEvent#getMode <em>Mode</em>}' attribute.
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
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchEvent_LaunchAttrNames()
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
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchEvent_LaunchAttrValues()
	 * @model
	 * @generated
	 */
	EList<String> getLaunchAttrValues();

	/**
	 * Returns the value of the '<em><b>Console Output</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Console Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Console Output</em>' attribute list.
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchEvent_ConsoleOutput()
	 * @model
	 * @generated
	 */
	EList<String> getConsoleOutput();

	/**
	 * Returns the value of the '<em><b>Console Output Size Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Console Output Size Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Console Output Size Measure</em>' attribute.
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getLaunchEvent_ConsoleOutputSizeMeasure()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getConsoleOutputSizeMeasure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getAllConsoleOutput();

} // LaunchEvent
