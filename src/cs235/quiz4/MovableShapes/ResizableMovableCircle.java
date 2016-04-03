package cs235.quiz4.MovableShapes;
import cs235.quiz4.Interface.*;
public class ResizableMovableCircle extends MovableCircle implements Resizable,ResizableRemovableGeometricObject{
	public ResizableMovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super(x, y, xSpeed, ySpeed, radius);
	}
	@Override public void resize(int percent){
		System.out.println("Resizing by " + percent + "%");
		super.setRadius((int)(super.getRadius() * (percent / 100.0)));
	}
	@Override public double getPerimeter(){
		return 2 * Math.PI * super.getRadius();
	}
	@Override public double getArea(){
		return Math.PI * Math.pow(super.getRadius(), 2);
	}
}