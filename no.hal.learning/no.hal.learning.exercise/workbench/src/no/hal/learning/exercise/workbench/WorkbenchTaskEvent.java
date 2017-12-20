/**
 */
package no.hal.learning.exercise.workbench;

import no.hal.learning.exercise.TaskEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getElementId <em>Element Id</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.workbench.WorkbenchPackage#getWorkbenchTaskEvent()
 * @model
 * @generated
 */
public interface WorkbenchTaskEvent extends TaskEvent {
	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see no.hal.learning.exercise.workbench.WorkbenchPackage#getWorkbenchTaskEvent_ElementId()
	 * @model
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see no.hal.learning.exercise.workbench.WorkbenchPackage#getWorkbenchTaskEvent_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workbench.WorkbenchTaskEvent#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

} // WorkbenchTaskEvent
