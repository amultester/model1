package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {
 static WebDriver driver;
	public static WebDriver Bowsersetup(String Bname,String url) {
		if(Bname.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(Bname.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "./Driver/firefoxdriver.exe");
			driver = new ChromeDriver();
			
		}
		else {
			System.out.println("The broswer intialization fails");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

}
