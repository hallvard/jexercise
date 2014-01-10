package no.hal.jex.views;

import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaPack;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Member;
import no.hal.jex.eval.AbstractRequirementChecker;
import no.hal.jex.eval.AbstractTestAnnotationsToModelConverter;
import no.hal.jex.impl.AbstractRequirementImpl;
import no.hal.jex.jdt.JdtHelper;
import no.hal.jex.resource.JexResource;
import no.hal.jex.resource.JexXmlHelper;
import no.hal.jex.ui.JexManager;
import no.hal.jex.ui.JexUiPlugin;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.part.ViewPart;

public class ExerciseView extends ViewPart implements ExerciseListener, DropTargetListener {

	// private TreeViewer exView;
	private SashForm sash;
	private Composite leftPane;
	private Composite rightPane;
	private StackLayout rightLayout;
	private IExerciseViewer exerciseViewer;
	private Browser exerciseDetailsView;

	private Text startupMessage;

	private ComboViewer exerciseSelector = null;
	private Control pointsControl;
	private String pointsTextFormat = "{0} of {1} points";

//	private Button submitZipButton;
	
	private JexManager jexManager;

	private JexManager getJexManager() {
		if (jexManager == null) {
			jexManager = JexUiPlugin.getPlugin().getExerciseManager();
		}
		return jexManager;
	}
	
	public ExerciseView() {
	}

	private Display display;

	// controls when code is auto-submitted
	// false = never, null = when running all tests and true = also when running individual tests
//	private Boolean autoSubmitMode = false;
	private boolean autoSelectFirstElement = true;

	//	public void setAutoSubmitMode(Boolean autoSubmitMode) {
	//		this.autoSubmitMode = autoSubmitMode;
	//	}

	private class ExerciseSelector extends ComboViewer implements Runnable {
		public ExerciseSelector(Composite parent, int style) {
			super(parent, style);
		}
		@Override
		public void inputChanged(Object oldInput, Object newInput) {
			super.inputChanged(oldInput, newInput);
			display.asyncExec(this);
		}
		@Override
		public void refresh() {
			super.refresh();
			display.asyncExec(this);
		}
		public void run() {
			if (getInput() != null && getSelection().isEmpty()) {
				final Object[] elements = ((IStructuredContentProvider) getContentProvider()).getElements(getInput());
				if (elements != null && elements.length > 0) {
					setSelection(new StructuredSelection(elements[0]));
				}
			}
		}
	}
	
