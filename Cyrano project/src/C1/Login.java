package C1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://staging.cyranosystems.com/#/login");
		driver.findElement(By.id("username")).sendKeys("happy4@mailinator.com");
		driver.findElement(By.id("loginLoader")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Test@2345");
		driver.findElement(By.id("loginLoader")).click();
		Thread.sleep(2000);
	}

}
