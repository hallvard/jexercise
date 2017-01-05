package no.hal.confluence.java.ui.resources;

import java.net.URL;
import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.core.runtime.IPath;

public class JavaResourceURLResourceClassifier extends AbstractJavaClassResourceClassifier<URL> {

	@Override
	public boolean addResource(URL region, Collection<EmfsResource> roots) {
		String path = region.getPath();
		int pos = path.lastIndexOf('.');
		if (pos < 0) {
			return false;
		}
		String ext = path.substring(pos);
		if (JAVA_FILE_SUFFIX.equals(ext) || JAVA_TEST_FILE_SUFFIX.equals(ext)) {
			return false;
		}
		// should find position for src folder segment and remove upto and including that part
		int srcPos = -1;
		for (String sourceFolderName : sourceFolderNames) {
			srcPos = path.indexOf(IPath.SEPARATOR + sourceFolderName + IPath.SEPARATOR);
			if (srcPos >= 0) {
				srcPos += 1 + sourceFolderName.length();
				break;
			}
		}
		if (srcPos < 0) {
			return false;
		}
		path = path.substring(srcPos);
		if (EmfsResourceImpl.getEmfsResource(roots, path, 0) != null) {
			return false;
		}
		EmfsResource packageResource = EmfsResourceImpl.getEmfsResource(roots, path, -1);
		if (! (packageResource instanceof EmfsContainer)) {
			return false;
		}
		String[] segments = path.split(String.valueOf(IPath.SEPARATOR));
		EmfsFile file = createEmfsFile(segments[segments.length - 1], createURLContentProvider(region));
		((EmfsContainer) packageResource).getResources().add(file);
		return true;
	}
}
