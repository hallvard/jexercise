package no.hal.sharing.ui.views;

import no.hal.sharing.SharingManager;

public class PublishingView extends SharingView {

	@Override
	protected SharingManager getSharingManager() {
		return no.hal.sharing.Activator.getActivator().getPublisingManager();
	}	

	@Override
	protected void createSharingActions() {
		setPublishing(true);
		super.createSharingActions();
	}
}
