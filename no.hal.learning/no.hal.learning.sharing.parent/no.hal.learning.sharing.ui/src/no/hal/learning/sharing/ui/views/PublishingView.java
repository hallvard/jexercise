package no.hal.learning.sharing.ui.views;

import org.eclipse.swt.widgets.Composite;

import no.hal.learning.sharing.runtime.SharingManager;

public class PublishingView extends SharingView {

	@Override
	protected SharingManager getSharingManager() {
		return no.hal.learning.sharing.runtime.Activator.getActivator().getPublisingManager();
	}	

	@Override
	protected void createSharingControls(Composite parent) {
		setPublishing(true);
		super.createSharingControls(parent);
	}
}
