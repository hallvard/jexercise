package no.hal.sharing.ui.views.util;

import org.eclipse.swt.widgets.Display;

import no.hal.sharing.SharingManager;

public class SharingManagerAsyncListener implements SharingManager.Listener {

	protected final SharingManager.Listener delegate; 
	private Display display;
	
	public SharingManagerAsyncListener(SharingManager.Listener delegate) {
		this.delegate = delegate;
	}

	protected Display getDisplay() {
		return (display != null ? display : Display.getCurrent());
	}
	
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	@Override
	public void shareChanged(final SharingManager sharingManager, final String key, final int what) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				delegate.shareChanged(sharingManager, key, what);
			}
		});		
	}
}
