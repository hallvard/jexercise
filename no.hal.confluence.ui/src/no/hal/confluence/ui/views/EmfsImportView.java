package no.hal.confluence.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.UIPlugin;

import no.hal.confluence.ui.Activator;
import no.hal.confluence.ui.actions.util.ResourceUtil;
import no.hal.confluence.ui.preferences.ImportPathsPreferencePage;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.exporter.ExportHelper;
import no.hal.emfs.ui.provider.EmfsItemProviderAdapterFactory;
import no.hal.emfs.util.EmfsResourceFactoryImpl;

public class EmfsImportView {

	private Resource contentsResource;

	private CheckboxTreeViewer emfsResourceViewer;
	private final static ViewerFilter[] emfsResourceViewerFilters = {
		new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return element instanceof EmfsResource;
			}
		}
	};
	
	public void createControls(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EmfsItemProviderAdapterFactory());

		emfsResourceViewer = new CheckboxTreeViewer(composite);
		emfsResourceViewer.getTree().setHeaderVisible(true);
		TreeViewerColumn labelColumn = new TreeViewerColumn(emfsResourceViewer, SWT.LEFT);
		labelColumn.getColumn().setText("Resource");
		labelColumn.getColumn().setWidth(400);
		labelColumn.setLabelProvider(new AdapterFactoryColumnLabelProvider(adapterFactory));
		TreeViewerColumn targetColumn = new TreeViewerColumn(emfsResourceViewer, SWT.LEFT);
		targetColumn.getColumn().setText("Import into");
		targetColumn.getColumn().setWidth(400);
		targetColumn.setLabelProvider(new EmfsResourceTargetLabelProvider());
		targetColumn.setEditingSupport(new ValidatingEditingSupport(emfsResourceViewer) {
			
			@Override
			protected boolean canEdit(Object element) {
				return resourceTargets.containsKey(element);
			}

			@Override
			public String isValid(Object value) {
				Object element = getEditingElement();
				if (! (element instanceof EmfsResource)) {
					return null;
				}
				try {
					Path path = new Path(String.valueOf(value));
					if (! path.isAbsolute()) {
						return "Path must be absolute, i.e. must begin with /";
					}
					if (ResourceUtil.getContainer(path, 0, false) != null) {
						return null;
					}
				} catch (Exception e) {
					return e.getMessage();
				}
				return "Couldn't find folder named " + value;
			}

			@Override
			protected Object getValue(Object element) {
				return resourceTargets.get(element);
			}

			@Override
			protected void setValue(Object element, Object value) {
				resourceTargets.put((EmfsResource) element, String.valueOf(value));
				emfsResourceViewer.update(element, null);
			}
		});

		emfsResourceViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		emfsResourceViewer.setFilters(emfsResourceViewerFilters);
		emfsResourceViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		contentsResource = new EmfsResourceFactoryImpl().createResource(URI.createURI(".emfs"));
		emfsResourceViewer.setInput(contentsResource);
		emfsResourceViewer.setAutoExpandLevel(AbstractTreeViewer.ALL_LEVELS);

		importAction.setEnabled(false);
		emfsResourceViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				Object element = event.getElement();
				if (element instanceof EmfsResource) {
					handleCheckStateChanged(emfsResourceViewer, (EmfsResource) element, event.getChecked());
				}
				importAction.setEnabled(emfsResourceViewer.getCheckedElements().length > 0);
			}
		});
	}

	private Action importAction = new Action("Import", ImageDescriptor.createFromFile(UIPlugin.class, "/icons/full/etool16/import_wiz.png")) {
		@Override
		public void run() {
			importResources();
		}
	};

	private Action clearAction = null;
