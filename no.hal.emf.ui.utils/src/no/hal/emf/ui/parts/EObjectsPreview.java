package no.hal.emf.ui.parts;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;

public abstract class EObjectsPreview extends AbstractEObjectView {

	protected EObjectsPreview(Class<? extends EObjectViewerAdapter<?, ?>> mainAdapterClass) {
		super(mainAdapterClass);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createEObjectComposite(parent);
		addActions(getViewSite().getActionBars());
	}

	protected void addActions(IActionBars actionBars) {
		addSwitchActions();
	}

	//

	protected boolean accept(IResource resource) {
		return true;
	}

	protected boolean accept(Resource resource) {
		for (EObject eObject : resource.getContents()) {
			if (accept(eObject) != null) {
				return true;
			}
		}
		return false;
	}
	
	protected EObject accept(EObject eObject) {
		return null;
	}
}
