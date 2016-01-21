package no.hal.learning.sharing.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.ChangeEdit;
import no.hal.learning.sharing.ModelEdit;
import no.hal.learning.sharing.ShareEdits;
import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.SharingFactory;
import no.hal.learning.sharing.SharingPackage;
import no.hal.learning.sharing.util.EObjectContentsUriMap;

public class SharingManager implements Iterable<ShareModel>, SharingTransport.Subscriber {

	public SharingManager() {
	}

	private final String owner = String.valueOf(Math.random() * System.currentTimeMillis()); 

	public String getOwner() {
		return owner;
	}

	private SharingTransport sharingTransport;

	public SharingTransport getSharingTransport() {
		return sharingTransport;
	}

	void setSharingTransport(SharingTransport sharingTransport) {
		if (this.sharingTransport != null) {
			this.sharingTransport.unsubscribe(this);
		}
		this.sharingTransport = sharingTransport;
		if (this.sharingTransport != null) {
			this.sharingTransport.subscribe(this);
		}
	}

	//

	private Map<String, ShareGroup> shares = new HashMap<String, ShareGroup>();

	public static String getKey(AbstractShare share) {
		return share.getOwner() + "#" + share.getName();
	}

	public boolean isSharing(AbstractShare share) {
		return shares.containsKey(getKey(share));
	}

	protected ShareGroup getShareGroup(AbstractShare share) {
		return shares.get(getKey(share));
	}

	public ShareModel getMainShareModel(AbstractShare share) {
		ShareGroup shareGroup = getShareGroup(share);
		return (shareGroup != null ? shareGroup.mainShare : null);
	}

	protected ShareModel getShareModel(AbstractShare share, String sharer) {
		ShareGroup shareGroup = getShareGroup(share);
		return shareGroup.getShareModel(share, sharer);
	}

