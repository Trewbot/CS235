package cs235.lab3;
public class ParkingLot {
	private RegularParkingSpace[] regularSpaces;
	private HandicappedParkingSpace[] handicappedSpaces;
	ParkingLot(){
		HandicappedParkingSpace[] handicapped = {
			new HandicappedParkingSpace(1000),
			new HandicappedParkingSpace(1001)
		};
		RegularParkingSpace[] regular = {
			new RegularParkingSpace(1002),
			new RegularParkingSpace(1002),
			new RegularParkingSpace(1003)
		};
		this.handicappedSpaces = handicapped;
		this.regularSpaces = regular;
	}
	ParkingLot(RegularParkingSpace[] regularSpaces, HandicappedParkingSpace[] handicappedSpaces){
		this.regularSpaces = regularSpaces;
		this.handicappedSpaces = handicappedSpaces;
	}
	public int getSpaceCount(){
		return this.handicappedSpaces.length + this.regularSpaces.length;
	}
	public RegularParkingSpace[] getRegularParkingSpaces(){return regularSpaces;}
	public HandicappedParkingSpace[] getHandicappedParkingSpaces(){return handicappedSpaces;}
}
