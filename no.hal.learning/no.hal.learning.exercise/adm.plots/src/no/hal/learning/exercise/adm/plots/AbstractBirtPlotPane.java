package no.hal.learning.exercise.adm.plots;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import no.hal.learning.exercise.adm.AbstractChartPane;
import no.hal.learning.exercise.adm.plots.util.InputProvider;
import no.hal.learning.exercise.adm.plots.util.TextInputHandler;
import no.hal.learning.exercise.adm.plots.util.TextInputProvider;

public abstract class AbstractBirtPlotPane<C extends Chart> extends AbstractChartPane {

	private PlotCanvas plotCanvas;

	public void createControls(Composite composite) {
		createConfigControls(composite);
		createPlotControls(composite);
	}

	protected void createConfigControls(Composite composite) {
	}
	
	protected Text createTextField(Composite composite, String labelString, Object initialValue) {
		if (labelString != null) {
			Label label = new Label(composite, SWT.NONE);
			label.setText(labelString);
		}
		Text text = new Text(composite, SWT.NONE);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		if (initialValue != null) {
			text.setText(String.valueOf(initialValue));
		}
		return text;
	}
	
	protected <T> InputProvider<T> createTextField(Composite composite, String labelString, Object initialValue, TextInputHandler<T> inputHandler) {
		if (labelString != null) {
			Label label = new Label(composite, SWT.NONE);
			label.setText(labelString);
		}
		Text text = new Text(composite, SWT.NONE);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		if (initialValue != null) {
			text.setText(String.valueOf(initialValue));
		}
		return new TextInputProvider<T>(text, inputHandler);
	}

	protected void createPlotControls(Composite composite) {
		plotCanvas = new PlotCanvas(composite, SWT.NONE);
		plotCanvas.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}
	
	private C chart;

	public void updateChart(ResourceSet resourceSet) {
		if (chart == null) {
			chart = createChart(resourceSet);
		}
		updateChart(chart, resourceSet);
		plotCanvas.clearImageCache();
		plotCanvas.redraw();
	}

	protected abstract C createChart(ResourceSet resourceSet);
	protected abstract void updateChart(C chart, ResourceSet resourceSet);

	private class PlotCanvas extends Canvas implements PaintListener {

		private IDeviceRenderer render;
		private GeneratedChartState state;
		private Image cachedImage = null;

		public PlotCanvas(Composite parent, int style) {
			super(parent, style);
			addPaintListener(this);
		}

		private void clearImageCache() {
			if (cachedImage != null) {
				cachedImage.dispose();
			}
			cachedImage = null;
		}
		
		public void paintControl(PaintEvent e) {
			if (chart != null) {
				final Rectangle rect = ((Composite) e.getSource()).getClientArea();
				if (cachedImage == null) {
					buildAndDrawChart(rect);
				}
				if (cachedImage != null) {
					e.gc.drawImage(cachedImage, 0, 0, cachedImage.getBounds().width, cachedImage.getBounds().height,
							0, 0, rect.width, rect.height);
				}
			}
		}

		private void buildAndDrawChart(Rectangle size) {
			GC gc = null;
			try {
				if (render == null) {
					render = PluginSettings.instance().getDevice("dv.SWT");
				}
				clearImageCache();
				cachedImage = new Image(Display.getCurrent(), size);
				gc = new GC(cachedImage);
//				gc.setBackground(getDisplay().getSystemColor(SWT.COLOR_GRAY));
//				gc.fillRectangle(size);
				
				Bounds bo = BoundsImpl.create(0, 0, size.width, size.height);
				bo.scale(72d / render.getDisplayServer().getDpiResolution());
				render.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, gc);
				state = Generator.instance().build(render.getDisplayServer(), chart, bo, null, null, null);
				Generator.instance().render(render, state);
			} catch (Exception cex) {
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				PrintStream stream = new PrintStream(output);
				cex.printStackTrace(stream);
				stream.close();
				gc.drawText(output.toString(), 5, 5, false);
				System.err.println("buildAndDrawChart: " + cex);
				cex.printStackTrace(System.err);
			} finally {
				if (gc != null) {
					gc.dispose();
				}
			}
		}
	}
}
