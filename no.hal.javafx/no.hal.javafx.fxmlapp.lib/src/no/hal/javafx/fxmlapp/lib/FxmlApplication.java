package no.hal.javafx.fxmlapp.lib;

import java.net.URL;

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
		String fxmlFileName = getParameters().getNamed().get("fxml");
		if (fxmlFileName == null) {
			throw new IllegalArgumentException("No fxml application argument");
		}
		int pos = fxmlFileName.indexOf(':');
		String fxmlUrlString = (pos > 0 && pos < 5 ? fxmlFileName : "file:" + fxmlFileName); 
		FXMLLoader loader = new FXMLLoader(new URL(fxmlUrlString));
		Parent parent;
		try {
			parent = loader.load();
		} catch (Exception e) {
			System.out.println("Exception when loading " + fxmlUrlString + ": " + e);
			throw e;
		}
		double width = 0, height = 0;
		double size = getDoubleParameter("size", 0);
		if (size > 0) {
			height = width = size;
		}
		width = getDoubleParameter("width", width);
		height = getDoubleParameter("height", height);
		Scene scene = (width > 0 && height > 0 ? new Scene(parent, width, height) : new Scene(parent));
		initalizeKeyHandlers(parent, scene);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	protected void initalizeKeyHandlers(Parent parent, Scene scene) {
		scene.setOnKeyPressed((event) -> { handleKeyEvent(parent.getOnKeyPressed(), event);});
		scene.setOnKeyReleased((event) -> { handleKeyEvent(parent.getOnKeyPressed(), event);});
	}

	protected void handleKeyEvent(EventHandler<? super KeyEvent> handler, KeyEvent event) {
		if (handler != null) {
			handler.handle(event);
		}
	}

	protected double getDoubleParameter(String name, double def) {
		String param = getParameters().getNamed().get(name);
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
