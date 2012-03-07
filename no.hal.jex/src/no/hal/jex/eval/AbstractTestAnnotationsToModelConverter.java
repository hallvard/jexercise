package no.hal.jex.eval;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.ExercisePart;
import no.hal.jex.JUnitTest;
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
import no.hal.jex.TestSuite;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class AbstractTestAnnotationsToModelConverter {

	private static final String TYPE_LIST_SEPARATOR = ",";
	public final static String JEX_ANNOTATION_NAME = "JExercise";
	public static final String JEX_TESTS_ANNOTATION_KEY = "tests";
	public static final String JEX_DESCRIPTION_ANNOTATION_KEY = "description";
	public static final String JEX_COMMENT_ANNOTATION_KEY = "comment";

	public final static String ALL_TESTS_TEST_SUITE_NAME = "AllTests";
	public final static String TEST_CLASS_NAME_SUFFIX = "Test";
	public final static String TEST_METHOD_NAME_PREFIX = "test";

	public static boolean isAllTestsName(String name) {
		int pos = name.lastIndexOf('.');
		if (pos >= 0) {
			name = name.substring(pos + 1);
		}
		return name.equals(AbstractTestAnnotationsToModelConverter.ALL_TESTS_TEST_SUITE_NAME);
	}
	public static boolean isTestClassName(String name) {
		return name.endsWith(TEST_CLASS_NAME_SUFFIX);
	}
	public static boolean isTestMethodName(String name) {
		return name.startsWith(TEST_METHOD_NAME_PREFIX);
	}

	protected static void simplifyRequirements(Exercise ex) {
		EList<AbstractRequirement> requirements = ex.getRequirements();
		if (requirements.size() == 1) {
			AbstractRequirement req = requirements.get(0);
			requirements.clear();
			requirements.addAll(req.getRequirements());
		}
	}

	protected AbstractTestAnnotationsToModelConverter(Exercise ex) {
		this.ex = ex;
	}

	protected Exercise ex;
	protected boolean simplifyRequirements = true;

	public Exercise convert() {
		try {
			if (canConvert()) {
				convert(ex);
			}
		} catch (Exception e) {
		}
		if (simplifyRequirements) {
			simplifyRequirements(ex);
		}
		return ex;
	}

	public abstract boolean canConvert();
	protected abstract void convert(Exercise ex);
	
	//
	
	protected JavaPack ensureJavaPack(String packageName, EList javaElements) {
		return (JavaPack) ensureJavaElement(packageName, javaElements, JexPackage.eINSTANCE.getJavaPack());
	}

	protected JavaClass ensureJavaClass(String fullName, EClass eClass) {
		int pos = fullName.lastIndexOf('.');
		return (TestSuite) ensureJavaClass(fullName.substring(0, pos), fullName.substring(pos + 1), JexPackage.eINSTANCE.getTestSuite());
	}
	protected JavaClass ensureJavaClass(String packagePrefix, String elementName, EClass eClass) {
		JavaPack javaPack = ensureJavaPack(packagePrefix, ex.getJavaElements());
		return (JavaClass) ensureJavaElement(elementName, javaPack.getClasses(), eClass);
	}

	protected JavaElement findJavaElement(String name, EList<? extends JavaElement> javaElements, EClass eClass) {
		for (JavaElement javaElement : javaElements) {
			if (eClass.isSuperTypeOf(javaElement.eClass())) {
				EStructuralFeature nameFeature = eClass.getEStructuralFeature("name");
				if (nameFeature != null && name.equals(javaElement.eGet(nameFeature))) {
					return (JavaElement) javaElement;
				}
			}
		}
		return null;
	}

	protected JavaElement ensureJavaElement(String name, EList javaElements, EClass eClass) {
		JavaElement javaElement = findJavaElement(name, javaElements, eClass);
		if (javaElement == null) {
			javaElement = (JavaElement) JexFactory.eINSTANCE.create(eClass);
			EStructuralFeature nameFeature = eClass.getEStructuralFeature("name");
			if (nameFeature != null) {
				javaElement.eSet(nameFeature, name);
			}
			javaElements.add(javaElement);
		}
		return javaElement;
	}
	
	
	protected ExercisePart ensureExercisePart(Exercise ex, String name) {
		for (AbstractRequirement req : ex.getRequirements()) {
			if (req instanceof ExercisePart && name.equals(req.getText())) {
				return (ExercisePart) req;
			}
		}
		ExercisePart exercisePart = JexFactory.eINSTANCE.createExercisePart();
		exercisePart.setText(name);
		ex.getRequirements().add(exercisePart);
		ensureJavaPack(name, ex.getJavaElements());
		return exercisePart;
	}
	
	protected JavaRequirement ensureJavaRequirement(String packageName, String testClassName, String testedClassName, String testsAnnotation, boolean preferJunitTest) {
		JavaRequirement req = null;
		boolean hasTestsAnnotation = testsAnnotation != null && testsAnnotation.length() > 0;
		if (hasTestsAnnotation && preferJunitTest) {
			req = JexFactory.eINSTANCE.createJUnitTest();
		} else {
			if (! hasTestsAnnotation) {
				testsAnnotation = testedClassName;
			}
			req = JexFactory.eINSTANCE.createJavaRequirement();
		}
		req.setText((req instanceof JUnitTest ? "Test " : "") + packageName + "." + testsAnnotation);
		JavaClassTester javaClassTester = (JavaClassTester) ensureJavaClass(packageName, testClassName, JexPackage.eINSTANCE.getJavaClassTester());
		String[] superClasses = {},  superInterfaces = {};
		int pos = testsAnnotation.indexOf(' ');
		if (pos >= 0) {
			testedClassName = testsAnnotation.substring(0, pos);
			testsAnnotation = testsAnnotation.substring(pos + 1);
			String EXTENDS_KEYWORD = "extends ", IMPLEMENTS_KEYWORD = "implements ";
			int extendsPos = testsAnnotation.indexOf(EXTENDS_KEYWORD), implementsPos = testsAnnotation.indexOf(IMPLEMENTS_KEYWORD);
			if (extendsPos >= 0) {
				superClasses = testsAnnotation.substring(extendsPos + EXTENDS_KEYWORD.length(), implementsPos > extendsPos ? implementsPos : testsAnnotation.length()).split(TYPE_LIST_SEPARATOR);
			}
			if (implementsPos >= 0) {
				superInterfaces = testsAnnotation.substring(implementsPos + IMPLEMENTS_KEYWORD.length(), extendsPos > implementsPos ? extendsPos : testsAnnotation.length()).split(TYPE_LIST_SEPARATOR);
			}
		} else {
			testedClassName = testsAnnotation;
		}
		int pos3 = testedClassName.lastIndexOf('.');
		if (pos3 >= 0) {
			packageName = testedClassName.substring(0, pos3);
			testedClassName = testedClassName.substring(pos3 + 1);
		}
		JavaClass javaClass = ensureJavaClass(packageName, testedClassName, JexPackage.eINSTANCE.getJavaClass());
		for (int j = 0; j < superClasses.length; j++) {
			javaClass.getSuperclasses().add(superClasses[j]);
		}
		for (int j = 0; j < superInterfaces.length; j++) {
			javaClass.getSuperclasses().add(superInterfaces[j]);
		}
		javaClassTester.setTestedElement(javaClass);
		ExercisePart part = ensureExercisePart(ex, packageName);
		if (req instanceof JUnitTest) {
			((JUnitTest) req).setTestRunnable(javaClassTester);
		}
		req.setJavaElement(javaClassTester); // redundant?
		part.getRequirements().add(req);
		return req;
	}
	
	protected JUnitTest ensureJunitTest(JavaMethodTester javaMethodTester, String testsAnnotation, JavaClass methodParent, AbstractRequirement reqParent) {

		// create and initialize JUnit test
		JUnitTest testReq = JexFactory.eINSTANCE.createJUnitTest();
		testReq.setText("Test " + testsAnnotation);
		javaMethodTester.setReturnType("void");
		testReq.setJavaElement(javaMethodTester);
		testReq.setTestRunnable(javaMethodTester);
		
		reqParent.getRequirements().add(testReq);

		// add java elements and requirements for the tested elements
		String[] testedElements = testsAnnotation.split(";");
		for (int i = 0; i < testedElements.length; i++) {
			String testedElementName = testedElements[i].trim();
			String returnType = null, modifiers = "public";
			int pos1 = testedElementName.indexOf('('), pos = testedElementName.lastIndexOf(' ', pos1 >= 0 ? pos1 : testedElementName.length());
			if (pos >= 0) {
				int pos2 = testedElementName.lastIndexOf(' ', pos - 1);
				if (pos2 >= 0) {
					modifiers = testedElementName.substring(0, pos2);
					returnType = testedElementName.substring(pos2 + 1, pos);
				} else {
					returnType = testedElementName.substring(0, pos);
				}
				pos1 -= pos + 1;
				testedElementName = testedElementName.substring(pos + 1);
			}
			int pos2 = testedElementName.lastIndexOf(')');
			Member testedElement = null;
			if (pos1 >= 0 && pos2 >= 0) {
				String[] params = {}, exceptions = {};
				if (pos2 > pos1 + 2) {
					params = testedElementName.substring(pos1 + 1, pos2).split(TYPE_LIST_SEPARATOR);
				}
				String THROWS_KEYWORD = "throws ";
				int pos3 = testedElementName.indexOf(THROWS_KEYWORD, pos2);
				if (pos3 >= pos2) {
					exceptions = testedElementName.substring(pos3 + THROWS_KEYWORD.length()).split(TYPE_LIST_SEPARATOR);
				}
				testedElementName = testedElementName.substring(0, pos1);
				JavaMethod javaMethod = (JavaMethod) ensureJavaElement(testedElementName, methodParent.getMembers(), JexPackage.eINSTANCE.getJavaMethod());
				if (testedElementName != methodParent.getName() && returnType == null) {
					returnType = "void";
				}
				javaMethod.setReturnType(returnType);
				for (int j = 0; j < params.length; j++) {
					javaMethod.getParameters().add(params[j]);
				}
				for (int j = 0; j < exceptions.length; j++) {
					javaMethod.getThrowables().add(exceptions[j]);
				}
				testedElement = javaMethod;
			} else {
				JavaField javaField = (JavaField) ensureJavaElement(testedElementName, methodParent.getMembers(), JexPackage.eINSTANCE.getJavaField());
				javaField.setType(returnType);
				testedElement = javaField;
			}
			if (modifiers != null) {
				testedElement.setModifiers((Integer) JexFactory.eINSTANCE.createFromString(JexPackage.eINSTANCE.getModifiers(), modifiers));
			}
			// set it to the first element
			if (javaMethodTester.getTestedElement() == null) {
				javaMethodTester.setTestedElement(testedElement);
			}
			JavaRequirement javaReq = JexFactory.eINSTANCE.createJavaRequirement();
			javaReq.setText("Create " + testedElementName);
			javaReq.setJavaElement(testedElement);
	
			testReq.getRequirements().add(javaReq);
		}
		return testReq;
	}
}
