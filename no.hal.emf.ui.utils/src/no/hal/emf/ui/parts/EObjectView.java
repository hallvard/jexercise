package no.hal.emf.ui.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;

public abstract class EObjectView extends AbstractEObjectView {

	protected EObjectView(Class<? extends EObjectViewerAdapter<?, ?>> mainAdapterClass) {
		super(mainAdapterClass);
	}

	private EObject eObject;

	public EObject getEObject() {
		return eObject;
	}
	
	public void setEObject(EObject eObject) {
		this.eObject = eObject;
		if (eObjectControl == null) {
			switchView(null);
			setFocus();
		}
	}

	private Composite composite;
	private Control eObjectControl;

	@Override
	public void createPartControl(Composite parent) {
		this.composite = createEObjectComposite(parent);
		switchView(null);
	}

	@Override
	protected Composite getCurrentComposite() {
		return composite;
	}

	@Override
	public void setFocus() {
		if (eObjectControl != null) {
			eObjectControl.setFocus();
		}
	}
}
