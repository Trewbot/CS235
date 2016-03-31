package cs235.quiz4.Test;

import cs235.quiz4.Interface.Movable;
import cs235.quiz4.MovableShapes.*;

public class Test {

	public static void main(String[] args) {
		
		//MovablePoint is a sub-type of Movable
		Movable m1 = new MovablePoint(5, 6, 10, 15);     
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		   
		//MovableCircle is a sub-type of Movable
		Movable m2 = new MovableCircle(2, 1, 2, 20, 1); 
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		//	MovableRectangle is a sub-type of Movable
		Movable m3 = new MovableRectangle(1,1,4,5,3,3);
		System.out.println(m3);
		m3.moveDown();
		System.out.println(m3);
	}

}
