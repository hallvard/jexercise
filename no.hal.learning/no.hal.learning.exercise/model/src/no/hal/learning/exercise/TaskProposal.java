/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.TaskProposal#getCompletion <em>Completion</em>}</li>
 *   <li>{@link no.hal.learning.exercise.TaskProposal#getProof <em>Proof</em>}</li>
 *   <li>{@link no.hal.learning.exercise.TaskProposal#getAttemptCount <em>Attempt Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.TaskProposal#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link no.hal.learning.exercise.TaskProposal#getPerformedCount <em>Performed Count</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getTaskProposal()
 * @model
 * @generated
 */
public interface TaskProposal<T extends TaskAnswer> extends Proposal<T> {
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
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskProposal_Completion()
	 * @model default="-1"
	 * @generated
	 */
	double getCompletion();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskProposal#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' attribute.
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(double value);

	/**
	 * Returns the value of the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proof</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proof</em>' attribute.
	 * @see #setProof(String)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskProposal_Proof()
	 * @model
	 * @generated
	 */
	String getProof();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskProposal#getProof <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proof</em>' attribute.
	 * @see #getProof()
	 * @generated
	 */
	void setProof(String value);

	/**
	 * Returns the value of the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attempt Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempt Count</em>' attribute.
	 * @see #setAttemptCount(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskProposal_AttemptCount()
	 * @model
	 * @generated
	 */
	int getAttemptCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskProposal#getAttemptCount <em>Attempt Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempt Count</em>' attribute.
	 * @see #getAttemptCount()
	 * @generated
	 */
	void setAttemptCount(int value);

	/**
	 * Returns the value of the '<em><b>Attempts</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.TaskEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attempts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts</em>' containment reference list.
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskProposal_Attempts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskEvent> getAttempts();

	/**
	 * Returns the value of the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Count</em>' attribute.
	 * @see #setPerformedCount(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getTaskProposal_PerformedCount()
	 * @model
	 * @generated
	 */
	int getPerformedCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.TaskProposal#getPerformedCount <em>Performed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Count</em>' attribute.
	 * @see #getPerformedCount()
	 * @generated
	 */
	void setPerformedCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getText();

} // TaskProposal
