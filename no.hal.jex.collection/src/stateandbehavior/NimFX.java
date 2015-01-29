package stateandbehavior;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class NimFX extends Application {

	public static void main(String[] args) {
		launch(NimFX.class, args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(this);
		Parent root = (Parent) fxmlLoader.load(this.getClass().getResourceAsStream(this.getClass().getSimpleName() + ".fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	@FXML Text pile1;
	@FXML Text pile2;
	@FXML Text pile3;
	@FXML Text gameState;
	
	@FXML TextField pileSizeField;
	@FXML TextField numberField;
	
	@FXML Text feedbackText;
	@FXML ChoiceBox<String> targetPileChoice; 
	
	private Nim nim;
	
	public void initialize() {
		targetPileChoice.setItems(FXCollections.observableArrayList("1", "2", "3"));
		nim = new Nim();
		update();
	}
	
	public void newGame(){
		int pileSize = Integer.valueOf(pileSizeField.getText());
		nim = new Nim(pileSize);
		update();
	}
	
	public void removePieces(){
		int number = Integer.valueOf(numberField.getText());
		int targetPile = Integer.valueOf(targetPileChoice.getValue());
		
		if(nim.isValidMove(number, targetPile)){
			nim.removePieces(number, targetPile);
			feedbackText.setText(String.format("Removed %d pieces.", number));
			update();
		}
		else{
			feedbackText.setText("Illegal move!");
		}
			
	}
	
	
	private void update() {
		pile1.setText(Integer.toString(nim.getPile(1)));
		pile2.setText(Integer.toString(nim.getPile(2)));
		pile3.setText(Integer.toString(nim.getPile(3)));
		
		if(nim.isGameOver())
			gameState.setText("Game over!");
		else
			gameState.setText("Game active");
	}
	
	
	
	
	
}
