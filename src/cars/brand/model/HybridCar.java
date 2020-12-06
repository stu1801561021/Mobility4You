package cars.brand.model;

import cars.brand.model.Vehicle;

public class HybridCar extends Vehicle {
	
	protected double engineDisplacement;
	protected int batteryCapacity;
	protected double price;
	
	public HybridCar(String type, String brand, String modelName, double engineDisplacement, short enginePower, int batteryCapacity, double price) {
		super(type, brand, modelName, enginePower);
		this.engineDisplacement = engineDisplacement;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString() + engineDisplacement + "L, " + enginePower + "KW, " + batteryCapacity + "Ah, " + price + " euro";
	}

	@Override
	public boolean equals(Vehicle vehicle) {
		return super.equals(vehicle);
	}

	public double getEngineDisplacement() {
		return engineDisplacement;
	}
	
	public void setEngineDisplacement(double engineDisplacement) {
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
