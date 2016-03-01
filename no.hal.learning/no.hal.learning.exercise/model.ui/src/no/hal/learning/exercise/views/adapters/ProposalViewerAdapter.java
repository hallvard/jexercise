package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.learning.exercise.Proposal;

public interface ProposalViewerAdapter<P extends Proposal<?>, V extends Control> extends EObjectViewerAdapter<P, V> {

	public P getProposal();
}
