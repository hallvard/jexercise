package no.hal.learning.exercise.views.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterImpl;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.StringQuestion;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.ExerciseView;

public class TaskProposalPlotViewerAdapter extends EObjectViewerAdapterImpl<ExerciseProposals, Composite> implements EObjectViewerAdapter<ExerciseProposals, Composite>, PlotTransformController.Listener {

	private List<TaskProposal<?>> taskProposals = new ArrayList<TaskProposal<?>>();
	private TaskData taskData;
	private TimeScaler timeScaler;

	public TaskProposalPlotViewerAdapter(ExerciseProposals proposals) {
		super(proposals);
		for (Proposal<?> proposal : proposals.getAllProposals()) {
			if (proposal instanceof TaskProposal<?>) {
				this.taskProposals.add((TaskProposal<?>) proposal);				
			}
		}
	}

	protected void updateModel() {
		taskData = new TaskData(taskProposals);
		taskData.initGapData(10 * 60 * 1000); // ten minutes
		timeScaler = new TimeScaler(taskData, 1.0f / timeScale);
	}

	private static final int INITIAL_HEIGHT = 600;
	private static final int INITIAL_WIDTH = 800;

	private PlotTransformController plotTransformController;

	@Override
	public Composite initView(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		updateModel();

		canvas = new Canvas(container, SWT.NONE);
		canvas.setLayoutData(new GridData(GridData.FILL_BOTH));
		canvas.setSize(INITIAL_WIDTH, INITIAL_HEIGHT / 2);
		canvas.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		plotTransformController = new PlotTransformController();
		plotTransformController.setTaskData(taskData);
		plotTransformController.setTimeScaler(timeScaler);
		plotTransformController.createControls(canvas, container);
		plotTransformController.addListener(this);

		createPlotData(canvas.getSize());
		
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
				createPlotData(canvas.getSize());
			}
		});
		
		treeViewer = new CheckboxTreeViewer(container);
		treeViewer.setContentProvider(new ITreeContentProvider() {
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}			
			@Override
			public void dispose() {
			}
			
			@Override
			public Object getParent(Object element) {
				return (element instanceof PlotData ? ((PlotData) element).proposal : null);
			}
			
			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof TaskProposalPlotViewerAdapter) {
					Collection<TaskProposal<?>> proposals = new ArrayList<TaskProposal<?>>();
					for (PlotData plotData : plots) {
						if (plotData.proposal.getAttempts().size() > 0 && (! proposals.contains(plotData.proposal))) {
							proposals.add(plotData.proposal);
						}
					}
					return proposals.toArray();
				}
				return null;
			}
			
			@Override
			public boolean hasChildren(Object element) {
				return element instanceof TaskProposal<?>;
			}
			
			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof TaskProposal<?>) {
					TaskProposal<?> proposal = (TaskProposal<?>) parentElement;
					Collection<PlotData> proposalPlots = new ArrayList<TaskProposalPlotViewerAdapter.PlotData>();
					for (PlotData plotData : plots) {
						if (plotData.proposal == proposal) {
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
				if (element instanceof TaskProposal<?>) {
					TaskProposal<?> proposal = (TaskProposal<?>) element;
					Question question = proposal.getQuestion();
					return (question instanceof StringQuestion ? ((StringQuestion) question).getQuestion() : String.valueOf(taskProposals.indexOf(element) + 1));
				} else if (element instanceof PlotData) {
					return ((PlotData) element).feature.getName();
				}
				return super.getText(element);
			}
			@Override
			public Image getImage(Object element) {
				PlotData plotData = null;
				if (element instanceof TaskProposal<?>) {
					plotData = findPlotData((TaskProposal<?>) element, null, false);
				} else if (element instanceof PlotData) {
					plotData = (PlotData) element;
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
		for (TaskProposal<?> proposal : taskProposals) {
			treeViewer.setSubtreeChecked(proposal, true);			
		}
		treeViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				treeViewer.setSubtreeChecked(event.getElement(), event.getChecked());
				canvas.redraw();
			}
		});
		treeViewer.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		setView(container);
		return container;
	}

	@Override
	public void updateView() {
		updateModel();
		plotTransformController.setTaskData(taskData);
		plotTransformController.setTimeScaler(timeScaler);
		plotTransformController.updateView();
		plotTransformController.revealMaximum(false);
		updatePlot();
	}

	protected void updatePlot() {
		createPlotData(canvas.getSize());
		canvas.redraw();
	}

	@Override
	protected boolean isChangeNotification(Notification notification) {
		return super.isChangeNotification(notification) || (notification.getNotifier() instanceof TaskProposal<?> && notification.getFeature() == ExercisePackage.eINSTANCE.getTaskProposal_Attempts());
	}

	@Override
	public void setTarget(Notifier newTarget) {
		super.setTarget(newTarget);
		if (newTarget == eObject) {
			for (TaskProposal<?> taskProposal : taskProposals) {
				taskProposal.eAdapters().add(this);
			}
		}
	}

	private CheckboxTreeViewer treeViewer;
	private Canvas canvas;

	private int timeScale = 1000;

	private static class PlotData {
		TaskProposal<?> proposal;
		EStructuralFeature feature;
		int colorId;
		String dashes;
		PlotPath plotPath;
		Path devicePath;
		Image lineImage;

		void setData(TaskProposal<?> proposal, EStructuralFeature feature, int colorId, String dashes, PlotPath plotPath) {
			this.proposal = proposal;
			this.feature = feature;
			this.colorId = colorId;
			this.dashes = dashes;
			this.plotPath = plotPath;
			if (devicePath != null) {
				devicePath.dispose();
				devicePath = null;
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
	}
	
	private int[] colorIds = {
			SWT.COLOR_DARK_GREEN, SWT.COLOR_BLUE, SWT.COLOR_RED, SWT.COLOR_DARK_YELLOW, SWT.COLOR_DARK_CYAN, SWT.COLOR_MAGENTA
	};

	private List<PlotData> plots = new ArrayList<TaskProposalPlotViewerAdapter.PlotData>();

	private PlotData findPlotData(TaskProposal<?> proposal, EAttribute attr, boolean create) {
		for (PlotData plotData : plots) {
			if (plotData.proposal == proposal && plotData.feature == attr) {
				return plotData;
			}
		}
		if (create) {
			PlotData plotData = new PlotData();
			plotData.setData(proposal, attr, 0, null, null);
			plots.add(plotData);
			return plotData;
		}
		return null;
	}

	private Transform transform;
	private IPlotPathProvider plotPathProvider = new PlotPathProvider();

	@Override
	public void transformChanged(Transform transform) {
		if (this.transform != null) {
			this.transform.dispose();
		}
		this.transform = transform;
		updatePlot();
	}

	protected void createPlotData(Point plotAreaSize) {
		int num = 0;
		for (TaskProposal<?> proposal : taskProposals) {
			Collection<TaskEvent> taskEvents = taskData.getTaskEvents(proposal);
			if (taskEvents.size() == 0) {
				continue;
			}
			EClass eventClass = taskEvents.iterator().next().eClass();
			int plotCount = 0;
			int colorId = colorIds[num % colorIds.length];
			for (EAttribute attr : eventClass.getEAllAttributes()) {
				String dashes = EcoreUtil.getAnnotation(attr, ExerciseView.class.getName(), "dashes");
				if (dashes != null) {
					IEventValueProvider valueProvider = new EventAttributeValueProvider(attr);
					PlotPath plotPath = plotPathProvider.computePlotPath(taskData.getTaskEvents(proposal), valueProvider, timeScaler, transform, 10, plotAreaSize.y - 20, plotCount);
					PlotData plotData = findPlotData(proposal, attr, true);
					if (plotPath != null || plotData != null) {
						plotData.setData(proposal, attr, colorId, dashes, plotPath);
						plotCount++;
					}
				}
			}
			if (plotCount == 0) {
				PlotPath plotPath = plotPathProvider.computePlotPath(taskData.getTaskEvents(proposal), null, timeScaler, transform, 10, plotAreaSize.y - 20, plotCount);
				PlotData plotData = findPlotData(proposal, null, true);
				if (plotPath != null || plotData != null) {
					plotData.setData(proposal, null, colorId, null, plotPath);
				}
			}
			num++;
		}
	}

	@Override
	public void dispose() {
		dispose(transform);
		transform = null;
		for (PlotData plotData : plots) {
			dispose(plotData.lineImage);
			plotData.lineImage = null;
			dispose(plotData.devicePath);
			plotData.devicePath = null;
		}
		super.dispose();
	}

	protected void drawPlot(Canvas canvas, GC gc) {
		gc.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_GRAY));
		float scaledGapWidth = timeScaler.getScaledInterval(timeScaler.getGapWidth());
		for (int i = 0; i < taskData.gaps.length; i += 2) {
			long startTime = taskData.gaps[i];
			float x1 = timeScaler.getTimeValue(startTime), x2 = x1 + scaledGapWidth;
			if (transform != null) {
				float[] x1x2 = new float[]{x1, 0, x2, 0};
				transform.transform(x1x2);
				x1 = x1x2[0]; x2 = x1x2[2];
			}
			gc.fillRectangle((int) x1 + 3, 10, (int)(x2 - x1) - 3, canvas.getSize().y - 20);
		}
		for (PlotData plotData : plots) {
			if (treeViewer.getChecked(plotData) && plotData.plotPath != null) {
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

	public void addProposal(TaskProposal<?> proposal) {
		taskProposals.add(proposal);
	}
}
