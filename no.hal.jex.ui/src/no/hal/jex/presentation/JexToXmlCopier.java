package no.hal.jex.presentation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import no.hal.jex.xml.JexXmlResource;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

public class JexToXmlCopier {

	private JexXmlResource copy;
	
	public JexToXmlCopier(Resource original, String extension) {
		copy = new JexXmlResource(original.getURI().trimFileExtension().appendFileExtension(extension));
		copy.getContents().addAll(EcoreUtil.copyAll(original.getContents()));
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResources().add(copy);
		// set up extension 
		ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		Map extensions = copy.getEObjectToExtensionMap();
		// create extension attribute meta object
		EStructuralFeature originalAttributeFeature = extendedMetaData.demandFeature(null, "original", false);
		// create extension attribute 
		AnyType originalAttribute = XMLTypeFactory.eINSTANCE.createAnyType();
		// set extension attribute value
		originalAttribute.eSet(originalAttributeFeature, original.getURI().toString());
		// add attribute to root object
		extensions.put(copy.getContents().get(0), originalAttribute);
	}
	
	public void save(Map saveOptions) throws IOException {
		copy.save(saveOptions);
	}

	public void save() throws IOException {
		Map saveOptions = new HashMap();
	    saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
	    save(saveOptions);
	}
}
