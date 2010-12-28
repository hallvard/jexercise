/*
 * Created on 18.mai.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package no.hal.jex.views;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.resource.JexResource;
import no.hal.jex.ui.JexManager;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author hal
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ExerciseViewContentProvider
	implements IStructuredContentProvider, ITreeContentProvider {

	public ExerciseViewContentProvider() {
	}

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}
	
	public Object[] getElements(Object parent) {
		if (parent instanceof JexManager) {
			return ((JexManager)parent).getExerciseResources();
		}
		return getChildren(parent);
	}

	public Object getParent(Object child) {
		if (child instanceof AbstractRequirement) {
			return ((AbstractRequirement)child).getParent();
		}
		return null;
	}

	private int getChildCount(Object parent) {
		if (parent instanceof JexManager) {
			return ((JexManager)parent).getExerciseCount();
		} else if (parent instanceof JexResource) {
			JexResource res = (JexResource)parent;
			return getChildCount(res.getExercise());
		} else if (parent instanceof AbstractRequirement) {
			return ((AbstractRequirement)parent).getRequirements().size();
		}
		return 0;
	}

	public Object[] getChildren(Object parent) {
		if (parent instanceof JexResource) {
			JexResource res = (JexResource)parent;
			return getChildren(res.getExercise());
		} else if (parent instanceof AbstractRequirement) {
			return ((AbstractRequirement)parent).getRequirements().toArray();
		}
		return null;
	}

	public boolean hasChildren(Object parent) {
		if (parent instanceof JexResource) {
			JexResource res = (JexResource)parent;
			if (! res.isLoaded()) {
				return true;
			}
		}
		return getChildCount(parent) > 0;
	}
}
