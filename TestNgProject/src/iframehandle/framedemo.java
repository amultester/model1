package iframehandle;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class framedemo {
	WebDriver driver;
	@Test(priority=1,description="first test case")
	public void Chromelanuch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 
	 driver.get("https://jqueryui.com/droppable/");
	 driver.manage().window().maximize();
	 
	/* cyrano in iframe
	 file:///C:/Users/innobot-user-1.LAPTOP-9DDO4JSH/Desktop/frame.html
	 driver.switchTo().frame("myiFrame");
	 driver.findElement(By.id("username")).sendKeys("and1@mailinator.com");*/
	
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	 Thread.sleep(3000);
	 
	 Actions a1= new Actions (driver);
	 WebElement drag=  driver.findElement(By.xpath("//body/div[1]"));
	 Thread.sleep(3000);
	 
	 WebElement drop= driver.findElement(By.xpath("//body/div[2]"));
	 Thread.sleep(3000);
	 
	 a1.dragAndDrop(drag, drop).perform();
	 Thread.sleep(3000);
	 driver.switchTo().defaultContent();
	 
	 driver.findElement(By.xpath("//a[@tabindex='0']")).click();
	 Thread.sleep(3000);
	 
	
	}
}
