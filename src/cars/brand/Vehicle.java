package cars.brand;

public class Vehicle {
	protected String brand;
	protected String modelName;
	protected short enginePower;
	
	public Vehicle(String brand, String modelName, short enginePower) {
		this.brand = brand;
		this.modelName = modelName;
		this.enginePower = enginePower;
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

	public String printInfo() {
		return "The brand: " + brand + 
				"|| The model name: " + modelName + 
				"|| The power of engine: " + enginePower + "KW";
	}
}
