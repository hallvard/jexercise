package no.hal.learning.exercise.jdt.metrics.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.amitinside.tooling.chart.SpiderChart;
import com.amitinside.tooling.chart.builder.AxesConfigurer;
import com.amitinside.tooling.chart.gc.AbstractChartColor;
import com.amitinside.tooling.chart.gc.swt.SpiderChartSwtColor;
import com.amitinside.tooling.chart.legend.SpiderChartLegend;
import com.amitinside.tooling.chart.plotter.spider.SpiderChartPlotter;
import com.amitinside.tooling.chart.sequence.DataSeq;
import com.amitinside.tooling.chart.sequence.LineDataSeq;
import com.amitinside.tooling.chart.style.LineStyle;
import com.amitinside.tooling.chart.swt.SpiderChartViewer;
import com.amitinside.tooling.chart.title.SpiderChartTitle;

import no.hal.learning.exercise.jdt.metrics.AbstractASTMetricsProvider;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.impl.FeatureListImpl;

public class MetricsView extends ViewPart {

	private TreeViewer featuresMapViewer;
	private EMap<String, FeatureValued> featuresMap = new BasicEMap<String, FeatureValued>();
	private EMap<String, FeatureValued> viewsMap = new BasicEMap<String, FeatureValued>();

	private Collection<Map.Entry<String, FeatureValued>> featuresEntries = new ArrayList<Map.Entry<String, FeatureValued>>();
	
	private SpiderChartViewer spider;

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		SashForm sash = new SashForm(parent, SWT.HORIZONTAL);
		sash.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		featuresMapViewer = new TreeViewer(sash, SWT.BORDER);
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		toolBarManager.add(refreshAction);
		featuresMapViewer.getTree().setHeaderVisible(true);
		featuresMapViewer.setContentProvider(new FeaturesMapContentProvider());
		
		featuresMapViewer.setInput(featuresEntries);

		TreeViewerColumn featureSetColumn = new TreeViewerColumn(featuresMapViewer, SWT.NONE);
		featureSetColumn.setLabelProvider(new MapEntryLabelCellProvider(true, null) {
			@Override
			protected String formatKey(String text) {
				return wordify(text, false);
			}
		});
		featureSetColumn.getColumn().setText("Name");
		featureSetColumn.getColumn().setWidth(150);

		TreeViewerColumn featureValueViewerColumn = new TreeViewerColumn(featuresMapViewer, SWT.NONE);
		featureValueViewerColumn.setLabelProvider(new MapEntryLabelCellProvider(false, Double.class) {
			@Override
			protected String formatValue(String text) {
				// remove decimals, since these are (mainly) counters
				return text.substring(0, text.lastIndexOf('.'));
			}
		});
		featureValueViewerColumn.getColumn().setText("Value");
		featureValueViewerColumn.getColumn().setWidth(50);
		featureValueViewerColumn.getColumn().setAlignment(SWT.RIGHT);

