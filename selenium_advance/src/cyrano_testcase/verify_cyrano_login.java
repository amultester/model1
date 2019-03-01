package cyrano_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cyrano_page.cyrano_login_page;

public class verify_cyrano_login {
	
	WebDriver driver;
	
	
	@Test
	public void validate_login() throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://www.cyranoapp.io/#/login");
     
     cyrano_login_page login = new cyrano_login_page(driver);
     login.enterintocyrano("amulraj.test@mailinator.com", "Test@2345");
     
}
}
