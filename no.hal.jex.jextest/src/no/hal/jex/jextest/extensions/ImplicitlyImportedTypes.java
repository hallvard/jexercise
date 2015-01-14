package no.hal.jex.jextest.extensions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Lists;

public class ImplicitlyImportedTypes extends org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures {

	@Override
	protected List<Class<?>> getExtensionClasses() {
		List<Class<?>> extensionClasses = super.getExtensionClasses();
		extensionClasses.addAll(Lists.<Class<?>> newArrayList(
				JextestExtensions.class
		));
		Collections.sort(extensionClasses, new Comparator<Class<?>>() {
			public int compare(Class<?> c1, Class<?> c2) {
				return c1.getSimpleName().compareTo(c2.getSimpleName());
			}
		});
		return extensionClasses;
	}
}
