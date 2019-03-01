package dependencetest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencedemo {
	WebDriver driver;
	@Test
	public void Chromelanuch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	}
	
	@Test
	public  void cyranologin() {
		driver.get("https://www.cyranolab.io/#/login");
		
		String Actual_url= driver.getCurrentUrl();
		System.out.println("please print the currenturl" +Actual_url);
		String expected_url ="https://www.cyranoapp.io/#/login";
		Assert.assertEquals(Actual_url, expected_url);
	    
	}
}
