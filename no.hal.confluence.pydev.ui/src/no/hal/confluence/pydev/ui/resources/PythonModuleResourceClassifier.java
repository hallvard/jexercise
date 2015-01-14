package no.hal.confluence.pydev.ui.resources;

import java.util.Collection;

import no.hal.confluence.ui.resources.AbstractEmfsResourceClassifier;
import no.hal.confluence.ui.resources.XemfsResourceClassifier;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

public class PythonModuleResourceClassifier extends AbstractPydevModuleResourceClassifier<String> {

	@Override
	public boolean addResource(String region, Collection<EmfsResource> roots) {
		if (! region.contains(PYTHON_FILE_SUFFIX)) {
			return false;
		}
		EmfsResource emfsResource = XemfsResourceClassifier.readXemfsResourceInComment(region, "#", PYTHON_FILE_SUFFIX);
		EmfsFile file = AbstractEmfsResourceClassifier.findEmfsResource(emfsResource, PYTHON_FILE_SUFFIX);
		if (file == null) {
			return false;
		}
		setTags(emfsResource, PYTHON_TYPE, "package");
		if (file.getContentProvider() == null) {
			setTags(file, PYTHON_TYPE);
			file.setContentProvider(createStringContentProvider(region, PYTHON_TYPE));
		}
		return XemfsResourceClassifier.addXemfsResource(emfsResource, roots, true, true);
	}
	
	@Override
	protected String fixRegionContents(String contents, String... tags) {
		if (! contents.startsWith("# coding:")) {
			contents = "# coding: utf-8\n" + contents;
		}
		return super.fixRegionContents(contents);
	}
}
