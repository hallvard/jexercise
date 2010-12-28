/*
 * Created on 18.mai.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package no.hal.jex.views;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.ExercisePart;
import no.hal.jex.JUnitTest;
import no.hal.jex.JUnitTestStatus;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Requirement;
import no.hal.jex.impl.ExercisePartImpl;
import no.hal.jex.resource.JexResource;
import no.hal.jex.ui.JexUiPlugin;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;

/**
 * @author hal
 *
 */
public class ExerciseViewLabelProvider extends LabelProvider {
	
	public String getText(Object obj) {
		String text = (obj instanceof AbstractRequirement ? ((AbstractRequirement)obj).getText() : null);
		if (obj instanceof JexResource) {
			JexResource res = (JexResource)obj;
			Exercise ex = res.getExercise();
			text = (ex != null ? getText(ex) : res.getURI().toString());
		} else if (obj instanceof Exercise) {
			JexResource res = JexUiPlugin.getPlugin().getExerciseManager().getExerciseResource((Exercise)obj);
			String exText = (res != null ? res.getURI().toString() : null);
			if (text != null && exText != null) {
				exText = exText + ": " + text;
			}
			text = exText;
		} else if (obj instanceof ExercisePart) {
			String partText = "Part " + ExercisePartImpl.getPartNumber((ExercisePart)obj);
			if (text != null) {
				partText = partText + ": " + text;
			}
			String pointsText = ExerciseView.refreshPoints((ExercisePart)obj, "{0} of {1}", null);
			text = partText + " - " + pointsText;
		} else if (obj instanceof JavaRequirement) {
			JavaRequirement req = (JavaRequirement)obj;
			JavaElement javaElement = req.getJavaElement();
			if (text == null) {
				text = javaElement.toString();
			}
		}
		return (text != null ? text : "");
	}

	public final static String PART_OK_IMAGE = "part_ok.png";
	public final static String PART_OK_ERROR_IMAGE = "part_error.png";

	public final static String REQUIREMENT_DEFAULT_IMAGE = "requirement_default";
	public final static String REQUIREMENT_OK_IMAGE = "requirement_ok";
	public final static String REQUIREMENT_OK_ERROR_IMAGE = "requirement_ok_error";
	public final static String REQUIREMENT_OK_DEFAULT_IMAGE = "requirement_ok_default";
	public final static String REQUIREMENT_ERROR_IMAGE = "requirement_error";

	public final static String JUNIT_DEFAULT_IMAGE = "junit_default.jpg";
	public final static String JUNIT_OK_IMAGE = "junit_ok.jpg";
	public final static String JUNIT_FAILURE_IMAGE = "junit_failure.jpg";
	public final static String JUNIT_ERROR_IMAGE = "junit_error.jpg";

	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		Boolean childrenSatisfied = (obj instanceof AbstractRequirement ? ((AbstractRequirement)obj).getChildrenSatisfied() : null);
		if (obj instanceof JexResource) {
			JexResource res = (JexResource)obj;
			Exercise ex = res.getExercise();
			if (ex != null) {
				return getImage(ex);
			}
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		} else if (obj instanceof Exercise || obj instanceof ExercisePart) {
			imageKey = (childrenSatisfied == null ? ISharedImages.IMG_OBJ_FOLDER : (childrenSatisfied.booleanValue() ? PART_OK_IMAGE : PART_OK_ERROR_IMAGE));
		} else if (obj instanceof Requirement) {
			Requirement req = (Requirement)obj;
			Boolean satisfied = req.getSatisfied();
			if (req instanceof JUnitTest) {
				int testStatus = ((JUnitTest)req).getTestStatus();
				if (testStatus == JUnitTestStatus.ERROR_VALUE || testStatus == JUnitTestStatus.FAILURE_VALUE) {
					imageKey = JUNIT_ERROR_IMAGE;
				} else {
					imageKey = (satisfied == null ? JUNIT_DEFAULT_IMAGE : (satisfied.booleanValue() ? JUNIT_OK_IMAGE : JUNIT_FAILURE_IMAGE));
				}
			} else if (satisfied == Boolean.TRUE) {
				imageKey = (childrenSatisfied == null ? REQUIREMENT_OK_DEFAULT_IMAGE : (childrenSatisfied.booleanValue() ? REQUIREMENT_OK_IMAGE : REQUIREMENT_OK_ERROR_IMAGE));
			} else {
				imageKey = (satisfied == null ? REQUIREMENT_DEFAULT_IMAGE : (satisfied.booleanValue() ? REQUIREMENT_OK_IMAGE : REQUIREMENT_ERROR_IMAGE));
			}
		}
		Object imageDescription = JexUiPlugin.getPlugin().getImage(imageKey);
//		System.out.println(imageKey + " -> " + imageDescription);
		return (imageDescription instanceof Image ? (Image)imageDescription : null);
	}
}
