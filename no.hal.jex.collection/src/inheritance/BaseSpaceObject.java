package inheritance;

import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class BaseSpaceObject extends Polygon {

	public BaseSpaceObject() {
		setFill(Color.WHITE);
	}

	/**
	 * Adds the point given by x,y to this Polygon
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 */
	protected void addPoint(double x, double y) {
		getPoints().add(x);
		getPoints().add(y);
	}

	/**
	 * Adds the points given by the sequence of x- and y-coordinates
	 * @param xys the x- and y-coordinates
	 */
	protected void addPoints(double... xys) {
		for (int i = 0; i < xys.length; i += 2) {
			addPoint(xys[i], xys[i + 1]);
		}
	}
	
	/**
	 * Adds the point given by angle, length in polar coordinates
	 * @param angle the angle
	 * @param length the length
	 */
	protected void addPolarPoint(double angle, double length) {
		addPoint(Math.cos(angle) * length, Math.sin(angle) * length);
	}
	
	/**
	 * Adds the point given by angle, length in polar coordinates
	 * @param angle the angle
	 * @param length the length
	 */
	protected void addPolarPoints(double... als) {
		for (int i = 0; i < als.length; i += 2) {
			addPolarPoint(als[i], als[i + 1]);
		}
	}

	/**
	 * Returns the position of this Polygon as a Point2D object
	 * @return the position as a Point2D object
	 */
	public Point2D getPosition() {
		return new Point2D(getTranslateX(), getTranslateY());
	}

	/**
	 * Moves (displaces) this Polygon by the given dx, dy
	 * @param dx the x displacement
	 * @param dy the y displacement
	 */
	public void translate(double dx, double dy) {
		setTranslateX(getTranslateX() + dx);
		setTranslateY(getTranslateY() + dy);
	}
	
	/**
	 * Returns the position of the center of this Polygon.
	 * The asParentCoordinates determines if the position is transformed into the parent coordinate system.
	 * @param asParentCoordinates determines if the position is transformed into the parent coordinate system
	 * @return the center position
	 */
	public Point2D getCenter(boolean asParentCoordinates) {
		Bounds bounds = getBoundsInLocal();
		Point2D center = new Point2D((bounds.getMaxX() + bounds.getMinX()) / 2, (bounds.getMaxY() + bounds.getMinY()) / 2);
		if (asParentCoordinates) {
			center = localToParent(center);
		}
		return center;
	}

	/**
	 * Returns the number of points in this Polygon
	 * @return the number of points in this Polygon
	 */
	public int getPointCount() {
		return getPoints().size() / 2;
	}

	/**
	 * Determines of a specific point of another Polygon is inside this Polygon
	 * @param other the other Polygon
	 * @param pointNum the number of the point to check
	 * @return
	 */
	public boolean contains(BaseSpaceObject other, int pointNum) {
		ObservableList<Double> points = other.getPoints();
		double x = points.get(pointNum * 2), y = points.get(pointNum * 2 + 1);
		return this.contains(parentToLocal(other.localToParent(x, y)));
	}
}
