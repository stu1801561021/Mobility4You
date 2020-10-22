package cars.brand;

public class Main {

	public static void main(String[] args) {
		
		ElectricCar elCar = new ElectricCar("Tesla", "Model 3", (short) 150, 50000, 3000.00f);
		GasCar gasCar = new GasCar("Honda", "Civic", (short) 80, (short) 1.5, 18000.00f);
		HybridCar hybCar = new HybridCar("Toyota", "Prius", (short) 1.5, (short) 50, 12000, 24000.00f);
		
		System.out.println(elCar.printInfo());
		System.out.println(gasCar.printInfo());
		System.out.println(hybCar.printInfo());
	}

}
