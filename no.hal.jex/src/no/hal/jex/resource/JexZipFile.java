package no.hal.jex.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.zip.ZipOutputStream;

import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.TestRunnable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.JavaModelException;

public class JexZipFile extends Job {

	private JexResource jexRes;
	
	private URIConverter uriConverter = null;
	protected URI zipUri;

	private List files;
	
    public JexZipFile(JexResource jexRes, String jobtitle) {
        super(jobtitle);
        this.jexRes = jexRes;
        this.files = new ArrayList();
    }

    public JexZipFile(JexResource jexRes) {
    	this(jexRes, "Create zip");
    }
	
	public void addFile(IJavaElement javaElement) {
		files.add(javaElement);
	}
	public void addFile(IResource res) {
		files.add(res);
	}

	public void addClasses(Boolean testLogic) {
		IJavaProject javaProject = JexResource.getJavaProject(jexRes);
		TreeIterator it = jexRes.getAllContents();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof JavaClass) {
				it.prune();
				if (testLogic == null || (testLogic.booleanValue() == (o instanceof TestRunnable))) {
					JavaElement element = (JavaElement)o;
					IJavaElement javaElement = element.findJavaCoreElement(javaProject);
					addFile(javaElement);
				}
			}
		}
	}

	private String resourceFolder;
	
	public void setResourceFolder(String resourceFolder) {
		this.resourceFolder = resourceFolder;
	}

	protected boolean isResourceClass(JavaClass javaClass) {
		IJavaProject javaProject = JexResource.getJavaProject(jexRes);
		IProject project = javaProject.getProject();
		IResource res = null;
		try {
			IMember javaElement = (IMember)javaClass.findJavaCoreElement(javaProject);
			if (javaElement != null) {
				res = javaElement.getCompilationUnit().getCorrespondingResource();
			}
		} catch (JavaModelException e) {
			return false;
		}
		String relativePath = res.getFullPath().toString().substring(project.getFullPath().toString().length() + 1);
		return relativePath.startsWith(resourceFolder + Path.SEPARATOR);
	}
	
	public void addResources() {
		IJavaProject javaProject = JexResource.getJavaProject(jexRes);
		TreeIterator it = jexRes.getAllContents();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof JavaClass) {
				it.prune();
				JavaClass javaClass = (JavaClass)o;
				if (isResourceClass(javaClass)) {
					addFile(getJavaElementResource(javaClass.findJavaCoreElement(javaProject)));
				}
			}
		}
	}
	
	private URIConverter getUriConverter() {
		if (uriConverter == null) {
			uriConverter = new ExtensibleURIConverterImpl();
		}
		return uriConverter;
	}

	protected void prepare(Object file, List files, List iFiles) throws Exception {
		if (file instanceof IJavaElement) {
			prepare((IJavaElement)file, files, iFiles);
		} else if (file instanceof IResource) {
			prepare((IResource)file, files, iFiles);
		}
	}

	protected IResource getJavaElementResource(IJavaElement javaElement) {
		if (javaElement instanceof IMember) {
			javaElement = ((IMember)javaElement).getCompilationUnit();
		}
		IResource res = null;
		try {
			res = ((IJavaElement)javaElement).getCorrespondingResource();
		} catch (JavaModelException e) {
		}
		return res;
	}
	
	private Object prepare(IJavaElement file, List files, List iFiles) throws Exception {
		IResource res = getJavaElementResource(file);
		if (! files.contains(res)) {
			files.add(res);
		}
		return file;
	}

	protected void prepare(IResource file, List files, List iFiles) throws Exception {
		if (file instanceof IParent) {
			prepare((IParent)file, files, iFiles);
		} else if (file instanceof IFile) {
			prepare((IFile)file, files, iFiles);
		}
	}
	protected void prepare(IParent parent, List files, List iFiles) throws Exception {
		IJavaElement[] children = parent.getChildren();
		files.addAll(Arrays.asList(children));
	}
	
	private String[] includeFiles = {".+\\..+"};

	public void setIncludeFiles(String[] includeFiles) {
		this.includeFiles = includeFiles;
	}
	
	private String[] excludeFiles = {};

	public void setExcludeFiles(String[] excludeFiles) {
		this.excludeFiles = excludeFiles;
	}
	
	private boolean findFile(String[] patterns, String name) {
		for (int i = 0; i < patterns.length; i++) {
			if (name.matches(patterns[i])) {
				return true;
			}
		}
		return false;
	}
	
	protected void prepare(IFile file, List files, List iFiles) throws Exception {
		if (file.exists() && (! iFiles.contains(file))) {
			if (findFile(includeFiles, file.getName()) && (! findFile(excludeFiles, file.getName()))) {
				iFiles.add(file);
			}
			if ("java".equals(file.getFileExtension()) && addClassFiles) {
				IJavaProject project = JexResource.getJavaProject(jexRes);
				IPath binFolder = project.getOutputLocation();
				IPath classPath = binFolder.append(file.getFullPath().removeFirstSegments(binFolder.segmentCount())).removeFileExtension().addFileExtension("class");
				IFile classFile = file.getWorkspace().getRoot().getFile(classPath);
				prepare(classFile, files, iFiles);
			}
		}
	}
	
	public boolean prepare() {
		this.zipUri = jexRes.getURI().trimFileExtension().appendFileExtension("zip");
		List iFiles = new ArrayList();
		for (int i = 0; i < files.size(); i++) {
			try {
				prepare(files.get(i), files, iFiles);
			} catch (Exception e) {
				return false;
			}
		}
		files = iFiles;
		return true;
	}

	protected OutputStream createZipOutputStream() throws IOException {
		return getUriConverter().createOutputStream(zipUri);
	}
	
	private String[] jexRelatedFiles = {};

	public void setJexRelatedFiles(String[] jexRelatedFiles) {
		this.jexRelatedFiles = jexRelatedFiles;
	}

	protected int getTaskCount() {
		// jexercise file + one work item pr. file
		return jexRelatedFiles.length / 2 + files.size();
	}

	protected void postProcessZipOutputStream(ZipOutputStream zipOutputStream, OutputStream subOutputStream, IProgressMonitor progress) throws Exception {
		zipOutputStream.close();
	}

	private boolean addClassFiles = false;

	public void setAddClassFiles(boolean addClassFiles) {
		this.addClassFiles = addClassFiles;
	}

	public IStatus run(IProgressMonitor progress) {
		progress.beginTask("Create zip", getTaskCount());
		try {
			progress.subTask("Create zip @ " + zipUri);
			OutputStream zipOutputStream = createZipOutputStream();
			ZipOutputStream out = new ZipOutputStream(zipOutputStream);
			progress.worked(1);

			Object[] formatArgs = new Object[] {
					jexRes.getURI().trimSegments(1).toString(),
					jexRes.getURI().trimFileExtension().lastSegment(),
			};
			for (int i = 0; i < jexRelatedFiles.length; i += 2) {
				String name = MessageFormat.format(jexRelatedFiles[i], formatArgs);
				URI relatedUri = URI.createURI(name); 
				if (jexRelatedFiles[i + 1] != null) {
					name = MessageFormat.format(jexRelatedFiles[i + 1], formatArgs);
				}
				URI nameURI = URI.createURI(name);
				if (nameURI.isPlatformResource()) {
					name = nameURI.toPlatformString(false);
				}
				if (name.startsWith("/")) {
					int start = 1;
					String projectPath = JexResource.getJavaProject(jexRes).getPath().toString();
					if (name.startsWith(projectPath)) {
						start += projectPath.length();
					}
					name = name.substring(start);
				}
				// remove project name prefix and /
				progress.subTask("Add " + name);
				addJarFile(name, getUriConverter().createInputStream(relatedUri), out);
				progress.worked(1);
			}
			String name = null;
			for (int i = 0; i < files.size(); i++) {
				Object file = files.get(i);
				if (file instanceof String) {
					name = (String)file;
					progress.worked(1);
				} else {
					addJarFile(file, name, out, progress);
					name = null;
				}
			}
			postProcessZipOutputStream(out, zipOutputStream, progress);
		} catch (Exception ex) {
			return new Status(IStatus.ERROR, "jex.emf", ex.getMessage());
		}
		return Status.OK_STATUS;
	}

	private static int BUFFER_SIZE = 10240;
	private byte buffer[] = new byte[BUFFER_SIZE];

	private String[] renamePatterns = {};
	
	public void setRenamePatterns(String[] renamePatterns) {
		this.renamePatterns = renamePatterns;
	}

	private void addJarFile(Object file, String name, ZipOutputStream out, IProgressMonitor progress) throws CoreException, IOException, FileNotFoundException {
		InputStream in = null;
		if (file instanceof IFile) {
			if (name == null) {
				name = ((IFile)file).getProjectRelativePath().toString();
			}
			in = ((IFile)file).getContents();
		} else if (file instanceof File) {
			if (name == null) {
				name = ((File)file).getCanonicalPath();
			}
			in = new FileInputStream((File)file);
		} else if (file instanceof java.net.URI) {
			if (name == null) {
				name = ((java.net.URI)file).toString();
			}
			URI inUri = URI.createURI(name);
			in = uriConverter.createInputStream(inUri);
		}
		String zipName = name;
		for (int i = 0; i < renamePatterns.length; i += 2) {
			zipName = zipName.replaceAll(renamePatterns[i], renamePatterns[i + 1]);
		}
		progress.subTask("Add " + name + " as " + zipName);
		addJarFile(zipName, in, out);
		progress.worked(1);
	}

	private void addJarFile(String name, InputStream in, ZipOutputStream out) throws IOException {
		if (in != null && name != null) {
			// Add archive entry
			JarEntry jarAdd = new JarEntry(name);
			out.putNextEntry(jarAdd);
			copyStream(in, out);
		}
	}

	protected void copyStream(InputStream in, OutputStream out) throws IOException {
		for  (int len; (len = in.read(buffer, 0, buffer.length)) >= 0; out.write(buffer, 0, len));
		in.close();
	}
}
