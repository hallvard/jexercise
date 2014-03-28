package program;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GameGridPane extends GridPane {

	private Map<String, String> imageKeyMap;
	
	public Map<String, String> getImageKeyMap() {
		if (imageKeyMap == null) {
			imageKeyMap = new HashMap<String, String>();
		}
		if (imageKeyMapEntries != null) {
			for (Map.Entry<String, String> entry : getImageKeyMapEntries()) {
				imageKeyMap.put(entry.getKey(), entry.getValue());
			}
			imageKeyMapEntries = null;
		}
		return imageKeyMap;
	}

	private List<Map.Entry<String, String>> imageKeyMapEntries = null;
	
	public List<Map.Entry<String, String>> getImageKeyMapEntries() {
		if (imageKeyMapEntries == null) {
			imageKeyMapEntries = new ArrayList<Map.Entry<String,String>>();
		}
		return imageKeyMapEntries;
	}

	private Map<String, Image> images = new HashMap<String, Image>();

	public Image getImage(String imageKey, Object... contexts) {
		Image image = images.get(imageKey);
		if (image == null) {
			URL url = null;
			try {
				url = new URL(imageKey);
			} catch (MalformedURLException e) {
			}
			int i = 0;
			while (url == null && i < contexts.length) {
				url = contexts[i++].getClass().getResource(imageKey);
			}
			if (url == null) {
				try {
					url = new URL("file:" + imageKey);
				} catch (MalformedURLException e) {
				}
			}
			if (url != null) {
				image = new Image(url.toExternalForm());
				images.put(imageKey, image);
			}
		}
		return image;
	}
	
	private int columns = 0, rows = 0;
	
	private Label[] labels = null;
	
	public void setDimensions(int columns, int rows) {
		this.columns = columns;
		this.rows = rows;
		labels = new Label[columns * rows];
		getChildren().clear();
	}
	
	private Label getLabel(int column, int row) {
		return labels[row * columns + column];
	}
	
	private void setLabel(Label label, int column, int row) {
		labels[row * columns + column] = label;
	}
	
	public Image setImage(String imageKey, int column, int row, Object... contexts) {
		Image image = null;
		if (imageKey != null) {
			String imageKey2 = getImageKeyMap().get(imageKey);
			if (imageKey2 != null) {
				image = getImage(imageKey2, contexts);
			}
			if (image == null) {
				image = getImage(imageKey, contexts);
			}
		}
		Label label = getLabel(column, row);
		if (label != null) {
			Node graphic = label.getGraphic();
			if (graphic instanceof ImageView) {
				((ImageView) graphic).setImage(image);
			} else {
				label.setGraphic(new ImageView(image));
			}
		} else {
			label = new Label(null, new ImageView(image));
			setLabel(label, column, row);
			add(label, column, row);
		}
		return image;
	}
	
	public void setText(String text, int column, int row) {
		Label label = getLabel(column, row);
		if (label != null) {
			label.setText(text);
		} else {
			label = new Label(text);
			setLabel(label, column, row);
			add(label, column, row);
		}
	}
}
