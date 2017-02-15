package no.hal.learning.exercise.views.adapters;

import org.eclipse.core.resources.IMarker;

import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.TaskProposal;

public abstract class AbstractSourceEditTaskProposalAdapter<T extends StringEditAnswer> extends TaskProposalUIAdapter<T> {

	public AbstractSourceEditTaskProposalAdapter(TaskProposal<T> proposal) {
		super(proposal);
	}

	protected void setMarkerInfo(MarkerInfo markerInfo, IMarker marker) {
		markerInfo.setLineNumber(marker.getAttribute(IMarker.LINE_NUMBER, -1));
		markerInfo.setCharStart(marker.getAttribute(IMarker.CHAR_START, -1));
		markerInfo.setCharEnd(marker.getAttribute(IMarker.CHAR_END, -1));
		markerInfo.setSeverity(marker.getAttribute(IMarker.SEVERITY, -1));
	}
}
