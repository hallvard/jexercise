package no.hal.emf.ui.parts.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Path;

import no.hal.emf.ui.parts.plot.PlotData.Point;

public class PlotPath<E> implements PlotPathProvider.Consumer<E> {

	private Collection<Float> xys = new ArrayList<Float>();
	
	public int size() {
		return xys.size();
	}
	
	public void appendSegment(float x, float y) {
		xys.add(x);
		xys.add(y);
	}
	
	private boolean useSwtPath = false;

	public Object toPath(Device device) {
		if (xys.size() < 2) {
			return null;
		}
		if (useSwtPath) {
			return toSwtPath(device);
		}
		return Boolean.TRUE;
	}

	public Path toSwtPath(Device device) {
		Path path = new Path(device);
		Iterator<Float> it = xys.iterator();
		float x = it.next(), y = it.next();
		path.moveTo(x, y);
		if (! it.hasNext()) {
			path.lineTo(x, y - 2);
			path.lineTo(x, y + 2);
			// make sure a single point is visible
			path.lineTo(x - 3, y);
		} else {
			while (it.hasNext()) {
				x = it.next(); y = it.next();
				path.lineTo(x, y);
				path.lineTo(x, y - 2);
				path.lineTo(x, y + 2);
				path.moveTo(x, y);
			}
		}
		return path;
	}
	
	public void drawPath(Object devicePath, GC gc) {
		if (devicePath instanceof Path) {
			gc.drawPath((Path) devicePath);
		} else if (Boolean.TRUE.equals(devicePath)) {
			Iterator<Float> it = xys.iterator();
			float x = it.next(), y = it.next();
			if (! it.hasNext()) {
				if (x >= 0) {
					gc.drawLine((int) x, (int) y - 2, (int) x, (int) y + 2);
					// make sure a single point is visible
					gc.drawLine((int) x, (int) y, (int) x - 3, (int) y + 2);
				}
			} else {
				while (it.hasNext()) {
					float x2 = it.next(), y2 = it.next();
					if (x2 >= x) {
						gc.drawLine((int) x, (int) y, (int) x2, (int) y2);
						gc.drawLine((int) x2, (int) y2 - 2, (int) x2, (int) y2 + 2);
					}
					x = x2;
					y = y2;
				}
			}
		}
	}

	// PlotPathProvider.Consumer
	
	public Point<E> consume(Point<E> point, long time, double value, float x, float y) {
		appendSegment(x, y);
		return null;
	}
}
