package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class titlecheckin_browser  {
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void titlecheck(String browser_name) {
	
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.out.println("The browser is chrome");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			
			driver =new ChromeDriver();
			
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.out.println("The browser is firefox");
		}
		
		driver.get("https://www.cyranolab.io/#/login");
		
	
	}

}
