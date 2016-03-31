package cs235.quiz4.MovableShapes;

import cs235.quiz4.Interface.Movable;

public class MovableCircle implements Movable {

	// instance variables
	private MovablePoint center;   // can use center.x, center.y directly
	                              //  because they are package accessible
	private int radius;
	
	// Constructor
	   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
	      // Call the MovablePoint's constructor to allocate the center instance.
	      center = new MovablePoint(x, y, xSpeed, ySpeed);
	      this.setRadius(radius);
	   }
	  
	// Implement abstract methods declared in the interface Movable
	
	@Override
	public void moveUp() {
		System.out.println("Move up " + center.ySpeed);
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		System.out.println("Move down " + center.ySpeed);
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft() {
		System.out.println("Move left " + center.xSpeed);
		center.x -= center.xSpeed;
	}

	@Override
	public void moveRight() {
		System.out.println("Move right " + center.xSpeed);
		center.x += center.xSpeed;
	}

	// Define other methods
	public String toString()
	{
		return "The circle with radius " + getRadius() + " is at ("
				+ center.x + "," + center.y + ")";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
