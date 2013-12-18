package no.hal.jex.jdt;

import java.util.HashMap;
import java.util.Map;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.TestSuite;
import no.hal.jex.eval.AbstractTestAnnotationsToModelConverter;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.Flags;
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
import org.eclipse.jdt.core.Signature;
import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.core.parser.markup.MarkupLanguage;

public class JdtTestAnnotationsToModelConverter extends AbstractTestAnnotationsToModelConverter {

	private IJavaElement javaElement;
	private String pathPattern;

	public JdtTestAnnotationsToModelConverter(Exercise exercise, IJavaElement javaElement) {
		super(exercise);
		this.javaElement = javaElement;
	}
	public JdtTestAnnotationsToModelConverter(Exercise ex, IResource folder) {
		this(ex, JdtHelper.getJavaProject(ex.eResource().getURI()).getPackageFragmentRoot(folder));
	}
	public JdtTestAnnotationsToModelConverter(Exercise ex, String packageFragmentRootName) {
		this(ex, JdtHelper.getProject(ex.eResource().getURI()).findMember(JEX_TESTS_ANNOTATION_KEY));
	}

	public void setPathPattern(String pathPattern) {
		this.pathPattern = pathPattern;
	}

	@Override
	public boolean canConvert() {
		return (javaElement instanceof IPackageFragmentRoot || javaElement instanceof IPackageFragment || javaElement instanceof ICompilationUnit);
	}

	@Override
	protected void convert(Exercise ex) {
		createFromTestAnnotations(javaElement);
	}

	private String getPackageName(IType type) {
		String qName = type.getFullyQualifiedName();
		int pos = qName.lastIndexOf(".");
		return (pos < 0 ? "" : qName.substring(0, pos));
	}

	private void createFromTestAnnotations(IJavaElement javaElement) {
		if (javaElement instanceof IPackageFragmentRoot || javaElement instanceof IPackageFragment || javaElement instanceof ICompilationUnit) {
			IJavaElement[] children = JdtHelper.getJavaElementChildren((IParent) javaElement);
			if (javaElement instanceof IPackageFragment) {
				// check if this package has a test suite
				for (IJavaElement child : children) {
					String name = child.getElementName();
					if (child instanceof ICompilationUnit) {
						int pos = name.lastIndexOf('.');
						if (pos > 0) {
							name = name.substring(0, pos);
						}
					}
					if (isAllTestsName(name)) {
						createFromTestAnnotations(child);
						return;
					}
				}
			}
			for (int i = 0; i < children.length; i++) {
				createFromTestAnnotations(children[i]);
			}
		} else if (javaElement instanceof IType) {
			String typeName = javaElement.getElementName();
			if (isTestClassName(typeName)) {
				createFromTestClassAnnotations((IType) javaElement, typeName.substring(0, typeName.length() - AbstractTestAnnotationsToModelConverter.TEST_CLASS_NAME_SUFFIX.length()));
			} else if (isAllTestsName(typeName)) {
				createFromTestSuiteAnnotations((IType) javaElement);
			}
		}
	}

