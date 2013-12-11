package no.hal.confluence.ui.actions;

import java.net.URL;

import no.hal.confluence.ui.actions.util.LinkedSourceComposer;
import no.hal.confluence.ui.actions.util.SourceUrlExtractor;

public class PasteLinkedSourceIntoPackageExporerAction extends PasteSourceIntoPackageExplorerAction<URL> {

	public PasteLinkedSourceIntoPackageExporerAction() {
		super(null, new LinkedSourceComposer());
		setSourceRegionExtractor(new SourceUrlExtractor() {
			protected URL createSourceRegion(String browserContent, int start, int end) {
				URL url = super.createSourceRegion(browserContent, start, end);
				return url != null && matchUrl(url.toString()) ? url : null; 
			}
		});
	}
}
