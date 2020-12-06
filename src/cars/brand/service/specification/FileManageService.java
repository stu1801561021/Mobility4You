package cars.brand.service.specification;

import cars.brand.model.Vehicle;

import java.io.IOException;
import java.util.ArrayList;

public interface FileManageService {

    /**
     * Reads the file from the given path, if exists.
     *
     * @param pathToFile - the absolute path to the file
     * @return - {@link ArrayList<String>} list containing the fields of the file
     * @throws IOException - if invalid path, etc.
     */
    ArrayList<String> getStringsFromFile(String pathToFile) throws IOException;

    /**
     * Create object Vehicle
     *
     * @param line
     * @return vehicleObject;
     */
    Vehicle createVehicle(String line);

    /**
     * Overwrites to the file.
     *
     * @param list
     * @throws IOException
     */
    void writeToFile(ArrayList<Vehicle> list) throws IOException;
}
