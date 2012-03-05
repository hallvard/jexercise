package no.hal.jex.jdt;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexPackage;
import no.hal.jex.eval.AbstractTestAnnotationsToModelConverter;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class JdtTestAnnotationsToModelConverter extends AbstractTestAnnotationsToModelConverter {

	private IJavaElement javaElement;
	private String pathPattern;

	public JdtTestAnnotationsToModelConverter(Exercise ex, IJavaElement javaElement) {
		super(ex);
		this.javaElement = javaElement;
	}
	public JdtTestAnnotationsToModelConverter(Exercise ex, IResource folder) {
		this(ex, JdtHelper.getJavaProject(ex.eResource()).getPackageFragmentRoot(folder));
	}
	public JdtTestAnnotationsToModelConverter(Exercise ex, String packageFragmentRootName) {
		this(ex, JdtHelper.getProject(ex.eResource()).findMember(JEX_TESTS_ANNOTATION_KEY));
	}

	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}

	@Override
	public boolean canConvert() {
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
	protected void convert(Exercise ex) {
		createFromTestAnnotations(javaElement, null);
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
			if (isTestClassName(typeName)) {
				createFromTestClassAnnotations((IType) javaElement, namePrefix, typeName.substring(0, typeName.length() - AbstractTestAnnotationsToModelConverter.TEST_CLASS_NAME_SUFFIX.length()));
			} else if (isAllTestsName(typeName)) {
				ensureJavaClass(namePrefix, javaElement.getElementName(), JexPackage.eINSTANCE.getTestSuite());
			}
		}
	}

	private static boolean isMethodTester(IMethod method) {
		try {
			return method.getElementName().startsWith(AbstractTestAnnotationsToModelConverter.TEST_METHOD_NAME_PREFIX) &&
				Signature.SIG_VOID.equals(method.getReturnType()) &&
				method.getParameterTypes().length == 0 &&
				Flags.isPublic(method.getFlags());
		} catch (JavaModelException e) {
		}
		return false;
	}

	private JavaRequirement createFromTestClassAnnotations(IType type, String packageName, String testedClassName) {
		IMemberValuePair[] valuePairs = JdtHelper.getAnnotationValuePairs(type, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
		String tests = (String) JdtHelper.getAnnotationValue(valuePairs, JEX_TESTS_ANNOTATION_KEY, IMemberValuePair.K_STRING);
		JavaRequirement req = ensureJavaRequirement(packageName, type.getElementName(), testedClassName, tests);
		setAnnotationFeatures(req, valuePairs);
		IJavaElement[] children = null;
		try {
			children = type.getChildren();
		} catch (JavaModelException e) {
		}
		for (int i = 0; children != null && i < children.length; i++) {
			if (children[i] instanceof IMethod && isMethodTester((IMethod) children[i])) {
				String methodName = children[i].getElementName();
				String namePrefix = AbstractTestAnnotationsToModelConverter.TEST_METHOD_NAME_PREFIX;
				if (methodName.startsWith(namePrefix)) {
					String testedMethodName = Character.toLowerCase(methodName.charAt(namePrefix.length())) + methodName.substring(namePrefix.length() + 1);
					JavaClassTester javaClassTester = (JavaClassTester) req.getJavaElement();
					createFromTestMethodAnnotations((IMethod) children[i], testedMethodName, javaClassTester, (JavaClass) javaClassTester.getTestedElement(), req);
				}
			}
		}
		return req;
	}
	
	private void setAnnotationFeatures(AbstractRequirement req, IMemberValuePair[] valuePairs) {
		req.setDescription((String) JdtHelper.getAnnotationValue(valuePairs, JEX_DESCRIPTION_ANNOTATION_KEY, IMemberValuePair.K_STRING));
		req.setComment((String) JdtHelper.getAnnotationValue(valuePairs, JEX_COMMENT_ANNOTATION_KEY, IMemberValuePair.K_STRING));
	}

	private JavaRequirement createFromTestMethodAnnotations(IMethod method, String testedMethodName, JavaClassTester methodTesterParent, JavaClass methodParent, AbstractRequirement reqParent) {
		IMemberValuePair[] valuePairs = JdtHelper.getAnnotationValuePairs(method, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
		String tests = (String) JdtHelper.getAnnotationValue(valuePairs, JEX_TESTS_ANNOTATION_KEY, IMemberValuePair.K_STRING);
		if (tests == null) {
			tests = testedMethodName;
		}
		JavaMethodTester javaMethodTester = (JavaMethodTester) ensureJavaMethod(methodTesterParent, method.getElementName(), JexPackage.eINSTANCE.getJavaMethodTester());
		JUnitTest testReq = ensureJunitTest(javaMethodTester, tests, methodParent, reqParent);
		setAnnotationFeatures(testReq, valuePairs);
		return testReq;
	}

	private IJavaElement[] getJavaElementChildren(IParent parent) {
		IJavaElement[] children = null;
		try {
			children = parent.getChildren();
		} catch (JavaModelException e) {
		}
		return (children != null ? children : new IJavaElement[0]);
	}
}
