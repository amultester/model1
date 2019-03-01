package com.testcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.loginpage;
import com.utility.Browserstep;
import com.utility.DriverFactory;

public class Logintestcase  {
	
WebDriver driver;
@Test
	public void login() throws Exception 
	{
	driver = Browserstep.Browser("chrome","https://www.cyranolab.io");
	
	loginpage log = PageFactory.initElements(driver, loginpage.class);
		log.login1("ah1@mailinator.com","Test@2345");
		
		
	}


}
			


