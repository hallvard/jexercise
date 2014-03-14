package inheritance;

import javafx.geometry.Point2D;

public class SpaceObject extends BaseSpaceObject {

	protected double speedX, speedY;
	
	public void setSpeed(double speedX, double speedY) {
		this.speedX = speedX;
		this.speedY = speedY;
	}
	
	public Point2D getSpeed() {
		return new Point2D(speedX, speedY);
	}
	
	public void accelerate(double ax, double ay) {
		speedX += ax;
		speedY += ay;
	}

	public void tick() {
		translate(speedX, speedY);
	}

	public double getMass() {
		return 0;
	}
	
	public void applyForce(double fx, double fy) {
		if (getMass() == 0) {
			throw new IllegalStateException("Cannot apply force to massless object");
		}
		accelerate(fx / getMass(), fy / getMass());
	}

	public boolean intersects(SpaceObject other) {
		return this.intersects1(other) || other.intersects1(this);
	}

	private boolean intersects1(SpaceObject other) {
		for (int i = 0; i < other.getPointCount(); i++) {
			if (contains(other, i)) {
				return true;
			}
		}
		return contains(parentToLocal(other.getCenter(true)));
	}
}