	public void createPartControl(final Composite parent) {
		display = parent.getDisplay();
		sash = new SashForm(parent, SWT.HORIZONTAL);
		sash.SASH_WIDTH = 2;
		int styles = SWT.BORDER;
		leftPane = new Composite(sash, SWT.NONE);
		rightPane = new Composite(sash, SWT.NONE);
		
		exerciseSelector = new ExerciseSelector(leftPane, SWT.READ_ONLY);
		exerciseSelector.setContentProvider(new ExerciseViewContentProvider());
		exerciseSelector.setLabelProvider(new ExerciseViewLabelProvider());

		TreeExerciseViewer treeViewer = new TreeExerciseViewer(leftPane, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | styles);
		treeViewer.setContentProvider(new ExerciseViewContentProvider());
		treeViewer.setLabelProvider(new ExerciseViewLabelProvider());

		exerciseViewer = treeViewer;
		exerciseViewer.setExerciseResource(null);
		exerciseViewer.addExerciseListener(this);

		JexManager manager = getJexManager();
		manager.setViewer(this);

		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth  = 0;
		gridLayout.marginHeight = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.verticalSpacing = 0;
		gridLayout.numColumns = 2;
		leftPane.setLayout(gridLayout);

		GridData gridData = null;

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.horizontalSpan = 2;
		exerciseSelector.getControl().setLayoutData(gridData);

		gridData = new GridData();
		gridData.verticalIndent = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.horizontalSpan = 2;
		treeViewer.getControl().setLayoutData(gridData);

		gridData = new GridData();
		pointsControl = createPointsControl();
		setPointsText("?", "?", pointsTextFormat, pointsControl);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.horizontalSpan = 2;
		pointsControl.setLayoutData(gridData);

//	    submitZipButton = null; // new Button(leftPane, SWT.NONE);
//	    if (submitZipButton != null) {
//		    submitZipButton.setText(" Submit >> ");
//		    buttonData = new GridData();
//		    buttonData.grabExcessHorizontalSpace = false;
//		    buttonData.horizontalAlignment = SWT.FILL;
//		    buttonData.verticalAlignment = SWT.FILL;
//		    submitZipButton.setLayoutData(buttonData);
//		    submitZipButton.addSelectionListener(new SelectionAdapter() {
//				public void widgetSelected(SelectionEvent e) {
//					submitZip(false);
//				}
//		    });
//	    }
		rightLayout = new StackLayout();
		rightLayout.topControl = startupMessage;
		rightPane.setLayout(rightLayout);
		startupMessage = new Text(rightPane, SWT.WRAP);
		startupMessage.setText(JExerciseViewHelpString);
		try {
			exerciseDetailsView = new Browser(rightPane, styles);
		} catch (Throwable t) {
			manager.log("Could not instantiate Browser control", IStatus.ERROR, t);
		}
		IWorkbenchHelpSystem help = PlatformUI.getWorkbench().getHelpSystem();
		String helpContext = JexUiPlugin.getPlugin().getBundle().getSymbolicName() + ".ExerciseView";
		help.setHelp(sash, helpContext);
		help.setHelp(exerciseViewer.getControl(), helpContext);
		help.setHelp(exerciseSelector.getControl(), helpContext);
		help.setHelp(startupMessage, helpContext);
		if (exerciseDetailsView != null) {
			help.setHelp(exerciseDetailsView, helpContext);
			sash.setWeights(new int[]{30, 70});
		}
		exerciseResourceSelected((JexResource) null);
		
		exerciseSelector.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					Object jexResource = ((IStructuredSelection) selection).getFirstElement();
					exerciseResourceSelected(jexResource instanceof JexResource ? (JexResource) jexResource : null);
				}
			}
		});

		DropTarget dropTarget = new DropTarget(treeViewer.getControl(), DND.DROP_DEFAULT | DND.DROP_COPY);
		dropTarget.setTransfer(new Transfer[]{FileTransfer.getInstance()});
		dropTarget.addDropListener(this);
		
		addActions();
		
		getJexManager().setViewer(this);
	}

	public IExerciseViewer getExerciseViewer() {
		return exerciseViewer;
	}
	
	private void addActions() {
//		IActionBars actionBars = getViewSite().getActionBars();
//		IMenuManager menuManager = actionBars.getMenuManager();
//		IToolBarManager toolBarManager = actionBars.getToolBarManager();
	}

	public void setInput(Notifier notifier) {
		exerciseSelector.setInput(notifier);
		if (autoSelectFirstElement ) {
			Object[] elements = ((IStructuredContentProvider) exerciseSelector.getContentProvider()).getElements(notifier);
			if (elements.length > 0) {
				exerciseSelector.setSelection(new StructuredSelection(notifier));
			}
		}
	}
	
