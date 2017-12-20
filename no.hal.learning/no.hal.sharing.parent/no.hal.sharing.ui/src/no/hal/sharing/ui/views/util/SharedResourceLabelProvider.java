package no.hal.sharing.ui.views.util;

import java.util.Collection;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import no.hal.emf.ui.utils.FileExtensionLabelProvider;
import no.hal.emf.ui.utils.FontStyler;
import no.hal.sharing.SharedResource;
import no.hal.sharing.SharingManager;

public class SharedResourceLabelProvider extends ColumnLabelProvider implements ILabelProvider {

	public final static int KEY_COLUMN = 0, FROM_COLUMN = 1, TO_COLUMN = 2, PATH_COLUMN = 3, DERIVED_COUNT_COLUMN = 4;

	private SharingManager sharingManager;

	public SharedResourceLabelProvider(SharingManager sharingManager) {
		this.sharingManager = sharingManager;
	}
	public SharedResourceLabelProvider(SharingManager sharingManager, int column) {
		this(sharingManager);
		this.column = column;
	}

	private int column = -1;

	protected String getColumnText(Object element, int column) {
		if (element instanceof SharedResource) {
			SharedResource resource = (SharedResource) element;
			switch (column) {
			case KEY_COLUMN: 	return resource.key;
			case FROM_COLUMN: 	return (resource.from != null ? resource.from : "*");
			case TO_COLUMN: 	return (resource.to != null ? resource.to : "*");
			case PATH_COLUMN: 	return resource.getPath().toString();
			case DERIVED_COUNT_COLUMN: 	{
				Collection<SharedResource> derivedResources = sharingManager.getDerivedResources(sharingManager.getSharedResourceKey(resource));
				return derivedResources != null ? String.valueOf(derivedResources.size()) : "0";
			}
			default: return resource.key;
			}
		}
		return null;
	}

	protected Image getColumnImage(Object element, int column) {
		String text = getText(element);
		if (element instanceof SharedResource) {
			switch (column) {
			case KEY_COLUMN:
				return fileExtensionLabelProvider.getExtentionImage(text);
//			case PATH_COLUMN:
//				return fileExtensionLabelProvider.getExtentionImage(text);
			default: return null;
			}
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		return getColumnText(element, column >= 0 ? column : KEY_COLUMN);
	}

	private FileExtensionLabelProvider fileExtensionLabelProvider = new FileExtensionLabelProvider(null); 

	@Override
	public Image getImage(Object element) {
		return getColumnImage(element, column >= 0 ? column : KEY_COLUMN);
	}

	private boolean fontEffect = true;

	@Override
	public Font getFont(Object element) {
		Font font = null;
		if (fontEffect) {
			if (element instanceof SharedResource) {
				SharedResource resource = (SharedResource) element;
				Boolean enabled = sharingManager.getEnabled(sharingManager.getSharedResourceKey(resource));
				if (enabled != null) {
					int fontStyle = (enabled ? SWT.BOLD : SWT.NORMAL);
					FontDescriptor descriptor = FontDescriptor.createFrom(new FontData()).setStyle(fontStyle);
					font = descriptor.createFont(Display.getCurrent());
				}
			}
		}
		return font;
	}

	private boolean backgroundEffect = false;

	@Override
	public Color getBackground(Object element) {
		Color color = null;
		if (backgroundEffect) {
			Boolean enabled = null;
			if (element instanceof SharedResource) {
				enabled = sharingManager.getEnabled(sharingManager.getSharedResourceKey((SharedResource) element));
			}
			if (enabled != null) {
				int colorCode = enabled ? SWT.COLOR_GREEN : SWT.COLOR_RED;
				color = Display.getCurrent().getSystemColor(colorCode);
			}
		}
		return color;
	}

	@Override
	public String getToolTipText(Object element) {
		return getColumnText(element, KEY_COLUMN) + " @ " + getColumnText(element, PATH_COLUMN);
	}
}
