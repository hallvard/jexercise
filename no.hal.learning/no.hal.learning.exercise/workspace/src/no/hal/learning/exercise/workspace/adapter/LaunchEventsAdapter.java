package no.hal.learning.exercise.workspace.adapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleListener;
import org.eclipse.ui.console.TextConsole;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapter;
import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.WorkspaceFactory;

public class LaunchEventsAdapter<A extends LaunchAnswer> extends AbstractTaskEventsAdapter<A> implements ILaunchListener, IConsoleListener {
	
	@Override
	protected void registerListeners() {
		DebugPlugin debugPlugin = DebugPlugin.getDefault();
		if (debugPlugin != null) {
			debugPlugin.getLaunchManager().addLaunchListener(this);
		}
		ConsolePlugin consolePlugin = ConsolePlugin.getDefault();
		if (consolePlugin != null) {
			consolePlugin.getConsoleManager().addConsoleListener(this);			
		}
	}

	@Override
	protected void unregisterListeners() {
		ConsolePlugin consolePlugin = ConsolePlugin.getDefault();
		if (consolePlugin != null) {
			consolePlugin.getConsoleManager().removeConsoleListener(this);			
		}
		DebugPlugin debugPlugin = DebugPlugin.getDefault();
		if (debugPlugin != null) {
			debugPlugin.getLaunchManager().removeLaunchListener(this);
		}
	}

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, LaunchAnswer.class);
	}
	
	protected boolean hasLaunchAttr(ILaunchConfiguration launchConfig, String attrName, String attrValue) {
		String value = getLaunchAttr(launchConfig, attrName, "");
		return value.length() > 0 && (attrValue == null || attrValue.equals(value));
	}

	protected String getLaunchAttr(ILaunchConfiguration launchConfig, String attrName, String defValue) {
		try {
			return launchConfig.getAttribute(attrName, defValue);
		} catch (CoreException e) {
			return defValue;
		}
	}

	protected boolean acceptLaunch(ILaunchConfiguration launchConfig) {
		return true;
	}

	@Override
	public void launchAdded(ILaunch launch) {
		if (acceptLaunch(launch.getLaunchConfiguration())) {
			provideTaskEvent(launch, createLaunchEvent());
		}
	}

	protected LaunchEvent createLaunchEvent() {
		return WorkspaceFactory.eINSTANCE.createLaunchEvent();
	}
	
	private ILaunch launch;
	private LaunchEvent launchEvent;
	
	protected void provideTaskEvent(ILaunch launch, LaunchEvent launchEvent) {
		this.launch = launch;
		this.launchEvent = launchEvent;
		launchEvent.setTimestamp(getTimestamp());
		launchEvent.setMode(launch.getLaunchMode());
		ILaunchConfiguration launchConfig = launch.getLaunchConfiguration();			
		try {
			for (Map.Entry<String, Object> entry : launchConfig.getAttributes().entrySet()) {
				if (entry.getValue() instanceof String) {
					launchEvent.getLaunchAttrNames().add(entry.getKey());
					launchEvent.getLaunchAttrValues().add((String) entry.getValue());
				}
			}
		} catch (CoreException e) {
		}
	}

	@Override
	public void launchRemoved(ILaunch launch) {
	}

	@Override
	public void launchChanged(ILaunch launch) {
	}

	private class LaunchDocumentListener implements IDocumentListener {
		
		private final ILaunch launch;
		private final LaunchEvent launchEvent;
		private final TextConsole console;

		private LaunchDocumentListener(ILaunch launch, LaunchEvent launchEvent, TextConsole console) {
			this.launch = launch;
			this.launchEvent = launchEvent;
			this.console = console;
			console.getDocument().addDocumentListener(this);
		}

		@Override
		public void documentAboutToBeChanged(DocumentEvent event) {
		}
		@Override
		public void documentChanged(DocumentEvent event) {
			String text = event.getText();
			EList<String> consoleOutput = launchEvent.getConsoleOutput();
			// if this isn't an append, clear existing output and replace with whole console contents
			if (event.getOffset() - event.getLength() + text.length() != event.getDocument().getLength()) {
				consoleOutput.clear();
				text = console.getDocument().get();
			}
			consoleOutput.add(text);
			if (isTerminated()) {
				close();
			}
		}

		private boolean isTerminated() {
			for (IProcess process : launch.getProcesses()) {
				if (! process.isTerminated()) {
					return false;
				}
			}
			return true;
		}

		private void close() {
			documentListeners.remove(console);
			console.getDocument().removeDocumentListener(this);
			if (launchEvent.eContainer() == null) {
				provideTaskEvent(launchEvent);
			}
		}
	}
	
	private Map<TextConsole, LaunchDocumentListener> documentListeners = new HashMap<TextConsole, LaunchDocumentListener>();

	@Override
	public void consolesAdded(IConsole[] consoles) {
		for (IConsole console : consoles) {
			if (console instanceof TextConsole) {
				TextConsole textConsole = (TextConsole) console;
				LaunchDocumentListener documentListener = new LaunchDocumentListener(launch, launchEvent, textConsole);
				documentListeners.put(textConsole, documentListener);
			}
		}
	}

	@Override
	public void consolesRemoved(IConsole[] consoles) {
		for (IConsole console : consoles) {
			LaunchDocumentListener documentListener = documentListeners.get(console);
			if (documentListener != null) {
				documentListener.close();
			}
		}
	}
}
