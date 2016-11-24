package no.hal.javafx.fxmlapp.lib;

import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;

public class SimpleController extends FxmlController {

	@FXML
	Label label;
	
	@FXML
	void handleKeyPressed(KeyEvent event) {
		label.setText("Pressed " + event.getCode());
	}

	@FXML
	void handleKeyReleased(KeyEvent event) {
		label.setText("Released " + event.getCode());
	}
	
	@FXML
	void handleButton() {
		label.setText("Clicked button!");
	}
}
