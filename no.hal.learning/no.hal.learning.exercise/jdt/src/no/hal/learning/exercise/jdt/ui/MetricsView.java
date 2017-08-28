package no.hal.learning.exercise.jdt.ui;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import no.hal.learning.exercise.jdt.metrics.AbstractASTMetricsProvider;
import no.hal.learning.fv.FeatureValued;

public class MetricsView extends ViewPart {

	private TreeViewer featuresMapViewer;
	private EMap<String, FeatureValued> featuresMap = new BasicEMap<String, FeatureValued>();

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		featuresMapViewer = new TreeViewer(parent, SWT.BORDER);
		featuresMapViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		toolBarManager.add(refreshAction);
		featuresMapViewer.getTree().setHeaderVisible(true);
		featuresMapViewer.setContentProvider(new FeaturesMapContentProvider());
		
		featuresMapViewer.setInput(featuresMap);

		TreeViewerColumn featureSetColumn = new TreeViewerColumn(featuresMapViewer, SWT.NONE);
		featureSetColumn.setLabelProvider(new MapEntryLabelCellProvider(true, null) {
			@Override
			protected String formatKey(String text) {
				return wordify(text, false);
			}
		});
		featureSetColumn.getColumn().setText("Name");
		featureSetColumn.getColumn().setWidth(250);

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

	protected void updateView(ICompilationUnit cu) {
		featuresMap.clear();
		AbstractASTMetricsProvider.addASTMetrics(cu, featuresMap);
		featuresMapViewer.refresh();
		featuresMapViewer.getControl().getParent().layout();
	}

	@Override
	public void setFocus() {
		featuresMapViewer.getControl().setFocus();
	}
}
