package com.facebook_loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.facebook.utility.Browserfactory;
import com.facebook.utility.Excelsheet;
import com.facebook.utility.Helper;
import com.facebook.utility.configurationSetup;

public class Baseclass 
{
	 public WebDriver driver;
	 public Excelsheet sh ;
	 public configurationSetup config;
	// Helper ts;
	
	 
	 @BeforeSuite
	public void  excel_config_call() throws Exception
	{
		 sh = new Excelsheet();
		 config = new configurationSetup();
		// ts=new Helper();
	}
	
	 
	 
	@BeforeClass
	     public void  browserstart()
	    {
		
		driver= Browserfactory.callbrowser(config.getbrowser(),config.geturl());
		
	    }
	
	
	
	@AfterClass
	    public void  browserquit()
	    {
		driver.quit();
		
	    }
	

	
	
	
	
		
}
