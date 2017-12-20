package no.hal.consoleoutputview;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IPatternMatchListenerDelegate;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

public class ConsoleOutputViewPatternMatcher implements IPatternMatchListenerDelegate {

	private TextConsole currentTextConsole = null;
	
	@Override
	public void connect(TextConsole console) {
		this.currentTextConsole = console;
	}

	@Override
	public void disconnect() {
		this.currentTextConsole = null;
	}

	private Pattern regex = Pattern.compile("(\\w+)-view:(#\\w+)?(\\+?)(.*)");

	private MatchResult matchConsoleOutput(PatternMatchEvent event) {
		String line;
		try {
			line = currentTextConsole.getDocument().get(event.getOffset(), event.getLength());
			Matcher matcher = regex.matcher(line);
			if (matcher.matches()) {
				return matcher.toMatchResult();
			}
		} catch (BadLocationException e) {
		}
		return null;
	}

	@Override
	public void matchFound(PatternMatchEvent event) {
		MatchResult match = matchConsoleOutput(event);
		if (match != null) {
			final String viewId = Activator.getDefault().getConsoleOutputViewId(match.group(1));
			if (viewId != null) {
				final String qualifier = match.group(2);
				final boolean append = match.group(3).length() > 0;
				final String contents = match.group(4);
//				System.out.println("(" + viewId + ")+-view:(#" + qualifier + ")?(" + append + ")(" + contents + ")");
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						try {
							IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(viewId);
							if (view instanceof ConsoleOutputView) {
								((ConsoleOutputView) view).processConsoleOutput(contents, append, qualifier != null && qualifier.length() > 1 ? qualifier.substring(1) : null);
							}
						} catch (PartInitException pie) {
						}
					}
				});
			}
		}
	}
}
