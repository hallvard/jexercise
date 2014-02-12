package rpn;

import java.lang.reflect.Field;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextInputControl;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
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
			number = Double.valueOf(command);
		} catch (NumberFormatException nfe) {
			String constantName = command.toUpperCase().replace(' ', '_');
			for (Class<?> constantClass: constantClasses) {
				try {
					Field constantField = constantClass.getField(constantName);
					if (constantField.getType() == double.class) {
						number = (Number) constantField.get(null);
					}
				} catch (Exception e) {
				}
			}
		}
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

	private EventHandler<ActionEvent> opEventHandler = new EventHandler<ActionEvent>() {
		
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

	private EventHandler<KeyEvent> keyEventHandler = new EventHandler<KeyEvent>() {
		
		@Override
		public void handle(KeyEvent event) {
			String command = null;
			if (event.getCode() == KeyCode.BACK_SPACE) {
				command = "backspace";
			} else if (event.getCode() == KeyCode.ENTER) {
				command = "push";
			} else if ("0123456789.+-*/".contains(event.getCharacter())) {
				command = event.getCharacter();
			} 
			if (command != null) {
				performAction(command);
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
		
		addListeners(root.getChildrenUnmodifiable());
		
		stage.setScene(new Scene(root));
		stage.show();
	}

	private void addListeners(List<Node> children) {
		for (Node child : children) {
			ObservableList<String> styles = child.getStyleClass();
			if (styles.contains("inputTextButton")) {
				child.addEventHandler(ActionEvent.ACTION, inputTextEventHandler);
			} else if (styles.contains("inputTextEditButton")) {
				child.addEventHandler(ActionEvent.ACTION, inputTextEditEventHandler);
			} else if (styles.contains("opButton")) {
				child.addEventHandler(ActionEvent.ACTION, opEventHandler);
			} else if (styles.contains("actionButton")) {
				child.addEventHandler(ActionEvent.ACTION, actionEventHandler);
			}
			if ("valueTextNode".equals(child.getId())) {
				valueText = (TextInputControl) child;
			}
			if (child instanceof Pane) {
				addListeners(((Parent) child).getChildrenUnmodifiable());
			}
		}
	}

	public static void main(String[] args) {
		launch(RPNFX.class);
	}
}
