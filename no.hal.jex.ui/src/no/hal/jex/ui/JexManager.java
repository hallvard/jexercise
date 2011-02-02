/*
 * Created on 18.mai.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package no.hal.jex.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JUnitTest;
import no.hal.jex.JUnitTestStatus;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaPack;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexFactory;
import no.hal.jex.Requirement;
import no.hal.jex.TestRunnable;
import no.hal.jex.editor.commands.CreateExerciseFromTestAnnotationsCommand;
import no.hal.jex.resource.JexResource;
import no.hal.jex.util.JexValidator;
import no.hal.jex.views.ExerciseView;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IAnnotatable;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.junit.JUnitCore;
import org.eclipse.jdt.junit.TestRunListener;
import org.eclipse.jdt.junit.launcher.JUnitLaunchShortcut;
import org.eclipse.jdt.junit.model.ITestCaseElement;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jdt.junit.model.ITestRunSession;
import org.eclipse.jface.viewers.StructuredSelection;
import org.osgi.framework.Bundle;

/**
 * @author hal
 */
public class JexManager extends TestRunListener implements
IElementChangedListener, IResourceChangeListener {

	private String jexPathPattern;
	private int exCount;

	private JexLogWriter jexLogWriter;

	public JexManager(String jexPathPattern /*, int exCount */) {
		this.exCount = exCount;

		JavaCore.addElementChangedListener(this);
		JUnitCore.addTestRunListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		jexLogWriter = new JexLogWriter();
	}

	public void dispose() {
		JUnitCore.removeTestRunListener(this);
		JavaCore.removeElementChangedListener(this);
	}

	public void setJexPathPattern(String jexPathPattern) {
		this.jexPathPattern = jexPathPattern;
		refreshExerciseResources(true);
	}

	private void refreshExerciseResources(boolean force) {
		final JexResource[] resources = getExerciseResources(force);
		exView.asyncExec(new Runnable() {
			public void run() {
				exView.refreshExercises(resources);
			}
		});
	}

	private ExerciseView exView;

	public void setViewer(ExerciseView view) {
		this.exView = view;
	}

	public void log(String message, int severity, Throwable e) {
		Bundle bundle = JexUiPlugin.getPlugin().getBundle();
		Platform.getLog(bundle).log(new Status(severity, bundle.getSymbolicName(), Status.OK, message, e));
	}

	private int logMask    = IStatus.ERROR | IStatus.WARNING;
	private int jexLogMask = IStatus.ERROR | IStatus.WARNING | IStatus.CANCEL | IStatus.INFO | IStatus.OK;

	private static boolean matchSeverity(int severity, int mask) {
		return (mask & severity) != 0;
	}

	public void jexLog(EObject eo, String key, Object value, Integer severity) {
		if (severity != null) {
			if (matchSeverity(severity.intValue(), jexLogMask)) {
				jexLogWriter.log(eo, key, value, severity.intValue());
			}
			if (matchSeverity(severity.intValue(), logMask)) {
				Resource res = eo.eResource();
				String suffix = key + (value != null ? " " + value : "");
				log(res.getURI() + "#" + res.getURIFragment(eo) + " - " + suffix, severity.intValue(), null);
			}
		}
	}

	public void jexLog(Resource res, String key, Object value, Integer severity) {
		if (severity != null) {
			if (matchSeverity(severity.intValue(), jexLogMask)) {
				jexLogWriter.log(res, key, value, severity.intValue());
			}
			if (matchSeverity(severity.intValue(), logMask)) {
				log(res.getURI() + " - " + key, severity.intValue(), null);
			}
		}
	}

	private boolean validateRequirementsOnLoad = true;

	public void setValidateRequirementsOnLoad(boolean validateRequirementsOnLoad) {
		this.validateRequirementsOnLoad = validateRequirementsOnLoad;
	}

	private class ResourceDeltaVisitor implements IResourceDeltaVisitor {
		public boolean visit(IResourceDelta delta) throws CoreException {
			return (! resourceChanged(delta.getResource(), delta.getKind()));
		}
	}
	private IResourceDeltaVisitor resourceDeltaVisitor = new ResourceDeltaVisitor();

	public void resourceChanged(IResourceChangeEvent event) {
		IResource res = event.getResource();
		if (res != null) {
			resourceChanged(res, event.getDelta().getKind());
		} else {
			try {
				event.getDelta().accept(resourceDeltaVisitor);
			} catch (CoreException e) {
			}
		}
	}

	private static boolean isExerciseResource(IResource res) {
		return res != null && isExerciseResourceName(res.getName());
	}

	public static boolean isExerciseResourceName(String name) {
		return name.endsWith(JexResource.JEX_EXTENSION) && name.endsWith("." + JexResource.JEX_EXTENSION);
	}

	private boolean resourceChanged(IResource res, int kind) {
		if (! isExerciseResource(res)) {
			return false;
		}
		JexResource ex = getExerciseResource(URI.createPlatformResourceURI(res.getFullPath().toString(), true));
		if (ex != null && kind != IResourceDelta.REMOVED) {
			refreshExerciseResource(ex);
		} else {
			refreshExerciseResources(true);
		}
		return ex != null;
	}

	public void refreshExerciseResource(JexResource res) {
		if (res == null || indexOfExerciseResource(res) < 0) {
			return;
		}
		res.refreshUri();
		if (exView != null) {
			exView.refreshViewer(res);
		}
	}

	private JexResource[] exercises = null; 

	public int getExerciseCount() {
		return exCount;
	}

	private String classifyResourceException(Exception e) {
		if (e instanceof WrappedException) {
			e = ((WrappedException)e).exception();
		}
		String s = e.getClass().getName();
		if (s.startsWith("org.eclipse.emf.ecore.xmi")) { 
			return "XMI";
		} else if (s.startsWith("org.xml.sax")) {
			return "XML";
		}
		return null;
	}

	public JexResource createExerciseResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		JexResource res;
		try {
			res = (JexResource)resSet.getResource(uri, true);
		} catch (RuntimeException e) {
			String problem = classifyResourceException(e);
			if (problem != null) {
				log(problem + " problem with " + uri + ", consider fixing or removing it", Status.WARNING, e);
			}
			return null;
		}
		resolveContainmentProxies(res);
		if (validateRequirementsOnLoad) {
			validateRequirements(res, null);
		}
		return res;
	}

	private JexResource createTestsExerciseResource(URI uri, Exercise ex) {
		ResourceSet resSet = new ResourceSetImpl();
		JexResource res = (JexResource)resSet.createResource(uri);
		res.getContents().add(ex);
		if (validateRequirementsOnLoad) {
			validateRequirements(res, null);
		}
		return res;
	}

	protected JexResource[] getExerciseResources(boolean reload) {
		if (exercises == null || reload) {
			List<JexResource> resources = new ArrayList<JexResource>();
			addExercises(resources);
			exercises = (JexResource[])resources.toArray(new JexResource[resources.size()]);
		}
		return exercises;
	}

	private String getRegexForPathPattern(String[] segments) {
		String regex = Pattern.quote(segments[0]);
		for (int i = 1; i < segments.length; i++) {
			regex += ".*" + Pattern.quote(segments[i]);
		}
		return regex;
	}

	private void addExercises(final List<JexResource> resources) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String wildcard = Pattern.quote("*");
		String[] segments = (jexPathPattern != null ? jexPathPattern.split(wildcard) : new String[0]);
		final String pathPattern = (segments.length == 0 ? null : getRegexForPathPattern(segments));
		final String pathPrefix = (segments.length == 0 ? null : segments[0]);
		try {
			root.accept(new IResourceVisitor() {
				public boolean visit(IResource resource) throws CoreException {
					IPath path = resource.getFullPath();
					String pathString = path.toString();
					if (pathPrefix != null && (! pathString.startsWith(pathPrefix))) {
						return false;
					}
					if (resource instanceof IFolder && path.segmentCount() == 3) {
						addTestsExerciseResources(resource, pathPattern, resources);
					}
					if (pathString.endsWith(JexResource.JEX_EXTENSION) && (pathPattern == null || pathString.matches(pathPattern))) {
						addExerciseResources(resource, resources);
					}
					return true;
				}
			});
		} catch (CoreException e) {
		}
	}
	
	private void addExerciseResources(IResource resource, List<JexResource> resources) {
		URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
		JexResource ex = createExerciseResource(uri);
		if (ex != null) {
			resources.add(ex);
		}
	}

	private void addTestsExerciseResources(IResource resource, String pathPattern, List<JexResource> resources) {
		String[] segments = resource.getFullPath().segments();
		if (segments.length < 2) {
			return;
		}
		String projectPath = "/" + segments[0];
		IJavaProject javaProject = JexResource.getJavaProject(URI.createPlatformResourceURI(projectPath, true));
		if (javaProject == null) {
			return;
		}
		try {
			IPackageFragmentRoot packageFragmentRoot = javaProject.findPackageFragmentRoot(new Path(projectPath + "/" + segments[1]));
			if (packageFragmentRoot == null) {
				return;
			}
			String packageName = null;
			IPackageFragment packageFragment = null;
			for (int i = 2; i < segments.length; i++) {
				packageName = (packageName == null ? segments[i] : "." + segments[i]);
				IPackageFragment fragment = packageFragmentRoot.getPackageFragment(packageName);
				if (fragment != null) {
					packageFragment = fragment;
				}
			}
			IJavaElement javaElement = packageFragment != null ? packageFragment : packageFragmentRoot;
			IResource uriResource = javaElement.getCorrespondingResource();
			if (uriResource == null) {
				uriResource = resource;
			}
			URI testsResourceUri = URI.createPlatformResourceURI(uriResource.getFullPath() + "." + JexResource.JEX_EXTENSION, true);
			Exercise ex = JexFactory.eINSTANCE.createExercise();
			JexResource testRes = createTestsExerciseResource(testsResourceUri, ex);
			CreateExerciseFromTestAnnotationsCommand command = new CreateExerciseFromTestAnnotationsCommand(ex, javaElement);
			command.setPathPattern(pathPattern);
			try {
				command.execute();
				TreeIterator<EObject> it = ex.eAllContents();
				while (it.hasNext()) {
					if (it.next() instanceof JUnitTest) {
						resources.add(testRes);
						break;
					}
				}
			} catch (Exception e) {
			}
		} catch (JavaModelException e) {
		}
	}

	//	private void addExercisesResources(IContainer container, String pattern, List<JexResource> resources) {
	//		Pattern pat = (jexFilePattern != null && jexFilePattern.length() > 0 ? Pattern.compile(pattern) : null);
	//		IResource[] children = null;
	//		try {
	//			children = ((IContainer)container).members();
	//		} catch (CoreException e) {
	//		}
	//		for (int i = 0; children != null && i < children.length; i++) {
	//			IResource res = children[i];
	//			if (pat == null || pat.matcher(res.getName()).matches()) {
	//				URI uri = getResourceURI(res.getFullPath().toString());
	//				JexResource ex = createExerciseResource(uri);
	//				if (ex != null) {
	//					resources.add(ex);
	//				}
	//			}
	//		}
	//	}

	//	private void addNumberedExercises(List<JexResource> resources) {
	//		int consecutive = 0;
	//		for (int i = 0; i < exCount; i++) {
	//			URI uri = getResourceURI(i);
	//			JexResource res = createExerciseResource(uri);
	//			if (res != null) {
	//				resources.add(res);
	//				consecutive = 0;
	//			} else if (consecutive++ >= 10) {
	//				break;
	//			}
	//		}
	//	}

	//	private void addAllExercises(List<JexResource> resources) {
	//		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
	//		for (int i = 0; i < projects.length; i++) {
	//			IProject project = projects[i];
	//			if (JexResource.isJavaProject(project)) {
	//				addTestsExerciseResource(project, resources);
	//				addExerciseResources(project, 1, jexFilePattern, resources);
	//			}
	//		}
	//	}

