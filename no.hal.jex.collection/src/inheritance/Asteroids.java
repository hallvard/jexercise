package inheritance;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Asteroids extends Pane implements EventHandler<KeyEvent>  {

	private List<SpaceObject> spaceObjects;
	
	protected void add(SpaceObject so, double x, double y) {
		so.translate(x, y);
		getChildren().add(so);
		spaceObjects.add(so);
	}

	protected void remove(SpaceObject so) {
		getChildren().remove(so);
		spaceObjects.remove(so);
	}
	
	public void init() {
		spaceObjects = new ArrayList<SpaceObject>();
	}

	public void run() {
		Timeline tickTimer = new Timeline(new KeyFrame(Duration.millis(50), new EventHandler<ActionEvent>() {
			private int tickCount = 0;
			@Override
			public void handle(ActionEvent event) {
				tick(tickCount++);
			}
		}));
		tickTimer.setCycleCount(Timeline.INDEFINITE);
		tickTimer.play();
		requestFocus();
		setOnKeyPressed(this);
		setOnKeyTyped(this);
	}

	protected void handleKey(KeyCode keyCode) {
	}

	/*
	 * Used for pausing or stepping
	 */
	private int steps = -1;
	
	protected void handleKey(String character) {
		if ("+".equals(character)) {
			zoom(2);
		} else if ("-".equals(character)) {
			zoom(0.5);
		} else if (" ".equals(character)) {
			// toggle steps
			steps = (steps < 0 ? 0 : -1);
		} else if (">".equals(character)) {
			// one step
			steps = 1;
		}
	}
	
	private void zoom(double factor) {
		setScaleX(getScaleX() * factor);
		setScaleY(getScaleY() * factor);
	}
	
	@Override
	public void handle(KeyEvent keyEvent) {
		if (keyEvent.getCode() == KeyCode.UNDEFINED) {
			handleKey(keyEvent.getCharacter());
		} else {
			handleKey(keyEvent.getCode());
		}
	}

	private void tick(int tickCount) {
		
		if (steps == 0) {
			return;
		} else if (steps > 0) {
			steps--;
		}
		
		// accelerate due to gravity
		for (int i = 0; i < spaceObjects.size(); i++) {
			for (int j = i + 1; j < spaceObjects.size(); j++) {
				handleGravity(spaceObjects.get(i), spaceObjects.get(j));
			}
		}

		// move all objects
		for (SpaceObject spaceObject : spaceObjects) {
			spaceObject.tick();
		}
		
		// check for collision
		List<SpaceObject> collisions = new ArrayList<SpaceObject>(); 
		for (int i = 0; i < spaceObjects.size(); i++) {
			for (int j = i + 1; j < spaceObjects.size(); j++) {
				SpaceObject spaceObject1 = spaceObjects.get(i), spaceObject2 = spaceObjects.get(j);
				if (spaceObject1.intersects(spaceObject2)) {
					collisions.add(spaceObject1);
					collisions.add(spaceObject2);
				}
			}
		}
		for (SpaceObject spaceObject : spaceObjects) {
			if (! collisions.contains(spaceObject)) {
				handleCollision(spaceObject, null);
			}
		}
		for (int i = 0; i < collisions.size(); i += 2) {
			SpaceObject spaceObject1 = collisions.get(i), spaceObject2 = collisions.get(i + 1);
			handleCollision(spaceObject1, spaceObject2);
		}
	}
	
	public void handleGravity(SpaceObject spaceObject1, SpaceObject spaceObject2) {
		if (spaceObject1.getMass() * spaceObject2.getMass() != 0) {
			Point2D d = sub(spaceObject2.getCenter(true), spaceObject1.getCenter(true));
			double d2 = d.getX() * d.getX() + d.getY() * d.getY(), dist = Math.sqrt(d2);
			double force = spaceObject1.getMass() * spaceObject2.getMass() / d2;
			spaceObject1.applyForce(force * d.getX() / dist, force * d.getY() / dist);
			spaceObject2.applyForce(force * (- d.getX()) / dist, force * (- d.getY()) / dist);
		}
	}
	
	//

	private Point2D add(Point2D p1, Point2D p2) {
		return new Point2D(p2.getX() + p1.getX(), p2.getY() + p2.getY());
	}

	private Point2D sub(Point2D p1, Point2D p2) {
		return new Point2D(p1.getX() - p2.getX(), p1.getY() - p2.getY());
	}

	private Point2D mult(Point2D p, double d) {
		return new Point2D(p.getX() * d, p.getY() * d);
	}

	private Point2D div(Point2D p, double d) {
		return new Point2D(p.getX() / d, p.getY() / d);
	}

	private double dist(Point2D p) {
		return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
	}
	
	private double dot(Point2D p1, Point2D p2) {
		return p1.getX() * p2.getX() + p1.getY() * p2.getY();
	}
	
	private void setSpeed(SpaceObject so, Point2D speed) {
		so.setSpeed(speed.getX(), speed.getY());
	}

	// http://stackoverflow.com/questions/345838/ball-to-ball-collision-detection-and-handling
	public void handleCollision(SpaceObject so1, SpaceObject so2) {
		if (so2 == null) {
			so1.setStroke(null);
		} else {
			so1.setStroke(Color.RED);
			so2.setStroke(Color.RED);
			if (so1 instanceof Star || so2 instanceof Star) {
				handleInelasticCollision(so1, so2);
			} else {
				handleElasticCollision(so1, so2);
			}
		}
	}

	private void handleElasticCollision(SpaceObject so1, SpaceObject so2) {
		// diff = so1.center - so2.center
		Point2D diff = sub(so1.getCenter(true), so2.getCenter(true));
		// d = diff / diff.length
		Point2D d = div(diff, dist(diff));
		// u1 = so1.speed * d, u2 = so2.speed * d
		double u1 = dot(so1.getSpeed(), d), u2 = dot(so2.getSpeed(), d);
		double md12 = so1.getMass() - so2.getMass(), ms12 = so1.getMass() + so2.getMass();
		double v1 = (u1 * md12 + 2 * so2.getMass() * u2) / ms12;
		double v2 = (u2 * (- md12) + 2 * so1.getMass() * u1) / ms12;
		// so1.speed += (v1 - u1) * d
		setSpeed(so1, add(so1.getSpeed(), mult(d, (v1 - u1))));
		// so2.speed += (v2 - u2) * d
		setSpeed(so2, add(so2.getSpeed(), mult(d, (v2 - u2))));
	}

	private void handleInelasticCollision(SpaceObject so1, SpaceObject so2) {
		// so1.speedX = (so1.speed * so1.mass + so2.speed * so2.mass) / (so1.mass + s02.mass)
		setSpeed(so1, div(add(mult(so1.getSpeed(), so1.getMass()), mult(so2.getSpeed(), so2.getMass())), so1.getMass() + so2.getMass()));
		remove(so2);
	}
	
	//

	public static void main(String[] args) {
		AsteroidsProgram.main(new String[]{inheritance.Asteroids.class.getName()});
	}
}
