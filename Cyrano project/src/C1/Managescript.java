package C1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;
public class Managescript {

	
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
		
		
		
		//Managescript
		//through program
		
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cust-admin-script")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[1]/div/div[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div[2]/div/div/table/tbody/tr[1]/td/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"assignAuthor\"]/tr[4]/td[1]/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("script")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"whole\"]/div[1]/fieldset/div[1]/div/div[1]/input")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"whole\"]/div[1]/fieldset/div[1]/div/div[1]/input")).sendKeys("script to first author");
		Thread.sleep(3000);
		driver.findElement(By.id("description")).sendKeys(" Please record this script ");
		Thread.sleep(5000);
		driver.findElement(By.className("intro")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"intro\"]/span/intro/form/div/div/div[1]/div[1]/input")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"intro\"]/span/intro/form/div/div/div[1]/div[1]/input")).sendKeys("Script Program");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body")).sendKeys("This is the Script Description");
		Thread.sleep(5000);
		driver.findElement(By.className("clips")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("preview")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("doNotAutoPublish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("scriptDeliveryDate")).clear();
		driver.findElement(By.id("scriptDeliveryDate")).sendKeys("07/20/2018 03:57 PM ");
		Thread.sleep(2000);
		driver.findElement(By.id("scriptDeliveryDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"showChangeSettingsSecId\"]/div[2]/button[3]")).click();
		Thread.sleep(2000);
		


		
		
		
	
		
		
		
		
		
		
		
		
}
}