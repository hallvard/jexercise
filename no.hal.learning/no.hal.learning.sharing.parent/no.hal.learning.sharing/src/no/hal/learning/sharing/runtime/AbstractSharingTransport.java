package no.hal.learning.sharing.runtime;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.ShareEdits;
import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.SharingPackage;

public abstract class AbstractSharingTransport implements SharingTransport {

	private Collection<Subscriber> subscribers = new ArrayList<SharingTransport.Subscriber>();
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	protected void fireReceived(AbstractShare share) {
		for (Subscriber subscriber : subscribers) {
			subscriber.receivedShare(share);
		}
	}
	
	protected byte[] toByteArray(AbstractShare share) {
		if (share instanceof ShareModel) {
			return toByteArray((ShareModel) share);
		} else if (share instanceof ShareEdits) {
			return toByteArray((ShareEdits) share);
		}
		return null;
	}
	
	protected byte[] toByteArray(ShareModel shareModel) {
		Collection<EObject> eObjects = new ArrayList<EObject>(shareModel.getEObjects());
		eObjects.add(shareModel);
		Collection<Resource> resources = getResources(eObjects);
		return toByteArray(resources);
	}

	protected byte[] toByteArray(ShareEdits shareEdits) {
		return toByteArray(Arrays.asList(shareEdits.eResource()));
	}

	protected Collection<Resource> getResources(Collection<EObject> eObjects) {
		Collection<Resource> resources = new ArrayList<Resource>();
		for (EObject eObject : eObjects) {
			Resource resource = eObject.eResource();
			if ((resource != null) && (! resources.contains(resource))) {
				resources.add(resource);
			}
		}
		return resources;
	}

	protected byte[] toByteArray(Collection<Resource> resources) {
		ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
		OutputStream output = new ZipOutputStream(byteOutput);
		try {
			for (Resource resource : resources) {
				if (output instanceof ZipOutputStream) {
					addResourceEntry(resource, (ZipOutputStream) output);
				} else {
					resource.save(output, null);
				}
			}
			output.close();
			byteOutput.close();
		} catch (IOException e) {
			return null;
		}
		return byteOutput.toByteArray();
	}
	
	protected void addResourceEntry(Resource resource, ZipOutputStream zipOutput) throws IOException {
		ZipEntry entry = new ZipEntry(resource.getURI().lastSegment()); 
		zipOutput.putNextEntry(entry);
		resource.save(zipOutput, null);
		zipOutput.closeEntry();
	}

	protected AbstractShare fromByteArray(String name, byte[] bytes) {
		AbstractShare share = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		ByteArrayInputStream byteInput = new ByteArrayInputStream(bytes);
		final boolean[] close = new boolean[]{false};
		InputStream input = new ZipInputStream(byteInput) {
			@Override
			public void close() throws IOException {
				// avoid closing it prematurely
				if (close[0]) {
					super.close();
				}
			}
		};
		try {
			ZipEntry entry = null;
			while (resourceSet.getResources().size() == 0 || input instanceof ZipInputStream) {
				if (input instanceof ZipInputStream && ((entry = ((ZipInputStream) input).getNextEntry()) == null)) {
					break;
				}
				URI uri = URI.createURI(entry != null ? entry.getName() : name);
				Resource resource = resourceSet.createResource(uri);
				close[0] = false;
				resource.load(input, null);
				resourceSet.getResources().add(resource);
				close[0] = true;
				if (share == null) {
					share = (AbstractShare) EcoreUtil.getObjectByType(resource.getContents(), SharingPackage.eINSTANCE.getAbstractShare());
				}
			}
		} catch (IOException e) {
		} finally {
			try {
				input.close();
				byteInput.close();
			} catch (IOException e) {
			}
		}
		return share;
	}
}
