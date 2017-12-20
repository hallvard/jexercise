/**
 */
package no.hal.learning.exercise.workspace.impl;

import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.LaunchProposal;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.exercise.workspace.SourceFileEditProposal;
import no.hal.learning.exercise.workspace.WorkspaceFactory;
import no.hal.learning.exercise.workspace.WorkspacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkspacePackageImpl extends EPackageImpl implements WorkspacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEditAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEditProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchEventEClass = null;

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
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkspacePackageImpl() {
		super(eNS_URI, WorkspaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkspacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkspacePackage init() {
		if (isInited) return (WorkspacePackage)EPackage.Registry.INSTANCE.getEPackage(WorkspacePackage.eNS_URI);

		// Obtain or create and register package
		WorkspacePackageImpl theWorkspacePackage = (WorkspacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkspacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkspacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExercisePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWorkspacePackage.createPackageContents();

		// Initialize created meta-data
		theWorkspacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkspacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkspacePackage.eNS_URI, theWorkspacePackage);
		return theWorkspacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFileEditAnswer() {
		return sourceFileEditAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditAnswer_ResourcePath() {
		return (EAttribute)sourceFileEditAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFileEditProposal() {
		return sourceFileEditProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFileEditEvent() {
		return sourceFileEditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_ResourcePath() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_SourceCode() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_SizeMeasure() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_ErrorCount() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_WarningCount() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaunchAnswer() {
		return launchAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchAnswer_Mode() {
		return (EAttribute)launchAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchAnswer_LaunchAttrNames() {
		return (EAttribute)launchAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchAnswer_LaunchAttrValues() {
		return (EAttribute)launchAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaunchProposal() {
		return launchProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaunchEvent() {
		return launchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchEvent_Mode() {
		return (EAttribute)launchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchEvent_LaunchAttrNames() {
		return (EAttribute)launchEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchEvent_LaunchAttrValues() {
		return (EAttribute)launchEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchEvent_ConsoleOutput() {
		return (EAttribute)launchEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchEvent_ConsoleOutputSizeMeasure() {
		return (EAttribute)launchEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaunchEvent__GetAllConsoleOutput() {
		return launchEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceFactory getWorkspaceFactory() {
		return (WorkspaceFactory)getEFactoryInstance();
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
		sourceFileEditAnswerEClass = createEClass(SOURCE_FILE_EDIT_ANSWER);
		createEAttribute(sourceFileEditAnswerEClass, SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH);

		sourceFileEditProposalEClass = createEClass(SOURCE_FILE_EDIT_PROPOSAL);

		sourceFileEditEventEClass = createEClass(SOURCE_FILE_EDIT_EVENT);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__SOURCE_CODE);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__ERROR_COUNT);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__WARNING_COUNT);

		launchAnswerEClass = createEClass(LAUNCH_ANSWER);
		createEAttribute(launchAnswerEClass, LAUNCH_ANSWER__MODE);
		createEAttribute(launchAnswerEClass, LAUNCH_ANSWER__LAUNCH_ATTR_NAMES);
		createEAttribute(launchAnswerEClass, LAUNCH_ANSWER__LAUNCH_ATTR_VALUES);

		launchProposalEClass = createEClass(LAUNCH_PROPOSAL);

		launchEventEClass = createEClass(LAUNCH_EVENT);
		createEAttribute(launchEventEClass, LAUNCH_EVENT__MODE);
		createEAttribute(launchEventEClass, LAUNCH_EVENT__LAUNCH_ATTR_NAMES);
		createEAttribute(launchEventEClass, LAUNCH_EVENT__LAUNCH_ATTR_VALUES);
		createEAttribute(launchEventEClass, LAUNCH_EVENT__CONSOLE_OUTPUT);
		createEAttribute(launchEventEClass, LAUNCH_EVENT__CONSOLE_OUTPUT_SIZE_MEASURE);
		createEOperation(launchEventEClass, LAUNCH_EVENT___GET_ALL_CONSOLE_OUTPUT);
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
		ETypeParameter launchProposalEClass_T = addETypeParameter(launchProposalEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getLaunchAnswer());
		launchProposalEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		sourceFileEditAnswerEClass.getESuperTypes().add(theExercisePackage.getStringEditAnswer());
		g1 = createEGenericType(theExercisePackage.getStringEditTaskProposal());
		EGenericType g2 = createEGenericType(this.getSourceFileEditAnswer());
		g1.getETypeArguments().add(g2);
		sourceFileEditProposalEClass.getEGenericSuperTypes().add(g1);
		sourceFileEditEventEClass.getESuperTypes().add(theExercisePackage.getAbstractStringEditEvent());
		launchAnswerEClass.getESuperTypes().add(theExercisePackage.getTaskAnswer());
		g1 = createEGenericType(theExercisePackage.getTaskProposal());
		g2 = createEGenericType(launchProposalEClass_T);
		g1.getETypeArguments().add(g2);
		launchProposalEClass.getEGenericSuperTypes().add(g1);
		launchEventEClass.getESuperTypes().add(theExercisePackage.getTaskEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceFileEditAnswerEClass, SourceFileEditAnswer.class, "SourceFileEditAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFileEditAnswer_ResourcePath(), ecorePackage.getEString(), "resourcePath", null, 0, 1, SourceFileEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFileEditProposalEClass, SourceFileEditProposal.class, "SourceFileEditProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFileEditEventEClass, SourceFileEditEvent.class, "SourceFileEditEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFileEditEvent_ResourcePath(), ecorePackage.getEString(), "resourcePath", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_SourceCode(), ecorePackage.getEString(), "sourceCode", null, 0, 1, SourceFileEditEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_SizeMeasure(), ecorePackage.getEInt(), "sizeMeasure", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_ErrorCount(), ecorePackage.getEInt(), "errorCount", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_WarningCount(), ecorePackage.getEInt(), "warningCount", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launchAnswerEClass, LaunchAnswer.class, "LaunchAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaunchAnswer_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, LaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchAnswer_LaunchAttrNames(), ecorePackage.getEString(), "launchAttrNames", null, 0, -1, LaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchAnswer_LaunchAttrValues(), ecorePackage.getEString(), "launchAttrValues", null, 0, -1, LaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launchProposalEClass, LaunchProposal.class, "LaunchProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(launchEventEClass, LaunchEvent.class, "LaunchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaunchEvent_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, LaunchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchEvent_LaunchAttrNames(), ecorePackage.getEString(), "launchAttrNames", null, 0, -1, LaunchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchEvent_LaunchAttrValues(), ecorePackage.getEString(), "launchAttrValues", null, 0, -1, LaunchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchEvent_ConsoleOutput(), ecorePackage.getEString(), "consoleOutput", null, 0, -1, LaunchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchEvent_ConsoleOutputSizeMeasure(), ecorePackage.getEInt(), "consoleOutputSizeMeasure", null, 0, 1, LaunchEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getLaunchEvent__GetAllConsoleOutput(), ecorePackage.getEString(), "getAllConsoleOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// no.hal.learning.exercise.views.ExerciseView
		createNoAnnotations();
		// no.hal.emf.ui.parts.plot.IValueProvider
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
		  (getSourceFileEditEvent_SizeMeasure(), 
		   source, 
		   new String[] {
			 "dashes", "_ "
		   });	
		addAnnotation
		  (getSourceFileEditEvent_ErrorCount(), 
		   source, 
		   new String[] {
			 "dashes", "_ - "
		   });	
		addAnnotation
		  (getSourceFileEditEvent_WarningCount(), 
		   source, 
		   new String[] {
			 "dashes", "_ . "
		   });
	}

	/**
	 * Initializes the annotations for <b>no.hal.emf.ui.parts.plot.IValueProvider</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNo_1Annotations() {
		String source = "no.hal.emf.ui.parts.plot.IValueProvider";	
		addAnnotation
		  (getSourceFileEditEvent_SizeMeasure(), 
		   source, 
		   new String[] {
			 "priority", "3"
		   });
	}

} //WorkspacePackageImpl
