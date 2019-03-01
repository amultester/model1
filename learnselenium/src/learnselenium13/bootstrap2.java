package learnselenium13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap2 {
	
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'dropdown')]")).click();
		Thread.sleep(2000);
		
	List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'dropdown')]//li"));
	
	for(int i=0;i<list.size();i++)
	{
		
	 WebElement type1=list.get(i);
	String click = type1.getText();
	
	if(click.contains("Oracle"))
	{
	
		list.get(i).click();
	
	}
	System.out.println("value for "+click);
	}
	
	

	}

}
