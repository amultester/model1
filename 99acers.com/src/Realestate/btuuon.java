package Realestate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class btuuon {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.99acres.com/");
		

		driver.findElement(By.xpath("//a[@class='frmEl pType-dd ddLClick dropDown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='prnt DCopen DCheadingOpt']")).click();

		List<WebElement> value = driver.findElements(By.xpath("//div[@class=\"child DCcomOpen\"]//a"));
		
		for ( WebElement v : value) {

			String type1 = v.getText();
			System.out.println("Total" + type1);
			System.out.println("The value is" + v);
		}
	}
}


