package cars.brand;

public class ElectricCar extends Vehicle{
	
	protected int batteryCapacity;
	protected double price;

	public ElectricCar(String type, String brand, String modelName, short enginePower, int batteryCapacity, double price) {
		super(type, brand, modelName, enginePower);
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString() + enginePower + "KW, " + batteryCapacity + "Ah, " + price + " euro";
		/*
		return this.getClass().getSimpleName() + " || Battery Capacity: " + batteryCapacity + "Ah" +
								   " || Price: " + price + "euro";
		 */
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
