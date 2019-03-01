package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_signin {
	static WebDriver driver;
	public static  void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("and");
		Thread.sleep(2000);
	    driver.getTitle();
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("name");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Test@2345");
	    driver.findElement(By.xpath("//select[@title='Day']//option")).click();
	    Select date = new Select (driver.findElement(By.xpath("//select[@title='Day']//option")));
	    date.selectByValue("5");
	    Select month = new Select (driver.findElement(By.xpath("//select[@title='month']")));
	    month.selectByVisibleText("Apr");
	    Select year = new Select (driver.findElement(By.xpath("//select[@id='year']")));
	    year.selectByValue("2015");
	    
		
		
	}

}
	