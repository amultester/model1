package com.facebook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configurationSetup {
	static Properties pro;
	public configurationSetup() throws Exception{
		File src=new File("./config/config.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);	
	}
	
	/*public void getdatafromconfig(String KeyTosearch) {
		 pro.getProperty(KeyTosearch);
		
	}*/
	
	public static String getbrowser() 
	{
		return pro.getProperty("Browser");
	}
	
	
	public static String geturl()
	{
		return  pro.getProperty("url");
	}

}
