package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
public static void main(String[] args) {
	String path="text.properties";
	FileReader reader;
	try {
		reader=new FileReader(path);
		Properties properties=new Properties();
		properties.load(reader);
		
		String url=properties.getProperty("url");
		String user=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		
		
		
		System.out.println("name is "+url);
       System.out.println("company is "+user);
       System.out.println("gf is "+password);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
