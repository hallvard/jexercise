/**
 */
package no.hal.learning.quiz.util;

import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.Question;

import no.hal.learning.quiz.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.quiz.QuizPackage
 * @generated
 */
public class QuizAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuizPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuizPackage.eINSTANCE;
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
	protected QuizSwitch<Adapter> modelSwitch =
		new QuizSwitch<Adapter>() {
			@Override
			public Adapter caseStyledStringQuestion(StyledStringQuestion object) {
				return createStyledStringQuestionAdapter();
			}
			@Override
			public Adapter caseStyledString(StyledString object) {
				return createStyledStringAdapter();
			}
			@Override
			public Adapter caseCharStyle(CharStyle object) {
				return createCharStyleAdapter();
			}
			@Override
			public Adapter caseOptionAnswer(OptionAnswer object) {
				return createOptionAnswerAdapter();
			}
			@Override
			public <T> Adapter caseSimpleAnswer(SimpleAnswer<T> object) {
				return createSimpleAnswerAdapter();
			}
			@Override
			public <A extends SimpleAnswer<?>> Adapter caseSimpleProposal(SimpleProposal<A> object) {
				return createSimpleProposalAdapter();
			}
			@Override
			public Adapter caseStringAnswer(StringAnswer object) {
				return createStringAnswerAdapter();
			}
			@Override
			public Adapter caseNumberAnswer(NumberAnswer object) {
				return createNumberAnswerAdapter();
			}
			@Override
			public Adapter caseNumberRange(NumberRange object) {
				return createNumberRangeAdapter();
			}
			@Override
			public Adapter caseBooleanAnswer(BooleanAnswer object) {
				return createBooleanAnswerAdapter();
			}
			@Override
			public Adapter caseOptionsAnswer(OptionsAnswer object) {
				return createOptionsAnswerAdapter();
			}
			@Override
			public Adapter caseOptionsProposal(OptionsProposal object) {
				return createOptionsProposalAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseSingleOptionsAnswer(SingleOptionsAnswer object) {
				return createSingleOptionsAnswerAdapter();
			}
			@Override
			public Adapter caseManyOptionsAnswer(ManyOptionsAnswer object) {
				return createManyOptionsAnswerAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
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
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.StyledStringQuestion <em>Styled String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.StyledStringQuestion
	 * @generated
	 */
	public Adapter createStyledStringQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.StyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.StyledString
	 * @generated
	 */
	public Adapter createStyledStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.CharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.CharStyle
	 * @generated
	 */
	public Adapter createCharStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.OptionAnswer <em>Option Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.OptionAnswer
	 * @generated
	 */
	public Adapter createOptionAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.SimpleAnswer <em>Simple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.SimpleAnswer
	 * @generated
	 */
	public Adapter createSimpleAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.SimpleProposal <em>Simple Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.SimpleProposal
	 * @generated
	 */
	public Adapter createSimpleProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.StringAnswer <em>String Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.StringAnswer
	 * @generated
	 */
	public Adapter createStringAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.NumberAnswer <em>Number Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.NumberAnswer
	 * @generated
	 */
	public Adapter createNumberAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.NumberRange <em>Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.NumberRange
	 * @generated
	 */
	public Adapter createNumberRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.BooleanAnswer
	 * @generated
	 */
	public Adapter createBooleanAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.OptionsAnswer <em>Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.OptionsAnswer
	 * @generated
	 */
	public Adapter createOptionsAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.OptionsProposal <em>Options Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.OptionsProposal
	 * @generated
	 */
	public Adapter createOptionsProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.SingleOptionsAnswer <em>Single Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.SingleOptionsAnswer
	 * @generated
	 */
	public Adapter createSingleOptionsAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.quiz.ManyOptionsAnswer <em>Many Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.quiz.ManyOptionsAnswer
	 * @generated
	 */
	public Adapter createManyOptionsAnswerAdapter() {
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
