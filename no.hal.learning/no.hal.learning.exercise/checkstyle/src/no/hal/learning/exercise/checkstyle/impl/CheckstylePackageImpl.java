/**
 */
package no.hal.learning.exercise.checkstyle.impl;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.checkstyle.CheckstyleAnswer;
import no.hal.learning.exercise.checkstyle.CheckstyleFactory;
import no.hal.learning.exercise.checkstyle.CheckstylePackage;
import no.hal.learning.exercise.checkstyle.CheckstyleProposal;

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
public class CheckstylePackageImpl extends EPackageImpl implements CheckstylePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkstyleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkstyleProposalEClass = null;

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
	 * @see no.hal.learning.exercise.checkstyle.CheckstylePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CheckstylePackageImpl() {
		super(eNS_URI, CheckstyleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CheckstylePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CheckstylePackage init() {
		if (isInited) return (CheckstylePackage)EPackage.Registry.INSTANCE.getEPackage(CheckstylePackage.eNS_URI);

		// Obtain or create and register package
		CheckstylePackageImpl theCheckstylePackage = (CheckstylePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CheckstylePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CheckstylePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExercisePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCheckstylePackage.createPackageContents();

		// Initialize created meta-data
		theCheckstylePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCheckstylePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CheckstylePackage.eNS_URI, theCheckstylePackage);
		return theCheckstylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckstyleAnswer() {
		return checkstyleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckstyleAnswer_ClassNames() {
		return (EAttribute)checkstyleAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckstyleAnswer_StyleName() {
		return (EAttribute)checkstyleAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckstyleProposal() {
		return checkstyleProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckstyleFactory getCheckstyleFactory() {
		return (CheckstyleFactory)getEFactoryInstance();
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
		checkstyleAnswerEClass = createEClass(CHECKSTYLE_ANSWER);
		createEAttribute(checkstyleAnswerEClass, CHECKSTYLE_ANSWER__CLASS_NAMES);
		createEAttribute(checkstyleAnswerEClass, CHECKSTYLE_ANSWER__STYLE_NAME);

		checkstyleProposalEClass = createEClass(CHECKSTYLE_PROPOSAL);
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
		checkstyleAnswerEClass.getESuperTypes().add(theExercisePackage.getTaskAnswer());
		EGenericType g1 = createEGenericType(theExercisePackage.getTaskProposal());
		EGenericType g2 = createEGenericType(this.getCheckstyleAnswer());
		g1.getETypeArguments().add(g2);
		checkstyleProposalEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(checkstyleAnswerEClass, CheckstyleAnswer.class, "CheckstyleAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckstyleAnswer_ClassNames(), ecorePackage.getEString(), "classNames", null, 0, -1, CheckstyleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckstyleAnswer_StyleName(), ecorePackage.getEString(), "styleName", null, 0, 1, CheckstyleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkstyleProposalEClass, CheckstyleProposal.class, "CheckstyleProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CheckstylePackageImpl
