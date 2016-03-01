package cs235.lab3;
public class TestParkingSpace{
	public static void main(String[] args){
		ParkingLot lot = new ParkingLot();
		RegularParkingSpace[] regularSpaces = lot.getRegularParkingSpaces();
		HandicappedParkingSpace[] handicappedSpaces = lot.getHandicappedParkingSpaces();
		for(int i = 0; i < handicappedSpaces.length; i++){
			System.out.print(
				"Parking space " +
				handicappedSpaces[i].getSpaceNum() +
				": ");
			handicappedSpaces[i].showSpaceType();
		}
		for(int i = 0; i < regularSpaces.length; i++){
			System.out.print(
				"Parking space " +
				regularSpaces[i].getSpaceNum() +
				": ");
			regularSpaces[i].showSpaceType();
		}
	}
}
