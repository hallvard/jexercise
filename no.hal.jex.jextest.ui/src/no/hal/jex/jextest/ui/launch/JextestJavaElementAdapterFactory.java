package no.hal.jex.jextest.ui.launch;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegate;

public class JextestJavaElementAdapterFactory implements IAdapterFactory {
	
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes")  Class adapterType) {
		if (adaptableObject instanceof JavaElementDelegate) {
			return ((JavaElementDelegate) adaptableObject).getAdapter(adapterType);
		}
		JavaElementDelegate result = null;
		if (JextestJavaElementDelegate.class.equals(adapterType)) {
			result = new JextestJavaElementDelegate();
		}
		if (result != null) {
			if (adaptableObject instanceof IFileEditorInput) {
				result.initializeWith((IFileEditorInput) adaptableObject);
				return result;
			}
			if (adaptableObject instanceof IResource) {
				result.initializeWith((IResource) adaptableObject);
				return result;
			}
			if (adaptableObject instanceof IEditorPart) {
				result.initializeWith((IEditorPart) adaptableObject);
				return result;
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { JavaElementDelegate.class };
	}
}
