package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.learning.exercise.Question;

public interface QuestionViewerAdapter<Q extends Question, V extends Control> extends EObjectViewerAdapter<Q, V> {
	
	public Q getQuestion();
}
