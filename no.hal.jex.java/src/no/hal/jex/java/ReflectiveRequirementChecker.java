package no.hal.jex.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.runner.BaseTestRunner;
import no.hal.jex.AbstractRequirement;
import no.hal.jex.ClassKind;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.Member;
import no.hal.jex.TestRunnable;
import no.hal.jex.eval.AbstractRequirementChecker;
import no.hal.jex.eval.AbstractTestAnnotationsToModelConverter;
import no.hal.jex.impl.MemberImpl;

public class ReflectiveRequirementChecker extends AbstractRequirementChecker {

	public interface BaseTestRunnerProvider {
		BaseTestRunner createBaseTestRunner(JUnitTest junitTest);
	}
	public class BaseTestRunnerStub extends BaseTestRunner {
		@Override
		public void testStarted(String testName) {
		}
		@Override
		public void testEnded(String testName) {
		}
		@Override
		public void testFailed(int status, Test test, Throwable t) {
		}
		@Override
		protected void runFailed(String message) {
		}
	}
	
	private BaseTestRunnerProvider baseTestRunnerProvider = new BaseTestRunnerProvider() {
		@Override
		public BaseTestRunner createBaseTestRunner(JUnitTest junitTest) {
			return new BaseTestRunnerStub();
		}
	};
	
	public void setBaseTestRunnerProvider(BaseTestRunnerProvider baseTestRunnerProvider) {
		this.baseTestRunnerProvider = baseTestRunnerProvider;
	}

	@Override
	public Boolean validateRequirement(AbstractRequirement req) {
		if (req instanceof JUnitTest) {
			JUnitTest junitTest = (JUnitTest) req;
			TestRunnable testRunnable = junitTest.getTestRunnable();
			for (Member jexMember : testRunnable.getTestedElements()) {
				if (jexMember != null) {
					if (validateJexMember(jexMember, false, true) == Boolean.FALSE) {
						return Boolean.FALSE;
					}
				}
			}
			Test test = createTest(testRunnable);
			if (test != null) {
				TestResult testResult = new TestResult();
				final Collection<String> messages = junitTest.getMessages();
				messages.clear();
				testResult.addListener(baseTestRunnerProvider.createBaseTestRunner(junitTest));
				test.run(testResult);
				((JUnitTest) req).setSatisfied(testResult.wasSuccessful());
			}
		}
		return super.validateRequirement(req);
	}

	private ReflectionHelper reflectionHelper = new ReflectionHelper();

	public ReflectionHelper getReflectionHelper() {
		return reflectionHelper;
	}
	
	private Test createTest(TestRunnable testRunnable) {
		if (testRunnable instanceof JavaMethodTester) {
			return createTest(testRunnable.getOwner().getFullName(), testRunnable.getSimpleName());
		} else if (testRunnable instanceof JavaClassTester) {
			return createTest(testRunnable.getFullName(), null);
		}
		return null;
	}

	public Test createTest(String className, String methodName) {
		Class<?> c = null;
		try {
			c = reflectionHelper.getReflectiveClass(className);
		} catch (ClassNotFoundException e) {
			return null;
		}
		if (isAllTestsSuite(c.getSimpleName())) {
			try {
				return (TestSuite) c.getMethod("suite").invoke(null);
			} catch (Exception e) {
				return null;
			}
		} else if (methodName != null) {
			return TestSuite.createTest(c, methodName);
		} else {
			return new TestSuite(c);
		}
	}

	public static boolean isAllTestsSuite(String name) {
		int pos = name.lastIndexOf('.');
		if (pos >= 0) {
			name = name.substring(pos + 1);
		}
		return name.equals(AbstractTestAnnotationsToModelConverter.ALL_TESTS_TEST_SUITE_NAME);
	}
	
	//
	
	protected Object getRealJavaElement(JavaElement jexElement) {
		return reflectionHelper.getReflectiveElement(jexElement);
	}

	//

	static boolean testTypeString(String s1, Type javaType) {
		if (s1 == null) {
			return true;
		}
		if (javaType instanceof ParameterizedType) {
			Type[] typeArgs2 = ((ParameterizedType) javaType).getActualTypeArguments();
			javaType = ((ParameterizedType) javaType).getRawType();
			int pos1 = s1.indexOf('<'), pos2 = s1.lastIndexOf('>');
			if (pos1 < 0 || pos2 < 0 || pos1 >= pos2) {
				return false;
			}
			String[] typeArgs1 = s1.substring(pos1 + 1, pos2).split(",");
			s1 = s1.substring(0, pos1);
			if (typeArgs1.length != typeArgs2.length) {
				return false;
			}
			for (int i = 0; i < typeArgs1.length; i++) {
				if (! testTypeString(typeArgs1[i], typeArgs2[i])) {
					return false;
				}
			}
		}
		while (isArrayType(javaType)) {
			if (! s1.endsWith("[]")) {
				return false;
			}
			javaType = arrayComponentType(javaType);
			s1 = s1.substring(0, s1.length() - "[]".length());
		}
		if (javaType instanceof Class) {
			Class<?> javaClass = (Class<?>) javaType;
			String s2 = javaClass.getName();
			if (s1.equals(s2)) {
				return true;
			}
			if (s1.indexOf('.') < 0 && s2.indexOf('.') >= 0) {
				s2 = MemberImpl.getSimpleName(s2);
				if (s1.equals(s2)) {
					return true;
				}
			}
			return false;
		}
		return true;
	}

