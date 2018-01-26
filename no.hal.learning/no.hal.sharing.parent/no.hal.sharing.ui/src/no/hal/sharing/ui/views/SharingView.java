package no.hal.sharing.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Adapter;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.internal.UIPlugin;
import org.eclipse.ui.part.ViewPart;

import no.hal.emf.ui.parts.adapters.EObjectEditorAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;
import no.hal.emf.ui.utils.FileExtensionLabelProvider;
import no.hal.emf.ui.utils.FilteringContentProvider;
import no.hal.emf.ui.utils.Util;
import no.hal.emfs.importer.Importer;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.RelativePath;
import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.sync.provider.SyncItemProviderAdapterFactory;
import no.hal.emfs.ui.provider.EmfsItemProviderAdapterFactory;
import no.hal.sharing.PublishingAdapter;
import no.hal.sharing.SharedEmfResource;
import no.hal.sharing.SharedEmfResourceSet;
import no.hal.sharing.SharedIResource;
import no.hal.sharing.SharedResource;
import no.hal.sharing.SharingManager;
import no.hal.sharing.ui.Activator;
import no.hal.sharing.ui.views.util.IdAction;
import no.hal.sharing.ui.views.util.SharedResourceLabelProvider;
import no.hal.sharing.ui.views.util.SharedResourceStyledLabelProvider;
import no.hal.sharing.ui.views.util.SharingManagerAsyncListener;
import no.hal.sharing.ui.views.util.SharingManagerContentProvider;

public abstract class SharingView extends ViewPart implements SharingManager.Listener {

	protected abstract SharingManager getSharingManager();

	protected IAction addAction(String label, String actionKey, final Runnable runnable) {
		IAction action = new IdAction(label, SharingView.class.getName() + "." + actionKey, Activator.getDefault().getImageRegistry().getDescriptor(actionKey)) {
			@Override
			public void run() {
				runnable.run();
			}
		};
		getViewSite().getActionBars().getToolBarManager().add(action);
		return action;
	}
	
