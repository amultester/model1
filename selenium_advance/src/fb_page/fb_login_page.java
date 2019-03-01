package fb_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class fb_login_page {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']") WebElement username;
	
	@FindBy(id="pass") WebElement password;
	
	@FindBy(how = How.ID, using= ("loginbutton")) WebElement login;
	
	public fb_login_page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@Test
	public void login_calling(String id, String ps) {
		username.sendKeys(id);
		password.sendKeys(ps);
		login.click();
	}
	

}
