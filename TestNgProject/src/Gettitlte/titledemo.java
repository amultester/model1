package Gettitlte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class titledemo {
	WebDriver driver;
	
	@Test
	public void browser_title() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
		
	driver.get("https://www.cyranolab.io/#/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhsbfhdsb@gmail.com");
	Thread.sleep(3000);
	
    driver.findElement(By.xpath("//div[@class='d-inline-block']")).click();
    Thread.sleep(3000);
    
    String error_msg = driver.findElement(By.xpath("//span[@class='errortxt-cls']")).getText();
    
     String value = driver.getTitle();
     
	System.out.println("The Browser title is "+value);
	
	System.out.println("The Error message is "+error_msg);
	
		
	}

}
