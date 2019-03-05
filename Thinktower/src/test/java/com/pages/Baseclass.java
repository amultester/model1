package com.pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.utility.Browserfactory;
import com.utility.Excelhandling;

public class Baseclass {
	public Excelhandling sh;
	public WebDriver driver;
	
	
	@BeforeSuite
	public void dataloder() throws Exception {
		 sh=new Excelhandling();
		 
	}
	
	@BeforeClass
	public void callbrowser() {
		driver= Browserfactory.Bowsersetup("chrome", "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	
	
	@AfterClass
	public void browserquit() {
		driver.quit();
	}

}
