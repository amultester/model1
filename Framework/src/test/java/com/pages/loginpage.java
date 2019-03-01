package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class loginpage {
	WebDriver Idriver;
	public loginpage(WebDriver driver)
	{
		this.Idriver= driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='username']") WebElement uname;
	@FindBy(how=How.XPATH,using="//input[@name='password']") WebElement pword;
	@FindBy(className="d-inline-block") WebElement Next_button;
	
	@AfterMethod
	public  void login1(String Username,String scertId) 
	{
		uname.sendKeys(Username);
		Next_button.click();
		pword.sendKeys(scertId);
		Next_button.click();
		
	}

}
