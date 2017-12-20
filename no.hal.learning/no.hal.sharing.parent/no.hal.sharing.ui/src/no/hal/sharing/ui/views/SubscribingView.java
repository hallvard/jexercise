package no.hal.sharing.ui.views;

import no.hal.sharing.SharingManager;

public class SubscribingView extends SharingView implements SharingManager.Listener {

	@Override
	protected SharingManager getSharingManager() {
		return no.hal.sharing.Activator.getActivator().getSubscribingManager();
	}	

	@Override
	protected void createSharingActions() {
		setSubscribing(true);
		super.createSharingActions();
	}
}
