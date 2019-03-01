package Fb_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import fb_page.fb_login_page;


@Test
public class fb_login_testcase {
	
	//WebDriver driver;
	public void verify_fb_login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		fb_login_page ready_go  = PageFactory.initElements(driver, fb_login_page.class);
		ready_go.login_calling("123456789", "Test@2345");
			
	}

}
