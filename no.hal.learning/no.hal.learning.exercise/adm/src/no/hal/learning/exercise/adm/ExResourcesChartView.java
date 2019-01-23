package no.hal.learning.exercise.adm;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.util.Util;
import no.hal.learning.exercise.views.ExerciseView;

public abstract class ExResourcesChartView extends PathObjectsView<Resource> implements ITaskEventsProvider {

	public static String getExerciseId(final Resource resource) {
		final URI uri = resource.getURI();
		final String[] segments = uri.segments();
		for (int i = segments.length - 1; i >= 0; i--) {
			final String segment = segments[i];
			if (segment.endsWith(".ex")) {
				return segment.substring(0, segment.lastIndexOf('.'));
			}
		}
		return null;
	}

	public static String getStudentId(final Resource resource) {
		final URI uri = resource.getURI();
		final String[] segments = uri.segments();
		for (int i = segments.length - 1; i >= 0; i--) {
			final String segment = segments[i];
			if (segment.lastIndexOf('.') < 0) {
				return segment;
			}
		}
		return null;
	}

	//

	@Override
	protected String getPathPrefix() {
		return null;
	}

	private CTabFolder tabFolder;

	@Override
	public void createPartControl(final Composite parent) {
		tabFolder = new CTabFolder(parent, SWT.BOTTOM);
		final CTabItem resourcesTab = new CTabItem(tabFolder, SWT.NONE);
		resourcesTab.setText("Resources");
		final Composite resourcesComposite = createTabComposite(tabFolder);
		resourcesTab.setControl(resourcesComposite);
		createPathViewerControl(resourcesComposite);
		addChartPaneTabs();
	}

	@Override
	protected ILabelProvider createPathLabelProvider() {
		return new ExResourceChartLabelProvider();
	}

	protected void createPathViewerControl(final Composite composite) {
		super.createPartControl(composite);
	}

	@Override
	protected void openPathObject(final Resource resource) {
		try {
			final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			final ExerciseView view = (ExerciseView) page.showView(ExerciseView.class.getName());
			final EObject accepted = view.addAcceptedEObject(resource);
			view.selectEObjectTab(accepted);
			page.activate(view);
		} catch (final PartInitException pie) {
			pie.printStackTrace();
		}
	}

	protected final Runnable updatePaneRunnable = new Runnable() {
		@Override
		public void run() {
			updatePane();
		}
	};

	protected void asyncUpdatePane() {
		tabFolder.getDisplay().asyncExec(updatePaneRunnable);
	}

	@Override
	protected void updatePane() {
		final CTabItem tab = tabFolder.getSelection();
		if (chartPanes.containsKey(tab.getText())) {
			updatePane(tab);
		} else {
			updatePathViewer();
		}
	}

	protected void updatePathViewer() {
		super.updatePane();
	}

