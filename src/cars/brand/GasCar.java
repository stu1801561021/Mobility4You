package cars.brand;

public class GasCar extends Vehicle{
	
	protected short engineDisplacement;
	protected double price;

	public GasCar(String brand, String modelName, short enginePower, short engineDisplacement, double price) {
		super(brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + " || Engine Displacement: " + engineDisplacement + "L" +
								   " || Price: " + price + "euro";
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
