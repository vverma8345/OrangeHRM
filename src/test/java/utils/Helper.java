package utils;

import java.io.*;
import java.util.Properties;

public class Helper {
    static String testdataFilePath = "src/test/resources/testData/datafile.properties";

    public static String dataReader(String key) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(testdataFilePath));
        Properties prop = new Properties();
        prop.load(reader);

        return prop.getProperty(key);

    }
}
