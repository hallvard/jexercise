package no.hal.emf.ui.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DelegatingContentProvider implements ITreeContentProvider {
	
	private ITreeContentProvider delegate;
	
	public DelegatingContentProvider(ITreeContentProvider delegate) {
		this.delegate = delegate;
	}
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (delegate != null) {
			delegate.inputChanged(viewer, oldInput, newInput);
		}
	}
	
	public void dispose() {
		if (delegate != null) {
			delegate.dispose();
			delegate = null;
		}
	}
	
	public boolean hasChildren(Object element) {
		if (element instanceof ISelection) {
			return ((IStructuredSelection) element).isEmpty();
		} else if (element instanceof Object[]) {
			return ((Object[]) element).length > 0;
		} else if (element instanceof Collection<?>) {
			return ((Collection<?>) element).size() > 0;
		}
		return (delegate != null ? delegate.hasChildren(element) : false);
	}
	
	public Object getParent(Object element) {
		if (element instanceof IStructuredSelection) {
			return null;
		} else if (element instanceof Object[]) {
			return null;
		} else if (element instanceof Collection<?>) {
			return null;
		}
		return (delegate != null ? delegate.getParent(element) : null);
	}
	
	private boolean expandSelection = false;
	
	public void setExpandSelection(boolean expandSelection) {
		this.expandSelection = expandSelection;
	}

	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IStructuredSelection) {
			return iteratorElements(((IStructuredSelection) inputElement).iterator(), expandSelection ? true : null);
		} else if (inputElement instanceof Object[]) {
			return (Object[]) inputElement; 
		} else if (inputElement instanceof Collection<?>) {
			return ((Collection<?>) inputElement).toArray();
		}
		return (delegate != null ? delegate.getElements(inputElement) : new Object[0]);
	}
	
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IStructuredSelection) {
			return iteratorElements(((IStructuredSelection) parentElement).iterator(), expandSelection ? false : null);
		} else if (parentElement instanceof Object[]) {
			return (Object[]) parentElement; 
		} else if (parentElement instanceof Collection<?>) {
			return ((Collection<?>) parentElement).toArray();
		}
		return (delegate != null ? delegate.getChildren(parentElement) : new Object[0]);
	}
	
	private Object[] iteratorElements(Iterator<?> iterator, Boolean expandToElements) {
		Collection<Object> col = new ArrayList<Object>();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			if (expandToElements != null) {
				Object nexts[] = (expandToElements ? getElements(next) : getChildren(next));
				for (int i = 0; i < nexts.length; i++) {
					col.add(nexts[i]);
				}
			} else {
				col.add(next);
			}
		}
		return col.toArray();
	}
}