	public static ShareModel getShareModel(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			ShareModel shareModel = getShareModel(resource);
			if (shareModel != null) {
				return shareModel;
			}
		}
		return null;
	}

	public static ShareModel getShareModel(Resource resource) {
		return (ShareModel) EcoreUtil.getObjectByType(resource.getContents(), SharingPackage.eINSTANCE.getShareModel());
	}

	public static boolean isSharingResource(Resource resource) {
		return getShareModel(resource) != null;
	}

	public static URI createShareUri(ShareModel shareModel) {
		return URI.createURI(shareModel.getName() + ".xmi");
	}

	public static String isValidShareName(String s) {
		if (s.length() == 0) {
			return "String cannot be empty";
		}
		if (! Character.isJavaIdentifierStart(s.charAt(0))) {
			return "Name must start with a character";
		}
		if (s.length() > 1) {
			for (int i = 1; i < s.length(); i++) {
				if (! Character.isJavaIdentifierPart(s.charAt(0))) {
					return "Name can only contain letters, digits and _";
				}
			}
		}
		return null;
	}
	
	protected void ensureResource(ShareModel shareModel) {
		Resource resource = shareModel.eResource();
		if (resource == null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			resource = resourceSet.createResource(createShareUri(shareModel));
			resource.getContents().add(shareModel);
			resourceSet.getResources().add(resource);
		}
	}

	public ShareGroup addShareModel(ShareModel shareModel) {
		ensureResource(shareModel);
		defaultOwner(shareModel, getOwner());
		defaultSharer(shareModel, getOwner());
		ShareGroup shareGroup = getShareGroup(shareModel);
		if (shareGroup == null) {
			shareGroup = new ShareGroup(shareModel);
			shares.put(getKey(shareModel), shareGroup);
		} else {
			if (shareGroup.derivedShares == null) {
				shareGroup.derivedShares = new ArrayList<ShareModel>();
			}
			shareGroup.derivedShares.add(shareModel);
		}
		for (Listener listener : listeners) {
			listener.shareAdded(shareModel);
		}
		return shareGroup;
	}

	protected void defaultOwner(AbstractShare share, String sharer) {
		if (share.getOwner() == null) {
			share.setOwner(sharer);
		}
	}
	protected void defaultSharer(AbstractShare share, String sharer) {
		if (share.getSharer() == null) {
			share.setSharer(sharer);
		}
	}

	public void share(final ShareModel shareModel) {
		// set owner if not set, yet
		defaultOwner(shareModel, getOwner());
		// always set sharer
		shareModel.setSharer(owner);
		ShareGroup shareGroup = getShareGroup(shareModel);
		if (shareGroup == null || shareGroup.getShareModel(shareModel, shareModel.getSharer()) == null) {
			shareGroup = addShareModel(shareModel);
		} else {
			replaceShareModel(shareModel);
		}
		shareGroup.enabled = true;
		shareAndPrepareEdits(shareModel, null);
	}

	protected void shareAndPrepareEdits(final ShareModel shareModel, AbstractShare share) {
		if (share == null) {
			share = shareModel;
		}
		defaultOwner(share, shareModel.getOwner());
		defaultSharer(share, owner);
		// create ShareEdits for accumulating edits (recorded changes)
		final ShareEdits edits = SharingFactory.eINSTANCE.createShareEdits();
		edits.setName(shareModel.getName());
		edits.setOwner(shareModel.getOwner());
		edits.setSharer(shareModel.getSharer());
		getShareGroup(shareModel).edits = edits;

		new ChangeRecorder(shareModel.getEObjects()) {	
			private ChangeRecorder changeRecorder = this;
			@Override
			protected void handleFeature(EStructuralFeature feature, EReference containment, Notification notification, final EObject eObject) {
				boolean shouldRecord = shouldRecord(feature, containment, notification, eObject);
				super.handleFeature(feature, containment, notification, eObject);
				if (edits != null && shouldRecord) {
//						asyncExec(new Runnable() {
//							@Override
//							public void run() {
							shareChanges(shareModel, eObject, changeRecorder.endRecording());
//							}
//						});
				}
			}
		};
		enqueueShare(share, true);
		for (Listener listener : listeners) {
			listener.shared(share);
		}
	}

	private synchronized void shareChanges(ShareModel shareModel, EObject eObject, ChangeDescription changes) {
		ChangeEdit changeEdit = SharingFactory.eINSTANCE.createChangeEdit();
		Map<EObject, URI> map = new EObjectContentsUriMap(eObject);
		changes.copyAndReverse(map);
		changeEdit.setEObject(eObject);
		changeEdit.setChange(changes);
		ShareEdits shareEdits = getShareGroup(shareModel).edits;
		shareEdits.getEdits().add(changeEdit);
		URI shareUri = SharingManager.createShareUri(shareModel);
		Resource shareResource = Resource.Factory.Registry.INSTANCE.getFactory(shareUri).createResource(shareUri);
//		Resource editResource = changeEdit.createSerializableEdit(shareUri);
		shareResource.getContents().add(shareEdits);
//		editResource.getContents().add(shareModel);
		shareAndPrepareEdits(shareModel, shareEdits);
	}

	protected void enqueueShare(AbstractShare share, boolean publish) {
		ShareGroup shareGroup = getShareGroup(share);
		Queue<AbstractShare> outQueue = shareGroup.getOutQueue();
		synchronized (outQueue) {
			outQueue.add(share);
			if (publish && (shareGroup.isEnabled())) {
				while (! outQueue.isEmpty()) {
					publishNext(outQueue);
				}
			}
		}
	}

	protected void publishNext(Queue<AbstractShare> outQueue) {
		getSharingTransport().publish(outQueue.remove());
	}

	protected void replaceShareModel(ShareModel shareModel) {
		ShareGroup shareGroup = getShareGroup(shareModel);
		if (shareGroup.replaceShareModel(shareModel) >= 0) {
			for (Listener listener : listeners) {
				listener.shareReplaced(shareModel);
			}
		}
	}

	public void unshareModel(ShareModel shareModel) {
		if (shareModel.getMode() != null) {
			shareModel.setMode(null);
			for (Listener listener : listeners) {
				listener.unshared(shareModel);
			}
		}
	}

	public void removeShareModel(ShareModel shareModel) {
		unshareModel(shareModel);
		shares.remove(shareModel);
		for (Listener listener : listeners) {
			listener.shareRemoved(shareModel);
		}
	}

	//

	@Override
	public void receivedShare(AbstractShare share) {
		// don't act on your own sharing
		if (getOwner().equals(share.getSharer())) {
			return;
		}
		ShareGroup shareGroup = getShareGroup(share);
		if (shareGroup != null) {
			Queue<AbstractShare> inQueue = shareGroup.getInQueue();
			inQueue.add(share);
			if (shareGroup.isEnabled()) {
				while (! inQueue.isEmpty()) {
					AbstractShare removed = inQueue.remove();
					ShareModel shareModel = shareGroup.getShareModel(removed, removed.getSharer());
					receiveNext(shareModel, removed);
				}
			}
		} else if (share instanceof ShareModel) {
			receiveNext(null, share);			
		}
	}

	protected void receiveNext(ShareModel shareModel, AbstractShare share) {
		if (shareModel != null) {
			// either owner or other is replacing or updating
			if (share instanceof ShareModel) {
				if (share != shareModel) {
					replaceShareModel((ShareModel) share);
				}
			} else if (share instanceof ShareEdits) {
				updateShare((ShareEdits) share);
			}
		} else if (share instanceof ShareModel) {
			addShareModel((ShareModel) share);
		}
	}

	protected void updateShare(ShareEdits shareEdits) {
		ShareModel shareModel = getShareModel(shareEdits, shareEdits.getSharer());
		if (shareModel == null) {
			shareModel = getShareModel(shareEdits, null);
			ShareModel shareModelCopy = copyShareModel(shareModel, shareEdits.getSharer());
			if (shareModelCopy == null) {
				return;
			}
			addShareModel(shareModelCopy);
			shareModel = shareModelCopy;
		}
		ResourceSet resourceSet = shareModel.eResource().getResourceSet();
		// resolve edits against existing model
		Resource editsResource = shareEdits.eResource();
		resourceSet.getResources().add(editsResource);
		EcoreUtil.resolveAll(editsResource);
		// replay edits on existing model
		Collection<ModelEdit> edits = shareEdits.getEdits();
		for (ModelEdit edit : edits) {
			edit.performEdit();
		}
		resourceSet.getResources().remove(editsResource);
	}

	protected ShareModel copyShareModel(ShareModel shareModel, String sharer) {
		ResourceSet resourceSet = shareModel.eResource().getResourceSet();
		ResourceSet  resourceSetCopy = new ResourceSetImpl();
		ShareModel shareModelCopy = null;
		for (Resource resource : resourceSet.getResources()) {
			Resource resourceCopy = resourceSetCopy.createResource(resource.getURI());
			Collection<EObject> contentsCopy = EcoreUtil.copyAll(resource.getContents());
			resourceCopy.getContents().addAll(contentsCopy);
			if (shareModelCopy == null) {
				shareModelCopy = (ShareModel) EcoreUtil.getObjectByType(contentsCopy, SharingPackage.eINSTANCE.getShareModel());
			}
			resourceSetCopy.getResources().add(resourceCopy);
		}
		if (shareModelCopy != null) {
			shareModelCopy.setSharer(sharer);
		}
		return shareModelCopy;
	}

	//

	public interface Listener {
		public void shareAdded(ShareModel shareModel);
		public void shareReplaced(ShareModel shareModel);
		public void shared(AbstractShare shareModel);
		public void unshared(ShareModel shareModel);
		public void shareRemoved(ShareModel shareModel);
	}

	private Collection<Listener> listeners = new ArrayList<SharingManager.Listener>();

	public void addListener(Listener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}

	//

	@Override
	public Iterator<ShareModel> iterator() {

		return new Iterator<ShareModel>() {

			private Iterator<String> delegate = shares.keySet().iterator();

			@Override
			public boolean hasNext() {
				return delegate.hasNext();
			}

			@Override
			public ShareModel next() {
				ShareGroup shareGroup = shares.get(delegate.next());
				return shareGroup.mainShare;
			}
		};
	}

	//
	
	private static class ShareGroup implements Iterable<ShareModel> {

		private ShareModel mainShare;
		private List<ShareModel> derivedShares;
		
		private ShareEdits edits = null;

		private Queue<AbstractShare> inQueue;
		private Queue<AbstractShare> outQueue;
		
		public Queue<AbstractShare> getInQueue() {
			if (inQueue == null) {
				inQueue = new LinkedList<AbstractShare>();
			}
			return inQueue;
		}
		public Queue<AbstractShare> getOutQueue() {
			if (outQueue == null) {
				outQueue = new LinkedList<AbstractShare>();
			}
			return outQueue;
		}

		private Boolean enabled = false;

		public boolean isEnabled() {
			return Boolean.TRUE.equals(enabled);
		}	
		
		ShareGroup(ShareModel mainShare) {
			this.mainShare = mainShare;
		}

		protected boolean isSame(AbstractShare share1, AbstractShare share2, String sharer) {
			return getKey(share2).equals(getKey(share1)) && (sharer == null || share1.getSharer().equals(sharer));
		}
		
		protected boolean isSame(AbstractShare share1, AbstractShare share2) {
			return isSame(share1, share2, share2.getSharer());
		}

		protected int findDerivedShareModel(AbstractShare share, String sharer) {
			if (isSame(mainShare, share, sharer)) {
				return 0;
			}
			if (derivedShares != null) {
				for (int i = 0; i < derivedShares.size(); i++) {
					ShareModel derivedShareModel = derivedShares.get(i);
					if (isSame(share, derivedShareModel)) {
						return i + 1; 
					}
				}
			}
			return -1;
		}

		protected ShareModel getShareModel(int pos) {
			if (pos == 0) {
				return mainShare;
			} else if (pos > 0) {
				return derivedShares.get(pos - 1);
			}
			return null;
		}
		
		public ShareModel getShareModel(AbstractShare share, String sharer) {
			return getShareModel(findDerivedShareModel(share, sharer));
		}

		public int replaceShareModel(ShareModel shareModel) {
			int pos = findDerivedShareModel(shareModel, shareModel.getSharer());
			if (pos == 0) {
				mainShare = shareModel;
			} else if (pos > 0) {
				derivedShares.set(pos - 1, shareModel);
			}
			return pos;
		}

		//
		
		@Override
		public Iterator<ShareModel> iterator() {
			return new Iterator<ShareModel>() {

				int pos = 0;
				@Override
				public boolean hasNext() {
					return pos <= derivedShares.size();
				}

				@Override
				public ShareModel next() {
					ShareModel shareModel = getShareModel(pos);
					pos++;
					return shareModel;
				}
			};
		}
	}
	
}
