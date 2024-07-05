package utilites;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class fileReaderConcept {
    public static void main(String[] args) throws IOException {
//        In bracket pass the location of the file.
        FileReader fileReader = new FileReader("src\\test\\resources\\configFiles\\config.properties");
//        new properties.
        Properties properties = new Properties();
//        loading properties with the file.
        properties.load(fileReader);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("testURL"));
    }
}
