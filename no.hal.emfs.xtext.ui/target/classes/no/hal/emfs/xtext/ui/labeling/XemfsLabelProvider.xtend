/*
* generated by Xtext
*/
package no.hal.emfs.xtext.ui.labeling

import com.google.inject.Inject
import no.hal.emfs.Property;
import no.hal.emfs.AbstractStringContents
import no.hal.emfs.AbstractStringContentProvider
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class XemfsLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	private AdapterFactoryLabelProvider delegate;

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate)
		this.delegate = delegate
	}

	def text(Property property) {
		delegate.getStyledText(property)
	}

	def text(AbstractStringContentProvider stringContent) {
		delegate.getStyledText(stringContent)
	}

	def text(AbstractStringContents stringContents) {
		delegate.getStyledText(stringContents)
	}

//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
