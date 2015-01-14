package no.hal.confluence.ui.actions;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.resources.ContentRegionExtractor;
import no.hal.confluence.ui.resources.util.ContentUrlExtractor;
import no.hal.confluence.ui.views.BrowserView;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public abstract class AbstractContentRegionAction<T> extends WikiAction {
	
	public AbstractContentRegionAction() {
	}

	private ContentRegionExtractor<T> contentRegionExtractor;
	
	public void setContentRegionExtractor(ContentRegionExtractor<T> sourceRegionExtractor) {
		this.contentRegionExtractor = sourceRegionExtractor;
	}

	public ContentRegionExtractor<URL> getContentMatchingUrlExtractor() {
		return new ContentUrlExtractor() {
			@Override
			protected boolean acceptUrl(String urlString) {
				return matchUrl(urlString); 
			}
		};
	}
	
	protected Collection<T> getContentRegions() {
		return contentRegionExtractor.getContentRegions(browserView.getContent());
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
	public void update(BrowserView browserView) {
		super.update(browserView);
		if (! isEnabled()) {
			Iterable<T> sourceRegions = getContentRegions();
			setEnabled(sourceRegions != null && sourceRegions.iterator().hasNext());
		}
	}
	
	private boolean autoSelectSingleElement = true;
	
	protected Collection<T> selectContentRegions() {
		Collection<T> contentRegions = getContentRegions();
		if (contentRegions == null || contentRegions.size() == 0) {
			return null;
		}
		if (contentRegions.size() > 1 || (! autoSelectSingleElement)) {
			ElementListSelectionDialog selectionDialog = new ElementListSelectionDialog(browserView.getControl().getShell(), labelProvider);
			selectionDialog.setTitle("Select one or more elements");
			selectionDialog.setElements(contentRegions.toArray());
			if (selectionDialog.open() != Dialog.OK) {
				return null;
			}
			contentRegions = (Collection<T>) Arrays.asList(selectionDialog.getResult());
		}
		return contentRegions;
	}
}
