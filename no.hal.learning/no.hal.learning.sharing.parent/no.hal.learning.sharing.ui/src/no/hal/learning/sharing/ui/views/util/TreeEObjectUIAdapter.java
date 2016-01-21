package no.hal.learning.sharing.ui.views.util;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.emf.ui.utils.DelegatingContentProvider;

public abstract class TreeEObjectUIAdapter<E extends EObject> extends EObjectUIAdapterImpl<E, Composite> {

	public TreeEObjectUIAdapter(E eObject) {
		super(eObject);
	}
	
	protected ComposedAdapterFactory adapterFactory;
	protected TreeViewer treeViewer;

	@Override
	public Composite initView(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
	
		treeViewer = new TreeViewer(composite, SWT.NONE);

		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		treeViewer.setContentProvider(createContentProvider());
		treeViewer.setLabelProvider(createLabelProvider());

		treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		updateView();

		return composite;
	}

	protected AdapterFactoryLabelProvider createLabelProvider() {
		return new AdapterFactoryLabelProvider(adapterFactory);
	}

	protected DelegatingContentProvider createContentProvider() {
		return new DelegatingContentProvider(new AdapterFactoryContentProvider(adapterFactory));
	}

	@Override
	public void updateView() {
		setInput(eObject);
	}
	
	protected void setInput(EObject viewObject) {
		setInput(Collections.singletonList(viewObject));
	}

	protected void setInput(Collection<EObject> viewObjects) {
		treeViewer.setInput(viewObjects);
	}
}
