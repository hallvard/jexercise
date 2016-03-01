package no.hal.learning.exercise.xtext.tests;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import no.hal.learning.exercise.xtext.XerciseStandaloneSetup;

import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExercisePart;
import no.hal.learning.exercise.ExercisePackage;

@RunWith(JUnit4.class)

public class XerciseTest {

	@Before
	public void setUp () {
		XerciseStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(ExercisePackage.eNS_URI, ExercisePackage.eINSTANCE);
	}

	private <T> T loadResource(String name, Class<T> clazz) {
		URL modelUri = this.getClass().getResource(name);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(modelUri.toString()), true);
		for (EObject eObject : resource.getContents()) {
			if (clazz.isInstance(eObject)) {
				return (T) eObject;
			}
		}
		return null;
	}
	
	@Test
	public void testExample1() {
		Exercise quiz1 = loadResource("example1.xex", Exercise.class);
		Assert.assertNotNull(quiz1);
		Assert.assertEquals(2, quiz1.getParts().size());
		Assert.assertTrue(quiz1.getParts().get(0) instanceof ExercisePart);
		Assert.assertEquals(5, ((ExercisePart) quiz1.getParts().get(0)).getTasks().size());
		Assert.assertTrue(quiz1.getParts().get(1) instanceof ExercisePart);
		Assert.assertEquals(5, ((ExercisePart) quiz1.getParts().get(1)).getTasks().size());		
	}
}
