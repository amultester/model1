package com.studymaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
static WebDriver driver;
static maven2 m2;

    @BeforeMethod
	public static void amul() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\innobot-user-1.LAPTOP-9DDO4JSH\\\\.eclipse\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cyranolab.io");
		 m2= new maven2();
		 
		 Baseclass.call(m2.cyranousername());
		

		
		
	}
    
    
    public static void call(String username) {
    	
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username)));
    	
    	
    }


	

}
