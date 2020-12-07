package cars.brand;

import cars.brand.model.Vehicle;
import cars.brand.service.implementation.CatalogueServiceImpl;
import cars.brand.service.implementation.FileManageImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CatalogueServiceImpl catalogueManage = new CatalogueServiceImpl();
		FileManageImpl fileManage = new FileManageImpl();
		ArrayList<Vehicle> list = new ArrayList<>();

		System.out.println("*************************************************************");
		System.out.println("*                                                             *");
		System.out.println("*  Welcome in Mobility4You! We can ofer the best car for you! *");
		System.out.println("*                                                             *");
		System.out.println("*************************************************************");

		while (true) {
			System.out.println("\n*************************************************************\nPlease make your choice:\n" +
					"1 - Show the entire Mobility4You catalogue\n" +
					"2 - Add a new electric car\n" +
					"3 - Add a new gas-powered car\n" +
					"4 - Add a new hybrid car\n" +
					"5 - Show the entire Mobility4You catalogue sorted by car-type\n" +
					"6 - Show the entire Mobility4You catalogue sorted by brand (alphabetically)\n" +
					"7 - Write to file\n" +
					"8 - Stop the program\n" +
					"0 - Show the entire Mobility4You catalogue sort by Type and Brand\n");

			int commands;
			System.out.print("Please, enter the number of your choice: ");
			commands = scanner.nextInt();
			System.out.println("\n=============================================================");

			switch (commands) {
				case 1:
					catalogueManage.showCatalogue();
					break;

				case 2:
					list.add(catalogueManage.createElectricCar());
					break;

				case 3:
					list.add(catalogueManage.createGasCar());
					break;

				case 4:
					list.add(catalogueManage.createHybridCar());
					break;

				case 5:
					catalogueManage.showCatalogueSortByType();
					break;

				case 6:
					catalogueManage.showCatalogueSortByBrand();
					break;

				case 7:
					fileManage.writeToFile(list);
					break;

				case 8:
					System.exit(0);
					System.out.println("Bye!");
					break;

				default:
					catalogueManage.showSortedCatalogue();
			}
		}
	}
}