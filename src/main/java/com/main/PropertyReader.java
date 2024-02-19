package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public String readProperty(String propertyName)
	{
		Properties prop=new Properties();
		String FilePath="C:\\Users\\meet.dhameliya\\eclipse-workspace\\trainig1\\src\\main\\resource\\testdata.properties";
		FileInputStream fs;
		
		try {
			fs=new FileInputStream(new File(FilePath));
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return prop.getProperty(propertyName);
		
	}

}
