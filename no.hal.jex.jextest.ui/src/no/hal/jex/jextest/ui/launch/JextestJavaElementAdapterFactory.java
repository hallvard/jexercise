package no.hal.jex.jextest.ui.launch;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegate;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class JextestJavaElementAdapterFactory implements IAdapterFactory {
	
	@Inject
	private Provider<JextestJavaElementDelegate> jextestJavaElementDelegateProvider;
	
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if (adaptableObject instanceof JavaElementDelegate) {
			return ((JavaElementDelegate) adaptableObject).getAdapter(adapterType);
		}
		JavaElementDelegate result = null;
		if (JextestJavaElementDelegate.class.equals(adapterType)) {
			// make sure injection happens
			result = jextestJavaElementDelegateProvider.get();
		}
		if (result != null) {
			try {
				if (adaptableObject instanceof IFileEditorInput) {
					result.initializeWith((IFileEditorInput) adaptableObject);
					return result;
				}
				if (adaptableObject instanceof IEditorPart) {
					result.initializeWith((IEditorPart) adaptableObject);
					return result;
				}
				if (adaptableObject instanceof IResource) {
					result.initializeWith((IResource) adaptableObject);
					return result;
				}
			} catch (NullPointerException e) {
				// problem with @Inject in superclass
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { JavaElementDelegate.class };
	}
}
