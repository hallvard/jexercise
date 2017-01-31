/**
 */
package no.hal.learning.exercise.jdt.impl;

import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.jdt.JdtSourceEditProposal;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchEvent;
import no.hal.learning.exercise.jdt.JdtLaunchProposal;
import no.hal.learning.exercise.jdt.JdtPackage;

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
	private EClass jdtSourceEditEventEClass = null;

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
		ExercisePackage.eINSTANCE.eClass();

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
	public EClass getJdtSourceEditEvent() {
		return jdtSourceEditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtSourceEditEvent_SourceCode() {
		return (EAttribute)jdtSourceEditEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtSourceEditEvent_SizeMeasure() {
		return (EAttribute)jdtSourceEditEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtSourceEditEvent_ErrorCount() {
		return (EAttribute)jdtSourceEditEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtSourceEditEvent_WarningCount() {
		return (EAttribute)jdtSourceEditEventEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getJdtLaunchAnswer_Mode() {
		return (EAttribute)jdtLaunchAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtLaunchAnswer_ClassName() {
		return (EAttribute)jdtLaunchAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtLaunchAnswer_LaunchAttrNames() {
		return (EAttribute)jdtLaunchAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJdtLaunchAnswer_LaunchAttrValues() {
		return (EAttribute)jdtLaunchAnswerEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getJdtLaunchEvent_Mode() {
		return (EAttribute)jdtLaunchEventEClass.getEStructuralFeatures().get(0);
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

		jdtSourceEditEventEClass = createEClass(JDT_SOURCE_EDIT_EVENT);
		createEAttribute(jdtSourceEditEventEClass, JDT_SOURCE_EDIT_EVENT__SOURCE_CODE);
		createEAttribute(jdtSourceEditEventEClass, JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE);
		createEAttribute(jdtSourceEditEventEClass, JDT_SOURCE_EDIT_EVENT__ERROR_COUNT);
		createEAttribute(jdtSourceEditEventEClass, JDT_SOURCE_EDIT_EVENT__WARNING_COUNT);

		jdtLaunchAnswerEClass = createEClass(JDT_LAUNCH_ANSWER);
		createEAttribute(jdtLaunchAnswerEClass, JDT_LAUNCH_ANSWER__MODE);
		createEAttribute(jdtLaunchAnswerEClass, JDT_LAUNCH_ANSWER__CLASS_NAME);
		createEAttribute(jdtLaunchAnswerEClass, JDT_LAUNCH_ANSWER__LAUNCH_ATTR_NAMES);
		createEAttribute(jdtLaunchAnswerEClass, JDT_LAUNCH_ANSWER__LAUNCH_ATTR_VALUES);

		jdtLaunchProposalEClass = createEClass(JDT_LAUNCH_PROPOSAL);

		jdtLaunchEventEClass = createEClass(JDT_LAUNCH_EVENT);
		createEAttribute(jdtLaunchEventEClass, JDT_LAUNCH_EVENT__MODE);
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
		jdtSourceEditAnswerEClass.getESuperTypes().add(theExercisePackage.getStringEditAnswer());
		EGenericType g1 = createEGenericType(theExercisePackage.getStringEditTaskProposal());
		EGenericType g2 = createEGenericType(this.getJdtSourceEditAnswer());
		g1.getETypeArguments().add(g2);
		jdtSourceEditProposalEClass.getEGenericSuperTypes().add(g1);
		jdtSourceEditEventEClass.getESuperTypes().add(theExercisePackage.getAbstractStringEditEvent());
		jdtLaunchAnswerEClass.getESuperTypes().add(theExercisePackage.getTaskAnswer());
		g1 = createEGenericType(theExercisePackage.getTaskProposal());
		g2 = createEGenericType(this.getJdtLaunchAnswer());
		g1.getETypeArguments().add(g2);
		jdtLaunchProposalEClass.getEGenericSuperTypes().add(g1);
		jdtLaunchEventEClass.getESuperTypes().add(theExercisePackage.getTaskEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(jdtSourceEditAnswerEClass, JdtSourceEditAnswer.class, "JdtSourceEditAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtSourceEditAnswer_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, JdtSourceEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtSourceEditAnswer_MethodNames(), ecorePackage.getEString(), "methodNames", null, 0, -1, JdtSourceEditAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtSourceEditProposalEClass, JdtSourceEditProposal.class, "JdtSourceEditProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jdtSourceEditEventEClass, JdtSourceEditEvent.class, "JdtSourceEditEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtSourceEditEvent_SourceCode(), ecorePackage.getEString(), "sourceCode", null, 0, 1, JdtSourceEditEvent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtSourceEditEvent_SizeMeasure(), ecorePackage.getEInt(), "sizeMeasure", null, 0, 1, JdtSourceEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtSourceEditEvent_ErrorCount(), ecorePackage.getEInt(), "errorCount", null, 0, 1, JdtSourceEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtSourceEditEvent_WarningCount(), ecorePackage.getEInt(), "warningCount", null, 0, 1, JdtSourceEditEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtLaunchAnswerEClass, JdtLaunchAnswer.class, "JdtLaunchAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtLaunchAnswer_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, JdtLaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtLaunchAnswer_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, JdtLaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtLaunchAnswer_LaunchAttrNames(), ecorePackage.getEString(), "launchAttrNames", null, 0, -1, JdtLaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJdtLaunchAnswer_LaunchAttrValues(), ecorePackage.getEString(), "launchAttrValues", null, 0, -1, JdtLaunchAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtLaunchProposalEClass, JdtLaunchProposal.class, "JdtLaunchProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jdtLaunchEventEClass, JdtLaunchEvent.class, "JdtLaunchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJdtLaunchEvent_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, JdtLaunchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// exp4j
		createExp4jAnnotations();
		// no.hal.learning.exercise.views.ExerciseView
		createNoAnnotations();
		// no.hal.emf.ui.parts.plot.IValueProvider
		createNo_1Annotations();
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
	 * Initializes the annotations for <b>no.hal.learning.exercise.views.ExerciseView</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNoAnnotations() {
		String source = "no.hal.learning.exercise.views.ExerciseView";	
		addAnnotation
		  (getJdtSourceEditEvent_SizeMeasure(), 
		   source, 
		   new String[] {
			 "dashes", "_ "
		   });	
		addAnnotation
		  (getJdtSourceEditEvent_ErrorCount(), 
		   source, 
		   new String[] {
			 "dashes", "_ - "
		   });	
		addAnnotation
		  (getJdtSourceEditEvent_WarningCount(), 
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
		  (getJdtSourceEditEvent_SizeMeasure(), 
		   source, 
		   new String[] {
			 "priority", "3"
		   });
	}

} //JdtPackageImpl
