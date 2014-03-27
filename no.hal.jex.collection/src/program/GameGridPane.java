package program;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	private ImageView[] imageViews = null;
	
	public void setDimensions(int columns, int rows) {
		this.columns = columns;
		this.rows = rows;
		imageViews = new ImageView[columns * rows];
		getChildren().clear();
	}
	
	public ImageView getImageView(int column, int row) {
		return imageViews[row * columns + column];
	}
	
	public Image setImage(String imageKey, int column, int row, Object... contexts) {
		String imageKey2 = getImageKeyMap().get(imageKey);
		Image image = getImage(imageKey2, contexts);
		if (image == null) {
			image = getImage(imageKey, contexts);
		}
		ImageView imageView = getImageView(column, row);
		if (imageView != null) {
			imageView.setImage(image);
		} else {
			add(new ImageView(image), column, row);
		}
		return image;
	}

	public void setImages(String s, int keyLength, String separator, Object... contexts) {
		String[] lines = s.split(separator);
		int imageHeight = -1, imageWidth = -1;
		for (int row = 0; row < lines.length; row++) {
			for (int column = 0; column < lines[row].length(); column += keyLength) {
				String key = lines[row].substring(column, column + keyLength);
				Image image = setImage(key, column / keyLength, row, contexts);
				if (image != null) {
					if (imageWidth <= 0) {
						imageWidth = (int) image.getWidth();
					}
					if (imageHeight <= 0) {
						imageHeight = (int) image.getHeight();
					}
				}
			}
		}
		setPrefWidth(imageWidth * lines[0].length() / keyLength);
		setPrefHeight(imageHeight * lines.length);
	}
}
