package no.hal.emf.ui.parts.plot;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Widget;

import no.hal.emf.ui.parts.plot.PlotData.Point;

public class TimepointSelectorController<O, E> extends SelectionAdapter {

	private EventPlotViewer<O, E>.PointSelector pointSelector;
	
	public TimepointSelectorController(EventPlotViewer<O, E>.PointSelector pointSelector) {
		this.pointSelector = pointSelector;
	}
	
	private Slider timeSlider;

	public void createControls(Composite composite) {
		Composite controllerComposite = new Composite(composite, SWT.NONE);
		controllerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		controllerComposite.setLayout(new GridLayout(1, true));
		
		timeSlider = new Slider(controllerComposite, SWT.HORIZONTAL);
		timeSlider.setToolTipText("Time");
		timeSlider.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
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
			fireTimepointChanged();
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
