package no.hal.emf.ui.utils;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;

public class SelectionContentProvider implements IStructuredContentProvider, ISelectionChangedListener {

	public SelectionContentProvider() {
		super();
	}

	private Viewer viewer = null;
	
	public void dispose() {
		viewer = null;
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (oldInput instanceof ISelectionProvider) {
			((ISelectionProvider) oldInput).removeSelectionChangedListener(this);
		}
		if (newInput instanceof ISelectionProvider) {
			((ISelectionProvider) newInput).addSelectionChangedListener(this);
		}
		this.viewer = viewer;
	}

	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof ISelectionProvider) {
			inputElement = ((ISelectionProvider) inputElement).getSelection();
		}
		if (inputElement instanceof IStructuredSelection) {
			return ((IStructuredSelection) inputElement).toArray();
		}
		return new Object[0];
	}

	public void selectionChanged(SelectionChangedEvent event) {
		if (viewer != null) {
			viewer.refresh();
		}
	}
}
