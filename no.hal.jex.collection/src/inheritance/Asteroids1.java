package inheritance;

import javafx.scene.paint.Color;

public class Asteroids1 extends Asteroids {

	public void init() {
		super.init();

		SpaceObject spaceObject1 = new SpaceObject();
		spaceObject1.addPolarPoint(0, 50);
		spaceObject1.addPolarPoint(90, 50);
		spaceObject1.addPolarPoint(180, 50);
		spaceObject1.addPolarPoint(270, 50);
		spaceObject1.setSpeed(1, 1);
		spaceObject1.setFill(Color.WHITE);
		add(spaceObject1, 150, 150);
		
		SpaceObject spaceObject2 = new SpaceObject();
		spaceObject2.addPolarPoint(45, 50);
		spaceObject2.addPolarPoint(135, 50);
		spaceObject2.addPolarPoint(225, 50);
		spaceObject2.addPolarPoint(315, 50);
		spaceObject2.setSpeed(1, 0);
		spaceObject2.setFill(Color.WHITE);
		add(spaceObject2, 150, 300);
		
		SpaceObject spaceObject3 = new SpaceObject();
		spaceObject3.addPolarPoint(0, 50);
		spaceObject3.addPolarPoint(135, 50);
		spaceObject3.addPolarPoint(225, 50);
		spaceObject2.setSpeed(1, -1);
		spaceObject3.setFill(Color.WHITE);
		add(spaceObject3, 150, 450);
	}
}
