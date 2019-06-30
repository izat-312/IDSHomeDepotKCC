package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String getValue(String key){
        try {
            FileInputStream file = new FileInputStream("/Users/izatillaaitmatov/Documents/homedepot/src/main/resources/application.properties");
            Properties properties = new Properties(); //came from JavaScript
            properties.load(file);

            return properties.getProperty(key);
        } catch (FileNotFoundException e){
            System.out.println("application.properties file cannot be read");
            e.printStackTrace();
            return null;
        } catch (IOException e){
            System.out.println("application.properties file can not be loaded");
            e.printStackTrace();
            return null;
        }

    }

}
