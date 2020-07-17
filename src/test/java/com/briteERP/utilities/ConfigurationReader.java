package com.briteERP.utilities;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
       String path = "configuration.properties";
        try{
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
            file.close();
        } catch(IOException e){
            System.out.println("No such file found");
            }

    }


    public static String getProperty(String Key){
        return properties.getProperty(Key);
    }
}
