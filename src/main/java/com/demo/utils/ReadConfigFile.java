package com.demo.utils;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;


public class ReadConfigFile {

		  public String loadConfig(String key) throws IOException {
				Properties prop = new Properties();
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Config.properties");
				prop.load(fis);
				
				
				return prop.getProperty(key); 
			
	  
	  }
	  

}
	