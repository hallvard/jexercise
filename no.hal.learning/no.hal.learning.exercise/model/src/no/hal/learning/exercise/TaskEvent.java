/**
 */
package no.hal.learning.exercise;

import no.hal.learning.fv.EFeatureObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.TaskEvent#getProposal <em>Proposal</em>}</li>
 *   <li>{@link no.hal.learning.exercise.TaskEvent#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link no.hal.learning.exercise.TaskEvent#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getTaskEvent()
 * @model
 * @generated
 */
public interface TaskEvent extends EFeatureObject {
	/**
	 * Returns the value of the '<em><b>Proposal</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.learning.exercise.TaskProposal#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposal</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposal</em>' container reference.
	 * @see #setProposal(TaskProposal)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskEvent_Proposal()
	 * @see no.hal.learning.exercise.TaskProposal#getAttempts
	 * @model opposite="attempts" transient="false"
	 * @generated
	 */
	TaskProposal<?> getProposal();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskEvent#getProposal <em>Proposal</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposal</em>' container reference.
	 * @see #getProposal()
	 * @generated
	 */
	void setProposal(TaskProposal<?> value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskEvent_Timestamp()
	 * @model dataType="no.hal.learning.exercise.ETimestamp"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskEvent#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see #setCompletion(double)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskEvent_Completion()
	 * @model default="-1"
	 *        annotation="no.hal.learning.exercise.views.ExerciseView dashes='SOLID'"
	 * @generated
	 */
	double getCompletion();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskEvent#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' attribute.
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getText();

} // TaskEvent
