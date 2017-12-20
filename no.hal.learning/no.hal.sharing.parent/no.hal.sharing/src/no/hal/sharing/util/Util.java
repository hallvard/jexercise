package no.hal.sharing.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Util {

	private static long startTime = System.currentTimeMillis();

	public static void log(Object context, String id, int status, String message, Throwable e) {
		String prefix = "";
		switch (status) {
		case Status.INFO: 		prefix = "INFO"; break;
		case Status.WARNING: 	prefix = "WARNING"; break;
		case Status.ERROR: 		prefix = "ERROR"; break;
		case Status.OK: 		prefix = "OK"; break;
		default:
			break;
		}
		PrintStream out = System.out;
		if (status > Status.INFO) {
			out = System.err;
		}
		String output = (context != null ? context.getClass().getSimpleName() : "");
		if (id != null) {
			output += "#" + id;
		}
		output += ": " + prefix + " @" + (System.currentTimeMillis() - startTime);
		if (message != null) {
			output = output + ": " + message;
		}
		if (e != null) {
			output = output + " (" + e + ")"; 
		}
		out.println(output);
	}
	
	public static byte[] toByteArray(Collection<Resource> resources, Map<?, ?> saveOptions) {
		ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
		OutputStream output = new ZipOutputStream(byteOutput);
		try {
			for (Resource resource : resources) {
				if (output instanceof ZipOutputStream) {
					ZipOutputStream zipOutput = (ZipOutputStream) output;
					ZipEntry entry = new ZipEntry(resource.getURI().lastSegment()); 
					zipOutput.putNextEntry(entry);
					resource.save(zipOutput, saveOptions);
					zipOutput.closeEntry();
				} else {
					resource.save(output, saveOptions);
				}
			}
			output.close();
			byteOutput.close();
		} catch (IOException e) {
			return null;
		}
		return byteOutput.toByteArray();
	}

	public static ResourceSet fromByteArray(String name, byte[] bytes) {
		ResourceSet resourceSet = new ResourceSetImpl();
		ByteArrayInputStream byteInput = new ByteArrayInputStream(bytes);
		final boolean[] close = new boolean[]{false};
		InputStream input = (name.endsWith(".zip") ? new ZipInputStream(byteInput) {
			@Override
			public void close() throws IOException {
				// avoid closing it prematurely
				if (close[0]) {
					super.close();
				}
			}
		} : new ByteArrayInputStream(bytes));
		Resource resource = null;
		try {
			ZipEntry entry = null;
			while (resourceSet.getResources().size() == 0 || input instanceof ZipInputStream) {
				if (input instanceof ZipInputStream && ((entry = ((ZipInputStream) input).getNextEntry()) == null)) {
					break;
				}
				URI uri = URI.createURI(entry != null ? entry.getName() : name);
				resource = resourceSet.createResource(uri);
				close[0] = false;
				resource.load(input, null);
				resourceSet.getResources().add(resource);
				close[0] = true;
			}
		} catch (IOException e) {
			// remove resource than couldn't be loaded
			if (resource != null) {
				resourceSet.getResources().remove(resource);
			}
		} finally {
			try {
				input.close();
				byteInput.close();
			} catch (IOException e) {
			}
		}
		return (resourceSet.getResources().isEmpty() ? null : resourceSet);
	}
}
