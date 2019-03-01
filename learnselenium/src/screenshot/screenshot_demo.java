package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import learnselenium13.library;

public class screenshot_demo {
	
	@Test
	public void method1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
				
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("coimbatore");
		Thread.sleep(2000);
		
        library.screenshot(driver);
        driver.getWindowHandle();
		
	}

}
