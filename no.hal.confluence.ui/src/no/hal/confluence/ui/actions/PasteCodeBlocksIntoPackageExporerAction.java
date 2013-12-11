package no.hal.confluence.ui.actions;

import no.hal.confluence.ui.actions.util.CodeBlockSourceComposer;
import no.hal.confluence.ui.actions.util.CodeBlockSourceExtractor;

public class PasteCodeBlocksIntoPackageExporerAction extends PasteSourceIntoPackageExplorerAction<String> {

	public PasteCodeBlocksIntoPackageExporerAction() {
		super(new CodeBlockSourceExtractor(), new CodeBlockSourceComposer());
	}
}
