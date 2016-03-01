package no.hal.emf.ui.utils;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

public class DelegatingLabelProvider implements ILabelProvider, IColorProvider, IFontProvider {

	private ILabelProvider delegate;

	public DelegatingLabelProvider(ILabelProvider delegate) {
		this.delegate = delegate;
	}
	
	public void dispose() {
		if (delegate != null) {
			delegate.dispose();
			delegate = null;
		}
	}

	public String getText(Object element) {
		if (element == null) {
			return "<none>";
		} else if (element instanceof Resource) {
			Resource resource = (Resource) element;
			URI uri = resource.getURI();
			return uri.lastSegment() + " - " + uri.trimSegments(1);
		} else if (delegate != null) {
			return delegate.getText(element);
		} else if (element instanceof EObject) {
			return Names.getName((EObject) element);
		}
		return "?";
	}

	public Image getImage(Object element) {
		return (delegate != null ? delegate.getImage(element) : null);
	}
	
	public boolean isLabelProperty(Object element, String property) {
		return delegate != null && delegate.isLabelProperty(element, property);
	}

	public void addListener(ILabelProviderListener listener) {
		if (delegate != null) {
			delegate.addListener(listener);
		}
	}
	public void removeListener(ILabelProviderListener listener) {
		if (delegate != null) {
			delegate.removeListener(listener);
		}
	}
	
	// IColorProvider
	
	public Color getForeground(Object element) {
		return (delegate instanceof IColorProvider ? ((IColorProvider) delegate).getForeground(element) : null);
	}

	public Color getBackground(Object element) {
		return (delegate instanceof IColorProvider ? ((IColorProvider) delegate).getBackground(element) : null);
	}

	// IFontProvider
	
	public Font getFont(Object element) {
		return (delegate instanceof IFontProvider ? ((IFontProvider) delegate).getFont(element) : null);
	}
}