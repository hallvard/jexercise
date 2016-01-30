package no.hal.learning.sharing.tests.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.xtext.XemfsStandaloneSetup;
import no.hal.learning.sharing.AbstractModelEdit;
import no.hal.learning.sharing.ModelEdit;
import no.hal.learning.sharing.SharingPackage;

public class TestHelper {

	public TestHelper() {
		EPackage.Registry.INSTANCE.put(SharingPackage.eNS_URI, SharingPackage.eINSTANCE);
		XemfsStandaloneSetup.doSetup();
	}

	public EmfsResource loadEmfsResource(String name, Object context) {
		URI uri = URI.createURI(name);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
 		try {
			resource.load(context.getClass().getResourceAsStream(name), null);
			resourceSet.getResources().add(resource);
			return (EmfsResource) EcoreUtil.getObjectByType(resource.getContents(), EmfsPackage.eINSTANCE.getEmfsResource());
		} catch (IOException e) {
			return null;
		}
	}

	public static Resource copyResource(Resource res, String ext, boolean copyContents) {
		URI uri = (ext != null ? res.getURI().appendFileExtension(ext) : res.getURI());
		Resource copy = Resource.Factory.Registry.INSTANCE.getFactory(uri).createResource(uri);
		Collection<EObject> contents = res.getContents();
		copy.getContents().addAll(copyContents ? EcoreUtil.copyAll(contents) : contents);
		return copy;
	}
	
	public static void assertEqualResources(Resource res1, Resource res2, String copyExt, boolean copyContents) {
		if (copyExt != null) {
			res1 = copyResource(res1, copyExt, copyContents);
			res2 = copyResource(res2, copyExt, copyContents);
		}
		Assert.assertTrue(EcoreUtil.equals(res1.getContents(), res2.getContents()));
	}

	public void testCreateSerializableEdit(AbstractModelEdit edit) {
		// copy edit
		URI uri = URI.createURI("temp.xmi");
		Resource resource1 = edit.createSerializableEdit(uri);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		try {
			resource1.save(output, null);
//			System.out.println(new String(output.toByteArray()));
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
		byte[] byteArray = output.toByteArray();
		// create a copy of the original emfs resource
		ResourceSet resourceSet = new ResourceSetImpl(); 
		Resource linkedResource = edit.getEObject().eResource();
		Resource copy = copyResource(linkedResource, null, true);
		resourceSet.getResources().add(copy);
		Resource resource2 = resourceSet.createResource(uri);
		// link SetAttributeEdit to the linked resource copy
		resourceSet.getResources().add(resource2);
		try {
			resource2.load(new ByteArrayInputStream(byteArray), null);
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
		ModelEdit edit2 = (ModelEdit) EcoreUtil.getObjectByType(resource2.getContents(), edit.eClass());
		// perform both edits and compare the result
		edit.performEdit();
		edit2.performEdit();
		assertEqualResources(linkedResource, copy, null, false);
	}
}
