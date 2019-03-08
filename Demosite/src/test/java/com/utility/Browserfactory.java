package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	static WebDriver driver;
	public static WebDriver browsersetup(String Browsername,String url) 
	{
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (Browsername.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("The browser setup fails");
		}
		
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   return driver;
	}

}
