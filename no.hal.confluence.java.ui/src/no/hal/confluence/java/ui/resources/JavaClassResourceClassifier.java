package no.hal.confluence.java.ui.resources;

import java.util.Collection;

import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

public class JavaClassResourceClassifier extends AbstractJavaClassResourceClassifier<String> {

	protected String getName(String s, int start, boolean qualified, String... prefixes) {
		int pos = start;
		for (String prefix : prefixes) {
			int nextPos = s.indexOf(prefix, pos);
			if (nextPos < 0) {
				return null;
			}
			pos = nextPos + prefix.length();
		}
		int end = pos;
		while ((end > pos ? Character.isJavaIdentifierPart(s.charAt(end)) : Character.isJavaIdentifierStart(s.charAt(end))) || (qualified && s.charAt(end) == '.')) {
			end++;
		}
		return s.substring(pos, end);
	}

	@Override
	public boolean addResource(String region, Collection<EmfsResource> roots) {
		String packageName = getName(region, 0, true, "package ");
		String className = getName(region, (packageName != null ? region.indexOf(packageName) : 0), true, "class ");
		if (className == null) {
			return false;
		}
		EmfsFile file = createEmfsFile(className + JAVA_FILE_SUFFIX, region);
		setTagsFromContent(file, region);
		String[] segments = (packageName != null ? packageName.split("\\.") : null);
		mergeInto(file, roots, segments, 0, 0, true, getPackageTagsFor(file));
		return true;
	}
}
