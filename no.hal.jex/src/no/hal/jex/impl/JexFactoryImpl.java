/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.HashMap;
import java.util.Map;

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

	// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(JexResource.JEX_EXTENSION, new JexResource.Factory());

	private final static Map<String, Integer> MODIFIERS_MAP = new HashMap<String, Integer>();
	static {
		MODIFIERS_MAP.put("public", 1);
		MODIFIERS_MAP.put("private", 2);
		MODIFIERS_MAP.put("protected", 4);
		MODIFIERS_MAP.put("final", 16);
		MODIFIERS_MAP.put("static", 8);
		MODIFIERS_MAP.put("abstract", 1024);
	};

	public static int getVisibilityModifiers() {
		return getModifier("public") | getModifier("protected") | getModifier("private");
	}
	
	public static int getModifier(String s) {
		Integer i = MODIFIERS_MAP.get(s);
		return i != null ? i : 0;
	}
	
	public final static int MODIFIERS_MASK;
	static {
		int modifiers = 0;
		for (Integer mask : MODIFIERS_MAP.values()) {
			modifiers |= mask;
		}
		MODIFIERS_MASK = modifiers;
	}

	private static String MODIFIERS_SEPARATOR = " ";
	
	public static int createModifiersFromString(String s, Map<String, Integer> modifiersMap) {
		int modifiers = 0;
		String[] tokens = s.split(MODIFIERS_SEPARATOR);
		for (int i = 0; i < tokens.length; i++) {
			Integer modifier = modifiersMap.get(tokens[i]);
			if (modifier != null) {
				modifiers |= modifier;
			}
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public Integer createModifiersFromString(EDataType eDataType, String initialValue) {
		if (initialValue != null && initialValue.length() > 0) {
			return createModifiersFromString(initialValue, MODIFIERS_MAP);
		}
		return 0;
	}

	public static String convertModifiersToString(int modifiers, Map<String, Integer> modifiersMap) {
		StringBuffer buffer = new StringBuffer();
		for (Map.Entry<String, Integer> entry : modifiersMap.entrySet()) {
			if ((modifiers & entry.getValue()) > 0) {
				if (buffer.length() > 0) {
					buffer.append(MODIFIERS_SEPARATOR);
				}
				buffer.append(entry.getKey());
			}
		}
		return buffer.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public String convertModifiersToString(EDataType eDataType, Object instanceValue) {
		if (! (instanceValue instanceof Integer)) {
			return null;
		}
		return convertModifiersToString((Integer) instanceValue, MODIFIERS_MAP);
	}

	public static int convertModifiersToModifiers(int fromModifiers, Map<String, Integer> fromModifiersMap, Map<String, Integer> toModifiersMap) {
		if (fromModifiersMap == null) {
			fromModifiersMap = MODIFIERS_MAP;
		}
		if (toModifiersMap == null) {
			toModifiersMap = MODIFIERS_MAP;
		}
		int toModifiers = 0;
		for (Map.Entry<String, Integer> entry : fromModifiersMap.entrySet()) {
			if ((fromModifiers & entry.getValue()) != 0) {
				Integer i = toModifiersMap.get(entry.getKey());
				if (i != null) {
					toModifiers |= i;
				}
			}
		}
		return toModifiers;
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
