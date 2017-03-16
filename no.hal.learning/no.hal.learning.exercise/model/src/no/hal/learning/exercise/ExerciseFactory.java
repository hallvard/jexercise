/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.ExercisePackage
 * @generated
 */
public interface ExerciseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExerciseFactory eINSTANCE = no.hal.learning.exercise.impl.ExerciseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exercise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exercise</em>'.
	 * @generated
	 */
	Exercise createExercise();

	/**
	 * Returns a new object of class '<em>Proposals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposals</em>'.
	 * @generated
	 */
	ExerciseProposals createExerciseProposals();

	/**
	 * Returns a new object of class '<em>Part Proposals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Proposals</em>'.
	 * @generated
	 */
	ExercisePartProposals createExercisePartProposals();

	/**
	 * Returns a new object of class '<em>Part Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Ref</em>'.
	 * @generated
	 */
	ExercisePartRef createExercisePartRef();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	ExercisePart createExercisePart();

	/**
	 * Returns a new object of class '<em>Task Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Ref</em>'.
	 * @generated
	 */
	TaskRef createTaskRef();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>String Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Question</em>'.
	 * @generated
	 */
	StringQuestion createStringQuestion();

	/**
	 * Returns a new object of class '<em>Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposal</em>'.
	 * @generated
	 */
	<A extends Answer> Proposal<A> createProposal();

	/**
	 * Returns a new object of class '<em>Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Answer</em>'.
	 * @generated
	 */
	TaskAnswer createTaskAnswer();

	/**
	 * Returns a new object of class '<em>Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Proposal</em>'.
	 * @generated
	 */
	<T extends TaskAnswer> TaskProposal<T> createTaskProposal();

	/**
	 * Returns a new object of class '<em>Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Event</em>'.
	 * @generated
	 */
	TaskEvent createTaskEvent();

	/**
	 * Returns a new object of class '<em>String Edit Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Edit Task Proposal</em>'.
	 * @generated
	 */
	<A extends StringEditAnswer> StringEditTaskProposal<A> createStringEditTaskProposal();

	/**
	 * Returns a new object of class '<em>Abstract String Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract String Edit Event</em>'.
	 * @generated
	 */
	AbstractStringEditEvent createAbstractStringEditEvent();

	/**
	 * Returns a new object of class '<em>Relative String Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative String Edit</em>'.
	 * @generated
	 */
	RelativeStringEdit createRelativeStringEdit();

	/**
	 * Returns a new object of class '<em>String Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Edit</em>'.
	 * @generated
	 */
	StringEdit createStringEdit();

	/**
	 * Returns a new object of class '<em>Replace Substring Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Substring Edit</em>'.
	 * @generated
	 */
	ReplaceSubstringEdit createReplaceSubstringEdit();

	/**
	 * Returns a new object of class '<em>Marker Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marker Info</em>'.
	 * @generated
	 */
	MarkerInfo createMarkerInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExercisePackage getExercisePackage();

} //QuizFactory
