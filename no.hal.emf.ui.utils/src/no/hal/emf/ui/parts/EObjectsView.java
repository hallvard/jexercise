package no.hal.emf.ui.parts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
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
	
	protected void removeEObject(EObject eObject) {
		int pos = eObjects.indexOf(eObject);
		if (pos >= 0) {
			eObjects.remove(pos);
			tabFolder.getItem(pos).dispose();
		}
	}

	public void selectEObjectTab(EObject eObject) {
		tabFolder.setSelection(eObjects.indexOf(eObject));
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
		final Transfer[] transfers = { LocalSelectionTransfer.getTransfer() };
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
				ISelection data = LocalSelectionTransfer.getTransfer().getSelection();
				Collection<IResource> resources = null;
				if (data instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) data;
					resources = Util.getResources(selection.iterator());
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
							for (EObject eObject : emfResource.getContents()) {
								if (accept(eObject)) {
									addEObject(eObject);
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
			saveEObjectResources();
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
		return true;
	}
	
	protected boolean accept(EObject eObject) {
		return false;
	}
	
	protected IItemLabelProvider getLabelProvider(EObject eObject) {
		return getAdapterHelper().adapt(eObject, IItemLabelProvider.class);
	}

	protected int addEObjectTab(final EObject eObject, int num) {
		CTabItem tab = new CTabItem(tabFolder, SWT.CLOSE);
		tab.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				eObjects.remove(eObject);
				saveEObjectResource(eObject);
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

	protected void saveEObjectResources() {
		for (EObject eObject : eObjects) {
			saveEObjectResource(eObject);
		}
	}

	protected void saveEObjectResource(EObject eObject) {
		try {
			eObject.eResource().save(null);
		} catch (IOException e) {
		}
	}
	
	//
	
	private class AutoSaver extends EContentAdapter implements Runnable {

		private EObject eObject;
		private int changeCount, changeCounter = 0;
		private boolean async;
	
		public AutoSaver(EObject eObject, int changeCount, boolean async) {
			this.eObject = eObject;
			this.changeCount = changeCount;
			this.async = async;
			eObject.eAdapters().add(this);
		}

		protected boolean isChangeNotification(Notification notification) {
			return notification.getNotifier() == eObject;
		}
		
		@Override
		public void notifyChanged(Notification notification) {
			if ((! notification.isTouch()) && isChangeNotification(notification) && (! tabFolder.isDisposed())) {
				if (changeCounter >= 0) {
					this.changeCounter++;
					if (changeCounter >= changeCount) {
						this.changeCounter = -1;
						if (async) {
							tabFolder.getDisplay().asyncExec(this);
						} else {
							save();
						}
					}
					save();
				}
			}
		}
		
		private void save() {
			if (changeCounter < 0) {
				saveEObjectResource(this.eObject);
				changeCounter = 0;
			}
		}

		@Override
		public void run() {
			save();
		}
	}
	
	protected void autoSave(EObject eObject, int changeCount, boolean async) {
		new AutoSaver(eObject, changeCount, async);
	}
}
