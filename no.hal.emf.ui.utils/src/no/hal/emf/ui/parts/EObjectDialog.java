package no.hal.emf.ui.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;

public abstract class EObjectDialog<E extends EObject> extends Dialog {

	private E eObject;
	
	protected EObjectDialog(Shell parentShell) {
		super(parentShell);
	}
	
	public void setEObject(E eObject) {
		this.eObject = eObject;
	}

	private Point initialSize = null;
	
	public void setInitialSize(Point initialSize) {
		this.initialSize = initialSize;
	}

	public void setInitialSize(int width, int height) {
		setInitialSize(new Point(width, height));
	}
	
	protected Point getInitialSize() {
		return (initialSize != null ? initialSize : super.getInitialSize());
	}

	protected boolean isResizable() {
	    return true;
	}

	private EObjectViewerAdapterHelper adapterHelper = new EObjectViewerAdapterHelper();

	private EObjectViewerAdapter<?, ?> viewerAdapter;
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		viewerAdapter = installAdapter(eObject);
		viewerAdapter.initView(composite);
		return composite;
	}

	protected EObjectViewerAdapter<?, ?> installAdapter(E eObject) {
		return adapterHelper.adapt(eObject, EObjectViewerAdapter.class);
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}
	
	@Override
	public boolean close() {
		viewerAdapter.dispose();
		return super.close();
	}
}
