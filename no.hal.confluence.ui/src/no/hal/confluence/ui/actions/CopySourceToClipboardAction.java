package no.hal.confluence.ui.actions;

import java.util.Collection;

import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;

public abstract class CopySourceToClipboardAction<T> extends AbstractContentRegionAction<T> {
	
	private SourceComposer<T> sourceComposer;
	
	public void setSourceComposer(SourceComposer<T> sourceComposer) {
		this.sourceComposer = sourceComposer;
	}

	protected String composeSource(Collection<T> sourceRegions) {
		return sourceComposer.composeSource(sourceRegions);
	}
	
	@Override
	public void run() {
		String source = (matchUrl(browserView.getLocation()) ? browserView.getContent() : null);
		if (source == null) {
			Collection<T> sourceRegions = selectContentRegions();
			if (sourceRegions == null || sourceRegions.size() == 0) {
				return;
			}
			source = composeSource(sourceRegions);
		}
		copyToClipBoard(source);
	}
	
	protected void copyToClipBoard(String testSource) {
		Clipboard clipBoard = new Clipboard(browserView.getControl().getDisplay());
		TextTransfer transfer = TextTransfer.getInstance();
		clipBoard.setContents(new Object[]{testSource}, new Transfer[]{transfer});
		clipBoard.dispose();
	}
}
