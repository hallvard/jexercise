/**
 */
package no.hal.learning.quiz.util;

import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.Question;

import no.hal.learning.quiz.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see no.hal.learning.quiz.QuizPackage
 * @generated
 */
public class QuizSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuizPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizSwitch() {
		if (modelPackage == null) {
			modelPackage = QuizPackage.eINSTANCE;
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
			case QuizPackage.STYLED_STRING_QUESTION: {
				StyledStringQuestion styledStringQuestion = (StyledStringQuestion)theEObject;
				T1 result = caseStyledStringQuestion(styledStringQuestion);
				if (result == null) result = caseQuestion(styledStringQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.STYLED_STRING: {
				StyledString styledString = (StyledString)theEObject;
				T1 result = caseStyledString(styledString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.CHAR_STYLE: {
				CharStyle charStyle = (CharStyle)theEObject;
				T1 result = caseCharStyle(charStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.OPTION_ANSWER: {
				OptionAnswer optionAnswer = (OptionAnswer)theEObject;
				T1 result = caseOptionAnswer(optionAnswer);
				if (result == null) result = caseAnswer(optionAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.SIMPLE_ANSWER: {
				SimpleAnswer<?> simpleAnswer = (SimpleAnswer<?>)theEObject;
				T1 result = caseSimpleAnswer(simpleAnswer);
				if (result == null) result = caseOptionAnswer(simpleAnswer);
				if (result == null) result = caseAnswer(simpleAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.SIMPLE_PROPOSAL: {
				SimpleProposal<?> simpleProposal = (SimpleProposal<?>)theEObject;
				T1 result = caseSimpleProposal(simpleProposal);
				if (result == null) result = caseProposal(simpleProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.STRING_ANSWER: {
				StringAnswer stringAnswer = (StringAnswer)theEObject;
				T1 result = caseStringAnswer(stringAnswer);
				if (result == null) result = caseSimpleAnswer(stringAnswer);
				if (result == null) result = caseOptionAnswer(stringAnswer);
				if (result == null) result = caseAnswer(stringAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.NUMBER_ANSWER: {
				NumberAnswer numberAnswer = (NumberAnswer)theEObject;
				T1 result = caseNumberAnswer(numberAnswer);
				if (result == null) result = caseSimpleAnswer(numberAnswer);
				if (result == null) result = caseOptionAnswer(numberAnswer);
				if (result == null) result = caseAnswer(numberAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.NUMBER_RANGE: {
				NumberRange numberRange = (NumberRange)theEObject;
				T1 result = caseNumberRange(numberRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.BOOLEAN_ANSWER: {
				BooleanAnswer booleanAnswer = (BooleanAnswer)theEObject;
				T1 result = caseBooleanAnswer(booleanAnswer);
				if (result == null) result = caseSimpleAnswer(booleanAnswer);
				if (result == null) result = caseOptionAnswer(booleanAnswer);
				if (result == null) result = caseAnswer(booleanAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.OPTIONS_ANSWER: {
				OptionsAnswer optionsAnswer = (OptionsAnswer)theEObject;
				T1 result = caseOptionsAnswer(optionsAnswer);
				if (result == null) result = caseAnswer(optionsAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.OPTIONS_PROPOSAL: {
				OptionsProposal optionsProposal = (OptionsProposal)theEObject;
				T1 result = caseOptionsProposal(optionsProposal);
				if (result == null) result = caseProposal(optionsProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.OPTION: {
				Option option = (Option)theEObject;
				T1 result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.SINGLE_OPTIONS_ANSWER: {
				SingleOptionsAnswer singleOptionsAnswer = (SingleOptionsAnswer)theEObject;
				T1 result = caseSingleOptionsAnswer(singleOptionsAnswer);
				if (result == null) result = caseOptionsAnswer(singleOptionsAnswer);
				if (result == null) result = caseAnswer(singleOptionsAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuizPackage.MANY_OPTIONS_ANSWER: {
				ManyOptionsAnswer manyOptionsAnswer = (ManyOptionsAnswer)theEObject;
				T1 result = caseManyOptionsAnswer(manyOptionsAnswer);
				if (result == null) result = caseOptionsAnswer(manyOptionsAnswer);
				if (result == null) result = caseAnswer(manyOptionsAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styled String Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styled String Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStyledStringQuestion(StyledStringQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styled String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styled String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStyledString(StyledString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCharStyle(CharStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOptionAnswer(OptionAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseSimpleAnswer(SimpleAnswer<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A extends SimpleAnswer<?>> T1 caseSimpleProposal(SimpleProposal<A> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringAnswer(StringAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberAnswer(NumberAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberRange(NumberRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanAnswer(BooleanAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOptionsAnswer(OptionsAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOptionsProposal(OptionsProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Options Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleOptionsAnswer(SingleOptionsAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many Options Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseManyOptionsAnswer(ManyOptionsAnswer object) {
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
