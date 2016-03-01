/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.learning.exercise.*;
import no.hal.learning.exercise.util.RGB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExerciseFactoryImpl extends EFactoryImpl implements ExerciseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExerciseFactory init() {
		try {
			ExerciseFactory theExerciseFactory = (ExerciseFactory)EPackage.Registry.INSTANCE.getEFactory(ExercisePackage.eNS_URI);
			if (theExerciseFactory != null) {
				return theExerciseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExerciseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseFactoryImpl() {
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
			case ExercisePackage.EXERCISE: return createExercise();
			case ExercisePackage.EXERCISE_PROPOSALS: return createExerciseProposals();
			case ExercisePackage.EXERCISE_PART_PROPOSALS: return createExercisePartProposals();
			case ExercisePackage.EXERCISE_PART_REF: return createExercisePartRef();
			case ExercisePackage.EXERCISE_PART: return createExercisePart();
			case ExercisePackage.TASK_REF: return createTaskRef();
			case ExercisePackage.TASK: return createTask();
			case ExercisePackage.STRING_QUESTION: return createStringQuestion();
			case ExercisePackage.STYLED_STRING_QUESTION: return createStyledStringQuestion();
			case ExercisePackage.STYLED_STRING: return createStyledString();
			case ExercisePackage.CHAR_STYLE: return createCharStyle();
			case ExercisePackage.PROPOSAL: return createProposal();
			case ExercisePackage.SIMPLE_PROPOSAL: return createSimpleProposal();
			case ExercisePackage.STRING_ANSWER: return createStringAnswer();
			case ExercisePackage.NUMBER_ANSWER: return createNumberAnswer();
			case ExercisePackage.NUMBER_RANGE: return createNumberRange();
			case ExercisePackage.BOOLEAN_ANSWER: return createBooleanAnswer();
			case ExercisePackage.OPTIONS_ANSWER: return createOptionsAnswer();
			case ExercisePackage.OPTIONS_PROPOSAL: return createOptionsProposal();
			case ExercisePackage.OPTION: return createOption();
			case ExercisePackage.SINGLE_OPTIONS_ANSWER: return createSingleOptionsAnswer();
			case ExercisePackage.MANY_OPTIONS_ANSWER: return createManyOptionsAnswer();
			case ExercisePackage.TASK_ANSWER: return createTaskAnswer();
			case ExercisePackage.TASK_PROPOSAL: return createTaskProposal();
			case ExercisePackage.TASK_EVENT: return createTaskEvent();
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
			case ExercisePackage.RGB:
				return createRGBFromString(eDataType, initialValue);
			case ExercisePackage.ETIMESTAMP:
				return createETimestampFromString(eDataType, initialValue);
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
			case ExercisePackage.RGB:
				return convertRGBToString(eDataType, instanceValue);
			case ExercisePackage.ETIMESTAMP:
				return convertETimestampToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise createExercise() {
		ExerciseImpl exercise = new ExerciseImpl();
		return exercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseProposals createExerciseProposals() {
		ExerciseProposalsImpl exerciseProposals = new ExerciseProposalsImpl();
		return exerciseProposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePartProposals createExercisePartProposals() {
		ExercisePartProposalsImpl exercisePartProposals = new ExercisePartProposalsImpl();
		return exercisePartProposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePartRef createExercisePartRef() {
		ExercisePartRefImpl exercisePartRef = new ExercisePartRefImpl();
		return exercisePartRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePart createExercisePart() {
		ExercisePartImpl exercisePart = new ExercisePartImpl();
		return exercisePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRef createTaskRef() {
		TaskRefImpl taskRef = new TaskRefImpl();
		return taskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringQuestion createStringQuestion() {
		StringQuestionImpl stringQuestion = new StringQuestionImpl();
		return stringQuestion;
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
	public <A extends Answer> Proposal<A> createProposal() {
		ProposalImpl<A> proposal = new ProposalImpl<A>();
		return proposal;
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
	public TaskAnswer createTaskAnswer() {
		TaskAnswerImpl taskAnswer = new TaskAnswerImpl();
		return taskAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends TaskAnswer> TaskProposal<T> createTaskProposal() {
		TaskProposalImpl<T> taskProposal = new TaskProposalImpl<T>();
		return taskProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskEvent createTaskEvent() {
		TaskEventImpl taskEvent = new TaskEventImpl();
		return taskEvent;
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
	public Long createETimestampFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETimestampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePackage getExercisePackage() {
		return (ExercisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExercisePackage getPackage() {
		return ExercisePackage.eINSTANCE;
	}

} //QuizFactoryImpl
