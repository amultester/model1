package learnselenium13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class bootstarp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class, 'dropdown-toggle')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> type= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		Thread.sleep(2000);
		
		for (int i=0;i<type.size();i++)
		{
		WebElement text = type.get(i);
		
	String htmltext=text.getAttribute("innerHTML");
	
	if (htmltext.contains("JavaScript"))
	{
		text.click();
	}
		
		System.out.println("list is "+htmltext);
		}
		
		
     driver.quit();
     
	}

}
