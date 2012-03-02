/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.util;

import java.util.Map;

import no.hal.jex.*;
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

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
		return validate_EveryDefaultConstraint(javaClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaField(JavaField javaField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaMethod(JavaMethod javaMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(member, diagnostics, context);
	}

	// utility methods

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
		if (!validate_NoCircularContainment(javaRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaRequirement_NonNullJavaElement(javaRequirement, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJUnitTest(JUnitTest jUnitTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jUnitTest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jUnitTest, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaRequirement_NonNullJavaElement(jUnitTest, diagnostics, context);
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
		return validate_EveryDefaultConstraint(testRunnable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaClassTester(JavaClassTester javaClassTester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaClassTester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaMethodTester(JavaMethodTester javaMethodTester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaMethodTester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestSuite(TestSuite testSuite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testSuite, diagnostics, context);
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
