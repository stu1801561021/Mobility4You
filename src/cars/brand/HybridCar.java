package cars.brand;

public class HybridCar extends Vehicle {
	
	protected short engineDisplacement;
	protected int batteryCapacity;
	protected double price;
	
	public HybridCar(String type, String brand, String modelName, short engineDisplacement, short enginePower, int batteryCapacity, double price) {
		super(type, brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString() + engineDisplacement + "L, " + enginePower + "KW, " + batteryCapacity + "Ah, " + price + " euro";
	}
	
	public short getEngineDisplacement() {
		return engineDisplacement;
	}
	
	public void setEngineDisplacement(short engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
