package no.hal.sharing.emfs;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.importer.Importer;
import no.hal.emfs.importer.ImporterTrigger;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.sync.SyncPackage;
import no.hal.sharing.SelfPublishingAdapter;

public class EmfsPublishingAdapter extends SelfPublishingAdapter {

	private ImporterTrigger importerTrigger = null; 
	
	@Override
	public Resource getSharedResource(EObject eObject) {
		EmfsResource emfsResource = null;
		ImportSpec importSpec = null;
		if (eObject instanceof EmfsResource) {
			emfsResource = (EmfsResource) target;
			if (emfsResource.eResource() != null) {
				importSpec = (ImportSpec) EcoreUtil.getObjectByType(emfsResource.eResource().getContents(), SyncPackage.eINSTANCE.getImportSpec());
			}
			if (importSpec == null) {
				importSpec = SyncFactory.eINSTANCE.createImportSpec();
				importSpec.getResourceRefs().add(emfsResource);
//				ImportRule rootRule = SyncFactory.eINSTANCE.createImportRule();
//				ResourcePath rootPath = SyncFactory.eINSTANCE.createRelativePath();
//				String path = emfsResource.getFullPath();
//				rootPath.getPath().addAll(Arrays.asList(path.split("/")));
//				rootRule.setPath(rootPath);
//				importSpec.getRules().add(rootRule);
			}
		} else if (eObject instanceof ImportSpec) {
			importSpec = (ImportSpec) eObject;
			importSpec.getResourceRefs().addAll(importSpec.getResources());
			if (! importSpec.getResourceRefs().isEmpty()) {
				emfsResource = importSpec.getResourceRefs().get(0);
			}
		}
		if (emfsResource == null || importSpec == null) {
			return null;
		}
		Importer importer = new Importer(importSpec);
		importerTrigger = new ImporterTrigger(importer);
		return super.getSharedResource(emfsResource);
	}
	
	@Override
	public void unsetTarget(Notifier oldTarget) {
		super.unsetTarget(oldTarget);
		if (importerTrigger != null) {
			importerTrigger.setEnabled(false);
		}
	}
}
