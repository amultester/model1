package C1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;

public class EmbedURL {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebDriverWait d = new WebDriverWait(driver,10);
		//opening cyrano staging
		driver.get("https://www.cyranolab.io/#/login");
		
		//login cyrano
		driver.findElement(By.id("username")).sendKeys("Happy4@mailinator.com");
		driver.findElement(By.id("loginLoader")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Test@2345");
		driver.findElement(By.id("loginLoader")).click();
		
		System.out.println("current page"+driver.getCurrentUrl());
		
		
		//Creating new clip
		driver.findElement(By.id("main-menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cust-admin-clips")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[1]/div/div[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"paddingleft\"]/fieldset/div[1]/div/div[1]/input")).sendKeys("Testclip1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("This is the Description for Testclip1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body")).sendKeys("This is the Script");
		
		//Embed url
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"row_paddingtop\"]/div[2]/fieldset/div[4]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"row_paddingtop\"]/div[2]/fieldset/div[6]/div/div[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"linkinfo\"]/div[1]/div[1]/input")).sendKeys("https://www.youtube.com/watch?v=4rp2aLQl7vg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"linkinfo\"]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"showExternalLinkModal\"]/div/div/modal-footer/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal[6]/div/div/div/modal-footer/div/button")).click();
		
		
	}
}