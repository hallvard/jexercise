package no.hal.emf.ui.utils;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.PlatformUI;

public class FileExtensionLabelProvider extends DelegatingLabelProvider {

	public FileExtensionLabelProvider(ILabelProvider delegate) {
		super(delegate);
	}
	public FileExtensionLabelProvider() {
		this(null);
	}
	
	public String getFileExtension(String text) {
		int pos = text.indexOf(' ');
		if (pos < 0) {
			pos = text.length();
		}
		int extPos = text.lastIndexOf('.', pos - 1);
		return text.substring(extPos + 1, pos);
	}
	
	protected String getFileExtension(Object element) {
		return getFileExtension(getText(element));
	}
	
	@Override
	public Image getImage(Object element) {
		String ext = getFileExtension(element);
		Image image = getExtentionImage(ext);
		return image != null ? image : super.getImage(element);
	}

	public Image getExtentionImage(String filename) {
		String ext = getFileExtension(filename);
		ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
		Image image = imageRegistry.get(ext);
		if (image == null) {
			IEditorRegistry editorReg = PlatformUI.getWorkbench().getEditorRegistry();
			IEditorDescriptor defaultEditor = editorReg.getDefaultEditor(filename);
			if (defaultEditor != null) {
				imageRegistry.put(ext, defaultEditor.getImageDescriptor());
				image = imageRegistry.get(ext);
//			} else {
//				IFileEditorMapping[] mappings = editorReg.getFileEditorMappings();
//				for (IFileEditorMapping fileEditorMapping : mappings) {
//					if (fileEditorMapping.getExtension().equals(ext)) {
//						imageRegistry.put(ext, fileEditorMapping.getImageDescriptor());
//						image = imageRegistry.get(ext);
//						break;
//					}
//				}
			}
		}
		return image;
	}
}
