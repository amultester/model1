package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Browserstep {
	static WebDriver driver;
	@BeforeClass
	public static WebDriver Browser(String browsername,String url) {
		if(browsername.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		
			
		}
		else if (browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/Firefoxdriver.exe");
			driver= new FirefoxDriver();
			
		}
		else{
			System.out.println("Borwser is not valid");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
		

		
		
}


