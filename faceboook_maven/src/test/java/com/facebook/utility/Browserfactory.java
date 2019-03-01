package com.facebook.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {

	static WebDriver driver;

	public static WebDriver callbrowser(String browsername, String url) {
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "./Driver/chromedriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		} else {
			System.out.println("The browser set has failed");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

}
