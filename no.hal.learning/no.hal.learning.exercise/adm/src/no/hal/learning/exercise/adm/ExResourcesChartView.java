package no.hal.learning.exercise.adm;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.CellLabelProvider;
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
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.util.Util;
import no.hal.learning.exercise.views.ExerciseView;

public abstract class ExResourcesChartView extends PathObjectsView<Resource> implements ITaskEventsProvider {

	@Override
	protected String getPathPrefix() {
		return null;
	}

	private CTabFolder tabFolder;

	@Override
	public void createPartControl(Composite parent) {
		tabFolder = new CTabFolder(parent, SWT.BOTTOM);
		CTabItem resourcesTab = new CTabItem(tabFolder, SWT.NONE);
		resourcesTab.setText("Resources");
		Composite resourcesComposite = createTabComposite(tabFolder);
		resourcesTab.setControl(resourcesComposite);
		createPathViewerControl(resourcesComposite);
		addChartPaneTabs();
	}

	protected void createPathViewerControl(Composite composite) {
		super.createPartControl(composite);
	}

	@Override
	protected void openPathObject(Resource resource) {
		try {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			ExerciseView view = (ExerciseView) page.showView(ExerciseView.class.getName());
			EObject accepted = view.addAcceptedEObject(resource);
			view.selectEObjectTab(accepted);
			page.activate(view);
		} catch (PartInitException pie) {
			pie.printStackTrace();
		}
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
				ResourceSet resourceSet = new ResourceSetImpl();
				Iterator<String> paths = getFilteredPaths();
				while (paths.hasNext()) {
					resourceSet.getResources().add(getPathObject(paths.next()));
				}
				chartPane.updateChart(resourceSet);
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
		for (String chartPaneName : chartPanes.keySet()) {
			CTabItem chartTab = new CTabItem(tabFolder, SWT.NONE);
			chartTab.setText(chartPaneName);
			chartTab.setControl(createTabComposite(tabFolder));
		}
		tabFolder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.widget instanceof CTabFolder) {
					final CTabItem tab = ((CTabFolder) e.widget).getSelection();
					final AbstractChartPane chartPane = chartPanes.get(tab.getText());
					if (chartPane == null) {
						return;
					}
					final Composite chartParent = (Composite) tab.getControl();
					if (chartPane != null && tab.getControl() instanceof Composite && chartParent.getChildren().length == 0) {
						chartPane.createControls(chartParent);
					}
					updatePane(tab);
				}
			}
		});
	}

	protected Composite createTabComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, true));
		return composite;
	}

	protected void processChartPaneExtension() {
		IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.adm.chartpane");
		IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				String name = ces.getName();
				if ("chartpane".equals(name)) {
					try {
						AbstractChartPane plotPane = (AbstractChartPane) ces.createExecutableExtension("chartPaneClass");
						chartPanes.put(ces.getAttribute("name"), plotPane);
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}

	private static class ExViewerColumnData {
		int columnNum;
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
				public int compare(ExViewerColumnData cd1, ExViewerColumnData cd2) {
					int max = Math.max(cd1.columnNum, cd2.columnNum) + 1;
					return (cd1.columnNum > 0 ? cd1.columnNum : max) - (cd2.columnNum > 0 ? cd2.columnNum : max);
				}
			});
		}
		return exViewerColumns;
	}

	@Override
	protected void addViewerColumns() {
		super.addViewerColumns();
		for (ExViewerColumnData columnData : getExViewerColumns()) {
			if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel) {
				((AbstractTaskEventsCellLabel<?>) columnData.cellLabelProvider).setTaskEventsProvider(this);
			}
			addViewerColumn(columnData.columnLabel, columnData.cellLabelProvider, columnData.columnWidth);
		}
	}

	@Override
	public List<? extends TaskEvent> getTaskEvents(Object o) {
		Resource resource = (o instanceof Resource ? (Resource) o : getPathObject(String.valueOf(o)));
		return (resource != null ? Util.getAllEObjects(resource.getAllContents(), TaskEvent.class) : null);
	}

	private <T> T getAttributeValue(IConfigurationElement ces, String attrName, Class<T> clazz, T def) {
		try {
			String attribute = ces.getAttribute(attrName);
			if (attribute != null) {
				return (T) clazz.getMethod("valueOf", new Class[]{String.class}).invoke(null, new Object[]{attribute});
			}
		} catch (Exception e) {
		}
		return def;
	}
	
	private void processExViewerColumns() {
		IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.adm.exviewercolumn");
		IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				String name = ces.getName();
				if ("exviewercolumn".equals(name)) {
					ExViewerColumnData columnData = new ExViewerColumnData();
					try {
						columnData.columnNum = getAttributeValue(ces, "columnNum", Integer.class, 0);
						columnData.cellLabelProvider = (CellLabelProvider) ces.createExecutableExtension("cellLabelProviderClass");
						columnData.columnLabel = ces.getAttribute("columnLabel");
						columnData.columnWidth = getAttributeValue(ces, "columnWidth", Integer.class, 50);
						if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel<?>) {
							AbstractTaskEventsCellLabel<?> taskEventsCellLabel = (AbstractTaskEventsCellLabel<?>) columnData.cellLabelProvider;
							taskEventsCellLabel.setLabelFormat(getAttributeValue(ces, "columnLabelFormat", String.class, taskEventsCellLabel.getLabelFormat()));
						}
						if (columnData.cellLabelProvider instanceof TaskEventsValueCellLabel) {
							TaskEventsValueCellLabel taskEventsValueCellLabel = (TaskEventsValueCellLabel) columnData.cellLabelProvider;
							if (ces.getAttribute("taskEventsValueClass") != null) {
								AbstractTaskEventsValueProvider<?> taskEventsValue = (AbstractTaskEventsValueProvider<?>) ces.createExecutableExtension("taskEventsValueClass");
								taskEventsValueCellLabel.setTaskEventsValue(taskEventsValue);
							}
						}
						exViewerColumns.add(columnData);
					} catch (InvalidRegistryObjectException e) {
						System.err.println("Exception processing exviewercolumn extension: " + e);
					} catch (CoreException e) {
						System.err.println("Exception processing exviewercolumn extension: " + e);
					}
				}
			}
		}
	}
	
	protected void addTopicViewerColumnSelectionListener(TreeColumn treeColumn, final CellLabelProvider labelProvider) {
		treeColumn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
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
		
		public void setTaskEventsCellLabel(AbstractTaskEventsCellLabel<?> taskEventsCellLabel) {
			this.taskEventsCellLabel = taskEventsCellLabel;
			this.toggler = 1;
		}
		
		private int toggler = 1;

		public void toggle() {
			toggler = -toggler;
		}
		
		private TaskEventsCellLabelComparator(AbstractTaskEventsCellLabel<?> taskEventsCellLabel) {
			setTaskEventsCellLabel(taskEventsCellLabel);
		}

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			return taskEventsCellLabel.compareTaskEventsValues(e1, e2) * toggler;
		}
	}

	protected void addContentsColumn() {
		addViewerColumn("Contents", new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				Resource resource = getPathObject(String.valueOf(cell.getElement()));
				if (resource != null) {
					cell.setText(resource.getContents().size() + " object(s): " + resource.getContents());
				}
			}
		}, 500);
	}
}
