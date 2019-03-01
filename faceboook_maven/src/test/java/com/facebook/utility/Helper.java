package com.facebook.utility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Helper {
	WebDriver driver;
	
	public  void screenshot()  
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File ("./screenshots/photo1.png"));
		} catch (IOException e) {
		System.out.println("Screenshot is failed" +e.getMessage());
		}
	}

}
