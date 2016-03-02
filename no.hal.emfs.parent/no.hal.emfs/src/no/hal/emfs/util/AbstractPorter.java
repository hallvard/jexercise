package no.hal.emfs.util;

import java.util.Collection;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.Property;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.PathRule;
import no.hal.emfs.sync.PortSpec;
import no.hal.emfs.sync.PropertiesRule;
import no.hal.emfs.sync.ResourcePath;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.sync.TagsRule;

public class AbstractPorter<R extends PathRule<R>> {

	protected final PortSpec<R> spec;

	protected AbstractPorter(PortSpec<R> spec) {
		this.spec = spec;
	}

	public PortSpec<R> getSpec() {
		return spec;
	}
	public Collection<R> getRules() {
		return spec.getRules();
	}
	
	public R findMostSpecificRule(Collection<R> rules, IPath path, int startSegment) {
		for (R rule : rules) {
			if (appliesTo(rule, path, startSegment)) {
				R found = findMostSpecificRule(rule, path, startSegment);
				return (found != null ? found : rule);
			}
		}
		return null;
	}

	protected boolean appliesTo(R rule, IPath path, int startSegment) {
		String fullPath = rule.getFullPath();
		int start = 0, pos = 0;
		while (start < fullPath.length()) {
			int end = fullPath.indexOf('/', start);
			if (end < 0) {
				end = fullPath.length();
			}
			if (end - start > 1) {
				int segmentNum = pos - startSegment;
				if (segmentNum >= path.segmentCount()) {
					return false;
				}
				String segment = fullPath.substring(start, end);
				if (segmentNum >= 0 && (! segment.equals(path.segment(segmentNum)))) {
					return false;
				}
				pos++;
			}
			start = end + 1;
		}
		return true;
	}
	
	protected R findMostSpecificRule(R rule, IPath path, int startSegment) {
		R found = findMostSpecificRule(rule.getExcludes(), path, startSegment);
		if (found == null) {
			found = findMostSpecificRule(rule.getIncludes(), path, startSegment);
		}
		return found;
	}

	public boolean isIncluding(R rule) {
		return rule.eContainingFeature() != SyncPackage.eINSTANCE.getPathRule_Excludes();
	}
	
	public static String buildPath(ResourcePath resourcePath) {
		EList<String> segments = resourcePath.getPath();
		if (segments.size() == 1) {
			return segments.get(0);
		}
		StringBuilder buffer = new StringBuilder();
		for (String segment : segments) {
			if (buffer.length() > 0) {
				buffer.append("/");
			}
			buffer.append(segment);
		}
		return buffer.toString();
	}
	
	//

	protected void applyRules(PathRule<?> rule, EmfsResource emfsResource, boolean applyContainers, EList<String> tags, EList<Property> properties) {
		if (applyContainers) {
			if (rule.eContainer() instanceof ImportRule) {
				applyRules((PathRule<?>) rule.eContainer(), emfsResource, applyContainers, tags, properties);
			}
		}
		for (TagsRule tagsRule : rule.getTags()) {
			applyRule(tagsRule, emfsResource, tags);
		}
		for (PropertiesRule propertiesRule : rule.getProperties()) {
			applyRule(propertiesRule, emfsResource, properties);
		}
	}

	protected void applyRule(TagsRule tagsRule, EmfsResource emfsResource, EList<String> tags) {
		if (tagsRule.getCondition().accept(emfsResource)) {
			tags.addAll(tagsRule.getTags());
		}
	}
	
	protected void applyRule(PropertiesRule propertiesRule, EmfsResource emfsResource, EList<Property> properties) {
		if (propertiesRule.getCondition().accept(emfsResource)) {
			properties.addAll(EcoreUtil.copyAll(propertiesRule.getProperties()));
		}
	}

	//
	
	private IContainer rootContainer;

	public void setRootContainer(IContainer rootContainer) {
		this.rootContainer = rootContainer;
	}

	public IContainer getRootContainer() {
		return rootContainer != null ? rootContainer : ResourcesPlugin.getWorkspace().getRoot();
	}

	protected IPath getRootPath() {
		return getRootContainer().getFullPath();
	}

	//

	protected IPath getTargetPath(IPath path, PathRule<?> rule) {
		String pathString = path.toString();
		while (rule != null) {
			if (rule.getTargetPath() != null) {
				String rulePath = rule.getFullPath();
				if (pathString.startsWith(rulePath)) {
					return new Path(buildPath(rule.getTargetPath()) + pathString.substring(rulePath.length()));
				}
			}
			if (! (rule.eContainer() instanceof PathRule<?>)) {
				return path;
			}
			rule = (PathRule<?>) rule.eContainer();
		}
		return path;
	}
}
