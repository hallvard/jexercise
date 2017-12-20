package no.hal.consoleoutputview.plot;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.consoleoutputview.ConsoleOutputView;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.nebula.visualization.xygraph.dataprovider.CircularBufferDataProvider;
import org.eclipse.nebula.visualization.xygraph.figures.Trace;
import org.eclipse.nebula.visualization.xygraph.figures.Trace.PointStyle;
import org.eclipse.nebula.visualization.xygraph.figures.XYGraph;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class PlotView extends ViewPart implements ConsoleOutputView {

	public PlotView() {
	}

	private Canvas canvas;
	private XYGraph xyGraph;
	
	public void createPartControl(final Composite parent) {
		canvas = new Canvas(parent, SWT.NONE);
		final LightweightSystem lws = new LightweightSystem(canvas);

		//create a new XY Graph.
		xyGraph = new XYGraph();
		xyGraph.setTitle("Plot");

		//set it as the content of LightwightSystem
		lws.setContents(xyGraph);
	}
	
	private Collection<Trace> traces = new ArrayList<Trace>();
	
	@Override
	public void processConsoleOutput(String contents, boolean append, String qualifier) {
		String[] valueStrings = contents.split("[,;]");

		CircularBufferDataProvider dataProvider = new CircularBufferDataProvider(false);
		dataProvider.setBufferSize(valueStrings.length / 2);
		double[] xs = new double[valueStrings.length / 2];
		double[] ys = new double[xs.length];
		for (int i = 0; i < valueStrings.length; i += 2) {
			xs[i / 2] = Double.valueOf(valueStrings[i].trim());
			ys[i / 2] = Double.valueOf(valueStrings[i + 1].trim());
		}
		dataProvider.setCurrentXDataArray(xs);
		dataProvider.setCurrentYDataArray(ys);	
		
		Trace trace = new Trace(qualifier != null ? qualifier : "data", xyGraph.primaryXAxis, xyGraph.primaryYAxis, dataProvider);			
		trace.setPointStyle(PointStyle.POINT);

		if (! append) {
			for (Trace child : traces) {
				xyGraph.removeTrace(child);
			}
		}
		traces.add(trace);
		xyGraph.addTrace(trace);			
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (canvas != null && (! canvas.isDisposed())) {
			canvas.dispose();
			canvas = null;
		}
		if (xyGraph != null) {
			xyGraph = null;
		}
	}

	@Override
	public void setFocus() {
		canvas.setFocus();
	}
}
