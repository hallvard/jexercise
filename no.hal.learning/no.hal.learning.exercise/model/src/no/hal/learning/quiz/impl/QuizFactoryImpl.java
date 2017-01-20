/**
 */
package no.hal.learning.quiz.impl;

import no.hal.learning.exercise.util.RGB;

import no.hal.learning.quiz.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizFactoryImpl extends EFactoryImpl implements QuizFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuizFactory init() {
		try {
			QuizFactory theQuizFactory = (QuizFactory)EPackage.Registry.INSTANCE.getEFactory(QuizPackage.eNS_URI);
			if (theQuizFactory != null) {
				return theQuizFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuizFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuizPackage.STYLED_STRING_QUESTION: return createStyledStringQuestion();
			case QuizPackage.STYLED_STRING: return createStyledString();
			case QuizPackage.CHAR_STYLE: return createCharStyle();
			case QuizPackage.SIMPLE_PROPOSAL: return createSimpleProposal();
			case QuizPackage.STRING_ANSWER: return createStringAnswer();
			case QuizPackage.NUMBER_ANSWER: return createNumberAnswer();
			case QuizPackage.NUMBER_RANGE: return createNumberRange();
			case QuizPackage.BOOLEAN_ANSWER: return createBooleanAnswer();
			case QuizPackage.OPTIONS_ANSWER: return createOptionsAnswer();
			case QuizPackage.OPTIONS_PROPOSAL: return createOptionsProposal();
			case QuizPackage.OPTION: return createOption();
			case QuizPackage.SINGLE_OPTIONS_ANSWER: return createSingleOptionsAnswer();
			case QuizPackage.MANY_OPTIONS_ANSWER: return createManyOptionsAnswer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QuizPackage.RGB:
				return createRGBFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QuizPackage.RGB:
				return convertRGBToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyledStringQuestion createStyledStringQuestion() {
		StyledStringQuestionImpl styledStringQuestion = new StyledStringQuestionImpl();
		return styledStringQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyledString createStyledString() {
		StyledStringImpl styledString = new StyledStringImpl();
		return styledString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharStyle createCharStyle() {
		CharStyleImpl charStyle = new CharStyleImpl();
		return charStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <A extends SimpleAnswer<?>> SimpleProposal<A> createSimpleProposal() {
		SimpleProposalImpl<A> simpleProposal = new SimpleProposalImpl<A>();
		return simpleProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAnswer createStringAnswer() {
		StringAnswerImpl stringAnswer = new StringAnswerImpl();
		return stringAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberAnswer createNumberAnswer() {
		NumberAnswerImpl numberAnswer = new NumberAnswerImpl();
		return numberAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRange createNumberRange() {
		NumberRangeImpl numberRange = new NumberRangeImpl();
		return numberRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAnswer createBooleanAnswer() {
		BooleanAnswerImpl booleanAnswer = new BooleanAnswerImpl();
		return booleanAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsAnswer createOptionsAnswer() {
		OptionsAnswerImpl optionsAnswer = new OptionsAnswerImpl();
		return optionsAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsProposal createOptionsProposal() {
		OptionsProposalImpl optionsProposal = new OptionsProposalImpl();
		return optionsProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOptionsAnswer createSingleOptionsAnswer() {
		SingleOptionsAnswerImpl singleOptionsAnswer = new SingleOptionsAnswerImpl();
		return singleOptionsAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyOptionsAnswer createManyOptionsAnswer() {
		ManyOptionsAnswerImpl manyOptionsAnswer = new ManyOptionsAnswerImpl();
		return manyOptionsAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB createRGBFromString(EDataType eDataType, String initialValue) {
		return (RGB)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRGBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPackage getQuizPackage() {
		return (QuizPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuizPackage getPackage() {
		return QuizPackage.eINSTANCE;
	}

} //QuizFactoryImpl
