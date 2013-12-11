package no.hal.confluence.ui.actions;

import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.views.BrowserView;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public abstract class CopySourceToClipboardAction<T> extends CopyContentToClipboardAction {
	
	public CopySourceToClipboardAction() {
	}

	private SourceComposer<T> sourceComposer;
	
	public void setSourceComposer(SourceComposer<T> sourceComposer) {
		this.sourceComposer = sourceComposer;
	}

	protected String composeSource(Collection<T> sourceRegions) {
		return sourceComposer.composeSource(sourceRegions);
	}

	private SourceRegionExtractor<T> sourceRegionExtractor;
	
	public void setSourceRegionExtractor(SourceRegionExtractor<T> sourceRegionExtractor) {
		this.sourceRegionExtractor = sourceRegionExtractor;
	}

	protected Collection<T> getSourceRegions() {
		return sourceRegionExtractor.getSourceRegions(browserView.getContent());
	}

	private ILabelProvider labelProvider = new LabelProvider() {
		@Override
		public String getText(Object o) {
			return o.toString();
		}
		@Override
		public Image getImage(Object o) {
			return null;
		}
	};

	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}
	
	@Override
	protected void update(BrowserView browserView) {
		super.update(browserView);
		if (! isEnabled()) {
			Iterable<T> sourceRegions = getSourceRegions();
			setEnabled(sourceRegions != null && sourceRegions.iterator().hasNext());
		}
	}
	
	private boolean autoSelectSingleElement = true;
	
	@Override
	public void run() {
		String source = (matchUrl(browserView.getLocation()) ? browserView.getContent() : null);
		if (source == null) {
			Collection<T> sourceRegions = getSourceRegions();
			if (sourceRegions == null || sourceRegions.size() == 0) {
				return;
			}
			if (sourceRegions.size() > 1 || (! autoSelectSingleElement)) {
				ElementListSelectionDialog selectionDialog = new ElementListSelectionDialog(browserView.getControl().getShell(), labelProvider);
				selectionDialog.setTitle("Select one or more sources");
				selectionDialog.setElements(sourceRegions.toArray());
				if (selectionDialog.open() != Dialog.OK) {
					return;
				}
				sourceRegions = (Collection<T>) Arrays.asList(selectionDialog.getResult());
			}
			source = composeSource(sourceRegions);
		}
		copyToClipBoard(source);
	}
}
