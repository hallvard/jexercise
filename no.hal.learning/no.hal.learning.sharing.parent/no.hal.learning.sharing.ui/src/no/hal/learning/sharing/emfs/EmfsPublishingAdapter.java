package no.hal.learning.sharing.emfs;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.emfs.importer.Importer;
import no.hal.emfs.importer.ImporterTrigger;
import no.hal.emfs.sync.ExportRule;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncFactory;
import no.hal.learning.sharing.runtime.PublishingAdapter;

public class EmfsPublishingAdapter extends AdapterImpl implements PublishingAdapter {

	@Override
	public Collection<? extends EObject> getShareObjects(EObject eObject) {
		if (eObject instanceof ImportSpec) {
			ImportSpec importSpec = (ImportSpec) eObject;
			Importer importer = new Importer(importSpec);
			new ImporterTrigger(importer);
			return Arrays.asList(importSpec, export(importSpec));
		}
		return null;
	}

	protected EObject export(ImportSpec importSpec) {
		ExportSpec exportSpec = SyncFactory.eINSTANCE.createExportSpec();
		copyRules(importSpec.getRules(), exportSpec.getRules());
		exportSpec.getResourceRefs().addAll(importSpec.getResources());
		return exportSpec;
	}

	protected void copyRules(Collection<ImportRule> importRules, Collection<ExportRule> exportRules) {
		for (ImportRule rule : importRules) {
			exportRules.add(export(rule));
		}
	}

	private ExportRule export(ImportRule importRule) {
		ExportRule exportRule = SyncFactory.eINSTANCE.createExportRule();
		exportRule.setPath(EcoreUtil.copy(importRule.getPath()));
		copyRules(importRule.getIncludes(), exportRule.getIncludes());
		return exportRule;
	}
}
