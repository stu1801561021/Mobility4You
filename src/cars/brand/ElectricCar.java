package cars.brand;

public class ElectricCar extends Vehicle{
	
	protected int batteryCapacity;
	protected float price;

	public ElectricCar(String brand, String modelName, short enginePower, int batteryCapacity, float price) {
		super(brand, modelName, enginePower);
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	
	@Override
	public String printInfo() {
		return super.printInfo() + " || Battery Capacity: " + batteryCapacity + "Ah" +
								   " || Price: " + price + "euro";
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
