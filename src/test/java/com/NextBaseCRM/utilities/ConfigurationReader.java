package com.NextBaseCRM.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try(FileInputStream stream = new FileInputStream("configuration.properties")){
            properties.load(stream);
        } catch(IOException e){
            System.out.println("No such file found");
        }
    }

    public static String getProperty(String key){
        String result = properties.getProperty(key);
        if(result != null){
            return result;
        }
        throw new NullPointerException("Value of " + key + "is null");
    }
    
}
