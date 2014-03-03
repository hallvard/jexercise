package program;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GraphicalProgramDriver extends Application implements GraphicalOutput {

	private TextualProgram program;
	private String level = null;

	private void init(TextualProgram program, String level) {
		this.program = program;
		this.level = level;
	}
	
	private TextualProgram getProgram() {
		return GraphicalProgramDriver.this.program;
	}
	
	private TextInputControl levelTextField;
	private Button levelButton;;

	private TextInputControl inputTextField;
	private Button inputButton;

	private FileChooser fileChooser;

	@Override
	public void start(final Stage stage) throws Exception {
		List<String> parameters = getParameters().getRaw();
		TextualProgram program = (TextualProgram) Class.forName(parameters.get(0)).newInstance();
		init(program, parameters.size() > 1 ? parameters.get(1) : null);

		FXMLLoader fxmlLoader = new FXMLLoader();
		URL url = program.getClass().getResource(program.getClass().getSimpleName() + ".fxml");
		if (url == null) {
			url = this.getClass().getResource(this.getClass().getSimpleName() + ".fxml");
		}
		fxmlLoader.setLocation(url);
		fxmlLoader.load(url.openStream());
		Parent root = fxmlLoader.<Parent>getRoot();

		Button browseButton = (Button) root.lookup("#fileButton");

		browseButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (fileChooser == null) {
					fileChooser = new FileChooser();
				}
				fileChooser.setTitle("Open level file");
				File file = fileChooser.showOpenDialog(stage);
				if (file != null) {
					levelTextField.setText(file.getAbsolutePath());
					levelButton.getOnAction().handle(null);
				}
			}
		});
		levelTextField = (TextInputControl) root.lookup("#levelTextField");
		if (level != null) {
			levelTextField.setText(level);
		}
		inputTextField = (TextInputControl) root.lookup("#inputTextField");

		messageText = root.lookup("#messageText");
		graphicsNode = (GridPane) root.lookup("#gridPane");
		
		levelButton = (Button) root.lookup("#levelButton");
		inputButton = (Button) root.lookup("#inputButton");
		inputButton.setDisable(true);

		EventHandler<ActionEvent> openLevelHandler = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				openLevel(levelTextField.getText());
			}
		};
		if (levelTextField instanceof TextField) {
			((TextField) levelTextField).setOnAction(openLevelHandler);
		}
		levelButton.setOnAction(openLevelHandler);

		EventHandler<ActionEvent> doLineHandler = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				doLine(inputTextField.getText());
				inputTextField.selectAll();
			}
		};
		if (inputTextField instanceof TextField) {
			((TextField) inputTextField).setOnAction(doLineHandler);
		}
		inputButton.setOnAction(doLineHandler);
		
		stage.setScene(new Scene(root));
		stage.show();
	}

	public static void main(String[] args) throws Exception {
		launch(GraphicalProgramDriver.class, args);
	}
	
	//

	private void openLevel(String level) {
		getProgram().init(level);
		getProgram().run(GraphicalProgramDriver.this);
		inputButton.setDisable(false);
	}
	
	private void doLine(String line) {
		Boolean result = getProgram().doLine(line);
		if (result != null) {
			message("Game over, you " + (result ? "won" : "lost"));
			inputButton.setDisable(true);
		}
	}
	
	// from GraphicalOutput
	
	private Node messageText;

	@Override
	public void clear() {
		updateMessage(null, null);
		graphicsNode.getChildren().clear();
	}

	private void updateMessage(final Object o, final Paint paint) {
		String text = o != null ? o.toString() : "";
		if (messageText instanceof Text) {
			((Text) messageText).setFill(paint != null ? paint : Color.BLACK);
			((Text) messageText).setText(text);
		} else if (messageText instanceof Labeled) {
			((Labeled) messageText).setText(text);
		}
	}

	@Override
	public void message(Object o) {
		updateMessage(o, null);
	}

	@Override
	public void error(Object o) {
		updateMessage(o, Color.RED);
	}

	private GridPane graphicsNode;

	private void updateGraphics(final boolean managed, final Node... nodes) {
		if (graphicsNode != null) {
			for (int i = 0; i < nodes.length; i++) {
				Node node = nodes[i];
				node.setManaged(managed);
				graphicsNode.getChildren().add(node);
			}
		}
	}

	@Override
	public void line(int x1, int y1, int x2, int y2) {
		updateGraphics(false, new Line(x1, y1, x2, y2));
	}

	@Override
	public void rect(int x, int y, int w, int h) {
		updateGraphics(false, new Rectangle(x, y, w, h));
	}

	private Map<String, Image> images = new HashMap<String, Image>();
	
	@Override
	public void image(String imageKey, int x, int y, int w, int h) {
		Image image = createImage(imageKey);
		ImageView node = new ImageView(image);
		node.setLayoutX(x);
		node.setLayoutY(y);
		updateGraphics(false, node);
	}

	private Image createImage(String imageKey) {
		Image image = images.get(imageKey);
		if (image == null) {
			URL url = null;
			try {
				url = new URL(imageKey);
			} catch (MalformedURLException e) {
			}
			if (url == null) {
				url = program.getClass().getResource(imageKey);
			}
			if (url == null) {
				url = this.getClass().getResource(imageKey);
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

	@Override
	public void imageGrid(String s, Map<String, String> mapping) {
		imageGrid(s, 1, 1, mapping);
	}

	public void imageGrid(String s, int cellWidth, int cellHeight, Map<String, String> mapping) {
		GridPane gridPane = graphicsNode;
		gridPane.getChildren().clear();
		String[] lines = s.split("\n");
		int imageHeight = -1, imageWidth = -1;
		for (int row = 0; row < lines.length; row += cellHeight) {
			for (int column = 0; column < lines[row].length(); column += cellWidth) {
				String key = "";
				for (int i = 0; i < cellHeight; i++) {
					key += lines[row + i].substring(column, column + cellWidth);
				}
				String key2 = mapping.get(key);
				Image image = createImage(key2 != null ? key2 : key);
				if (image != null) {
					if (imageWidth <= 0) {
						imageWidth = (int) image.getWidth();
					}
					if (imageHeight <= 0) {
						imageHeight = (int) image.getHeight();
					}
					ImageView node = new ImageView(image);
					gridPane.add(node, column / cellWidth, row / cellHeight);
				}
			}
		}
		int prefWidth = imageWidth * lines[0].length() / cellWidth / cellHeight;
		int prefHeight = imageHeight * lines.length / cellHeight;
		gridPane.setPrefWidth(prefWidth);
		gridPane.setPrefHeight(prefHeight);
	}
}
