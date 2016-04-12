package cs235.lab5;
public class Car implements CarbonFootPrint{
	private int gallonsOfGas;
	public Car(int gallonsOfGas){
		this.setGallonsOfGas(gallonsOfGas);
	}
	public String toString(){
		return "A car with " + getGallonsOfGas() + "gal of gas has a carbon footprint of " + getCarbonFootPrint() + " pounds of CO2.";
	}
	@Override public double getCarbonFootPrint(){
		return getGallonsOfGas() * 20;
	}
	public int getGallonsOfGas() {
		return gallonsOfGas;
	}
	public void setGallonsOfGas(int gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}
}
