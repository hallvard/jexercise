package no.hal.emf.ui.parts.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.widgets.Display;

class PlotData<O, E> {
	O owner;
	ITimestampProvider<E> timestampProvider;
	IValueProvider<E, Number> valueProvider;
	List<Point> points;
	String name;
	int colorId;
	String dashes;
	PlotPath plotPath;
	Path devicePath;
	Image lineImage;

	void setModelData(O key, Collection<E> ts, String name, ITimestampProvider<E> timestampProvider, IValueProvider<E, Number> valueProvider) {
		this.owner = key;
		this.name = name;
		this.timestampProvider = timestampProvider;
		this.valueProvider = valueProvider;
		this.points = new ArrayList<PlotData.Point>(ts != null ? ts.size() : 10);
		int valueNum = 0;
		if (ts != null) {
			for (E t : ts) {
				float value = valueNum;
				if (valueProvider != null) {
					try {
						value = valueProvider.getValue(t).floatValue();
					} catch (Exception e) {
						continue;
					}
				}
				if (timestampProvider != null && value >= 0.0) {
					this.points.add(new Point(timestampProvider.getTimestamp(t), value));
					valueNum++;
				}
			}
		}
	}

	void setViewData(int colorId, String dashes, PlotPath plotPath) {
		this.colorId = colorId;
		this.dashes = dashes;
		this.plotPath = (plotPath != null && plotPath.size() == 0 ? null : plotPath);
		if (this.devicePath != null) {
			this.devicePath.dispose();
			this.devicePath = null;
		}
	}

	void setDashes(GC gc) {
		if (dashes == null || dashes.length() == 0) {
			gc.setLineStyle(SWT.LINE_SOLID);
		} else if (Character.isAlphabetic(dashes.charAt(0))) {
			try {
				Integer lineStyle = (Integer) SWT.class.getField("LINE_" + dashes).get(null);
				gc.setLineStyle(lineStyle);
			} catch (Exception e) {
				gc.setLineStyle(SWT.LINE_SOLID);
			}
		} else {
			int[] dashArray = createDashArray(dashes);
			gc.setLineStyle(SWT.LINE_CUSTOM);
			gc.setLineDash(dashArray);
		}
	}

	private int[] dashChars = { '_', 4, '-', 2, '.', 1, ' ', 2, '\t', 4 }; 
	
	private int[] createDashArray(String dashes) {
		int[] dashArray = new int[dashes.length()];
		for (int i = 0; i < dashes.length(); i++) {
			char c = dashes.charAt(i);
			int d = 1;
			for (int j = 0; j < dashChars.length; j += 2) {
				if (dashChars[j] == c) {
					d = dashChars[j + 1];
					break;
				}
			}
			dashArray[i] = d;
		}
		return dashArray;
	}

	void initPlotDataImage(Display display) {
		lineImage = new Image(display, 64, 16);
		GC gc = new GC(lineImage);
		setDashes(gc);
		gc.setForeground(display.getSystemColor(colorId));
		gc.drawLine(0, 8, 64, 8);
		gc.dispose();
	}
	
	public static class Point {
		final long timestamp;
		final float value;

		public Point(long timestamp, float value) {
			super();
			this.timestamp = timestamp;
			this.value = value;
		}
	}
}