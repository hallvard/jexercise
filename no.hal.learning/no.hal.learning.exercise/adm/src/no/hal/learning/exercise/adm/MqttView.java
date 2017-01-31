package no.hal.learning.exercise.adm;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

public abstract class MqttView<T> extends ViewPart {

	protected TreeViewer topicViewer;
	
	private Map<String, T> topicMap = new TreeMap<String, T>();
	
	protected T getMessageObject(String topic) {
		return topicMap.get(topic);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);
	
		topicViewer = new TreeViewer(parent, SWT.NONE);
		
		TopicViewerContentProvider<T> contentProvider = new TopicViewerContentProvider<T>(topicMap);
		contentProvider.setTopicPrefix(getTopicPrefix());
		topicViewer.setContentProvider(contentProvider);

		topicViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		topicViewer.setInput(topicMap);

		topicViewer.getTree().setHeaderVisible(true);
		
		addViewerColumns();
		
		MqttClient mqttClient = getMqttClient();
		try {
			mqttClient.subscribe(getTopicPrefix() + "/#", new IMqttMessageListener() {
				@Override
				public void messageArrived(final String topic, final MqttMessage message) throws Exception {
					final boolean refresh = (! topicMap.containsKey(topic));
					topicViewer.getControl().getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							final T object = getMessageObject(topic, message);
							topicMap.put(topic, object);						
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
	}
	
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
