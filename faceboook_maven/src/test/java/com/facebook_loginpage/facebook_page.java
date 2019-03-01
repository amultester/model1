package com.facebook_loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class facebook_page 
{
   WebDriver driver;
	public facebook_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement uname;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")WebElement pword;
	@FindBy(xpath="//input[@value='Log In']") WebElement Log_in;
	

	public void credientialset(String username, String password) 
	  {
	uname.sendKeys(username);
	pword.sendKeys(password);
	Log_in.click();	
	  }

}
