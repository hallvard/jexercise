package no.hal.learning.exercise.workspace.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.adapters.AbstractSourceEditTaskProposalAdapter;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskCounterUIAdapter;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.exercise.workspace.WorkspacePackage;

public class AbstractSourceFileEditTaskProposalAdapter<T extends StringEditAnswer> extends AbstractSourceEditTaskProposalAdapter<T> {

	public AbstractSourceFileEditTaskProposalAdapter(TaskProposal<T> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getSourceFileEditEvent_SizeMeasure(), "Size: %2s", null, true),
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getSourceFileEditEvent_ErrorCount(), "Errors: %2s", false),
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getSourceFileEditEvent_WarningCount(), "Warnings: %2s", false),
			new TaskAttemptsUIAdapter(getProposal())
		};
	}

	//

	protected class AbstractSourceFileListener implements Runnable {
		
		protected SourceFileEditEvent taskEvent;

		protected int lineCount, errorCount, warningCount;
		protected IPath filePath;
		
		protected void initTaskEventEdit(IFile file) {
			this.filePath = file.getFullPath();
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

		protected void initTaskEventCounters(IFile file, String problemMarkerType, MarkerInfo markerInfo) {	
			errorCount = warningCount = -1;
			IMarker[] problemMarkers = null;
			try {
				problemMarkers = file.findMarkers(problemMarkerType, true, IResource.DEPTH_ZERO);
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
					setMarkerInfo(markerInfo, marker);
					taskEvent.getMarkers().add(markerInfo);
				}
			}
			taskEvent.setErrorCount(errorCount);
			taskEvent.setWarningCount(warningCount);

			updateProposal();
		}

		protected void updateProposal() {
			asyncExec(this);
		}
		
		@Override
		public void run() {
			getProposal().setCompletion(taskEvent.getCompletion());
			getProposal().getAttempts().add(taskEvent);
		}
	}
}