	private static boolean isArrayType(Type javaType) {
		return javaType instanceof GenericArrayType || javaType instanceof Class && ((Class<?>) javaType).isArray();
	}

	private static Type arrayComponentType(Type javaType) {
		if (javaType instanceof GenericArrayType) {
			return ((GenericArrayType) javaType).getGenericComponentType();
		}
		if (javaType instanceof Class && ((Class<?>) javaType).isArray()) {
			return ((Class<?>) javaType).getComponentType();
		}
		return null;
	}
	
	//

	private static boolean isClassKind(ClassKind kind, Class<?> javaElement) {
		switch (kind) {
		case CLASS_KIND: return ! (javaElement.isInterface() || javaElement.isEnum());
		case INTERFACE_KIND: return javaElement.isInterface();
		case ENUM_KIND: return javaElement.isEnum();
		}
		return false;
	}

	private Boolean validateSuperclasses(JavaClass jexClass, Class<?> javaType) {
		outer: for (String superClass: jexClass.getSuperclasses()) {
			if (superClass.equals(javaType.getSuperclass())) {
				continue;
			}
			Class<?>[] interfaces = javaType.getInterfaces();
			for (int j = 0; j < interfaces.length; j++) {
				try {
					if (interfaces[j].equals(reflectionHelper.getReflectiveClass(superClass))) {
						continue outer;
					}
				} catch (ClassNotFoundException e) {
					return null;
				}
			}
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	private static Boolean validateTypes(List<String> types, Type[] types2, boolean isOrdered) {
		if (types == null) {
			return Boolean.TRUE;
		}
		if (types2.length != types.size()) {
			return Boolean.FALSE;
		}
		for (int i = 0; i < types.size(); i++) {
			String type = (String)types.get(i);
			if (isOrdered) {
				if (! testTypeString(type, types2[i])) {
					return Boolean.FALSE;
				}
			} else {
				for (int j = 0; j < types2.length; j++) {
					if (! testTypeString(type, types2[j])) {
						return Boolean.FALSE;
					}
				}
			}
		}
		return Boolean.TRUE;
	}

	static Boolean validateTypes(String jexReturnType, List<String> jexParameterTypes, Type javaReturnType, Type[] javaParameterTypes) {
		if (jexReturnType != null && javaReturnType != null) {
			if (! testTypeString(jexReturnType, javaReturnType)) {
				return Boolean.FALSE;
			}
		}
		return validateTypes(jexParameterTypes, javaParameterTypes, true);
	}
	
	protected Boolean correctTypes(Member jexMember) {
		Object javaElement = reflectionHelper.getReflectiveElement(jexMember);
		Boolean typesResult = Boolean.TRUE;
		if (jexMember instanceof JavaClass && javaElement instanceof Class) {
			if (! isClassKind(((JavaClass) jexMember).getClassKind(), (Class<?>) javaElement)) {
				typesResult = Boolean.FALSE;
			}
			typesResult = satisfiedAnd(typesResult, validateSuperclasses(((JavaClass) jexMember), ((Class<?>) javaElement)));
		} else if (jexMember instanceof JavaMethod) {
			JavaMethod jexMethod = (JavaMethod) jexMember;
			Type javaReturnType = null, javaParameterTypes[] = null, javaExceptionTypes[] = null;
			if (javaElement instanceof Method) {
				Method javaMethod = (Method) javaElement;
				javaReturnType = javaMethod.getReturnType();
				javaParameterTypes = javaMethod.getGenericParameterTypes();
				javaExceptionTypes = javaMethod.getExceptionTypes();
			} else if (javaElement instanceof Constructor<?>) {
				Constructor<?> javaConstructor = (Constructor<?>) javaElement;
				javaReturnType = null;
				javaParameterTypes = javaConstructor.getGenericParameterTypes();
				javaExceptionTypes = javaConstructor.getExceptionTypes();
			}
			Boolean result = validateTypes(jexMethod.getReturnType(), jexMethod.getParameters(), javaReturnType, javaParameterTypes);
			if (result != Boolean.TRUE) {
				typesResult = result;
			} else {
				typesResult = validateTypes(jexMethod.getThrowables(), javaExceptionTypes, false);
			}
		} else if (jexMember instanceof JavaField && javaElement instanceof Field) {
			typesResult = Boolean.valueOf(testTypeString(((JavaField) jexMember).getType(), ((Field) javaElement).getType()));
		}
		return typesResult;
	}

	//
	
	private final static Map<String, Integer> MODIFIERS_MAP = new HashMap<String, Integer>();
	static {
		MODIFIERS_MAP.put("public", Modifier.PUBLIC);
		MODIFIERS_MAP.put("private", Modifier.PRIVATE);
		MODIFIERS_MAP.put("protected", Modifier.PROTECTED);
		MODIFIERS_MAP.put("final", Modifier.FINAL);
		MODIFIERS_MAP.put("static", Modifier.STATIC);
		MODIFIERS_MAP.put("abstract", Modifier.ABSTRACT);
	};
	
	protected int getRealModifiers(Member jexMember) {
		Object javaElement = getRealJavaElement(jexMember);
		if (javaElement instanceof java.lang.reflect.Member) {
			return ((java.lang.reflect.Member) javaElement).getModifiers();
		}
		return -1;
	}

	protected Map<String, Integer> getRealModifiersMap() {
		return MODIFIERS_MAP;
	}
}
