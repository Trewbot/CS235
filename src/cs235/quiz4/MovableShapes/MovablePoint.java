package cs235.quiz4.MovableShapes;

import cs235.quiz4.Interface.Movable;

public class MovablePoint implements Movable {
	
	//instance variables
	//package access
	int x, y, xSpeed, ySpeed;
	
	//Constructor
	public MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		System.out.println("Move up " + ySpeed);
		y -= ySpeed; // y-axis pointing down for 2D graphics
	}
	
	@Override
	public void moveDown() {
		System.out.println("Move down " + ySpeed);
		y += ySpeed;
	}
	
	@Override
	public void moveLeft() {
		System.out.println("Move left " + xSpeed);
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		System.out.println("Move Right " + xSpeed);
		x += xSpeed;
	}
	
	// Define other methods
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}

}
