package no.hal.emf.ui.parts.plot;

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
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Widget;

public class PlotTransformController extends SelectionAdapter {

	private Control plotControl;
	private Slider minSlider, maxSlider;

	public PlotTransformController() {
	}
	
	public void createControls(Control plotControl, Composite composite) {
		this.plotControl = plotControl;
		Composite sliderComposite = new Composite(composite, SWT.NONE);
		sliderComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		sliderComposite.setLayout(new GridLayout(2, true));
		
		minSlider = new Slider(sliderComposite, SWT.HORIZONTAL);
		minSlider.setToolTipText("Lower bound");
		minSlider.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		minSlider.addSelectionListener(this);
	
		maxSlider = new Slider(sliderComposite, SWT.HORIZONTAL);
		maxSlider.setToolTipText("Upper bound");
		maxSlider.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		maxSlider.addSelectionListener(this);
	
		updateView();
	}

	private EventData taskData;
	
	public void setTaskData(EventData taskData) {
		this.taskData = taskData;
	}

	private TimeScaler timeScaler;
	
	public void setTimeScaler(TimeScaler timeScaler) {
		this.timeScaler = timeScaler;
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
		fireTransformChanged();
	}

	protected void fireTransformChanged() {
		Transform transform = getTransform();
		for (Listener listener : listeners) {
			listener.transformChanged(transform);
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
		public void transformChanged(Transform transform);
	}
	
	private Collection<Listener> listeners = new ArrayList<PlotTransformController.Listener>();

	public void addListener(Listener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
}
