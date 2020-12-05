package cars.brand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileManage {
	
	public static ArrayList<String> getStringsFromFile(String pathToFile) {
		ArrayList<String> list = new ArrayList<>();
		
		try (BufferedReader br = Files.newBufferedReader(Paths.get(pathToFile))) {
			String temp;
			while((temp = br.readLine()) != null) {
				list.add(temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Vehicle createVehicle(String line) {
		String[] attributes = line.split(",");
		String type = attributes[1].replace("ELECTRIC_CAR ", "");
		String brand = attributes[2];
		String modelName = attributes[3];
		short enginePower = Short.parseShort(attributes[4].replace("KW", ""));
		int batteryCapacity = Integer.parseInt(attributes[5].replace("Ah", ""));
		double price = Double.parseDouble(attributes[6].replace(" euro ", ""));
		short engineDisplacement = Short.parseShort(attributes[3].replace("L", ""));
		
		Vehicle vehicleObject = null;
		
		switch(attributes[0]) {
		
		case "ELECTRIC_CAR": vehicleObject = new ElectricCar(brand, modelName, enginePower, batteryCapacity, price);
		case "GAS_CAR" : vehicleObject = new GasCar(brand, modelName, enginePower, engineDisplacement, price);
		case "HYBRID_CAR" : vehicleObject = new HybridCar(brand, modelName, enginePower, engineDisplacement, batteryCapacity, price);
		
		}
		return vehicleObject;
	}
	
	public static void writeToFile(ArrayList<Vehicle> list) {
		try(BufferedWriter bw = Files.newBufferedWriter(Paths.get("C:\\Users\\Dani\\Desktop\\bit.txt"))) {
			for (Vehicle vehicle : list) {
				bw.write(vehicle.toString());
				bw.newLine();
			}
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
