package no.hal.sharing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import no.hal.emfs.ByteArrayContentProvider;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.exporter.Exporter;
import no.hal.emfs.sync.ExportRule;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.sync.RelativePath;
import no.hal.emfs.sync.SyncFactory;
import no.hal.sharing.util.Util;

public class SharedResourceReceiver {

	public boolean receiveResource(SharedResource resource) {
		byte[] bytes = resource.getContents();
		IPath path = resource.getPath();
		int receivedCount = 0;
		if (path != null && path.segmentCount() > 1) {
			EmfsResource emfsResource = null;
			EmfsContainer container = null;
			for (int i = 0; i < path.segmentCount() - 1; i++) {
				EmfsContainer cont = EmfsFactory.eINSTANCE.createEmfsContainer();
				cont.setName(path.segment(i));
				if (container != null) {
					container.getResources().add(cont);
				}
				container = cont;
				if (emfsResource == null) {
					emfsResource = container;
				}
			}
			EmfsFile emfsFile = EmfsFactory.eINSTANCE.createEmfsFile();
			emfsFile.setName(path.lastSegment());
			ByteArrayContentProvider contentProvider = EmfsFactory.eINSTANCE.createByteArrayContentProvider();
			contentProvider.setByteContents(bytes);
			emfsFile.setContentProvider(contentProvider);
			if (container != null) {
				container.getResources().add(emfsFile);
			} else {
				emfsResource = emfsFile;
			}
			receivedCount = receiveEmfResource(resource, emfsResource);
		} else {
			ResourceSet resourceSet = Util.fromByteArray(path.lastSegment(), bytes);
			if (resourceSet != null) {
				Collection<EObject> emfsResources = new ArrayList<EObject>();
				for (Resource emfResource : resourceSet.getResources()) {
					emfsResources.addAll(emfResource.getContents());
				}
				if (emfsResources.size() > 0) {
					receivedCount = receiveEmfResource(resource, emfsResources);			
				}
			}
		}
		return receivedCount > 0;
	}

	protected int receiveEmfResource(SharedResource resource, EObject... emfsResources) {
		return receiveEmfResource(resource, Arrays.asList(emfsResources));
	}

	protected int receiveEmfResource(SharedResource resource, Collection<EObject> emfResources) {
		ExportSpec exportSpec = SyncFactory.eINSTANCE.createExportSpec();
		for (EObject eObject : emfResources) {
			if (eObject instanceof EmfsResource) {
				exportSpec.getResources().add((EmfsResource) eObject);
			}
		}
		ExportRule rule = SyncFactory.eINSTANCE.createExportRule();
		RelativePath rulePath = SyncFactory.eINSTANCE.createRelativePath();
		rulePath.getSegments().add("");
		rule.setPath(rulePath);
		exportSpec.getRules().add(rule);
		Exporter exporter = new Exporter(exportSpec);
		return exporter.exportResources(null);
	}
}
