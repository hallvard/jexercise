package no.hal.emf.ui.parts.plot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import no.hal.emf.ui.parts.plot.PlotData.Point;
import no.hal.emf.ui.utils.TextPromptHelper;

public class EventPlotViewer<O, E> implements ISelectionProvider, PlotViewportController.Listener, TimepointSelectorController.Listener {

	private IEventModel<O, E> eventModel;
	
	private List<O> owners = new ArrayList<O>();
	private EventData<O, E> eventData;
	private TimeScaler timeScaler;

	public EventPlotViewer(Collection<O> owners, Config config) {
		this.owners.addAll(owners);
		this.config = config;
	}

	public EventPlotViewer(Collection<O> owners) {
		this(owners, new Config());
	}

	public void setEventModel(IEventModel<O, E> eventModel) {
		this.eventModel = eventModel;
	}

	protected void updateModel() {
		Collection<O> filteredOwners = new ArrayList<O>();
		for (O o : owners) {
			if (eventModel.isOwner(o)) {
				filteredOwners.add(o);
			}
		}
		eventData = new EventData<O, E>(filteredOwners, eventModel);
		eventData.initGapData(10 * 60 * 1000); // ten minutes
		timeScaler = new TimeScaler(eventData, 1.0f / timeScale);
	}

	private static final int INITIAL_HEIGHT = 600;
	private static final int INITIAL_WIDTH = 800;

	private PlotViewportController<O, E> plotTransformController;
	private TimepointSelectorController<O, E> timepointSelectorController;

	private Config config;

	protected void createExtraControls(Composite parent, int position) {
	}
	
