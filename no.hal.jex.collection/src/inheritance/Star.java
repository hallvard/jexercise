package inheritance;

import javafx.scene.paint.Color;

public class Star extends Asteroid {

	public Star(double density, double radius) {
		super(density * 100, radius, 20, 0.0);
		setFill(Color.YELLOW);
	}
}
