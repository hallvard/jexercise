package inheritance;

import javafx.scene.paint.Color;

public class SpaceShip extends SpaceObject {

	private double angleSpeed;
	
	public SpaceShip() {
		addPoints(
			10.0d, 0.0d,
			-10.0d, 7.0d, 
			-10.0d, -7.0d
		);
		setFill(Color.GREEN);
		angleSpeed = 0.0;
	}

	public void sidewaysThrust(double thrust) {
		this.angleSpeed += thrust;
	}
	
	@Override
	public void tick() {
		super.tick();
		setRotate(getRotate() - angleSpeed);
	}
	
	public void forwardThrust(double thrust) {
		double angle = Math.toRadians(getRotate());
		accelerate(thrust * Math.cos(angle), thrust * Math.sin(angle));
	}

	@Override
	public double getMass() {
		return 1;
	}
	
}