	public Composite createControls(Composite parent) {
		SashForm sash = new SashForm(parent, SWT.VERTICAL);
		createExtraControls(sash, SWT.TOP);
		Composite plotComposite = new Composite(sash, SWT.NONE);
		GridLayout plotLayout = new GridLayout(1, true);
		plotLayout.marginWidth = 0;
		plotLayout.marginHeight = 0;
		plotLayout.verticalSpacing = 2;
		plotComposite.setLayout(plotLayout);
		plotComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		updateModel();

		canvas = new Canvas(plotComposite, SWT.NONE);
		canvas.setLayoutData(new GridData(GridData.FILL_BOTH));
		canvas.setSize(INITIAL_WIDTH, INITIAL_HEIGHT / 2);
		canvas.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		if (config.showViewportControls) {
			plotTransformController = new PlotViewportController<O, E>();
			plotTransformController.setTaskData(eventData);
			plotTransformController.setTimeScaler(timeScaler);
			plotTransformController.setPointSelector(getPointSelector());
			plotTransformController.createControls(canvas, plotComposite);
			plotTransformController.addListener(this);
		}
		if (config.showTimepointSelectorControls) {
			timepointSelectorController = new TimepointSelectorController<O, E>(pointSelector);
			timepointSelectorController.createControls(plotComposite);
			timepointSelectorController.addListener(this);
		}

		createPlotData();
		
		canvas.addListener(SWT.Paint, new Listener() {
			@Override
			public void handleEvent(Event event) {
				drawPlot(canvas, event.gc);
			}
		});
		canvas.addListener(SWT.Resize, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (plotTransformController != null) {
					plotTransformController.updateView();
				}
				if (timepointSelectorController != null) {
					timepointSelectorController.setViewportSize(canvas.getSize());
					timepointSelectorController.updateView();
				}
				createPlotData();
			}
		});
		canvas.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseHover(MouseEvent e) {
				setPlotToolTips(e.x, e.y, -1);
			}
		});
		MouseSelectionListener mouseSelectionListener = new MouseSelectionListener();
		canvas.addMouseListener(mouseSelectionListener);
		canvas.addMouseMoveListener(mouseSelectionListener);

		createExtraControls(sash, SWT.CENTER);

		if (config.showEventFilterControls) {
			Composite filterContainer = new Composite(sash, SWT.NONE);
			GridLayout layout = new GridLayout(1, true);
			layout.marginWidth = 0;
			layout.marginHeight = 0;
			filterContainer.setLayout(layout);
			filterContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
			treeViewer = new CheckboxTreeViewer(filterContainer);
			treeViewer.setContentProvider(new ITreeContentProvider() {
				@Override
				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				}			
				@Override
				public void dispose() {
				}
				
				@Override
				public Object getParent(Object element) {
					return (element instanceof PlotData ? ((PlotData<O, E>) element).owner : null);
				}
				
				@Override
				public Object[] getElements(Object inputElement) {
					if (inputElement instanceof EventPlotViewer) {
						Collection<Object> ownersAndExpressions = new ArrayList<Object>();
						ownersAndExpressions.addAll(eventData.eventOwners);
						ownersAndExpressions.addAll(expressionPlots);
						return ownersAndExpressions.toArray();
					}
					return null;
				}
				
				@Override
				public boolean hasChildren(Object element) {
					return eventModel.isOwner(element);
				}
				
				@Override
				public Object[] getChildren(Object parentElement) {
					if (eventModel.isOwner(parentElement)) {
						O proposal = (O) parentElement;
						Collection<PlotData<O, E>> proposalPlots = new ArrayList<PlotData<O, E>>();
						for (PlotData<O, E> plotData : allPlots) {
							if (plotData.owner == proposal) {
								proposalPlots.add(plotData);
							}
						}
						return proposalPlots.toArray();
					}
					return null;
				}
			});
			treeViewer.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (eventModel.isOwner(element)) {
						return eventModel.getText((O) element);
					} else if (element instanceof PlotData) {
						return ((PlotData<O, E>) element).name;
					}
					return super.getText(element);
				}
				@Override
				public Image getImage(Object element) {
					PlotData<O, E> plotData = null;
					if (eventModel.isOwner(element)) {
						plotData = findPlotData(allPlots, (O) element, null, null, null);
					} else if (element instanceof PlotData) {
						plotData = (PlotData<O, E>) element;
					}
					if (plotData != null) {
						if (plotData.lineImage == null) {
							plotData.initPlotDataImage(treeViewer.getControl().getDisplay());
						}
						return plotData.lineImage;
					}
					return null;
				}
			});
			treeViewer.setInput(this);
			treeViewer.expandAll();
			for (O proposal : owners) {
				treeViewer.setSubtreeChecked(proposal, true);			
			}
			treeViewer.addCheckStateListener(new ICheckStateListener() {
				@Override
				public void checkStateChanged(CheckStateChangedEvent event) {
					treeViewer.setSubtreeChecked(event.getElement(), event.getChecked());
					canvas.redraw();
					treeStateChanged(event);
				}
			});
			treeViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
			if (config.showExpressionControls) {
				Composite expressionComposite = new Composite(filterContainer, SWT.NONE);
				expressionComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				GridLayout expressionLayout = new GridLayout(2, false);
				expressionLayout.marginWidth = 0;
				expressionLayout.marginHeight = 0;
				expressionComposite.setLayout(expressionLayout);
				final Text expressionNameField = new Text(expressionComposite, SWT.BORDER);
				new TextPromptHelper(expressionNameField, "<expr name>");
				final Text expressionBodyField = new Text(expressionComposite, SWT.BORDER);
				new TextPromptHelper(expressionBodyField, "<expression body goes here, use other plot values (curves) as terms>");
				expressionBodyField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				expressionBodyField.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						provideExpressionPlotData(expressionNameField.getText(), expressionBodyField.getText());
					}
				});
			}
		}
		createExtraControls(sash, SWT.BOTTOM);
		int sashChildCount = sash.getChildren().length;
		if (sashChildCount > 0) {
			int[] weights = new int[sashChildCount];
			Arrays.fill(weights, 1);
			sash.setWeights(weights);
		}
		return sash;
	}

	protected boolean isChecked(Object element) {
		return treeViewer == null || treeViewer.getChecked(element);
	}

	protected void treeStateChanged(CheckStateChangedEvent event) {
	}

	protected void provideExpressionPlotData(String name, String body) {
		PlotData<O, E> plotData = findPlotData(allPlots, null, name, null, null);
		if (plotData != null) {
			plotData.points.clear();
			int currentPlotPos[] = new int[allPlots.size()], maxPlotPos = allPlots.indexOf(plotData);
			Arrays.fill(currentPlotPos, -1);
			long currentTime = eventData.minT;
			while (currentTime < eventData.maxT) {
				// find nextTime
				long nextTime = eventData.maxT;
				for (int i = 0; i < maxPlotPos; i++) {
					int pos = currentPlotPos[i];
					List<Point<E>> points = allPlots.get(i).points;
					if (pos + 1 < points.size()) {
						long nextTime2 = points.get(pos + 1).timestamp;
						if (nextTime2 < nextTime) {
							nextTime = nextTime2;
						}
					}
				}
				currentTime = nextTime;
				// update positions
				for (int i = 0; i < maxPlotPos; i++) {
					int pos = currentPlotPos[i];
					List<Point<E>> points = allPlots.get(i).points;
					if (pos + 1 < points.size() && points.get(pos + 1).timestamp <= currentTime) {
						currentPlotPos[i] = pos + 1;
					}
				}
				// add variables
				ExpressionBuilder expressionBuilder = null;
				try {
					expressionBuilder = new ExpressionBuilder(body);
				} catch (RuntimeException e) {
					continue;
				}
				for (int i = 0; i < maxPlotPos; i++) {
					int pos = currentPlotPos[i];
					PlotData<O, E> plotData2 = allPlots.get(i);
					List<Point<E>> points = plotData2.points;
					if (pos >= 0 && pos < points.size() && points.get(pos).timestamp <= currentTime) {
						String varName = (plotData2.owner != null ? getOwnerVariableName(plotData2.owner) + "_" + plotData2.name : plotData2.name);
						expressionBuilder.variable(varName);
					}
				}
				// add variable values
				Expression expression = null;
				try {
					expression = expressionBuilder.build();
				} catch (RuntimeException e) {
					continue;
				}
				for (int i = 0; i < maxPlotPos; i++) {
					int pos = currentPlotPos[i];
					PlotData<O, E> plotData2 = allPlots.get(i);
					List<Point<E>> points = plotData2.points;
					if (pos >= 0 && pos < points.size()) {
						Point<E> point = points.get(pos);
						if (point.timestamp <= currentTime) {
							String varName = getOwnerVariableName(plotData2.owner) + "_" + plotData2.name;
							expressionBuilder.variable(varName);
							expression.setVariable(varName, point.value);
						}
					}
				}
				// compute new expression value
				if (! expression.validate().isValid()) {
					continue;
				}
				try {
					double value = expression.evaluate();
					plotData.points.add(new Point<E>(null, name, currentTime, (float) value));
				} catch (RuntimeException e) {
				}
			}
			providePlotData(null, name, null, null);
			canvas.redraw();
			if (! expressionPlots.contains(plotData)) {
				expressionPlots.add(plotData);
				treeViewer.refresh();
				treeViewer.setChecked(plotData, true);
			}
		}
	}
	
	public String getOwnerVariableName(O owner) {
		int pos = eventData.eventOwners.indexOf(owner);
		if (pos >= 0) {
			return String.valueOf((char) ('a' + pos));
		}
		return null;
	}
	
	public void updateView() {
		updateModel();
		if (plotTransformController != null) {
			plotTransformController.setTaskData(eventData);
			plotTransformController.setTimeScaler(timeScaler);
			plotTransformController.updateView();
			plotTransformController.revealMaximum(false);
		}
		if (timepointSelectorController != null) {
			timepointSelectorController.setViewportSize(canvas.getSize());
			timepointSelectorController.updateView();
		}
		updatePlot();
		treeViewer.refresh();
	}

	protected void updatePlot() {
		createPlotData();
		canvas.redraw();
	}

	private CheckboxTreeViewer treeViewer;
	private Canvas canvas;

	private int timeScale = 1000;

	private int[] colorIds = {
			SWT.COLOR_DARK_GREEN, SWT.COLOR_BLUE, SWT.COLOR_RED, SWT.COLOR_DARK_YELLOW, SWT.COLOR_DARK_CYAN, SWT.COLOR_MAGENTA, SWT.COLOR_DARK_GRAY, SWT.COLOR_CYAN,
	};
	private String[] dashes = {
			"SOLID",
			// int[] dashChars = { '_', 4, '-', 2, '.', 1, ' ', 2, '\t', 4 }; 
			"_ ", "- ", ". ", "_ - ", "_ . ", "- . ",
			"DASH", "DOT", "DASHDOT", "DASHDOTDOT",
	};

	private List<PlotData<O, E>> allPlots = new ArrayList<PlotData<O, E>>(), expressionPlots = new ArrayList<PlotData<O, E>>();

	private PlotData<O, E> findPlotData(Collection<PlotData<O, E>> plots, O owner, String name, ITimestampProvider<E> timestampProvider, IValueProvider<E, Number> valueProvider) {
		for (PlotData<O, E> plotData : plots) {
			if (plotData.owner == owner && (name == null || name.equals(plotData.name))) {
				return plotData;
			}
		}
		PlotData<O, E> plotData = new PlotData<O, E>();
		plotData.setModelData(owner, eventData.getEvents(owner), name, timestampProvider, valueProvider);
		if (owner != null && plotData.points.isEmpty()) {
			return null;
		}
		plots.add(plotData);
		return plotData;
	}

	private Transform transform;
	private PlotPathProvider<E> plotPathProvider = new PlotPathProvider<E>();

	@Override
	public void viewportChanged(Transform transform) {
		if (this.transform != null) {
			this.transform.dispose();
		}
		this.transform = transform;
		updatePlot();
	}

	@Override
	public void timepointChanged(long timepoint) {
		if (timepoint >= 0) {
			setSelection(timepoint, timepoint);
		} else {
			setSelection(null);
		}
		updatePlot();
	}

	protected void createPlotData() {
		for (O owner : eventData.eventOwners) {
			Collection<E> events = eventData.getEvents(owner);
			if (events.isEmpty()) {
				continue;
			}
			E eventSample = events.iterator().next();
			Collection<IValueProvider<E, Number>> valueProviders = eventModel.getValueProviders(eventSample);
			int plotCount = 0;
			for (IValueProvider<E, Number> valueProvider : valueProviders) {
				PlotData<O, E> plotData = providePlotData(owner, valueProvider.getName(), eventModel, valueProvider);
				if (plotData != null && (! plotData.points.isEmpty())) {
					plotCount++;
				}
			}
			if (plotCount == 0) {
				PlotData<O, E> plotData = providePlotData(owner, "count", null, null);
				if (plotData != null) {
					plotCount++;
				}
			}
		}
	}

	private PlotData<O, E> providePlotData(O owner, String name, ITimestampProvider<E> timestampProvider, IValueProvider<E, Number> valueProvider) {
		PlotData<O, E> plotData = findPlotData(allPlots, owner, name, timestampProvider, valueProvider);
		if (plotData != null) {
			int plotNum = allPlots.indexOf(plotData);
			PlotPath<E> plotPath = new PlotPath<E>();
			plotPathProvider.provide(plotPath, plotData.points, timeScaler, transform, 10, canvas.getSize().y - 20, plotNum);
			plotData.setViewData(getColor(plotData), getDashes(plotData), plotPath);
		}
		return plotData;
	}

	protected int getColor(PlotData<O, E> plotData) {
		int ownerNum = eventData.eventOwners.indexOf(plotData.owner) + 1;
		return colorIds[ownerNum % colorIds.length];
	}
	
	protected String getDashes(PlotData<O, E> plotData) {
		int dashNum = 0;
		for (PlotData<O, E> plotData2 : allPlots) {
			if (plotData2 == plotData) {
				break;
			}
			if (plotData2.owner == plotData.owner) {
				dashNum++;
			}
		}
		return dashes[dashNum % dashes.length];
	}

	private void dispose(Resource resource) {
		if (resource != null && (! resource.isDisposed())) {
			resource.dispose();
		}
	}
	
	public void dispose() {
		dispose(transform);
		transform = null;
		for (PlotData<O, E> plotData : allPlots) {
			dispose(plotData.lineImage);
			plotData.lineImage = null;
			if (plotData.devicePath instanceof Resource) {
				dispose((Resource) plotData.devicePath);
			}
			plotData.devicePath = null;
		}
	}

	protected void setSelection(long minTime, long maxTime) {
		List<Point<E>> events = new ArrayList<PlotData.Point<E>>();
		for (PlotData<O, E> plot : allPlots) {
			for (Point<E> event : plot.points) {
				if (event.timestamp >= minTime && event.timestamp <= maxTime) {
					events.add(event);
				}
			}
		}
		setSelection(new StructuredSelection(events));
	}
	
	private PointSelector pointSelector = new PointSelector();
	
	public PointSelector getPointSelector() {
		return pointSelector;
	}

	public Collection<Point<E>> getSelection(org.eclipse.swt.graphics.Point p1, org.eclipse.swt.graphics.Point p2) {
		// find points close to cursor
		pointSelector.setMaxD(50, 0, 0);
		boolean isRectangleSelection = Math.abs(p1.x - p2.x) > 5 || Math.abs(p1.y - p2.y) > 5;
		Collection<Point<E>> points = (isRectangleSelection ? pointSelector.selectPoints(p1.x, p1.y, p2.x, p2.y) : pointSelector.selectPoints(p2.x, p2.y));
		return points;
	}

	public void setSelection(org.eclipse.swt.graphics.Point p1, org.eclipse.swt.graphics.Point p2) {
		Collection<Point<E>> points = getSelection(p1, p2);
		setSelection(new StructuredSelection(new ArrayList<Object>(points)));
	}
	
	private SimpleDateFormat toolTipDateFormat = new SimpleDateFormat("HH:mm E, dd/MM-yy"); // new SimpleDateFormat("HH:mm E, F MMM yyyy");
	
	static String formatTime(long timestamp, DateFormat dateFormat) {
		Date date = new Date(timestamp);
		return (dateFormat != null ? dateFormat.format(date) : date.toString());
	}
	
	private void setPlotToolTips(int x, int y, int count) {
		PointSelector pointSelector = new PointSelector();
		// find points close to cursor
		pointSelector.setMaxD(50, 0, 0);
		Collection<Point<E>> points = pointSelector.selectPoints(x, y);
		if (points.isEmpty()) {
			// find points close to cursor along time axis
			pointSelector.setMaxD(0, 10, 0);
			points = pointSelector.selectPoints(x, y);
		}
		String text = null;
		for (Point<E> lastPoint : points) {
			if (count == 0) {
				break;
			}
			String toolTipText = String.valueOf(lastPoint.value), eventText = null;
			if (lastPoint.event != null) {
				eventText = lastPoint.name + " of " + eventModel.getText(lastPoint.event);
			}
			if (eventText != null) {
				if (toolTipText != null) {
					toolTipText += " for " + eventText;
				} else {
					toolTipText = eventText;
				}
			}
			System.out.println("Tool tip for " + lastPoint.timestamp);
			toolTipText += " @ " + formatTime(lastPoint.timestamp, toolTipDateFormat);
			if (text == null) {
				text = toolTipText;
			} else {
				text = text + "\n" + toolTipText;
			}
			count--;
		}
		canvas.setToolTipText(text);
	}
	
	protected Collection<PlotData<O, E>> getActivePlots() {
		Collection<PlotData<O, E>> plots = new ArrayList<PlotData<O,E>>();
		for (PlotData<O, E> plotData : allPlots) {
			if ((plotData.owner == null || treeViewer.getChecked(plotData)) && plotData.plotPath != null) {
				plots.add(plotData);
			}
		}
		return plots;
	}
	
	protected void drawPlot(Canvas canvas, GC gc) {
		gc.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_GRAY));
		float scaledGapWidth = timeScaler.getScaledInterval(timeScaler.getGapWidth());
		int leftMargin = 2, topMargin = 8, bottomMargin = 20, height = canvas.getSize().y - bottomMargin;
		for (int i = 0; i < eventData.gaps.length; i += 2) {
			long startTime = eventData.gaps[i];
			float x1 = timeScaler.getTimeValue(startTime), x2 = x1 + scaledGapWidth;
			if (transform != null) {
				float[] x1x2 = new float[]{x1, 0, x2, 0};
				transform.transform(x1x2);
				x1 = x1x2[0]; x2 = x1x2[2];
			}
			gc.fillRectangle((int) x1 + leftMargin, topMargin, (int)(x2 - x1), height);
		}
		long selMin = Long.MAX_VALUE, selMax = Long.MIN_VALUE;
		Iterator<?> selection = getSelection() instanceof IStructuredSelection ? ((IStructuredSelection) getSelection()).iterator() : Collections.singleton(getSelection()).iterator();
		while (selection.hasNext()) {
			Object next = selection.next();
			if (next instanceof PlotData.Point<?>) {
				long timestamp = ((PlotData.Point<?>) next).timestamp;
				if (timestamp < selMin) {
					selMin = timestamp;
				}
				if (timestamp > selMax) {
					selMax = timestamp;
				}
			}
		}
		if (selMin < Long.MAX_VALUE && selMax > Long.MIN_VALUE) {
			gc.setForeground(gc.getDevice().getSystemColor(SWT.COLOR_BLUE));
			gc.setLineStyle(SWT.LINE_SOLID);
			float minX = timeScaler.getTimeValue(selMin), maxX = timeScaler.getTimeValue(selMax);
			if (transform != null) {
				float[] x1x2 = new float[]{minX, 0, maxX, 0};
				transform.transform(x1x2);
				minX = x1x2[0]; maxX = x1x2[2];
			}
			gc.drawRectangle((int) minX + leftMargin - 1, topMargin, (int)(maxX - minX) + 1, height);
		}
		for (PlotData<O, E> plotData : getActivePlots()) {
			plotData.setDashes(gc);
			gc.setLineWidth(1);
			gc.setForeground(canvas.getDisplay().getSystemColor(plotData.colorId));
			if (plotData.devicePath == null) {
				plotData.devicePath = plotData.plotPath.toPath(canvas.getDisplay());
			}
			plotData.plotPath.drawPath(plotData.devicePath, gc);
		}
	}

	public void addProposal(O owner) {
		owners.add(owner);
	}
	
	//
	
	public class PointSelector {

		private double maxD = 0d, maxDx = 0d, maxDy = 0;
		
		public void setMaxD(double maxD, double maxDx, double maxDy) {
			this.maxD = maxD;
			this.maxDx = maxDx;
			this.maxDy = maxDy;
		}
		
		public Collection<Point<E>> selectPoints(final int x, final int y) {
			final List<Point<E>> points = new ArrayList<PlotData.Point<E>>();
			final double[] min = new double[]{-1};
			for (final PlotData<O, E> plotData : getActivePlots()) {
				int plotNum = allPlots.indexOf(plotData);
				plotPathProvider.provide(new PlotPathProvider.Consumer<E>() {
					@Override
					public Point<E> consume(Point<E> point, long time, double value, float fx, float fy) {
						float dx = fx - x, dy = fy - y;
						double squaredDistance = dx * dx + dy * dy;
						if ((maxD <= 0.0d || squaredDistance <= maxD) && (maxDx <= 0.0d || Math.abs(dx) <= maxDx) && (maxDy <= 0.0d || Math.abs(dy) <= maxDy)) {
							if (min[0] < 0 || squaredDistance < min[0]) {
								min[0] = squaredDistance;
								points.add(0, point);
							} else {
								points.add(point);
							}
						}
						return null;
					}
				}, plotData.points, timeScaler, transform, 10, canvas.getSize().y - 20, plotNum);
			}
			return points;
		}
		
		public Collection<Point<E>> selectPoints(final int x1, final int y1, final int x2, final int y2) {
			final List<Point<E>> points = new ArrayList<PlotData.Point<E>>();
			for (final PlotData<O, E> plotData : allPlots) {
				if ((plotData.owner == null || treeViewer.getChecked(plotData)) && plotData.plotPath != null) {
					int plotNum = allPlots.indexOf(plotData);
					plotPathProvider.provide(new PlotPathProvider.Consumer<E>() {
						@Override
						public Point<E> consume(Point<E> point, long time, double value, float fx, float fy) {
							int minX = Math.min(x1, x2), maxX = Math.max(x1, x2), minY = Math.min(y1, y2), maxY = Math.max(y1, y2);
							if ((maxX - minX <= maxDx || fx >= minX && fx <= maxX) && (maxY - minY <= maxDy || fy >= minY && fy <= maxY)) {
								points.add(point);
							}
							return null;
						}
					}, plotData.points, timeScaler, transform, 10, canvas.getSize().y - 20, plotNum);
				}
			}
			return points;
		}
	}
	
	//
	
	private ISelection selection = StructuredSelection.EMPTY;
	
	private Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>(); 
	
	@Override
	public ISelection getSelection() {
		return selection;
	}
	
	@Override
	public void setSelection(ISelection selection) {
		this.selection = selection;
		fireSelectionChanged();
		canvas.redraw();
	}
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}
	
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	
	protected void fireSelectionChanged() {
		if (! selectionChangedListeners.isEmpty()) {
			SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
			for (ISelectionChangedListener listener : selectionChangedListeners) {
				listener.selectionChanged(event);
			}
		}
	}
	
	public static class Config {
		
		public Config() {
		}
		public Config(Config defaults) {
			this.showEventFilterControls 	= defaults.showEventFilterControls;
			this.showExpressionControls 	= defaults.showExpressionControls;
			this.showViewportControls 		= defaults.showViewportControls;
			this.showTimepointSelectorControls 	= defaults.showTimepointSelectorControls;
		}
		public boolean showEventFilterControls = true;
		public boolean showExpressionControls = false;
		public boolean showViewportControls = true;
		public boolean showTimepointSelectorControls = true;
	}
	
	public class MouseSelectionListener implements MouseListener, MouseMoveListener {

		private MouseEvent downEvent = null;

		private void setSelection(MouseEvent e1, MouseEvent e2) {
			EventPlotViewer.this.setSelection(new org.eclipse.swt.graphics.Point(e1.x, e1.y), new org.eclipse.swt.graphics.Point(e1.x, e1.y));
		}

		@Override
		public void mouseDown(MouseEvent e) {
			downEvent = e;
			setSelection(e, e);
		}
		@Override
		public void mouseUp(MouseEvent e) {
			setSelection(downEvent, e);
			downEvent = null;
		}
		@Override
		public void mouseDoubleClick(MouseEvent e) {
			
		}
		@Override
		public void mouseMove(MouseEvent e) {
			if (downEvent != null) {
				setSelection(downEvent, e);
			}
		}
	}
}
