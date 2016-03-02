package no.hal.emfs.importer;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.emf.common.util.EList;

import no.hal.emfs.ByteArrayContentProvider;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.util.AbstractPorter;
import no.hal.emfs.util.EmfsResourceImpl;
import no.hal.emfs.util.PropertyResolver;
import no.hal.emfs.util.Util;

public class Importer extends AbstractPorter<ImportRule> {

	public Importer(ImportSpec spec) {
		super(spec);
	}

	public void addRootContainer(EmfsContainer rootEmfsContainer) {
		EList<EmfsResource> resources = rootEmfsContainer.eResource() != null ? this.spec.getResourceRefs() : this.spec.getResources();
		resources.add(rootEmfsContainer);
	}
	
	private boolean mergeEmfsResources = true;

	public void importResources() {
		for (ImportRule importRule : getRules()) {
			IPath path = new Path(importRule.getFullPath());
			IResource resource = getRootContainer().findMember(path);
			if (resource != null) {
				importResources(resource);
			}
		}
	}

	public void importResources(IResource resource) {
		importResources(resource, null);
	}

	public boolean appliesTo(IResource resource) {
		ImportRule rule = findMostSpecificRule(getRules(), resource.getFullPath(), getRootPath().segmentCount());
		return rule != null;
	}
	
	protected void importResources(IResource resource, Collection<EmfsResource> emfsResources) {
		IPath fullPath = resource.getFullPath();
		ImportRule rule = findMostSpecificRule(getRules(), fullPath, getRootPath().segmentCount());
		EmfsResource emfsResource = null;
		if (rule != null && isIncluding(rule)) {
			IPath path = getTargetPath(fullPath, rule);
			if (emfsResources == null) {
				emfsResources = ensureEmfsContainer(path);
			}
			if (resource instanceof IFolder) {
				emfsResource = EmfsFactory.eINSTANCE.createEmfsContainer();
			} else if (resource instanceof IFile) {
				emfsResource = EmfsFactory.eINSTANCE.createEmfsFile();
			} else {
				return;
			}
			String resourceName = path.lastSegment();
			emfsResource.setName(resourceName);
			EmfsResource existing = EmfsResourceImpl.getEmfsResource1(emfsResources, resourceName);
			if (existing != null) {
				if (mergeEmfsResources && emfsResource.eClass().isSuperTypeOf(existing.eClass())) {
					emfsResource = existing;
				} else {
					return;
				}
			}
			initResource(emfsResource, resource);
			applyRules(rule, emfsResource, true);
			emfsResources.add(emfsResource);
		}
		if (resource instanceof IContainer) {
			try {
				for (IResource childResource : ((IContainer) resource).members()) {
					importResources(childResource,  (emfsResource instanceof EmfsContainer ? ((EmfsContainer) emfsResource).getResources() : null));
				}
			} catch (CoreException e) {
			}
		}
	}

	private EmfsContainer findRootEmfsContainer(String name) {
		for (EmfsResource resource : spec.getResources()) {
			if (resource instanceof EmfsContainer && name.equals(resource.getName())) {
				return (EmfsContainer) resource;
			}
		}
		for (EmfsResource resource : spec.getResourceRefs()) {
			if (resource instanceof EmfsContainer && name.equals(resource.getName())) {
				return (EmfsContainer) resource;
			}
		}
		return null;
	}
	
	protected Collection<EmfsResource> ensureEmfsContainer(IPath path) {
		String[] segments = path.segments();
		EmfsContainer rootEmfsContainer = findRootEmfsContainer(segments[0]);
		if (rootEmfsContainer != null) {
			return EmfsResourceImpl.ensureEmfsContainer(rootEmfsContainer.getResources(), segments, 1, -1, false);
		}
		return EmfsResourceImpl.ensureEmfsContainer(spec.getResources(), segments, 0, -1, false);
	}

	protected final PropertyResolver propertyResolver = new PropertyResolver(false, false);
	
