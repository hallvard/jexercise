package no.hal.jex.eval;

import java.util.ArrayList;
import java.util.Collection;

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

	public final static String JEX_ANNOTATION_NAME = "JExercise";
	public static final String JEX_TESTS_ANNOTATION_KEY = "tests";
	public static final String JEX_MARKUP_LANGUAGE_ANNOTATION_KEY = "markupLanguage";
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
		this.exercise = ex;
	}

	protected Exercise exercise;
	protected boolean simplifyRequirements = true;

	public Exercise convert() {
		try {
			if (canConvert()) {
				convert(exercise);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (simplifyRequirements) {
			simplifyRequirements(exercise);
		}
		return exercise;
	}

	public abstract boolean canConvert();
	protected abstract void convert(Exercise ex);
	
	//
	
	protected JavaPack ensureJavaPack(String packageName, Collection<?> javaElements) {
		return (JavaPack) ensureJavaElement(packageName, javaElements, JexPackage.eINSTANCE.getJavaPack());
	}

	protected JavaClass ensureJavaClass(String fullName, EClass eClass) {
		int pos = fullName.lastIndexOf('.');
		return (TestSuite) ensureJavaClass(fullName.substring(0, pos), fullName.substring(pos + 1), JexPackage.eINSTANCE.getTestSuite());
	}
	protected JavaClass ensureJavaClass(String packagePrefix, String elementName, EClass eClass) {
		JavaPack javaPack = ensureJavaPack(packagePrefix, exercise.getJavaElements());
		return (JavaClass) ensureJavaElement(elementName, javaPack.getClasses(), eClass);
	}

	protected JavaElement findJavaElement(String name, Iterable<? extends JavaElement> javaElements, EClass eClass) {
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

	protected JavaElement ensureJavaElement(String name, Collection javaElements, EClass eClass) {
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

	protected JavaElement ensureJavaMethod(String name, String returnType, String[] parameterTypes, String[] exceptionTypes, Collection<Member> javaMembers) {
		outer: for (Member javaMember : javaMembers) {
			// check type and name
			if (! (javaMember instanceof JavaMethod && name.equals(javaMember.getName()))) {
				continue;
			}
			// check parameter types
			JavaMethod javaMethod = (JavaMethod) javaMember;
			if (parameterTypes.length != javaMethod.getParameters().size()) {
				continue;
			}
			for (int i = 0; i < parameterTypes.length; i++) {
				if (! parameterTypes[i].equals(javaMethod.getParameters().get(i))) {
					continue outer;
				}
			}
			// found method with desired signature
			return javaMethod;
		}
		// no method with desired signature found
		JavaMethod javaMethod = JexFactory.eINSTANCE.createJavaMethod();
		javaMethod.setName(name);
		javaMethod.setReturnType(returnType);
		addAll(javaMethod.getParameters(), parameterTypes);
		if (exceptionTypes != null) {
			addAll(javaMethod.getThrowables(), exceptionTypes);
		}
		javaMembers.add(javaMethod);
		return javaMethod;
	}

	protected <T> void addAll(Collection<T> col, T[] values) {
		for (int j = 0; j < values.length; j++) {
			col.add(values[j]);
		}
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
				superClasses = parseTypeList(testsAnnotation.substring(extendsPos + EXTENDS_KEYWORD.length(), implementsPos > extendsPos ? implementsPos : testsAnnotation.length()));
			}
			if (implementsPos >= 0) {
				superInterfaces = parseTypeList(testsAnnotation.substring(implementsPos + IMPLEMENTS_KEYWORD.length(), extendsPos > implementsPos ? extendsPos : testsAnnotation.length()));
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
		addAll(javaClass.getSuperclasses(), superClasses);
		addAll(javaClass.getSuperclasses(), superInterfaces);
		javaClassTester.getTestedElements().add(javaClass);
		ExercisePart part = ensureExercisePart(exercise, packageName);
		if (req instanceof JUnitTest) {
			((JUnitTest) req).setTestRunnable(javaClassTester);
		}
		req.setJavaElement(javaClassTester); // redundant?
		part.getRequirements().add(req);
		return req;
	}
	
	private static final char TYPE_LIST_SEPARATOR = ',';

	private String[] parseTypeList(String s) {
		Collection<String> typeList = new ArrayList<String>();
		parseTypeList(s, 0, typeList);
		return typeList.toArray(new String[typeList.size()]);
	}

	private int parseTypeList(String s, int start, Collection<String> types) {
		int pos = start;
		while (pos < s.length()) {
			pos = parseType(s, pos, types);
			if (pos >= s.length()) {
				break;
			}
			char c = s.charAt(pos);
			if (c == TYPE_LIST_SEPARATOR || Character.isWhitespace(c)) {
				pos++;
			} else {
				break;
			}
		}
		return pos;
	}
	
	private int parseType(String s, int start, Collection<String> types) {
		int pos = start;
		for (; pos < s.length(); pos++) {
			char c = s.charAt(pos);
			if (Character.isJavaIdentifierPart(c) || ".?& ".indexOf(c) >= 0) {
				continue;
			} else if (c == '<') {
				pos = parseTypeList(s, pos + 1, null);
				if (s.charAt(pos) == '>') {
					pos++;
				}
				return pos;
			} else {
				break;
			}
		}
		if (types != null) {
			types.add(s.substring(start, pos).trim());
		}
		return pos;
	}
	
	private String[] visibilityPrefixes = {
		"public ", 		"public",
		"+", 			"public",
		"protected ", 	"protected",
		"private ", 	"private",
		"-", 			"private",
	};
	
	protected JUnitTest ensureJunitTest(JavaMethodTester javaMethodTester, String testsAnnotation, Iterable<Member> methodParents, AbstractRequirement reqParent) {

		// create and initialize JUnit test
		JUnitTest testReq = JexFactory.eINSTANCE.createJUnitTest();
		testReq.setText("Test");
		javaMethodTester.setReturnType("void");
		testReq.setJavaElement(javaMethodTester);
		testReq.setTestRunnable(javaMethodTester);
		
		reqParent.getRequirements().add(testReq);

		JavaClass methodParent = null;
		for (Member member : methodParents) {
			if (member instanceof JavaClass) {
				methodParent = (JavaClass) member;
				break;
			}
		}
		// add java elements and requirements for the tested elements
		String[] testedElements = testsAnnotation.split(";");
		for (int i = 0; i < testedElements.length; i++) {
			String testedElementName = testedElements[i].trim();
			String returnType = null, modifiers = null;
			for (int j = 0; j < visibilityPrefixes.length; j += 2) {
				String prefix = visibilityPrefixes[j];
				if (testedElementName.startsWith(prefix)) {
					modifiers = visibilityPrefixes[j + 1];
					testedElementName = testedElementName.substring(prefix.length());
					break;
				}
			}
			testReq.setText(testReq.getText() + " " + testedElementName);
			int pos1 = testedElementName.indexOf('('), pos = testedElementName.lastIndexOf(' ', pos1 >= 0 ? pos1 : testedElementName.length());
			if (pos >= 0) {
				returnType = testedElementName.substring(0, pos);
				pos1 -= pos + 1;
				testedElementName = testedElementName.substring(pos + 1);
			}
			int pos2 = testedElementName.lastIndexOf(')');
			Member testedElement = null;
			if (pos1 >= 0 && pos2 >= 0) {
				String[] params = {}, exceptions = {};
				if (pos2 > pos1 + 2) {
					params = parseTypeList(testedElementName.substring(pos1 + 1, pos2));
				}
				String THROWS_KEYWORD = "throws ";
				int pos3 = testedElementName.indexOf(THROWS_KEYWORD, pos2);
				if (pos3 >= pos2) {
					exceptions = parseTypeList(testedElementName.substring(pos3 + THROWS_KEYWORD.length()));
				}
				testedElementName = testedElementName.substring(0, pos1);
				if (methodParent == null) {
					continue;
				}
				if (testedElementName != methodParent.getName() && returnType == null) {
					returnType = "void";
				}
				JavaMethod javaMethod = (JavaMethod) ensureJavaMethod(testedElementName, returnType, params, exceptions, methodParent.getMembers());
				testedElement = javaMethod;
			} else {
				JavaField javaField = (JavaField) ensureJavaElement(testedElementName, methodParent.getMembers(), JexPackage.eINSTANCE.getJavaField());
				javaField.setType(returnType);
				testedElement = javaField;
			}
			javaMethodTester.getTestedElements().add(testedElement);
			JavaRequirement javaReq = JexFactory.eINSTANCE.createJavaRequirement();
			javaReq.setText("Requires " + testedElementName);
			javaReq.setJavaElement(testedElement);

			if (modifiers != null) {
				testedElement.setModifiers((Integer) JexFactory.eINSTANCE.createFromString(JexPackage.eINSTANCE.getModifiers(), modifiers));
			} else {
				javaReq.setRequiredFeatures("!modifiers");
			}
			testReq.getRequirements().add(javaReq);
		}
		return testReq;
	}
	
	protected String convertMarkupFeatures(String markupText, String markupLanguage) {
		return markupText;
	}
}
