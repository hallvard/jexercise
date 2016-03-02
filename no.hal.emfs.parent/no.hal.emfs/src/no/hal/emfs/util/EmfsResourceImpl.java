/**
 */
package no.hal.emfs.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsResource;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.util.EmfsResourceFactoryImpl
 * @generated
 */
public class EmfsResourceImpl extends XMIResourceImpl {

	public static final String EMFS_SCHEME = "emfs";

	@Override
	public EObject getEObject(String uriFragment) {
		EmfsResource emfsResource = getEmfsResource(this, uriFragment);
		if (emfsResource != null) {
			return emfsResource;
		}
		return super.getEObject(uriFragment);
	}

	public static EmfsResource getEmfsResource(Resource resource, String uriFragment) {
		return getEmfsResource(resource.getContents(), uriFragment, 0);
	}

	public static EmfsResource getEmfsResource(Iterable<? extends EObject> emfsResources, String path, int endSegment) {
		return getEmfsResource(emfsResources, path.split(String.valueOf(IPath.SEPARATOR)), endSegment);
	}
	
	public static EmfsResource getEmfsResource(Iterable<? extends EObject> emfsResources, String[] segments, int endSegment) {
		int end = (endSegment <= 0 ? segments.length + endSegment : endSegment);
		EmfsResource emfsResource = null;
		for (int i = 0; i < end; i++) {
			String segment = segments[i];
			if (segment.length() == 0) {
				continue;
			}
			emfsResource = getEmfsResource1(emfsResources, segment);
			if (emfsResource == null) {
				return null;
			}
			if (emfsResource instanceof EmfsContainer) {
				emfsResources = ((EmfsContainer) emfsResource).getResources();
			}
		}
		return emfsResource;
	}

	public static EmfsResource getEmfsResource1(Iterable<? extends EObject> emfsResources, String segment, String... tags) {
		for (EObject child : emfsResources) {
			if (child instanceof EmfsResource) {
				EmfsResource emfsResource = (EmfsResource) child;
				String name = emfsResource.getName();
				if (name == null && emfsResource instanceof EmfsContainer) {
					emfsResource = getEmfsResource1(((EmfsContainer) emfsResource).getResources(), segment);
					if (emfsResource != null) {
						return emfsResource;
					}
				} else if (segment.equals(name) && Util.hasTags(emfsResource, tags)) {
					return emfsResource;
				}
			}
		}
		return null; // throw new IllegalStateException("Couldn't find " + segment + " child of " + this);
	}
	
	public static EmfsResource getEmfsResource(EmfsContainer container, String segment) {
		return getEmfsResource1(container.getResources(), segment);
	}

	public static boolean changedSinceLoaded(Resource resource) {
		long loadTime = resource.getTimeStamp();
		URI uri = resource.getURI();
		URIConverter uriConverter = resource.getResourceSet().getURIConverter();
		Object lastModified = uriConverter.getURIHandler(uri).getAttributes(uri, Collections.EMPTY_MAP).get(URIConverter.ATTRIBUTE_TIME_STAMP);
		boolean result = (lastModified instanceof Number && ((Number) lastModified).longValue() > loadTime);
		if (result) {
			System.out.println(loadTime + " < " + lastModified);
		}
		return result;
	}

	public static boolean hasTags(EmfsResource emfsResource, EList<String> otherTags) {
		EList<String> tags = emfsResource.getTags();
		for (String tag : otherTags) {
			if (! tags.contains(tag)) {
				return false;
			}
		}
		return true;
	}

	public static boolean sameTags(EmfsResource emfsResource, EmfsResource otherResource) {
		return hasTags(emfsResource, otherResource.getTags()) && hasTags(otherResource, emfsResource.getTags());
	}
	
	private static EmfsResource findSameResource(EmfsResource emfsResource, Iterable<? extends EObject> otherResources, boolean sameTags) {
		String name = emfsResource.getName();
		for (EObject child : otherResources) {
			if (child instanceof EmfsResource) {
				EmfsResource other = (EmfsResource) child;
				if (name == null && emfsResource instanceof EmfsContainer) {
					other = findSameResource(emfsResource, ((EmfsContainer) emfsResource).getResources(), sameTags);
					if (other != null) {
						return other;
					}
				} else if (name.equals(other.getName()) && ((! sameTags) || sameTags(emfsResource, other))) {
					return other;
				}
			}
		}
		return null; // throw new IllegalStateException("Couldn't find " + segment + " child of " + this);
	}

