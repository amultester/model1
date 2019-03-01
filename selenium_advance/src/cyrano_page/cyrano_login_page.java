package cyrano_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class cyrano_login_page {
	
	WebDriver driver;
	
	By username = By.xpath("//input[@placeholder='Email']");
	By next_button = By.xpath("//button[@id='loginLoader']");
	By password =By.xpath("//input[@id='password']");
	By next_button1 = By.xpath("//button[@id='loginLoader']");
	
	public cyrano_login_page(WebDriver driver) 
	{
		this.driver= driver;
	}
	
	@Test
	public void enterintocyrano(String id , String scretlink) throws Exception
	{
		driver.findElement(username).sendKeys(id);
		driver.findElement(next_button).click();
		Thread.sleep(3000);
		driver.findElement(password).sendKeys(scretlink);
		driver.findElement(next_button1).click();
		
	}
}