//	private void submitZip (boolean automode) {
//
//		/*
//		 * Todo: Check for valid server settings first
//		 * 
//		 */
//
//		JexResource res = exerciseViewer.getExerciseResource();
//		String jobtitle = null;
//		if (automode) {
//			jobtitle = "Working";
//		}
//		else {
//			jobtitle = "Submit exercise to server";
//		}
//		ZipFileSubmitter zipSubmitter = new ZipFileSubmitter(res, jobtitle);
//		zipSubmitter.setAutoSubmitMode (automode);
//		zipSubmitter.addClasses(Boolean.FALSE);
//		zipSubmitter.setJexRelatedFiles(new String[] {
//				"{0}/{1}." + JexResource.JEX_EXTENSION + ".log", null,
//		});
//
////		IPreferenceStore store = JexUiPlugin.getPlugin().getPreferenceStore();
//		String submiturl = null; // store.getString(JexPreferencePage.JEX_SERVER);
//
//		if (submiturl == null || submiturl.length () == 0) {
//			if (automode == false) {
//				MessageDialog.openError (null, "Error", "Exercise server is not specified. You must enter the address of the server in JExercise preferences (the URL should also include username and password). Please check with the course/exercise website for the correct server address. You specify the address in the 'Server' field in Window -> Preferences -> JExercise.");
//			}
//			return;
//		}
//
//		Exercise ex = res.getExercise();
//		submiturl += "&" + ex.getComment();
//		zipSubmitter.setSubmitUrl(submiturl);
//
//		//		zipSubmitter.setParameters("courseid", "TST1001");
//		//		zipSubmitter.setParameters("exerciseid", res.getURI().lastSegment());
//
//		if (automode == false) {
//			zipSubmitter.addJobChangeListener (new JobChangeAdapter() {
//				public void done (IJobChangeEvent event) {
//					if (event.getResult ().isOK ()) {
//						ZipFileSubmitter zfs = (ZipFileSubmitter) event.getJob ();
//						//detailsExView.setUrl (zfs.getResultURL ());
//						exerciseDetailsViewResultURL = zfs.getResultURL ();
//						display.syncExec (new Runnable() {
//							public void run (){
//								exerciseDetailsView.setUrl(exerciseDetailsViewResultURL);
//							}
//						});
//					}
//				}
//			});
//		}
//
//		if (zipSubmitter.prepare()) {
//			zipSubmitter.setPriority(Job.SHORT);
//			if (automode) {
//				zipSubmitter.setUser(false);
//			}
//			else {
//				zipSubmitter.setUser(true);
//			}
//			zipSubmitter.schedule();
//		}
//	}

	private List<Member> findAllTests(JexResource res, List<Member> result) {
		if (res != null && res.getExercise() != null) {
			for (JavaElement element: res.getExercise().getJavaElements()) {
				if (element instanceof JavaPack) {
					for (JavaClass javaClass: ((JavaPack)element).getClasses()) {
						if (AbstractTestAnnotationsToModelConverter.isAllTestsName(javaClass.getSimpleName())) {
							result.add(javaClass);
						}
					}
				}
			}
		}
		return result;
	}

	private Control createPointsControl() {
		Button pointsButton = new Button(leftPane, SWT.NONE);
		pointsButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				runAllTests();
//				if (autoSubmitMode != Boolean.FALSE) {
//					// Submit zip file in automatic mode
//					submitZip (true);
//				}
			}
		});
		return pointsButton;
	}

	private List<Member> allTests = null;

	private void runAllTests() {
		JexManager manager = getJexManager();
		for (JavaElement element: allTests) {
			manager.validateJUnitTest(element);
		}
	}

	public final static String RESOURCE_SELECTED = "resource selected";

	public Integer logResourceSelectedSeverity = new Integer(IStatus.INFO);

	private void exerciseResourceSelected(JexResource res) {
		if (exerciseViewer != null) {
			exerciseViewer.setExerciseResource(res);
			if (res != null) {
				getJexManager().jexLog(res, RESOURCE_SELECTED, null, logResourceSelectedSeverity);
			}
		}
		refreshAllTests(res);
		if (res != null) {
			updateBrowser(res.getExercise());
		} else {
			updateBrowser(null);
		}
	}

	private void refreshAllTests(JexResource res) {
		allTests = findAllTests(res, new ArrayList<Member>());
		if (pointsControl instanceof Button) {
			String tip = getAllTestsText(allTests);
			if (tip != null) {
				tip = "Run " + tip;
			}
			pointsControl.setToolTipText(tip);
			pointsControl.setEnabled(allTests != null && allTests.size() > 0);
		}
		refreshPoints(res);
//		if (pointsControl != null && submitZipButton != null) {
//			submitZipButton.setEnabled (pointsControl.getEnabled());
//		}
	}

	public static String getPointsText(Object points, Object maxPoints, String format) {
		return MessageFormat.format(format, new Object[]{points, maxPoints});
	}

	private String getAllTestsText(List<Member> allTests) {
		String text = null;
		if (allTests != null) {
			for (Member member: allTests) {
				String name = member.getFullName();
				if (text == null) {
					text = name;
				} else {
					text = text + ", " + name;
				}
			}
		}
		return text;
	}

	private static String setPointsText(Object points, Object maxPoints, String format, Control pointsControl) {
		if (pointsControl != null && pointsControl.isDisposed()) {
			return null;
		}
		String pointsText = getPointsText(points, maxPoints, format);
		if (pointsControl instanceof Button) {
			Button pointsButton = (Button)pointsControl;
			pointsButton.setText(pointsText);
			boolean enabled = maxPoints instanceof Integer;
			if (maxPoints instanceof String) {
				try {
					enabled = Integer.valueOf((String) maxPoints).intValue() > 0;
				} catch (NumberFormatException e) {
				}
			}
			pointsButton.setEnabled(enabled && pointsButton.isEnabled());
		} else if (pointsControl instanceof Label) {
			((Label)pointsControl).setText(pointsText);
		} else if (pointsControl instanceof Text) {
			((Text)pointsControl).setText(pointsText);
		}
		return pointsText;
	}

