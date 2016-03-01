package no.hal.emf.ui.utils;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;

public class FontStyler extends Styler {
	
	public final static int BOLD = SWT.BOLD, ITALIC = SWT.ITALIC, NORMAL = SWT.NORMAL;

	private int style;
	public Boolean strikeout;
	public Boolean underline;

    public FontStyler(int style) {
		this.style = style;
	}

	@Override
    public void applyStyles(final TextStyle textStyle) {
        FontDescriptor descriptor = FontDescriptor.createFrom(new FontData()).setStyle(style);
        Font font = descriptor.createFont(Display.getCurrent());
        textStyle.font = font;
        if (strikeout != null) {
        	textStyle.strikeout = strikeout;
        }
        if (underline != null) {
        	textStyle.underline = underline;
        }
    }
}
