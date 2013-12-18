/*
 * Created on 18.mai.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package no.hal.jex.views;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.resource.JexResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author hal
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ExerciseViewContentProvider extends EContentAdapter implements ITreeContentProvider {

	private Viewer viewer = null;
	private Notifier input;
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (oldInput instanceof Notifier) {
			removeAdapter((Notifier) oldInput);
		}
		this.viewer = viewer;
		if (newInput instanceof Notifier) {
			if (input != null) {
				removeAdapter(input);
			}
			input = (Notifier) newInput;
			addAdapter(input);
		}
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getNotifier() instanceof ResourceSet && notification.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
			refresh(notification.getNotifier());
		} else if (notification.getNotifier() instanceof Resource && notification.getFeatureID(Resource.class) == Resource.RESOURCE__CONTENTS) {
			refresh(notification.getNotifier());
		} else if (notification.getFeature() instanceof EReference && ((EReference) notification.getFeature()).isContainment()) {
			refresh(notification.getNotifier());
		}
	}

	protected void refresh(Object notifier) {
		if (viewer instanceof TreeViewer) {
			((TreeViewer) viewer).refresh(notifier);
		} else if (viewer != null) {
			viewer.refresh();
		}
	}

	public void dispose() {
		if (input != null) {
			removeAdapter(input);
		}
		viewer = null;
	}
	
	public Object[] getElements(Object parent) {
		if (parent instanceof ResourceSet) {
			return ((ResourceSet) parent).getResources().toArray();
		}
		return getChildren(parent);
	}

	public Object getParent(Object child) {
		if (child instanceof Resource) {
			return ((Resource) child).getResourceSet();
		} else if (child instanceof AbstractRequirement) {
			AbstractRequirement req = (AbstractRequirement) child, parent = req.getParent();
			return (parent == null || parent instanceof Exercise ? req.eResource() : parent);
		}
		return null;
	}

	private int getChildCount(Object parent) {
		if (parent instanceof ResourceSet) {
			return ((ResourceSet) parent).getResources().size();
		} else if (parent instanceof JexResource) {
			return getChildCount(((JexResource) parent).getExercise());
		} else if (parent instanceof JexResource) {
			return getChildCount(((JexResource) parent).getExercise());
		} else if (parent instanceof AbstractRequirement) {
			return ((AbstractRequirement) parent).getRequirements().size();
		}
		return 0;
	}

	public Object[] getChildren(Object parent) {
		if (parent instanceof Resource) {
			Exercise exercise = ((JexResource) parent).getExercise();
			return (exercise != null ? getChildren(exercise) : new Object[0]);
		} else if (parent instanceof AbstractRequirement) {
			return ((AbstractRequirement) parent).getRequirements().toArray();
		}
		return null;
	}

	public boolean hasChildren(Object parent) {
		if (parent instanceof JexResource) {
			JexResource res = (JexResource) parent;
			if (! res.isLoaded()) {
				return true;
			}
		}
		return getChildCount(parent) > 0;
	}
}
