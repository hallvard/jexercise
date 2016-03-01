package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.Proposal;

public interface ProposalUIAdapter<P extends Proposal<?>, V extends Control> extends ProposalViewerAdapter<P, V>, EObjectUIAdapter<P, V> {
}