	private TestSuite createFromTestSuiteAnnotations(IType type) {
		IMemberValuePair[] valuePairs = JdtHelper.getAnnotationValuePairs(type, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
		String tests = (String) JdtHelper.getAnnotationValue(valuePairs, "tests", IMemberValuePair.K_STRING);
		if (tests == null || tests.length() == 0) {
			return null;
		}
		String[] testedElements = tests.split(";");
		IJavaProject javaProject = type.getJavaProject();
		for (int i = 0; i < testedElements.length; i++) {
			String testedElementName = testedElements[i].trim();
			if (testedElementName.indexOf('.') < 0) {
				testedElementName = getPackageName(type) + "." + testedElementName;
			}
			try {
				// path must be on the form java/lang/Object.java 
				Path path = new Path(testedElementName.replace('.', '/') + ".java");
				IJavaElement testedElement = javaProject.findElement(path);
				createFromTestAnnotations(testedElement);
			} catch (JavaModelException e) {
			}
		}
		TestSuite allTests = (TestSuite) ensureJavaClass(getPackageName(type), type.getElementName(), JexPackage.eINSTANCE.getTestSuite());
		return allTests;
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

	private JavaRequirement createFromTestClassAnnotations(IType type, String testedClassName) {
		IMemberValuePair[] annotations = JdtHelper.getAnnotationValuePairs(type, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
		String tests = (String) JdtHelper.getAnnotationValue(annotations, JEX_TESTS_ANNOTATION_KEY, IMemberValuePair.K_STRING);
		JavaRequirement req = ensureJavaRequirement(getPackageName(type), type.getElementName(), testedClassName, tests, false);
		setAnnotationFeatures(req, annotations);
		for (IJavaElement child : JdtHelper.getJavaElementChildren(type)) {
			if (child instanceof IMethod && isMethodTester((IMethod) child)) {
				String methodName = child.getElementName();
				String namePrefix = AbstractTestAnnotationsToModelConverter.TEST_METHOD_NAME_PREFIX;
				if (methodName.startsWith(namePrefix)) {
					String testedMethodName = Character.toLowerCase(methodName.charAt(namePrefix.length())) + methodName.substring(namePrefix.length() + 1);
					JavaClassTester javaClassTester = (JavaClassTester) req.getJavaElement();
					createFromTestMethodAnnotations((IMethod) child, testedMethodName, javaClassTester, javaClassTester.getTestedElements(), req, annotations);
				}
			}
		}
		return req;
	}

	private void setAnnotationFeatures(AbstractRequirement req, IMemberValuePair[]... annotations) {
		req.setDescription(convertMarkupFeatures((String) JdtHelper.getAnnotationValue(annotations[0], JEX_DESCRIPTION_ANNOTATION_KEY, IMemberValuePair.K_STRING), annotations));
		req.setComment(convertMarkupFeatures((String) JdtHelper.getAnnotationValue(annotations[0], JEX_COMMENT_ANNOTATION_KEY, IMemberValuePair.K_STRING), annotations));
	}

	private JavaRequirement createFromTestMethodAnnotations(IMethod method, String testedMethodName, JavaClassTester methodTesterParent, Iterable<Member> methodParent, AbstractRequirement reqParent, IMemberValuePair[] parentAnnotations) {
		IMemberValuePair[] annotations = JdtHelper.getAnnotationValuePairs(method, AbstractTestAnnotationsToModelConverter.JEX_ANNOTATION_NAME);
		String tests = (String) JdtHelper.getAnnotationValue(annotations, JEX_TESTS_ANNOTATION_KEY, IMemberValuePair.K_STRING);
		if (tests == null) {
			tests = testedMethodName;
		}
		JavaMethodTester javaMethodTester = (JavaMethodTester) ensureJavaElement(method.getElementName(), methodTesterParent.getMembers(), JexPackage.eINSTANCE.getJavaMethodTester());
		JUnitTest testReq = ensureJunitTest(javaMethodTester, tests, methodParent, reqParent);
		setAnnotationFeatures(testReq, annotations, parentAnnotations);
		return testReq;
	}

	// markup support using wikitext
	
	protected String findMarkupLanguageAnnotation(IMemberValuePair[]... annotations) {
		for (IMemberValuePair[] valuePairs : annotations) {
			String markupLanguageName = (String) JdtHelper.getAnnotationValue(valuePairs, JEX_MARKUP_LANGUAGE_ANNOTATION_KEY, IMemberValuePair.K_STRING);
			if (markupLanguageName != null && markupLanguageName.trim().length() > 0) {
				return markupLanguageName;
			}
		}
		return null;
	}

	protected String convertMarkupFeatures(String markupText, IMemberValuePair[]... annotations) {
		return convertMarkupFeatures(markupText, findMarkupLanguageAnnotation(annotations));
	}

	@Override
	protected String convertMarkupFeatures(String markupText, String markupLanguageName) {
		if (markupText != null && markupLanguageName != null) {
			MarkupLanguage markupLanguage = getMarkupLanguage(markupLanguageName);
			if (markupLanguage != null) {
				MarkupParser markupParser = new MarkupParser(markupLanguage);
				return markupParser.parseToHtml(markupText);
			}
		}
		return markupText;
	}
	
	private Map<String, MarkupLanguage> markupLanguages;
	
	private MarkupLanguage getMarkupLanguage(String markupLanguageName) {
		if (markupLanguages != null && markupLanguages.containsKey(markupLanguageName)) {
			return markupLanguages.get(markupLanguageName);
		}
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.mylyn.wikitext.core.markupLanguage");
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
			try {
				if (matches(markupLanguageName, element)) {
					MarkupLanguage markupLanguage = (MarkupLanguage) element.createExecutableExtension("class");
					if (markupLanguages == null) {
						markupLanguages = new HashMap<String, MarkupLanguage>();
					}
					markupLanguages.put(markupLanguageName, markupLanguage);
					return markupLanguage;
				}
			} catch (CoreException e) {
				System.err.println(e);
			}
		}
		return null;
	}
	
	private boolean matches(String markupLanguageName, IConfigurationElement element) {
		String name = element.getAttribute("name"), fileExtensions = element.getAttribute("fileExtensions");
		return (markupLanguageName.equals(name) || fileExtensions.contains(markupLanguageName));
	}
}
