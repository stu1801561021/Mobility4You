package cars.brand;

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
		
		Vehicle mazdaobject = new GasCar("Mazda", "6", (short)120, (short)2, 28000f);
		
		ArrayList<Vehicle> list = new ArrayList<>();
		list.add(mazdaobject);
		
		
		FileManage.writeToFile(list);
		ArrayList<String> resultFromFile = FileManage.getStringsFromFile(filePath);
		for (String s : resultFromFile) {
			FileManage.createVehicle(s).toString();
		}
	}
}
