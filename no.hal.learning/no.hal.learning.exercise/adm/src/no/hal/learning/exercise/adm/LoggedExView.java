package no.hal.learning.exercise.adm;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.logging.ExLogger;
import no.hal.learning.exercise.util.ExerciseResourceFactoryImpl;
import no.hal.learning.exercise.views.ExerciseView;

public class LoggedExView extends MqttView<Resource> {

	@Override
	protected String getMqttServerUri() {
		return ExLogger.idiServerUri;
	}

	@Override
	protected String getTopicPrefix() {
		return ExerciseView.class.getName();
	}

	private CTabFolder tabFolder;

	@Override
	public void createPartControl(Composite parent) {
		tabFolder = new CTabFolder(parent, SWT.BOTTOM);
		CTabItem mqttTab = new CTabItem(tabFolder, SWT.NONE);
		mqttTab.setText("Mqtt");
		Composite mqttComposite = createPlotPaneParent();
		mqttTab.setControl(mqttComposite);
		super.createPartControl(mqttComposite);
		topicViewer.getControl().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					String selectedTopic = String.valueOf(topicViewer.getStructuredSelection().getFirstElement());
					Resource messageObject = getMessageObject(selectedTopic);
					if (messageObject != null) {
						ExerciseView view = (ExerciseView) page.showView(ExerciseView.class.getName());
						EObject accepted = view.addAcceptedEObject(messageObject);
						view.selectEObjectTab(accepted);
						page.activate(view);
					} else {
						setTopicFilter(selectedTopic);
					}
				} catch (PartInitException pie) {
					pie.printStackTrace();
				}
			}
		});
		addPlotPaneTabs();
	}

	@Override
	protected void updatePane() {
		final CTabItem tab = tabFolder.getSelection();
		if (plotPanes.containsKey(tab.getText())) {
			updatePane(tab);
		} else {
			super.updatePane();			
		}
	}

	protected void updatePane(final CTabItem tab) {
		final AbstractPlotPane plotPane = plotPanes.get(tab.getText());
		tabFolder.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				ResourceSet resourceSet = new ResourceSetImpl();
				Iterator<String> topics = getFilteredTopics();
				while (topics.hasNext()) {
					resourceSet.getResources().add(getMessageObject(topics.next()));
				}
				plotPane.updatePlot(resourceSet);
				((Composite) tab.getControl()).layout();
			}
		});
	}

	private Map<String, AbstractPlotPane> plotPanes = null;
	
	private void addPlotPaneTabs() {
		if (plotPanes == null) {
			plotPanes = new HashMap<String, AbstractPlotPane>();
			processPlotPaneExtension();
		}
		for (String plotPaneName : plotPanes.keySet()) {
			CTabItem plotTab = new CTabItem(tabFolder, SWT.NONE);
			plotTab.setText(plotPaneName);
			Composite plotComposite = createPlotPaneParent();
			plotTab.setControl(plotComposite);
		}
		tabFolder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.widget instanceof CTabFolder) {
					final CTabItem tab = ((CTabFolder) e.widget).getSelection();
					final AbstractPlotPane plotPane = plotPanes.get(tab.getText());
					if (plotPane == null) {
						return;
					}
					final Composite plotParent = (Composite) tab.getControl();
					if (plotPane != null && tab.getControl() instanceof Composite && plotParent.getChildren().length == 0) {
						plotPane.createControls(plotParent);
//						tabFolder.getDisplay().asyncExec(new Runnable() {
//							@Override
//							public void run() {
//								plotParent.layout();
//								updatePlotPane(tab);
//							}
//						});
					} // else {
						updatePane(tab);
//					}
				}
			}
		});
	}

	protected Composite createPlotPaneParent() {
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setLayout(new GridLayout(1, true));
		return composite;
	}

	protected void processPlotPaneExtension() {
		IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.adm.plotpane");
		IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				String name = ces.getName();
				if ("plotpane".equals(name)) {
					try {
						AbstractPlotPane plotPane = (AbstractPlotPane) ces.createExecutableExtension("plotPaneClass");
						plotPanes.put(ces.getAttribute("name"), plotPane);
					} catch (InvalidRegistryObjectException e) {
						System.err.println(e);
					} catch (CoreException e) {
						System.err.println(e);
					}
				}
			}
		}
	}

	@Override
	protected Resource getMessageObject(String topic, MqttMessage message) {
		URI uri = URI.createURI("/" + topic); // getMqttServerUri().replace("tcp:", "mqtt:") + "/" + topic);
		Resource resource = new ExerciseResourceFactoryImpl().createResource(uri);
		try {
			resource.load(new ByteArrayInputStream(message.getPayload()), ExerciseView.getLogOptions());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return resource;
	}
	
	private static class ExTableColumnData {
		int columnNum;
		CellLabelProvider cellLabelProvider;
		String columnLabel;
		int columnWidth;
	}
	
	private List<ExTableColumnData> exTableColumns;
	
	public Collection<ExTableColumnData> getExTableColumns() {
		if (exTableColumns == null) {
			exTableColumns = new ArrayList<ExTableColumnData>();
			processExTableColumns();
			Collections.sort(exTableColumns, new Comparator<ExTableColumnData>() {
				@Override
				public int compare(ExTableColumnData cd1, ExTableColumnData cd2) {
					int max = Math.max(cd1.columnNum, cd2.columnNum) + 1;
					return (cd1.columnNum > 0 ? cd1.columnNum : max) - (cd2.columnNum > 0 ? cd2.columnNum : max);
				}
			});
		}
		return exTableColumns;
	}

	@Override
	protected void addViewerColumns() {
		super.addViewerColumns();
		for (ExTableColumnData columnData : getExTableColumns()) {
			if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel) {
				((AbstractTaskEventsCellLabel) columnData.cellLabelProvider).setLoggedExView(this);
			}
			addTopicViewerColumn(columnData.columnLabel, columnData.cellLabelProvider, columnData.columnWidth);
		}
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
	
	private void processExTableColumns() {
		IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.adm.extablecolumn");
		IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				String name = ces.getName();
				if ("extablecolumn".equals(name)) {
					ExTableColumnData columnData = new ExTableColumnData();
					try {
						columnData.columnNum = getAttributeValue(ces, "columnNum", Integer.class, 0);
						columnData.cellLabelProvider = (CellLabelProvider) ces.createExecutableExtension("cellLabelProviderClass");
						columnData.columnLabel = ces.getAttribute("columnLabel");
						columnData.columnWidth = getAttributeValue(ces, "columnWidth", Integer.class, 50);
						exTableColumns.add(columnData);
					} catch (InvalidRegistryObjectException e) {
					} catch (CoreException e) {
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
						topicViewer.setComparator(viewerComparator);
					} else {
						if (taskEventsCellLabel == viewerComparator.getTaskEventsCellLabel()) {
							viewerComparator.toggle();
						} else {
							viewerComparator.setTaskEventsCellLabel(taskEventsCellLabel);
						}
						topicViewer.refresh();
					}
				} else {
					topicViewer.setComparator(null);					
				}
			}
		});
	}
	
	private TaskEventsCellLabelComparator viewerComparator;
	
	private final class TaskEventsCellLabelComparator extends ViewerComparator {
		
		private AbstractTaskEventsCellLabel taskEventsCellLabel;
		
		public AbstractTaskEventsCellLabel getTaskEventsCellLabel() {
			return taskEventsCellLabel;
		}
		
		public void setTaskEventsCellLabel(AbstractTaskEventsCellLabel taskEventsCellLabel) {
			this.taskEventsCellLabel = taskEventsCellLabel;
			this.toggler = 1;
		}
		
		private int toggler = 1;

		public void toggle() {
			toggler = -toggler;
		}
		
		private TaskEventsCellLabelComparator(AbstractTaskEventsCellLabel taskEventsCellLabel) {
			setTaskEventsCellLabel(taskEventsCellLabel);
		}

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			return taskEventsCellLabel.compareTaskEventsValues(e1, e2) * toggler;
		}
	}

	protected void addContentsColumn() {
		addTopicViewerColumn("Contents", new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				Resource resource = getMessageObject(String.valueOf(cell.getElement()));
				if (resource != null) {
					cell.setText(resource.getContents().size() + " object(s): " + resource.getContents());
				}
			}
		}, 500);
	}
	
	public static <T> List<T> getAllEObjects(TreeIterator<EObject> objects, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		while (objects.hasNext()) {
			EObject next = objects.next();
			if (clazz.isInstance(next)) {
				result.add((T) next);
			}
		}
		return result;
	}
}
