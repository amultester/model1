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

public class YourBumper {

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
		
		
		
		
		
		//Your Bumper
		
	
		
		
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cust-admin-bumper")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[1]/div/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"paddingleft\"]/fieldset/div[1]/div/div[1]/input")).sendKeys("Footer1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("This is the Description for Footer1");
		Thread.sleep(5000);
		driver.findElement(By.id("header")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"addNewHeaderFooter\"]/div[1]/div[2]/fieldset/div[4]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"addNewHeaderFooter\"]/div[1]/div[2]/fieldset/div[6]/div/div[1]/button")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"linkinfo\"]/div[1]/div[1]/input")).sendKeys("https://www.youtube.com/watch?v=4rp2aLQl7vg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"linkinfo\"]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/modal[1]/div/div/modal-footer/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal[6]/div/div/div/modal-footer/div/button")).click();
		Thread.sleep(2000);
		
		
		
		/*driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div[2]/div/div/table/tbody/tr[1]/td/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div[2]/div/div/table/tbody/tr[3]/td/div/div[3]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div[2]/div/div/table/tbody/tr[1]/td/div/div[3]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div[1]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div[2]/div/div/table/tbody/tr[1]/td/div/div[3]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"introTab\"]/span/publish-intro/form/div/div/div[1]/div[1]/input")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"introTab\"]/span/publish-intro/form/div/div/div[1]/div[1]/input")).sendKeys("Test Program1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body")).sendKeys("This is the Program Description");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(7000);
		driver.findElement(By.className("tab3")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div/div/div[1]/ul/li[4]/a")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"finalize\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/modal[12]/div/div/div/modal-footer/div/button")).click();
		Thread.sleep(2000);*/
			
	}
}

	
		