/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.util;

import java.util.Map;

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
import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.Requirement;
import no.hal.jex.TestRunnable;
import no.hal.jex.TestSuite;
import no.hal.jex.resource.JexResource;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.jex.JexPackage
 * @generated
 */
public class JexValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JexValidator INSTANCE = new JexValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.jex";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return JexPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case JexPackage.JAVA_PACK:
				return validateJavaPack((JavaPack)value, diagnostics, context);
			case JexPackage.JAVA_CLASS:
				return validateJavaClass((JavaClass)value, diagnostics, context);
			case JexPackage.JAVA_FIELD:
				return validateJavaField((JavaField)value, diagnostics, context);
			case JexPackage.JAVA_METHOD:
				return validateJavaMethod((JavaMethod)value, diagnostics, context);
			case JexPackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case JexPackage.JAVA_ELEMENT:
				return validateJavaElement((JavaElement)value, diagnostics, context);
			case JexPackage.JAVA_REQUIREMENT:
				return validateJavaRequirement((JavaRequirement)value, diagnostics, context);
			case JexPackage.JUNIT_TEST:
				return validateJUnitTest((JUnitTest)value, diagnostics, context);
			case JexPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case JexPackage.EXERCISE:
				return validateExercise((Exercise)value, diagnostics, context);
			case JexPackage.EXERCISE_PART:
				return validateExercisePart((ExercisePart)value, diagnostics, context);
			case JexPackage.ABSTRACT_REQUIREMENT:
				return validateAbstractRequirement((AbstractRequirement)value, diagnostics, context);
			case JexPackage.TEST_RUNNABLE:
				return validateTestRunnable((TestRunnable)value, diagnostics, context);
			case JexPackage.JAVA_CLASS_TESTER:
				return validateJavaClassTester((JavaClassTester)value, diagnostics, context);
			case JexPackage.JAVA_METHOD_TESTER:
				return validateJavaMethodTester((JavaMethodTester)value, diagnostics, context);
			case JexPackage.TEST_SUITE:
				return validateTestSuite((TestSuite)value, diagnostics, context);
			case JexPackage.CLASS_KIND:
				return validateClassKind((ClassKind)value, diagnostics, context);
			case JexPackage.JUNIT_TEST_STATUS:
				return validateJUnitTestStatus((JUnitTestStatus)value, diagnostics, context);
			case JexPackage.DECLARATION_TYPE:
				return validateDeclarationType((String)value, diagnostics, context);
			case JexPackage.MODIFIERS:
				return validateModifiers((Integer)value, diagnostics, context);
			case JexPackage.CLASS_NAME:
				return validateClassName((String)value, diagnostics, context);
			case JexPackage.JAVA_CORE_PROJECT:
				return validateJavaCoreProject((IJavaProject)value, diagnostics, context);
			case JexPackage.JAVA_CORE_ELEMENT:
				return validateJavaCoreElement((IJavaElement)value, diagnostics, context);
			case JexPackage.FEATURES:
				return validateFeatures((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaPack(JavaPack javaPack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaPack, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaClass(JavaClass javaClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(javaClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(javaClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaField(JavaField javaField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(javaField, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(javaField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaMethod(JavaMethod javaMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(javaMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(javaMethod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(member, diagnostics, context);
		return result;
	}

	// utility methods
	
	/**
	 * Validates the JavaMemberExists constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMember_JavaMemberExists(Member member, DiagnosticChain diagnostics, Map<Object,Object> context) {
		if (! javaMemberExists(member)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "JavaMemberExists", getObjectLabel(member, context) }),
						 new Object[] { member }));
			}
			return false;
		}
		return true;
	}

	public static Boolean satisfiedAnd(Boolean b1, Boolean b2) {
		if (b1 == Boolean.FALSE || b2 == Boolean.FALSE) {
			return Boolean.FALSE;
		} else if (b1 == Boolean.TRUE && b2 == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		return null;
	}
	
	public static Boolean satisfiedOr(Boolean b1, Boolean b2) {
		if (b1 == Boolean.TRUE || b2 == Boolean.TRUE) {
			return Boolean.TRUE;
		} else if (b1 == Boolean.FALSE || b2 == Boolean.FALSE) {
			return Boolean.FALSE;
		}
		return null;
	}
	
	public static IJavaElement getJavaMember(Member member) {
		IJavaProject javaProject = JexResource.getJavaProject(member.eResource());
		return (javaProject != null ? member.findJavaCoreElement(javaProject) : null);
	}
	
	public static boolean javaMemberExists(Member member) {
		return getJavaMember(member) != null;
	}
	
	/**
	 * Validates the CorrectModifiers constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMember_CorrectModifiers(Member member, DiagnosticChain diagnostics, Map<Object,Object> context) {
		if (correctModifiers(member) != Boolean.TRUE) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "CorrectModifiers", getObjectLabel(member, context) }),
						 new Object[] { member }));
			}
			return false;
		}
		return true;
	}

	public static Boolean correctModifiers(Member member) {
		IJavaElement javaElement = getJavaMember(member);
		return (javaElement instanceof IMember ? member.validateModifiers((IMember)javaElement) : Boolean.TRUE);
	}
	
	/**
	 * Validates the CorrectTypes constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMember_CorrectTypes(Member member, DiagnosticChain diagnostics, Map<Object,Object> context) {
		if (correctTypes(member) != Boolean.TRUE) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "CorrectTypes", getObjectLabel(member, context) }),
						 new Object[] { member }));
			}
			return false;
		}
		return true;
	}

	public static Boolean correctTypes(Member javaMember) {
		IJavaElement coreElement = getJavaMember(javaMember);
		Boolean typesResult = Boolean.TRUE;
		if (javaMember instanceof JavaClass && coreElement instanceof IType) {
			if (! ((JavaClass)javaMember).getClassKind().isKind((IType)coreElement)) {
				typesResult = Boolean.FALSE;
			}
			typesResult = satisfiedAnd(typesResult, ((JavaClass)javaMember).validateSuperclasses((IType)coreElement));
		} else if (javaMember instanceof JavaMethod && coreElement instanceof IMethod) {
			typesResult = ((JavaMethod)javaMember).validateTypes((IMethod)coreElement);
		} else if (javaMember instanceof JavaField && coreElement instanceof IField) {
			typesResult = ((JavaField)javaMember).validateType((IField)coreElement);
		}
		return typesResult;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaElement(JavaElement javaElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaRequirement(JavaRequirement javaRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaRequirement_NonNullJavaElement(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaRequirement_JavaRequirementSatisfied(javaRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonNullJavaElement constraint of '<em>Java Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJavaRequirement_NonNullJavaElement(JavaRequirement javaRequirement, DiagnosticChain diagnostics, Map<Object,Object> context) {
		if (javaRequirement.getJavaElement() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "NonNullJavaElement", getObjectLabel(javaRequirement, context) }),
						 new Object[] { javaRequirement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the JavaRequirementSatisfied constraint of '<em>Java Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJavaRequirement_JavaRequirementSatisfied(JavaRequirement javaRequirement, DiagnosticChain diagnostics, Map<Object,Object> context) {
		if (javaRequirementSatisfied(javaRequirement, true, true) != Boolean.TRUE) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "JavaRequirementSatisfied", getObjectLabel(javaRequirement, context) }),
						 new Object[] { javaRequirement }));
			}
			return false;
		}
		return true;
	}

	public static Boolean javaRequirementSatisfied(JavaRequirement javaRequirement, boolean requireModifiers, boolean requireTypes) {
		JavaElement javaElement = javaRequirement.getJavaElement();
		if (! (javaElement instanceof Member)) {
			return Boolean.FALSE;
		}
		IJavaElement coreElement = getJavaMember((Member)javaElement);
		Member javaMember = (Member)javaElement;
		if (javaMember.getRequired() != Boolean.FALSE ? coreElement == null : coreElement != null) {
			return Boolean.FALSE;
		}
		Boolean modifierResult = (requireModifiers ? correctModifiers(javaMember) : Boolean.TRUE);
		Boolean typesResult = (requireTypes ? correctTypes(javaMember) : Boolean.TRUE);
		return satisfiedAnd(modifierResult, typesResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJUnitTest(JUnitTest jUnitTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaRequirement_NonNullJavaElement(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaRequirement_JavaRequirementSatisfied(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validateJUnitTest_PositivePoints(jUnitTest, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositivePoints constraint of '<em>JUnit Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateJUnitTest_PositivePoints(JUnitTest jUnitTest, DiagnosticChain diagnostics, Map<Object,Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (jUnitTest.getPoints() < 0) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PositivePoints", getObjectLabel(jUnitTest, context) },
						 new Object[] { jUnitTest },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExercise(Exercise exercise, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exercise, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExercisePart(ExercisePart exercisePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exercisePart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRequirement(AbstractRequirement abstractRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestRunnable(TestRunnable testRunnable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(testRunnable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(testRunnable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaClassTester(JavaClassTester javaClassTester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(javaClassTester, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(javaClassTester, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaMethodTester(JavaMethodTester javaMethodTester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(javaMethodTester, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(javaMethodTester, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestSuite(TestSuite testSuite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_JavaMemberExists(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectModifiers(testSuite, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_CorrectTypes(testSuite, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassKind(ClassKind classKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJUnitTestStatus(JUnitTestStatus jUnitTestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclarationType(String declarationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifiers(int modifiers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassName(String className, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaCoreProject(IJavaProject javaCoreProject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaCoreElement(IJavaElement javaCoreElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatures(String features, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //JexValidator
