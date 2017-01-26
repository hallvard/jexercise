package no.hal.learning.exercise.jdt.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtPackage;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskCounterUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;

public class JdtSourceEditTaskProposalAdapter extends TaskProposalUIAdapter<JdtSourceEditAnswer> {

	public JdtSourceEditTaskProposalAdapter(TaskProposal<JdtSourceEditAnswer> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskCounterUIAdapter(getProposal(), JdtPackage.eINSTANCE.getJdtSourceEditEvent_SizeMeasure(), "Size: %2s", null, true),
			new TaskCounterUIAdapter(getProposal(), JdtPackage.eINSTANCE.getJdtSourceEditEvent_ErrorCount(), "Errors: %2s", false),
			new TaskCounterUIAdapter(getProposal(), JdtPackage.eINSTANCE.getJdtSourceEditEvent_WarningCount(), "Warnings: %2s", false),
			new TaskAttemptsUIAdapter(getProposal())
		};
	}
	
	private JavaElementListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		JavaCore.addElementChangedListener(listener = new JavaElementListener(), ElementChangedEvent.POST_CHANGE);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_BUILD);
		return super.initView(parent);
	}
	
	@Override
	public void dispose() {
		JavaCore.removeElementChangedListener(listener);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
		super.dispose();
	}

	String getQualifiedClassName(ICompilationUnit cu) {
		String elementName = cu.getElementName();
		String javaExt = ".java";
		if (elementName.endsWith(javaExt)) {
			elementName = elementName.substring(0, elementName.length() - javaExt.length());
		}
		IJavaElement element = cu.getParent();
		while (element instanceof IPackageFragment) {
			elementName = element.getElementName() + "." + elementName;
			element = element.getParent();
		}
		return elementName;
	}
	
	//

	protected class JavaElementListener implements IElementChangedListener, IResourceChangeListener, Runnable {
		
		private JdtSourceEditEvent taskEvent;

		protected boolean acceptElementChanged(ICompilationUnit cu) {
			String className = getProposal().getAnswer().getClassName();
			String cuClassName = getQualifiedClassName(cu);
			return cuClassName.equals(className);
		}
		protected ICompilationUnit acceptElementChanged(IJavaElementDelta delta) {
			IJavaElement element = delta.getElement();
			if (element instanceof ICompilationUnit) {
				ICompilationUnit cu = (ICompilationUnit) element;
				if (acceptElementChanged(cu)) {
					return cu;
				}
			} else {
				for (IJavaElementDelta childDelta : delta.getAffectedChildren()) {
					ICompilationUnit cu = acceptElementChanged(childDelta);
					if (cu != null) {
						return cu;
					}
				}
			}
			return null;
		}
		protected ICompilationUnit acceptElementChangedEvent(ElementChangedEvent event) {
			return acceptElementChanged(event.getDelta());
		}

		private int lineCount, errorCount, warningCount;
		private IPath filePath;
		
		@Override
		public void elementChanged(ElementChangedEvent event) {
			ICompilationUnit cu = acceptElementChangedEvent(event);
			if (cu == null || (! (cu.getResource() instanceof IFile))) {
				return;
			}
			IFile file = (IFile) cu.getResource();
			this.filePath = file.getFullPath();
			taskEvent = JdtFactory.eINSTANCE.createJdtSourceEditEvent();
			taskEvent.setTimestamp(getTimestamp());
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(file.getContents()));
			} catch (CoreException e1) {
			}
			lineCount = -1;
			if (reader != null) {
				String line = null;
				StringBuilder buffer = new StringBuilder();
				lineCount = 0;
				try {
					while ((line = reader.readLine()) != null) {
						buffer.append(line);
						buffer.append("\n");
						lineCount++;
					}
				} catch (IOException e) {
				}
				EList<TaskEvent> attempts = getProposal().getAttempts();
				AbstractStringEditEvent lastEvent = null;
				if (! attempts.isEmpty()) {
					lastEvent = (AbstractStringEditEvent) attempts.get(attempts.size() - 1);
				}
				AbstractStringEdit stringEdit = taskEvent.createStringEdit(buffer.toString(), lastEvent);
				taskEvent.setEdit(stringEdit);
			}
			taskEvent.setSizeMeasure(lineCount);
		}

		private void updateProposal() {
			asyncExec(this);
		}

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if (event.getType() != IResourceChangeEvent.POST_BUILD || filePath == null) {
				return;
			}
			IResourceDelta file = event.getDelta().findMember(filePath);
			if (file != null) {
				filePath = null;
				sourceFileChanged((IFile) file.getResource());
			}
		}

		protected void sourceFileChanged(IFile file) {	
			errorCount = warningCount = -1;
			IMarker[] problemMarkers = null;
			try {
				problemMarkers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
			} catch (CoreException e) {
			}
			if (problemMarkers != null) {
				errorCount = warningCount = 0;
				for (int i = 0; i < problemMarkers.length; i++) {
					IMarker marker = problemMarkers[i];
					int severity = marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
					if (severity == IMarker.SEVERITY_ERROR) {
						errorCount++;
					} else if (severity == IMarker.SEVERITY_WARNING) {
						warningCount++;
					}
				}
			}
			taskEvent.setErrorCount(errorCount);
			taskEvent.setWarningCount(warningCount);

			updateProposal();
		}

		@Override
		public void run() {
			getProposal().setCompletion(taskEvent.getCompletion());
			getProposal().getAttempts().add(taskEvent);
		}
	}
}
