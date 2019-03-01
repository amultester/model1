package learnselenium13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class library {
	
	public static void screenshot(WebDriver driver) throws Exception
	{
       TakesScreenshot s1 = (TakesScreenshot)driver;
		
		File source= s1.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./screenshot/picture1.png"));
	}

}