	public static boolean mergeInto(EmfsResource emfsResource, Resource resource, boolean sameTags) {
		EmfsResource alias = findSameResource(emfsResource, resource.getContents(), sameTags);
		if (mergeInto(emfsResource, alias, sameTags)) {
			return true;
		}
		resource.getContents().add(emfsResource);
		return false;
	}
	
	public static boolean mergeInto(EmfsResource emfsResource, Collection<EmfsResource> emfsResources, boolean sameTags) {
		EmfsResource alias = findSameResource(emfsResource, emfsResources, sameTags);
		if (mergeInto(emfsResource, alias, sameTags)) {
			return true;
		}
		emfsResources.add(emfsResource);
		return false;
	}
	
	public static boolean mergeInto(EmfsResource emfsResource, EmfsResource other, boolean sameTags) {
		if (other != null && emfsResource.getName().equals(other.getName()) && ((! sameTags) || sameTags(emfsResource, other))) {
			if (emfsResource instanceof EmfsContainer && other instanceof EmfsContainer) {
				Collection<EmfsResource> otherChildren = ((EmfsContainer) other).getResources();
				EList<EmfsResource> children = ((EmfsContainer) emfsResource).getResources();
				int i = 0;
				while (i < children.size()) {
					if (mergeInto(children.get(i), otherChildren, sameTags)) {
						i++;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public static Collection<EmfsResource> ensureEmfsContainer(Collection<EmfsResource> emfsResources, String[] segments, int start, int end, boolean requireTags, String... tags) {
		Collection<String> tagList = Arrays.asList(tags);
		int i = start;
		if (end <= 0) {
			end = segments.length + end;
		}
		while (i < end) {
			String segment = segments[i];
			EmfsResource child = (requireTags ? getEmfsResource1(emfsResources, segment, tags) : getEmfsResource1(emfsResources, segment));
			if (! (child instanceof EmfsContainer)) {
				break;
			}
			if (! requireTags) {
				child.getTags().addAll(tagList);
			}
			emfsResources = ((EmfsContainer) child).getResources();
			i++;
		}
		while (i < end) {
			String segment = segments[i];
			EmfsContainer child = EmfsFactory.eINSTANCE.createEmfsContainer();
			emfsResources.add(child);
			child.setName(segment);
			child.getTags().addAll(tagList);
			emfsResources = child.getResources();
			i++;
		}
		return emfsResources;
	}

	public static boolean mergeInto(EmfsResource emfsResource, Collection<EmfsResource> emfsResources, String[] segments, int start, int end, boolean requireTags, String... tags) {
		int origSize = emfsResources.size();
		Collection<EmfsResource> containerResources = (segments != null ? ensureEmfsContainer(emfsResources, segments, start, end, requireTags, tags) : emfsResources);
		containerResources.add(emfsResource);
		return emfsResources.size() == origSize;
	}

	@Override
	public String getURIFragment(EObject eObject) {
		if (eObject instanceof EmfsResource) {
			return getFullPathString((EmfsResource) eObject);
		}
		return super.getURIFragment(eObject);
	}

	public static String getFullString(EmfsResource emfsResource, Object prefix, Object separator, Object suffix) {
		StringBuilder buffer = new StringBuilder();
		while (emfsResource != null) {
			String name = emfsResource.getName();
			// skip resources without a name
			if (name != null) {
				if (buffer.length() == 0 && suffix != null) {
					buffer.insert(0, suffix);
				} else if (buffer.length() > 0 && separator != null) {
					buffer.insert(0, separator);
				}
				buffer.insert(0, name);
			}
			emfsResource = emfsResource.getContainer();
		}
		if (prefix != null) {
			buffer.insert(0, prefix);
		}
		return buffer.toString();
	}
	
	public static String getFullPathString(EmfsResource emfsResource) {
		return getFullString(emfsResource, IPath.SEPARATOR, IPath.SEPARATOR, null);
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public EmfsResourceImpl(URI uri) {
		super(uri);
	}

} //EmfsResourceImpl
