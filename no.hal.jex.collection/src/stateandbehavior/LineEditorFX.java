package stateandbehavior;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LineEditorFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(this);
		Parent root = (Parent) fxmlLoader.load(this.getClass().getResourceAsStream(this.getClass().getSimpleName() + ".fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public void initialize() {
		lineEditor = new LineEditor();
		update();
	}
	
	private LineEditor lineEditor;
	
	@FXML
	private Text toStringText;
	
	private void update() {
		toStringText.setText(lineEditor.toString());
	}
	
	@FXML
	private void left() {
		lineEditor.left();
		update();
	}
	
	@FXML
	private void right() {
		lineEditor.right();
		update();
	}
	
	@FXML
	private void deleteLeft() {
		lineEditor.deleteLeft();
		update();
	}
	
	@FXML
	private void deleteRight() {
		lineEditor.deleteRight();
		update();
	}
	
	@FXML
	private TextField insertString_arg1;
	
	@FXML
	private void insertString() {
		lineEditor.insertString(insertString_arg1.getText());
		update();
	}
	
	public static void main(String[] args) {
		launch(LineEditorFX.class, args);
	}
}
