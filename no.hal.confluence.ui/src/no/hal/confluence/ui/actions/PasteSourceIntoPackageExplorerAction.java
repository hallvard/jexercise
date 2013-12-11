package no.hal.confluence.ui.actions;

import no.hal.confluence.ui.Activator;
import no.hal.confluence.ui.actions.util.PasteSourceIntoPackageExplorerHelper;
import no.hal.confluence.ui.preferences.WikiPreferencePage;

import org.eclipse.core.runtime.Preferences;

public abstract class PasteSourceIntoPackageExplorerAction<T> extends CopySourceToClipboardAction<T> {

	private static final String PACKAGE_EXPLORER_VIEW_ID = "org.eclipse.jdt.ui.PackageExplorer";
	
	public PasteSourceIntoPackageExplorerAction(SourceRegionExtractor<T> sourceRegionExtractor, SourceComposer<T> sourceComposer) {
		setSourceRegionExtractor(sourceRegionExtractor);
		setSourceComposer(sourceComposer);
	}

	protected String getSourceFolderPathFromPreferences() {
		Preferences pluginPreferences = Activator.getDefault().getPluginPreferences();
		return pluginPreferences.getString(WikiPreferencePage.WIKI_SOURCE_PATH);
	}
	
	@Override
	public void run() {
		super.run();
		PasteSourceIntoPackageExplorerHelper pasteHelper = new PasteSourceIntoPackageExplorerHelper();
		pasteHelper.run(getSourceFolderPathFromPreferences(), getDefaultSourceFolder(), getPostPasteHook(), browserView.getControl().getDisplay(), null);
	}

	protected String getDefaultSourceFolder() {
		return "src";
	}

	protected PostPasteHook getPostPasteHook() {
		return null;
	}
}
