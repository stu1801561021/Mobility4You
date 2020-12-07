package cars.brand.service.implementation;

import cars.brand.model.ElectricCar;
import cars.brand.model.GasCar;
import cars.brand.model.HybridCar;
import cars.brand.model.Vehicle;
import cars.brand.service.specification.FileManageService;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static cars.brand.Constants.PATH_FILE;

public class FileManageImpl implements FileManageService {

	public ArrayList<String> getStringsFromFile(String pathToFile) {
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

	public Vehicle createVehicle(String line) {
		String[] attributes = line.split(",");
		String type = attributes[0].substring(0, attributes[0].indexOf(" "));
		String brand = attributes[0].replace(type, "");
		String modelName = attributes[1];

		float engineDisplacement = 0;
		short enginePower = 0;
		int batteryCapacity = 0;
		double price = 0;

		if(type.equals("ELECTRIC_CAR")) {
			enginePower = Short.parseShort(attributes[2].replaceAll("[^\\d.]", ""));
			batteryCapacity = Integer.parseInt(attributes[3].replaceAll("[^\\d.]", ""));
			price = Double.parseDouble(attributes[4].replaceAll("[^\\d.]", ""));
		} else if(type.equals("GAS_CAR")) {
			engineDisplacement = Float.parseFloat(attributes[2].replaceAll("[A-z]", ""));
			enginePower = Short.parseShort(attributes[3].replaceAll("[^\\d.]", ""));
			price = Double.parseDouble(attributes[4].replaceAll("[^\\d.]", ""));
		} else if (type.equals("HYBRID_CAR")) {
			engineDisplacement = Float.parseFloat(attributes[2].replaceAll("[A-z]", ""));
			enginePower = Short.parseShort(attributes[3].replaceAll("[^\\d.]", ""));
			batteryCapacity = Integer.parseInt(attributes[4].replaceAll("[^\\d.]", ""));
			price = Double.parseDouble(attributes[5].replaceAll("[^\\d.]", ""));
		}

		Vehicle vehicleObject = null;

		switch(type) {

			case "ELECTRIC_CAR": vehicleObject = new ElectricCar(type, brand.trim(), modelName, enginePower, batteryCapacity, price); break;
			case "GAS_CAR" : vehicleObject = new GasCar(type, brand.trim(), modelName, engineDisplacement, enginePower, price); break;
			case "HYBRID_CAR" : vehicleObject = new HybridCar(type, brand.trim(), modelName, engineDisplacement, enginePower, batteryCapacity, price); break;

		}

		return vehicleObject;
	}

	public void writeToFile(ArrayList<Vehicle> list) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_FILE, true));
			for (Vehicle vehicle : list) {
				bw.newLine();
				bw.write(vehicle.toString());
			}
			bw.flush();

		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
