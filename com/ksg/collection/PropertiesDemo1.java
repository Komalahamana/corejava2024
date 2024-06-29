package com.ksg.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args)throws IOException { 


        Properties properties = new Properties();
        
        FileInputStream fis = new FileInputStream("C:\\Ravindra Singh\\java\\javajanuary2024\\abc.properties");
        
        properties.load(fis);
        
        System.out.println(properties);
        
        String s = properties.getProperty("user");
        System.out.println(s);
        
        properties.setProperty("user", "ashish");
        
        FileOutputStream fos = new FileOutputStream("C:\\Ravindra Singh\\java\\javajanuary2024\\abc.properteis");
        properties.store(fos,"update by Ravindra");

    }

}
	


