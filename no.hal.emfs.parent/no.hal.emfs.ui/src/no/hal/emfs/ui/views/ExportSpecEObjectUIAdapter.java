package no.hal.emfs.ui.views;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.emf.ui.utils.Activator;
import no.hal.emf.ui.utils.AdapterFactoryColumnLabelProvider;
import no.hal.emf.ui.utils.DelegatingCellLabelProvider;
import no.hal.emf.ui.utils.FileExtensionLabelProvider;
import no.hal.emf.ui.utils.ValidatingEditingSupport;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.sync.provider.SyncItemProviderAdapterFactory;
import no.hal.emfs.ui.provider.EmfsItemProviderAdapterFactory;

public class ExportSpecEObjectUIAdapter extends EObjectUIAdapterImpl<ExportSpec, Composite> implements EObjectUIAdapter<ExportSpec, Composite> {

	public ExportSpecEObjectUIAdapter(ExportSpec eObject) {
		super(eObject);
	}

	@Override
	public void updateView() {
		if (emfsResourceViewer != null) {
			emfsResourceViewer.refresh();
		}
	}

	@Override
	public void updateModel() {
		eObject.getRules().clear();
	}

	private CheckboxTreeViewer emfsResourceViewer;

	@Override
	public Composite initView(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		composite.setLayout(layout);
		
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new EmfsItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new SyncItemProviderAdapterFactory());

		emfsResourceViewer = new CheckboxTreeViewer(composite);
		emfsResourceViewer.getTree().setHeaderVisible(true);
		TreeViewerColumn labelColumn = new TreeViewerColumn(emfsResourceViewer, SWT.LEFT);
		labelColumn.getColumn().setText("Resource");
		labelColumn.getColumn().setWidth(200);
		labelColumn.setLabelProvider(new DelegatingCellLabelProvider(new FileExtensionLabelProvider(new AdapterFactoryColumnLabelProvider(adapterFactory))));
		TreeViewerColumn targetColumn = new TreeViewerColumn(emfsResourceViewer, SWT.LEFT);
		targetColumn.getColumn().setText("Import into");
		targetColumn.getColumn().setWidth(400);
		targetColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object object) {
				String target = "";
				if (object instanceof EmfsResource && resourceTargets != null && resourceTargets.containsKey(object)) {
					target = resourceTargets.get((EmfsResource) object);
				}
				return target;
			}
		});
		targetColumn.setEditingSupport(new ValidatingEditingSupport(emfsResourceViewer) {
			
			@Override
			protected boolean canEdit(Object element) {
				return element instanceof EmfsContainer;
			}

			@Override
			public String isValid(Object value) {
				Object element = getEditingElement();
				if (! (element instanceof EmfsResource)) {
					return null;
				}
				if (isEmpty(value)) {
					return null;
				}
				try {
					Path path = new Path(String.valueOf(value));
					if (! path.isAbsolute()) {
						return "Path must be absolute, i.e. must begin with /";
					}
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					IResource resource = root.findMember(path);
					if (resource instanceof IContainer) {
						return null;
					}
				} catch (Exception e) {
					return e.getMessage();
				}
				return "Couldn't find folder named " + value;
			}

			protected boolean isEmpty(Object value) {
				return value == null || String.valueOf(value).length() == 0;
			}

			@Override
			protected Object getValue(Object element) {
				String target = (resourceTargets.containsKey(element) ? resourceTargets.get(element) : null);
				return target != null ? target : "";
			}

			@Override
			protected void setValue(Object element, Object value) {
				if (isEmpty(value)) {
					resourceTargets.remove((EmfsResource) element);
				} else {
					resourceTargets.put((EmfsResource) element, String.valueOf(value));
				}
				emfsResourceViewer.update(element, null);
			}
		});

		emfsResourceViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		emfsResourceViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		emfsResourceViewer.setAutoExpandLevel(AbstractTreeViewer.ALL_LEVELS);

		emfsResourceViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				Object element = event.getElement();
				if (element instanceof EmfsResource) {
					handleCheckStateChanged(emfsResourceViewer, (EmfsResource) element, event.getChecked());
				}
			}
		});		
		emfsResourceViewer.setInput(eObject);
		return composite;
	}

	Map<EmfsResource, String> resourceTargets = new HashMap<EmfsResource, String>();
	
	protected void handleCheckStateChanged(CheckboxTreeViewer checkboxTreeViewer, EmfsResource emfsResource, boolean state) {
		if (state) {
			EmfsContainer container = emfsResource.getContainer();
			while (container != null && container != checkboxTreeViewer.getInput()) {
				checkboxTreeViewer.setChecked(container, true);
				container = container.getContainer();
			}
		}
		checkboxTreeViewer.setSubtreeChecked(emfsResource, state);
//		if (computeTargetLazily) {
//			updateResourceTargets(getEmfsResources(emfsResourceViewer.getCheckedElements()));
//			emfsResourceViewer.refresh(true);
//		}
	}

