package no.hal.confluence.ui.resources;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.URLContentProvider;
import no.hal.emfs.util.EmfsResourceImpl;

public abstract class AbstractEmfsResourceClassifier<T> implements EmfsResourceClassifier<T> {

	@Override
	public String toString() {
		String toString = super.toString();
		int pos1 = toString.lastIndexOf('.'), pos2 = toString.indexOf('@', pos1 + 1);
		return (pos1 < 0 || pos2 < 0 ? toString : toString.substring(pos1 + 1, pos2));
	}

	protected EmfsFile createEmfsFile(String name, EmfsFileContentProvider contentProvider, String... tags) {
		EmfsFile file = EmfsFactory.eINSTANCE.createEmfsFile();
		file.setName(name);
		file.getTags().addAll(Arrays.asList(tags));
		file.setContentProvider(contentProvider);
		return file;
	}

	protected EmfsFile createEmfsFile(String name, String region, String... tags) {
		EmfsFileContentProvider contentProvider = createStringContentProvider(region, tags);
		return createEmfsFile(name, contentProvider, tags);
	}
	
	protected EmfsFileContentProvider createStringContentProvider(String region, String... tags) {
		StringContentProvider content = EmfsFactory.eINSTANCE.createStringContentProvider();
		content.setStringContent(fixRegionContents(region, tags));
		return content;
	}

	protected String fixRegionContents(String contents, String... tags) {
		return contents;
	}

	protected EmfsFileContentProvider createURLContentProvider(URL region) {
		URLContentProvider content = EmfsFactory.eINSTANCE.createURLContentProvider();
		content.setUrlString(region.toExternalForm());
		return content;
	}
	
	protected boolean mergeInto(EmfsResource emfsResource, Collection<EmfsResource> emfsResources, String[] segments, int start, int end, boolean requireTags, String... tags) {
		return EmfsResourceImpl.mergeInto(emfsResource, emfsResources, segments, start, end, requireTags, tags);
	}

	protected void setTagsFromContent(EmfsFile file, String content) {
	}

	protected void setTags(EmfsResource emfsResource, String... tags) {
		EList<String> resourceType = emfsResource.getTags();
		for (String tag : tags) {
			if (! resourceType.contains(tag)) {
				resourceType.add(tag);
			}
		}
	}
	
	public static boolean hasTags(EmfsResource emfsResource, String... tags) {
		for (String tag : tags) {
			if (! emfsResource.getTags().contains(tag)) {
				return false;
			}
		}
		return true;
	}
	
	public static EmfsFile findEmfsResource(EmfsResource emfsResource, String ext, String... tags) {
		if (emfsResource instanceof EmfsFile && (ext == null || emfsResource.getName().endsWith(ext) && hasTags(emfsResource, tags))) {
			return (EmfsFile) emfsResource;
		} else if (emfsResource instanceof EmfsContainer) {
			for (EmfsResource child : (((EmfsContainer) emfsResource).getResources())) {
				EmfsFile fxmlFile = findEmfsResource(child, ext, tags);
				if (fxmlFile != null) {
					return fxmlFile;
				}
			}
		}
		return null;
	}
}
