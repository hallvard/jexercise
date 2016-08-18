package no.hal.emf.ui.parts.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Path;

public class PlotPath implements PlotPathProvider.Consumer {

	private Collection<Float> xys = new ArrayList<Float>();
	
	public int size() {
		return xys.size();
	}
	
	public void appendSegment(float x, float y) {
		xys.add(x);
		xys.add(y);
	}
	
	public Path toPath(Device device) {
		if (xys.size() < 2) {
			return null;
		}
		Path path = new Path(device);
		Iterator<Float> it = xys.iterator();
		float x = it.next(), y = it.next();
		path.moveTo(x, y);
		if (! it.hasNext()) {
			addPathPointMarker(path, x, y);
			// make sure a single point is visible
			path.lineTo(x - 3, y);
		} else {
			while (it.hasNext()) {
				x = it.next(); y = it.next();
				addPathSegment(path, x, y);
			}
		}
		return path;
	}

	protected void addPathSegment(Path path, float x, float y) {
		path.lineTo(x, y);
		addPathPointMarker(path, x, y);
		path.moveTo(x, y);
	}

	protected void addPathPointMarker(Path path, float x, float y) {
		path.lineTo(x, y - 2);
		path.lineTo(x, y + 2);
	}

	public void consume(long time, double value, float x, float y) {
		appendSegment(x, y);
	}
}
