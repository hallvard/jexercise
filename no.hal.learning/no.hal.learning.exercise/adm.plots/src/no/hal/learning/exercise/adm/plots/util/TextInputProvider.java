package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Text;

public class TextInputProvider<T> implements InputProvider<T>, ModifyListener {

	private final Text text;
	private Color oldColor;
	private String oldTooltip;
	private final TextInputHandler<T> inputHandler;
	
	public TextInputProvider(Text text, TextInputHandler<T> inputHandler) {
		this.text = text;
		this.inputHandler = inputHandler;
		text.addModifyListener(this);
		this.oldColor = text.getForeground();
		this.oldTooltip = text.getToolTipText();
	}

	@Override
	public T getInput() {
		String s = text.getText().trim();
		return inputHandler.toValue(s);
	}

	@Override
	public void modifyText(ModifyEvent e) {
		String message = inputHandler.isValid(text.getText().trim());
		text.setForeground(message != null ? text.getDisplay().getSystemColor(SWT.COLOR_RED) : oldColor);
		text.setToolTipText(message != null ? message : oldTooltip);
	}
}