//	private static String NO_EXERCISE_LABEL = "<no exercise>"; 
//	private static String NAME_PATH_SEPARATOR = " - ";

//	public void refreshExercises(final JexResource[] resources) {
//		String[] items = new String[resources.length + 1];
//		// must be first item
//		items[0] = NO_EXERCISE_LABEL;
//		// we add them in reverse order,
//		// since it's usually the last one that is the current exercise
//		for (int i = 0; i < resources.length; i++) {
//			URI uri = resources[i].getURI();
//			String name = uri.lastSegment();
//			items[items.length - (i + 1)] = name + NAME_PATH_SEPARATOR + toPath(uri.trimSegments(1));
//		}
//		exerciseSelector.setItems(items);
//		exerciseSelector.select(0);
//		exerciseResourceSelected((JexResource)null);
//	}

	/*
	 * 	 points[0] = points of satisfied requirements, points[1] = max points
	 */
	public static String refreshPoints(AbstractRequirement req, String format, Control control) {
		Object points = "?", maxPoints = "?";
		if (req != null) {
			int[] pm = new int[2];
			AbstractRequirementChecker.computeRequirementPoints(req, pm);
			points = Integer.valueOf(pm[0]);
			maxPoints = Integer.valueOf(pm[1]);
		}
		return setPointsText(points, maxPoints, format, control);
	}

	private void refreshPoints(JexResource res) {
		refreshPoints(res != null ? res.getExercise() : null, pointsTextFormat, pointsControl);
	}

	public void dispose() {
		super.dispose();
		exerciseViewer = null; 
	}

	public void refreshViewer(final JexResource res) {
		if (exerciseViewer != null && res == exerciseViewer.getExerciseResource()) {
			asyncExec(new Runnable() {
				public void run() {
					exerciseViewer.setExerciseResource(res);
					refreshAllTests(res);
					refreshPoints(res);
//					if (pointsControl != null && submitZipButton != null) {
//						submitZipButton.setEnabled (pointsControl.getEnabled ());
//					}
				}
			});
		}
	}

	public void asyncExec(Runnable run) {
		if (display != null) {
			display.asyncExec(run);
		}
	}

	public void updateViewer(final List<AbstractRequirement> changes, boolean async) {
		if (async) {
			asyncExec(new Runnable() {
				public void run() {
					updateViewer(changes, false);
				}});
		} else {
			for (AbstractRequirement req: changes) {
				if (exerciseViewer != null) {
					exerciseViewer.updateViewer(req);
					refreshPoints(exerciseViewer.getExerciseResource());
//					if (pointsControl != null && submitZipButton != null) {
//						submitZipButton.setEnabled(pointsControl.getEnabled());
//					}
				}
			}
		}
	}

	private String createLocation(URI uri) {
		String location = JdtHelper.getLocation(uri);
		if (location != null) {
			// if there is no schema, add a file schema
			// the test also covers the Windows case where is a drive letter followed by a colon
			if (location.indexOf(':') < 2) {
				location = "file:///" + location; 
			}
			if (location.endsWith("." + JexResource.JEX_EXTENSION)) {
				location = location.substring(0, location.length() - JexResource.JEX_EXTENSION.length()) + "html";
			}
			if (uri.hasFragment()) {
				location += "#" + uri.fragment();
			}
		}
		return location;
	}

	private static String JExerciseViewHelpLocation = null; // "/help/JExerciseView.html";
	private static String JExerciseViewHelpString = "For a description of the JExercise view, see the help system (use F1)";

	private void setRightControl(Control control) {
		if (control != null && control.getParent() == rightPane && rightLayout.topControl != control) {
			rightLayout.topControl = control;
			rightPane.layout();
		}
	}

	private void updateBrowser(AbstractRequirement req) {
		if (exerciseDetailsView == null) {
			if (req == null) {
				setRightControl(startupMessage);
			}
			return;
		}
		if (req == null) {
			URL url = null;
			if (JExerciseViewHelpLocation != null) {
				IWorkbenchHelpSystem help = PlatformUI.getWorkbench().getHelpSystem();
				String helpPath = "/" + JexUiPlugin.getPlugin().getBundle().getSymbolicName() + JExerciseViewHelpLocation;
				url = help.resolve(helpPath, true);
			}
			if (url != null) {
				setRightControl(exerciseDetailsView);
				exerciseDetailsView.setUrl(url.toString());
			} else {
				setRightControl(startupMessage);
			}
		} else {
			String location = null;
			AbstractRequirement descriptionReq = AbstractRequirementImpl.findNearestPreviousRequirementWithDescription(req);
			if (descriptionReq != null) {
				URI uri = descriptionReq.eResource().getURI().appendFragment(JexXmlHelper.getID(descriptionReq, "description")); // .getDescriptionURI();
				location = createLocation(uri);
				if (location != null && (! descriptionReq.eResource().getResourceSet().getURIConverter().exists(URI.createURI(location), Collections.EMPTY_MAP))) {
					location = null;
				}
			}
			setRightControl(exerciseDetailsView);
			if (location != null) {
				exerciseDetailsView.setUrl(location);
			} else {
				String description = (descriptionReq != null ? descriptionReq.getDescription() : null);
				if (description != null) {
					exerciseDetailsView.setText(description);
				}
			}
		}
	}

	public void requirementSelected(AbstractRequirement req) {
		if (exerciseViewer.getSelectedRequirement() != req) {
			exerciseViewer.setSelectedRequirement(req);
		}
		updateBrowser(req);
	}

	public void requirementValidationRequested(JavaRequirement req) {
		if (req instanceof JUnitTest) {
			getJexManager().validateJUnitTest((JUnitTest)req);
//			if (autoSubmitMode == Boolean.TRUE) {
//				submitZip(true);
//			}
		} else {
			IJavaElement javaElement = JdtHelper.getJdtElement(req.getJavaElement());
			if (javaElement != null) {
				try {
					JavaUI.openInEditor(javaElement);
				} catch (Exception e) {
				}
			}
		}
	}

	/**
	 * Passing the focus request to the rosterView's control.
	 */
	public void setFocus() {
		exerciseViewer.getControl().setFocus();
	}

	//

	public void dragEnter(DropTargetEvent event) {
		acceptDropType(event);
	}

	private void acceptDropType(DropTargetEvent event) {
		if (event.detail == DND.DROP_DEFAULT) {
			event.detail = ((event.operations & DND.DROP_COPY) != 0 ? DND.DROP_COPY : DND.DROP_NONE);
		}
	}

	public void dragLeave(DropTargetEvent event) {
	}

	public void dragOperationChanged(DropTargetEvent event) {
		acceptDropType(event);
	}

	public void dragOver(DropTargetEvent event) {}
	
	public void dropAccept(DropTargetEvent event) {
		acceptDropType(event);
	}

	public void drop(DropTargetEvent event) {
		if (FileTransfer.getInstance().isSupportedType(event.currentDataType)) {
			String[] files = (String[]) event.data;
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			Collection<IResource> rootResources = new ArrayList<IResource>();
			for (int i = 0; i < files.length; i++) {
				String fileString = new Path(files[i]).toPortableString();
				for (IProject project : projects) {
					String projectFileString = project.getLocation().toString();
					if (fileString.startsWith(projectFileString)) {
						IResource res = project.findMember(fileString.substring(projectFileString.length()));
						if (res != null) {
							rootResources.add(res);
							break;
						}
					}
				}
			}
			setRootResources(rootResources);
		}
	}

	public void setRootResources(IResource[] rootResources) {
		getJexManager().setRootResources(rootResources);
	}
	
	public void setRootResources(Collection<IResource> rootResources) {
		setRootResources(rootResources.toArray(new IResource[rootResources.size()]));
	}
}
