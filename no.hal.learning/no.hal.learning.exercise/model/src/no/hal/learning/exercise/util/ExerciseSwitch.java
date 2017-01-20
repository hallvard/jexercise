/**
 */
package no.hal.learning.exercise.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import no.hal.learning.exercise.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.ExercisePackage
 * @generated
 */
public class ExerciseSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExercisePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseSwitch() {
		if (modelPackage == null) {
			modelPackage = ExercisePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExercisePackage.EXERCISE: {
				Exercise exercise = (Exercise)theEObject;
				T1 result = caseExercise(exercise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_PROPOSALS: {
				ExerciseProposals exerciseProposals = (ExerciseProposals)theEObject;
				T1 result = caseExerciseProposals(exerciseProposals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ABSTRACT_EXERCISE_PART: {
				AbstractExercisePart abstractExercisePart = (AbstractExercisePart)theEObject;
				T1 result = caseAbstractExercisePart(abstractExercisePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_PART_PROPOSALS: {
				ExercisePartProposals exercisePartProposals = (ExercisePartProposals)theEObject;
				T1 result = caseExercisePartProposals(exercisePartProposals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_PART_REF: {
				ExercisePartRef exercisePartRef = (ExercisePartRef)theEObject;
				T1 result = caseExercisePartRef(exercisePartRef);
				if (result == null) result = caseAbstractExercisePart(exercisePartRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_PART: {
				ExercisePart exercisePart = (ExercisePart)theEObject;
				T1 result = caseExercisePart(exercisePart);
				if (result == null) result = caseAbstractExercisePart(exercisePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ABSTRACT_TASK: {
				AbstractTask abstractTask = (AbstractTask)theEObject;
				T1 result = caseAbstractTask(abstractTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.TASK_REF: {
				TaskRef taskRef = (TaskRef)theEObject;
				T1 result = caseTaskRef(taskRef);
				if (result == null) result = caseAbstractTask(taskRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.TASK: {
				Task task = (Task)theEObject;
				T1 result = caseTask(task);
				if (result == null) result = caseAbstractTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.QUESTION: {
				Question question = (Question)theEObject;
				T1 result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.STRING_QUESTION: {
				StringQuestion stringQuestion = (StringQuestion)theEObject;
				T1 result = caseStringQuestion(stringQuestion);
				if (result == null) result = caseQuestion(stringQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ANSWER: {
				Answer answer = (Answer)theEObject;
				T1 result = caseAnswer(answer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.PROPOSAL: {
				Proposal<?> proposal = (Proposal<?>)theEObject;
				T1 result = caseProposal(proposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.TASK_ANSWER: {
				TaskAnswer taskAnswer = (TaskAnswer)theEObject;
				T1 result = caseTaskAnswer(taskAnswer);
				if (result == null) result = caseAnswer(taskAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.TASK_PROPOSAL: {
				TaskProposal<?> taskProposal = (TaskProposal<?>)theEObject;
				T1 result = caseTaskProposal(taskProposal);
				if (result == null) result = caseProposal(taskProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.TASK_EVENT: {
				TaskEvent taskEvent = (TaskEvent)theEObject;
				T1 result = caseTaskEvent(taskEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.STRING_EDIT_TASK_PROPOSAL: {
				StringEditTaskProposal<?> stringEditTaskProposal = (StringEditTaskProposal<?>)theEObject;
				T1 result = caseStringEditTaskProposal(stringEditTaskProposal);
				if (result == null) result = caseTaskProposal(stringEditTaskProposal);
				if (result == null) result = caseProposal(stringEditTaskProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.STRING_EDIT_ANSWER: {
				StringEditAnswer stringEditAnswer = (StringEditAnswer)theEObject;
				T1 result = caseStringEditAnswer(stringEditAnswer);
				if (result == null) result = caseTaskAnswer(stringEditAnswer);
				if (result == null) result = caseAnswer(stringEditAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT: {
				AbstractStringEditEvent abstractStringEditEvent = (AbstractStringEditEvent)theEObject;
				T1 result = caseAbstractStringEditEvent(abstractStringEditEvent);
				if (result == null) result = caseTaskEvent(abstractStringEditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ABSTRACT_STRING_EDIT: {
				AbstractStringEdit abstractStringEdit = (AbstractStringEdit)theEObject;
				T1 result = caseAbstractStringEdit(abstractStringEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.STRING_EDIT: {
				StringEdit stringEdit = (StringEdit)theEObject;
				T1 result = caseStringEdit(stringEdit);
				if (result == null) result = caseAbstractStringEdit(stringEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.REPLACE_SUBSTRING_EDIT: {
				ReplaceSubstringEdit replaceSubstringEdit = (ReplaceSubstringEdit)theEObject;
				T1 result = caseReplaceSubstringEdit(replaceSubstringEdit);
				if (result == null) result = caseStringEdit(replaceSubstringEdit);
				if (result == null) result = caseAbstractStringEdit(replaceSubstringEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exercise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exercise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExercise(Exercise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExerciseProposals(ExerciseProposals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Exercise Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Exercise Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractExercisePart(AbstractExercisePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Proposals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Proposals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExercisePartProposals(ExercisePartProposals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExercisePartRef(ExercisePartRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExercisePart(ExercisePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractTask(AbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskRef(TaskRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringQuestion(StringQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A extends Answer> T1 caseProposal(Proposal<A> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskAnswer(TaskAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TaskAnswer> T1 caseTaskProposal(TaskProposal<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskEvent(TaskEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Edit Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Edit Task Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A extends StringEditAnswer> T1 caseStringEditTaskProposal(StringEditTaskProposal<A> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Edit Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringEditAnswer(StringEditAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract String Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract String Edit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractStringEditEvent(AbstractStringEditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract String Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract String Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractStringEdit(AbstractStringEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringEdit(StringEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Substring Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Substring Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReplaceSubstringEdit(ReplaceSubstringEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //QuizSwitch
