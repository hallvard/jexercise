package no.hal.jex.editor.commands;

import no.hal.jex.Exercise;
import no.hal.jex.jdt.JdtHelper;
import no.hal.jex.jdt.JdtTestAnnotationsToModelConverter;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;

public class CreateExerciseFromTestAnnotationsCommand extends AbstractCommand
implements CommandActionDelegate {

	private Exercise exercise;
	private IJavaElement javaElement;
	private String pathPattern;

	public CreateExerciseFromTestAnnotationsCommand(Exercise ex, IJavaElement javaElement) {
		this.exercise = ex;
		this.javaElement = javaElement;
	}

	public CreateExerciseFromTestAnnotationsCommand(Exercise ex, IResource folder) {
		this.exercise = ex;
		IJavaProject javaProject = JdtHelper.getJavaProject(ex.eResource().getURI());
		IPackageFragmentRoot packageFragmentRoot = javaProject.getPackageFragmentRoot(folder);
		this.javaElement = packageFragmentRoot;
	}
	public CreateExerciseFromTestAnnotationsCommand(Exercise ex, String packageFragmentRootName) {
		this(ex, JdtHelper.getProject(ex.eResource().getURI()).findMember("tests"));
	}

	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}

	private JdtTestAnnotationsToModelConverter testAnnotationsToModelConverter = new JdtTestAnnotationsToModelConverter(exercise, javaElement);
	
	private boolean simplifyRequirements = true;

	public void execute() {
		testAnnotationsToModelConverter.convert();
	}

