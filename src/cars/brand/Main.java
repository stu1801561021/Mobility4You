package cars.brand;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
//		FileManage.writetToFile(list);
//		ArrayList<String> resultFromFile = FileManage.getStringsFromFile("C:\\Users\\Dani\\workspace\\bit\\Mobility4You\\cars.txt");
//		
//		for(String s : resultFromFile) {
//			FileManage.createVehicle(s).toString();
//		}
		
		String filePath = "C:\\Users\\Dani\\workspace\\bit\\Mobility4You\\cars.txt";
		
//		System.out.println(FileManage.getStringsFromFile(filePath));
		
		Vehicle mazdaobject = new GasCar("GAS_CAR", "Mazda", "6", (short)1.5, (short)120, 28000);
		
		ArrayList<Vehicle> list = new ArrayList<>();
		list.add(mazdaobject);

		FileManage.writeToFile(list);
		ArrayList<String> resultFromFile = FileManage.getStringsFromFile(filePath);
		for (String s : resultFromFile) {
			FileManage.createVehicle(s).toString();
		}

		Catalog.showCatalog();
	}
}
