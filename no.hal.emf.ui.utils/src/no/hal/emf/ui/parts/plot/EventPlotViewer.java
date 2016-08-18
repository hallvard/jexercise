package no.hal.emf.ui.parts.plot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
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

public class EventPlotViewer<O, E> implements PlotTransformController.Listener {

	private IEventModel<O, E> eventModel;
	
	private List<O> owners = new ArrayList<O>();
	private EventData<O, E> eventData;
	private TimeScaler timeScaler;

	public EventPlotViewer(Collection<O> owners) {
		this.owners.addAll(owners);				
	}

	public void setEventModel(IEventModel<O, E> eventModel) {
		this.eventModel = eventModel;
	}

	protected void updateModel() {
		eventData = new EventData<O, E>(owners, eventModel);
		eventData.initGapData(10 * 60 * 1000); // ten minutes
		timeScaler = new TimeScaler(eventData, 1.0f / timeScale);
	}

	private static final int INITIAL_HEIGHT = 600;
	private static final int INITIAL_WIDTH = 800;

	private PlotTransformController plotTransformController;

	public Composite createControls(Composite parent) {
		SashForm sash = new SashForm(parent, SWT.VERTICAL);
		Composite plotComposite = new Composite(sash, SWT.NONE);
		GridLayout plotLayout = new GridLayout(1, true);
		plotLayout.marginWidth = 0;
		plotLayout.marginHeight = 0;
		plotComposite.setLayout(plotLayout);
		plotComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		updateModel();

		canvas = new Canvas(plotComposite, SWT.NONE);
		canvas.setLayoutData(new GridData(GridData.FILL_BOTH));
		canvas.setSize(INITIAL_WIDTH, INITIAL_HEIGHT / 2);
		canvas.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		plotTransformController = new PlotTransformController();
		plotTransformController.setTaskData(eventData);
		plotTransformController.setTimeScaler(timeScaler);
		plotTransformController.createControls(canvas, plotComposite);
		plotTransformController.addListener(this);

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
				plotTransformController.updateView();
				createPlotData();
			}
		});
		canvas.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseHover(MouseEvent e) {
				setPlotToolTips(e.x, e.y);
			}
		});
		
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
			}
		});
		treeViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));

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
		sash.setWeights(new int[]{50, 50});
		return sash;
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
					List<Point> points = allPlots.get(i).points;
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
					List<Point> points = allPlots.get(i).points;
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
					List<Point> points = plotData2.points;
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
					List<Point> points = plotData2.points;
					if (pos >= 0 && pos < points.size()) {
						Point point = points.get(pos);
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
					plotData.points.add(new Point(currentTime, (float) value));
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
		plotTransformController.setTaskData(eventData);
		plotTransformController.setTimeScaler(timeScaler);
		plotTransformController.updateView();
		plotTransformController.revealMaximum(false);
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
			SWT.COLOR_DARK_GREEN, SWT.COLOR_BLUE, SWT.COLOR_RED, SWT.COLOR_DARK_YELLOW, SWT.COLOR_DARK_CYAN, SWT.COLOR_MAGENTA, SWT.COLOR_DARK_GRAY,
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
	private PlotPathProvider plotPathProvider = new PlotPathProvider();

	@Override
	public void transformChanged(Transform transform) {
		if (this.transform != null) {
			this.transform.dispose();
		}
		this.transform = transform;
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
			PlotPath plotPath = new PlotPath();
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
		if (! resource.isDisposed()) {
			resource.dispose();
		}
	}
	
	public void dispose() {
		dispose(transform);
		transform = null;
		for (PlotData<O, E> plotData : allPlots) {
			dispose(plotData.lineImage);
			plotData.lineImage = null;
			dispose(plotData.devicePath);
			plotData.devicePath = null;
		}
	}

	private SimpleDateFormat toolTipDateFormat = new SimpleDateFormat("HH:mm E, F/MM-yy"); // new SimpleDateFormat("HH:mm E, F MMM yyyy");
	
	private void setPlotToolTips(final int x, final int y) {
		final double[] min = new double[]{-1, 0.0f, 0.0f};
		for (final PlotData<O, E> plotData : allPlots) {
			if ((plotData.owner == null || treeViewer.getChecked(plotData)) && plotData.plotPath != null) {
				int plotNum = allPlots.indexOf(plotData);
				plotPathProvider.provide(new PlotPathProvider.Consumer() {
					@Override
					public void consume(long time, double value, float fx, float fy) {
						float dx = fx - x, dy = fy - y;
						double squaredDistance = dx * dx + dy * dy;
						if (min[0] < 0 || squaredDistance < min[0]) {
							min[0] = squaredDistance;
							min[1] = time;
							min[2] = value;
						}
					}
				}, plotData.points, timeScaler, transform, 10, canvas.getSize().y - 20, plotNum);
			}
		}
		canvas.setToolTipText(min[0] > 0 && min[0] < 100 ? min[2] + " @ " + toolTipDateFormat.format(new Date((long) min[1])) : null);
	}

	protected void drawPlot(Canvas canvas, GC gc) {
		gc.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_GRAY));
		float scaledGapWidth = timeScaler.getScaledInterval(timeScaler.getGapWidth());
		for (int i = 0; i < eventData.gaps.length; i += 2) {
			long startTime = eventData.gaps[i];
			float x1 = timeScaler.getTimeValue(startTime), x2 = x1 + scaledGapWidth;
			if (transform != null) {
				float[] x1x2 = new float[]{x1, 0, x2, 0};
				transform.transform(x1x2);
				x1 = x1x2[0]; x2 = x1x2[2];
			}
			gc.fillRectangle((int) x1 + 3, 10, (int)(x2 - x1) - 3, canvas.getSize().y - 20);
		}
		for (PlotData<O, E> plotData : allPlots) {
			if ((plotData.owner == null || treeViewer.getChecked(plotData)) && plotData.plotPath != null) {
				plotData.setDashes(gc);
				gc.setLineWidth(1);
				gc.setForeground(canvas.getDisplay().getSystemColor(plotData.colorId));
				if (plotData.devicePath == null) {
					plotData.devicePath = plotData.plotPath.toPath(canvas.getDisplay());
				}
				gc.drawPath(plotData.devicePath);
			}
		}
	}

	public void addProposal(O owner) {
		owners.add(owner);
	}
}
