package cs235.lab5;
public class Test {
	public static void main(String args[]){
		CarbonFootPrint
				myCar		= new Car(35),
				myHouse		= new Building(1200),
				myBike		= new Bicycle(),
				myGreenCar	= new GreenCar(35, 17);
		System.out.println(myCar);
		System.out.println(myGreenCar);
		System.out.println(myHouse);
		System.out.println(myBike);
	}
}
