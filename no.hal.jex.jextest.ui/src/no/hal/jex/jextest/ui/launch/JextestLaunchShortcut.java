package no.hal.jex.jextest.ui.launch;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.xbase.ui.launching.JUnitLaunchShortcut;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegate;
import org.eclipse.xtext.xbase.ui.launching.LaunchShortcutUtil;

public class JextestLaunchShortcut extends JUnitLaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection newSelection = LaunchShortcutUtil.replaceWithJavaElementDelegates((IStructuredSelection) selection, JextestJavaElementDelegate.class);
			super.launch(newSelection, mode);
		}
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		JavaElementDelegate javaElementDelegate = (JavaElementDelegate) editor.getAdapter(JextestJavaElementDelegate.class);
		if (javaElementDelegate != null) {
			launch(new StructuredSelection(javaElementDelegate), mode);
		} else {
			super.launch(editor, mode);
		}
	}
}
