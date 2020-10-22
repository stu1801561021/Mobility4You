package cars.brand;

public class GasCar extends Vehicle{
	
	protected short engineDisplacement;
	protected float price;

	public GasCar(String brand, String modelName, short enginePower, short engineDisplacement, float price) {
		super(brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.price = price;
	}

	@Override
	public String printInfo() {
		return super.printInfo() + " || Engine Displacement: " + engineDisplacement + "L" +
								   " || Price: " + price + "euro";
	}
	
	public short getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(short engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	
	public float getPrice() {
		return price;
	}

	
	public void setPrice(float price) {
		this.price = price;
	}

}
