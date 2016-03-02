package no.hal.emfs.ui.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncFactory;

public class ExportSpecEObjectUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ImportSpec) {
			ImportSpec importSpec = (ImportSpec) target;
			if (! importSpec.getResourceRefs().isEmpty()) {
				target = importSpec.getResourceRefs().get(0);
			}
		}
		if (target instanceof EmfsResource) {
			EmfsResource resource = (EmfsResource) target;
			Resource emfResource = resource.eResource();
			ExportSpec exportSpec = SyncFactory.eINSTANCE.createExportSpec();
			if (resource.eContainer() == null) {
				exportSpec.getResources().add(resource);
				if (emfResource != null) {
					emfResource.getContents().add(exportSpec);
				}
			} else {
				exportSpec.getResourceRefs().add(resource);				
				if (emfResource != null) {
					resource.eResource().getContents().add(exportSpec);
				}
			}
			target = exportSpec;
		}
		if (target instanceof ExportSpec) {
			return new ExportSpecEObjectUIAdapter((ExportSpec) target);
		} else 
		return null;
	}
}
