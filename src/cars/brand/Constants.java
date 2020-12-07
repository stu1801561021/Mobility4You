package cars.brand;

import java.nio.file.Path;

public final class Constants {
    public static final String ABSOLUTE_PATH = Path.of("").toAbsolutePath().toString();
    public static final String PATH_FILE = ABSOLUTE_PATH + "\\cars.txt";
}
