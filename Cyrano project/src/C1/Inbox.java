package C1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inbox {
	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebDriverWait d = new WebDriverWait(driver,10);
		//opening cyrano staging
		driver.get("https://www.cyranolab.io/#/login");
		
		//login cyrano
		driver.findElement(By.id("username")).sendKeys("andd1@mailinator.com");
		driver.findElement(By.id("loginLoader")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Test@2345");
		driver.findElement(By.id("loginLoader")).click();
		
		System.out.println("current page"+driver.getCurrentUrl());
		
		
		
		//Inbox - New
		driver.findElement(By.xpath("//*[@id=\"myPrograms\"]/tr[1]/td[2]/div[1]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//I[@class='fas fa-heart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//TEXTAREA[@id='description']")).sendKeys("comment1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//BUTTON[@angulartics2on='click'][text()=' Comment ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//IMG[@height='40']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//SPAN[text()='Share '])[1]")).click();
		//Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
