package no.hal.confluence.ui.actions;

import java.util.Collection;

import org.eclipse.jdt.core.IJavaElement;

public interface PostPasteHook {
	public void javaElementsPasted(Collection<IJavaElement> pastedJavaElements);
}
