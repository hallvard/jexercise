package no.hal.confluence.ui.actions;

import no.hal.confluence.ui.views.WikiAction;

import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;

public class CopyContentToClipboardAction extends WikiAction {
	
	public CopyContentToClipboardAction() {
	}

	@Override
	public void run() {
		super.run();
		copyToClipBoard(browserView.getContent());
	}
	
	protected void copyToClipBoard(String testSource) {
		Clipboard clipBoard = new Clipboard(browserView.getControl().getDisplay());
		TextTransfer transfer = TextTransfer.getInstance();
		clipBoard.setContents(new Object[]{testSource}, new Transfer[]{transfer});
		clipBoard.dispose();
	}
}
