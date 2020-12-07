package cars.brand.model;

public class GasCar extends Vehicle {
	
	protected float engineDisplacement;
	protected double price;

	public GasCar(String type, String brand, String modelName, float engineDisplacement, short enginePower, double price) {
		super(type, brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + engineDisplacement + "L, " + enginePower + "KW, " + price + " euro";
	}

	@Override
	public boolean equals(Vehicle vehicle) {
		return super.equals(vehicle);
	}

	public float getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(float engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
