package no.hal.emf.ui.utils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Text;

public class TextPromptHelper implements FocusListener {

	private String prompt = "";
	private Text text;

	public TextPromptHelper(Text text, final String prompt) {
		this.text = text;
		setPrompt(prompt);
		text.addFocusListener(this);
	}

	public void setPrompt(String prompt) {
		String oldPrompt = this.prompt;
		this.prompt = prompt;
		if (! text.isFocusControl()) {
			text2prompt(oldPrompt);
        }
	}
	
	public void focusGained(FocusEvent e) {
        prompt2Text(); 
    }

	protected void prompt2Text() {
		if (text.getText().equals(prompt)) { 
            text.setText(""); 
            text.setForeground(null); 
        }
	}

    public void focusLost(FocusEvent e) {
        text2prompt(null);
    }

	protected void text2prompt(String oldPrompt) {
		if (text.getText().equals(oldPrompt != null ? oldPrompt : "")) { 
            text.setText(prompt);
            text.setForeground(text.getDisplay().getSystemColor(SWT.COLOR_GRAY)); 
        }
	} 
}
