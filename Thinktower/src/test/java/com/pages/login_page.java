package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.utility.Browserfactory;

public class login_page {
	static WebDriver driver;

	public login_page(WebDriver idriver) {
		this.driver = idriver;
	}

	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement id;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
	WebElement next;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement pword;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
	WebElement publish;
	@FindBy(how = How.XPATH, using = "//*[@class='gb_Ie']")
	WebElement global_button;
	@FindBy(how = How.XPATH, using = "//a[@id='gb23']//span[@class='gb_k']")
	WebElement gmail_button;
	@FindBy(how = How.XPATH, using = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
	WebElement compose;
	@FindBy(how = How.XPATH, using = "//span[@id='link_enable_notifications_hide']")
	WebElement Nothanks;
	@FindBy(how = How.XPATH, using = "//textarea[@role='combobox']")
	WebElement To;

	@FindBy(how = How.XPATH, using = "//input[@spellcheck='true']")
	WebElement Subject;

	@FindBy(how = How.XPATH, using = "//div[@g_editable='true']")
	WebElement email_body;
	@FindBy(how = How.XPATH, using = "//div[@data-tooltip-delay='800']")
	WebElement send;
	

	public void login(String emailid, String pid) throws Exception {
		id.sendKeys(emailid);
		next.click();
		pword.sendKeys(pid);
		Thread.sleep(2000);
		publish.click();
		global_button.click();
		gmail_button.click();
		compose.click();
	}

	public void email_write(String to_msg, String Sub_msg, String Body_msg) {
		To.sendKeys(to_msg);
		Subject.sendKeys(Sub_msg);
		email_body.sendKeys(Body_msg);
		send.click();

	}

	public void send_mail() throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='Cp']//div//table//tbody//tr"));
		//div[@class='Cp']//div//table//tbody//tr
		//div[@class='BltHke nH oy8Mbf aE3']"
		for (int i = 0; i <ls.size(); i++) 
		{
			WebElement t1 = ls.get(i);
			String c1 = t1.getText();
			System.out.println(" Values are "+c1);
			
			if (c1.contains("papa")) 
			{

				ls.get(i).click();
			}
		}
	}
}
