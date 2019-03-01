package learnselenium13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitweight {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From*']")));
		
	//WebElement state = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='From*']"));
	boolean state =	element.isSelected();
	
	if(state)
	{
		System.out.println("True");
	}else
	{
		System.out.println("false");
	}
		
		
		
	}

	
}
