package rpn;

import java.lang.reflect.Field;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextInputControl;
import javafx.stage.Stage;

public class RPNFX extends Application {

	private RPN rpn;
	private Node valueText = null;
	private String input = null;
	
	@Override
	public void init() throws Exception {
		super.init();
		rpn = new RPN();
	}

	private void appendInputText(String inputText) {
		if (input == null) {
			input = String.valueOf(inputText);
		} else {
			input = input + inputText;
		}
		updateValueText();
	}
	
	private void performOp(char op) {
		// push existing input
		if (input != null) {
			rpn.push(Double.valueOf(input));
			input = null;
		}
		rpn.performOperation(op);
		updateValueText();
	}

	private void performInputTextEdit(String command) {
		if (command.equals("backspace")) {
			if (input == null || input.length() == 0) {
				input = String.valueOf(rpn.pop(0.0));
			} else {
				input = input.substring(0, input.length() - 1);
			}
		}
		updateValueText();
	}
	
	private Class<?>[] constantClasses = {Math.class, this.getClass()};

	private void performAction(String command) {
		// push existing input
		if (input != null) {
			rpn.push(Double.valueOf(input));
			input = null;
		}
		Number number = null;
		try {
			// try commmand as double value
			number = Double.valueOf(command);
		} catch (NumberFormatException nfe) {
			// try command as named double field in either the Math class or this class
			for (Class<?> constantClass: constantClasses) {
				try {
					// change to constant naming convention
					String constantName = command.toUpperCase().replace(' ', '_');
					Field constantField = constantClass.getField(constantName);
					// check correct type
					if (constantField.getType() == double.class) {
						number = (Number) constantField.get(this);
					}
				} catch (Exception e) {
				}
			}
		}
		// check if command could (somehow) be interpreted as a number
		if (number != null) {
			rpn.push(number.doubleValue());
		} else if (command.equals("push")) {
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
		if (valueText instanceof TextInputControl) {
			((TextInputControl) valueText).setText(label);
		} else if (valueText instanceof Labeled) {
			((Labeled) valueText).setText(label);
		}
	}

	private EventHandler<ActionEvent> inputTextEventHandler = new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getSource();
			if (source instanceof Labeled) {
				appendInputText(((Labeled) source).getText());
			}
		}
	};

	private EventHandler<ActionEvent> inputTextEditEventHandler = new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getSource();
			if (source instanceof Labeled) {
				performInputTextEdit(((Labeled) source).getText());
			}
		}
	};

	private EventHandler<ActionEvent> operatorEventHandler = new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getSource();
			if (source instanceof Labeled) {
				performOp(((Labeled) source).getText().charAt(0));
			}
		}
	};
	
	private EventHandler<ActionEvent> actionEventHandler = new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getSource();
			if (source instanceof Labeled) {
				performAction(((Labeled) source).getText());
			}
		}
	};

	private String fxmlFile = "RPN.fxml";

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource(fxmlFile));
		fxmlLoader.load(getClass().getResourceAsStream(fxmlFile));
		Parent root = fxmlLoader.<Parent>getRoot();
		
		// select on CSS styles, see RPN.fxml
		// the inputTextButton style is for buttons that append text to the input text field, e.g. digits
		for (Node node : root.lookupAll(".inputTextButton")) {
			node.addEventHandler(ActionEvent.ACTION, inputTextEventHandler);
		}
		// the inputTextEditButton style is for buttons that (somehow) edit the input text field, e.g. backspace
		for (Node node : root.lookupAll(".inputTextEditButton")) {
			node.addEventHandler(ActionEvent.ACTION, inputTextEditEventHandler);
		}
		// the operatorButton style is for operator buttons, e.g. +
		for (Node node : root.lookupAll(".operatorButton")) {
			node.addEventHandler(ActionEvent.ACTION, operatorEventHandler);
		}
		// the actionButton style is for buttons that otherwise modify the calculator stack, e.g. push
		for (Node node : root.lookupAll(".actionButton")) {
			node.addEventHandler(ActionEvent.ACTION, actionEventHandler);
		}
		// the node holding the current value, using id lookup
		valueText = (TextInputControl) root.lookup("#valueTextNode");
		
		stage.setScene(new Scene(root));
		stage.show();
	}

	public static void main(String[] args) {
		launch(RPNFX.class);
	}
}
