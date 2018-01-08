package no.hal.emfs.importer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;

import no.hal.emfs.util.AbstractPorterTrigger;

public class ImporterTrigger extends AbstractPorterTrigger<Importer> {

	private Boolean enabled = null;
	
	protected ImporterTrigger(Importer importer, Boolean enabled) {
		super(importer);
		setEnabled(enabled);
	}
	
	public ImporterTrigger(Importer importer) {
		this(importer, true);
	}

	private IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if (getPorter() != null && shouldTriggerImporter(event)) {
				IResource resource = event.getResource();
				if (resource == null || shouldTriggerImporter(resource)) {
					ImporterTrigger.this.resourceChanged(event.getDelta());
				}
			}
		}
	};
	
	public Boolean getEnabled() {
		return enabled;
	}

	public boolean isEnabled() {
		return enabled != null && enabled;
	}
	
	public void setEnabled(Boolean enabled) {
		Boolean oldEnabled = this.enabled;
		if (oldEnabled != null && enabled == null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
		}
		this.enabled = enabled;
		if (oldEnabled == null && enabled != null) {
			ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener);
		}
	}

	protected void resourceChanged(IResourceDelta delta) {
		if (delta != null && shouldTriggerImporter(delta) && shouldTriggerImporter(delta.getResource())) {
			IResource resource = delta.getResource();
			if (resource instanceof IFile && isEnabled()) {
				importResource(resource);
				return;
			}
		}
		for (IResourceDelta childDelta : delta.getAffectedChildren()) {
			resourceChanged(childDelta);
		}
	}

	protected boolean shouldTriggerImporter(IResourceChangeEvent event) {
		return event.getType() == IResourceChangeEvent.POST_CHANGE;
	}

	protected boolean shouldTriggerImporter(IResourceDelta delta) {
		return delta.getKind() == IResourceDelta.ADDED || delta.getKind() == IResourceDelta.CHANGED;
	}

	protected boolean shouldTriggerImporter(IResource resource) {
		return getPorter().appliesTo(resource);
	}

	protected void importResource(IResource resource) {
		getPorter().importResources(resource);
	}
}
