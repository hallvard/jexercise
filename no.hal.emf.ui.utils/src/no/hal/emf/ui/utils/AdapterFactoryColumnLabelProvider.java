package no.hal.emf.ui.utils;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

public class AdapterFactoryColumnLabelProvider extends ColumnLabelProvider {

	private  ILabelProvider delegate;

	public AdapterFactoryColumnLabelProvider(AdapterFactory adapterFactory) {
		delegate = new AdapterFactoryLabelProvider(adapterFactory);
	}

	@Override
	public String getText(Object element) {
		return delegate.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		return delegate.getImage(element);
	}
}
