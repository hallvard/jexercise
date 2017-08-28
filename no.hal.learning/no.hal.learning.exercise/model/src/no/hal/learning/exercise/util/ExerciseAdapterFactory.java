/**
 */
package no.hal.learning.exercise.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import no.hal.learning.exercise.*;
import no.hal.learning.fv.EFeatureObject;
import no.hal.learning.fv.FeatureValued;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.ExercisePackage
 * @generated
 */
public class ExerciseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExercisePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExercisePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExerciseSwitch<Adapter> modelSwitch =
		new ExerciseSwitch<Adapter>() {
			@Override
			public Adapter caseExercise(Exercise object) {
				return createExerciseAdapter();
			}
			@Override
			public Adapter caseExerciseProposals(ExerciseProposals object) {
				return createExerciseProposalsAdapter();
			}
			@Override
			public Adapter caseAbstractExercisePart(AbstractExercisePart object) {
				return createAbstractExercisePartAdapter();
			}
			@Override
			public Adapter caseExercisePartProposals(ExercisePartProposals object) {
				return createExercisePartProposalsAdapter();
			}
			@Override
			public Adapter caseExercisePartRef(ExercisePartRef object) {
				return createExercisePartRefAdapter();
			}
			@Override
			public Adapter caseExercisePart(ExercisePart object) {
				return createExercisePartAdapter();
			}
			@Override
			public Adapter caseAbstractTask(AbstractTask object) {
				return createAbstractTaskAdapter();
			}
			@Override
			public Adapter caseTaskRef(TaskRef object) {
				return createTaskRefAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseStringQuestion(StringQuestion object) {
				return createStringQuestionAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public <A extends Answer> Adapter caseProposal(Proposal<A> object) {
				return createProposalAdapter();
			}
			@Override
			public Adapter caseTaskAnswer(TaskAnswer object) {
				return createTaskAnswerAdapter();
			}
			@Override
			public <T extends TaskAnswer> Adapter caseTaskProposal(TaskProposal<T> object) {
				return createTaskProposalAdapter();
			}
			@Override
			public Adapter caseTaskEvent(TaskEvent object) {
				return createTaskEventAdapter();
			}
			@Override
			public <A extends StringEditAnswer> Adapter caseStringEditTaskProposal(StringEditTaskProposal<A> object) {
				return createStringEditTaskProposalAdapter();
			}
			@Override
			public Adapter caseStringEditAnswer(StringEditAnswer object) {
				return createStringEditAnswerAdapter();
			}
			@Override
			public Adapter caseAbstractStringEditEvent(AbstractStringEditEvent object) {
				return createAbstractStringEditEventAdapter();
			}
			@Override
			public Adapter caseAbstractStringEdit(AbstractStringEdit object) {
				return createAbstractStringEditAdapter();
			}
			@Override
			public Adapter caseRelativeStringEdit(RelativeStringEdit object) {
				return createRelativeStringEditAdapter();
			}
			@Override
			public Adapter caseStringEdit(StringEdit object) {
				return createStringEditAdapter();
			}
			@Override
			public Adapter caseReplaceSubstringEdit(ReplaceSubstringEdit object) {
				return createReplaceSubstringEditAdapter();
			}
			@Override
			public Adapter caseMarkerInfo(MarkerInfo object) {
				return createMarkerInfoAdapter();
			}
			@Override
			public Adapter caseFeatureValued(FeatureValued object) {
				return createFeatureValuedAdapter();
			}
			@Override
			public Adapter caseEFeatureObject(EFeatureObject object) {
				return createEFeatureObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.Exercise
	 * @generated
	 */
	public Adapter createExerciseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.ExerciseProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.ExerciseProposals
	 * @generated
	 */
	public Adapter createExerciseProposalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.AbstractExercisePart <em>Abstract Exercise Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.AbstractExercisePart
	 * @generated
	 */
	public Adapter createAbstractExercisePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.ExercisePartProposals <em>Part Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.ExercisePartProposals
	 * @generated
	 */
	public Adapter createExercisePartProposalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.ExercisePartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.ExercisePartRef
	 * @generated
	 */
	public Adapter createExercisePartRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.ExercisePart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.ExercisePart
	 * @generated
	 */
	public Adapter createExercisePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.AbstractTask
	 * @generated
	 */
	public Adapter createAbstractTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.TaskRef <em>Task Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.TaskRef
	 * @generated
	 */
	public Adapter createTaskRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.StringQuestion <em>String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.StringQuestion
	 * @generated
	 */
	public Adapter createStringQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.Proposal
	 * @generated
	 */
	public Adapter createProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.TaskAnswer <em>Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.TaskAnswer
	 * @generated
	 */
	public Adapter createTaskAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.TaskProposal <em>Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.TaskProposal
	 * @generated
	 */
	public Adapter createTaskProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.TaskEvent <em>Task Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.TaskEvent
	 * @generated
	 */
	public Adapter createTaskEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.StringEditTaskProposal <em>String Edit Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.StringEditTaskProposal
	 * @generated
	 */
	public Adapter createStringEditTaskProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.StringEditAnswer <em>String Edit Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.StringEditAnswer
	 * @generated
	 */
	public Adapter createStringEditAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.AbstractStringEditEvent <em>Abstract String Edit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.AbstractStringEditEvent
	 * @generated
	 */
	public Adapter createAbstractStringEditEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.AbstractStringEdit <em>Abstract String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.AbstractStringEdit
	 * @generated
	 */
	public Adapter createAbstractStringEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.RelativeStringEdit <em>Relative String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.RelativeStringEdit
	 * @generated
	 */
	public Adapter createRelativeStringEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.StringEdit <em>String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.StringEdit
	 * @generated
	 */
	public Adapter createStringEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.ReplaceSubstringEdit <em>Replace Substring Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.ReplaceSubstringEdit
	 * @generated
	 */
	public Adapter createReplaceSubstringEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.exercise.MarkerInfo <em>Marker Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.exercise.MarkerInfo
	 * @generated
	 */
	public Adapter createMarkerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.FeatureValued <em>Feature Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.FeatureValued
	 * @generated
	 */
	public Adapter createFeatureValuedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.EFeatureObject <em>EFeature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.EFeatureObject
	 * @generated
	 */
	public Adapter createEFeatureObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuizAdapterFactory
