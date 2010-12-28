package no.hal.jex.views;

import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaPack;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Member;
import no.hal.jex.editor.commands.CreateChildrenFromJavaModelCommand;
import no.hal.jex.resource.JexResource;
import no.hal.jex.resource.JexXmlHelper;
import no.hal.jex.ui.JexManager;
import no.hal.jex.ui.JexUiPlugin;
import no.hal.jex.views.actions.ZipFileSubmitter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.part.ViewPart;

public class ExerciseView extends ViewPart implements ExerciseListener {
	
	// private TreeViewer exView;
	private SashForm sash;
	private Composite leftPane;
	private Composite rightPane;
	private StackLayout rightLayout;
	private IExerciseViewer mainExView;
	private Browser detailsExView;
	private String detailsExViewResultURL;
	
	private Text startupMessage;
	
	private Combo exCombo = null;
	private Control pointsControl;
	private String pointsTextFormat = "{0} of {1} points";

	private Button submitZipButton;
	
	public ExerciseView() {
	}

	private Display display;

	// controls when code is auto-submitted
	// false = never, null = when running all tests and true = also when running individual tests
	private Boolean autoSubmitMode = false;
	
//	public void setAutoSubmitMode(Boolean autoSubmitMode) {
//		this.autoSubmitMode = autoSubmitMode;
//	}

	public void createPartControl(Composite parent) {
		display = parent.getDisplay();
		sash = new SashForm(parent, SWT.HORIZONTAL);
		sash.SASH_WIDTH = 2;
		int styles = SWT.BORDER;
		leftPane = new Composite(sash, SWT.NONE);
		rightPane = new Composite(sash, SWT.NONE);
		createExercisesCombo(leftPane);

	    TreeExerciseViewer treeViewer = new TreeExerciseViewer(leftPane, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | styles);
		treeViewer.setContentProvider(new ExerciseViewContentProvider());
		treeViewer.setLabelProvider(new ExerciseViewLabelProvider());
		
		mainExView = treeViewer;
		mainExView.setExerciseResource(null);
		mainExView.addExerciseListener(this);

		JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
		manager.setViewer(this);

		GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth  = 0;
		gridLayout.marginHeight = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.verticalSpacing = 0;
		gridLayout.numColumns = 2;
		leftPane.setLayout(gridLayout);
		
		GridData comboData = new GridData();
	    comboData.grabExcessHorizontalSpace = true;
	    comboData.horizontalAlignment = SWT.FILL;
	    comboData.verticalAlignment = SWT.FILL;
	    comboData.horizontalSpan = 2;
	    exCombo.setLayoutData(comboData);

		GridData treeData = new GridData();
		treeData.verticalIndent = 1;
	    treeData.grabExcessHorizontalSpace = true;
	    treeData.horizontalAlignment = SWT.FILL;
	    treeData.grabExcessVerticalSpace = true;
	    treeData.verticalAlignment = SWT.FILL;
	    treeData.horizontalSpan = 2;
	    treeViewer.getControl().setLayoutData(treeData);

	    pointsControl = createPointsControl();
	    setPointsText("?", "?", pointsTextFormat, pointsControl);
		GridData buttonData = new GridData();
	    buttonData.grabExcessHorizontalSpace = true;
	    buttonData.horizontalAlignment = SWT.FILL;
	    buttonData.verticalAlignment = SWT.FILL;
	    treeData.horizontalSpan = 2;
	    pointsControl.setLayoutData(buttonData);

//	    submitZipButton = new Button(leftPane, SWT.NONE);
//	    submitZipButton.setText(" Submit >> ");
//	    buttonData = new GridData();
//	    buttonData.grabExcessHorizontalSpace = false;
//	    buttonData.horizontalAlignment = SWT.FILL;
//	    buttonData.verticalAlignment = SWT.FILL;
//	    submitZipButton.setLayoutData(buttonData);
//	    submitZipButton.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				submitZip(false);
//			}
//	    });
	    
	    rightLayout = new StackLayout();
		rightLayout.topControl = startupMessage;
	    rightPane.setLayout(rightLayout);
		startupMessage = new Text(rightPane, SWT.WRAP);
		startupMessage.setText(JExerciseViewHelpString);
		try {
			detailsExView = new Browser(rightPane, styles);
		} catch (Throwable t) {
			manager.log("Could not instantiate Browser control", IStatus.ERROR, t);
		}
		IWorkbenchHelpSystem help = PlatformUI.getWorkbench().getHelpSystem();
		String helpContext = JexUiPlugin.getPlugin().getBundle().getSymbolicName() + ".ExerciseView";
		help.setHelp(sash, helpContext);
		help.setHelp(mainExView.getControl(), helpContext);
		help.setHelp(exCombo, helpContext);
		help.setHelp(startupMessage, helpContext);
		if (detailsExView != null) {
			help.setHelp(detailsExView, helpContext);
			sash.setWeights(new int[]{30, 70});
		}
		exerciseResourceSelected((JexResource)null);
	}

