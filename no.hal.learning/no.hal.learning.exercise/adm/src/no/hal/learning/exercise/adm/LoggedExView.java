package no.hal.learning.exercise.adm;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.TaskEvent;
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

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		topicViewer.getControl().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					ExerciseView view = (ExerciseView) page.showView(ExerciseView.class.getName());
					String selectedTopic = String.valueOf(topicViewer.getStructuredSelection().getFirstElement());
					EObject accepted = view.addAcceptedEObject(getMessageObject(selectedTopic));
					view.selectEObjectTab(accepted);
					page.activate(view);
				} catch (PartInitException pie) {
					pie.printStackTrace();
				}
			}
		});
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
	
	@Override
	protected void addViewerColumns() {
		super.addViewerColumns();
		addTaskEventsColumn();
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
	
	private <T> Collection<T> getAllEObjects(TreeIterator<EObject> objects, Class<T> clazz) {
		Collection<T> result = new ArrayList<T>();
		while (objects.hasNext()) {
			EObject next = objects.next();
			if (clazz.isInstance(next)) {
				result.add((T) next);
			}
		}
		return result;
	}

	private DateFormat timestamptFormat = new SimpleDateFormat("HH:mm E, dd/MM-yy");
	
	protected void addTaskEventsColumn() {
		addTopicViewerColumn("Task events", new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				Resource resource = getMessageObject(String.valueOf(cell.getElement()));
				if (resource == null) {
					return;
				}
				Collection<TaskEvent> taskEvents = getAllEObjects(resource.getAllContents(), TaskEvent.class);
				long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
				for (TaskEvent taskEvent : taskEvents) {
					long timestamp = taskEvent.getTimestamp();
					if (timestamp < min) {
						min = timestamp;
					}
					if (timestamp > max) {
						max = timestamp;
					}
				}
				String s = taskEvents.size() + " event(s)";
				if (min <= max) {
					s += ", " + timestamptFormat.format(new Date(min)) + " - " + timestamptFormat.format(new Date(max));
				}
				cell.setText(s);
			}
		}, 500);
	}
}