		spider = new SpiderChartViewer(sash, SWT.NONE);
		featuresMapViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateSpiderChart();
			}
		});

		parent.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				refreshAction.run();
			}
		});
		getSite().getPage().addPartListener(partListener);
	}

	private Action refreshAction = new Action("Refresh") {
		public void run() {
			updateView(getSite().getPage().getActiveEditor());
		}
	};

	private IPartListener partListener = new IPartListener() {
		@Override
		public void partActivated(IWorkbenchPart part) {
			updateView(part);
		}
		@Override
		public void partOpened(IWorkbenchPart part) {}
		@Override
		public void partDeactivated(IWorkbenchPart part) {}
		@Override
		public void partClosed(IWorkbenchPart part) {}
		@Override
		public void partBroughtToTop(IWorkbenchPart part) {}
	};
	
	@Override
	public void dispose() {
		getSite().getPage().removePartListener(partListener);
		super.dispose();
	}
	
	protected void updateView(IWorkbenchPart part) {
		if (part instanceof IEditorPart) {
			IJavaElement javaElement = JavaUI.getEditorInputJavaElement(((IEditorPart) part).getEditorInput());
			if (javaElement instanceof ICompilationUnit) {
				updateView((ICompilationUnit) javaElement);
			}
		}
	}

	private String[] colorNames = {
			AbstractChartColor.RED,
			AbstractChartColor.DARKGREEN,
			AbstractChartColor.BLUE,
			AbstractChartColor.DARKORANGE,
			AbstractChartColor.CYAN,
			AbstractChartColor.MAGENTA,
			AbstractChartColor.DARKGRAY,
	};
	protected String getColorName(int i) {
		return colorNames[i % colorNames.length];
	}

	protected void updateView(ICompilationUnit cu) {
		featuresMap.clear();
		featuresEntries.clear();
		AbstractASTMetricsProvider.addASTMetrics(cu, featuresMap);
		featuresEntries.addAll(featuresMap.entrySet());

		viewsMap.clear();
		for (IMetricsViewProvider viewProvider : Activator.getInstance().getMetricsViewProviders()) {
			FeatureValued features = viewProvider.getFeatures(featuresMap);
			String name = null;
			if (viewProvider instanceof DefaultMetricsViewProvider) {
				name = ((DefaultMetricsViewProvider) viewProvider).getName();
			} else if (features instanceof FeatureList) {
				name = ((FeatureList) features).getName();				
			}
			if (features != null && name != null) {
				viewsMap.put(name, features);
			}
		}
		featuresEntries.addAll(viewsMap.entrySet());
		featuresMapViewer.refresh();
		
		updateSpiderChart();

		featuresMapViewer.getControl().getParent().layout();
	}

	protected List<Entry<String, ? extends FeatureValued>> getFeatureMapEntries() {
		List<Entry<String, ? extends FeatureValued>> entries = new ArrayList<Entry<String, ? extends FeatureValued>>();
		Iterator<?> it = featuresMapViewer.getStructuredSelection().iterator();
		if (! it.hasNext()) {
			it = featuresMap.iterator();
		}
		while (it.hasNext()) {
			Object next = it.next();
			if (next instanceof Map.Entry<?, ?> && ((Map.Entry<?, ?>) next).getValue() instanceof FeatureValued) {
				Entry<String, ? extends FeatureValued> entry = (Map.Entry<String, ? extends FeatureValued>) next;
				entries.add(entry);
			}
		}
		return entries;
	}
	
	protected void updateSpiderChart() {
		AxesConfigurer.Builder acb = null;
		List<Entry<String, ? extends FeatureValued>> entries = getFeatureMapEntries();
		List<DataSeq> seqs = new ArrayList<DataSeq>();
		for (Entry<String, ? extends FeatureValued> entry : entries) {
			if (acb == null) {
				acb = new AxesConfigurer.Builder();
				FeatureValued fv = entry.getValue();
				for (String featureName : fv.getFeatureNames()) {
					acb.addAxis(featureName, 5.0, 0.0);
				}
				AbstractChartColor color = new SpiderChartSwtColor(getColorName(seqs.size()));
				LineDataSeq featureSeq = new LineDataSeq(FeatureListImpl.getFeatureDoubles(fv), LineStyle.of(2.0f, color, 0));
				seqs.add(featureSeq);
				break;
			}
		}
		SpiderChartTitle title = new SpiderChartTitle();
//		title.setText("Metrics");
		SpiderChartLegend legend = new SpiderChartLegend();
		for (int i = 0; i < seqs.size(); i++) {
			legend.addItem(entries.get(i).getKey(), getColorName(i));			
		}
		SpiderChartPlotter plotter = new SpiderChartPlotter();
		plotter.setSeq(seqs);
		plotter.use(acb.build());

		SpiderChart chart = new SpiderChart(title, plotter);
		chart.setLegend(legend);
		spider.setChart(chart);
		spider.redraw();
	}

	@Override
	public void setFocus() {
		featuresMapViewer.getControl().setFocus();
	}
}
