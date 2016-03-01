package no.hal.emf.ui.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class EClassViewerFilter extends ViewerFilter {

	private final EClass eClass;

	public EClassViewerFilter(EClass eClass) {
		this.eClass = eClass;
	}

	public EClass getEClass() {
		return eClass;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return eClass.isInstance(element);
	}
}
