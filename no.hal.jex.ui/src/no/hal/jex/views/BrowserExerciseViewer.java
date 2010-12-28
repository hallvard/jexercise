package no.hal.jex.views;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.ExercisePart;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaRequirement;
import no.hal.jex.resource.JexResource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class BrowserExerciseViewer implements IExerciseViewer, LocationListener {

	private Browser browser;
	
	public BrowserExerciseViewer(Composite parent, int style) {
		browser = new Browser(parent, style);
		init();
	}
	public BrowserExerciseViewer(Composite parent) {
		this(parent, SWT.NONE);
	}
	public BrowserExerciseViewer(Browser browser) {
		this.browser = browser;
		init();
	}

	private void init() {
		browser.addLocationListener(this);
	}

	public JexResource getExerciseResource() {
		return (JexResource)getSelectedRequirement().eResource();
	}
	public void setExerciseResource(JexResource res) {
		setSelectedRequirement(res.getExercise());
	}
	
	public void updateViewer(AbstractRequirement req) {
		updateBrowser();
	}
	
	private AbstractRequirement selection;
	
	public AbstractRequirement getSelectedRequirement() {
		return selection;
	}

	public void setSelectedRequirement(AbstractRequirement req) {
		this.selection = req;
		updateBrowser();
	}

	public Control getControl() {
		return browser;
	}
	
	public final static String RESOURCE_URI_PROTOCOL_PREFIX = "res:";
	public final static String REQUIREMENT_VALIDATION_SUFFIX = "#validate()";

	public static String getResourceURI(Resource res, EObject eo) {
		String fragment = res.getURIFragment(eo);
		return fragment != null ? RESOURCE_URI_PROTOCOL_PREFIX + fragment : null;
	}
	
	private String getBrowserText(Object obj) {
		String text = (obj instanceof AbstractRequirement ? ((AbstractRequirement)obj).getText() : null);
		if (obj instanceof JexResource) {
			JexResource res = (JexResource)obj;
			Exercise ex = res.getExercise();
			text = (ex != null ? getBrowserText(ex) : res.getURI().toString());
		} else if (obj instanceof ExercisePart) {
			String partText = "Part " + (((ExercisePart)obj).getParent().getRequirements().indexOf(obj) + 1);
			if (text != null) {
				partText = text + ": " + text;
			}
			text = partText;
		} else if (obj instanceof JavaRequirement) {
			JavaRequirement req = (JavaRequirement)obj;
			JavaElement javaElement = req.getJavaElement();
			if (text == null) {
				text = javaElement.toString();
			}
			// MessageFormat.format(req.getWhat(), new Object[]{<java_element>.getName()});
		}
		if (obj instanceof AbstractRequirement) {
			text += "<p>";
			AbstractRequirement req = (AbstractRequirement)obj;
			for (Iterator it = req.getRequirements().iterator(); it.hasNext();) {
				AbstractRequirement subReq = (AbstractRequirement) it.next();
				String uri = getResourceURI(subReq.eResource(), subReq);
				if (uri != null) {
					text += "<li><a href='" + uri + "'>" + subReq.getText() + "</a></li>";
				}
			}
			text += "</p>";
		}
		return (text != null ? text : "");
	}

	private void updateBrowser() {
		AbstractRequirement req = getSelectedRequirement();
		browser.setText(req != null ? getBrowserText(req) : "");
	}
	
	private List listeners;
	
	public void addExerciseListener(ExerciseListener listener) {
		if (listeners == null) {
			listeners = new ArrayList();
		}
		listeners.add(listener);
	}

	public void removeExerciseListener(ExerciseListener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}
	
	private void fireRequirementSelected(AbstractRequirement req) {
		for (Iterator it = listeners.iterator(); it.hasNext();) {
			ExerciseListener listener = (ExerciseListener)it.next();
			listener.requirementSelected(req);
		}
	}
	private void fireRequirementValidationRequested(JavaRequirement req) {
		for (Iterator it = listeners.iterator(); it.hasNext();) {
			ExerciseListener listener = (ExerciseListener)it.next();
			listener.requirementValidationRequested(req);
		}
	}

	public void changing(LocationEvent event) {
		String location = event.location;
//		System.out.println("Changing to " + location);
		if (location == null || (! location.startsWith(RESOURCE_URI_PROTOCOL_PREFIX))) {
			return;
		}
		location = location.substring(RESOURCE_URI_PROTOCOL_PREFIX.length());
		AbstractRequirement req = getSelectedRequirement();
		if (req == null) {
			return;
		}
		boolean validate = false;
		if (location.endsWith(REQUIREMENT_VALIDATION_SUFFIX)) {
			location = location.substring(0, location.length() - REQUIREMENT_VALIDATION_SUFFIX.length());
			validate = true;
		}
		Resource res = req.eResource();
		EObject eo = res.getEObject(location);
		if (eo instanceof AbstractRequirement) {
			setSelectedRequirement((AbstractRequirement)eo);
			fireRequirementSelected(req);
			if (validate && req instanceof JavaRequirement) {
				fireRequirementValidationRequested((JavaRequirement)req);
			}
		}
	}
	public void changed(LocationEvent event) {
		// System.out.println("Changed to " + event.location);
	}
}
