package no.hal.jex.editor.commands;

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
import no.hal.jex.resource.JexResource;
import no.hal.jex.ui.JexManager;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class CreateExerciseFromTestAnnotationsCommand extends AbstractCommand
implements CommandActionDelegate {

	private Exercise ex;
	private IJavaElement javaElement;
	private String pathPattern;

	public CreateExerciseFromTestAnnotationsCommand(Exercise ex, IJavaElement javaElement) {
		this.ex = ex;
		this.javaElement = javaElement;
	}

	public CreateExerciseFromTestAnnotationsCommand(Exercise ex, IResource folder) {
		this.ex = ex;
		IJavaProject javaProject = JexResource.getJavaProject(ex.eResource());
		IPackageFragmentRoot packageFragmentRoot = javaProject.getPackageFragmentRoot(folder);
		this.javaElement = packageFragmentRoot;
	}
	public CreateExerciseFromTestAnnotationsCommand(Exercise ex, String packageFragmentRootName) {
		this(ex, JexResource.getProject(ex.eResource()).findMember("tests"));
	}

	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}

	private boolean simplifyRequirements = true;

	public void execute() {
		try {
			createFromTestAnnotations(javaElement, null);
		} catch (Exception e) {
		}
		if (simplifyRequirements) {
			simplifyRequirements(ex);
		}
	}

	private static void simplifyRequirements(Exercise ex) {
		EList<AbstractRequirement> requirements = ex.getRequirements();
		if (requirements.size() == 1) {
			AbstractRequirement req = requirements.get(0);
			requirements.clear();
			requirements.addAll(req.getRequirements());
		}
	}

	private void createFromTestAnnotations(IJavaElement javaElement, String namePrefix) {
		if (javaElement instanceof IPackageFragmentRoot) {
			IJavaElement[] children = getJavaElementChildren((IParent) javaElement);
			for (int i = 0; i < children.length; i++) {
				String childName = children[i].getElementName();
				if (namePrefix == null || (childName.startsWith(namePrefix) && (! childName.equals(namePrefix)))) {
					createFromTestAnnotations(children[i], null);
				}
			}
		} else if (javaElement instanceof IPackageFragment) {
			IJavaElement parent = ((IPackageFragment) javaElement).getParent();
			namePrefix = (namePrefix != null ? namePrefix + "." : "") + ((IJavaElement) javaElement).getElementName();
			IJavaElement[] children = getJavaElementChildren((IParent) javaElement);
			for (int i = 0; i < children.length; i++) {
				createFromTestAnnotations(children[i], namePrefix);
			}
			if (parent instanceof IPackageFragmentRoot) {
				createFromTestAnnotations(parent, javaElement.getElementName() + ".");
			}
		} else if (javaElement instanceof ICompilationUnit) {
			if (pathPattern == null || ((ICompilationUnit) javaElement).getPath().toString().matches(pathPattern)) {
				IJavaElement[] children = getJavaElementChildren((IParent) javaElement);
				for (int i = 0; i < children.length; i++) {
					createFromTestAnnotations(children[i], namePrefix);
				}
			}
		} else if (javaElement instanceof IType) {
			String typeName = javaElement.getElementName();
			if (typeName.endsWith(CreateChildrenFromJavaModelCommand.TEST_CLASS_NAME_SUFFIX)) {
				createFromTestClassAnnotations((IType) javaElement, namePrefix, typeName.substring(0, typeName.length() - CreateChildrenFromJavaModelCommand.TEST_CLASS_NAME_SUFFIX.length()));
			} else if (CreateChildrenFromJavaModelCommand.ALL_TESTS_TEST_SUITE_NAME.equals(typeName)) {
				createFromTestSuiteAnnotations((IType) javaElement, namePrefix);
			}
		}
	}

	private TestSuite createFromTestSuiteAnnotations(IType javaElement, String namePrefix) {
		TestSuite allTests = (TestSuite) ensureJavaClass(namePrefix, javaElement.getElementName(), JexPackage.eINSTANCE.getTestSuite());
		return allTests;
	}

	private JavaRequirement createFromTestClassAnnotations(IType type, String packageName, String testedClassName) {
		IMemberValuePair[] valuePairs = JexManager.getAnnotationValuePairs(type);
		String tests = (String) JexManager.getAnnotationValue(valuePairs, "tests", IMemberValuePair.K_STRING);
		JavaRequirement req = null;
		if (tests != null && tests.length() > 0) {
			req = JexFactory.eINSTANCE.createJUnitTest();
		} else {
			tests = testedClassName;
			req = JexFactory.eINSTANCE.createJavaRequirement();
		}
		req.setText((req instanceof JUnitTest ? "Test " : "") + packageName + "." + tests);
		JavaClassTester javaClassTester = (JavaClassTester) ensureJavaClass(packageName, type.getElementName(), JexPackage.eINSTANCE.getJavaClassTester());
		int pos = tests.lastIndexOf('.');
		if (pos >= 0) {
			packageName = tests.substring(0, pos);
			tests = tests.substring(pos + 1);
		}
		JavaClass javaClass = ensureJavaClass(packageName, tests, JexPackage.eINSTANCE.getJavaClass());
		javaClassTester.setTestedElement(javaClass);
		ExercisePart part = ensureExercisePart(ex, packageName);
		if (req instanceof JUnitTest) {
			((JUnitTest) req).setTestRunnable(javaClassTester);
		}
		req.setJavaElement(javaClassTester); // redundant?
		String description = (String) JexManager.getAnnotationValue(valuePairs, "description", IMemberValuePair.K_STRING);
		req.setDescription(description);
		part.getRequirements().add(req);
		IJavaElement[] children = null;
		try {
			children = type.getChildren();
		} catch (JavaModelException e) {
		}
		for (int i = 0; children != null && i < children.length; i++) {
			if (children[i] instanceof IMethod && CreateChildrenFromJavaModelCommand.isMethodTester((IMethod) children[i])) {
				String methodName = children[i].getElementName();
				String namePrefix = CreateChildrenFromJavaModelCommand.TEST_METHOD_NAME_PREFIX;
				if (methodName.startsWith(namePrefix)) {
					String testedMethodName = Character.toLowerCase(methodName.charAt(namePrefix.length())) + methodName.substring(namePrefix.length() + 1);
					createFromTestMethodAnnotations((IMethod) children[i], testedMethodName, javaClassTester, javaClass, req);
				}
			}
		}
		return req;
	}

	private JavaRequirement createFromTestMethodAnnotations(IMethod method, String testedMethodName, JavaClassTester methodTesterParent, JavaClass methodParent, AbstractRequirement reqParent) {
		IMemberValuePair[] valuePairs = JexManager.getAnnotationValuePairs(method);
		String tests = (String) JexManager.getAnnotationValue(valuePairs, "tests", IMemberValuePair.K_STRING);
		if (tests == null) {
			tests = testedMethodName;
		}
		JavaMethodTester javaMethodTester = (JavaMethodTester) ensureJavaMethod(methodTesterParent, method.getElementName(), JexPackage.eINSTANCE.getJavaMethodTester());
		javaMethodTester.setReturnType("void");

		String[] testedElements = tests.split(";");
		for (int i = 0; i < testedElements.length; i++) {
			String testedElementName = testedElements[i].trim();
			String returnType = null;
			int pos = testedElementName.indexOf(' ');
			if (pos >= 0) {
				returnType = testedElementName.substring(0, pos);
				testedElementName = testedElementName.substring(pos + 1);
			}
			int pos1 = testedElementName.indexOf('('), pos2 = testedElementName.lastIndexOf(')');
			String[] params = null;
			if (pos1 >= 0 && pos2 >= 0) {
				params = testedElementName.substring(pos1 + 1, pos2).split(",");
				testedElementName = testedElementName.substring(0, pos1);
			}
			JavaMethod javaMethod = ensureJavaMethod(methodParent, testedElementName, JexPackage.eINSTANCE.getJavaMethod());
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
			javaReq.setJavaElement(javaMethodTester);
	
			reqParent.getRequirements().add(javaReq);
		}
		JUnitTest testReq = JexFactory.eINSTANCE.createJUnitTest();
		testReq.setText("Test " + tests);
		testReq.setJavaElement(javaMethodTester);
		testReq.setTestRunnable(javaMethodTester);
		
		String description = (String) JexManager.getAnnotationValue(valuePairs, "description", IMemberValuePair.K_STRING);
		testReq.setDescription(description);
		
		reqParent.getRequirements().add(testReq);

		return testReq;
	}

	private JavaPack ensureJavaPack(String packageName, EList javaElements) {
		return (JavaPack) ensureJavaElement(packageName, javaElements, JexPackage.eINSTANCE.getJavaPack());
	}

	private JavaClass ensureJavaClass(String packagePrefix, String elementName, EClass eClass) {
		JavaPack javaPack = ensureJavaPack(packagePrefix, ex.getJavaElements());
		return (JavaClass) ensureJavaElement(elementName, javaPack.getClasses(), eClass);
	}

	private JavaMethod ensureJavaMethod(JavaClass javaClass, String elementName, EClass eClass) {
		return (JavaMethod) ensureJavaElement(elementName, javaClass.getMembers(), eClass);
	}

	private JavaElement findJavaElement(String name, EList<? extends JavaElement> javaElements, EClass eClass) {
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

	private JavaElement ensureJavaElement(String name, EList javaElements, EClass eClass) {
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

	private IJavaElement[] getJavaElementChildren(IParent parent) {
		IJavaElement[] children = null;
		try {
			children = parent.getChildren();
		} catch (JavaModelException e) {
		}
		return (children != null ? children : new IJavaElement[0]);
	}
	
	private ExercisePart ensureExercisePart(Exercise ex, String name) {
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

	public void redo() {
	}

	@Override
	protected boolean prepare() {
		if (javaElement instanceof IPackageFragmentRoot) {
			return true;
		} else if (javaElement instanceof IPackageFragment) {
			return true;
		} else if (javaElement instanceof IType) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		return ("Create Exercise from test annotations");
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return getDescription();
	}

	public String getToolTipText() {
		return getDescription();
	}
}
