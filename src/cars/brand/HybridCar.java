package cars.brand;

public class HybridCar extends Vehicle {
	
	protected short engineDisplacement;
	protected int batteryCapacity;
	protected double price;
	
	public HybridCar(String brand, String modelName, short enginePower, short engineDisplacement, int batteryCapacity, double price) {
		super(brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString() + " || Engine Displacement: " + engineDisplacement + "L" +
								   " || Battery Capacity: " + batteryCapacity + "Ah" +
								   " || Price: " + price + "euro";
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
