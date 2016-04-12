package cs235.lab5;
public class Building implements CarbonFootPrint{
	private int squareFeet;
	public Building(int squareFeet){
		this.squareFeet = squareFeet;
	}
	public String toString(){
		return "A " + squareFeet + "sqft building has a carbon footprint of " + getCarbonFootPrint() + " pounds of CO2.";
	}
	@Override public double getCarbonFootPrint() {
		return squareFeet * (50 + 20 + 47 + 17);
	}

}