	private void submitZip (boolean automode) {
		
	    /*
	     * Todo: Check for valid server settings first
	     * 
	     */
	    
	    JexResource res = mainExView.getExerciseResource();
	    String jobtitle = null;
	    if (automode) {
	        jobtitle = "Working";
	    }
	    else {
	        jobtitle = "Submit exercise to server";
	    }
		ZipFileSubmitter zipSubmitter = new ZipFileSubmitter(res, jobtitle);
		zipSubmitter.setAutoSubmitMode (automode);
		zipSubmitter.addClasses(Boolean.FALSE);
		zipSubmitter.setJexRelatedFiles(new String[] {
				"{0}/{1}." + JexResource.JEX_EXTENSION + ".log", null,
		});
		
		IPreferenceStore store = JexUiPlugin.getPlugin().getPreferenceStore();
		String submiturl = null; // store.getString(JexPreferencePage.JEX_SERVER);
		
		if (submiturl == null || submiturl.length () == 0) {
		    if (automode == false) {
		        MessageDialog.openError (null, "Error", "Exercise server is not specified. You must enter the address of the server in JExercise preferences (the URL should also include username and password). Please check with the course/exercise website for the correct server address. You specify the address in the 'Server' field in Window -> Preferences -> JExercise.");
		    }
		    return;
		}
		
		Exercise ex = res.getExercise (true);
		submiturl += "&" + ex.getComment();
		zipSubmitter.setSubmitUrl(submiturl);
		
//		zipSubmitter.setParameters("courseid", "TST1001");
//		zipSubmitter.setParameters("exerciseid", res.getURI().lastSegment());
		
		if (automode == false) {
    		zipSubmitter.addJobChangeListener (new JobChangeAdapter() {
    		    public void done (IJobChangeEvent event) {
    		        if (event.getResult ().isOK ()) {
    		            ZipFileSubmitter zfs = (ZipFileSubmitter) event.getJob ();
    		            //detailsExView.setUrl (zfs.getResultURL ());
    		            detailsExViewResultURL = zfs.getResultURL ();
    		            display.syncExec (new Runnable() {
                            public void run (){
                                detailsExView.setUrl (detailsExViewResultURL);
                            }
                        });
    		        }
    		    }
    		});
		}
		
		if (zipSubmitter.prepare()) {
			zipSubmitter.setPriority(Job.SHORT);
			if (automode) {
			    zipSubmitter.setUser(false);
			}
			else {
			    zipSubmitter.setUser(true);
			}
			zipSubmitter.schedule();
		}
	}

