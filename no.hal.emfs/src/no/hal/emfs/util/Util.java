package no.hal.emfs.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.GitRepoRef;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Util {

	public static int countTags(EmfsResource resource, String... tags) {
		int count = 0;
		for (int i = 0; i < tags.length; i++) {
			if (resource.getTags().contains(tags[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean hasTags(EmfsResource resource, String... tags) {
		return countTags(resource, tags) == tags.length;
	}
	
	//
	
	public static InputStream getInputStream(String prefix, InputStream wrappedInput, String suffix, int options) {
		InputStream inputStream = wrappedInput;
		if (prefix != null) {
			inputStream = new SequenceInputStream(new ByteArrayInputStream(prefix.getBytes()), inputStream);
		}
		if (suffix != null) {
			inputStream = new SequenceInputStream(inputStream, new ByteArrayInputStream(suffix.getBytes()));
		}
		return inputStream;
	}
	
	//
	
	public static String getGitRemoteString(String host, String owner, String repo, String path) {
		// git@github.com:me/mytestrepo.git
		String remote = "git@" + host;
		if (owner != null) {
			remote += ":" + owner;
		}
		if (path == null) {
			path = ".git";
		}
		return remote + "/" + repo + path;
	}

	public static String getGitRemoteString(GitRepoRef repo, String path) {
		return getGitRemoteString(repo.getHost(), repo.getOwner(), repo.getRepo(), path);
	}
	
	//
	
	public static String replaceProperties(String s, EObject properties) {
		if (properties != null) {
			int start = 0;
			while (start < s.length()) {
				start = s.indexOf("${", start);
				int end = s.indexOf("}", start + 1);
				if (start >= 0 && end > start) {
					String featureName = s.substring(start + 2, end);
					EStructuralFeature feature = properties.eClass().getEStructuralFeature(featureName);
					if (feature != null) {
						String val = String.valueOf(properties.eGet(feature));
						if (val != null) {
							s = s.substring(0,  start) + val + s.substring(end + 1);
							end += val.length() - (featureName.length() + 3);
						}
					}
				} else {
					break;
				}
				start = end + 1;
			}
		}
		return s;
	}
}
