package no.hal.jex.java;

import java.lang.reflect.Method;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexPackage;
import no.hal.jex.eval.AbstractTestAnnotationsToModelConverter;

public class ReflectiveTestAnnotationsToModelConverter extends AbstractTestAnnotationsToModelConverter {

	private junit.framework.TestSuite junitTestSuite;

	public ReflectiveTestAnnotationsToModelConverter(Exercise ex, junit.framework.TestSuite junitTestSuite) {
		super(ex);
		this.junitTestSuite = junitTestSuite;
	}

	@Override
	public boolean canConvert() {
		return true;
	}

	@Override
	protected void convert(Exercise ex) {
		createFromTestClassAnnotations(junitTestSuite, null);
	}

	private ReflectionHelper reflectionHelper = new ReflectionHelper();
	
	private JavaRequirement createFromTestClassAnnotations(junit.framework.TestSuite junitTestSuite, String packageName, String testedClassName) {
		Class<?> type = null;
		try {
			type = reflectionHelper.getClass(junitTestSuite.getName());
		} catch (ClassNotFoundException e) {
			return null;
		}
		JExercise jexAnnotation = (JExercise) type.getAnnotation(JExercise.class);
		JavaRequirement req = ensureJavaRequirement(packageName, type.getSimpleName(), testedClassName, jexAnnotation.tests(), jexAnnotation.description());

		for (int i = 0; i < junitTestSuite.testCount(); i++) {
			createFromTestClassAnnotations(junitTestSuite.testAt(i), req);
		}
		return req;
	}

	private void createFromTestClassAnnotations(Test junitTest, JavaRequirement req) {
		if (junitTest instanceof TestSuite) {
			junit.framework.TestSuite junitTestSuite = (junit.framework.TestSuite) junitTest;
			String typeFullName = junitTestSuite.getName();
			if (isAllTestsName(typeFullName)) {
				for (int i = 0; i < junitTestSuite.testCount(); i++) {
					createFromTestClassAnnotations(junitTestSuite.testAt(i), req);
				}
			} else if (isTestClassName(typeFullName)) {
				int pos = typeFullName.lastIndexOf('.');
				String namePrefix = typeFullName.substring(0, pos);
				String typeName = typeFullName.substring(pos + 1);
				createFromTestClassAnnotations(junitTestSuite, namePrefix, typeName.substring(0, typeName.length() - AbstractTestAnnotationsToModelConverter.TEST_CLASS_NAME_SUFFIX.length()));
			}
		} else if (junitTest instanceof TestCase) {
			String methodName = ((TestCase) junitTest).getName();
			if (isTestMethodName(methodName)) {
				String namePrefix = AbstractTestAnnotationsToModelConverter.TEST_METHOD_NAME_PREFIX;
				String testedMethodName = Character.toLowerCase(methodName.charAt(namePrefix.length())) + methodName.substring(namePrefix.length() + 1);
				JavaClassTester javaClassTester = (JavaClassTester) req.getJavaElement();
				createFromTestMethodAnnotations((TestCase) junitTest, testedMethodName, javaClassTester, (JavaClass) javaClassTester.getTestedElement(), req);
			}
		}
	}

	private JavaRequirement createFromTestMethodAnnotations(TestCase junitTestCase, String testedMethodName, JavaClassTester methodTesterParent, JavaClass methodParent, AbstractRequirement reqParent) {
		Class<?> type = junitTestCase.getClass();
		String testMethodName = junitTestCase.getName();
		Method javaMethod = null;
		try {
			javaMethod = type.getMethod(testMethodName);
		} catch (Exception e) {
			return null;
		}
		JExercise jexAnnotation = (JExercise) javaMethod.getAnnotation(JExercise.class);
		String tests = jexAnnotation.tests();
		if (tests == null) {
			tests = testedMethodName;
		}
		JavaMethodTester javaMethodTester = (JavaMethodTester) ensureJavaMethod(methodTesterParent, testMethodName, JexPackage.eINSTANCE.getJavaMethodTester());
		return ensureJunitTest(javaMethodTester, tests, jexAnnotation.description(), methodParent, reqParent);
	}
}
