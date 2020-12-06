package cars.brand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

	public static Vehicle createVehicle(String line) {
		String[] attributes = line.split(",");
		String type = attributes[0].substring(0, attributes[0].indexOf(" "));
		String brand = attributes[0].replace(type, "");
		String modelName = attributes[1];
		short enginePower = Short.parseShort(attributes[3].replaceAll("[^\\d.]", ""));
		short enginePowerE = Short.parseShort(attributes[2].replaceAll("[^\\d.]", ""));
		short engineDisplacement = Short.parseShort(attributes[3].replaceAll("[^\\d.]", ""));
		short engineDisplacementG = Short.parseShort(attributes[2].replaceAll("[^\\d.]", ""));
		int batteryCapacity = Integer.parseInt(attributes[3].replaceAll("[^\\d.]", ""));
		int batteryCapacityH = Integer.parseInt(attributes[4].replaceAll("[^\\d.]", ""));
		double price = Double.parseDouble(attributes[4].replaceAll("[^\\d.]", ""));

		Vehicle vehicleObject = null;

		switch(attributes[0]) {

			case "ELECTRIC_CAR": vehicleObject = new ElectricCar(type, brand.trim(), modelName, enginePowerE, batteryCapacity, price); break;
			case "GAS_CAR" : vehicleObject = new GasCar(type, brand.trim(), modelName, engineDisplacementG, enginePower, price); break;
			case "HYBRID_CAR" : vehicleObject = new HybridCar(type, brand.trim(), modelName, engineDisplacement, enginePowerE, batteryCapacityH, price); break;

		}
		return vehicleObject;
	}

	public static void writeToFile(ArrayList<Vehicle> list) {
//		try(BufferedWriter bw = Files.newBufferedWriter(Paths.get("C:\\Users\\Dani\\workspace\\bit\\Mobility4You\\cars.txt"))) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Dani\\workspace\\bit\\Mobility4You\\cars.txt", true));
				for (Vehicle vehicle : list) {
					bw.newLine();
					bw.write(vehicle.toString());
//					bw.newLine();
				}
				bw.flush();

		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
