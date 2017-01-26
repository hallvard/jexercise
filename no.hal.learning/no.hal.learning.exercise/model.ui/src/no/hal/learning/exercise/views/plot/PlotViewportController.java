package no.hal.learning.exercise.views.plot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Widget;

import no.hal.learning.exercise.views.plot.PlotData.Point;

public class PlotViewportController<O, E> extends SelectionAdapter {

	private Control plotControl;
	private Slider minSlider, maxSlider;

	private Label lowerLabel, upperLabel;
	private String lowerLabelText = "< lower time range value", upperLabelText = "upper time range value >";	
	private String fillLabelText = ""; // "Time range control";	
	private SimpleDateFormat labelTimeFormat = new SimpleDateFormat("HH:mm E, dd/MM-yy");

	public PlotViewportController() {
	}
	
	private boolean showLabels = true, showTimeRange = false;
	
	public void createControls(Control plotControl, Composite composite) {
		this.plotControl = plotControl;
		if (showLabels) {
			Composite labelsComposite = new Composite(composite, SWT.NONE);
			labelsComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
			GridLayout labelsLayout = new GridLayout(3, false);
			labelsLayout.marginWidth = 0;
			labelsLayout.marginHeight = 0;
			labelsComposite.setLayout(labelsLayout);
			lowerLabel = new Label(labelsComposite, SWT.NONE);
			lowerLabel.setText(lowerLabelText);
			Label fillLabel = new Label(labelsComposite, SWT.NONE);
			fillLabel.setText(fillLabelText);
			fillLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false));
			upperLabel = new Label(labelsComposite, SWT.NONE);
			upperLabel.setText(upperLabelText);
		}
		Composite slidersComposite = new Composite(composite, SWT.NONE);
		slidersComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		GridLayout slidersLayout = new GridLayout(2, true);
		slidersLayout.marginWidth = 0;
		slidersLayout.marginHeight = 0;
		slidersComposite.setLayout(slidersLayout);
		
		minSlider = new Slider(slidersComposite, SWT.HORIZONTAL);
		minSlider.setToolTipText(lowerLabelText);
		minSlider.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		minSlider.addSelectionListener(this);
	
		maxSlider = new Slider(slidersComposite, SWT.HORIZONTAL);
		maxSlider.setToolTipText(upperLabelText);
		maxSlider.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		maxSlider.addSelectionListener(this);
	
		updateView();
	}

	private EventData<O, E> taskData;
	
	public void setTaskData(EventData<O, E> taskData) {
		this.taskData = taskData;
	}

	private TimeScaler timeScaler;
	
	public void setTimeScaler(TimeScaler timeScaler) {
		this.timeScaler = timeScaler;
	}
	
	private EventPlotViewer<O, E>.PointSelector pointSelector;

	public void setPointSelector(EventPlotViewer<O, E>.PointSelector pointSelector) {
		this.pointSelector = pointSelector;
	}

	private int minWidth = 30 * 60;
	
	public void setMinWidth(int minWidth) {
		this.minWidth = minWidth;
	}

	public void widgetSelected(SelectionEvent e) {
		viewChanged(e.widget);
//		fireTransformChanged();
	}

	public void revealMaximum(boolean zoom) {
		maxSlider.setSelection(maxSlider.getMaximum());
		if (zoom) {
			minSlider.setSelection(minSlider.getMaximum());
		}
		viewChanged(minSlider);
	}

	public void updateView() {
		long plotWidth = taskData.getPlotWidth();
		if (timeScaler != null) {
			plotWidth = (long) timeScaler.getScaledInterval(plotWidth);
		}
		int canvasWidth = plotControl.getSize().x;
		minSlider.setValues(0, 0, (int) plotWidth, canvasWidth, 1, canvasWidth);
		maxSlider.setValues((int) plotWidth, 0, (int) plotWidth, canvasWidth, 1, canvasWidth);
		
		viewChanged(null);
	}

	protected void viewChanged(Widget slider) {
		int min = minSlider.getSelection(), max = maxSlider.getSelection() + maxSlider.getThumb();
		if (min + minWidth >= max) {
			if (slider == maxSlider) {
				min = max - minWidth;
				minSlider.setSelection(min);
				if (min < minSlider.getMinimum()) {
					maxSlider.setSelection(max - maxSlider.getThumb() + minSlider.getMinimum() - min);
				}
			} else if (slider == minSlider) {
				max = min + minWidth;
				maxSlider.setSelection(min + minWidth - maxSlider.getThumb());
				if (max > minSlider.getMaximum()) {
					minSlider.setSelection(min + maxSlider.getMaximum() - max);				
				}
			}
		}
		if (showLabels) {
			updateLabels();
		}
		fireViewportChanged();
	}

	protected void updateLabels() {
		if (lowerLabel != null) {
			String text = lowerLabelText;
			if (showTimeRange && pointSelector != null) {
				Collection<Point<E>> selected = pointSelector.selectPoints(0, 0);
				if (selected.size() > 0) {
					text = text + " - " + EventPlotViewer.formatTime(selected.iterator().next().timestamp, labelTimeFormat);
				}
			}
			lowerLabel.setText(text);
		}
		if (upperLabel != null) {
			String text = upperLabelText;
			if (showTimeRange && pointSelector != null) {
				Collection<Point<E>> selected = pointSelector.selectPoints(plotControl.getSize().x, 0);
				if (selected.size() > 0) {
					text = EventPlotViewer.formatTime(selected.iterator().next().timestamp, labelTimeFormat) + " - " + upperLabelText;
				}
			}
			upperLabel.setText(text);
		}
	}

	protected void fireViewportChanged() {
		Transform transform = getTransform();
		for (Listener listener : listeners) {
			listener.viewportChanged(transform);
		}
	}

	public Transform getTransform() {
		if (minSlider == null || maxSlider == null) {
			return null;
		}
		int min = minSlider.getSelection(), max = maxSlider.getSelection() + maxSlider.getThumb();
		float sx = ((float) plotControl.getSize().x) / Math.max(1.0f, max - min);
		float tx = -min * sx;
		return new Transform(plotControl.getDisplay(), sx, 0.0f, 0.0f, 1.0f, tx, 0.0f);
	}

	interface Listener {
		public void viewportChanged(Transform transform);
	}
	
	private Collection<Listener> listeners = new ArrayList<PlotViewportController.Listener>();

	public void addListener(Listener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
}
