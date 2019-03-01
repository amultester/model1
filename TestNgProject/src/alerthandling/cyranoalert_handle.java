package alerthandling;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


@Test
public class cyranoalert_handle {
	WebDriver driver;
	public void alert() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.redbus.in/bus-tickets/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='search-btn searchBuses']")).click();
	Thread.sleep(2000);
	/*driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);*/
	Alert a1= driver.switchTo().alert();
	a1.accept();
	driver.quit();
	}
}