	private List findAllTests(JexResource res, List result) {
		if (res != null) {
			Exercise ex = res.getExercise();
			for (Iterator elements = ex.getJavaElements().iterator(); elements.hasNext();) {
				JavaElement element = (JavaElement)elements.next();
				if (element instanceof JavaPack) {
					for (Iterator classes = ((JavaPack)element).getClasses().iterator(); classes.hasNext();) {
						JavaClass javaClass = (JavaClass)classes.next();
						if (CreateChildrenFromJavaModelCommand.ALL_TESTS_TEST_SUITE_NAME.equals(javaClass.getSimpleName())) {
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
				if (autoSubmitMode != Boolean.FALSE) {
					// Submit zip file in automatic mode
					submitZip (true);
				}
			}
	    });
	    return pointsButton;
	}

	private List allTests = null;

	private void runAllTests() {
		JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
		for (Iterator it = allTests.iterator(); it.hasNext();) {
			JavaElement element = (JavaElement)it.next();
			manager.validateJUnitTest(element);
		}
	}
	
	public final static String RESOURCE_SELECTED = "resource selected";
	
	public Integer logResourceSelectedSeverity = new Integer(IStatus.INFO);
	
	private void exerciseResourceSelected(JexResource res) {
		if (mainExView != null) {
			mainExView.setExerciseResource(res);
			JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
			if (res != null) {
				manager.jexLog(res, RESOURCE_SELECTED, null, logResourceSelectedSeverity);
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
		allTests = findAllTests(res, new ArrayList());
		if (pointsControl instanceof Button) {
			String tip = getAllTestsText(allTests);
			if (tip != null) {
				tip = "Run " + tip;
			}
			pointsControl.setToolTipText(tip);
		}
		refreshPoints(res);
        if (pointsControl != null && submitZipButton != null) {
            submitZipButton.setEnabled (pointsControl.getEnabled ());
        }
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
			((Button)pointsControl).setText(pointsText);
			boolean enabled = maxPoints instanceof Integer;
			if (maxPoints instanceof String) {
				try {
					enabled = Integer.valueOf((String)maxPoints).intValue() > 0;
				} catch (NumberFormatException e) {
				}
			}
			((Button)pointsControl).setEnabled(enabled);
			
			
		} else if (pointsControl instanceof Label) {
			((Label)pointsControl).setText(pointsText);
		} else if (pointsControl instanceof Text) {
			((Text)pointsControl).setText(pointsText);
		}
		return pointsText;
	}
	
	private static String NO_EXERCISE_LABEL = "<no exercise>"; 
	private static String NAME_PATH_SEPARATOR = " - ";
	
	public void refreshExercises(final JexResource[] resources) {
		String[] items = new String[resources.length + 1];
		// must be first item
		items[0] = NO_EXERCISE_LABEL;
		// we add them in reverse order,
		// since it's usually the last one that is the current exercise
		for (int i = 0; i < resources.length; i++) {
			URI uri = resources[i].getURI();
			String name = uri.lastSegment();
			items[items.length - (i + 1)] = name + NAME_PATH_SEPARATOR + toPath(uri.trimSegments(1));
		}
		exCombo.setItems(items);
		exCombo.select(0);
		exerciseResourceSelected((JexResource)null);
	}

	private void exerciseSelected(String item) {
		int pos = item.indexOf(NAME_PATH_SEPARATOR);
		if (pos >= 0) {
			item = item.substring(0, pos);
		}
		JexResource selection = null;
		if (item != null && (! NO_EXERCISE_LABEL.equals(item))) {
			JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
			JexResource[] resources = manager.getExerciseResources();
			for (int i = 0; i < resources.length; i++) {
				if (item.equals(resources[i].getURI().lastSegment())) {
					selection = resources[i];
					break;
				}
			}
		}
		exerciseResourceSelected(selection);
	}
	
	private Control createExercisesCombo(Composite composite) {
		exCombo = new Combo(composite, SWT.READ_ONLY);
		JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
		refreshExercises(manager.getExerciseResources());
		exCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				exerciseSelected(exCombo.getItem(exCombo.getSelectionIndex()));
			}
		});
		return exCombo;
	}

	/*
	 * 	 points[0] = points of satisfied requirements, points[1] = max points
	 */
	public static void computeRequirementPoints(AbstractRequirement req, int[] points) {
		if (req instanceof JUnitTest) {
			JUnitTest test = (JUnitTest)req;
			if (test.getSatisfied() == Boolean.TRUE) {
				points[0] += test.getPoints();
			}
			points[1] += test.getPoints();
		}
		for (Iterator it = req.getRequirements().iterator(); it.hasNext();) {
			AbstractRequirement childReq = (AbstractRequirement)it.next();
			computeRequirementPoints(childReq, points);
		}
	}
	
	public static String refreshPoints(AbstractRequirement req, String format, Control control) {
		Object points = "?", maxPoints = "?";
		if (req != null) {
			int[] pm = new int[2];
			computeRequirementPoints(req, pm);
			points = new Integer(pm[0]);
			maxPoints = new Integer(pm[1]);
		}
		return setPointsText(points, maxPoints, format, control);
	}
	
	private void refreshPoints(JexResource res) {
		refreshPoints(res != null ? res.getExercise() : null, pointsTextFormat, pointsControl);
	}
	
	public void dispose() {
		super.dispose();
		mainExView = null; 
	}
	
	public void refreshViewer(final JexResource res) {
		if (mainExView != null && res == mainExView.getExerciseResource()) {
			asyncExec(new Runnable() {
				public void run() {
					mainExView.setExerciseResource(res);
					refreshAllTests(res);
					refreshPoints(res);
                    if (pointsControl != null && submitZipButton != null) {
                        submitZipButton.setEnabled (pointsControl.getEnabled ());
                    }
				}
			});
		}
	}

