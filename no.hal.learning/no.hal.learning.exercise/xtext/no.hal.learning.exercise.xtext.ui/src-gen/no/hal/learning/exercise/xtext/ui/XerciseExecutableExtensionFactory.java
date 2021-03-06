/*
 * generated by Xtext 2.10.0
 */
package no.hal.learning.exercise.xtext.ui;

import com.google.inject.Injector;
import no.hal.learning.exercise.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XerciseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.NO_HAL_LEARNING_EXERCISE_XTEXT_XERCISE);
	}
	
}
