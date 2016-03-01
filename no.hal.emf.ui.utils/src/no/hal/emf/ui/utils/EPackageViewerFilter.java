package no.hal.emf.ui.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class EPackageViewerFilter extends ViewerFilter {

	private final EPackage ePackage;

	public EPackageViewerFilter(EPackage ePackage) {
		this.ePackage = ePackage;
	}

	public EPackage getEPackage() {
		return ePackage;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return element instanceof EObject && ((EObject) element).eClass().getEPackage() == ePackage;
	}
}
