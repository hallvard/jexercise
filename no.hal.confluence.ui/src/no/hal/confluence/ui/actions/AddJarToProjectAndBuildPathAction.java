package no.hal.confluence.ui.actions;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.ui.actions.AddToClasspathAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

public class AddJarToProjectAndBuildPathAction extends AddResourceToProjectAction {

	private AddToClasspathAction addToClasspathAction = null;
	
	private PostActionHook<IResource> postActionHook = new PostActionHook<IResource>() {
		@Override
		public void postActionHook(Collection<IResource> actionElements) {
			if (addToClasspathAction == null) {
				addToClasspathAction = new AddToClasspathAction(browserView.getSite());
			}
			IStructuredSelection selection = new StructuredSelection(new ArrayList<IResource>(actionElements));
			addToClasspathAction.run(selection);
		}
	};
	
	protected PostActionHook<IResource> getPostActionHook() {
		return postActionHook;
	}
}
