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

	protected void handleKey(String character) {
		if ("+".equals(character)) {
			zoom(2);
		} else if ("-".equals(character)) {
			zoom(0.5);
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
			Point2D center = spaceObject1.getCenter(true);
			Point2D otherCenter = spaceObject2.getCenter(true);
			double dx = otherCenter.getX() - center.getX(), dy = otherCenter.getY() - center.getY();
			double d2 = dx * dx + dy * dy, d = Math.sqrt(d2);
			double force = spaceObject1.getMass() * spaceObject2.getMass() / d2;
			spaceObject1.applyForce(force * dx / d, force * dy / d);
			spaceObject2.applyForce(force * (- dx) / d, force * (- dy) / d);
		}
	}

	public void handleCollision(SpaceObject spaceObject1, SpaceObject spaceObject2) {
		if (spaceObject2 == null) {
			spaceObject1.setStroke(null);
		} else {
			spaceObject1.setStroke(Color.RED);
			spaceObject2.setStroke(Color.RED);
		}
	}
}