//	new Action("Clear") {
//		@Override
//		public void run() {
//			emfsResourceViewer.setCheckedElements(new Object[0]);
//			contentsResource.getContents().clear();
//		}
//	};

	public Action getImportAction() {
		return importAction;
	}

	public void setJavaProject(String name) {
		// TODO
	}
	
	public Action getClearAction() {
		return clearAction;
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
		if (computeTargetLazily) {
			updateResourceTargets(getEmfsResources(emfsResourceViewer.getCheckedElements()));
			emfsResourceViewer.refresh(true);
		}
	}

	private boolean containsContainer(EmfsContainer container, Collection<EmfsResource> emfsResources) {
		while (container != null) {
			if (emfsResources.contains(container)) {
				return true;
			}
			container = container.getContainer();
		}
		return false;
	}

	protected Collection<EmfsResource> getEmfsResources(Object[] objects) {
		Collection<EmfsResource> selected = new ArrayList<EmfsResource>();
		Iterator<? extends Object> it = (objects != null && objects.length > 0 ? Arrays.asList(objects) : contentsResource.getContents()).iterator();
		while (it.hasNext()) {
			Object next = it.next();
			if (next instanceof EmfsResource) {
				selected.add((EmfsResource) next);
			}
		}
		return selected;
	}
	
	protected void updateResourceTargets(Collection<EmfsResource> selected) {
		Collection<EmfsResource> emfsResources = new ArrayList<EmfsResource>();
		TreeIterator<EObject> allContents = contentsResource.getAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof EmfsResource) {
				EmfsResource emfsResource = (EmfsResource) next;
				if (selected.contains(next) && (! containsContainer(emfsResource.getContainer(), emfsResources))) {
					emfsResources.add(emfsResource);
				}
			} else {
				allContents.prune();
			}
		}
		for (EmfsResource emfsResource : emfsResources) {
			if (! resourceTargets.containsKey(emfsResource)) {
				String targetPathString;
				try {
					targetPathString = computeResourceTarget(emfsResource);
				} catch (Exception e) {
					targetPathString = "<Please enter path manually. " + e.getMessage() + ">";
				}
				if (targetPathString != null) {
					resourceTargets.put(emfsResource, targetPathString);
				}
			}
		}
	}

	protected String computeResourceTarget(EmfsResource emfsResource) {
		EList<String> tags = emfsResource.getTags();
		String[] keys = tags.toArray(new String[tags.size()]);
		for (int i = 0; i < keys.length; i++) {
			if (! keys[i].startsWith("#")) {
				keys[i] = "#" + keys[i];
			}
		}
		String keysString = "";
		for (int i = 0; i < keys.length; i++) {
			if (i > 0) {
				keysString += " ";
			}
			keysString += keys[i];
		}
		String[] tagKeys = ImportPathsPreferencePage.getTagKeys(keys);
		if (tagKeys == null) {
			tagKeys = ImportPathsPreferencePage.getFileNameKeys(emfsResource.getName());
		}
		if (tagKeys != null) {
			return ResourceUtil.getFolderPathString(ImportPathsPreferencePage.keyPathPreference(tagKeys), IFolder.class, null);
		}
		return null;
	}
	
	protected void computeImports(Collection<EmfsResource> selected, Collection<EmfsResource> emfsResources, Collection<EmfsResource> exclude) {
		TreeIterator<EObject> allContents = contentsResource.getAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof EmfsResource) {
				EmfsResource emfsResource = (EmfsResource) next;
				boolean containsContainer = containsContainer(emfsResource.getContainer(), emfsResources);
				if (selected.contains(next) && (! containsContainer)) {
					emfsResources.add(emfsResource);
				} else if (! selected.contains(next) && containsContainer) {
					exclude.add(emfsResource);
				}
			} else {
				allContents.prune();
			}
		}
	}

	public void importResources() {
		Collection<EmfsResource> selected = getEmfsResources(emfsResourceViewer.getCheckedElements());
		if (computeTargetLazily) {
			resourceTargets.clear();
			updateResourceTargets(selected);
		}
		importResources(selected);
	}

	protected void importResources(Collection<EmfsResource> selected) {
		final Collection<EmfsResource> emfsResources = new ArrayList<EmfsResource>(), exclude = new ArrayList<EmfsResource>();
		computeImports(selected, emfsResources, exclude);
		final ExportHelper importHelper = new ExportHelper();
		importHelper.exclude = exclude;
		final int count = ExportHelper.countEmfsResources(emfsResources);
		Job job = new Job("Import EMFS resources") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Importing " + count + " EMFS resources", count);
				try {
					for (EmfsResource emfsResource : emfsResources) {
						String targetPathString = resourceTargets.get(emfsResource);
						IContainer target = ResourceUtil.getContainer(new Path(targetPathString), 0, false);
						importHelper.importResources(emfsResource, target, true, null);
					}
				} catch (Exception e) {
					if (monitor != null) {
						monitor.done();
					}
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	protected void openErrorDialog(String title, int severity, String message) {
		ErrorDialog.openError(emfsResourceViewer.getControl().getShell(), title, null, new Status(severity, Activator.PLUGIN_ID, message));
	}

	protected void openErrorDialog(String title, Exception e) {
		openErrorDialog(title, IStatus.ERROR, e.getMessage());
	}
	
	private boolean computeTargetLazily = false; 
	
	public void updateEmfsResource(Collection<EmfsResource> emfsResources, boolean clear) {
		if (clear) {
			contentsResource.getContents().clear();
		}
		contentsResource.getContents().addAll(emfsResources);
		resourceTargets.clear();
		if (! computeTargetLazily) {
			updateResourceTargets(getEmfsResources(null));
		}
		emfsResourceViewer.refresh();
		emfsResourceViewer.expandAll();
	}
	
	//

	private static class AdapterFactoryColumnLabelProvider extends ColumnLabelProvider {

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

	private class EmfsResourceTargetLabelProvider extends ColumnLabelProvider {

		@Override
		public String getText(Object object) {
			if (object instanceof EmfsResource && resourceTargets != null) {
				String target = resourceTargets.get((EmfsResource) object);
				if (target != null) {
					return target;
				}
			}
			return "";
		}
	}
}
