package no.hal.jex.ui;

import java.io.StringBufferInputStream;

import no.hal.jex.resource.JexResource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class JexLogWriter {

	public final static String logExtension = "log";

	private boolean writing = false;
	
	public boolean isWriting() {
		return writing;
	}

	public static URI getLogURI(Resource resource) {
		return resource.getURI().appendFileExtension(logExtension);
	}
	
	public void appendToLog(Resource resource, String content) {
		URI logUri = getLogURI(resource);
		IResource iRes = JexResource.getIResource(logUri, true);
		IFile file = null;
		if (iRes instanceof IFolder) {
			file = ((IFolder)iRes).getFile(logUri.lastSegment());
		} else if (iRes instanceof IFile) {
			file = (IFile)iRes;
		}
		if (file != null) {
			try {
				writing = true;
				StringBufferInputStream inputStream = new StringBufferInputStream(content);
				if ( ! file.exists()) {
					file.create(inputStream, false, null);
				} else {
					file.appendContents(inputStream, false, false, null);
				}
			} catch (Exception e) {
			} finally {
				writing = false;
			}
		}
	}

	public void log(EObject eo, String key, Object value, int intValue) {
		Resource res = eo.eResource();
		String entry = element("eObjectEntry", new String[]{ 
				attribute("timestamp", new Long(System.currentTimeMillis())),
				attribute("resUri", res.getURI()),
				attribute("fragmentId", res.getURIFragment(eo)),
				attribute("key", key),
				attribute("value", value),
		});
		appendToLog(res, entry);
	}

	public void log(Resource res, String key, Object value, int intValue) {
		String entry = element("eResourceEntry", new String[]{ 
					attribute("timestamp", new Long(System.currentTimeMillis())),
					attribute("resUri", res.getURI()),
					attribute("key", key),
					attribute("value", value),
		});
		appendToLog(res, entry);
	}

	private String newline = "\r\n";
	
	private String element(String name, String[] attributes) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<");
		buffer.append(name);
		buffer.append(" ");
		for (int i = 0; i < attributes.length; i++) {
			buffer.append(attributes[i]);
		}
		buffer.append("/>");
		buffer.append(newline);
		return buffer.toString();
	}

	private String attribute(String name, Object value) {
		return " " + name + "='" + value + "'";
	}
}
