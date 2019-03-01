package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver;
	public static void driversetup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
	}

}
