package no.hal.emf.ui.parts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Adapter;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.UIPlugin;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.utils.Util;

public abstract class EObjectsView extends AbstractEObjectView {

	protected EObjectsView(Class<? extends EObjectViewerAdapter<?, ?>> mainAdapterClass) {
		super(mainAdapterClass);
	}

	private List<EObject> eObjects = new ArrayList<EObject>();

	protected void addEObject(EObject eObject) {
		for (EObject other : eObjects) {
			// avoid adding the "same" object more than once
			URI eObjectUri = EcoreUtil.getURI(eObject), otherUri = EcoreUtil.getURI(other);
			if (eObjectUri.equals(otherUri)) {
				return;
			}
		}
		eObjects.add(eObject);
		if (tabFolder != null) {
			addEObjectTab(eObject, eObjects.size());
		}
	}
	
	public EObject addAcceptedEObject(Resource resource) {
		for (EObject eObject : resource.getContents()) {
			EObject accepted = accept(eObject);
			if (accepted != null) {
				addEObject(accepted);
				return accepted;
			}
		}
		return null;
	}

	protected void removeEObject(EObject eObject) {
		int pos = eObjects.indexOf(eObject);
		if (pos >= 0) {
			eObjects.remove(pos);
			tabFolder.getItem(pos).dispose();
		}
	}

	public void selectEObjectTab(EObject eObject) {
		int pos = eObjects.indexOf(eObject);
		if (pos >= 0) {
			tabFolder.setSelection(pos);
		}
	}

	protected EObject getTabEObject(CTabItem tabItem) {
		return eObjects.get(tabFolder.indexOf(tabItem));
	}

	@Override
	protected EObject getCurrentEObject() {
		return getTabEObject(tabFolder.getSelection());
	}

	@Override
	protected Composite getCurrentComposite() {
		return (Composite) tabFolder.getSelection().getControl();
	}
	
	protected Resource getEObjectResource(IPath path) {
		for (EObject eObject : eObjects) {
			Resource resource = eObject.eResource();
			if (resource != null && isPath(resource.getURI(), path)) {
				return resource;
			}
		}
		return null;
	}

	private boolean isPath(URI uri, IPath path) {
		if (uri.isPlatformResource() && uri.equals(URI.createPlatformResourceURI(path.toString(), false))) {
			return true;
		}
		return false;
	}

	private CTabFolder tabFolder;

