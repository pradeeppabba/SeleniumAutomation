package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	
	public static String getProperty(String propertyName) {
		Properties properties=new Properties();
		String path=System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties";	
		//"C:\\Users\\samyu\\eclipse-seleniumAutomation\\POMFramewok1\\src\\test\\resources\\configuration\\configure.properties"
		try {
			FileInputStream inputstream=new FileInputStream(path);
			properties.load(inputstream);
			inputstream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found"+e);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(propertyName);
	}

}
