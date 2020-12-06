package cars.brand;

import java.util.ArrayList;

public class Catalog {

    private static String filePath= "C:\\Users\\Dani\\workspace\\bit\\Mobility4You\\cars.txt";

    public static ArrayList<String> resultFromFile = FileManage.getStringsFromFile(filePath);

    public static void showCatalog() {
        for (String rs : resultFromFile) {
            System.out.println(rs);
        }
    }
}
