package no.hal.confluence.ui.actions;

import java.net.URL;

import no.hal.confluence.ui.actions.util.LinkedSourceComposer;

public class PasteLinkedSourceIntoPackageExporerAction extends PasteSourceIntoPackageExplorerAction<URL> {

	public PasteLinkedSourceIntoPackageExporerAction() {
		super(null, new LinkedSourceComposer());
		setContentRegionExtractor(getContentMatchingUrlExtractor());
	}
}
