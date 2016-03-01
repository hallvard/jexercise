package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.widgets.Label;

import no.hal.learning.exercise.StringQuestion;

public class StringQuestionViewerAdapter extends LabelViewerAdapter<StringQuestion> implements QuestionViewerAdapter<StringQuestion, Label> {

	protected String format;
	
	public StringQuestionViewerAdapter(StringQuestion question) {
		super(question);
	}

	@Override
	public StringQuestion getQuestion() {
		return eObject;
	}
	
	//

	private static String punctuation = ".!?";

	@Override
	protected Object getModelValue() {
		String question = getQuestion().getQuestion();
		if (question != null && punctuation.indexOf(question.charAt(question.length() - 1)) < 0) {
			question += "?";
		}		
		return question;
	}
}
