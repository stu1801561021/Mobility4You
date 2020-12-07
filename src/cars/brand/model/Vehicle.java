package cars.brand.model;

public class Vehicle {
	protected String type;
	protected String brand;
	protected String modelName;
	protected short enginePower;

	public Vehicle(String type, String brand, String modelName, short enginePower) {
		this.type = type;
		this.brand = brand;
		this.modelName = modelName;
		this.enginePower = enginePower;
	}

	@Override
	public String toString() {
		return type + " " + brand + ", " + modelName + ", ";
	}

	public boolean equals(Vehicle vehicle) {
		return this.getType().equals(vehicle.getType());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public short getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(short enginePower) {
		this.enginePower = enginePower;
	}

}
