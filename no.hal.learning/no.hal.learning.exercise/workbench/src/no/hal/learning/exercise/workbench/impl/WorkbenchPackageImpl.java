/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;
import no.hal.learning.exercise.workbench.CommandExecutionProposal;
import no.hal.learning.exercise.workbench.DebugEventAnswer;
import no.hal.learning.exercise.workbench.DebugEventProposal;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskProposal;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;
import no.hal.learning.exercise.workbench.PerspectiveTaskProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;
import no.hal.learning.exercise.workbench.WorkbenchTaskAnswer;
import no.hal.learning.exercise.workbench.util.WorkbenchValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkbenchPackageImpl extends EPackageImpl implements WorkbenchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workbenchTaskAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partTaskAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partTaskProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perspectiveTaskAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perspectiveTaskProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandExecutionAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandExecutionProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debugEventAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debugEventProposalEClass = null;

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
	 * @see no.hal.learning.exercise.workbench.WorkbenchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkbenchPackageImpl() {
		super(eNS_URI, WorkbenchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkbenchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkbenchPackage init() {
		if (isInited) return (WorkbenchPackage)EPackage.Registry.INSTANCE.getEPackage(WorkbenchPackage.eNS_URI);

		// Obtain or create and register package
		WorkbenchPackageImpl theWorkbenchPackage = (WorkbenchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkbenchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkbenchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExercisePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWorkbenchPackage.createPackageContents();

		// Initialize created meta-data
		theWorkbenchPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWorkbenchPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WorkbenchValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWorkbenchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkbenchPackage.eNS_URI, theWorkbenchPackage);
		return theWorkbenchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkbenchTaskAnswer() {
		return workbenchTaskAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkbenchTaskAnswer_ElementId() {
		return (EAttribute)workbenchTaskAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkbenchTaskAnswer_Action() {
		return (EAttribute)workbenchTaskAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkbenchTaskAnswer_Text() {
		return (EAttribute)workbenchTaskAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartTaskAnswer() {
		return partTaskAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartTaskProposal() {
		return partTaskProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerspectiveTaskAnswer() {
		return perspectiveTaskAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerspectiveTaskProposal() {
		return perspectiveTaskProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandExecutionAnswer() {
		return commandExecutionAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandExecutionProposal() {
		return commandExecutionProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebugEventAnswer() {
		return debugEventAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebugEventProposal() {
		return debugEventProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchFactory getWorkbenchFactory() {
		return (WorkbenchFactory)getEFactoryInstance();
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
		workbenchTaskAnswerEClass = createEClass(WORKBENCH_TASK_ANSWER);
		createEAttribute(workbenchTaskAnswerEClass, WORKBENCH_TASK_ANSWER__ELEMENT_ID);
		createEAttribute(workbenchTaskAnswerEClass, WORKBENCH_TASK_ANSWER__ACTION);
		createEAttribute(workbenchTaskAnswerEClass, WORKBENCH_TASK_ANSWER__TEXT);

		partTaskAnswerEClass = createEClass(PART_TASK_ANSWER);

		partTaskProposalEClass = createEClass(PART_TASK_PROPOSAL);

		perspectiveTaskAnswerEClass = createEClass(PERSPECTIVE_TASK_ANSWER);

		perspectiveTaskProposalEClass = createEClass(PERSPECTIVE_TASK_PROPOSAL);

		commandExecutionAnswerEClass = createEClass(COMMAND_EXECUTION_ANSWER);

		commandExecutionProposalEClass = createEClass(COMMAND_EXECUTION_PROPOSAL);

		debugEventAnswerEClass = createEClass(DEBUG_EVENT_ANSWER);

		debugEventProposalEClass = createEClass(DEBUG_EVENT_PROPOSAL);
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
		ExercisePackage theExercisePackage = (ExercisePackage)EPackage.Registry.INSTANCE.getEPackage(ExercisePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workbenchTaskAnswerEClass.getESuperTypes().add(theExercisePackage.getTaskAnswer());
		partTaskAnswerEClass.getESuperTypes().add(this.getWorkbenchTaskAnswer());
		EGenericType g1 = createEGenericType(theExercisePackage.getTaskProposal());
		EGenericType g2 = createEGenericType(this.getPartTaskAnswer());
		g1.getETypeArguments().add(g2);
		partTaskProposalEClass.getEGenericSuperTypes().add(g1);
		perspectiveTaskAnswerEClass.getESuperTypes().add(this.getWorkbenchTaskAnswer());
		g1 = createEGenericType(theExercisePackage.getTaskProposal());
		g2 = createEGenericType(this.getPerspectiveTaskAnswer());
		g1.getETypeArguments().add(g2);
		perspectiveTaskProposalEClass.getEGenericSuperTypes().add(g1);
		commandExecutionAnswerEClass.getESuperTypes().add(this.getWorkbenchTaskAnswer());
		g1 = createEGenericType(theExercisePackage.getTaskProposal());
		g2 = createEGenericType(this.getCommandExecutionAnswer());
		g1.getETypeArguments().add(g2);
		commandExecutionProposalEClass.getEGenericSuperTypes().add(g1);
		debugEventAnswerEClass.getESuperTypes().add(this.getWorkbenchTaskAnswer());
		g1 = createEGenericType(theExercisePackage.getTaskProposal());
		g2 = createEGenericType(this.getDebugEventAnswer());
		g1.getETypeArguments().add(g2);
		debugEventProposalEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(workbenchTaskAnswerEClass, WorkbenchTaskAnswer.class, "WorkbenchTaskAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkbenchTaskAnswer_ElementId(), ecorePackage.getEString(), "elementId", null, 0, 1, WorkbenchTaskAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkbenchTaskAnswer_Action(), ecorePackage.getEString(), "action", null, 0, 1, WorkbenchTaskAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkbenchTaskAnswer_Text(), ecorePackage.getEString(), "text", null, 0, 1, WorkbenchTaskAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partTaskAnswerEClass, PartTaskAnswer.class, "PartTaskAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partTaskProposalEClass, PartTaskProposal.class, "PartTaskProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perspectiveTaskAnswerEClass, PerspectiveTaskAnswer.class, "PerspectiveTaskAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perspectiveTaskProposalEClass, PerspectiveTaskProposal.class, "PerspectiveTaskProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandExecutionAnswerEClass, CommandExecutionAnswer.class, "CommandExecutionAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandExecutionProposalEClass, CommandExecutionProposal.class, "CommandExecutionProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(debugEventAnswerEClass, DebugEventAnswer.class, "DebugEventAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(debugEventProposalEClass, DebugEventProposal.class, "DebugEventProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
		  (partTaskAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "knownPartId"
		   });	
		addAnnotation
		  (perspectiveTaskAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "knownPerspectiveId"
		   });	
		addAnnotation
		  (commandExecutionAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "knownCommandId"
		   });
	}

} //WorkbenchPackageImpl
