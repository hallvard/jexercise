package program;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GridGameGUI extends Application implements GameOutput, GridListener {

	private GridGame gridGame;
	private String level = null;

	private void init(GridGame program, String level) {
		this.gridGame = program;
		this.level = level;
	}
	
	private GridGame getGridGame() {
		return this.gridGame;
	}

	private TextInputControl levelTextField;
	private Button startButton;

	private TextInputControl inputTextField;
	private Button inputButton;

	private Button browseButton;
	private FileChooser fileChooser;
	
	private Map<KeyCombination, Node> keyCombinationNodes; 

	@Override
	public void start(final Stage stage) throws Exception {
		List<String> parameters = getParameters().getRaw();
		GridGame program = (GridGame) Class.forName(parameters.get(0)).newInstance();
		init(program, parameters.size() > 1 ? parameters.get(1) : null);

		URL url = program.getClass().getResource(program.getClass().getSimpleName() + ".fxml");
		if (url == null) {
			url = this.getClass().getResource(this.getClass().getSimpleName() + ".fxml");
		}
		Parent root = FXMLLoader.load(url, null, new ProgramBuilderFactory());

		browseButton = lookupNode(root, "#fileButton", Button.class, browseActionHandler);

		levelTextField = lookupNode(root, "#levelTextField", TextInputControl.class, levelTextActionHandler);
		if (levelTextField != null && level != null) {
			levelTextField.setText(level);
		}
		startButton = lookupNode(root, "#startButton", Button.class, levelTextActionHandler);

		inputTextField = lookupNode(root, "#inputTextField", TextInputControl.class, inputTextActionHandler);
		inputButton = lookupNode(root, "#inputButton", Button.class, inputTextActionHandler);

		messageText = lookupNode(root, "#messageText", Text.class);
		gridPane = lookupNode(root, "#gridPane", GameGridPane.class);
		
		if (gridPane != null) {
			gridPane.setFocusTraversable(true);
			keyCombinationNodes = new HashMap<KeyCombination, Node>();
			for (Node node : root.lookupAll(".keyCombinationId")) {
				keyCombinationNodes.put(KeyCombination.valueOf(node.getId().replace('_', '+')), node);
			}
			for (Node node : root.lookupAll(".inputTextButton")) {
				if (node instanceof Labeled) {
					char firstChar = ((Labeled) node).getText().charAt(0);
					KeyCharacterCombination kc = new KeyCharacterCombination(String.valueOf(firstChar));
					keyCombinationNodes.put(kc, node);
				}
			}
			gridPane.setOnKeyTyped(keyCombinationHandler);
			gridPane.setOnKeyPressed(keyCombinationHandler);
			gridPane.setOnKeyPressed(directionKeyHandler);
			gridPane.setOnMouseClicked(graphicsNodeMouseHandler);
		}

		for (Node node : root.lookupAll(".inputTextButton")) {
			setActionHandler(node, inputTextActionHandler);
		}
		
		stage.setScene(new Scene(root));
		stage.show();
	}

	private <T extends Node> T lookupNode(Node root, String selector, Class<T> c) {
		Node node = root.lookup(selector);
		return (c.isInstance(node) ? (T) node : null);
	}
	
	private <T extends Node> T lookupNode(Node root, String selector, Class<T> c, EventHandler<ActionEvent> handler) {
		T node = lookupNode(root, selector, c);
		if (handler != null) {
			setActionHandler(node, handler);
		}
		return node;
	}

	private <T extends Node> void setActionHandler(T node, EventHandler<ActionEvent> handler) {
		if (node instanceof ButtonBase) {
			((ButtonBase) node).setOnAction(handler);
		} else if (node instanceof TextField) {
			((TextField) node).setOnAction(handler);
		}
	}
	
	private EventHandler<ActionEvent> levelTextActionHandler = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent actionEvent) {
			getGridGame().init(levelTextField.getText());
			getGridGame().run(GridGameGUI.this);
			if (gridPane != null) {
				gridProvider = getGridGame().getGridProvider();
				gridProvider.addGridListener(GridGameGUI.this);
				initGrid();
				gridPane.requestFocus();
			}
			inputButton.setDisable(false);
		}
	};

	private EventHandler<ActionEvent> inputTextActionHandler = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent actionEvent) {
			Object source = actionEvent.getSource();
			if (source == inputTextField || source == inputButton) {
				doCommand(inputTextField.getText());
			} else if (source instanceof Labeled && ((Node) source).getStyleClass().contains("inputTextButton")) {
				doCommand(((Labeled) source).getText());
			}
		}
	};
	
	private EventHandler<ActionEvent> browseActionHandler = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent actionEvent) {
			if (fileChooser == null) {
				fileChooser = new FileChooser();
			}
			fileChooser.setTitle("Open level file");
			File file = fileChooser.showOpenDialog(browseButton.getScene().getWindow());
			if (file != null) {
				levelTextField.setText(file.getAbsolutePath());
				doAction(startButton);
			}
		}
	};
	
	private EventHandler<KeyEvent> directionKeyHandler = new EventHandler<KeyEvent>() {
		@Override
		public void handle(KeyEvent keyEvent) {
			if (! keyEvent.isConsumed()) {
				if (keyEvent.getCode() == KeyCode.UP) {
					directionInput(0, -1);
				} else if (keyEvent.getCode() == KeyCode.DOWN) {
					directionInput(0, 1);
				} else if (keyEvent.getCode() == KeyCode.LEFT) {
					directionInput(-1, 0);
				} else if (keyEvent.getCode() == KeyCode.RIGHT) {
					directionInput(1, 0);
				} else {
					return;
				}
				keyEvent.consume();
			}
		}
	};
	
	private EventHandler<KeyEvent> keyCombinationHandler = new EventHandler<KeyEvent>() {
		@Override
		public void handle(KeyEvent keyEvent) {
			if (! keyEvent.isConsumed()) {
				Node node = getKeyCombinationNode(keyEvent);
				if (node != null && doAction(node)) {
					keyEvent.consume();
				}
			}
		}
	};
	
	private EventHandler<MouseEvent> graphicsNodeMouseHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent mouseEvent) {
			gridPane.requestFocus();
			for (Node child : gridPane.getChildrenUnmodifiable()) {
				Bounds bounds = child.getBoundsInParent();
				if (bounds.contains(mouseEvent.getX(), mouseEvent.getY())) {
					Integer column = GridPane.getColumnIndex(child), row = GridPane.getRowIndex(child);
					if (column != null && column < gridProvider.getGridWidth() && row != null && row < gridProvider.getGridHeight()) {
						gridInput(column, row);
					}
				}
			}
		}
	};
	
	private boolean match(KeyCombination kc, KeyEvent keyEvent) {
		if (keyEvent.getEventType() == KeyEvent.KEY_TYPED) {
			if (kc instanceof KeyCharacterCombination) {
				return ((KeyCharacterCombination) kc).getCharacter().equals(keyEvent.getCharacter());
			}
		} else  {
			return kc.match(keyEvent);
		}
		return false;
	}
	
	private Node getKeyCombinationNode(KeyEvent keyEvent) {
		for (KeyCombination kc : keyCombinationNodes.keySet()) {
			if (match(kc, keyEvent)) {
				return keyCombinationNodes.get(kc);
			}
		}
		return null;
	}

	private void doCommand(String line) {
		updateMessage(null, null, true);
		Integer result = getGridGame().doCommand(line);
		handleInputResult(result);
		inputTextField.selectAll();
	}

	private void handleInputResult(Integer result) {
		if (result != null) {
			info("Game over" + (result != 0 ? "" : ", no result") + "!");
			inputButton.setDisable(true);
		}
	}
	
	private void gridInput(int column, int row) {
		updateMessage(null, null, true);
		Integer result = getGridGame().gridElementInput(column, row);
		handleInputResult(result);
	}
	
	private void directionInput(int dx, int dy) {
		updateMessage(null, null, true);
		Integer result = getGridGame().directionInput(dx, dy);
		handleInputResult(result);
	}

	private boolean doAction(Node node) {
		EventHandler<ActionEvent> handler = null;
		if (node instanceof ButtonBase) {
			handler = ((ButtonBase) node).getOnAction();
		} else if (node instanceof TextField) {
			handler = ((TextField) node).getOnAction();
		}
		if (handler != null) {
			handler.handle(new ActionEvent(node, null));
			return true;
		} else if (node instanceof ButtonBase) {
			((ButtonBase) node).fire();
			return true;
		}
		return false;
	}
	
	// from GraphicalOutput
	
	private Node messageText;

	public void info(String message) {
		updateMessage(message, null, false);
	}

	public void warning(String message) {
		updateMessage(message, Color.RED, false);
	}

	public void error(String message) {
		Stage dialog = new Stage();
		dialog.initStyle(StageStyle.UTILITY);
		Scene scene = new Scene(new Group(new Text(25, 25, message)));
		dialog.setScene(scene);
		dialog.show();
	}

	private void updateMessage(String message, final Paint paint, boolean clear) {
		String text = message != null ? message : "";
		if (messageText instanceof Text) {
			if (! clear) {
				text = ((Text) messageText).getText() + "\n" + text;
			}
			((Text) messageText).setFill(paint != null ? paint : Color.BLACK);
			((Text) messageText).setText(text);
		} else if (messageText instanceof Labeled) {
			if (! clear) {
				text = ((Labeled) messageText).getText() + "\n" + text;
			}
			((Labeled) messageText).setText(text);
		}
	}

	private GameGridPane gridPane;
	
	private GridProvider gridProvider;
	
	@Override
	public void gridChanged(GridProvider gridProvider, int x, int y, int w, int h) {
		if (gridProvider == this.gridProvider) {
			updateGrid(x, y, w, h);
		}
	}

	private void initGrid() {
		gridPane.setDimensions(gridProvider.getGridWidth(), gridProvider.getGridHeight());
		updateGrid(0, 0, gridProvider.getGridWidth(), gridProvider.getGridHeight());
		gridPane.setPrefSize(gridProvider.getGridWidth() * 16, gridProvider.getGridHeight() * 16);
	}
	
	private void updateGrid(int x, int y, int w, int h) {
		for (int column = x; column < x + w; column++) {
			for (int row = y; row < y + h; row++) {
				Object gridElement = gridProvider.getGridElement(column, row);
				String text = getGridGame().getTextFor(gridElement);
				String imageKey = getGridGame().getImageFor(gridElement);
				gridPane.setText(text, column, row);
				gridPane.setImage(imageKey, column, row, getGridGame(), this);
			}			
		}
	}
	
	//
	
	public static void main(String[] args) throws Exception {
		launch(GridGameGUI.class, args);
	}
}
