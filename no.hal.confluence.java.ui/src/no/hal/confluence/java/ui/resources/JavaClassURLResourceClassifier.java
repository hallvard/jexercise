package no.hal.confluence.java.ui.resources;

import java.net.URL;
import java.util.Collection;

import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

public class JavaClassURLResourceClassifier extends AbstractJavaClassResourceClassifier<URL> {

	@Override
	public boolean addResource(URL region, Collection<EmfsResource> roots) {
		String path = region.getPath();
		if (! path.endsWith(JAVA_FILE_SUFFIX)) {
			return false;
		}
		String[] segments = path.split("/");
		EmfsFile file = createEmfsFile(segments[segments.length - 1], createURLContentProvider(region));
		setTags(file);
		mergeInto(file, roots, segments, getSourceFolderPos(segments) + 1, -1, true, getPackageTagsFor(file));
		return true;
	}
}