	protected void initResource(EmfsResource emfsResource, IResource resource) {
		if (emfsResource instanceof EmfsFile && resource instanceof IFile) {
			IContentType contentType = importFileContent((EmfsFile) emfsResource, (IFile) resource);
			if (contentType != null) {
				Util.setProperty(emfsResource, IContentType.class.getName(), contentType.getName(), propertyResolver);
			}
		}
		Util.setProperty(emfsResource, IResource.class.getName(), resource.getClass().getName(), propertyResolver);
	}

	protected IContentType importFileContent(EmfsFile emfsFile, IFile file) {
		IContentType contentType = null;
		IContentTypeManager contentTypeManager = Platform.getContentTypeManager();
		try {
			InputStream input = file.getContents();
			contentType = contentTypeManager.findContentTypeFor(input, file.getName());
			input.close();
		} catch (CoreException e) {
		} catch (IOException e) {
		}
		if (contentType != null && contentType.isKindOf(contentTypeManager.getContentType(IContentTypeManager.CT_TEXT))) {
			importTextContents(emfsFile, file);
		} else {
			importBinaryContents(emfsFile, file);
		}
		return contentType;
	}

	protected void importTextContents(EmfsFile emfsFile, IFile file) {
		StringBuilder buffer = new StringBuilder();
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(file.getContents()));
			String line = null;
			while ((line = input.readLine()) != null) {
				buffer.append(line);
				buffer.append("\n");
			}
		} catch (CoreException e) {
		} catch (IOException e) {
		}
		String contents = buffer.toString();
		updateFileContentProvider(emfsFile, contents);
	}

	protected void updateFileContentProvider(EmfsFile emfsFile, String contents) {
		if (emfsFile.getContentProvider() instanceof StringContentProvider) {				
			((StringContentProvider) emfsFile.getContentProvider()).setStringContent(contents);
		} else {
			StringContentProvider contentProvider = EmfsFactory.eINSTANCE.createStringContentProvider();
			contentProvider.setStringContent(contents);
			emfsFile.setContentProvider(contentProvider);
		}
	}

	protected void importBinaryContents(EmfsFile emfsFile, IFile file) {
		ByteArrayOutputStream buffer = null;
		byte[] byteArray = new byte[2048];
		int offset = 0;
		try {
			InputStream input = file.getContents();
			int len = 0;
			while ((len = input.read(byteArray, offset, byteArray.length - offset)) > 0) {
				if (offset + len == byteArray.length) {
					if (buffer == null) {
						buffer = new ByteArrayOutputStream();
						buffer.write(byteArray, 0, offset + len);
					}
					offset = 0;
					len = 0;
				}
				offset += len;
			}
		} catch (CoreException e) {
		} catch (IOException e) {
		}
		if (offset > 0) {
			if (buffer != null) {
				buffer.write(byteArray, 0, offset);
				byteArray = buffer.toByteArray();
			} else {
				byte[] newByteArray = new byte[offset];
				System.arraycopy(byteArray, 0, newByteArray, 0, offset);
				byteArray = newByteArray;
			}
		}
		updateFileContentProvider(emfsFile, byteArray);
	}

	protected void updateFileContentProvider(EmfsFile emfsFile, byte[] byteArray) {
		if (emfsFile.getContentProvider() instanceof ByteArrayContentProvider) {				
			((ByteArrayContentProvider) emfsFile.getContentProvider()).setByteContents(byteArray);
		} else {
			ByteArrayContentProvider contentProvider = EmfsFactory.eINSTANCE.createByteArrayContentProvider();
			contentProvider.setByteContents(byteArray);
			emfsFile.setContentProvider(contentProvider);
		}
	}

	protected void applyRules(ImportRule rule, EmfsResource emfsResource, boolean applyContainers) {
		applyRules(rule, emfsResource, applyContainers, emfsResource.getTags(), emfsResource.getProperties());
	}
}
