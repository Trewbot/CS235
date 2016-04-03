package cs235.quiz4.Test;
import cs235.quiz4.Interface.Movable;
import cs235.quiz4.MovableShapes.*;
public class Test {
	public static void main(String[] args) {
		Movable[] shapes = new Movable[6];
		for(int i = 0; i < shapes.length; i++)
			shapes[i] = i % 2 > 0 ? new MovableCircle(i,i,1,1,i) : new MovableRectangle(i,i,2*i,2*i,1,1);
		for(Movable i : shapes){
			System.out.println(i);
			i.moveUp();
			i.moveDown();
			i.moveRight();
			i.moveLeft();
			System.out.println(i);
			System.out.println();
		}
		
		ResizableMovableCircle circa = new ResizableMovableCircle(56, 64, 7, 6, 36);
		System.out.println(circa);
		circa.moveDown();
		circa.moveLeft();
		circa.resize(50);
		System.out.println(circa);
	}
}