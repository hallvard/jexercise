package no.hal.learning.exercise.views.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Path;

public class PlotPath {

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
		while (it.hasNext()) {
			x = it.next(); y = it.next();
			path.lineTo(x, y);
		}
		return path;
	}
}
