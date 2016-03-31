package cs235.quiz4.MovableShapes;
import cs235.quiz4.Interface.Movable;
public class MovableRectangle implements Movable{
	private MovablePoint topLeft, bottomRight;
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
		topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
		bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
		
	}
	public String toString(){
		return "The rectangle is between the points " + topLeft + " and " + bottomRight;
	}
	@Override
	public void moveUp() {
		// could just say moveUp() on each point but that would output "Move up" twice
		System.out.println("Move up " + topLeft.ySpeed);
		topLeft.y -= topLeft.ySpeed;
		bottomRight.y -= bottomRight.ySpeed;
	}
	@Override
	public void moveDown() {
		System.out.println("Move down " + topLeft.ySpeed);
		topLeft.y += topLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
	}
	@Override
	public void moveLeft() {
		System.out.println("Move left " + topLeft.xSpeed);
		topLeft.x -= topLeft.xSpeed;
		bottomRight.x -= topLeft.xSpeed;
	}
	@Override
	public void moveRight() {
		System.out.println("Move right " + topLeft.xSpeed);
		topLeft.x += topLeft.xSpeed;
		bottomRight.x += topLeft.xSpeed;
	}
}
