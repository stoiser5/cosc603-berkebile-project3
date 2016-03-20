package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		
		Double width = p2.x - p1.x;
		Double height = p2.y - p1.y;
		
		return Math.abs(width * height);
		
	}
	
	/**
	 * Gets the diagonal using the Pythagoras theorem.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		
		Double width = p2.x - p1.x;
		Double height = p2.y - p1.y;
		
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
