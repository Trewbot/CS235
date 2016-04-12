package cs235.lab5;

public class GreenCar extends Car implements CarbonFootPrint {
	private int mpg;
	public GreenCar(int gallonsOfGas, int mpg) {
		super(gallonsOfGas);
		this.mpg = mpg;
	}
	public String toString(){
		return "A " + mpg + "mpg car with " + super.getGallonsOfGas() + "gal of gas has a carbon footprint of " + getCarbonFootPrint() + " pounds of CO2, and can go " + getRange() + "miles.";
	}
	public double getRange(){
		return super.getGallonsOfGas() / mpg;
	}
}