	@Override
	public void createPartControl(Composite parent) {
		tabFolder = new CTabFolder(parent, SWT.CLOSE | SWT.BOTTOM);
		tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {			
			@Override
			public void close(CTabFolderEvent event) {
			}
		});
		DropTarget dropTarget = new DropTarget(tabFolder, DND.DROP_DEFAULT | DND.DROP_COPY);
		final Transfer[] transfers = {
				LocalSelectionTransfer.getTransfer()
//				, FileTransfer.getInstance()
//				, ResourceTransfer.getInstance()
		};
		dropTarget.setTransfer(transfers);
		dropTarget.addDropListener(new DropTargetAdapter() {
			
			@Override
			public void dragEnter(DropTargetEvent event) {
				if (event.detail == DND.DROP_DEFAULT) {
					event.detail = DND.DROP_COPY;
				}
			}

			@Override
			public void drop(DropTargetEvent event) {
				Collection<IResource> resources = null;
				if (LocalSelectionTransfer.getTransfer().isSupportedType(event.currentDataType)) {
					ISelection data = LocalSelectionTransfer.getTransfer().getSelection();
					if (data instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection) data;
						resources = Util.getResources(selection.iterator());
					}
				}
				ResourceSet resourceSet = new ResourceSetImpl();
				for (IResource resource : resources) {
					if (accept(resource)) {
						Resource emfResource = null;
						try {
							emfResource = resourceSet.getResource(URI.createPlatformResourceURI(resource.getFullPath().toString(), true), true);
						} catch (Exception e) {
						}
						if (emfResource != null && emfResource.getErrors().isEmpty() && accept(emfResource)) {
							EList<EObject> contents = emfResource.getContents();
							for (int i = 0; i < contents.size(); i++) {
								EObject eObject = contents.get(i);
								EObject accepted = accept(eObject);
								if (accepted != null) {
									addEObject(accepted);
								}
							}
						}
					}
				}
			}
		});
		if (eObjects != null) {
			int num = 1;
			for (EObject eObject : eObjects) {
				num = addEObjectTab(eObject, num);
			}
		}
		addActions(getViewSite().getActionBars());
	}

	private IAction saveAction = new Action("Save", ImageDescriptor.createFromFile(UIPlugin.class, "/icons/full/etool16/save_edit.png")) {
		public void run() {
			saveEObjectResources(saveOptions);
		}
	};
	
	protected void addActions(IActionBars actionBars) {
		actionBars.getToolBarManager().add(saveAction);
		addSwitchActions();
	}

	//

	protected boolean accept(IResource resource) {
		return true;
	}

	protected boolean accept(Resource resource) {
		for (EObject eObject : resource.getContents()) {
			if (accept(eObject) != null) {
				return true;
			}
		}
		return false;
	}
	
	protected EObject accept(EObject eObject) {
		return null;
	}
	
	protected IItemLabelProvider getLabelProvider(EObject eObject) {
		return getAdapterHelper().adapt(eObject, IItemLabelProvider.class);
	}

	protected Map<String, String> saveOptions = new HashMap<String, String>(); {
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
	}

	protected int addEObjectTab(final EObject eObject, int num) {
		CTabItem tab = new CTabItem(tabFolder, SWT.CLOSE);
		tab.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				eObjects.remove(eObject);
				saveEObjectResource(eObject, saveOptions);
			}
		});
		IItemLabelProvider labelProvider = getLabelProvider(eObject);
		String label = labelProvider.getText(eObject), toolTip = null;
		if (eObject.eResource() != null) {
			URI uri = eObject.eResource().getURI();
			label = uri.lastSegment();
			toolTip = uri.toPlatformString(true);
		}
		tab.setText(label != null ? label : eObject.eClass().getName() + num++);
		if (toolTip != null) {
			tab.setToolTipText(toolTip);
		}
		Composite composite = createEObjectComposite(tabFolder);
		getAdapterHelper().initView(eObject, EObjectUIAdapter.class, composite);
		tab.setControl(composite);
		switchView(eObject, composite, null);
		return num;
	}

	@Override
	public void setFocus() {
		tabFolder.setFocus();
	}

	private static String EOBJECT_URI_KEY = "eObjectUri";
	
    @Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
    	super.init(site, memento);
    	if (memento != null) {
	    	ResourceSet resourceSet = new ResourceSetImpl();
	    	for (IMemento child : memento.getChildren()) {
	    		try {
					URI uri = URI.createURI(child.getString(EOBJECT_URI_KEY));
					EObject eObject = resourceSet.getEObject(uri, true);
					if (eObject != null) {
						addEObject(eObject);
					}
				} catch (Exception e) {
				}
	    	}
    	}
    }
    
	@Override
	public void saveState(IMemento memento) {
		super.saveState(memento);
		for (EObject eObject : eObjects) {
			IMemento child = memento.createChild(EOBJECT_URI_KEY);
			URI uri = EcoreUtil.getURI(eObject);
			child.putString(EOBJECT_URI_KEY, uri.toString());
		}
//		saveEObjectResources();
	}

	protected void saveEObjectResource(EObject eObject, Map<?, ?> options) {
		try {
			eObject.eResource().save(options);
		} catch (IOException e) {
		}
	}

	protected void saveEObjectResources(Map<?, ?> options) {
		for (EObject eObject : eObjects) {
			saveEObjectResource(eObject, options);
		}
	}
	
	//
	
//	private class AutoSaver extends EContentAdapter implements Runnable {
//
//		private EObject eObject;
//		private int changeCount, changeCounter = 0;
//		private boolean async;
//	
//		public AutoSaver(EObject eObject, int changeCount, boolean async) {
//			this.eObject = eObject;
//			this.changeCount = changeCount;
//			this.async = async;
//			eObject.eAdapters().add(this);
//		}
//
//		protected boolean isChangeNotification(Notification notification) {
//			if (notification.isTouch()) {
//				return false;
//			}
//			Object notifier = notification.getNotifier();
//			while (notifier instanceof EObject) {
//				if (notifier == eObject) {
//					return true;
//				}
//				notifier = ((EObject) notifier).eContainer();
//			}
//			return false;
//		}
//		
//		protected boolean isActive() {
//			return eObjects.contains(eObject) && (! tabFolder.isDisposed());
//		}
//		
//		@Override
//		public void notifyChanged(Notification notification) {
//			if (isActive() && isChangeNotification(notification)) {
//				if (changeCounter >= 0) {
//					this.changeCounter++;
//					if (changeCounter >= changeCount) {
//						this.changeCounter = -1;
//						if (async) {
//							tabFolder.getDisplay().asyncExec(this);
//						} else {
//							run();
//						}
//					}
//				}
//			}
//		}
//		
//		private void save() {
//			if (changeCounter < 0) {
//				saveEObjectResource(this.eObject, null);
//				changeCounter = 0;
//			}
//		}
//
//		@Override
//		public void run() {
//			save();
//		}
//	}
//	
//	protected void autoSave(EObject eObject, int changeCount, boolean async) {
//		new AutoSaver(eObject, changeCount, async);
//	}
}
