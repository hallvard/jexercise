/**
 */
package no.hal.learning.exercise.jdt.impl;

import java.util.Map;
import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.jdt.JdtSourceEditProposal;
import no.hal.learning.exercise.workspace.WorkspacePackage;
import no.hal.learning.fv.FvPackage;
import no.hal.learning.exercise.jdt.JdtMarkerInfo;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchEvent;
import no.hal.learning.exercise.jdt.JdtLaunchProposal;
import no.hal.learning.exercise.jdt.JdtPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JdtPackageImpl extends EPackageImpl implements JdtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtSourceEditAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtSourceEditProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToFeatureValuedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtSourceEditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtMarkerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtLaunchAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtLaunchProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtLaunchEventEClass = null;

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
	 * @see no.hal.learning.exercise.jdt.JdtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JdtPackageImpl() {
		super(eNS_URI, JdtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JdtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JdtPackage init() {
		if (isInited) return (JdtPackage)EPackage.Registry.INSTANCE.getEPackage(JdtPackage.eNS_URI);

		// Obtain or create and register package
		JdtPackageImpl theJdtPackage = (JdtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JdtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JdtPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WorkspacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJdtPackage.createPackageContents();

		// Initialize created meta-data
		theJdtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJdtPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JdtPackage.eNS_URI, theJdtPackage);
		return theJdtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtSourceEditAnswer() {
		return jdtSourceEditAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtSourceEditAnswer_ClassName() {
		return (EAttribute)jdtSourceEditAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtSourceEditAnswer_MethodNames() {
		return (EAttribute)jdtSourceEditAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtSourceEditProposal() {
		return jdtSourceEditProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToFeatureValued() {
		return stringToFeatureValuedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToFeatureValued_Key() {
		return (EAttribute)stringToFeatureValuedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToFeatureValued_Value() {
		return (EReference)stringToFeatureValuedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtSourceEditEvent() {
		return jdtSourceEditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJdtSourceEditEvent_Metrics() {
		return (EReference)jdtSourceEditEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtMarkerInfo() {
		return jdtMarkerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtMarkerInfo_ProblemCategory() {
		return (EAttribute)jdtMarkerInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtMarkerInfo_ProblemType() {
		return (EAttribute)jdtMarkerInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtLaunchAnswer() {
		return jdtLaunchAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtLaunchAnswer_ClassName() {
		return (EAttribute)jdtLaunchAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtLaunchProposal() {
		return jdtLaunchProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJdtLaunchEvent() {
		return jdtLaunchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtFactory getJdtFactory() {
		return (JdtFactory)getEFactoryInstance();
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
		jdtSourceEditAnswerEClass = createEClass(JDT_SOURCE_EDIT_ANSWER);
		createEAttribute(jdtSourceEditAnswerEClass, JDT_SOURCE_EDIT_ANSWER__CLASS_NAME);
		createEAttribute(jdtSourceEditAnswerEClass, JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES);

		jdtSourceEditProposalEClass = createEClass(JDT_SOURCE_EDIT_PROPOSAL);

		stringToFeatureValuedEClass = createEClass(STRING_TO_FEATURE_VALUED);
		createEAttribute(stringToFeatureValuedEClass, STRING_TO_FEATURE_VALUED__KEY);
		createEReference(stringToFeatureValuedEClass, STRING_TO_FEATURE_VALUED__VALUE);

		jdtSourceEditEventEClass = createEClass(JDT_SOURCE_EDIT_EVENT);
		createEReference(jdtSourceEditEventEClass, JDT_SOURCE_EDIT_EVENT__METRICS);

		jdtMarkerInfoEClass = createEClass(JDT_MARKER_INFO);
		createEAttribute(jdtMarkerInfoEClass, JDT_MARKER_INFO__PROBLEM_CATEGORY);
		createEAttribute(jdtMarkerInfoEClass, JDT_MARKER_INFO__PROBLEM_TYPE);

		jdtLaunchAnswerEClass = createEClass(JDT_LAUNCH_ANSWER);
		createEAttribute(jdtLaunchAnswerEClass, JDT_LAUNCH_ANSWER__CLASS_NAME);

		jdtLaunchProposalEClass = createEClass(JDT_LAUNCH_PROPOSAL);

		jdtLaunchEventEClass = createEClass(JDT_LAUNCH_EVENT);
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
		FvPackage theFvPackage = (FvPackage)EPackage.Registry.INSTANCE.getEPackage(FvPackage.eNS_URI);
		WorkspacePackage theWorkspacePackage = (WorkspacePackage)EPackage.Registry.INSTANCE.getEPackage(WorkspacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jdtSourceEditAnswerEClass.getESuperTypes().add(theExercisePackage.getStringEditAnswer());
		EGenericType g1 = createEGenericType(theExercisePackage.getStringEditTaskProposal());
		EGenericType g2 = createEGenericType(this.getJdtSourceEditAnswer());
		g1.getETypeArguments().add(g2);
		jdtSourceEditProposalEClass.getEGenericSuperTypes().add(g1);
		jdtSourceEditEventEClass.getESuperTypes().add(theWorkspacePackage.getSourceFileEditEvent());
		jdtMarkerInfoEClass.getESuperTypes().add(theExercisePackage.getMarkerInfo());
		jdtLaunchAnswerEClass.getESuperTypes().add(theWorkspacePackage.getLaunchAnswer());
		g1 = createEGenericType(theWorkspacePackage.getLaunchProposal());
		g2 = createEGenericType(this.getJdtLaunchAnswer());
		g1.getETypeArguments().add(g2);
		jdtLaunchProposalEClass.getEGenericSuperTypes().add(g1);
		jdtLaunchEventEClass.getESuperTypes().add(theWorkspacePackage.getLaunchEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(jdtSourceEditAnswerEClass, JdtSourceEditAnswer.class, "JdtSourceEditAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtSourceEditAnswer_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, JdtSourceEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtSourceEditAnswer_MethodNames(), ecorePackage.getEString(), "methodNames", null, 0, -1, JdtSourceEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtSourceEditProposalEClass, JdtSourceEditProposal.class, "JdtSourceEditProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringToFeatureValuedEClass, Map.Entry.class, "StringToFeatureValued", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToFeatureValued_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToFeatureValued_Value(), theFvPackage.getFeatureValued(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtSourceEditEventEClass, JdtSourceEditEvent.class, "JdtSourceEditEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJdtSourceEditEvent_Metrics(), this.getStringToFeatureValued(), null, "metrics", null, 0, -1, JdtSourceEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtMarkerInfoEClass, JdtMarkerInfo.class, "JdtMarkerInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtMarkerInfo_ProblemCategory(), ecorePackage.getEInt(), "problemCategory", null, 0, 1, JdtMarkerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtMarkerInfo_ProblemType(), ecorePackage.getEInt(), "problemType", null, 0, 1, JdtMarkerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtLaunchAnswerEClass, JdtLaunchAnswer.class, "JdtLaunchAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtLaunchAnswer_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, JdtLaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtLaunchProposalEClass, JdtLaunchProposal.class, "JdtLaunchProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jdtLaunchEventEClass, JdtLaunchEvent.class, "JdtLaunchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// exp4j
		createExp4jAnnotations();
		// no.hal.learning.exercise.MarkerInfo
		createNoAnnotations();
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
		  (jdtSourceEditEventEClass, 
		   source, 
		   new String[] {
			 "codeIssues", "errorCount * 5 + warningCount"
		   });
	}

	/**
	 * Initializes the annotations for <b>no.hal.learning.exercise.MarkerInfo</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNoAnnotations() {
		String source = "no.hal.learning.exercise.MarkerInfo";	
		addAnnotation
		  (getJdtMarkerInfo_ProblemCategory(), 
		   source, 
		   new String[] {
			 "valueClass", "org.eclipse.jdt.core.compiler.CategorizedProblem",
			 "fieldPattern", "CAT_.*"
		   });	
		addAnnotation
		  (getJdtMarkerInfo_ProblemType(), 
		   source, 
		   new String[] {
			 "valueClass", "org.eclipse.jdt.core.compiler.IProblem"
		   });
	}

} //JdtPackageImpl
