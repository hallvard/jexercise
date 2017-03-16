package no.hal.learning.exercise.adm;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

public class PathViewerLabelProvider extends BaseLabelProvider implements ILabelProvider {
	
	@Override
	public String getText(Object element) {
		String s = String.valueOf(element);
		int pos = s.lastIndexOf('/');
		return (pos >= 0 ? s.substring(pos + 1) : s);
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}
}
