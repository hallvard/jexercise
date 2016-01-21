package no.hal.learning.sharing.ui.views.util;

import org.eclipse.swt.widgets.Display;

import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.runtime.SharingManager;

public class SharingManagerAsyncListener implements SharingManager.Listener {

	protected final SharingManager.Listener delegate; 
	private Display display;
	
	public SharingManagerAsyncListener(SharingManager.Listener delegate) {
		this.delegate = delegate;
	}

	protected Display getDisplay() {
		return display;
	}
	
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	@Override
	public void shareAdded(final ShareModel shareModel) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				delegate.shareAdded(shareModel);
			}
		});
	}

	@Override
	public void shareReplaced(final ShareModel shareModel) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				delegate.shareReplaced(shareModel);
			}
		});
	}

	@Override
	public void shared(final AbstractShare shareModel) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				delegate.shared(shareModel);
			}
		});
	}

	@Override
	public void unshared(final ShareModel shareModel) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				delegate.unshared(shareModel);
			}
		});
	}

	@Override
	public void shareRemoved(final ShareModel shareModel) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				delegate.shareRemoved(shareModel);
			}
		});
	}
}
