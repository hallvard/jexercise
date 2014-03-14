package inheritance;

import javafx.scene.input.KeyCode;

public class Asteroids3 extends Asteroids2 {

	private SpaceShip spaceShip;

	@Override
	public void init() {
		super.init();
		// create spaceship
		spaceShip = new SpaceShip();
		add(spaceShip, 100, 100);
	}

	@Override
	public void handleKey(KeyCode keyCode) {
		if (keyCode == KeyCode.LEFT) {
			spaceShip.sidewaysThrust(1);
		} else if (keyCode == KeyCode.RIGHT) {
			spaceShip.sidewaysThrust(-1);
		} else if (keyCode == KeyCode.UP) {
			spaceShip.forwardThrust(1);
		} else {
			super.handleKey(keyCode);
		}
	}
	
	//

	public static void main(String[] args) {
		AsteroidsProgram.main(new String[]{inheritance.Asteroids3.class.getName()});
	}
}