//	private static void simplifyRequirements(Exercise ex) {
//		EList<AbstractRequirement> requirements = ex.getRequirements();
//		if (requirements.size() == 1) {
//			AbstractRequirement req = requirements.get(0);
//			requirements.clear();
//			requirements.addAll(req.getRequirements());
//		}
//	}
//
//	private void createFromTestAnnotations(IJavaElement javaElement) {
//		if (javaElement instanceof IPackageFragmentRoot || javaElement instanceof IPackageFragment || javaElement instanceof ICompilationUnit) {
//			if ((! (javaElement instanceof ICompilationUnit)) || pathPattern == null || ((ICompilationUnit) javaElement).getPath().toString().matches(pathPattern)) {
//				for (IJavaElement child : getJavaElementChildren((IParent) javaElement)) {
//					createFromTestAnnotations(child);
//				}
//			}
//		} else if (javaElement instanceof IType) {
//			String typeName = javaElement.getElementName();
//			if (typeName.endsWith(CreateChildrenFromJavaModelCommand.TEST_CLASS_NAME_SUFFIX)) {
//				createFromTestClassAnnotations((IType) javaElement);
//			} else if (CreateChildrenFromJavaModelCommand.ALL_TESTS_TEST_SUITE_NAME.equals(typeName)) {
//				createFromTestSuiteAnnotations((IType) javaElement);
//			}
//		}
//	}
//
//	private TestSuite createFromTestSuiteAnnotations(IType type) {
//		IMemberValuePair[] valuePairs = JdtHelper.getAnnotationValuePairs(type, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
//		String tests = (String) JdtHelper.getAnnotationValue(valuePairs, "tests", IMemberValuePair.K_STRING);
//		if (tests == null || tests.length() == 0) {
//			return null;
//		}
//		String[] testedElements = tests.split(";");
//		IPackageFragment packageFragment = (IPackageFragment) type.getAncestor(IJavaElement.PACKAGE_FRAGMENT);
//		IJavaProject javaProject = JdtHelper.getJavaProject(exercise.eResource());
//		for (int i = 0; i < testedElements.length; i++) {
//			String testedElementName = testedElements[i];
//			if (testedElementName.indexOf('.') < 0) {
//				testedElementName = getPackageName(type) + "." + testedElementName;
//			}
//			IJavaElement testedElement = null;
//			try {
//				testedElement = javaProject.findElement(new Path(testedElementName.replace('.', '/')));
//			} catch (JavaModelException e) {
//			}
//			if (testedElement instanceof IType) {
//				createFromTestClassAnnotations((IType) testedElement);
//			}
//		}
//		TestSuite allTests = (TestSuite) ensureJavaClass(getPackageName(type), type.getElementName(), JexPackage.eINSTANCE.getTestSuite());
//		return allTests;
//	}
//
//	private String getPackageName(IType type) {
//		String qName = type.getFullyQualifiedName();
//		int pos = qName.lastIndexOf(".");
//		return (pos < 0 ? "" : qName.substring(0, pos));
//	}
//	
//	private JavaRequirement createFromTestClassAnnotations(IType type) {
//		String testedClassName = type.getElementName();
//		if (testedClassName.endsWith(CreateChildrenFromJavaModelCommand.TEST_CLASS_NAME_SUFFIX)) {
//			testedClassName = testedClassName.substring(0, testedClassName.length() - CreateChildrenFromJavaModelCommand.TEST_CLASS_NAME_SUFFIX.length());
//		}
//		IMemberValuePair[] valuePairs = JdtHelper.getAnnotationValuePairs(type, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
//		String tests = (String) JdtHelper.getAnnotationValue(valuePairs, "tests", IMemberValuePair.K_STRING);
//		JavaRequirement req = null;
//		if (tests != null && tests.length() > 0) {
//			req = JexFactory.eINSTANCE.createJUnitTest();
//		} else {
//			tests = testedClassName;
//			req = JexFactory.eINSTANCE.createJavaRequirement();
//		}
//		String packageName = getPackageName(type);
//		req.setText((req instanceof JUnitTest ? "Test " : "") + packageName  + "." + tests);
//		JavaClassTester javaClassTester = (JavaClassTester) ensureJavaClass(packageName, type.getElementName(), JexPackage.eINSTANCE.getJavaClassTester());
//		int pos = tests.lastIndexOf('.');
//		if (pos >= 0) {
//			packageName = tests.substring(0, pos);
//			tests = tests.substring(pos + 1);
//		}
//		JavaClass javaClass = ensureJavaClass(packageName, tests, JexPackage.eINSTANCE.getJavaClass());
//		javaClassTester.setTestedElement(javaClass);
//		ExercisePart part = ensureExercisePart(exercise, packageName);
//		if (req instanceof JUnitTest) {
//			((JUnitTest) req).setTestRunnable(javaClassTester);
//		}
//		req.setJavaElement(javaClassTester); // redundant?
//		String description = (String) JdtHelper.getAnnotationValue(valuePairs, "description", IMemberValuePair.K_STRING);
//		req.setDescription(description);
//		part.getRequirements().add(req);
//		for (IJavaElement child : getJavaElementChildren(type)) {
//			if (child instanceof IMethod && CreateChildrenFromJavaModelCommand.isMethodTester((IMethod) child)) {
//				String methodName = child.getElementName();
//				String namePrefix = CreateChildrenFromJavaModelCommand.TEST_METHOD_NAME_PREFIX;
//				if (methodName.startsWith(namePrefix)) {
//					String testedMethodName = Character.toLowerCase(methodName.charAt(namePrefix.length())) + methodName.substring(namePrefix.length() + 1);
//					createFromTestMethodAnnotations((IMethod) child, testedMethodName, javaClassTester, javaClass, req);
//				}
//			}
//		}
//		return req;
//	}
//
//	private JavaRequirement createFromTestMethodAnnotations(IMethod method, String testedMethodName, JavaClassTester methodTesterParent, JavaClass methodParent, AbstractRequirement reqParent) {
//		IMemberValuePair[] valuePairs = JdtHelper.getAnnotationValuePairs(method, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
//		String tests = (String) JdtHelper.getAnnotationValue(valuePairs, "tests", IMemberValuePair.K_STRING);
//		if (tests == null) {
//			tests = testedMethodName;
//		}
//		JavaMethodTester javaMethodTester = (JavaMethodTester) ensureJavaMethod(methodTesterParent, method.getElementName(), JexPackage.eINSTANCE.getJavaMethodTester());
//		javaMethodTester.setReturnType("void");
//
//		String[] testedElements = tests.split(";");
//		for (int i = 0; i < testedElements.length; i++) {
//			String testedElementName = testedElements[i].trim();
//			String returnType = null;
//			int pos = testedElementName.indexOf(' ');
//			if (pos >= 0) {
//				returnType = testedElementName.substring(0, pos);
//				testedElementName = testedElementName.substring(pos + 1);
//			}
//			int pos1 = testedElementName.indexOf('('), pos2 = testedElementName.lastIndexOf(')');
//			String[] params = null;
//			if (pos1 >= 0) {
//				if (pos2 > pos1 + 1) {
//					String substring = testedElementName.substring(pos1 + 1, pos2).trim();
//					if (substring.length() > 0) {
//						params = substring.split(",");
//					}
//				}
//				testedElementName = testedElementName.substring(0, pos1);
//			}
//			JavaMethod javaMethod = ensureJavaMethod(methodParent, testedElementName, JexPackage.eINSTANCE.getJavaMethod());
//			if (testedElementName != methodParent.getName() && returnType == null) {
//				returnType = "void";
//			}
//			javaMethod.setReturnType(returnType);
//			for (int j = 0; params != null && j < params.length; j++) {
//				javaMethod.getParameters().add(params[j].trim());
//			}
//			javaMethodTester.setTestedElement(i > 0 ? null : javaMethod);
//	
//			JavaRequirement javaReq = JexFactory.eINSTANCE.createJavaRequirement();
//			javaReq.setText("Create " + testedElementName);
//			javaReq.setJavaElement(javaMethod);
//	
//			reqParent.getRequirements().add(javaReq);
//		}
//		JUnitTest testReq = JexFactory.eINSTANCE.createJUnitTest();
//		testReq.setText("Test " + tests);
//		testReq.setJavaElement(javaMethodTester);
//		testReq.setTestRunnable(javaMethodTester);
//		
//		String description = (String) JdtHelper.getAnnotationValue(valuePairs, "description", IMemberValuePair.K_STRING);
//		testReq.setDescription(description);
//		
//		reqParent.getRequirements().add(testReq);
//
//		return testReq;
//	}
//
//	private JavaPack ensureJavaPack(String packageName, EList javaElements) {
//		return (JavaPack) ensureJavaElement(packageName, javaElements, JexPackage.eINSTANCE.getJavaPack());
//	}
//
//	private JavaClass ensureJavaClass(String packagePrefix, String elementName, EClass eClass) {
//		JavaPack javaPack = ensureJavaPack(packagePrefix, exercise.getJavaElements());
//		return (JavaClass) ensureJavaElement(elementName, javaPack.getClasses(), eClass);
//	}
//
//	private JavaMethod ensureJavaMethod(JavaClass javaClass, String elementName, EClass eClass) {
//		return (JavaMethod) ensureJavaElement(elementName, javaClass.getMembers(), eClass);
//	}
//
//	private JavaElement findJavaElement(String name, EList<? extends JavaElement> javaElements, EClass eClass) {
//		for (JavaElement javaElement : javaElements) {
//			if (eClass.isSuperTypeOf(javaElement.eClass())) {
//				EStructuralFeature nameFeature = eClass.getEStructuralFeature("name");
//				if (nameFeature != null && name.equals(javaElement.eGet(nameFeature))) {
//					return (JavaElement) javaElement;
//				}
//			}
//		}
//		return null;
//	}
//
//	private JavaElement ensureJavaElement(String name, EList javaElements, EClass eClass) {
//		JavaElement javaElement = findJavaElement(name, javaElements, eClass);
//		if (javaElement == null) {
//			javaElement = (JavaElement) JexFactory.eINSTANCE.create(eClass);
//			EStructuralFeature nameFeature = eClass.getEStructuralFeature("name");
//			if (nameFeature != null) {
//				javaElement.eSet(nameFeature, name);
//			}
//			javaElements.add(javaElement);
//		}
//		return javaElement;
//	}
//
//	private IJavaElement[] getJavaElementChildren(IParent parent) {
//		IJavaElement[] children = null;
//		try {
//			children = parent.getChildren();
//		} catch (JavaModelException e) {
//		}
//		return (children != null ? children : new IJavaElement[0]);
//	}
//	
//	private ExercisePart ensureExercisePart(Exercise ex, String name) {
//		for (AbstractRequirement req : ex.getRequirements()) {
//			if (req instanceof ExercisePart && name.equals(req.getText())) {
//				return (ExercisePart) req;
//			}
//		}
//		ExercisePart exercisePart = JexFactory.eINSTANCE.createExercisePart();
//		exercisePart.setText(name);
//		ex.getRequirements().add(exercisePart);
//		ensureJavaPack(name, ex.getJavaElements());
//		return exercisePart;
//	}

	public void redo() {
	}

	@Override
	protected boolean prepare() {
		return testAnnotationsToModelConverter.canConvert();
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
