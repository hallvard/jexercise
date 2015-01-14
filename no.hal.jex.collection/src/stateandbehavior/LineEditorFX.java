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
		update();
	}

	public void initialize() {
		lineEditor = new LineEditor();
		update();
	}
	
	private LineEditor lineEditor;
	
	@FXML Text beforeCursor;
	@FXML Text cursor;
	@FXML Text afterCursor;
	
	private void update() {
		beforeCursor.setText(lineEditor.text.substring(0,  lineEditor.insertionIndex));
		cursor.setText(String.valueOf(lineEditor.insertionIndex));
		afterCursor.setText(lineEditor.text.substring(lineEditor.insertionIndex));
	}
	
	@FXML void left() {
		lineEditor.left();
		update();
	}
	
	@FXML void right() {
		lineEditor.right();
		update();
	}
	
	@FXML void deleteLeft() {
		lineEditor.deleteLeft();
		update();
	}
	
	@FXML void deleteRight() {
		lineEditor.deleteRight();
		update();
	}
	
	@FXML TextField insertString_arg1;
	
	@FXML void insertString() {
		lineEditor.insertString(insertString_arg1.getText());
		update();
	}
	
	public static void main(String[] args) {
		launch(LineEditorFX.class, args);
	}
}
