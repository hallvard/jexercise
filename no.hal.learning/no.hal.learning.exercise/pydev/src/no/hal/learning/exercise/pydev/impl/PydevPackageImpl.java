/**
 */
package no.hal.learning.exercise.pydev.impl;

import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.exercise.pydev.PydevFactory;
import no.hal.learning.exercise.pydev.PydevLaunchAnswer;
import no.hal.learning.exercise.pydev.PydevLaunchEvent;
import no.hal.learning.exercise.pydev.PydevLaunchProposal;
import no.hal.learning.exercise.pydev.PydevMarkerInfo;
import no.hal.learning.exercise.pydev.PydevPackage;
import no.hal.learning.exercise.pydev.PydevSourceEditAnswer;
import no.hal.learning.exercise.pydev.PydevSourceEditEvent;
import no.hal.learning.exercise.pydev.PydevSourceEditProposal;

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
public class PydevPackageImpl extends EPackageImpl implements PydevPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevSourceEditAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevSourceEditProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevSourceEditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevMarkerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevLaunchAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevLaunchProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pydevLaunchEventEClass = null;

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
	 * @see no.hal.learning.exercise.pydev.PydevPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PydevPackageImpl() {
		super(eNS_URI, PydevFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PydevPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PydevPackage init() {
		if (isInited) return (PydevPackage)EPackage.Registry.INSTANCE.getEPackage(PydevPackage.eNS_URI);

		// Obtain or create and register package
		PydevPackageImpl thePydevPackage = (PydevPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PydevPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PydevPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WorkspacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePydevPackage.createPackageContents();

		// Initialize created meta-data
		thePydevPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePydevPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PydevPackage.eNS_URI, thePydevPackage);
		return thePydevPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevSourceEditAnswer() {
		return pydevSourceEditAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPydevSourceEditAnswer_ModuleName() {
		return (EAttribute)pydevSourceEditAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevSourceEditProposal() {
		return pydevSourceEditProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevSourceEditEvent() {
		return pydevSourceEditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevMarkerInfo() {
		return pydevMarkerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevLaunchAnswer() {
		return pydevLaunchAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPydevLaunchAnswer_ModuleName() {
		return (EAttribute)pydevLaunchAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevLaunchProposal() {
		return pydevLaunchProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPydevLaunchEvent() {
		return pydevLaunchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevFactory getPydevFactory() {
		return (PydevFactory)getEFactoryInstance();
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
		pydevSourceEditAnswerEClass = createEClass(PYDEV_SOURCE_EDIT_ANSWER);
		createEAttribute(pydevSourceEditAnswerEClass, PYDEV_SOURCE_EDIT_ANSWER__MODULE_NAME);

		pydevSourceEditProposalEClass = createEClass(PYDEV_SOURCE_EDIT_PROPOSAL);

		pydevSourceEditEventEClass = createEClass(PYDEV_SOURCE_EDIT_EVENT);

		pydevMarkerInfoEClass = createEClass(PYDEV_MARKER_INFO);

		pydevLaunchAnswerEClass = createEClass(PYDEV_LAUNCH_ANSWER);
		createEAttribute(pydevLaunchAnswerEClass, PYDEV_LAUNCH_ANSWER__MODULE_NAME);

		pydevLaunchProposalEClass = createEClass(PYDEV_LAUNCH_PROPOSAL);

		pydevLaunchEventEClass = createEClass(PYDEV_LAUNCH_EVENT);
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
		WorkspacePackage theWorkspacePackage = (WorkspacePackage)EPackage.Registry.INSTANCE.getEPackage(WorkspacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pydevSourceEditAnswerEClass.getESuperTypes().add(theExercisePackage.getStringEditAnswer());
		EGenericType g1 = createEGenericType(theExercisePackage.getStringEditTaskProposal());
		EGenericType g2 = createEGenericType(this.getPydevSourceEditAnswer());
		g1.getETypeArguments().add(g2);
		pydevSourceEditProposalEClass.getEGenericSuperTypes().add(g1);
		pydevSourceEditEventEClass.getESuperTypes().add(theWorkspacePackage.getSourceFileEditEvent());
		pydevMarkerInfoEClass.getESuperTypes().add(theExercisePackage.getMarkerInfo());
		pydevLaunchAnswerEClass.getESuperTypes().add(theWorkspacePackage.getLaunchAnswer());
		g1 = createEGenericType(theWorkspacePackage.getLaunchProposal());
		g2 = createEGenericType(this.getPydevLaunchAnswer());
		g1.getETypeArguments().add(g2);
		pydevLaunchProposalEClass.getEGenericSuperTypes().add(g1);
		pydevLaunchEventEClass.getESuperTypes().add(theWorkspacePackage.getLaunchEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(pydevSourceEditAnswerEClass, PydevSourceEditAnswer.class, "PydevSourceEditAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPydevSourceEditAnswer_ModuleName(), ecorePackage.getEString(), "moduleName", null, 0, 1, PydevSourceEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pydevSourceEditProposalEClass, PydevSourceEditProposal.class, "PydevSourceEditProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pydevSourceEditEventEClass, PydevSourceEditEvent.class, "PydevSourceEditEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pydevMarkerInfoEClass, PydevMarkerInfo.class, "PydevMarkerInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pydevLaunchAnswerEClass, PydevLaunchAnswer.class, "PydevLaunchAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPydevLaunchAnswer_ModuleName(), ecorePackage.getEString(), "moduleName", null, 0, 1, PydevLaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pydevLaunchProposalEClass, PydevLaunchProposal.class, "PydevLaunchProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pydevLaunchEventEClass, PydevLaunchEvent.class, "PydevLaunchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// exp4j
		createExp4jAnnotations();
	}

	/**
	 * Initializes the annotations for <b>exp4j</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExp4jAnnotations() {
		String source = "exp4j";	
		addAnnotation
		  (pydevSourceEditEventEClass, 
		   source, 
		   new String[] {
			 "codeIssues", "errorCount * 5 + warningCount"
		   });
	}

} //PydevPackageImpl
