package inheritance;

public class Asteroid extends SpaceObject {

	protected final double density;
	protected final double radius;

	public Asteroid(double density, double radius) {
		this.density = density;
		this.radius = radius;
	}

	public Asteroid(double density, double radius, int cornerCount, double irregularity) {
		this(density, radius);
		for (int i = 0; i < cornerCount; i++) {
			double angle = i * Math.PI * 2 / cornerCount;
			double d = (1.0 - irregularity) + Math.random() * irregularity;
			addPolarPoint(angle, radius * d * 20);
		}
		setTranslateX(radius);
		setTranslateY(radius);
	}
	
	@Override
	public double getMass() {
		return density * Math.pow(radius, 3);
	}
}
