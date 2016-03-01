package cs235.lab3;
public class ParkingSpace {
	private int spaceNum;
	private boolean isEmpty;
	public ParkingSpace(int spaceNum){
		this.spaceNum = spaceNum;
	}
	public int getSpaceNum(){return spaceNum;}
	public boolean isEmpty(){return isEmpty;}
	public void setEmpty(boolean isEmpty){this.isEmpty = isEmpty;}
	public void showSpaceType(){System.out.println("Space type is not defined!");}
}
