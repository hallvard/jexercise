package encapsulation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RPNCalcFX extends Application {

	@Override
	public void init() throws Exception {
		super.init();
		rpn = new RPNCalc();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(this);
		fxmlLoader.load(getClass().getResourceAsStream(this.getClass().getSimpleName() + ".fxml"));
		Parent root = fxmlLoader.getRoot();
		stage.setScene(new Scene(root));
		stage.show();
	}
	
	private RPNCalc rpn;
	
	@FXML private TextField valueTextNode;

	private String input = null;
	
	private void pushCurrentInput() {
		if (input != null) {
			rpn.push(Double.valueOf(input));
			input = null;
		}
	}
	
	private void performAction(String command) {
		// push existing input
		pushCurrentInput();
		try {
			// try commmand as double value
			rpn.push(Double.valueOf(command));
			return;
		} catch (NumberFormatException nfe) {
		}
		// this code runs if command isn't a number
		if (command.equals("push")) {
			// the current input has already been pushed
		}
		updateValueText();
	}

	private void updateValueText() {
		String label = "";
		for (int i = 0; i < rpn.getSize(); i++) {
			label = rpn.peek(i) + " " + label;
		}
		if (input != null) {
			label = label + input;
		}
		valueTextNode.setText(label);
	}

	private String getEventButtonText(ActionEvent actionEvent) {
		return ((Labeled) actionEvent.getSource()).getText();
	}
	
	@FXML private void performAction(ActionEvent actionEvent) {
		performAction(getEventButtonText(actionEvent));
	}

	@FXML private void performOperation(ActionEvent actionEvent) {
		char op = getEventButtonText(actionEvent).charAt(0);
		pushCurrentInput();
		rpn.performOperation(op);
		updateValueText();
	}

	@FXML private void inputText(ActionEvent actionEvent) {
		String text = getEventButtonText(actionEvent);
		input = (input == null ? String.valueOf(text) : input + text);
		updateValueText();
	}

	@FXML private void inputTextEdit(ActionEvent actionEvent) {
		String text = getEventButtonText(actionEvent);
		if ("backspace".equals(text)) {
			if (input == null || input.length() == 0) {
				input = String.valueOf(rpn.pop(0.0));
			}
			input = input.substring(0, input.length() - 1);
		}
		updateValueText();
	}

	//

	public static void main(String[] args) {
		launch(RPNCalcFX.class);
	}
}
