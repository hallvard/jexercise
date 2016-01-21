package no.hal.learning.sharing.ui.views;

import org.eclipse.swt.widgets.Composite;

import no.hal.learning.sharing.runtime.SharingManager;

public class SubscribingView extends SharingView implements SharingManager.Listener {

	@Override
	protected SharingManager getSharingManager() {
		return no.hal.learning.sharing.runtime.Activator.getActivator().getSubscribingManager();
	}	

	@Override
	protected void createSharingControls(Composite parent) {
		setSubscribing(true);
		super.createSharingControls(parent);
	}
}
