package no.hal.learning.exercise.views;

import org.eclipse.core.runtime.IPath;

public class StringEditorInput extends AbstractStringEditorInput {

	private final String string;
	
	public StringEditorInput(String string, IPath path) {
		super(path);
		this.string = string;
	}
	
	@Override
	protected String getString() {
		return string;
	}
}
