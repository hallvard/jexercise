/*
 * Created on 18.mai.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package no.hal.jex.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JUnitTest;
import no.hal.jex.JUnitTestStatus;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Requirement;
import no.hal.jex.TestRunnable;
import no.hal.jex.eval.AbstractRequirementChecker;
import no.hal.jex.jdt.JdtHelper;
import no.hal.jex.jdt.JdtRequirementChecker;
import no.hal.jex.resource.JexResource;
import no.hal.jex.views.ExerciseView;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
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
IElementChangedListener, // IResourceChangeListener,
JexResourceProvider.Listener {

	private JexLogWriter jexLogWriter;

	public JexManager(String jexPathPattern) {
		JavaCore.addElementChangedListener(this);
		JUnitCore.addTestRunListener(this);
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		jexLogWriter = new JexLogWriter();
	}

	public void dispose() {
//		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		JUnitCore.removeTestRunListener(this);
		JavaCore.removeElementChangedListener(this);
	}

	public void setJexPathPattern(String jexPathPattern) {
		if (jexResourceProvider instanceof JexWorkspaceResourcesProvider) {
			((JexWorkspaceResourcesProvider) jexResourceProvider).setJexPathPattern(jexPathPattern);
		}
		refreshExerciseResources(true);
	}

	private ExerciseView exerciseView;

	public void setViewer(ExerciseView view) {
		this.exerciseView = view;
		refreshExerciseResources(false);
		view.setInput(exercises);
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

	private JexResourceProvider jexResourceProvider;

	public JexResourceProvider getJexResourceProvider() {
		if (jexResourceProvider == null) {
			setJexResourceProvider(new JexWorkspaceResourcesProvider());
		}
		return jexResourceProvider;
	}

	public void setJexResourceProvider(JexResourceProvider jexResourceProvider) {
		if (this.jexResourceProvider != null) {
			this.jexResourceProvider.removeListener(this);
		}
		this.jexResourceProvider = jexResourceProvider;
		if (this.jexResourceProvider != null) {
			this.jexResourceProvider.addListener(this);
		}
	}

	public void setRootResources(IResource... resources) {
		if (! (jexResourceProvider instanceof JexWorkspaceResourcesProvider)) {
			setJexResourceProvider(new JexWorkspaceResourcesProvider());
		}
		((JexWorkspaceResourcesProvider) jexResourceProvider).setRootResources(resources);
	}
	
	private boolean validateRequirementsOnLoad = true;

	public void setValidateRequirementsOnLoad(boolean validateRequirementsOnLoad) {
		this.validateRequirementsOnLoad = validateRequirementsOnLoad;
	}

	private ResourceSet exercises = null; 

	// JexResourceProvider.Listener
	
	public void resourceChanged(URI uri) {
		if (uri == null) {
			refreshExerciseResources(true);
		} else {
			Resource exerciseResource = getExerciseResource(uri);
			boolean exists = exercises.getURIConverter().exists(uri, null);
			if (exerciseResource == null && exists) {
				exercises.getResources().add(exerciseResource);
			} else if (exerciseResource != null && (! exists)) {
				exercises.getResources().remove(exerciseResource);
			} else if (exerciseResource != null && exists) {
				if (exerciseResource.isLoaded()) {
					exerciseResource.unload();
				}
				try {
					exerciseResource.load(null);
				} catch (IOException e) {
					exercises.getResources().remove(exerciseResource);
				}
			}
		}
	}

//	private class ResourceDeltaVisitor implements IResourceDeltaVisitor {
//		public boolean visit(IResourceDelta delta) throws CoreException {
//			return (! resourceChanged(delta.getResource(), delta));
//		}
//	}
//
//	private IResourceDeltaVisitor resourceDeltaVisitor = new ResourceDeltaVisitor();
//
//	public void resourceChanged(IResourceChangeEvent event) {
//		IResource res = event.getResource();
//		if (res != null) {
//			resourceChanged(res, event.getDelta());
//		} else {
//			try {
//				event.getDelta().accept(resourceDeltaVisitor);
//			} catch (CoreException e) {
//			}
//		}
//	}
//
//	private static boolean isExerciseResource(IResource res) {
//		return res != null && isExerciseResourceName(res.getName());
//	}

//	public static boolean isExerciseResourceName(String name) {
//		return name.endsWith(JexResource.JEX_EXTENSION) && name.endsWith("." + JexResource.JEX_EXTENSION);
//	}

//	private boolean resourceChanged(IResource res, IResourceDelta delta) {
//		if (! isExerciseResource(res)) {
//			return false;
//		}
//		JexResource ex = getExerciseResource(URI.createPlatformResourceURI(res.getFullPath().toString(), true));
//		if (ex != null && (delta == null || delta.getKind() != IResourceDelta.REMOVED)) {
//			refreshExerciseResource(ex);
//		} else {
//			refreshExerciseResources(true);
//		}
//		return ex != null;
//	}

//	private String classifyResourceException(Exception e) {
//		if (e instanceof WrappedException) {
//			e = ((WrappedException)e).exception();
//		}
//		String s = e.getClass().getName();
//		if (s.startsWith("org.eclipse.emf.ecore.xmi")) { 
//			return "XMI";
//		} else if (s.startsWith("org.xml.sax")) {
//			return "XML";
//		}
//		return null;
//	}

//	public JexResource createExerciseResource(URI uri) {
//		ResourceSet resSet = new ResourceSetImpl();
//		JexResource res;
//		try {
//			res = (JexResource)resSet.getResource(uri, true);
//		} catch (RuntimeException e) {
//			String problem = classifyResourceException(e);
//			if (problem != null) {
//				log(problem + " problem with " + uri + ", consider fixing or removing it", Status.WARNING, e);
//			}
//			return null;
//		}
//		resolveContainmentProxies(res);
//		if (validateRequirementsOnLoad) {
//			validateRequirements(res, null);
//		}
//		return res;
//	}

	protected void refreshExerciseResources(boolean reload) {
		if (exercises == null) {
			exercises = new ResourceSetImpl();
			reload = true;
		}
		if (reload) {
			exercises.getResources().clear();
			getJexResourceProvider().getJexResources(exercises);
		}
	}

	public Resource getExerciseResource(Exercise ex) {
		for (Resource resource : exercises.getResources()) {
			if (resource.getContents().contains(ex)) {
				return resource;
			}
		}
		return null;
	}
	public Resource getExerciseResource(URI uri) {
		for (Resource resource : exercises.getResources()) {
			if (uri.equals(resource.getURI())) {
				return resource;
			}
		}
		return null;
	}

//	public int indexOfExerciseResource(JexResource res) {
//		return exercises.getResources().indexOf(res);
//	}

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

	private AbstractRequirementChecker requirementChecker = new JdtRequirementChecker();
	
	public Boolean validateChildrenRequirements(AbstractRequirement req, List<AbstractRequirement> changes) {
		Boolean oldResult = req.getChildrenSatisfied();
		Boolean childrenResult = Boolean.TRUE;
		for (AbstractRequirement childReq : req.getRequirements()) {
			Boolean childResult = null;
			if (childReq instanceof Requirement) {
//				if (req instanceof Requirement && ((Requirement) req).getSatisfied() != Boolean.TRUE) {
//				} else
				if (childReq instanceof JavaRequirement) {
					childResult = requirementChecker.validateRequirement((JavaRequirement) childReq);
				}
				setRequirementSatisfied((Requirement) childReq, childResult, changes);
			}
			childResult = JdtRequirementChecker.satisfiedAnd(childResult, validateChildrenRequirements(childReq, changes));
			childrenResult = JdtRequirementChecker.satisfiedAnd(childrenResult, childResult);
		}
		req.setChildrenSatisfied(childrenResult);
		if (childrenResult != oldResult && changes != null) {
			changes.add(req);
		}
		return childrenResult;
	}

//	void resolveContainmentProxies(JexResource res) {
//		Exercise ex = res.getExercise();
//		if (ex != null) {
//			resolveContainmentProxies(ex);
//		}
//	}
//	private void resolveContainmentProxies(AbstractRequirement req) {
//		List<AbstractRequirement> reqs = req.getRequirements();
//		for (AbstractRequirement aReq : reqs) {
//			resolveContainmentProxies(aReq);
//		}
//		List<JavaElement> javaElements = req.getJavaElements();
//		for (JavaElement javaElement : javaElements) {
//			resolveContainmentProxies(javaElement);
//		}
//	}
//	private void resolveContainmentProxies(JavaElement javaElement) {
//		List<JavaClass> children = null;
//		if (javaElement instanceof JavaPack) {
//			children = ((JavaPack)javaElement).getClasses();
//		}
//		if (children != null) {
//			for (int i = 0; i < children.size(); i++) {
//				JavaElement child = (JavaElement)children.get(i);
//				if (child.eContainer() != javaElement && javaElement instanceof JavaPack && child instanceof JavaClass) {
//					JavaPack pack = (JavaPack)javaElement;
//					JavaClass c = (JavaClass)child;
//					String prefix = pack.getName() + ".";
//					if (! c.getName().startsWith(prefix)) {
//						c.setName(prefix + c.getName());
//					}
//					// System.out.println("Fixed class name: " + c.getFullName());
//				}
//				resolveContainmentProxies(child);
//			}
//		}
//	}

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
		for (Resource resource : exercises.getResources()) {
			if (resource instanceof JexResource) {
				validateRequirements((JexResource) resource, changes);
			}
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
		if (exerciseView != null && (! jexLogWriter.isWriting())) {
			exerciseView.updateViewer(validateExerciseRequirements(), true);
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
		IJavaElement testElement = JdtHelper.getJdtElement(javaElement);
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
		validateRequirements((JexResource) req.eResource(), changes);
		AbstractRequirement childReq = req;
		while (childReq != null) {
			if (changes.indexOf(childReq) < 0) {
				changes.add(childReq);
			}
			childReq = childReq.getParent();
		}
		exerciseView.updateViewer(changes, true);
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
		for (Resource resource : exercises.getResources()) {
			if (resource instanceof JexResource) {
				validateTestRunRequirements(((JexResource) resource).getExercise(), runResults);
			}
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
