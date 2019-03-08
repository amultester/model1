package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.utility.Browserfactory;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void startbrowser()
	{
	driver =Browserfactory.browsersetup("chrome", "http://demo.automationtesting.in/");
	}

}
