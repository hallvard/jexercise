package no.hal.learning.sharing.ui.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Adapter;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import no.hal.emf.ui.parts.adapters.EObjectEditorAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;
import no.hal.emf.ui.utils.FileExtensionLabelProvider;
import no.hal.emf.ui.utils.FilteringContentProvider;
import no.hal.emf.ui.utils.Util;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.sync.provider.SyncItemProviderAdapterFactory;
import no.hal.emfs.ui.provider.EmfsItemProviderAdapterFactory;
import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.SharingFactory;
import no.hal.learning.sharing.runtime.PublishingAdapter;
import no.hal.learning.sharing.runtime.SharingManager;
import no.hal.learning.sharing.ui.Activator;
import no.hal.learning.sharing.ui.views.util.IdAction;
import no.hal.learning.sharing.ui.views.util.SharingManagerAsyncListener;

public abstract class SharingView extends ViewPart implements SharingManager.Listener {

	protected abstract SharingManager getSharingManager();

	protected void createSharingControls(Composite parent) {
		ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
		if (imageRegistry.get(NEW_IMAGE_KEY) == null) {
			imageRegistry.put(NEW_IMAGE_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/newfile_wiz.png"));
		}
		if (imageRegistry.get(PLAY_IMAGE_KEY) == null) {
			imageRegistry.put(PLAY_IMAGE_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/resume_co.png"));
		}
		if (imageRegistry.get(PAUSE_IMAGE_KEY) == null) {
			imageRegistry.put(PAUSE_IMAGE_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/suspend_co.png"));
		}
		if (imageRegistry.get(STOP_IMAGE_KEY) == null) {
			imageRegistry.put(STOP_IMAGE_KEY, ImageDescriptor.createFromFile(getClass(), "/icons/terminate_co.gif"));
		}
		IActionBars actionBars = getViewSite().getActionBars();
		if (publishing != null) {
			newAction = new IdAction("New", SharingView.class.getName() + ".new", imageRegistry.getDescriptor(NEW_IMAGE_KEY)) {
				@Override
				public void run() {
					newShareModel();
				}
			};
			actionBars.getToolBarManager().add(newAction);
		}
		playAction = new IdAction("Play", SharingView.class.getName() + ".play", imageRegistry.getDescriptor(PLAY_IMAGE_KEY)) {
			@Override
			public void run() {
				startSharing();
			}
		};
		actionBars.getToolBarManager().add(playAction);
		pauseAction = new IdAction("Pause", SharingView.class.getName() + ".pause", imageRegistry.getDescriptor(PAUSE_IMAGE_KEY)) {
			@Override
			public void run() {
				suspendSharing();
			}
		};
		actionBars.getToolBarManager().add(pauseAction);
		stopAction = new IdAction("Stop", SharingView.class.getName() + ".stop", imageRegistry.getDescriptor(STOP_IMAGE_KEY)) {
			@Override
			public void run() {
				stopSharing();
			}
		};
		actionBars.getToolBarManager().add(stopAction);
//		Composite composite = new Composite(parent, SWT.NONE);
//		composite.setLayout(new FillLayout());
//		Button playButton = new Button(composite, SWT.TOGGLE);
//		Button pauseButton = new Button(composite, SWT.TOGGLE);
//		pauseButton.setSelection(true);
//		new ToggleButtonGroup(playButton, pauseButton);
//		new ActionButtonController(playButton, playAction);
//		new ActionButtonController(pauseButton, pauseAction);
	}

	private CTabFolder tabFolder;

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);

		createSharingControls(parent);

		tabFolder = new CTabFolder(parent, SWT.BOTTOM);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		for (ShareModel shareModel : getSharingManager()) {
			updateTabItem(shareModel, null);
		}
		tabFolder.addCTabFolder2Listener(closeListener);
		
		asyncListener.setDisplay(parent.getDisplay());
	}

	protected void asyncExec(Runnable runnable) {
		tabFolder.getDisplay().asyncExec(runnable);
	}
	
	private CTabFolder2Listener closeListener = new CTabFolder2Adapter() {
		@Override
		public void close(org.eclipse.swt.custom.CTabFolderEvent event) {
			removeTabItem((CTabItem) event.item);
		}
	};

	protected String getShareKey(CTabItem widget) {
		return widget.getToolTipText();
	}

	protected ShareModel getShareModel(CTabItem widget) {
		String key = getShareKey(widget);
		ShareModel shareModel = null;
		EditingDomain editingDomain = newShareModels.get(key);
		if (editingDomain != null) {
			EList<Resource> resources = editingDomain.getResourceSet().getResources();
			if (resources.size() > 0) {
				shareModel = SharingManager.getShareModel(resources.get(0));
			}
		}
		if (shareModel == null) {
			shareModel = findShareModel(key);
		}
		return shareModel;
	}

	private void removeTabItem(CTabItem widget) {
		String key = getShareKey(widget);
		ShareModel shareModel = findShareModel(key);
		if (shareModel != null) {
			newShareModels.remove(key);
		}
	}

	protected CTabItem updateTabItem(ShareModel shareModel, EditingDomain editingDomain) {
		CTabItem tabItem = getTabItem(shareModel);
		if (tabItem != null) {
			tabItem.getControl().dispose();
		} else {
			tabItem = new CTabItem(tabFolder, SWT.CLOSE);
		}
		EObject sharedObject = (shareModel.getEObjects().size() > 0 ? shareModel.getEObjects().get(0) : shareModel);
		Control control = createSharedObjectControl(sharedObject, editingDomain, tabFolder);
		if (control == null) {
			return null;
		}
		tabItem.setText(shareModel.getName());
		tabItem.setToolTipText(SharingManager.getKey(shareModel));
		tabItem.setControl(control);
		return tabItem;
	}

	protected final EObjectViewerAdapterHelper adapterHelper = new EObjectViewerAdapterHelper();

	protected Control createSharedObjectControl(EObject sharedObject, EditingDomain editingDomain, Composite parent) {
		Class<? extends EObjectViewerAdapter> adapterClass = EObjectViewerAdapter.class;
		if (subscribing != null) {
			adapterClass = EObjectUIAdapter.class;  
		} else if (publishing != null) {
			adapterClass = EObjectEditorAdapter.class;  
		}
		Control control = adapterHelper.initView(sharedObject, adapterClass, parent);
		if (control == null) {
			control = createDefaultEditor(sharedObject, editingDomain, parent);
		}
		return control;
	}
	
	protected TreeViewer treeViewer;

	protected Control createDefaultEditor(final EObject sharedObject, final EditingDomain editingDomain, Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
	
		treeViewer = new TreeViewer(composite, SWT.NONE);
//		treeViewer.getTree().setHeaderVisible(true);
		
		treeViewer.setContentProvider(createContentProvider());
		treeViewer.setLabelProvider(createLabelProvider());

		int dndOperations = DND.DROP_COPY;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
		treeViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(treeViewer));
		if (editingDomain != null) {
			treeViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, treeViewer));
		}
		final ResourceSet resourceSet = sharedObject.eResource().getResourceSet();
		treeViewer.setInput(resourceSet);
		treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return composite;
	}

	protected IContentProvider createContentProvider() {
		return new FilteringContentProvider(new AdapterFactoryContentProvider(getAdapterFactory())) {
			@Override
			public boolean accept(Object element) {
				return ! (element instanceof Resource && SharingManager.isSharingResource((Resource) element));
			}
		};
	}

	protected ILabelProvider createLabelProvider() {
		return new FileExtensionLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
	}

	protected Action newAction;
	protected String NEW_IMAGE_KEY = "new";
	protected Action playAction, pauseAction, stopAction; 
	protected String PLAY_IMAGE_KEY = "play", PAUSE_IMAGE_KEY = "pause", STOP_IMAGE_KEY = "stop";

	protected void newShareModel() {
		InputDialog nameDialog = new InputDialog(tabFolder.getShell(),
				"Create new share", "Enter share name", null, new IInputValidator() {
			@Override
			public String isValid(String s) {
				return SharingManager.isValidShareName(s);
			}
		});
		if (nameDialog.open() == Window.OK) {
			String name = nameDialog.getValue();
			newShareModel(name);
		}
	}

	private Map<String, EditingDomain> newShareModels = new HashMap<String, EditingDomain>();

	protected EditingDomain getEditingDomain(ShareModel share) {
		return newShareModels.get(SharingManager.getKey(share));
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
					EList<EObject> contents = resourceSet.getResources().get(0).getContents();
					ImportSpec importSpec = (ImportSpec) EcoreUtil.getObjectByType(contents, SyncPackage.eINSTANCE.getImportSpec());
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

	protected void newShareModel(String name) {
		ShareModel shareModel = SharingFactory.eINSTANCE.createShareModel();
		shareModel.setName(name);
		getSharingManager().addShareModel(shareModel);
	}

	protected Boolean publishing = null, subscribing = null;
	
	public void setPublishing(Boolean publishing) {
		Boolean oldPublishing = this.publishing;
		this.publishing = publishing;
		ensureListener(oldPublishing, publishing);
	}

	private SharingManagerAsyncListener asyncListener = new SharingManagerAsyncListener(this);
	
	private void ensureListener(Boolean oldValue, Boolean newValue) {
		if (oldValue != null && newValue == null) {
			getSharingManager().removeListener(asyncListener);
		}
		if (oldValue == null && newValue != null) {
			getSharingManager().addListener(asyncListener);
		}
	}
	
	public void setSubscribing(Boolean subscribing) {
		Boolean oldSubscribing = this.subscribing;
		this.subscribing = subscribing;
		ensureListener(oldSubscribing, subscribing);
	}

	protected void startSharing() {
		ShareModel shareModel = getShareModel(tabFolder.getSelection());
		if (shareModel != null) {
			startSharing(shareModel);
		}
	}

	protected void suspendSharing() {
		CTabItem tabItem = tabFolder.getSelection();
		ShareModel shareModel = getShareModel(tabItem);
		if (shareModel != null) {
			suspendSharing(shareModel);
		}
	}

	protected void suspendSharing(ShareModel shareModel) {
		publishing = false;
	}

	protected void stopSharing() {
		ShareModel shareModel = getShareModel(tabFolder.getSelection());
		if (shareModel != null && Boolean.TRUE.equals(publishing)) {
			stopSharing(shareModel);
		}
	}

	protected void stopSharing(ShareModel shareModel) {
		getSharingManager().unshareModel(shareModel);
	}

	@Override
	public void setFocus() {
		tabFolder.setFocus();
	}

	// SharingListener

	protected ShareModel findShareModel(String key) {
		for (ShareModel shareModel : getSharingManager()) {
			if (key.equals(SharingManager.getKey(shareModel))) {
				return shareModel;
			}
		}
		return null;
	}

	protected CTabItem getTabItem(ShareModel shareModel) {
		for (CTabItem tabItem : tabFolder.getItems()) {
			String key = tabItem.getToolTipText();
			if (key != null && key.equals(SharingManager.getKey(shareModel))) {
				return tabItem;
			}
		}
		return null;
	}

	@Override
	public void shareAdded(ShareModel shareModel) {
		if (getTabItem(shareModel) == null) {
			EditingDomain editingDomain = null;
			// can only edit your own model
			if (getSharingManager().getOwner().equals(shareModel.getSharer())) {
				editingDomain = createEditingDomain(shareModel.eResource().getResourceSet());
			}
			if (editingDomain != null) {
				newShareModels.put(SharingManager.getKey(shareModel), editingDomain);
			}
			CTabItem tabItem = updateTabItem(shareModel, editingDomain);
			tabFolder.setSelection(tabItem);
		}
	}

	@Override
	public void shareRemoved(ShareModel shareModel) {
		ShareModel mainShareModel = getSharingManager().getMainShareModel(shareModel);
		if (shareModel == mainShareModel) {
			removeTabItem(mainShareModel);
		}
	}

	protected void removeTabItem(ShareModel mainShareModel) {
		CTabItem tabItem = getTabItem(mainShareModel);
		if (tabItem != null && (! tabItem.isDisposed())) {
			tabItem.dispose();
		}
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
	
	// publishing methods

	protected void startSharing(ShareModel shareModel) {
		ResourceSet resourceSet = shareModel.eResource().getResourceSet();
		List<EObject> eObjects = new ArrayList<EObject>();
		for (Resource resource : resourceSet.getResources()) {
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof AbstractShare || eObjects.contains(eObject)) {
					continue;
				}
				PublishingAdapter adapter = (PublishingAdapter) getAdapterFactory().adapt(eObject, PublishingAdapter.class);
				if (adapter != null) {
					Collection<? extends EObject> shareObjects = adapter.getShareObjects(eObject);
					if (shareObjects != null) {
						// make sure shareObject belongs to a resource
						for (EObject shareObject : shareObjects) {
							if (shareObject.eResource() == null) {
//								eObject.eResource().getContents().add(shareObject);
								shareModel.eResource().getContents().add(shareObject);
							}
						}
						for (EObject shareObject : shareObjects) {
							if (! eObjects.contains(shareObject)) {
								eObjects.add(shareObject);
							}
						}
					}
				}
			}
		}
		ECollections.setEList(shareModel.getEObjects(), eObjects);
		getSharingManager().share(shareModel);
		updateTabItem(shareModel, null);
	}

	//

	@Override
	public void shared(AbstractShare shareModel) {
		// TODO
	}

	@Override
	public void shareReplaced(ShareModel shareModel) {
		// TODO
	}

	@Override
	public void unshared(ShareModel shareModel) {
		// TODO
	}
}
