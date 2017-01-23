package no.hal.emf.ui.parts.plot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Widget;

import no.hal.emf.ui.parts.plot.PlotData.Point;

public class TimepointSelectorController<O, E> extends SelectionAdapter {

	private EventPlotViewer<O, E>.PointSelector pointSelector;
	
	public TimepointSelectorController(EventPlotViewer<O, E>.PointSelector pointSelector) {
		this.pointSelector = pointSelector;
	}
	
	private Slider timeSlider;

	private Label timeLabel;
	
	private boolean showLabel = true, showTime = true;
	private String timeLabelText = "Time selector";
	private SimpleDateFormat labelTimeFormat = new SimpleDateFormat("HH:mm E, dd/MM-yy");

	public void createControls(Composite composite) {
		GridLayout labelLayout = new GridLayout(1, true);
		if (showLabel) {
			Composite labelComposite = new Composite(composite, SWT.NONE);
			labelComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
			labelLayout.marginWidth = 0;
			labelLayout.marginHeight = 0;
			labelComposite.setLayout(labelLayout);
			timeLabel = new Label(labelComposite, SWT.NONE);
			timeLabel.setAlignment(SWT.CENTER);
			timeLabel.setText(timeLabelText);
			timeLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		}
		Composite sliderComposite = new Composite(composite, SWT.NONE);
		sliderComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		sliderComposite.setLayout(labelLayout);
		
		timeSlider = new Slider(sliderComposite, SWT.HORIZONTAL);
		timeSlider.setToolTipText(timeLabelText);
		timeSlider.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		timeSlider.addSelectionListener(this);
	
		updateView();
	}

	private org.eclipse.swt.graphics.Point size = new org.eclipse.swt.graphics.Point(100, 100);

	public void setViewportSize(org.eclipse.swt.graphics.Point size) {
		this.size = size;
	}

	public void widgetSelected(SelectionEvent e) {
		viewChanged(e.widget);
	}

	private long timepoint = -1;

	public long getTimepoint() {
		return timepoint;
	}

	public void updateView() {
		if (timeSlider != null) {
			timeSlider.setValues(0, 0, size.x, 1, 1, size.x / 5);
		}
		viewChanged(null);
	}

	protected void viewChanged(Widget slider) {
		long newTimepoint = timepoint;
		if (slider != null) {
			if (slider == timeSlider) {
				int value = timeSlider.getSelection();
				Collection<Point<E>> points = pointSelector.selectPoints(value, 0); //, value + 1, size.y);
				if (! points.isEmpty()) {
					newTimepoint = points.iterator().next().timestamp;
				}
			}
		}
		if (newTimepoint != timepoint) {
			timepoint = newTimepoint;
			if (showLabel) {
				updateLabel();
			}
			fireTimepointChanged();
		}
	}

	protected void updateLabel() {
		if (timeLabel != null) {
			String text = timeLabelText;
			if (showTime && pointSelector != null) {
//				text = text + " - " + new Date(timepoint).toString();
				text = text + " - " + EventPlotViewer.formatTime(timepoint, labelTimeFormat);
			}
			timeLabel.setText(text);
		}
	}

	protected void fireTimepointChanged() {
		for (Listener listener : listeners) {
			listener.timepointChanged(timepoint);
		}
	}

	interface Listener {
		public void timepointChanged(long timepoint);
	}
	
	private Collection<Listener> listeners = new ArrayList<TimepointSelectorController.Listener>();

	public void addListener(Listener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
}
