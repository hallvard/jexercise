package no.hal.emfs.exporter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.AbstractPorterTrigger;

public abstract class AbstractExportTrigger extends AbstractPorterTrigger<Exporter>{

	private EmfsResource emfsResource;
	
	public AbstractExportTrigger(Exporter exporter) {
		super(exporter);
	}
	
	protected EmfsResource getEmfsResource() {
		return emfsResource;
	}
	
	private EContentAdapter changeListener = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof EObject) {
				EObject eObject = (EObject) notification.getNotifier();
				while (eObject != null) {
					if (eObject instanceof EmfsResource) {
						exportResource((EmfsResource) eObject);
					}
					eObject = eObject.eContainer();
				}
			}
		}
	};
	
	public void setEmfsResource(EmfsResource emfsResource) {
		if (this.emfsResource != null) {
			changeListener.unsetTarget(emfsResource);
		}
		this.emfsResource = emfsResource;
		if (this.emfsResource != null) {
			changeListener.setTarget(emfsResource);
		}
	}

	protected abstract void exportResource(EmfsResource eObject);
}
