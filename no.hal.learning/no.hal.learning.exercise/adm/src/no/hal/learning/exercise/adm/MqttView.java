package no.hal.learning.exercise.adm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

public abstract class MqttView<T> extends ViewPart {

	protected Text topicFilterText;
	protected TreeViewer topicViewer;
	
	private Map<String, T> topicMap = new TreeMap<String, T>();
	
	protected Iterator<String> getTopics() {
		return topicMap.keySet().iterator();
	}

	protected Iterator<String> getFilteredTopics() {
		Collection<String> filtered = new ArrayList<String>();
		for (String topic : topicMap.keySet()) {
			if (acceptTopic(topic)) {
				filtered.add(topic);
			}
		}
		return filtered.iterator();
	}
	
	protected T getMessageObject(String topic) {
		return topicMap.get(topic);
	}

	protected void setTopicFilter(String topicPrefix) {
		String filterPrefix = getTopicFilterPrefix();
		if (topicPrefix.startsWith(filterPrefix)) {
			topicPrefix = topicPrefix.substring(filterPrefix.length());
		}
		topicFilterText.setText(topicPrefix);
		topicViewer.refresh();
	}
	
	protected boolean acceptTopic(String topic) {
		if (topic == null) {
			return true;
		}
		String startsWith = getTopicFilterPrefix() + topicFilterText.getText();
		return (topic.length() > startsWith.length() ? topic.startsWith(startsWith) : startsWith.startsWith(topic));
	}
	
	protected String getTopicFilterPrefix() {
		return getTopicPrefix() + "/";
	}
	
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);
	
		Label label = new Label(parent, SWT.NONE);
		label.setText("Topic filter");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		topicFilterText = new Text(parent, SWT.SEARCH | SWT.ICON_SEARCH | SWT.ICON_CANCEL);
		topicFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		topicViewer = new TreeViewer(parent, SWT.NONE);
		ViewerFilter topicFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return acceptTopic(element.toString());
			}
		};

		TopicViewerContentProvider<T> contentProvider = new TopicViewerContentProvider<T>(topicMap);
		contentProvider.setTopicPrefix(getTopicPrefix());
		topicViewer.setContentProvider(contentProvider);

		topicViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		topicViewer.setInput(topicMap);
		topicViewer.setFilters(topicFilter);

		topicViewer.getTree().setHeaderVisible(true);
		
		addViewerColumns();
		
		topicViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					deleteSelection(topicViewer.getStructuredSelection());
				}
				super.keyReleased(e);
			}
		});
		
		topicFilterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				topicViewer.refresh();
			}
		});
		addActions();
		subscribe();
	}

	protected void deleteSelection(ITreeSelection selection) {
		Iterator<?> elements = selection.iterator();
		while (elements.hasNext()) {
			Object element = elements.next();
			if (element instanceof String) {
				Object parent = ((ITreeContentProvider) topicViewer.getContentProvider()).getParent(element);
				deleteTopic((String) element);
				topicViewer.refresh(parent);
			}
		}
	}

	private void deleteTopic(String topic) {
		MqttClient mqttClient = getMqttClient();
		try {
			topicMap.remove(topic);
			mqttClient.publish(topic, new byte[0], 0, true);
		} catch (MqttPersistenceException e) {
		} catch (MqttException e) {
		}
	}

	protected void subscribe() {
		MqttClient mqttClient = getMqttClient();
		try {
			mqttClient.subscribe(getTopicPrefix() + "/#", new IMqttMessageListener() {
				@Override
				public void messageArrived(final String topic, final MqttMessage message) throws Exception {
					final boolean refresh = (! topicMap.containsKey(topic));
					topicViewer.getControl().getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							T object;
							try {
								object = getMessageObject(topic, message);
								topicMap.put(topic, object);						
							} catch (RuntimeException e) {
								topicMap.remove(topic);
							}
							if (refresh) {
								topicViewer.refresh(false);
							} else {
								topicViewer.update(topic, null);
							}								
						}
					});
				}
			});
		} catch (MqttException e) {
		}
	}

	protected void unsubscribe() {
		MqttClient mqttClient = getMqttClient();
		try {
			mqttClient.unsubscribe(getTopicPrefix() + "/#");
		} catch (MqttException e) {
		}
	}
	
	protected void addViewerColumns() {
		addPathColumn();
	}

	protected void addPathColumn() {
		addTopicViewerColumn("Path", new CellLabelProvider() {
			TopicViewerLabelProvider topicLabelProvider = new TopicViewerLabelProvider();
			@Override
			public void update(ViewerCell cell) {
				cell.setText(topicLabelProvider.getText(cell.getElement()));
			}
		}, 150);
	}

	protected void addTopicViewerColumn(String name, CellLabelProvider labelProvider, int width) {
		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(topicViewer, SWT.NONE);
		treeViewerColumn.setLabelProvider(labelProvider);
		TreeColumn treeColumn = treeViewerColumn.getColumn();
		treeColumn.setText(name);
		treeColumn.setWidth(width);
		addTopicViewerColumnSelectionListener(treeColumn, labelProvider);
	}
	
	protected void addTopicViewerColumnSelectionListener(TreeColumn treeColumn, CellLabelProvider labelProvider) {
	}

	//

	protected void updatePane() {
		unsubscribe();
		topicMap.clear();
		topicViewer.refresh(false);
		subscribe();
	}

	private final static String REFRESH_IMAGE_URL = "platform:/plugin/org.eclipse.jdt.ui/icons/full/elcl16/refresh.png";

	protected void addActions() {
		try {
			getViewSite().getActionBars().getToolBarManager().add(new Action("Refresh", ImageDescriptor.createFromURL(new URL(REFRESH_IMAGE_URL))) {
				public void run() {
					updatePane();
				}
			});
		} catch (MalformedURLException e) {
		}
	}

	//

	private MqttClient mqttClient;
	
	protected abstract String getMqttServerUri();

	protected abstract String getTopicPrefix();
	
	protected abstract T getMessageObject(String topic, MqttMessage message);
	
	protected MqttClient getMqttClient() {
		try {
			if (mqttClient == null) {
				mqttClient = new MqttClient(getMqttServerUri(), String.valueOf(this.hashCode()));
			}
			if (! mqttClient.isConnected()) {
				mqttClient.connect();
			}
		} catch (MqttException e) {
		}
		return mqttClient;
	}

	@Override
	public void setFocus() {
		topicViewer.getControl().setFocus();
	}
}