//	private boolean containsContainer(EmfsContainer container, Collection<EmfsResource> emfsResources) {
//		while (container != null) {
//			if (emfsResources.contains(container)) {
//				return true;
//			}
//			container = container.getContainer();
//		}
//		return false;
//	}

//	protected Collection<EmfsResource> getEmfsResources(Object[] objects) {
//		Collection<EmfsResource> selected = new ArrayList<EmfsResource>();
//		Iterator<? extends Object> it = (objects != null && objects.length > 0 ? Arrays.asList(objects) : contentsResource.getContents()).iterator();
//		while (it.hasNext()) {
//			Object next = it.next();
//			if (next instanceof EmfsResource) {
//				selected.add((EmfsResource) next);
//			}
//		}
//		return selected;
//	}
	
//	protected void updateResourceTargets(Collection<EmfsResource> selected) {
//		Collection<EmfsResource> emfsResources = new ArrayList<EmfsResource>();
//		TreeIterator<EObject> allContents = contentsResource.getAllContents();
//		while (allContents.hasNext()) {
//			EObject next = allContents.next();
//			if (next instanceof EmfsResource) {
//				EmfsResource emfsResource = (EmfsResource) next;
//				if (selected.contains(next) && (! containsContainer(emfsResource.getContainer(), emfsResources))) {
//					emfsResources.add(emfsResource);
//				}
//			} else {
//				allContents.prune();
//			}
//		}
//		for (EmfsResource emfsResource : emfsResources) {
//			if (! resourceTargets.containsKey(emfsResource)) {
//				String targetPathString;
//				try {
//					targetPathString = computeResourceTarget(emfsResource);
//				} catch (Exception e) {
//					targetPathString = "<Please enter path manually. " + e.getMessage() + ">";
//				}
//				if (targetPathString != null) {
//					resourceTargets.put(emfsResource, targetPathString);
//				}
//			}
//		}
//	}

	protected void openErrorDialog(String title, int severity, String message) {
		ErrorDialog.openError(emfsResourceViewer.getControl().getShell(), title, null, new Status(severity, Activator.PLUGIN_ID, message));
	}

	protected void openErrorDialog(String title, Exception e) {
		openErrorDialog(title, IStatus.ERROR, e.getMessage());
	}
	
//	private boolean computeTargetLazily = false; 
	
//	public void updateEmfsResource(Collection<EmfsResource> emfsResources, boolean clear) {
//		if (clear) {
//			contentsResource.getContents().clear();
//		}
//		contentsResource.getContents().addAll(emfsResources);
//		resourceTargets.clear();
//		if (! computeTargetLazily) {
//			updateResourceTargets(getEmfsResources(null));
//		}
//		emfsResourceViewer.refresh();
//		emfsResourceViewer.expandAll();
//	}
}