	protected void createSharingActions() {
		ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
		imageRegistry.put(IMPORT_ACTION_KEY, ImageDescriptor.createFromFile(UIPlugin.class, "/icons/full/etool16/import_wiz.png"));
		imageRegistry.put(EXPORT_ACTION_KEY, ImageDescriptor.createFromFile(UIPlugin.class, "/icons/full/etool16/export_wiz.png"));
		imageRegistry.put(NEW_ACTION_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/newfile_wiz.png"));
		imageRegistry.put(PAUSE_ACTION_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/suspend_co.png"));
		imageRegistry.put(STOP_ACTION_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/terminate_co.gif"));
		imageRegistry.put(REMOVE_ACTION_KEY, ImageDescriptor.createFromFile(UIPlugin.class, "/icons/full/etool16/delete_edit.png"));

		if (publishing != null) {
			newAction = addAction("New", NEW_ACTION_KEY, new Runnable() {
				@Override
				public void run() {
					newSharedResource();
				}
			});
		}
		if (Boolean.TRUE.equals(publishing)) {
			exportAction = addAction("Export", EXPORT_ACTION_KEY, new Runnable() {
				@Override
				public void run() {
					SharedResource resource = getSelectedResource();
					if (resource != null) {
						startSharing(resource);
					}
				}
			});
		}
		if (Boolean.TRUE.equals(subscribing)) {
			importAction = addAction("Import", IMPORT_ACTION_KEY, new Runnable() {
				@Override
				public void run() {
					SharedResource resource = getSelectedResource();
					if (resource != null) {
						startReceiving(resource);
					}
				}
			});
		}
		pauseAction = addAction("Pause", PAUSE_ACTION_KEY, new Runnable() {
			@Override
			public void run() {
				SharedResource resource = getSelectedResource();
				if (resource != null) {
					getSharingManager().setEnabled(getSharedResourceKey(resource), false);
				}
			}
		});
		stopAction = addAction("Stop", STOP_ACTION_KEY, new Runnable() {
			@Override
			public void run() {
				SharedResource resource = getSelectedResource();
				if (resource != null) {
					getSharingManager().unshareResource(getSharedResourceKey(resource));
				}
			}
		});
		removeAction = addAction("Remove", REMOVE_ACTION_KEY, new Runnable() {
			@Override
			public void run() {
				SharedResource resource = getSelectedResource();
				if (resource != null) {
					getSharingManager().removeResource(getSharedResourceKey(resource));
				}
			}
		});
	}
	
	private CTabFolder tabFolder;

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);

		asyncListener.setDisplay(parent.getDisplay());
		createSharingActions();

		tabFolder = new CTabFolder(parent, SWT.BOTTOM);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("All");
		Composite sharingManagerComposite = new Composite(tabFolder, SWT.BORDER);
		tabItem.setControl(sharingManagerComposite);
		createSharingManagerControls(sharingManagerComposite);

		for (SharedResource sharedResource : getSharingManager()) {
			updateTabItem(sharedResource, null);
		}
		tabFolder.addCTabFolder2Listener(closeListener);
	}

	private TreeViewer sharingManagerViewer;
	
	private void createSharingManagerControls(Composite composite) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
	
		sharingManagerViewer = new TreeViewer(composite, SWT.NONE);
		
		sharingManagerViewer.setContentProvider(new SharingManagerContentProvider());
//		sharingManagerViewer.setLabelProvider(new SharedResourceLabelProvider(getSharingManager()));
		sharingManagerViewer.setLabelProvider(new SharedResourceStyledLabelProvider(getSharingManager()));
		sharingManagerViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		sharingManagerViewer.setInput(getSharingManager());

		sharingManagerViewer.getTree().setHeaderVisible(true);
		addSharingManagerViewerColumns();
		
		int dndOperations = DND.DROP_MOVE | DND.DROP_LINK | DND.DROP_COPY;
		Transfer[] transfers = new Transfer[] {
//				LocalTransfer.getInstance(),
				LocalSelectionTransfer.getTransfer(),
//				FileTransfer.getInstance()
		};
		if (publishing != null) {
			sharingManagerViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(sharingManagerViewer));
			sharingManagerViewer.addDropSupport(dndOperations, transfers, new ViewerDropAdapter(sharingManagerViewer) {
				@Override
				public void dragEnter(DropTargetEvent event) {
					super.dragEnter(event);
					event.detail = DND.DROP_COPY;
				}
				@Override
				public boolean validateDrop(Object target, int operation, TransferData transfer) {
					return true;
				}
				@Override
				public boolean performDrop(Object data) {
					Collection<IResource> resources = null;
					if (data instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection) data;
						resources = Util.getResources(selection.iterator());
					} else if (data instanceof IResource[]) {
						resources = Arrays.asList((IResource[]) data);
					}
					final Collection<SharedResource> sharedResources = new ArrayList<SharedResource>();
					for (IResource resource: resources) {
						SharedResource sharedResource = createSharedResource(resource);
						if (resource != null) {
							sharedResources.add(sharedResource);
							getSharingManager().putSharedResource(sharedResource);
						}
					}
					if (sharedResources != null && (! sharedResources.isEmpty())) {
						selectSharedResource(sharedResources.iterator().next(), true);
						return true;
					}
					return false;
				}
			});
		}
		sharingManagerViewer.getControl().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					removeAction.run();
				} else if (e.keyCode == '\n' || e.keyCode == '\r') {
					if (Boolean.TRUE.equals(publishing)) {
						exportAction.run();
					} else if (Boolean.TRUE.equals(subscribing)) {
						importAction.run();
					}
				}
			}
		});
	}

	@Override
	public void dispose() {
		super.dispose();
	}
	
	protected void selectSharedResource(final SharedResource sharedResource, boolean async) {
		if (async) {
			asyncExec(new Runnable() {
				@Override
				public void run() {
					selectSharedResource(sharedResource, false);
				}
			});
		} else {
			sharingManagerViewer.setSelection(new StructuredSelection(sharedResource), true);			
		}
	}
	
	protected void addSharingManagerViewerColumns() {
		addSharingManagerViewerColumn("Name", createSharedResourceLabelProvider(SharedResourceLabelProvider.KEY_COLUMN), 100);
		if (Boolean.TRUE.equals(subscribing)) {
			addSharingManagerViewerColumn("From", createSharedResourceLabelProvider(SharedResourceLabelProvider.FROM_COLUMN), 50);
		}
		if (Boolean.TRUE.equals(publishing)) {
			addSharingManagerViewerColumn("To", createSharedResourceLabelProvider(SharedResourceLabelProvider.TO_COLUMN), 70);
		}
		addSharingManagerViewerColumn("Path", createSharedResourceLabelProvider(SharedResourceLabelProvider.PATH_COLUMN), 200);
		addSharingManagerViewerColumn("#", createSharedResourceLabelProvider(SharedResourceLabelProvider.DERIVED_COUNT_COLUMN), 10);
	}

	protected void addSharingManagerViewerColumn(String name, CellLabelProvider labelProvider, int width) {
		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(sharingManagerViewer, SWT.NONE);
		treeViewerColumn.setLabelProvider(labelProvider);
		TreeColumn treeColumn = treeViewerColumn.getColumn();
		treeColumn.setText(name);
		treeColumn.setWidth(width);
	}

	protected CellLabelProvider createSharedResourceLabelProvider(int column) {
		return new SharedResourceStyledLabelProvider(getSharingManager(), column);
	}

	protected SharedResource createSharedResource(IResource resource) {
		IPath path = resource.getFullPath();
		SharedResource sharedResource = null;
		if (resource instanceof IFile) {
			try {
				URI uri = URI.createPlatformResourceURI(path.toPortableString(), true);
				Resource emfResource = new ResourceSetImpl().getResource(uri, true);
				if (emfResource.getContents().size() > 0) {
					sharedResource = new SharedEmfResource(path.lastSegment(), getOwnerForNewResource(), null, emfResource);
				}
			} catch (Exception e) {
				sharedResource = new SharedIResource(path.lastSegment(), getOwnerForNewResource(), null, path);
			}
		} else if (resource instanceof IFolder) {
			ImportSpec importSpec = SyncFactory.eINSTANCE.createImportSpec();
			Importer importer = new Importer(importSpec);
			ImportRule folderRule = SyncFactory.eINSTANCE.createImportRule();
			RelativePath folderPath = SyncFactory.eINSTANCE.createRelativePath();
			folderPath.getSegments().addAll(Arrays.asList(resource.getFullPath().segments()));
			folderRule.setPath(folderPath);
			importer.getRules().add(folderRule);
			importer.importResources(resource);
			ResourceSetImpl resourceSet = new ResourceSetImpl();
			IPath emfsPath = path.addFileExtension("emfs");
			Resource emfsResource = resourceSet.createResource(URI.createURI(emfsPath.toString()));
			importSpec.getResourceRefs().addAll(importSpec.getResources());
			emfsResource.getContents().addAll(importSpec.getResourceRefs());
			emfsResource.getContents().add(importSpec);
 			sharedResource = new SharedEmfResourceSet(path.lastSegment(), getOwnerForNewResource(), null, emfsPath, resourceSet);
		}
		return sharedResource;
	}

	protected void asyncExec(Runnable runnable) {
		tabFolder.getDisplay().asyncExec(runnable);
	}
	
	private CTabFolder2Listener closeListener = new CTabFolder2Adapter() {
		@Override
		public void close(org.eclipse.swt.custom.CTabFolderEvent event) {
			String key = getShareKey((CTabItem) event.item);
			getSharingManager().removeResource(key);
		}
	};

	protected String getShareKey(CTabItem widget) {
		return widget.getToolTipText();
	}

	protected SharedResource getSharedResource(CTabItem widget) {
		String key = getShareKey(widget);
		EditingDomain editingDomain = newSharedResources.get(key);
		if (editingDomain != null) {
			EList<Resource> resources = editingDomain.getResourceSet().getResources();
			if (resources.size() > 0) {
				for (SharedResource resource : getSharingManager()) {
					if (resource instanceof SharedEmfResource && resources.contains(((SharedEmfResource) resource).getResource())) {
						return resource;
					}
				}
			}
		}
		return getSharingManager().getSharedResource(key);
	}

	protected CTabItem updateTabItem(SharedResource resource, EditingDomain editingDomain) {
		Control control = null;
		if (resource instanceof SharedEmfResourceSet) {
			ResourceSet emfResourceSet = ((SharedEmfResourceSet) resource).getResource();
			outer: for (Resource emfResource : emfResourceSet.getResources()) {
				for (EObject eObject : emfResource.getContents()) {
					control = createSharedObjectControl(eObject, editingDomain, tabFolder);
					if (control != null) {
						break outer;
					}
				}
			}
			if (control == null) {
				control = createDefaultEditor(null, createEditingDomain(emfResourceSet), tabFolder);
			}
		}
		if (control == null) {
			return null;
		}
		CTabItem tabItem = getTabItem(resource);
		if (tabItem != null) {
			tabItem.getControl().dispose();
		} else {
			tabItem = new CTabItem(tabFolder, SWT.CLOSE);
		}
		tabItem.setText(resource.key);
		tabItem.setToolTipText(getSharedResourceKey(resource));
		tabItem.setControl(control);
		return tabItem;
	}

	protected Control createSharedObjectControl(ResourceSet emfResourceSet, EditingDomain editingDomain) {
		for (Resource emfResource : emfResourceSet.getResources()) {
			Control control = createSharedObjectControl(emfResource, editingDomain);
			if (control != null) {
				return control;
			}
		}
		return createDefaultEditor(null, createEditingDomain(emfResourceSet), tabFolder);
	}
	
	protected Control createSharedObjectControl(Resource emfResource, EditingDomain editingDomain) {
		for (EObject eObject : emfResource.getContents()) {
			Control control = createSharedObjectControl(eObject, editingDomain, tabFolder);
			if (control != null) {
				return control;
			}
		}
		return null;
	}
	
	protected final EObjectViewerAdapterHelper adapterHelper = new EObjectViewerAdapterHelper();

	protected Control createSharedObjectControl(EObject sharedObject, EditingDomain editingDomain, Composite parent) {
		Class<? extends EObjectViewerAdapter> adapterClass = EObjectViewerAdapter.class;
		if (subscribing != null) {
			adapterClass = EObjectUIAdapter.class;  
		} else if (publishing != null) {
			adapterClass = EObjectEditorAdapter.class;  
		}
		Control control = (sharedObject != null ? adapterHelper.initView(sharedObject, adapterClass, parent) : null);
		if (control == null && adapterClass == EObjectEditorAdapter.class) {
			control = createDefaultEditor(sharedObject, editingDomain, parent);
		}
		return control;
	}

	protected Control createDefaultEditor(final EObject sharedObject, final EditingDomain editingDomain, Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
	
		TreeViewer treeViewer = new TreeViewer(composite, SWT.BORDER);		
		treeViewer.setContentProvider(createContentProvider());
		treeViewer.setLabelProvider(createLabelProvider());

		int dndOperations = DND.DROP_COPY;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
		treeViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(treeViewer));
		if (editingDomain != null) {
			treeViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, treeViewer));
		}
		ResourceSet resourceSet = null;
		if (sharedObject != null) {
			resourceSet = sharedObject.eResource().getResourceSet();
		} else if (editingDomain != null) {
			resourceSet = editingDomain.getResourceSet();
		}
		treeViewer.setInput(resourceSet);
		treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return composite;
	}

	protected IContentProvider createContentProvider() {
		return new FilteringContentProvider(new AdapterFactoryContentProvider(getAdapterFactory())) {
			@Override
			public boolean accept(Object element) {
				return true;
			}
		};
	}

	protected ILabelProvider createLabelProvider() {
		return new FileExtensionLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
	}

	protected static String NEW_ACTION_KEY = "new";
	protected IAction newAction;
	protected IAction importAction, exportAction;
	protected static String IMPORT_ACTION_KEY = "import", EXPORT_ACTION_KEY = "export";
	protected IAction pauseAction, stopAction, removeAction; 
	protected static String PAUSE_ACTION_KEY = "pause", STOP_ACTION_KEY = "stop", REMOVE_ACTION_KEY = "remove";

	protected void newSharedResource() {
		InputDialog nameDialog = new InputDialog(tabFolder.getShell(),
				"Create new share", "Enter share name", null, new IInputValidator() {
			@Override
			public String isValid(String s) {
				return SharedResource.isValidSharedResourceKey(s);
			}
		});
		if (nameDialog.open() == Window.OK) {
			String name = nameDialog.getValue();
			newSharedResource(name);
		}
	}

	private Map<String, EditingDomain> newSharedResources = new HashMap<String, EditingDomain>();

	protected EditingDomain getEditingDomain(SharedResource resource) {
		return newSharedResources.get(getSharedResourceKey(resource));
	}
	
	private ComposedAdapterFactory adapterFactory;

	protected EditingDomain createEditingDomain(ResourceSet resourceSet) {
		return new AdapterFactoryEditingDomain(getAdapterFactory(), new BasicCommandStack(), resourceSet) {
			@Override
			public Command createCommand(Class<? extends Command> commandClass, CommandParameter commandParameter) {
				Command command = SharingView.this.createCommand(commandClass, commandParameter);
				return (command != null ? command : super.createCommand(commandClass, commandParameter));
			}
		};
	}

	protected AdapterFactory getAdapterFactory() {
		if (adapterFactory == null) {
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
			adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new EmfsItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new SyncItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		}
		return adapterFactory;
	}

	protected Command createCommand(Class<? extends Command> commandClass, CommandParameter commandParameter) {
		if (commandClass == DragAndDropCommand.class) {
			return createDragAndDropCommand(commandParameter.getOwner(), commandParameter.getCollection());
		}
		return null;
	}

	protected Command createDragAndDropCommand(Object owner, Collection<?> collection) {
		if (owner instanceof ResourceSet) {
			Collection<IResource> resources = Util.getResources(collection);
			if (resources.size() > 0) {
				ResourceSet resourceSet = (ResourceSet) owner;
				Command command = new AddEmfResourcesCommand(resourceSet, resources);
				if (! command.canExecute()) {
					CreateImportSpecForResourcesCommand createImportSpecCommand = new CreateImportSpecForResourcesCommand(resourceSet, resources);
					ImportSpec importSpec = null;
					if (! resourceSet.getResources().isEmpty()) {
						EList<EObject> contents = resourceSet.getResources().get(0).getContents();
						importSpec = (ImportSpec) EcoreUtil.getObjectByType(contents, SyncPackage.eINSTANCE.getImportSpec());
					}
					if (importSpec == null) {
						importSpec = SyncFactory.eINSTANCE.createImportSpec();
					}
					createImportSpecCommand.setImportSpec(importSpec);
					command = createImportSpecCommand;
				}
				return command;
			}
		}
		return null;
	}

	protected String getOwnerForNewResource() {
		return getSharingManager().getOwner();
	}

	protected void newSharedResource(String name) {
		SharedEmfResourceSet resource = new SharedEmfResourceSet(name, getOwnerForNewResource(), null, null);
		resource.setResource(new ResourceSetImpl());
		getSharingManager().putSharedResource(resource);
	}

	protected Boolean publishing = null, subscribing = null;
	
	public void setPublishing(Boolean publishing) {
		Boolean oldPublishing = this.publishing;
		this.publishing = publishing;
		ensureListener(oldPublishing, publishing);
	}

	private SharingManagerAsyncListener asyncListener = new SharingManagerAsyncListener(this);
	
	private void ensureListener(Boolean oldValue, Boolean newValue) {
		if (oldValue != null && newValue == null && asyncListener != null) {
			getSharingManager().removeListener(asyncListener);
		}
		if (oldValue == null && newValue != null && asyncListener != null) {
			getSharingManager().addListener(asyncListener);
		}
	}
	
	public void setSubscribing(Boolean subscribing) {
		Boolean oldSubscribing = this.subscribing;
		this.subscribing = subscribing;
		ensureListener(oldSubscribing, subscribing);
	}

	protected SharedResource getSelectedResource() {
		CTabItem tab = tabFolder.getSelection();
		if (tab == tabFolder.getItem(0)) {
			Object selection = sharingManagerViewer.getStructuredSelection().getFirstElement();
			if (selection == null) {
				Object[] elements = ((IStructuredContentProvider) sharingManagerViewer.getContentProvider()).getElements(sharingManagerViewer.getInput());
				if (elements.length == 1) {
					selection = elements[0];
				}
			}
			return (selection instanceof SharedResource ? (SharedResource) selection : null);
		} else {
			return getSharedResource(tab);
		}
	}
	
	@Override
	public void setFocus() {
		tabFolder.setFocus();
	}

	// SharingListener

	protected CTabItem getTabItem(String shareKey) {
		for (CTabItem tabItem : tabFolder.getItems()) {
			String key = tabItem.getToolTipText();
			if (key != null && key.equals(shareKey)) {
				return tabItem;
			}
		}
		return null;
	}
	
	protected CTabItem getTabItem(SharedResource resource) {
		return getTabItem(getSharedResourceKey(resource));
	}

	protected String getSharedResourceKey(SharedResource resource) {
		return getSharingManager().getSharedResourceKey(resource);
	}

	// from SharingManager.Listener
	
	@Override
	public void shareChanged(SharingManager sharingManager, String key, int what) {
		SharedResource resource = sharingManager.getSharedResource(key);
		if (what == SharingManager.Listener.ADDED) {
			shareAdded(resource);
		} else if (what == SharingManager.Listener.REMOVED) {
			shareRemoved(key);
		}
		if (sharingManagerViewer != null) {
			sharingManagerViewer.refresh();
		}
	}

	protected void shareAdded(SharedResource resource) {
		if (getTabItem(resource) == null) {
			EditingDomain editingDomain = null;
			// can only edit your own model
			if (getOwnerForNewResource().equals(resource.from) && resource instanceof SharedEmfResourceSet) {
				editingDomain = createEditingDomain(((SharedEmfResourceSet) resource).getResource());
			}
			if (editingDomain != null) {
				newSharedResources.put(getSharedResourceKey(resource), editingDomain);
			}
			CTabItem tabItem = updateTabItem(resource, editingDomain);
			if (tabItem != null) {
				tabFolder.setSelection(tabItem);
			}
			selectSharedResource(resource, true);
		}
	}

	protected void shareRemoved(String key) {
		if (! Boolean.TRUE.equals(getSharingManager().isSharing(key))) {
			newSharedResources.remove(key);
			CTabItem tabItem = getTabItem(key);
			if (tabItem != null && (! tabItem.isDisposed())) {
				tabItem.dispose();
			}
		}
	}

	protected void removeTabItem(SharedResource mainSharedResource) {
	}

	//
	
	protected void updateView(final StructuredViewer viewer, final Object element, boolean async) {
		if (async) {
			asyncExec(new Runnable() {
				@Override
				public void run() {
					updateView(viewer, element, false);
				}
			});
		} else {
			viewer.refresh(true);
		}
	}

	protected void startSharing(SharedResource resource) {
		SharedResource sharedResource = getSharedResource(resource);
		if (sharedResource != null && sharedResource != resource) {
			getSharingManager().putSharedResource(sharedResource);
		}
		getSharingManager().share(getSharedResourceKey(resource));
		updateTabItem(resource, null);
	}

	protected SharedResource getSharedResource(SharedResource resource) {
		if (resource instanceof SharedEmfResourceSet) {
			ResourceSet emfResourceSet = ((SharedEmfResourceSet) resource).getResource();
			for (Resource emfResource : emfResourceSet.getResources()) {
				Resource sharedEmfResource = getSharedEmfResource(emfResource);
				if (sharedEmfResource != null) {
					int pos = emfResourceSet.getResources().indexOf(sharedEmfResource);
					if (pos < 0) {
						return new SharedEmfResource(resource.key, resource.from, resource.to, sharedEmfResource);
					} else {
						return resource;
					}
				}
			}
		} else if (resource instanceof SharedEmfResource) {
			SharedEmfResource emfResource = (SharedEmfResource) resource;
			Resource sharedEmfResource = getSharedEmfResource(emfResource.getResource());
			if (sharedEmfResource != null && sharedEmfResource != emfResource.getResource()) {
				return new SharedEmfResource(resource.key, resource.from, resource.to, sharedEmfResource);				
			}
		}
		return null;
	}
	
	protected Resource getSharedEmfResource(Resource emfResource) {
		for (EObject eObject : emfResource.getContents()) {
			PublishingAdapter adapter = (PublishingAdapter) getAdapterFactory().adapt(eObject, PublishingAdapter.class);
			if (adapter != null) {
				Resource sharedEmfResource = adapter.getSharedResource(eObject);
				if (sharedEmfResource != null) {
					return sharedEmfResource;
				}
			}
		}
		return null;
	}

	protected Resource getSharedResource(ResourceSet emfResourceSet) {
		for (Resource emfResource : emfResourceSet.getResources()) {
			Resource sharedEmfResource = getSharedEmfResource(emfResource);
			if (sharedEmfResource != null) {
				return sharedEmfResource;
			}
		}
		return null;
	}

	protected void startReceiving(SharedResource resource) {
		String key = getSharedResourceKey(resource);
		if (! getSharingManager().acceptSharedResource(key)) {
			IPath path = resource.getPath();
			if (path == null || path.segmentCount() <= 1) {
//				ContainerSelectionDialog selectionDialog = new ContainerSelectionDialog(tabFolder.getShell(), null, false, "Select the container to import into");
//				if (selectionDialog.open() == Window.OK) {
//					Object[] result = selectionDialog.getResult();
//					if (result != null && result.length >= 1 && result[0] instanceof IContainer) {
//						path = ((IContainer) result[0]).getFullPath();
//					}
//				}
			}
		}
		updateTabItem(resource, null);
	}
}