	public void asyncExec(Runnable run) {
		if (display != null) {
			display.asyncExec(run);
		}
	}
	
	public void updateViewer(final List changes, boolean async) {
		if (async) {
			asyncExec(new Runnable() {
				public void run() {
					updateViewer(changes, false);
			}});
		} else {
			for (int i = 0; i < changes.size(); i++) {
				Object o = changes.get(i);
				if (o instanceof AbstractRequirement) {
					mainExView.updateViewer((AbstractRequirement)o);
					refreshPoints(mainExView.getExerciseResource());
                    if (pointsControl != null && submitZipButton != null) {
                        submitZipButton.setEnabled (pointsControl.getEnabled ());
                    }
				}
			}
		}
	}
	
	private String createLocation(URI uri) {
		String location = JexResource.getLocation(uri);
		if (location != null) {
			if (location.indexOf(':') < 0) {
				location = "file:///" + location; 
			}
			if (JexManager.isExerciseResourceName(location)) {
				location = location.substring(0, location.length() - JexResource.JEX_EXTENSION.length()) + "html";
			}
			if (uri.hasFragment()) {
				location += "#" + uri.fragment();
			}
		}
		return location;
	}

	private String toPath(URI uri) {
		String uriString = uri.toString();
		return (uri.isPlatformResource() ? uriString.substring("platform:/resource".length()) : uriString);
	}
	
	private static String JExerciseViewHelpLocation = null; // "/help/JExerciseView.html";
	private static String JExerciseViewHelpString = "For a description of the JExercise view, see the help system (use F1)";

	private void setRightControl(Control control) {
		if (control != null && control.getParent() == rightPane && rightLayout.topControl != control) {
			rightLayout.topControl = control;
			rightPane.layout();
		}
	}
	
	private AbstractRequirement findNearestPreviousRequirementWithDescription(AbstractRequirement req) {
		int pos = -1;
		AbstractRequirement parent = req.getParent();
		do {
			String description = req.getDescription();
			if (description != null && description.length() > 0) {
				return req;
			}
			if (parent == null) {
				return null;
			} else if (pos < 0) {
				pos = parent.getRequirements().indexOf(req);
			}
			pos--;
			if (pos < 0) {
				req = parent;
				parent = req.getParent();
			} else {
				req = (AbstractRequirement)parent.getRequirements().get(pos);
			}
		} while (req != null);
		return null;
	}
	
	private void updateBrowser(AbstractRequirement req) {
		if (detailsExView == null) {
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
				setRightControl(detailsExView);
				detailsExView.setUrl(url.toString());
			} else {
				setRightControl(startupMessage);
			}
		} else {
			String location = null;
			AbstractRequirement descriptionReq = findNearestPreviousRequirementWithDescription(req);
			if (descriptionReq != null) {
				URI uri = null;
				uri = descriptionReq.eResource().getURI().appendFragment(JexXmlHelper.getID(descriptionReq, "description")); // .getDescriptionURI();
				location = createLocation(uri);
				if (location != null && (! descriptionReq.eResource().getResourceSet().getURIConverter().exists(URI.createURI(location), Collections.EMPTY_MAP))) {
					location = null;
				}
			}
			setRightControl(detailsExView);
			if (location != null) {
				detailsExView.setUrl(location);
			} else {
				String description = (descriptionReq != null ? descriptionReq.getDescription() : null);
				if (description != null) {
					detailsExView.setText(description != null ? description : "");
				}
			}
		}
	}
	
	public void requirementSelected(AbstractRequirement req) {
		if (mainExView.getSelectedRequirement() != req) {
			mainExView.setSelectedRequirement(req);
		}
		updateBrowser(req);
	}

	public void requirementValidationRequested(JavaRequirement req) {
		if (req instanceof JUnitTest) {
			JexUiPlugin.getPlugin().getExerciseManager().validateJUnitTest((JUnitTest)req);
			if (autoSubmitMode == Boolean.TRUE) {
				submitZip(true);
			}
		} else {
			IJavaElement javaElement = req.getJavaElement().findJavaCoreElement(JexResource.getJavaProject(req.eResource()));
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
		mainExView.getControl().setFocus();
	}
}