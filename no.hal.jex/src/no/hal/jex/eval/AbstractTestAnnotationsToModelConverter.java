package no.hal.jex.eval;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.ExercisePart;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaPack;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.TestSuite;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class AbstractTestAnnotationsToModelConverter {

	public final static String JEX_ANNOTATION_NAME = "JExercise";
	public static final String JEX_DESCRIPTION_ANNOTATION_KEY = "description";
	public static final String JEX_TESTS_ANNOTATION_KEY = "tests";

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

	protected JavaMethod ensureJavaMethod(JavaClass javaClass, String elementName, EClass eClass) {
		return (JavaMethod) ensureJavaElement(elementName, javaClass.getMembers(), eClass);
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
	
	protected JavaRequirement ensureJavaRequirement(String packageName, String testClassName, String testedClassName, String testsAnnotation, String descriptionAnnotation) {
		JavaRequirement req = null;
		if (testsAnnotation != null && testsAnnotation.length() > 0) {
			req = JexFactory.eINSTANCE.createJUnitTest();
		} else {
			testsAnnotation = testedClassName;
			req = JexFactory.eINSTANCE.createJavaRequirement();
		}
		req.setText((req instanceof JUnitTest ? "Test " : "") + packageName + "." + testsAnnotation);
		JavaClassTester javaClassTester = (JavaClassTester) ensureJavaClass(packageName,testClassName, JexPackage.eINSTANCE.getJavaClassTester());
		int pos = testsAnnotation.lastIndexOf('.');
		if (pos >= 0) {
			packageName = testsAnnotation.substring(0, pos);
			testsAnnotation = testsAnnotation.substring(pos + 1);
		}
		JavaClass javaClass = ensureJavaClass(packageName, testsAnnotation, JexPackage.eINSTANCE.getJavaClass());
		javaClassTester.setTestedElement(javaClass);
		ExercisePart part = ensureExercisePart(ex, packageName);
		if (req instanceof JUnitTest) {
			((JUnitTest) req).setTestRunnable(javaClassTester);
		}
		req.setJavaElement(javaClassTester); // redundant?
		req.setDescription(descriptionAnnotation);
		part.getRequirements().add(req);
		return req;
	}
	
	protected JUnitTest ensureJunitTest(JavaMethodTester javaMethodTester, String testsAnnotation, String descriptionAnnotation, JavaClass methodParent, AbstractRequirement reqParent) {

		// create and initialize JUnit test
		JUnitTest testReq = JexFactory.eINSTANCE.createJUnitTest();
		testReq.setText("Test " + testsAnnotation);
		javaMethodTester.setReturnType("void");
		testReq.setJavaElement(javaMethodTester);
		testReq.setTestRunnable(javaMethodTester);
		testReq.setDescription(descriptionAnnotation);
		
		reqParent.getRequirements().add(testReq);

		// add java elements and requirements for the tested elements
		String[] testedElements = testsAnnotation.split(";");
		for (int i = 0; i < testedElements.length; i++) {
			String testedElementName = testedElements[i].trim();
			String returnType = null, modifiers = "public";
			int pos = testedElementName.lastIndexOf(' ');
			if (pos >= 0) {
				int pos2 = testedElementName.lastIndexOf(' ', pos - 1);
				if (pos2 >= 0) {
					modifiers = testedElementName.substring(0, pos2);
					returnType = testedElementName.substring(pos2 + 1, pos);
				} else {
					returnType = testedElementName.substring(0, pos);
				}
				testedElementName = testedElementName.substring(pos + 1);
			}
			int pos1 = testedElementName.indexOf('('), pos2 = testedElementName.lastIndexOf(')');
			String[] params = {};
			if (pos1 >= 0 && pos2 >= 0) {
				if (pos2 > pos1 + 2) {
					params = testedElementName.substring(pos1 + 1, pos2).split(",");
				}
				testedElementName = testedElementName.substring(0, pos1);
			}
			JavaMethod javaMethod = ensureJavaMethod(methodParent, testedElementName, JexPackage.eINSTANCE.getJavaMethod());
			if (modifiers != null) {
				javaMethod.setModifiers((Integer) JexFactory.eINSTANCE.createFromString(JexPackage.eINSTANCE.getModifiers(), modifiers));
			}
			if (testedElementName != methodParent.getName() && returnType == null) {
				returnType = "void";
			}
			javaMethod.setReturnType(returnType);
			for (int j = 0; params != null && j < params.length; j++) {
				javaMethod.getParameters().add(params[j]);
			}
			javaMethodTester.setTestedElement(javaMethodTester.getTestedElement() != null ? null : javaMethod);
	
			JavaRequirement javaReq = JexFactory.eINSTANCE.createJavaRequirement();
			javaReq.setText("Create " + testedElementName);
			javaReq.setJavaElement(javaMethod);
	
			testReq.getRequirements().add(javaReq);
		}
		return testReq;
	}
}