//	private void addTestsExerciseResource(IProject project, List<JexResource> resources) {
//		Exercise ex = JexFactory.eINSTANCE.createExercise();
//		URI testsResourceUri = URI.createPlatformResourceURI(project.getName() + "/" + jexTestsFolderName + "/" + project.getName() + "." + JexResource.JEX_EXTENSION, true);
//		JexResource testRes = createTestsExerciseResource(testsResourceUri, ex);
//		Command command = new CreateExerciseFromTestAnnotationsCommand(ex, jexTestsFolderName);
//		try {
//			command.execute();
//			resources.add(testRes);
//		} catch (Exception e) {
//		}
//	}

	//	private void addExerciseResources(IContainer cont, int depth, String pattern, List<JexResource> resources) {
	//		IResource[] members = null;
	//		try {
	//			members = cont.members();
	//		} catch (CoreException e) {
	//		}
	//		for (int i = 0; members != null && i < members.length; i++) {
	//			if (! (members[i] instanceof IFolder)) {
	//				continue;
	//			}
	//			IFolder folder = (IFolder)members[i];
	//			if (depth > 1) {
	//				addExerciseResources(folder, depth - 1, pattern, resources);
	//			} else {
	//				addExercisesResources(folder, pattern, resources);
	//			}
	//		}
	//	}

	public JexResource[] getExerciseResources() {
		return getExerciseResources(false);
	}

	public JexResource getExerciseResource(Exercise ex) {
		for (int i = 0; i < exercises.length; i++) {
			JexResource res = exercises[i];
			if (res != null && ex == res.getExercise()) {
				return res;
			}
		}
		return null;
	}
	public JexResource getExerciseResource(URI uri) {
		for (int i = 0; i < exercises.length; i++) {
			JexResource res = exercises[i];
			if (res != null && uri.equals(res.getURI())) {
				return res;
			}
		}
		return null;
	}

	public int indexOfExerciseResource(JexResource res) {
		for (int i = 0; i < exercises.length; i++) {
			if (exercises[i] == res) {
				return i;
			}
		}
		return -1;
	}

	public final static String REQUIREMENT_SATISFIED = "requirement satisfied";

	public Integer logSatisfiedChangesSeverity = null; // new Integer(IStatus.INFO);

	private void setRequirementSatisfied(Requirement req, Boolean result, List<AbstractRequirement> changes) {
		Boolean oldResult = req.getSatisfied();
		req.setTime(validationTime);
		req.setSatisfied(result);
		if (result != oldResult && changes != null) {
			changes.add(req);
			jexLog(req, REQUIREMENT_SATISFIED, result, logSatisfiedChangesSeverity);
		}
	}

	public Boolean validateChildrenRequirements(AbstractRequirement req, List<AbstractRequirement> changes) {
		IJavaProject javaProject = JexResource.getJavaProject(req.eResource());
		Boolean oldResult = req.getChildrenSatisfied();
		Boolean childrenResult = Boolean.TRUE;
		for (AbstractRequirement childReq : req.getRequirements()) {
			Boolean childResult = null;
			if (childReq instanceof Requirement) {
				if (req instanceof Requirement && ((Requirement)req).getSatisfied() != Boolean.TRUE) {
				} else if (childReq instanceof JavaRequirement) {
					childResult = ((JavaRequirement)childReq).validateRequirement(javaProject);
				}
				setRequirementSatisfied((Requirement)childReq, childResult, changes);
			}
			childResult = JexValidator.satisfiedAnd(childResult, validateChildrenRequirements(childReq, changes));
			childrenResult = JexValidator.satisfiedAnd(childrenResult, childResult);
		}
		req.setChildrenSatisfied(childrenResult);
		if (childrenResult != oldResult && changes != null) {
			changes.add(req);
		}
		return childrenResult;
	}

	void resolveContainmentProxies(JexResource res) {
		Exercise ex = res.getExercise();
		if (ex != null) {
			resolveContainmentProxies(ex);
		}
	}
	private void resolveContainmentProxies(AbstractRequirement req) {
		List<AbstractRequirement> reqs = req.getRequirements();
		for (AbstractRequirement aReq : reqs) {
			resolveContainmentProxies(aReq);
		}
		List<JavaElement> javaElements = req.getJavaElements();
		for (JavaElement javaElement : javaElements) {
			resolveContainmentProxies(javaElement);
		}
	}
	private void resolveContainmentProxies(JavaElement javaElement) {
		List<JavaClass> children = null;
		if (javaElement instanceof JavaPack) {
			children = ((JavaPack)javaElement).getClasses();
		}
		if (children != null) {
			for (int i = 0; i < children.size(); i++) {
				JavaElement child = (JavaElement)children.get(i);
				if (child.eContainer() != javaElement && javaElement instanceof JavaPack && child instanceof JavaClass) {
					JavaPack pack = (JavaPack)javaElement;
					JavaClass c = (JavaClass)child;
					String prefix = pack.getName() + ".";
					if (! c.getName().startsWith(prefix)) {
						c.setName(prefix + c.getName());
					}
					// System.out.println("Fixed class name: " + c.getFullName());
				}
				resolveContainmentProxies(child);
			}
		}
	}

	//

	private final static String JEX_ANNOTATION_NAME = "JExercise";

	public static IMemberValuePair[] getAnnotationValuePairs(IJavaElement javaElement) {
		if (javaElement instanceof IAnnotatable) {
			IAnnotation annotation = ((IAnnotatable) javaElement).getAnnotation(JEX_ANNOTATION_NAME);
			if (annotation != null) {
				try {
					return annotation.getMemberValuePairs();
				} catch (JavaModelException e) {
//					System.err.println("Couldn't get annotation value pairs for " + annotation + " of " + javaElement + ": " + e);
				}
			}
		}
		return null;
	}

	public static Object getAnnotationValue(IMemberValuePair[] valuePairs, String name, int kind) {
		for (int i = 0; valuePairs != null && i < valuePairs.length; i++) {
			IMemberValuePair valuePair = valuePairs[i];
			if (valuePair.getValueKind() == kind && name.equals(valuePair.getMemberName())) {
				return valuePair.getValue();
			}
		}
		return null;
	}

	//

	public void validateRequirements(JexResource res, List<AbstractRequirement> changes) {
		Exercise ex = res.getExercise();
		if (ex != null) {
			validateChildrenRequirements(ex, changes);
		}
	}

	private long validationTime = 0;

	public void validateExerciseRequirements(List<AbstractRequirement> changes) {
		validationTime = System.currentTimeMillis();
		JexResource[] resources = getExerciseResources();
		for (int i = 0; i < resources.length; i++) {
			validateRequirements(resources[i], changes);
		}
	}
	public List<AbstractRequirement> validateExerciseRequirements() {
		List<AbstractRequirement> changed = new ArrayList<AbstractRequirement>();
		validateExerciseRequirements(changed);
		return changed;
	}

	// IElementChangedListener

	public void elementChanged(ElementChangedEvent event) {
		// System.out.println("Java Model Event " + event.getType() + ": " + event.getDelta());
		if (exView != null && (! jexLogWriter.isWriting())) {
			exView.updateViewer(validateExerciseRequirements(), true);
		}
	}

	private JUnitLaunchShortcut junitLauncher = null;

	public void launchJUnitTest(IJavaElement testElement) {
		if (junitLauncher == null) {
			junitLauncher = new JUnitLaunchShortcut();
		}
		junitLauncher.launch(new StructuredSelection(testElement), "run");
	}

	public final static String LAUNCH_JUNIT_TEST = "junit test launch";

	public Integer logJunitTestLaunch = new Integer(IStatus.INFO);

	private Boolean validateJUnitTest(JavaElement javaElement, EObject owner) {
		IJavaElement testElement = javaElement.findJavaCoreElement(JexResource.getJavaProject(javaElement.eResource()));
		if (testElement != null) {
			jexLog(owner, LAUNCH_JUNIT_TEST, testElement.getElementName(), logJunitTestLaunch);
			launchJUnitTest(testElement);
		}
		return null;
	}

	public Boolean validateJUnitTest(JavaElement javaElement) {
		return validateJUnitTest(javaElement, javaElement);
	}
	public Boolean validateJUnitTest(JUnitTest req) {
		return validateJUnitTest(req.getJavaElement(), req);
	}

	public final static String TEST_RUN_STATUS = "test run status";

	public Integer logValidateTestRunSeverity = new Integer(IStatus.INFO);

	private void validateTestRunRequirement(JUnitTest req, ITestElement.Result status) {
		int testStatus = JUnitTestStatus.UNDEFINED_VALUE;
		if (status == ITestElement.Result.OK) {
			testStatus = JUnitTestStatus.OK_VALUE;
		} else if (status == ITestElement.Result.ERROR || status == ITestElement.Result.FAILURE) {
			testStatus = JUnitTestStatus.ERROR_VALUE;
		}
		req.setTestStatus(testStatus);
		Boolean satisfied = null;
		if (status == ITestElement.Result.OK) {
			satisfied = Boolean.TRUE;
		} else if (status == ITestElement.Result.FAILURE || status == ITestElement.Result.ERROR) {
			satisfied = Boolean.FALSE;
		}
		req.setSatisfied(satisfied);
		List<AbstractRequirement> changes = new ArrayList<AbstractRequirement>();
		validateRequirements((JexResource)req.eResource(), changes);
		AbstractRequirement childReq = req;
		while (childReq != null) {
			if (changes.indexOf(childReq) < 0) {
				changes.add(childReq);
			}
			childReq = childReq.getParent();
		}
		exView.updateViewer(changes, true);
		jexLog(req, TEST_RUN_STATUS, satisfied, logValidateTestRunSeverity);
	}

	//

	private ITestElement.Result andTestResults(ITestElement.Result status1, ITestElement.Result status2) {
		if (status1 == ITestElement.Result.ERROR || status2 == ITestElement.Result.ERROR) {
			return ITestElement.Result.ERROR;
		} else if (status1 == ITestElement.Result.FAILURE || status2 == ITestElement.Result.FAILURE) {
			return ITestElement.Result.ERROR;
		} else if (status1 == ITestElement.Result.OK || status2 == ITestElement.Result.OK) {
			return ITestElement.Result.OK;
		}
		return status1;
	}

	public ITestElement.Result checkTestRunnable(TestRunnable testRun, List<TestResult> testResults) {
		ITestElement.Result result = ITestElement.Result.UNDEFINED;
		if (testRun instanceof JavaMethodTester) {
			result = checkTestMethod((JavaMethodTester)testRun, testResults);
			if (result != ITestElement.Result.OK) {
				return result;
			}
		}
		List<TestRunnable> testRuns = testRun.getTestRuns();
		int successCount = 0, count = testRuns.size();
		for (int i = 0; i < count; i++) {
			TestRunnable testRunnable = testRuns.get(i);
			ITestElement.Result testRunnableResult = checkTestRunnable(testRunnable, testResults);
			result = andTestResults(result, testRunnableResult);
			if (testRunnableResult == ITestElement.Result.OK) {
				successCount++;
			}
		}
		if (result == ITestElement.Result.OK && successCount < count) { 
			result = ITestElement.Result.UNDEFINED;
		}
		return result;
	}

	public ITestElement.Result checkTestMethod(JavaMethodTester method, List<TestResult> testResults) {
		ITestElement.Result status = ITestElement.Result.UNDEFINED;
		for (TestResult testResult : testResults) {
			if (method.getSimpleName().equals(testResult.methodName) && method.getOwner().getFullName().equals(testResult.className)) {
				status = andTestResults(status, testResult.status);
			}
		}
		return status;
	}

	private void validateTestRunRequirements(Exercise ex, List<TestResult> testResults) {
		TreeIterator<EObject> content = ex.eAllContents();
		while (content.hasNext()) {
			Object o = content.next();
			if (o instanceof JavaElement) {
				content.prune();
			} else if (o instanceof JUnitTest) {
				JUnitTest test = (JUnitTest)o;
				TestRunnable testRun = test.getTestRunnable();
				if (testRun == null) {
					testRun = (TestRunnable) test.getJavaElement();
				}
				ITestElement.Result result = checkTestRunnable(testRun, testResults);
				if (result != ITestElement.Result.UNDEFINED) {
					validateTestRunRequirement(test, result);
				}
			}
		}
	}

	private List<TestResult> runResults;

	private static class TestResult {
		String methodName;
		String className;
		ITestElement.Result status = ITestElement.Result.UNDEFINED;
	}

	// from TestRunListener

	public void sessionFinished(ITestRunSession session) {
		if (runResults == null) {
			return;
		}
		JexResource[] resources = getExerciseResources();
		for (int i = 0; i < resources.length; i++) {
			validateTestRunRequirements(resources[i].getExercise(), runResults);
		}
		runResults = null;
	}

	public void sessionStarted(ITestRunSession session) {
		runResults = new ArrayList<TestResult>();
	}

	public void testCaseFinished(ITestCaseElement test) {
		if (runResults == null) {
			return;
		}
		TestResult testResult = new TestResult();
		testResult.status = test.getTestResult(true);
		testResult.className = test.getTestClassName();
		testResult.methodName = test.getTestMethodName();
		runResults.add(testResult);
	}
}
