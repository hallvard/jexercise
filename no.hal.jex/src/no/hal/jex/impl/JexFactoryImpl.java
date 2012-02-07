/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import no.hal.jex.ClassKind;
import no.hal.jex.Exercise;
import no.hal.jex.ExercisePart;
import no.hal.jex.JUnitTest;
import no.hal.jex.JUnitTestStatus;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaPack;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.TestSuite;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JexFactoryImpl extends EFactoryImpl implements JexFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JexFactory init() {
		try {
			JexFactory theJexFactory = (JexFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/plugin/no.hal.jex/model/jex.ecore"); 
			if (theJexFactory != null) {
				return theJexFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JexFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JexPackage.JAVA_PACK: return createJavaPack();
			case JexPackage.JAVA_CLASS: return createJavaClass();
			case JexPackage.JAVA_FIELD: return createJavaField();
			case JexPackage.JAVA_METHOD: return createJavaMethod();
			case JexPackage.JAVA_REQUIREMENT: return createJavaRequirement();
			case JexPackage.JUNIT_TEST: return createJUnitTest();
			case JexPackage.EXERCISE: return createExercise();
			case JexPackage.EXERCISE_PART: return createExercisePart();
			case JexPackage.JAVA_CLASS_TESTER: return createJavaClassTester();
			case JexPackage.JAVA_METHOD_TESTER: return createJavaMethodTester();
			case JexPackage.TEST_SUITE: return createTestSuite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JexPackage.CLASS_KIND:
				return createClassKindFromString(eDataType, initialValue);
			case JexPackage.JUNIT_TEST_STATUS:
				return createJUnitTestStatusFromString(eDataType, initialValue);
			case JexPackage.DECLARATION_TYPE:
				return createDeclarationTypeFromString(eDataType, initialValue);
			case JexPackage.MODIFIERS:
				return createModifiersFromString(eDataType, initialValue);
			case JexPackage.CLASS_NAME:
				return createClassNameFromString(eDataType, initialValue);
			case JexPackage.JAVA_CORE_PROJECT:
				return createJavaCoreProjectFromString(eDataType, initialValue);
			case JexPackage.JAVA_CORE_ELEMENT:
				return createJavaCoreElementFromString(eDataType, initialValue);
			case JexPackage.FEATURES:
				return createFeaturesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JexPackage.CLASS_KIND:
				return convertClassKindToString(eDataType, instanceValue);
			case JexPackage.JUNIT_TEST_STATUS:
				return convertJUnitTestStatusToString(eDataType, instanceValue);
			case JexPackage.DECLARATION_TYPE:
				return convertDeclarationTypeToString(eDataType, instanceValue);
			case JexPackage.MODIFIERS:
				return convertModifiersToString(eDataType, instanceValue);
			case JexPackage.CLASS_NAME:
				return convertClassNameToString(eDataType, instanceValue);
			case JexPackage.JAVA_CORE_PROJECT:
				return convertJavaCoreProjectToString(eDataType, instanceValue);
			case JexPackage.JAVA_CORE_ELEMENT:
				return convertJavaCoreElementToString(eDataType, instanceValue);
			case JexPackage.FEATURES:
				return convertFeaturesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPack createJavaPack() {
		JavaPackImpl javaPack = new JavaPackImpl();
		return javaPack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass createJavaClass() {
		JavaClassImpl javaClass = new JavaClassImpl();
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaField createJavaField() {
		JavaFieldImpl javaField = new JavaFieldImpl();
		return javaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMethod createJavaMethod() {
		JavaMethodImpl javaMethod = new JavaMethodImpl();
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRequirement createJavaRequirement() {
		JavaRequirementImpl javaRequirement = new JavaRequirementImpl();
		return javaRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUnitTest createJUnitTest() {
		JUnitTestImpl jUnitTest = new JUnitTestImpl();
		return jUnitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise createExercise() {
		ExerciseImpl exercise = new ExerciseImpl();
		return exercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePart createExercisePart() {
		ExercisePartImpl exercisePart = new ExercisePartImpl();
		return exercisePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClassTester createJavaClassTester() {
		JavaClassTesterImpl javaClassTester = new JavaClassTesterImpl();
		return javaClassTester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMethodTester createJavaMethodTester() {
		JavaMethodTesterImpl javaMethodTester = new JavaMethodTesterImpl();
		return javaMethodTester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite createTestSuite() {
		TestSuiteImpl testSuite = new TestSuiteImpl();
		return testSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassKind createClassKindFromString(EDataType eDataType, String initialValue) {
		ClassKind result = ClassKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JUnitTestStatus createJUnitTestStatusFromString(EDataType eDataType, String initialValue) {
		JUnitTestStatus result = JUnitTestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJUnitTestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDeclarationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeclarationTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public Integer createModifiersFromString(EDataType eDataType, String initialValue) {
		int modifiers = 0;
		if (initialValue != null && initialValue.length() > 0) {
			String[] tokens = initialValue.split("\\W");
			for (int i = 0; i < tokens.length; i++) {
				for (int j = 0; j < MODIFIERS.length; j++) {
					if (tokens[i].equals(MODIFIERS[j])) {
						modifiers |= MODIFIER_MASKS[j];
						break;
					}
				}
			}
		}
		return new Integer(modifiers);
	}

	private final static String[] MODIFIERS = {
		"public", "protected", "private", "final", "static", "abstract"
	};
	private final static int[] MODIFIER_MASKS = {
		Flags.AccPublic, Flags.AccProtected, Flags.AccPrivate, Flags.AccFinal, Flags.AccStatic, Flags.AccAbstract
	};

	public final static int MODIFIERS_MASK;
	static {
		int modifiers = 0;
		for (int i = 0; i < MODIFIER_MASKS.length; i++) {
			modifiers |= MODIFIER_MASKS[i];
		}
		MODIFIERS_MASK = modifiers;
	}

	private static char MODIFIERS_SEPARATOR = ' ';

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public String convertModifiersToString(EDataType eDataType, Object instanceValue) {
		if (! (instanceValue instanceof Integer)) {
			return null;
		}
		int modifiers = ((Integer)instanceValue).intValue();
		StringBuffer buffer = new StringBuffer();
		for (int j = 0; j < MODIFIER_MASKS.length; j++) {
			if ((modifiers & MODIFIER_MASKS[j]) > 0) {
				if (buffer.length() > 0) {
					buffer.append(MODIFIERS_SEPARATOR);
				}
				buffer.append(MODIFIERS[j]);
			}
		}
		return buffer.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassNameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IJavaProject createJavaCoreProjectFromString(EDataType eDataType, String initialValue) {
		return (IJavaProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaCoreProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IJavaElement createJavaCoreElementFromString(EDataType eDataType, String initialValue) {
		return (IJavaElement)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaCoreElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFeaturesFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeaturesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexPackage getJexPackage() {
		return (JexPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JexPackage getPackage() {
		return JexPackage.eINSTANCE;
	}

} //JexFactoryImpl
