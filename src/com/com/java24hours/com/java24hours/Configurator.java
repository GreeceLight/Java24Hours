package com.java24hours;

import java.io.*;
import java.util.*;

public class Configurator {
    public Configurator(){
        try {
            //Load Properties file
            File configFile = new File("program.properties");
            FileInputStream inStream = new FileInputStream(configFile);
            Properties config = new Properties();
            config.load(inStream);

            //create new Property
            Date current = new Date();
            config.setProperty("runtime", current.toString());
            
            //save properties file
            FileOutputStream outStream = new FileOutputStream(configFile);
            config.store(outStream, "Properties settings");
            inStream.close();
            config.list(System.out);
        } catch (IOException e) {
            System.out.println("IO error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Configurator();
    }
}
