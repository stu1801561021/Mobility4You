package cars.brand;

public class GasCar extends Vehicle{
	
	protected short engineDisplacement;
	protected double price;

	public GasCar(String type, String brand, String modelName, short engineDisplacement, short enginePower, double price) {
		super(type, brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + engineDisplacement + "L, " + enginePower + "KW, " + price + " euro";
	}
	
	public short getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(short engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}

}