	protected void updatePane(final CTabItem tab) {
		final AbstractChartPane chartPane = chartPanes.get(tab.getText());
		tabFolder.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				final Collection<Resource> resources = new ArrayList<Resource>();
				final Iterator<String> paths = getFilteredPaths();
				while (paths.hasNext()) {
					resources.add(getPathObject(paths.next()));
				}
				chartPane.updateChart(resources);
				((Composite) tab.getControl()).layout();
			}
		});
	}

	private Map<String, AbstractChartPane> chartPanes = null;

	private void addChartPaneTabs() {
		if (chartPanes == null) {
			chartPanes = new HashMap<String, AbstractChartPane>();
			processChartPaneExtension();
		}
		for (final String chartPaneName : chartPanes.keySet()) {
			final CTabItem chartTab = new CTabItem(tabFolder, SWT.NONE);
			chartTab.setText(chartPaneName);
			chartTab.setControl(createTabComposite(tabFolder));
		}
		tabFolder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (e.widget instanceof CTabFolder) {
					final CTabItem tab = ((CTabFolder) e.widget).getSelection();
					final AbstractChartPane chartPane = chartPanes.get(tab.getText());
					if (chartPane == null) {
						return;
					}
					final Composite chartParent = (Composite) tab.getControl();
					if (chartPane != null && tab.getControl() instanceof Composite
							&& chartParent.getChildren().length == 0) {
						chartPane.createControls(chartParent);
					}
					updatePane(tab);
				}
			}
		});
	}

	protected Composite createTabComposite(final Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, true));
		return composite;
	}

	protected void processChartPaneExtension() {
		final IExtensionPoint ep = Platform.getExtensionRegistry()
				.getExtensionPoint("no.hal.learning.exercise.adm.chartpane");
		final IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (final IConfigurationElement ces : extensions[i].getConfigurationElements()) {
				final String name = ces.getName();
				if ("chartpane".equals(name)) {
					try {
						final AbstractChartPane plotPane = (AbstractChartPane) ces
								.createExecutableExtension("chartPaneClass");
						chartPanes.put(ces.getAttribute("name"), plotPane);
					} catch (final Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}

	static class ExViewerColumnData {
		int columnNum;
		String columnName;
		CellLabelProvider cellLabelProvider;
		String columnLabel;
		int columnWidth;
	}

	private List<ExViewerColumnData> exViewerColumns;

	public Collection<ExViewerColumnData> getExViewerColumns() {
		if (exViewerColumns == null) {
			exViewerColumns = new ArrayList<ExViewerColumnData>();
			processExViewerColumns();
			Collections.sort(exViewerColumns, new Comparator<ExViewerColumnData>() {
				@Override
				public int compare(final ExViewerColumnData cd1, final ExViewerColumnData cd2) {
					final int max = Math.max(cd1.columnNum, cd2.columnNum) + 1;
					return (cd1.columnNum > 0 ? cd1.columnNum : max) - (cd2.columnNum > 0 ? cd2.columnNum : max);
				}
			});
		}
		return exViewerColumns;
	}

	@Override
	protected void addViewerColumns() {
		super.addViewerColumns();
		for (final ExViewerColumnData columnData : getExViewerColumns()) {
			if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel) {
				((AbstractTaskEventsCellLabel<?>) columnData.cellLabelProvider).setTaskEventsProvider(this);
			}
			addViewerColumn(columnData.columnLabel, columnData.cellLabelProvider, columnData.columnWidth);
		}
	}

	@Override
	public List<? extends TaskEvent> getTaskEvents(final Object o) {
		final Resource resource = (o instanceof Resource ? (Resource) o : getPathObject(String.valueOf(o)));
		return (resource != null ? Util.getAllEObjects(resource.getAllContents(), TaskEvent.class) : null);
	}

	private <T> T getAttributeValue(final IConfigurationElement ces, final String attrName, final Class<T> clazz,
			final T def) {
		try {
			final String attribute = ces.getAttribute(attrName);
			if (attribute != null) {
				return (T) clazz.getMethod("valueOf", new Class[] { String.class }).invoke(null,
						new Object[] { attribute });
			}
		} catch (final Exception e) {
		}
		return def;
	}

	private void processExViewerColumns() {
		final IExtensionPoint ep = Platform.getExtensionRegistry()
				.getExtensionPoint("no.hal.learning.exercise.adm.exviewercolumn");
		final IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (final IConfigurationElement ces : extensions[i].getConfigurationElements()) {
				final String name = ces.getName();
				if ("exviewercolumn".equals(name)) {
					final ExViewerColumnData columnData = new ExViewerColumnData();
					try {
						columnData.columnNum = getAttributeValue(ces, "columnNum", Integer.class, 0);
						columnData.columnName = ces.getAttribute("columnName");
						columnData.cellLabelProvider = (CellLabelProvider) ces
								.createExecutableExtension("cellLabelProviderClass");
						columnData.columnLabel = ces.getAttribute("columnLabel");
						columnData.columnWidth = getAttributeValue(ces, "columnWidth", Integer.class, 50);
						if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel<?>) {
							final AbstractTaskEventsCellLabel<?> taskEventsCellLabel = (AbstractTaskEventsCellLabel<?>) columnData.cellLabelProvider;
							taskEventsCellLabel.setLabelFormat(getAttributeValue(ces, "columnLabelFormat", String.class,
									taskEventsCellLabel.getLabelFormat()));
						}
						if (columnData.cellLabelProvider instanceof TaskEventsValueCellLabel) {
							final TaskEventsValueCellLabel taskEventsValueCellLabel = (TaskEventsValueCellLabel) columnData.cellLabelProvider;
							if (ces.getAttribute("taskEventsValueClass") != null) {
								final AbstractTaskEventsValueProvider<?> taskEventsValue = (AbstractTaskEventsValueProvider<?>) ces
										.createExecutableExtension("taskEventsValueClass");
								taskEventsValueCellLabel.setTaskEventsValue(taskEventsValue);
							}
						}
						exViewerColumns.add(columnData);
					} catch (final InvalidRegistryObjectException e) {
						System.err.println("Exception processing exviewercolumn extension: " + e);
					} catch (final CoreException e) {
						System.err.println("Exception processing exviewercolumn extension: " + e);
					}
				}
			}
		}
	}

	@Override
	protected void addTopicViewerColumnSelectionListener(final TreeColumn treeColumn,
			final CellLabelProvider labelProvider) {
		treeColumn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				if (labelProvider instanceof AbstractTaskEventsCellLabel) {
					final AbstractTaskEventsCellLabel taskEventsCellLabel = (AbstractTaskEventsCellLabel) labelProvider;
					if (viewerComparator == null) {
						viewerComparator = new TaskEventsCellLabelComparator(taskEventsCellLabel);
						pathViewer.setComparator(viewerComparator);
					} else {
						if (taskEventsCellLabel == viewerComparator.getTaskEventsCellLabel()) {
							viewerComparator.toggle();
						} else {
							viewerComparator.setTaskEventsCellLabel(taskEventsCellLabel);
						}
						pathViewer.refresh();
					}
				} else {
					pathViewer.setComparator(null);
				}
			}
		});
	}

	private TaskEventsCellLabelComparator viewerComparator;

	private final class TaskEventsCellLabelComparator extends ViewerComparator {

		private AbstractTaskEventsCellLabel<?> taskEventsCellLabel;

		public AbstractTaskEventsCellLabel<?> getTaskEventsCellLabel() {
			return taskEventsCellLabel;
		}

		public void setTaskEventsCellLabel(final AbstractTaskEventsCellLabel<?> taskEventsCellLabel) {
			this.taskEventsCellLabel = taskEventsCellLabel;
			this.toggler = 1;
		}

		private int toggler = 1;

		public void toggle() {
			toggler = -toggler;
		}

		private TaskEventsCellLabelComparator(final AbstractTaskEventsCellLabel<?> taskEventsCellLabel) {
			setTaskEventsCellLabel(taskEventsCellLabel);
		}

		@Override
		public int compare(final Viewer viewer, final Object e1, final Object e2) {
			return taskEventsCellLabel.compareTaskEventsValues(e1, e2) * toggler;
		}
	}

	protected void addContentsColumn() {
		addViewerColumn("Contents", new CellLabelProvider() {
			@Override
			public void update(final ViewerCell cell) {
				final Resource resource = getPathObject(String.valueOf(cell.getElement()));
				if (resource != null) {
					cell.setText(resource.getContents().size() + " object(s): " + resource.getContents());
				}
			}
		}, 500);
	}

	//

	private final TaskEventCsvsExporter taskEventCsvsExporter = new TaskEventCsvsExporter();
	private final ExTableCsvExporter exTableCsvExporter = new ExTableCsvExporter();

	@Override
	protected void addActions() {
		super.addActions();
		final IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
		menuManager.add(new Action("Export table as CSV") {
			@Override
			public void run() {
				exTableCsvExporter.setResources(getSelectedResources());
				exTableCsvExporter.setExViewerColumns(getExViewerColumns());
				tabFolder.getDisplay().asyncExec(exTableCsvExporter);
			}
		});
		menuManager.add(new Action("Export events as CSVs") {
			@Override
			public void run() {
				final DirectoryDialog directoryDialog = new DirectoryDialog(tabFolder.getShell(), SWT.OPEN);
				directoryDialog.setMessage("Select directory for CSV files");
				directoryDialog.setText("CSV files directory");
				final String directoryPath = directoryDialog.open();
				if (directoryPath != null) {
					final File dir = new File(directoryPath);
					if (dir.exists()) {
						taskEventCsvsExporter.setResources(getSelectedResources());
						taskEventCsvsExporter.setDirectory(dir);
						tabFolder.getDisplay().asyncExec(taskEventCsvsExporter);
					}
				}
			}
		});
	}

	protected Collection<Resource> getSelectedResources() {
		final Collection<Resource> selection = new ArrayList<Resource>();
		final Iterator<?> it = pathViewer.getStructuredSelection().iterator();
		while (it.hasNext()) {
			final Object next = it.next();
			if (next instanceof Resource) {
				selection.add((Resource) next);
			}
		}
		return selection;
	}
}
