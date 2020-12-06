package cars.brand;

import cars.brand.model.ElectricCar;
import cars.brand.model.GasCar;
import cars.brand.model.Vehicle;
import cars.brand.service.implementation.CatalogueServiceImpl;
import cars.brand.service.implementation.FileManageImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CatalogueServiceImpl csimpl = new CatalogueServiceImpl();
		FileManageImpl fmimpl = new FileManageImpl();
		ArrayList<Vehicle> list = new ArrayList<>();


		System.out.println("***************************************************************");
		System.out.println("*                                                             *");
		System.out.println("*  Welcome in Mobility4You! We can ofer the best car for you! *");
		System.out.println("*                                                             *");
		System.out.println("***************************************************************");

		System.out.println("\nPlease make your choice:\n" +
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
		boolean quit = false;
		System.out.print("Please, enter the number of your choice: ");
		commands = scanner.nextInt();

		while (true) {
			switch (commands) {
				case 1:
					csimpl.showCatalog();
					break;

				case 2:
					list.add(csimpl.createElectricCar());
//				fmimpl.writeToFile(list);
					break;

				case 3:
					list.add(csimpl.createGasCar());
//					fmimpl.writeToFile(list);
					break;

				case 4:
					list.add(csimpl.createHybridCar());
//					fmimpl.writeToFile(list);
					break;

				case 5:
					csimpl.showCatalogSortByType();
					break;

				case 6:
					csimpl.showCatalogSortByBrand();
					break;

				case 7:
					fmimpl.writeToFile(list);
					break;

				case 8:
					System.exit(1);
					break;

				default:
					csimpl.showSortedCatalog();
			}

//		do {
//			switch (commands) {
//				case 1: csimpl.showCatalog();
//					quit = true;
//					break;
//
//				case 2:	list.add(csimpl.createElectricCar());
////				fmimpl.writeToFile(list);
//				break;
//
//				case 3: list.add(csimpl.createGasCar());
////					fmimpl.writeToFile(list);
//				break;
//
//				case 4: list.add(csimpl.createHybridCar());
////					fmimpl.writeToFile(list);
//				break;
//
//				case 5: csimpl.showCatalogSortByType();
//					quit = true;
//					break;
//
//				case 6: csimpl.showCatalogSortByBrand();
//					quit = true;
//					break;
//
//				case 7: fmimpl.writeToFile(list);
//					quit = true;
//					break;
//
//				case 8: System.exit(0);
//					quit = true;
//					break;
//
//				default: csimpl.showSortedCatalog();
//			}
//		} while (!quit);
//		System.out.println("Bye!");


//		fmimpl.writeToFile(list);

//		csimpl.showCatalog();
//		csimpl.showSortedCatalog();
		}


	}
}
