package no.hal.learning.exercise.views.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;

import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.StringQuestion;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.ExerciseView;

public class PlotDialog extends Dialog {

	private static final int INITIAL_HEIGHT = 600;
	private static final int INITIAL_WIDTH = 800;

	protected PlotDialog(Shell parentShell) {
		super(parentShell);
	}

	protected Point getInitialSize() {
		return new Point(INITIAL_WIDTH, INITIAL_HEIGHT);
	}

	protected boolean isResizable() {
	    return true;
	}

	private CheckboxTreeViewer treeViewer;
	private Canvas canvas;
	private Slider minSlider, maxSlider;

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		for (TaskProposal<?> taskProposal : proposals) {
			for (TaskEvent event : taskProposal.getAttempts()) {
				long timestamp = event.getTimestamp();
				minT = Math.min(minT, timestamp);
				maxT = Math.max(maxT, timestamp);
			}
		}
		createPlotData(new Point(INITIAL_WIDTH, INITIAL_HEIGHT / 2));
		
		canvas = new Canvas(container, SWT.NONE);
		canvas.setLayoutData(new GridData(GridData.FILL_BOTH));
		canvas.setSize(INITIAL_WIDTH, INITIAL_HEIGHT / 2);
		canvas.setBackground(canvas.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		canvas.addListener(SWT.Paint, new Listener() {
			@Override
			public void handleEvent(Event event) {
				drawPlot(canvas, event.gc);
			}
		});
		canvas.addListener(SWT.Resize, new Listener() {
			@Override
			public void handleEvent(Event event) {
				createPlotData(canvas.getSize());
			}
		});

		Composite sliderComposite = new Composite(parent, SWT.NONE);
		sliderComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		sliderComposite.setLayout(new GridLayout(2, true));
		minSlider = new Slider(sliderComposite, SWT.HORIZONTAL);
		minSlider.setToolTipText("Lower time limit of plot");
		int sliderMax = (int)(maxT - minT);
		minSlider.setValues(0, 0, sliderMax, 1, 1, 10);
		minSlider.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		SelectionAdapter sliderListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				createPlotData(canvas.getSize());
				canvas.redraw();
			}
		};
		minSlider.addSelectionListener(sliderListener);
		maxSlider = new Slider(sliderComposite, SWT.HORIZONTAL);
		maxSlider.setToolTipText("Upper time limit of plot");
		maxSlider.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		maxSlider.setValues(sliderMax, 0, sliderMax + 1, 1, 1, 10);
		maxSlider.addSelectionListener(sliderListener);

		treeViewer = new CheckboxTreeViewer(parent);
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
				if (inputElement instanceof PlotDialog) {
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
					Collection<PlotData> proposalPlots = new ArrayList<PlotDialog.PlotData>();
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
					return (question instanceof StringQuestion ? ((StringQuestion) question).getQuestion() : String.valueOf(proposals.indexOf(element) + 1));
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
						plotData.lineImage = createPlotDataImage(plotData);
					}
					return plotData.lineImage;
				}
				return null;
			}
		});
		treeViewer.setInput(this);
		treeViewer.expandAll();
		for (TaskProposal<?> proposal : proposals) {
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

		return container;
	}
	
	private Image createPlotDataImage(PlotData plotData) {
		Control control = treeViewer.getControl();
		Image image = new Image(control.getDisplay(), 64, 16);
		GC gc = new GC(image);
		setDashes(plotData.dashes, gc);
		gc.setForeground(control.getDisplay().getSystemColor(plotData.colorId));
		gc.drawLine(0, 8, 64, 8);
		gc.dispose();
		return image;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	private List<TaskProposal<?>> proposals = new ArrayList<TaskProposal<?>>();

	private long minT = Long.MAX_VALUE, maxT = Long.MIN_VALUE;

	private static class PlotData {
		TaskProposal<?> proposal;
		EStructuralFeature feature;
		int colorId;
		String dashes;
		int[] polyPoints;
		Image lineImage;
		public void setData(TaskProposal<?> proposal, EStructuralFeature feature, int colorId, String dashes, int[] polyPoints) {
			this.proposal = proposal;
			this.feature = feature;
			this.colorId = colorId;
			this.dashes = dashes;
			this.polyPoints = polyPoints;
		}
	}
	
	private int[] colorIds = {
			SWT.COLOR_DARK_GREEN, SWT.COLOR_BLUE, SWT.COLOR_RED, SWT.COLOR_DARK_YELLOW, SWT.COLOR_DARK_CYAN, SWT.COLOR_MAGENTA
	};

	private List<PlotData> plots = new ArrayList<PlotDialog.PlotData>();

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
	
	protected void createPlotData(Point plotAreaSize) {
		long minT = Math.max(this.minT, (minSlider != null ? minSlider.getSelection() + this.minT : this.minT));
		long maxT = Math.min(this.maxT, (maxSlider != null ? maxSlider.getSelection() + this.minT : this.maxT));
		int num = 0;
		for (TaskProposal<?> proposal : proposals) {
			if (proposal.getAttempts().size() == 0) {
				continue;
			}
			EClass eventClass = proposal.getAttempts().get(0).eClass();
			int plotCount = 0;
			int colorId = colorIds[num % colorIds.length];
			for (EAttribute attr : eventClass.getEAllAttributes()) {
				String dashes = EcoreUtil.getAnnotation(attr, ExerciseView.class.getName(), "dashes");
				if (dashes != null) {
					int[] polyPoints = computePolylinePoints(proposal, attr, minT,  maxT, 5, plotAreaSize.x - 5, 10, plotAreaSize.y - 20, plotCount);
					PlotData plotData = findPlotData(proposal, attr, true);
					if (polyPoints != null || plotData != null) {
						plotData.setData(proposal, attr, colorId, dashes, polyPoints);
						plotCount++;
					}
				}
			}
			if (plotCount == 0) {
				int[] polyPoints = computePolylinePoints(proposal, null, minT,  maxT, 5, plotAreaSize.x - 5, 10, plotAreaSize.y - 20, plotCount);
				if (polyPoints != null) {
					PlotData plotData = findPlotData(proposal, null, true);
					plotData.setData(proposal, null, colorId, null, polyPoints);
				}
			}
			num++;
		}
	}

	@Override
	public boolean close() {
		for (PlotData plotData : plots) {
			if (plotData.lineImage != null && (! plotData.lineImage.isDisposed())) {
				plotData.lineImage.dispose();
			}
		}
		return super.close();
	}
	
	protected void drawPlot(Canvas canvas, GC gc) {
		for (PlotData plotData : plots) {
			if (treeViewer.getChecked(plotData) && plotData.polyPoints != null) {
				setDashes(plotData.dashes, gc);
				gc.setForeground(canvas.getDisplay().getSystemColor(plotData.colorId));
				gc.drawPolyline(plotData.polyPoints);
			}
		}
	}

	protected boolean plotAttribute(TaskProposal<?> taskProposal, EAttribute attr, String dashes, long min, long max, int num, int plotCount, GC gc) {
		setDashes(dashes, gc);
		Display display = canvas.getDisplay();
		gc.setForeground(display.getSystemColor(colorIds[num % colorIds.length]));
		Point size = canvas.getSize();
		int[] polyPoints = computePolylinePoints(taskProposal, attr, min,  max, 5, size.x - 5, 10, size.y - 20, plotCount);
		if (polyPoints != null) {
			gc.drawPolyline(polyPoints);
		}
		return polyPoints != null;
	}

	protected void setDashes(String dashes, GC gc) {
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

	private int[] computePolylinePoints(TaskProposal<?> taskProposal, EAttribute eventFeature, long minT, long maxT, int minX, int maxX, int minY, int maxY, int yOffset) {
		int valueNum = 0;
		EList<TaskEvent> attempts = taskProposal.getAttempts();
		float ys[] = new float[attempts.size()], maxValue = -1;
		long t = -1, firstT = -1, lastT = -1;
		int pointCount = 0;
		for (TaskEvent event : attempts) {
			t = event.getTimestamp();
			if (t >= minT && t <= maxT) {
				if (firstT < 0) {
					firstT = t;
				}
				lastT = t;
				pointCount++;
			}
			float y = valueNum;
			if (eventFeature != null) {
				try {
					y = ((Number) event.eGet(eventFeature)).floatValue();
				} catch (Exception e) {
				}
			}
			ys[valueNum] = y;
			maxValue = Math.max(maxValue, ys[valueNum]);
			valueNum++;
		}
		if (firstT > minT) {
			pointCount++;
		}
		if (lastT < maxT) {
			pointCount++;
		}

		if (minT >= maxT || pointCount <= 1) {
			return null;
		} else if (maxValue < 0) {
			return null;
		}
		int[] points = new int[pointCount * 2];
		valueNum = 0;
		int pointNum = 0;
		t = -1;
		float pX = 0, pY = 0;
		for (TaskEvent event : attempts) {
			t = event.getTimestamp();
			float y = ys[valueNum];
			pX = (t - minT) * (maxX - minX) / (maxT - minT) + minX;
			pY = maxY - (y == 0 ? y : y * (maxY - minY) / maxValue) + yOffset;
			if (t <= minT) {
				points[pointNum * 2 + 0] = (int) minX;
				points[pointNum * 2 + 1] = (int) pY;
			}
			if (t >= minT) {
				if (pointNum == 0 && t > minT) {
					if (valueNum == 0) {
						points[pointNum * 2 + 1] = (int) pY;
					}
					pointNum++;
				}
				points[pointNum * 2 + 0] = (int) pX;
				points[pointNum * 2 + 1] = (int) pY;
				pointNum++;
			}
			valueNum++;
			if (t > maxT) {
				break;
			}
		}
		if (t >= 0 && t < maxT) {
			points[pointNum * 2 + 0] = (int) maxX;
			points[pointNum * 2 + 1] = (int) pY;
		}
		return points;
	}

	public void addProposal(TaskProposal<?> proposal) {
		proposals.add(proposal);
	}
}
