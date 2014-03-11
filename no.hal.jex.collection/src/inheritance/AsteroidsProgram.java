package inheritance;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AsteroidsProgram extends Application {

	private int width = 800, height = 600;

	@Override
	public void start(Stage stage) throws Exception {
		String paneClassName = getParameters().getRaw().get(0);
		final Asteroids asteroidsPane = (Asteroids) Class.forName(paneClassName).newInstance();
		asteroidsPane.setPrefSize(width, height);
		Scene scene = new Scene(asteroidsPane, width, height, Color.BLACK);
		stage.setScene(scene);
		stage.show();
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				asteroidsPane.init();
				asteroidsPane.run();
			}
		});
	}
	
	public static void main(String[] args) {
		launch(AsteroidsProgram.class, args);
	}
}
