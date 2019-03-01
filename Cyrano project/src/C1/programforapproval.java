package C1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class programforapproval {
	
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
		
		
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cust-admin-programsfor")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("icon_size")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"editProgramIntroID\"]/div/div/div[1]/div[1]/input")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"editProgramIntroID\"]/div/div/div[1]/div[1]/input")).sendKeys("Changing Program name");
		Thread.sleep(5000);
		//CK editor no access for that 
		//driver.findElement(By.id("cke_1_contents")).sendKeys(" Program Description");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/div[1]/div[2]/div/div/section[2]/div/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(7000);
		driver.findElement(By.className("tab2")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//A[text()='Choose Header'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//BUTTON[@class='btn btn-success'][text()='Select'][text()='Select'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//A[@angulartics2on='click'][text()='Choose Footer']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//INPUT[@class='flat-red'])[3]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//BUTTON[@class='btn btn-success'][text()='Select'][text()='Select'])[2]")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.className("tab3")).click();
		Thread.sleep(2000);
		
		/*doNotAutoPublish
		driver.findElement(By.id("doNotAutoPublish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("scriptDeliveryDate")).clear();*/
		
		//Publish button
		driver.findElement(By.xpath("//*[@id=\"showChangeSettingsSecId\"]/nav/ul/button[4]")).click();
		Thread.sleep(2000);
		

}
}