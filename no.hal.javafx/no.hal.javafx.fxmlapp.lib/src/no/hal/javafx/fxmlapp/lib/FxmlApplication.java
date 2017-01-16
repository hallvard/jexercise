package no.hal.javafx.fxmlapp.lib;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class FxmlApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Map<String, String> namedParams = getParameters().getNamed();
		Parent parent = loadFxml(namedParams);
		Scene scene = createScene(namedParams, parent);
		initalizeKeyHandlers(parent, scene);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	static Scene createScene(Map<String, String> namedParams, Parent parent) {
		double width = 0, height = 0;
		double size = getDoubleParameter(namedParams, "size", 0);
		if (size > 0) {
			height = width = size;
		}
		width = getDoubleParameter(namedParams, "width", width);
		height = getDoubleParameter(namedParams, "height", height);
		Scene scene = (width > 0 && height > 0 ? new Scene(parent, width, height) : new Scene(parent));
		return scene;
	}

	static Parent loadFxml(Map<String, String> parameters) throws Exception {
		String fxmlFileName = parameters.get("fxml");
		if (fxmlFileName == null) {
			throw new IllegalArgumentException("No fxml application argument");
		}
		URL url = null;
		try {
			url = new URL(fxmlFileName);
		} catch (MalformedURLException mue) {
		}
		if (url == null) {
			try {
				url = new URL("file:" + fxmlFileName);
			} catch (MalformedURLException mue) {
			}			
		}
		if (url == null) {
			throw new IllegalArgumentException(fxmlFileName + " is not a valid URL or file name");
		}
		FXMLLoader loader = new FXMLLoader(url);
		Parent parent;
		try {
			parent = loader.load();
		} catch (Exception e) {
			System.err.println("Exception when loading " + url + ": " + e);
			throw e;
		}
		return parent;
	}

	static void initalizeKeyHandlers(Parent parent, Scene scene) {
		scene.setOnKeyPressed((event) -> { handleKeyEvent(parent.getOnKeyPressed(), event);});
		scene.setOnKeyReleased((event) -> { handleKeyEvent(parent.getOnKeyPressed(), event);});
	}

	static void handleKeyEvent(EventHandler<? super KeyEvent> handler, KeyEvent event) {
		if (handler != null) {
			handler.handle(event);
		}
	}

	static protected double getDoubleParameter(Map<String, String> parameters, String name, double def) {
		String param = parameters.get(name);
		if (param != null) {
			try {
				return Double.valueOf(param);
			} catch (NumberFormatException e) {
			}
		}
		return def;
	}
	
	public static void main(String[] args) {
		launch(FxmlApplication.class, args);
	}
}
