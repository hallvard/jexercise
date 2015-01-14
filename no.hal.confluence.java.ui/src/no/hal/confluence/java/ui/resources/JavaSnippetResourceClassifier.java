package no.hal.confluence.java.ui.resources;

import java.util.Collection;

import no.hal.confluence.ui.resources.AbstractEmfsResourceClassifier;
import no.hal.confluence.ui.resources.XemfsResourceClassifier;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

public class JavaSnippetResourceClassifier extends AbstractJavaClassResourceClassifier<String> {

	private static String SNIPPET_TAG = "snippet";
	private static String SNIPPET_FILE_SUFFIX = ".jpage";

	@Override
	public boolean addResource(String region, Collection<EmfsResource> roots) {
		if (! region.contains(SNIPPET_FILE_SUFFIX)) {
			return false;
		}
		EmfsResource emfsResource = XemfsResourceClassifier.readXemfsResourceInComment(region, "//", SNIPPET_FILE_SUFFIX);
		EmfsFile file = AbstractEmfsResourceClassifier.findEmfsResource(emfsResource, SNIPPET_FILE_SUFFIX);
		if (file == null) {
			return false;
		}
		setTags(emfsResource, JAVA_TAG, SNIPPET_TAG);
		if (file != emfsResource) {
			setTags(file, JAVA_TAG, SNIPPET_TAG);
		}
		if (file.getContentProvider() == null) {
			file.setContentProvider(createStringContentProvider(region, JAVA_TAG, SNIPPET_TAG));
		}
		return XemfsResourceClassifier.addXemfsResource(emfsResource, roots, true, true);
	}
}
