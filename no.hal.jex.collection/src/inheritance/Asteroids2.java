package inheritance;

import javafx.scene.paint.Color;

public class Asteroids2 extends Asteroids {

	public void init() {
		super.init();
		// create sun - which is just a large asteroid
		// with some modifications.
		SpaceObject sun = new Star(1, 2);
		add(sun, getPrefWidth() / 2, getPrefHeight() / 2);

		// create nicely orbiting asteroid
		SpaceObject satelite = new Asteroid(10, 1, 10, 0.8);
		satelite.setSpeed(2, 0);
		satelite.setFill(Color.GRAY);
		add(satelite, getPrefWidth() / 2, getPrefHeight() * 3 / 4);

		// create random asteroids
		for (int i = 0; i < 7; i++) {
			SpaceObject asteroid = new Asteroid(Math.random() * 0.5 + 0.2, Math.random() + 0.2, 10, 0.8);
			asteroid.setSpeed((Math.random() - 0.5) * 3, (Math.random() - 0.5) * 3);
			add(asteroid, Math.random() * getPrefWidth(), Math.random() * getPrefHeight());
		}
	}
	
	//

	public static void main(String[] args) {
		AsteroidsProgram.main(new String[]{inheritance.Asteroids2.class.getName()});
	}
}
