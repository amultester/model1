package com.studymaven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class maven2{
Properties pro;
WebDriver driver;

	public maven2() throws Exception {
		File source = new File("./configuration/config.properties");
		FileInputStream fis = new FileInputStream (source);
		Properties pro = new Properties();
		pro.load(fis);
	}
		
	
	
	
	public String cyranousername() 
	{	
		return pro.getProperty("username");
	}
	
	public String cyranopassword() 
	{
			return pro.getProperty("password");
	}
		
		/*System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\innobot-user-1.LAPTOP-9DDO4JSH\\\\.eclipse\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cyranolab.io");*/
		

		/*driver.findElement(By.xpath(pro.getProperty("cyrano_username_xpath"))).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath(pro.getProperty("cyrano_Next_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("cyrano_password_xpath"))).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath(pro.getProperty("cyrano_Next_xpath"))).click();*/
	}
		 



