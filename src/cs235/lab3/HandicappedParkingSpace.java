package cs235.lab3;
public class HandicappedParkingSpace extends ParkingSpace{
	HandicappedParkingSpace(int spaceNum){
		super(spaceNum);
	}
	public void showSpaceType(){System.out.println("It is a handicapped parking space.");}
}
