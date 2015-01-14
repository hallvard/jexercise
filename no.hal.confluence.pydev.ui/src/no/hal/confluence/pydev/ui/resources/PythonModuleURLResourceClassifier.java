package no.hal.confluence.pydev.ui.resources;

import java.net.URL;
import java.util.Collection;

import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

public class PythonModuleURLResourceClassifier extends AbstractPydevModuleResourceClassifier<URL> {

	@Override
	public boolean addResource(URL region, Collection<EmfsResource> roots) {
		String path = region.getPath();
		if (! path.endsWith(PYTHON_FILE_SUFFIX)) {
			return false;
		}
		String[] segments = path.split("/");
		EmfsFile file = createEmfsFile(segments[segments.length - 1], createURLContentProvider(region));
		setTags(file);
		
		int pos = segments.length - 2;
		while (pos >= 0) {
			if (sourceFolderNames.contains(segments[pos])) {
				break;
			}
			pos--;
		}
		mergeInto(file, roots, segments, pos + 1, -1, true, PYTHON_TYPE, "package");
		return true;
	}
}
