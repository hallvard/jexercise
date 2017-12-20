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
import org.eclipse.emf.ecore.impl.EPackageImpl;

import no.hal.learning.exercise.AbstractExercisePart;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.AbstractTask;
import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.ExercisePart;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.ExercisePartRef;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.RelativeStringEdit;
import no.hal.learning.exercise.ReplaceSubstringEdit;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.StringEdit;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;
import no.hal.learning.exercise.StringQuestion;
import no.hal.learning.exercise.Task;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.TaskRef;
import no.hal.learning.fv.FvPackage;

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
	private EClass stringEditTaskProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEditAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStringEditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStringEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeStringEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceSubstringEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markerInfoEClass = null;

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

		// Initialize simple dependencies
		FvPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExercisePackage.createPackageContents();

		// Initialize created meta-data
		theExercisePackage.initializePackageContents();

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
	public EOperation getTaskAnswer__AcceptEvent__TaskEvent() {
		return taskAnswerEClass.getEOperations().get(0);
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
	public EOperation getTaskProposal__GetText() {
		return taskProposalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskProposal__AddTaskEvent__TaskEvent() {
		return taskProposalEClass.getEOperations().get(1);
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
	public EReference getTaskEvent_Proposal() {
		return (EReference)taskEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskEvent_Timestamp() {
		return (EAttribute)taskEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskEvent_Completion() {
		return (EAttribute)taskEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskEvent__GetText() {
		return taskEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringEditTaskProposal() {
		return stringEditTaskProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringEditAnswer() {
		return stringEditAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringEditAnswer__GetEditorPath() {
		return stringEditAnswerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStringEditEvent() {
		return abstractStringEditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStringEditEvent_Edit() {
		return (EReference)abstractStringEditEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStringEditEvent_Markers() {
		return (EReference)abstractStringEditEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStringEditEvent__GetString() {
		return abstractStringEditEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStringEditEvent__CreateStringEdit__String_AbstractStringEditEvent() {
		return abstractStringEditEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStringEdit() {
		return abstractStringEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStringEdit__GetString() {
		return abstractStringEditEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractStringEdit__InitStringEdit__String_AbstractStringEdit() {
		return abstractStringEditEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeStringEdit() {
		return relativeStringEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeStringEdit_Edit() {
		return (EReference)relativeStringEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringEdit() {
		return stringEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringEdit_StoredString() {
		return (EAttribute)stringEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceSubstringEdit() {
		return replaceSubstringEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceSubstringEdit_Start() {
		return (EAttribute)replaceSubstringEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceSubstringEdit_End() {
		return (EAttribute)replaceSubstringEditEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkerInfo() {
		return markerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerInfo_LineNumber() {
		return (EAttribute)markerInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerInfo_CharStart() {
		return (EAttribute)markerInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerInfo_CharEnd() {
		return (EAttribute)markerInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerInfo_Severity() {
		return (EAttribute)markerInfoEClass.getEStructuralFeatures().get(3);
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

		taskAnswerEClass = createEClass(TASK_ANSWER);
		createEAttribute(taskAnswerEClass, TASK_ANSWER__REQUIRED_COUNT);
		createEOperation(taskAnswerEClass, TASK_ANSWER___ACCEPT_EVENT__TASKEVENT);

		taskProposalEClass = createEClass(TASK_PROPOSAL);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__COMPLETION);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__PROOF);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__ATTEMPT_COUNT);
		createEReference(taskProposalEClass, TASK_PROPOSAL__ATTEMPTS);
		createEAttribute(taskProposalEClass, TASK_PROPOSAL__PERFORMED_COUNT);
		createEOperation(taskProposalEClass, TASK_PROPOSAL___GET_TEXT);
		createEOperation(taskProposalEClass, TASK_PROPOSAL___ADD_TASK_EVENT__TASKEVENT);

		taskEventEClass = createEClass(TASK_EVENT);
		createEReference(taskEventEClass, TASK_EVENT__PROPOSAL);
		createEAttribute(taskEventEClass, TASK_EVENT__TIMESTAMP);
		createEAttribute(taskEventEClass, TASK_EVENT__COMPLETION);
		createEOperation(taskEventEClass, TASK_EVENT___GET_TEXT);

		stringEditTaskProposalEClass = createEClass(STRING_EDIT_TASK_PROPOSAL);

		stringEditAnswerEClass = createEClass(STRING_EDIT_ANSWER);
		createEOperation(stringEditAnswerEClass, STRING_EDIT_ANSWER___GET_EDITOR_PATH);

		abstractStringEditEventEClass = createEClass(ABSTRACT_STRING_EDIT_EVENT);
		createEReference(abstractStringEditEventEClass, ABSTRACT_STRING_EDIT_EVENT__EDIT);
		createEReference(abstractStringEditEventEClass, ABSTRACT_STRING_EDIT_EVENT__MARKERS);
		createEOperation(abstractStringEditEventEClass, ABSTRACT_STRING_EDIT_EVENT___GET_STRING);
		createEOperation(abstractStringEditEventEClass, ABSTRACT_STRING_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT);

		abstractStringEditEClass = createEClass(ABSTRACT_STRING_EDIT);
		createEOperation(abstractStringEditEClass, ABSTRACT_STRING_EDIT___GET_STRING);
		createEOperation(abstractStringEditEClass, ABSTRACT_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT);

		relativeStringEditEClass = createEClass(RELATIVE_STRING_EDIT);
		createEReference(relativeStringEditEClass, RELATIVE_STRING_EDIT__EDIT);

		stringEditEClass = createEClass(STRING_EDIT);
		createEAttribute(stringEditEClass, STRING_EDIT__STORED_STRING);

		replaceSubstringEditEClass = createEClass(REPLACE_SUBSTRING_EDIT);
		createEAttribute(replaceSubstringEditEClass, REPLACE_SUBSTRING_EDIT__START);
		createEAttribute(replaceSubstringEditEClass, REPLACE_SUBSTRING_EDIT__END);

		markerInfoEClass = createEClass(MARKER_INFO);
		createEAttribute(markerInfoEClass, MARKER_INFO__LINE_NUMBER);
		createEAttribute(markerInfoEClass, MARKER_INFO__CHAR_START);
		createEAttribute(markerInfoEClass, MARKER_INFO__CHAR_END);
		createEAttribute(markerInfoEClass, MARKER_INFO__SEVERITY);

		// Create data types
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

		// Obtain other dependent packages
		FvPackage theFvPackage = (FvPackage)EPackage.Registry.INSTANCE.getEPackage(FvPackage.eNS_URI);

		// Create type parameters
		ETypeParameter proposalEClass_A = addETypeParameter(proposalEClass, "A");
		ETypeParameter taskProposalEClass_T = addETypeParameter(taskProposalEClass, "T");
		ETypeParameter stringEditTaskProposalEClass_A = addETypeParameter(stringEditTaskProposalEClass, "A");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAnswer());
		proposalEClass_A.getEBounds().add(g1);
		g1 = createEGenericType(this.getTaskAnswer());
		taskProposalEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getStringEditAnswer());
		stringEditTaskProposalEClass_A.getEBounds().add(g1);

		// Add supertypes to classes
		exercisePartRefEClass.getESuperTypes().add(this.getAbstractExercisePart());
		exercisePartEClass.getESuperTypes().add(this.getAbstractExercisePart());
		taskRefEClass.getESuperTypes().add(this.getAbstractTask());
		taskEClass.getESuperTypes().add(this.getAbstractTask());
		stringQuestionEClass.getESuperTypes().add(this.getQuestion());
		taskAnswerEClass.getESuperTypes().add(this.getAnswer());
		g1 = createEGenericType(this.getProposal());
		EGenericType g2 = createEGenericType(taskProposalEClass_T);
		g1.getETypeArguments().add(g2);
		taskProposalEClass.getEGenericSuperTypes().add(g1);
		taskEventEClass.getESuperTypes().add(theFvPackage.getEFeatureObject());
		g1 = createEGenericType(this.getTaskProposal());
		g2 = createEGenericType(stringEditTaskProposalEClass_A);
		g1.getETypeArguments().add(g2);
		stringEditTaskProposalEClass.getEGenericSuperTypes().add(g1);
		stringEditAnswerEClass.getESuperTypes().add(this.getTaskAnswer());
		abstractStringEditEventEClass.getESuperTypes().add(this.getTaskEvent());
		relativeStringEditEClass.getESuperTypes().add(this.getAbstractStringEdit());
		stringEditEClass.getESuperTypes().add(this.getAbstractStringEdit());
		replaceSubstringEditEClass.getESuperTypes().add(this.getStringEdit());
		replaceSubstringEditEClass.getESuperTypes().add(this.getRelativeStringEdit());

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

		initEClass(taskAnswerEClass, TaskAnswer.class, "TaskAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskAnswer_RequiredCount(), ecorePackage.getEInt(), "requiredCount", null, 0, 1, TaskAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTaskAnswer__AcceptEvent__TaskEvent(), ecorePackage.getEBoolean(), "acceptEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTaskEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskProposalEClass, TaskProposal.class, "TaskProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskProposal_Completion(), ecorePackage.getEDouble(), "completion", "-1", 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProposal_Proof(), ecorePackage.getEString(), "proof", null, 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProposal_AttemptCount(), ecorePackage.getEInt(), "attemptCount", null, 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProposal_Attempts(), this.getTaskEvent(), this.getTaskEvent_Proposal(), "attempts", null, 0, -1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProposal_PerformedCount(), ecorePackage.getEInt(), "performedCount", null, 0, 1, TaskProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTaskProposal__GetText(), ecorePackage.getEString(), "getText", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTaskProposal__AddTaskEvent__TaskEvent(), ecorePackage.getEBoolean(), "addTaskEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTaskEvent(), "taskEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEventEClass, TaskEvent.class, "TaskEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getTaskProposal());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getTaskEvent_Proposal(), g1, this.getTaskProposal_Attempts(), "proposal", null, 0, 1, TaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskEvent_Timestamp(), this.getETimestamp(), "timestamp", null, 0, 1, TaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskEvent_Completion(), ecorePackage.getEDouble(), "completion", "-1", 0, 1, TaskEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTaskEvent__GetText(), ecorePackage.getEString(), "getText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringEditTaskProposalEClass, StringEditTaskProposal.class, "StringEditTaskProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEditAnswerEClass, StringEditAnswer.class, "StringEditAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStringEditAnswer__GetEditorPath(), ecorePackage.getEString(), "getEditorPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractStringEditEventEClass, AbstractStringEditEvent.class, "AbstractStringEditEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractStringEditEvent_Edit(), this.getAbstractStringEdit(), null, "edit", null, 0, 1, AbstractStringEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStringEditEvent_Markers(), this.getMarkerInfo(), null, "markers", null, 0, -1, AbstractStringEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractStringEditEvent__GetString(), ecorePackage.getEString(), "getString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStringEditEvent__CreateStringEdit__String_AbstractStringEditEvent(), this.getAbstractStringEdit(), "createStringEdit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractStringEditEvent(), "lastEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractStringEditEClass, AbstractStringEdit.class, "AbstractStringEdit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractStringEdit__GetString(), ecorePackage.getEString(), "getString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractStringEdit__InitStringEdit__String_AbstractStringEdit(), ecorePackage.getEBooleanObject(), "initStringEdit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractStringEdit(), "lastEdit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relativeStringEditEClass, RelativeStringEdit.class, "RelativeStringEdit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativeStringEdit_Edit(), this.getAbstractStringEdit(), null, "edit", null, 0, 1, RelativeStringEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEditEClass, StringEdit.class, "StringEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringEdit_StoredString(), ecorePackage.getEString(), "storedString", null, 0, 1, StringEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceSubstringEditEClass, ReplaceSubstringEdit.class, "ReplaceSubstringEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplaceSubstringEdit_Start(), ecorePackage.getEInt(), "start", null, 0, 1, ReplaceSubstringEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceSubstringEdit_End(), ecorePackage.getEInt(), "end", "-1", 0, 1, ReplaceSubstringEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markerInfoEClass, MarkerInfo.class, "MarkerInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkerInfo_LineNumber(), ecorePackage.getEInt(), "lineNumber", null, 0, 1, MarkerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkerInfo_CharStart(), ecorePackage.getEInt(), "charStart", null, 0, 1, MarkerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkerInfo_CharEnd(), ecorePackage.getEInt(), "charEnd", null, 0, 1, MarkerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkerInfo_Severity(), ecorePackage.getEInt(), "severity", null, 0, 1, MarkerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eTimestampEDataType, long.class, "ETimestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// no.hal.learning.exercise.views.ExerciseView
		createNoAnnotations();
		// no.hal.learning.exercise.MarkerInfo
		createNo_1Annotations();
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

	/**
	 * Initializes the annotations for <b>no.hal.learning.exercise.MarkerInfo</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNo_1Annotations() {
		String source = "no.hal.learning.exercise.MarkerInfo";	
		addAnnotation
		  (getMarkerInfo_Severity(), 
		   source, 
		   new String[] {
			 "valueClass", "org.eclipse.core.resources.IMarker",
			 "fieldPattern", "SEVERITY_.*"
		   });
	}

} //QuizPackageImpl
