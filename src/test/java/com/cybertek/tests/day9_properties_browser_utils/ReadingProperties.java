package com.cybertek.tests.day9_properties_browser_utils;

import com.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_file() throws IOException {
        //1. create object of properties class(comes from java lib)
        Properties properties= new Properties();
        //2. open the file using fileinputstream
        //to open the file we need to pass the path of the file
        FileInputStream file= new FileInputStream("configuration.properties");

        //3. load the properties object with our file
        properties.load(file);
        //read from configuration.properties
        System.out.println("properties.get(\"browser\") = " + properties.get("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

    }
    @Test
    public void using_properties_method(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"env\") = " + ConfigurationReader.getProperty("env"));
    }
}
