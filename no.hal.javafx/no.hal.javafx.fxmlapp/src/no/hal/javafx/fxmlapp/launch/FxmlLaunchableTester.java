package no.hal.javafx.fxmlapp.launch;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;

/**
 * Property tester for context launching menu.
 * 
 * @since 3.2
 */
public class FxmlLaunchableTester extends PropertyTester {

	/**
	 * name for the "has main" property
	 */
	private static final String PROPERTY_HAS_CONTROLLER = "hasController";

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_HAS_CONTROLLER.equals(property)) {
			IResource resource = Platform.getAdapterManager().getAdapter(receiver, IResource.class);
			if (resource != null) {
				return hasController(resource);
			}
		}
		return false;
	}

	private boolean hasController(IResource element) {
		return true;
	}
}
