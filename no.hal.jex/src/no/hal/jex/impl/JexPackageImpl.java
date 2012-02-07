/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.ClassKind;
import no.hal.jex.Exercise;
import no.hal.jex.ExercisePart;
import no.hal.jex.JUnitTest;
import no.hal.jex.JUnitTestStatus;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaPack;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.Requirement;
import no.hal.jex.TestRunnable;
import no.hal.jex.TestSuite;
import no.hal.jex.util.JexValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JexPackageImpl extends EPackageImpl implements JexPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaPackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jUnitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

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
	private EClass exercisePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaClassTesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMethodTesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jUnitTestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType declarationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modifiersEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaCoreProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaCoreElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType featuresEDataType = null;

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
	 * @see no.hal.jex.JexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JexPackageImpl() {
		super(eNS_URI, JexFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JexPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JexPackage init() {
		if (isInited) return (JexPackage)EPackage.Registry.INSTANCE.getEPackage(JexPackage.eNS_URI);

		// Obtain or create and register package
		JexPackageImpl theJexPackage = (JexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JexPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJexPackage.createPackageContents();

		// Initialize created meta-data
		theJexPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theJexPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return JexValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theJexPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JexPackage.eNS_URI, theJexPackage);
		return theJexPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaPack() {
		return javaPackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaPack_Name() {
		return (EAttribute)javaPackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaPack_Classes() {
		return (EReference)javaPackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaPack_SourceLocation() {
		return (EAttribute)javaPackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaClass() {
		return javaClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaClass_ClassKind() {
		return (EAttribute)javaClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaClass_Members() {
		return (EReference)javaClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaClass_Pack() {
		return (EReference)javaClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaClass_Superclasses() {
		return (EAttribute)javaClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaField() {
		return javaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaField_Type() {
		return (EAttribute)javaFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaMethod() {
		return javaMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMethod_ReturnType() {
		return (EAttribute)javaMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMethod_Parameters() {
		return (EAttribute)javaMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMethod_Throwables() {
		return (EAttribute)javaMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Name() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Modifiers() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Owner() {
		return (EReference)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Required() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaElement() {
		return javaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaElement_Present() {
		return (EAttribute)javaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaElement_Time() {
		return (EAttribute)javaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaRequirement() {
		return javaRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRequirement_JavaElement() {
		return (EReference)javaRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaRequirement_RequiredFeatures() {
		return (EAttribute)javaRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJUnitTest() {
		return jUnitTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJUnitTest_TestRunnable() {
		return (EReference)jUnitTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJUnitTest_Points() {
		return (EAttribute)jUnitTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJUnitTest_TestStatus() {
		return (EAttribute)jUnitTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Satisfied() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Time() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
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
	public EClass getExercisePart() {
		return exercisePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRequirement() {
		return abstractRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRequirement_Text() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRequirement_Description() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRequirement_Comment() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_JavaElements() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_Requirements() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_Parent() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRequirement_ChildrenSatisfied() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunnable() {
		return testRunnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRunnable_TestedElement() {
		return (EReference)testRunnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaClassTester() {
		return javaClassTesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaMethodTester() {
		return javaMethodTesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuite() {
		return testSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_TestRuns() {
		return (EReference)testSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassKind() {
		return classKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJUnitTestStatus() {
		return jUnitTestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeclarationType() {
		return declarationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModifiers() {
		return modifiersEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassName() {
		return classNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaCoreProject() {
		return javaCoreProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaCoreElement() {
		return javaCoreElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFeatures() {
		return featuresEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexFactory getJexFactory() {
		return (JexFactory)getEFactoryInstance();
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
		javaPackEClass = createEClass(JAVA_PACK);
		createEAttribute(javaPackEClass, JAVA_PACK__NAME);
		createEReference(javaPackEClass, JAVA_PACK__CLASSES);
		createEAttribute(javaPackEClass, JAVA_PACK__SOURCE_LOCATION);

		javaClassEClass = createEClass(JAVA_CLASS);
		createEAttribute(javaClassEClass, JAVA_CLASS__CLASS_KIND);
		createEReference(javaClassEClass, JAVA_CLASS__MEMBERS);
		createEReference(javaClassEClass, JAVA_CLASS__PACK);
		createEAttribute(javaClassEClass, JAVA_CLASS__SUPERCLASSES);

		javaFieldEClass = createEClass(JAVA_FIELD);
		createEAttribute(javaFieldEClass, JAVA_FIELD__TYPE);

		javaMethodEClass = createEClass(JAVA_METHOD);
		createEAttribute(javaMethodEClass, JAVA_METHOD__RETURN_TYPE);
		createEAttribute(javaMethodEClass, JAVA_METHOD__PARAMETERS);
		createEAttribute(javaMethodEClass, JAVA_METHOD__THROWABLES);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__NAME);
		createEAttribute(memberEClass, MEMBER__MODIFIERS);
		createEReference(memberEClass, MEMBER__OWNER);
		createEAttribute(memberEClass, MEMBER__REQUIRED);

		javaElementEClass = createEClass(JAVA_ELEMENT);
		createEAttribute(javaElementEClass, JAVA_ELEMENT__PRESENT);
		createEAttribute(javaElementEClass, JAVA_ELEMENT__TIME);

		javaRequirementEClass = createEClass(JAVA_REQUIREMENT);
		createEReference(javaRequirementEClass, JAVA_REQUIREMENT__JAVA_ELEMENT);
		createEAttribute(javaRequirementEClass, JAVA_REQUIREMENT__REQUIRED_FEATURES);

		jUnitTestEClass = createEClass(JUNIT_TEST);
		createEReference(jUnitTestEClass, JUNIT_TEST__TEST_RUNNABLE);
		createEAttribute(jUnitTestEClass, JUNIT_TEST__POINTS);
		createEAttribute(jUnitTestEClass, JUNIT_TEST__TEST_STATUS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__SATISFIED);
		createEAttribute(requirementEClass, REQUIREMENT__TIME);

		exerciseEClass = createEClass(EXERCISE);

		exercisePartEClass = createEClass(EXERCISE_PART);

		abstractRequirementEClass = createEClass(ABSTRACT_REQUIREMENT);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__TEXT);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__DESCRIPTION);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__COMMENT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__JAVA_ELEMENTS);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__REQUIREMENTS);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__PARENT);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED);

		testRunnableEClass = createEClass(TEST_RUNNABLE);
		createEReference(testRunnableEClass, TEST_RUNNABLE__TESTED_ELEMENT);

		javaClassTesterEClass = createEClass(JAVA_CLASS_TESTER);

		javaMethodTesterEClass = createEClass(JAVA_METHOD_TESTER);

		testSuiteEClass = createEClass(TEST_SUITE);
		createEReference(testSuiteEClass, TEST_SUITE__TEST_RUNS);

		// Create enums
		classKindEEnum = createEEnum(CLASS_KIND);
		jUnitTestStatusEEnum = createEEnum(JUNIT_TEST_STATUS);

		// Create data types
		declarationTypeEDataType = createEDataType(DECLARATION_TYPE);
		modifiersEDataType = createEDataType(MODIFIERS);
		classNameEDataType = createEDataType(CLASS_NAME);
		javaCoreProjectEDataType = createEDataType(JAVA_CORE_PROJECT);
		javaCoreElementEDataType = createEDataType(JAVA_CORE_ELEMENT);
		featuresEDataType = createEDataType(FEATURES);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		javaPackEClass.getESuperTypes().add(this.getJavaElement());
		javaClassEClass.getESuperTypes().add(this.getMember());
		javaFieldEClass.getESuperTypes().add(this.getMember());
		javaMethodEClass.getESuperTypes().add(this.getMember());
		memberEClass.getESuperTypes().add(this.getJavaElement());
		javaRequirementEClass.getESuperTypes().add(this.getRequirement());
		jUnitTestEClass.getESuperTypes().add(this.getJavaRequirement());
		requirementEClass.getESuperTypes().add(this.getAbstractRequirement());
		exerciseEClass.getESuperTypes().add(this.getAbstractRequirement());
		exercisePartEClass.getESuperTypes().add(this.getAbstractRequirement());
		testRunnableEClass.getESuperTypes().add(this.getMember());
		javaClassTesterEClass.getESuperTypes().add(this.getJavaClass());
		javaClassTesterEClass.getESuperTypes().add(this.getTestRunnable());
		javaMethodTesterEClass.getESuperTypes().add(this.getJavaMethod());
		javaMethodTesterEClass.getESuperTypes().add(this.getTestRunnable());
		testSuiteEClass.getESuperTypes().add(this.getJavaClass());
		testSuiteEClass.getESuperTypes().add(this.getTestRunnable());

		// Initialize classes and features; add operations and parameters
		initEClass(javaPackEClass, JavaPack.class, "JavaPack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaPack_Name(), ecorePackage.getEString(), "name", null, 0, 1, JavaPack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaPack_Classes(), this.getJavaClass(), this.getJavaClass_Pack(), "classes", null, 0, -1, JavaPack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaPack_SourceLocation(), ecorePackage.getEString(), "sourceLocation", null, 0, 1, JavaPack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaClassEClass, JavaClass.class, "JavaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaClass_ClassKind(), this.getClassKind(), "classKind", null, 0, 1, JavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaClass_Members(), this.getMember(), this.getMember_Owner(), "members", null, 0, -1, JavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaClass_Pack(), this.getJavaPack(), this.getJavaPack_Classes(), "pack", null, 0, 1, JavaClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaClass_Superclasses(), this.getClassName(), "superclasses", null, 0, -1, JavaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaFieldEClass, JavaField.class, "JavaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaField_Type(), this.getDeclarationType(), "type", null, 0, 1, JavaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaMethodEClass, JavaMethod.class, "JavaMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaMethod_ReturnType(), this.getDeclarationType(), "returnType", null, 0, 1, JavaMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMethod_Parameters(), this.getDeclarationType(), "parameters", null, 0, -1, JavaMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMethod_Throwables(), this.getClassName(), "throwables", null, 0, -1, JavaMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Modifiers(), this.getModifiers(), "modifiers", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Owner(), this.getJavaClass(), this.getJavaClass_Members(), "owner", null, 0, 1, Member.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Required(), ecorePackage.getEBooleanObject(), "required", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaElementEClass, JavaElement.class, "JavaElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaElement_Present(), ecorePackage.getEBooleanObject(), "present", null, 0, 1, JavaElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaElement_Time(), ecorePackage.getELong(), "time", null, 0, 1, JavaElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(javaElementEClass, this.getJavaCoreElement(), "findJavaCoreElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaCoreProject(), "project", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(javaRequirementEClass, JavaRequirement.class, "JavaRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaRequirement_JavaElement(), this.getJavaElement(), null, "javaElement", null, 0, 1, JavaRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaRequirement_RequiredFeatures(), this.getFeatures(), "requiredFeatures", null, 0, 1, JavaRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jUnitTestEClass, JUnitTest.class, "JUnitTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJUnitTest_TestRunnable(), this.getTestRunnable(), null, "testRunnable", null, 0, 1, JUnitTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJUnitTest_Points(), ecorePackage.getEInt(), "points", null, 0, 1, JUnitTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJUnitTest_TestStatus(), ecorePackage.getEInt(), "testStatus", "-1", 0, 1, JUnitTest.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Satisfied(), ecorePackage.getEBooleanObject(), "satisfied", null, 0, 1, Requirement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Time(), ecorePackage.getELong(), "time", null, 0, 1, Requirement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(requirementEClass, ecorePackage.getEBooleanObject(), "validateRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaCoreProject(), "project", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exerciseEClass, Exercise.class, "Exercise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exercisePartEClass, ExercisePart.class, "ExercisePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRequirementEClass, AbstractRequirement.class, "AbstractRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractRequirement_Text(), ecorePackage.getEString(), "text", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRequirement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_JavaElements(), this.getJavaElement(), null, "javaElements", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_Requirements(), this.getAbstractRequirement(), this.getAbstractRequirement_Parent(), "requirements", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_Parent(), this.getAbstractRequirement(), this.getAbstractRequirement_Requirements(), "parent", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRequirement_ChildrenSatisfied(), ecorePackage.getEBooleanObject(), "childrenSatisfied", null, 0, 1, AbstractRequirement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testRunnableEClass, TestRunnable.class, "TestRunnable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRunnable_TestedElement(), this.getMember(), null, "testedElement", null, 0, 1, TestRunnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testRunnableEClass, this.getTestRunnable(), "getTestRuns", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(javaClassTesterEClass, JavaClassTester.class, "JavaClassTester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaMethodTesterEClass, JavaMethodTester.class, "JavaMethodTester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuite_TestRuns(), this.getTestRunnable(), null, "testRuns", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classKindEEnum, ClassKind.class, "ClassKind");
		addEEnumLiteral(classKindEEnum, ClassKind.CLASS_KIND);
		addEEnumLiteral(classKindEEnum, ClassKind.INTERFACE_KIND);
		addEEnumLiteral(classKindEEnum, ClassKind.ENUM_KIND);

		initEEnum(jUnitTestStatusEEnum, JUnitTestStatus.class, "JUnitTestStatus");
		addEEnumLiteral(jUnitTestStatusEEnum, JUnitTestStatus.UNDEFINED);
		addEEnumLiteral(jUnitTestStatusEEnum, JUnitTestStatus.OK);
		addEEnumLiteral(jUnitTestStatusEEnum, JUnitTestStatus.ERROR);
		addEEnumLiteral(jUnitTestStatusEEnum, JUnitTestStatus.FAILURE);

		// Initialize data types
		initEDataType(declarationTypeEDataType, String.class, "DeclarationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modifiersEDataType, int.class, "Modifiers", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classNameEDataType, String.class, "ClassName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaCoreProjectEDataType, IJavaProject.class, "JavaCoreProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaCoreElementEDataType, IJavaElement.class, "JavaCoreElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(featuresEDataType, String.class, "Features", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http:///no/hal/jex/JexMetaData
		createJexMetaDataAnnotations();
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
		  (memberEClass, 
		   source, 
		   new String[] {
			 "constraints", "JavaMemberExists CorrectModifiers CorrectTypes"
		   });		
		addAnnotation
		  (javaRequirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "NonNullJavaElement JavaRequirementSatisfied"
		   });		
		addAnnotation
		  (jUnitTestEClass, 
		   source, 
		   new String[] {
			 "constraints", "PositivePoints"
		   });				
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";					
		addAnnotation
		  (getAbstractRequirement_Description(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });			
		addAnnotation
		  (getAbstractRequirement_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http:///no/hal/jex/JexMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJexMetaDataAnnotations() {
		String source = "http:///no/hal/jex/JexMetaData";						
		addAnnotation
		  (getAbstractRequirement_Description(), 
		   source, 
		   new String[] {
			 "contentType", "text/html"
		   });			
		addAnnotation
		  (getAbstractRequirement_Comment(), 
		   source, 
		   new String[] {
			 "contentType", "text/html"
		   });
	}

} //JexPackageImpl
