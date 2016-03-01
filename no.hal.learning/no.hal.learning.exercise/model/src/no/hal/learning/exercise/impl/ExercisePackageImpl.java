/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import no.hal.learning.exercise.AbstractExercisePart;
import no.hal.learning.exercise.AbstractTask;
import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.BooleanAnswer;
import no.hal.learning.exercise.CharStyle;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.ExercisePart;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.ExercisePartRef;
import no.hal.learning.exercise.ManyOptionsAnswer;
import no.hal.learning.exercise.NumberAnswer;
import no.hal.learning.exercise.NumberRange;
import no.hal.learning.exercise.Option;
import no.hal.learning.exercise.OptionAnswer;
import no.hal.learning.exercise.OptionsAnswer;
import no.hal.learning.exercise.OptionsProposal;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.SimpleAnswer;
import no.hal.learning.exercise.SimpleProposal;
import no.hal.learning.exercise.SingleOptionsAnswer;
import no.hal.learning.exercise.StringAnswer;
import no.hal.learning.exercise.StringQuestion;
import no.hal.learning.exercise.StyledString;
import no.hal.learning.exercise.StyledStringQuestion;
import no.hal.learning.exercise.Task;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.TaskRef;
import no.hal.learning.exercise.util.ExerciseValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExercisePackageImpl extends EPackageImpl implements ExercisePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exerciseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exerciseProposalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExercisePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exercisePartProposalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exercisePartRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exercisePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styledStringQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styledStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOptionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyOptionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTimestampEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.learning.exercise.ExercisePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExercisePackageImpl() {
		super(eNS_URI, ExerciseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExercisePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExercisePackage init() {
		if (isInited) return (ExercisePackage)EPackage.Registry.INSTANCE.getEPackage(ExercisePackage.eNS_URI);

		// Obtain or create and register package
		ExercisePackageImpl theExercisePackage = (ExercisePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExercisePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExercisePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExercisePackage.createPackageContents();

		// Initialize created meta-data
		theExercisePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theExercisePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ExerciseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theExercisePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExercisePackage.eNS_URI, theExercisePackage);
		return theExercisePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExercise() {
		return exerciseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExercise_Name() {
		return (EAttribute)exerciseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExercise_Title() {
		return (EAttribute)exerciseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercise_Parts() {
		return (EReference)exerciseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExercise__CreateProposals() {
		return exerciseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExerciseProposals() {
		return exerciseProposalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseProposals_Exercise() {
		return (EReference)exerciseProposalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseProposals_Proposals() {
		return (EReference)exerciseProposalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExerciseProposals_AllProposals() {
		return (EReference)exerciseProposalsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExercisePart() {
		return abstractExercisePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractExercisePart__GetTasks() {
		return abstractExercisePartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractExercisePart__GetTitle() {
		return abstractExercisePartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractExercisePart__CreateProposals() {
		return abstractExercisePartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExercisePartProposals() {
		return exercisePartProposalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercisePartProposals_Proposals() {
		return (EReference)exercisePartProposalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercisePartProposals_ExercisePart() {
		return (EReference)exercisePartProposalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExercisePartRef() {
		return exercisePartRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercisePartRef_PartRef() {
		return (EReference)exercisePartRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExercisePart() {
		return exercisePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExercisePart_Name() {
		return (EAttribute)exercisePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExercisePart_Title() {
		return (EAttribute)exercisePartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExercisePart_Tasks() {
		return (EReference)exercisePartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTask() {
		return abstractTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTask__GetA() {
		return abstractTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTask__GetQ() {
		return abstractTaskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRef() {
		return taskRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRef_TaskRef() {
		return (EReference)taskRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Q() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_A() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringQuestion() {
		return stringQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringQuestion_Question() {
		return (EAttribute)stringQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyledStringQuestion() {
		return styledStringQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledStringQuestion_StyledStrings() {
		return (EReference)styledStringQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyledString() {
		return styledStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledString_CharStyle() {
		return (EReference)styledStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledString_EffectiveCharStyle() {
		return (EReference)styledStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyledString_Prefix() {
		return (EAttribute)styledStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledString_StyledString() {
		return (EReference)styledStringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyledString_Suffix() {
		return (EAttribute)styledStringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharStyle() {
		return charStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Italic() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Bold() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Size() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Family() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Foreground() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Background() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnswer__Accept__Object() {
		return answerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnswer__Validate__Object() {
		return answerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnswer__CreateProposal() {
		return answerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProposal() {
		return proposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProposal_Question() {
		return (EReference)proposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProposal_Answer() {
		return (EReference)proposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProposal__GetProposal() {
		return proposalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProposal__Accept() {
		return proposalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProposal__Validate() {
		return proposalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionAnswer() {
		return optionAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAnswer() {
		return simpleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleAnswer__GetValue() {
		return simpleAnswerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleProposal() {
		return simpleProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleProposal_Proposal() {
		return (EAttribute)simpleProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringAnswer() {
		return stringAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Value() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Format() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Regexp() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_IgnoreCase() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberAnswer() {
		return numberAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAnswer_Value() {
		return (EAttribute)numberAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAnswer_ErrorMargin() {
		return (EAttribute)numberAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberAnswer_Range() {
		return (EReference)numberAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberRange() {
		return numberRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberRange_Min() {
		return (EAttribute)numberRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberRange_Max() {
		return (EAttribute)numberRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberRange_Step() {
		return (EAttribute)numberRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAnswer() {
		return booleanAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanAnswer_Value() {
		return (EAttribute)booleanAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsAnswer() {
		return optionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsAnswer_Options() {
		return (EReference)optionsAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsProposal() {
		return optionsProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsProposal_Indices() {
		return (EAttribute)optionsProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Correct() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Option() {
		return (EReference)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOptionsAnswer() {
		return singleOptionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyOptionsAnswer() {
		return manyOptionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskAnswer() {
		return taskAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskAnswer_RequiredCount() {
		return (EAttribute)taskAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskProposal() {
		return taskProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskProposal_Completion() {
		return (EAttribute)taskProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskProposal_Proof() {
		return (EAttribute)taskProposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskProposal_AttemptCount() {
		return (EAttribute)taskProposalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskProposal_Attempts() {
		return (EReference)taskProposalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskProposal_PerformedCount() {
		return (EAttribute)taskProposalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskEvent() {
		return taskEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskEvent_Timestamp() {
		return (EAttribute)taskEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskEvent_Completion() {
		return (EAttribute)taskEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRGB() {
		return rgbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETimestamp() {
		return eTimestampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseFactory getExerciseFactory() {
		return (ExerciseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		exerciseEClass = createEClass(EXERCISE);
		createEAttribute(exerciseEClass, EXERCISE__NAME);
		createEAttribute(exerciseEClass, EXERCISE__TITLE);
		createEReference(exerciseEClass, EXERCISE__PARTS);
		createEOperation(exerciseEClass, EXERCISE___CREATE_PROPOSALS);

		exerciseProposalsEClass = createEClass(EXERCISE_PROPOSALS);
		createEReference(exerciseProposalsEClass, EXERCISE_PROPOSALS__EXERCISE);
		createEReference(exerciseProposalsEClass, EXERCISE_PROPOSALS__PROPOSALS);
		createEReference(exerciseProposalsEClass, EXERCISE_PROPOSALS__ALL_PROPOSALS);

		abstractExercisePartEClass = createEClass(ABSTRACT_EXERCISE_PART);
		createEOperation(abstractExercisePartEClass, ABSTRACT_EXERCISE_PART___GET_TASKS);
		createEOperation(abstractExercisePartEClass, ABSTRACT_EXERCISE_PART___GET_TITLE);
		createEOperation(abstractExercisePartEClass, ABSTRACT_EXERCISE_PART___CREATE_PROPOSALS);

		exercisePartProposalsEClass = createEClass(EXERCISE_PART_PROPOSALS);
		createEReference(exercisePartProposalsEClass, EXERCISE_PART_PROPOSALS__PROPOSALS);
		createEReference(exercisePartProposalsEClass, EXERCISE_PART_PROPOSALS__EXERCISE_PART);

		exercisePartRefEClass = createEClass(EXERCISE_PART_REF);
		createEReference(exercisePartRefEClass, EXERCISE_PART_REF__PART_REF);

		exercisePartEClass = createEClass(EXERCISE_PART);
		createEAttribute(exercisePartEClass, EXERCISE_PART__NAME);
		createEAttribute(exercisePartEClass, EXERCISE_PART__TITLE);
		createEReference(exercisePartEClass, EXERCISE_PART__TASKS);

		abstractTaskEClass = createEClass(ABSTRACT_TASK);
		createEOperation(abstractTaskEClass, ABSTRACT_TASK___GET_A);
		createEOperation(abstractTaskEClass, ABSTRACT_TASK___GET_Q);

		taskRefEClass = createEClass(TASK_REF);
		createEReference(taskRefEClass, TASK_REF__TASK_REF);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__Q);
		createEReference(taskEClass, TASK__A);

		questionEClass = createEClass(QUESTION);

		stringQuestionEClass = createEClass(STRING_QUESTION);
		createEAttribute(stringQuestionEClass, STRING_QUESTION__QUESTION);

		styledStringQuestionEClass = createEClass(STYLED_STRING_QUESTION);
		createEReference(styledStringQuestionEClass, STYLED_STRING_QUESTION__STYLED_STRINGS);

		styledStringEClass = createEClass(STYLED_STRING);
		createEReference(styledStringEClass, STYLED_STRING__CHAR_STYLE);
		createEReference(styledStringEClass, STYLED_STRING__EFFECTIVE_CHAR_STYLE);
		createEAttribute(styledStringEClass, STYLED_STRING__PREFIX);
		createEReference(styledStringEClass, STYLED_STRING__STYLED_STRING);
		createEAttribute(styledStringEClass, STYLED_STRING__SUFFIX);

		charStyleEClass = createEClass(CHAR_STYLE);
		createEAttribute(charStyleEClass, CHAR_STYLE__ITALIC);
		createEAttribute(charStyleEClass, CHAR_STYLE__BOLD);
		createEAttribute(charStyleEClass, CHAR_STYLE__SIZE);
		createEAttribute(charStyleEClass, CHAR_STYLE__FAMILY);
		createEAttribute(charStyleEClass, CHAR_STYLE__FOREGROUND);
		createEAttribute(charStyleEClass, CHAR_STYLE__BACKGROUND);

		answerEClass = createEClass(ANSWER);
		createEOperation(answerEClass, ANSWER___ACCEPT__OBJECT);
		createEOperation(answerEClass, ANSWER___VALIDATE__OBJECT);
		createEOperation(answerEClass, ANSWER___CREATE_PROPOSAL);

		proposalEClass = createEClass(PROPOSAL);
		createEReference(proposalEClass, PROPOSAL__QUESTION);
		createEReference(proposalEClass, PROPOSAL__ANSWER);
		createEOperation(proposalEClass, PROPOSAL___GET_PROPOSAL);
		createEOperation(proposalEClass, PROPOSAL___ACCEPT);
		createEOperation(proposalEClass, PROPOSAL___VALIDATE);

		optionAnswerEClass = createEClass(OPTION_ANSWER);

		simpleAnswerEClass = createEClass(SIMPLE_ANSWER);
		createEOperation(simpleAnswerEClass, SIMPLE_ANSWER___GET_VALUE);

		simpleProposalEClass = createEClass(SIMPLE_PROPOSAL);
		createEAttribute(simpleProposalEClass, SIMPLE_PROPOSAL__PROPOSAL);

		stringAnswerEClass = createEClass(STRING_ANSWER);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__VALUE);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__FORMAT);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__REGEXP);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__IGNORE_CASE);

		numberAnswerEClass = createEClass(NUMBER_ANSWER);
		createEAttribute(numberAnswerEClass, NUMBER_ANSWER__VALUE);
		createEAttribute(numberAnswerEClass, NUMBER_ANSWER__ERROR_MARGIN);
		createEReference(numberAnswerEClass, NUMBER_ANSWER__RANGE);

		numberRangeEClass = createEClass(NUMBER_RANGE);
		createEAttribute(numberRangeEClass, NUMBER_RANGE__MIN);
		createEAttribute(numberRangeEClass, NUMBER_RANGE__MAX);
		createEAttribute(numberRangeEClass, NUMBER_RANGE__STEP);

		booleanAnswerEClass = createEClass(BOOLEAN_ANSWER);
		createEAttribute(booleanAnswerEClass, BOOLEAN_ANSWER__VALUE);

		optionsAnswerEClass = createEClass(OPTIONS_ANSWER);
		createEReference(optionsAnswerEClass, OPTIONS_ANSWER__OPTIONS);

		optionsProposalEClass = createEClass(OPTIONS_PROPOSAL);
		createEAttribute(optionsProposalEClass, OPTIONS_PROPOSAL__INDICES);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__CORRECT);
		createEReference(optionEClass, OPTION__OPTION);

		singleOptionsAnswerEClass = createEClass(SINGLE_OPTIONS_ANSWER);

		manyOptionsAnswerEClass = createEClass(MANY_OPTIONS_ANSWER);

		taskAnswerEClass = createEClass(TASK_ANSWER);
		createEAttribute(taskAnswerEClass, TASK_ANSWER__REQUIRED_COUNT);

		taskProposalEClass = createEClass(TASK_PROPOSAL);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__COMPLETION);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__PROOF);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__ATTEMPT_COUNT);
		createEReference(taskProposalEClass, TASK_PROPOSAL__ATTEMPTS);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__PERFORMED_COUNT);

		taskEventEClass = createEClass(TASK_EVENT);
		createEAttribute(taskEventEClass, TASK_EVENT__TIMESTAMP);
		createEAttribute(taskEventEClass, TASK_EVENT__COMPLETION);

		// Create data types
		rgbEDataType = createEDataType(RGB);
		eTimestampEDataType = createEDataType(ETIMESTAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter proposalEClass_A = addETypeParameter(proposalEClass, "A");
		ETypeParameter simpleAnswerEClass_T = addETypeParameter(simpleAnswerEClass, "T");
		ETypeParameter simpleProposalEClass_A = addETypeParameter(simpleProposalEClass, "A");
		ETypeParameter taskProposalEClass_T = addETypeParameter(taskProposalEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAnswer());
		proposalEClass_A.getEBounds().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		simpleProposalEClass_A.getEBounds().add(g1);
		g1 = createEGenericType(this.getTaskAnswer());
		taskProposalEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		exercisePartRefEClass.getESuperTypes().add(this.getAbstractExercisePart());
		exercisePartEClass.getESuperTypes().add(this.getAbstractExercisePart());
		taskRefEClass.getESuperTypes().add(this.getAbstractTask());
		taskEClass.getESuperTypes().add(this.getAbstractTask());
		stringQuestionEClass.getESuperTypes().add(this.getQuestion());
		styledStringQuestionEClass.getESuperTypes().add(this.getQuestion());
		optionAnswerEClass.getESuperTypes().add(this.getAnswer());
		simpleAnswerEClass.getESuperTypes().add(this.getOptionAnswer());
		g1 = createEGenericType(this.getProposal());
		g2 = createEGenericType(simpleProposalEClass_A);
		g1.getETypeArguments().add(g2);
		simpleProposalEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringAnswerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		numberAnswerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		booleanAnswerEClass.getEGenericSuperTypes().add(g1);
		optionsAnswerEClass.getESuperTypes().add(this.getAnswer());
		g1 = createEGenericType(this.getProposal());
		g2 = createEGenericType(this.getOptionsAnswer());
		g1.getETypeArguments().add(g2);
		optionsProposalEClass.getEGenericSuperTypes().add(g1);
		singleOptionsAnswerEClass.getESuperTypes().add(this.getOptionsAnswer());
		manyOptionsAnswerEClass.getESuperTypes().add(this.getOptionsAnswer());
		taskAnswerEClass.getESuperTypes().add(this.getAnswer());
		g1 = createEGenericType(this.getProposal());
		g2 = createEGenericType(taskProposalEClass_T);
		g1.getETypeArguments().add(g2);
		taskProposalEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(exerciseEClass, Exercise.class, "Exercise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExercise_Name(), ecorePackage.getEString(), "name", null, 0, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExercise_Title(), ecorePackage.getEString(), "title", null, 0, 1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercise_Parts(), this.getAbstractExercisePart(), null, "parts", null, 0, -1, Exercise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExercise__CreateProposals(), this.getExerciseProposals(), "createProposals", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exerciseProposalsEClass, ExerciseProposals.class, "ExerciseProposals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExerciseProposals_Exercise(), this.getExercise(), null, "exercise", null, 0, 1, ExerciseProposals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExerciseProposals_Proposals(), this.getExercisePartProposals(), null, "proposals", null, 0, -1, ExerciseProposals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getProposal());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getExerciseProposals_AllProposals(), g1, null, "allProposals", null, 0, -1, ExerciseProposals.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractExercisePartEClass, AbstractExercisePart.class, "AbstractExercisePart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractExercisePart__GetTasks(), this.getAbstractTask(), "getTasks", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractExercisePart__GetTitle(), ecorePackage.getEString(), "getTitle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractExercisePart__CreateProposals(), this.getExercisePartProposals(), "createProposals", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exercisePartProposalsEClass, ExercisePartProposals.class, "ExercisePartProposals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getProposal());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getExercisePartProposals_Proposals(), g1, null, "proposals", null, 0, -1, ExercisePartProposals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercisePartProposals_ExercisePart(), this.getExercisePart(), null, "exercisePart", null, 0, 1, ExercisePartProposals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exercisePartRefEClass, ExercisePartRef.class, "ExercisePartRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExercisePartRef_PartRef(), this.getExercisePart(), null, "partRef", null, 0, 1, ExercisePartRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exercisePartEClass, ExercisePart.class, "ExercisePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExercisePart_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExercisePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExercisePart_Title(), ecorePackage.getEString(), "title", null, 0, 1, ExercisePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExercisePart_Tasks(), this.getAbstractTask(), null, "tasks", null, 0, -1, ExercisePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTaskEClass, AbstractTask.class, "AbstractTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractTask__GetA(), this.getAnswer(), "getA", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractTask__GetQ(), this.getQuestion(), "getQ", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskRefEClass, TaskRef.class, "TaskRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRef_TaskRef(), this.getTask(), null, "taskRef", null, 0, 1, TaskRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Q(), this.getQuestion(), null, "q", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_A(), this.getAnswer(), null, "a", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringQuestionEClass, StringQuestion.class, "StringQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringQuestion_Question(), ecorePackage.getEString(), "question", null, 0, 1, StringQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styledStringQuestionEClass, StyledStringQuestion.class, "StyledStringQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyledStringQuestion_StyledStrings(), this.getStyledString(), null, "styledStrings", null, 0, -1, StyledStringQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styledStringEClass, StyledString.class, "StyledString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyledString_CharStyle(), this.getCharStyle(), null, "charStyle", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyledString_EffectiveCharStyle(), this.getCharStyle(), null, "effectiveCharStyle", null, 0, 1, StyledString.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyledString_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyledString_StyledString(), this.getStyledString(), null, "styledString", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyledString_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charStyleEClass, CharStyle.class, "CharStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharStyle_Italic(), ecorePackage.getEBooleanObject(), "italic", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Bold(), ecorePackage.getEBooleanObject(), "bold", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Size(), ecorePackage.getEFloat(), "size", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Family(), ecorePackage.getEString(), "family", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Foreground(), this.getRGB(), "foreground", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Background(), this.getRGB(), "background", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAnswer__Accept__Object(), ecorePackage.getEDoubleObject(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnswer__Validate__Object(), ecorePackage.getEString(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnswer__CreateProposal(), null, "createProposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getProposal());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(proposalEClass, Proposal.class, "Proposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProposal_Question(), this.getQuestion(), null, "question", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(proposalEClass_A);
		initEReference(getProposal_Answer(), g1, null, "answer", null, 0, 1, Proposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProposal__GetProposal(), ecorePackage.getEJavaObject(), "getProposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProposal__Accept(), ecorePackage.getEDoubleObject(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProposal__Validate(), ecorePackage.getEString(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionAnswerEClass, OptionAnswer.class, "OptionAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleAnswerEClass, SimpleAnswer.class, "SimpleAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSimpleAnswer__GetValue(), null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(simpleAnswerEClass_T);
		initEOperation(op, g1);

		initEClass(simpleProposalEClass, SimpleProposal.class, "SimpleProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleProposal_Proposal(), ecorePackage.getEJavaObject(), "proposal", null, 0, 1, SimpleProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringAnswerEClass, StringAnswer.class, "StringAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringAnswer_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_Format(), ecorePackage.getEString(), "format", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_Regexp(), ecorePackage.getEBoolean(), "regexp", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_IgnoreCase(), ecorePackage.getEBoolean(), "ignoreCase", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberAnswerEClass, NumberAnswer.class, "NumberAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberAnswer_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberAnswer_ErrorMargin(), ecorePackage.getEDouble(), "errorMargin", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberAnswer_Range(), this.getNumberRange(), null, "range", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberRangeEClass, NumberRange.class, "NumberRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberRange_Min(), ecorePackage.getEDoubleObject(), "min", null, 0, 1, NumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberRange_Max(), ecorePackage.getEDoubleObject(), "max", null, 0, 1, NumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberRange_Step(), ecorePackage.getEDoubleObject(), "step", null, 0, 1, NumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanAnswerEClass, BooleanAnswer.class, "BooleanAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanAnswer_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsAnswerEClass, OptionsAnswer.class, "OptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsAnswer_Options(), this.getOption(), null, "options", null, 0, -1, OptionsAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsProposalEClass, OptionsProposal.class, "OptionsProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionsProposal_Indices(), ecorePackage.getEInt(), "indices", null, 0, -1, OptionsProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Correct(), ecorePackage.getEBoolean(), "correct", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Option(), this.getOptionAnswer(), null, "option", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleOptionsAnswerEClass, SingleOptionsAnswer.class, "SingleOptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyOptionsAnswerEClass, ManyOptionsAnswer.class, "ManyOptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskAnswerEClass, TaskAnswer.class, "TaskAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskAnswer_RequiredCount(), ecorePackage.getEInt(), "requiredCount", null, 0, 1, TaskAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskProposalEClass, TaskProposal.class, "TaskProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskProposal_Completion(), ecorePackage.getEDouble(), "completion", "-1", 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProposal_Proof(), ecorePackage.getEString(), "proof", null, 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProposal_AttemptCount(), ecorePackage.getEInt(), "attemptCount", null, 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProposal_Attempts(), this.getTaskEvent(), null, "attempts", null, 0, -1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProposal_PerformedCount(), ecorePackage.getEInt(), "performedCount", null, 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEventEClass, TaskEvent.class, "TaskEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskEvent_Timestamp(), this.getETimestamp(), "timestamp", null, 0, 1, TaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskEvent_Completion(), ecorePackage.getEDouble(), "completion", "-1", 0, 1, TaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(rgbEDataType, no.hal.learning.exercise.util.RGB.class, "RGB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eTimestampEDataType, long.class, "ETimestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// no.hal.learning.exercise.views.ExerciseView
		createNoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (singleOptionsAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleCorrectOption"
		   });	
		addAnnotation
		  (manyOptionsAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneCorrectOption"
		   });
	}

	/**
	 * Initializes the annotations for <b>no.hal.learning.exercise.views.ExerciseView</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNoAnnotations() {
		String source = "no.hal.learning.exercise.views.ExerciseView";	
		addAnnotation
		  (getTaskEvent_Completion(), 
		   source, 
		   new String[] {
			 "dashes", "SOLID"
		   });
	}

} //QuizPackageImpl
