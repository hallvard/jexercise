package no.hal.confluence.ui.actions;

import no.hal.confluence.ui.actions.util.PasteSourceIntoPackageExplorerHelper;
import no.hal.confluence.ui.preferences.WikiPreferencePage;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragmentRoot;

public abstract class PasteSourceIntoPackageExplorerAction<T> extends CopySourceToClipboardAction<T> {

	public PasteSourceIntoPackageExplorerAction(ContentRegionExtractor<T> sourceRegionExtractor, SourceComposer<T> sourceComposer) {
		setContentRegionExtractor(sourceRegionExtractor);
		setSourceComposer(sourceComposer);
	}

	protected String getSourceFolderString() {
		return getFolderPathString(WikiPreferencePage.WIKI_SOURCE_PATH, IFolder.class, IPackageFragmentRoot.class, null);
	}
	
	protected String getDefaultSourceFolderName() {
		return "src";
	}
	
	private PasteSourceIntoPackageExplorerHelper pasteHelper = null;

	@Override
	public void run() {
		super.run();
		if (pasteHelper == null) {
			pasteHelper = new PasteSourceIntoPackageExplorerHelper(getSourceFolderString(), getDefaultSourceFolderName(), getPostActionHook(), browserView);
		}
		pasteHelper.run(new NullProgressMonitor());
	}

	protected PostActionHook<IJavaElement> getPostActionHook() {
		return null;
	}
}
