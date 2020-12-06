package cars.brand.service.implementation;

import cars.brand.model.ElectricCar;
import cars.brand.model.GasCar;
import cars.brand.model.HybridCar;
import cars.brand.model.Vehicle;
import cars.brand.service.specification.CatalogueService;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CatalogueServiceImpl implements CatalogueService {

    Scanner scanner = new Scanner(System.in);

    private String filePath= "C:\\Users\\Dani\\workspace\\bit\\Mobility4You\\cars.txt";

    FileManageImpl fileManage = new FileManageImpl();
    ArrayList<String> resultFromFile = fileManage.getStringsFromFile(filePath);

    ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

    @Override
    public void showCatalog() {
        for (String str : resultFromFile) {
            System.out.println(str);
        }
    }

    @Override
    public void showSortedCatalog() {
        Comparator<Vehicle> byType = (Vehicle one, Vehicle two) -> one.getType().compareTo(two.getType());
        Comparator<Vehicle> byBrand = (Vehicle one, Vehicle two) -> one.getBrand().compareTo(two.getBrand()) ;

        for (String s : resultFromFile) {
            listOfVehicles.add(fileManage.createVehicle(s));
        }

        listOfVehicles.sort(byType.thenComparing(byBrand));
        System.out.println("------------------------------------------------");
        System.out.println("Sorted Catalog by Type and by Brand");
        System.out.println("------------------------------------------------");
        for (Vehicle v : listOfVehicles) {
            System.out.println(v);
        }
    }

    @Override
    public void showCatalogSortByType() {
        Comparator<Vehicle> byType = (Vehicle one, Vehicle two) -> one.getType().compareTo(two.getType());

        for (String s : resultFromFile) {
            listOfVehicles.add(fileManage.createVehicle(s));
        }

        listOfVehicles.sort(byType);

        System.out.println("------------------------------------------------");
        System.out.println("Sorted Catalog by Type: ");
        System.out.println("------------------------------------------------");
        for (Vehicle v : listOfVehicles) {
            System.out.println(v);
        }
    }

    @Override
    public void showCatalogSortByBrand() {
        Comparator<Vehicle> byBrand = (Vehicle one, Vehicle two) -> one.getBrand().compareTo(two.getBrand()) ;

        for (String s : resultFromFile) {
            listOfVehicles.add(fileManage.createVehicle(s));
        }

        listOfVehicles.sort(byBrand);

        System.out.println("------------------------------------------------");
        System.out.println("Sorted Catalog by Brand: ");
        System.out.println("------------------------------------------------");
        for (Vehicle v : listOfVehicles) {
            System.out.println(v);
        }
    }

    @Override
    public Vehicle createElectricCar() {

        String type = "ELECTRIC_CAR";

        String brand;
        System.out.print("Enter car brand name: ");
        brand = scanner.next( );

        String modelName;
        System.out.print("Enter model name: ");
        modelName = scanner.next();

        short enginePower;
        System.out.print("Enter power of the engine: ");
        enginePower = scanner.nextShort();

        int batteryCapacity;
        System.out.print("Enter capacity of the battery: ");
        batteryCapacity = scanner.nextInt();

        double price;
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();


        Vehicle electricCar = new ElectricCar(type, brand, modelName, enginePower, batteryCapacity, price);

        System.out.println("\n" + electricCar.toString());
        listOfVehicles.add(electricCar);

        return  electricCar;
    }

    @Override
    public Vehicle createGasCar() {

        String type = "GAS_CAR";

        String brand;
        System.out.print("Enter car brand name: ");
        brand = scanner.next( );

        String modelName;
        System.out.print("Enter model name: ");
        modelName = scanner.next();

        double engineDisplacement;
        System.out.print("Enter the engine displacement: ");
        engineDisplacement = scanner.nextDouble();

        short enginePower;
        System.out.print("Enter power of the engine: ");
        enginePower = scanner.nextShort();

        double price;
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();


        Vehicle gasCar = new GasCar(type, brand, modelName, engineDisplacement, enginePower, price);

        System.out.println("\n" + gasCar.toString());
        listOfVehicles.add(gasCar);

        return gasCar;
    }

    @Override
    public Vehicle createHybridCar() {

        String type = "HYBRID_CAR";

        String brand;
        System.out.print("Enter car brand name: ");
        brand = scanner.next( );

        String modelName;
        System.out.print("Enter model name: ");
        modelName = scanner.next();

        double engineDisplacement;
        System.out.print("Enter the engine displacement: ");
        engineDisplacement = scanner.nextDouble();

        short enginePower;
        System.out.print("Enter power of the engine: ");
        enginePower = scanner.nextShort();

        int batteryCapacity;
        System.out.print("Enter capacity of the battery: ");
        batteryCapacity = scanner.nextInt();

        double price;
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();


        Vehicle hybridCar = new HybridCar(type, brand, modelName, engineDisplacement, enginePower, batteryCapacity,price);

        System.out.println("\n" + hybridCar.toString());
        listOfVehicles.add(hybridCar);

        return hybridCar;
    }
}
