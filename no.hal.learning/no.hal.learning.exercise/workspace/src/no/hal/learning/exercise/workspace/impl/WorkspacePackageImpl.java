/**
 */
package no.hal.learning.exercise.workspace.impl;

import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.exercise.workspace.SourceFileEditProposal;
import no.hal.learning.exercise.workspace.WorkspaceFactory;
import no.hal.learning.exercise.workspace.WorkspacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

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
	public EAttribute getSourceFileEditEvent_SourceCode() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_SizeMeasure() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_ErrorCount() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFileEditEvent_WarningCount() {
		return (EAttribute)sourceFileEditEventEClass.getEStructuralFeatures().get(3);
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
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__SOURCE_CODE);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__ERROR_COUNT);
		createEAttribute(sourceFileEditEventEClass, SOURCE_FILE_EDIT_EVENT__WARNING_COUNT);
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
		sourceFileEditAnswerEClass.getESuperTypes().add(theExercisePackage.getStringEditAnswer());
		EGenericType g1 = createEGenericType(theExercisePackage.getStringEditTaskProposal());
		EGenericType g2 = createEGenericType(this.getSourceFileEditAnswer());
		g1.getETypeArguments().add(g2);
		sourceFileEditProposalEClass.getEGenericSuperTypes().add(g1);
		sourceFileEditEventEClass.getESuperTypes().add(theExercisePackage.getAbstractStringEditEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceFileEditAnswerEClass, SourceFileEditAnswer.class, "SourceFileEditAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFileEditAnswer_ResourcePath(), ecorePackage.getEString(), "resourcePath", null, 0, 1, SourceFileEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFileEditProposalEClass, SourceFileEditProposal.class, "SourceFileEditProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceFileEditEventEClass, SourceFileEditEvent.class, "SourceFileEditEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceFileEditEvent_SourceCode(), ecorePackage.getEString(), "sourceCode", null, 0, 1, SourceFileEditEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_SizeMeasure(), ecorePackage.getEInt(), "sizeMeasure", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_ErrorCount(), ecorePackage.getEInt(), "errorCount", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFileEditEvent_WarningCount(), ecorePackage.getEInt(), "warningCount", null, 0, 1, SourceFileEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
