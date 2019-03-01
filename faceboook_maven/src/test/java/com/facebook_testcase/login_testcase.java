package com.facebook_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.utility.Browserfactory;
import com.facebook.utility.Excelsheet;
import com.facebook.utility.Helper;
import com.facebook.utility.configurationSetup;
import com.facebook_loginpage.Baseclass;
import com.facebook_loginpage.facebook_page;

public class login_testcase extends Baseclass 
{
	 
	
	@Test
	public void login() throws Exception  
	
	{

		facebook_page login = PageFactory.initElements(driver, facebook_page.class);
		/*Helper ts= new Helper();
		ts.screenshot();*/
		login.credientialset(sh.getexceldata(0, 0, 0),sh.getexceldata("login", 0, 1));
		
	}
	
}


