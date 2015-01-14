/**
 * generated by Xtext
 */
package no.hal.emfs.xtext.ui.labeling;

import com.google.inject.Inject;
import no.hal.emfs.AbstractStringContentProvider;
import no.hal.emfs.AbstractStringContents;
import no.hal.emfs.Property;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class XemfsLabelProvider extends DefaultEObjectLabelProvider {
  private AdapterFactoryLabelProvider delegate;
  
  @Inject
  public XemfsLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
    this.delegate = delegate;
  }
  
  public StyledString text(final Property property) {
    return this.delegate.getStyledText(property);
  }
  
  public StyledString text(final AbstractStringContentProvider stringContent) {
    return this.delegate.getStyledText(stringContent);
  }
  
  public StyledString text(final AbstractStringContents stringContents) {
    return this.delegate.getStyledText(stringContents);
  }
}
