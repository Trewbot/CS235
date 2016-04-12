package cs235.lab5;

public class Bicycle implements CarbonFootPrint {
	public Bicycle(){
		//	No arguments
	}
	public String toString(){
		return "A Bicycle has a carbon footprint of 0 pounds of CO2.";
	}
	@Override public double getCarbonFootPrint() {
		return 0;
	}
}
