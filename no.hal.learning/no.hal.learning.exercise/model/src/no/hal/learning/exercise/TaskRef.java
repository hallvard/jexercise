/**
 */
package no.hal.learning.exercise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.TaskRef#getTaskRef <em>Task Ref</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getTaskRef()
 * @model
 * @generated
 */
public interface TaskRef extends AbstractTask {
	/**
	 * Returns the value of the '<em><b>Task Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qa Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Ref</em>' reference.
	 * @see #setTaskRef(Task)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskRef_TaskRef()
	 * @model
	 * @generated
	 */
	Task getTaskRef();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskRef#getTaskRef <em>Task Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Ref</em>' reference.
	 * @see #getTaskRef()
	 * @generated
	 */
	void setTaskRef(Task value);

} // QARef
