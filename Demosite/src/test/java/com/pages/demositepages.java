package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class demositepages {
	WebDriver driver;
	
	
	public demositepages(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//img[@id='enterimg']") 
	WebElement arrow_button;
	
	//register page 
	@FindBy(how=How.XPATH,using="//input[@placeholder='First Name']") 
	WebElement Firstname;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Last Name']") 
	WebElement Lastname;
	
	@FindBy(how=How.XPATH,using="//textarea[@ng-model='Adress']") 
	WebElement Address;
	
	@FindBy(how=How.XPATH,using="//input[@type='email']") 
	WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@type='tel']")
	WebElement Phone;
	
	@FindBy(how=How.XPATH,using="//input[@value='Male']") 
	WebElement Gender;
	
	@FindBy(how=How.XPATH,using="//div[@id='msdd']")
	WebElement language;
	
	@FindBy(how=How.XPATH,using="//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li") 
	List<WebElement>language_list;
	
	@FindBy(how=How.XPATH,using="//div[@class='container center']")
	WebElement Out;
	
	@FindBy(how=How.ID,using="Skills")  
	WebElement Skills;
	
	@FindBy(how=How.XPATH,using="//select[@id='Skills']//option") 
	List<WebElement> skills_list;
	
	@FindBy(how=How.XPATH,using="//select[@id='countries']")
	WebElement country;
	
	@FindBy(how=How.XPATH,using="//span[@class='select2-selection select2-selection--single']") 
	WebElement select_country;
	
	@FindBy(how=How.XPATH,using="//span[@class='select2-results']//ul//li")
	List<WebElement> select_country_text;
	
	@FindBy(how=How.XPATH,using="//select[@id='yearbox']") 
	WebElement DOB;
	
	@FindBy(how=How.XPATH,using="//select[@placeholder='Month']")
	WebElement Month;
	
	@FindBy(id="daybox") 
	WebElement Day;
	
	@FindBy(id="firstpassword") 
	WebElement password_1 ;
	
	@FindBy(id="secondpassword") 
	WebElement password_2 ;
	
	@FindBy(id="submitbtn") 
	WebElement submit ;
	
	//Switchto_psge
	
	@FindBy(xpath="//a[contains(text(),'SwitchTo')]") 
	WebElement switchto_tab ;
	
	@FindBy(xpath="//ul[@class=\"dropdown-menu\"]//li//a") 
	List<WebElement>switchto_list ;
	
	@FindBy(xpath="//button[@class='btn btn-danger']") 
	WebElement alert_pri_box ;
	
	@FindBy(xpath="//a[contains(text(),'Alert with OK & Cancel')]") 
	WebElement alert_ok_cancel;
	
	@FindBy(xpath="//button[@class='btn btn-primary']") 
	WebElement alert_sec_box ;
	
	@FindBy(xpath="//a[contains(text(),'Alert with Textbox')]") 
	WebElement alert_with_textbox;
	
	
	@FindBy(xpath="//button[@class='btn btn-info']") 
	WebElement alert_teri_box ;
	
	@FindBy(id="demo1") 
	WebElement Alert_text_change ;
	
	//window handling
	@FindBy(xpath="//a[@href='#Tabbed']") 
	WebElement Tabbed_window ;
	
	@FindBy(partialLinkText= "Seperate Wi")
	WebElement separate_window;
	
	@FindBy(partialLinkText= "Seperate Mul")
	WebElement multiple_window;
	
	@FindBy(xpath= "//button[@class='btn btn-info']")
	WebElement Window_click_button;
	
	@FindBy(xpath= "//button[@class='btn btn-primary']")
	WebElement separate_Window_click_button;
	
	@FindBy(xpath= "//div[@id='Multiple']//button[@class='btn btn-info'][contains(text(),'click')]")
	WebElement multiple_Window_click_button;
	
	@FindBy(xpath= "//ul[@class='nav navbar-nav navbar-right']//li//a[@href='contact.php'][contains(text(),'Contact')]")
	WebElement contact_button;
	
	//iframe 
	@FindBy(xpath= "//iframe[@id='singleframe']")
	WebElement single_outer_frame;
	
	@FindBy(xpath= "//input[@type='text']")
	WebElement frame_texter;
	
	@FindBy(xpath= "//a[contains(text(),'Iframe with in an Iframe')]")
	WebElement multi_frame_button;
	
	
	@FindBy(xpath= "//iframe[@src='MultipleFrames.html']")
	WebElement First_iframe;
	
	@FindBy(xpath= "//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]")
	WebElement Second_iframe;
	
	
	
	
	
	
	
	/*public void Register() 
	{
		arrow_button.click();
		Firstname.sendKeys("Tim");
		Lastname.sendKeys("cock");
		Address.sendKeys("Apple pvt limites .\n USA");
		Email.sendKeys("ad1@mailinator.com");
		Phone.sendKeys("123456789");
		Gender.click();
		
		language.click();
		for(int i=0;i<language_list.size();i++) 
		   {
	
			if(language_list.get(i).getText().equalsIgnoreCase("English"))
			   {
				language_list.get(i).click();
			   }
		    }
		 Out.click();
		 
		 Skills.click();
		 for(int i=0;i<skills_list.size();i++)
		   {
			 if(skills_list.get(i).getText().contains("CAD")) 
			   {
				 skills_list.get(i).click(); 
			   }
		   }
		 
		 Select country1 = new Select(country);
		 country1.selectByValue("Brazil");
		 
		 select_country.click();
		 for(int i=0;i<select_country_text.size();i++)
		   {
			 if(select_country_text.get(i).getText().contains("India")) 
			   {
				 select_country_text.get(i).click(); 
			   }
		   }
		
		 Select DOB_select = new Select(DOB);
		 DOB_select.selectByVisibleText("1947");
		 
		 Select Day_select = new Select(Day);
		 Day_select.selectByIndex(10);
		 
		 Select Month_select = new Select(Month);
		 Month_select.selectByVisibleText("May");;
		 
		 password_1.sendKeys("Test@2345");
		 password_2.sendKeys("Test@2345");
		// submit.click();
*/		
	/*public void Switchto_page() {
		arrow_button.click();
		switchto_tab.click();
		for(int i=0;i<switchto_list.size();i++)
		{
			if (switchto_list.get(i).getText().contains("Alerts")) 
			  {
				switchto_list.get(i).click();
			  }
	    }
		alert_pri_box.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		alert_ok_cancel.click();
		alert_sec_box.click();
		alt.dismiss();
		
		alert_with_textbox.click();
		alert_teri_box.click();
		//changing alert message text 
		alt.sendKeys("alert message is been changed");
		alt.accept();
		String Alert_message=Alert_text_change.getText();
		System.out.println("Alert message text is : "+Alert_message);
		
		//page title
		String pagetitle= driver.getTitle();
		System.out.println("Here is the page title : " +pagetitle);
	     }*/
	
/*	public void windowhandling() 
	{
		arrow_button.click();
		switchto_tab.click();
		for(int i=0;i<switchto_list.size();i++)
		{
			if (switchto_list.get(i).getText().contains("Windows")) 
			  {
				switchto_list.get(i).click();
			  }
	    }
		String parent=driver.getWindowHandle();
		System.out.println("parent window id is "+parent);
		multiple_window.click();
		multiple_Window_click_button.click();
		Set<String>allwindows=driver.getWindowHandles();
		int s1=allwindows.size();
		System.out.println(""+s1);
		
		//Array function
		String window1=(String)allwindows.toArray()[0];
		String window2=(String)allwindows.toArray()[1];
		String window3=(String)allwindows.toArray()[2];
		System.out.println("child id in array function is "+window2);
		System.out.println("sub-child id in array function is "+window3);
		driver.switchTo().window(window3);
		String pagetitle=driver.getTitle();
		System.out.println(""+pagetitle);
			
			//iteraton function
		Iterator<String>w1=allwindows.iterator();
		w1.next();
		w1.next();
		String child_window=w1.next();
		System.out.println("child id in iteration is "+child_window);
		contact_button.click();
	
		//using for loop
		for(String child:allwindows) {
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
			}
		}
}*/
	
	
	public void iframehandling() {
		arrow_button.click();
		switchto_tab.click();
		for(int i=0;i<switchto_list.size();i++)
		{
			if (switchto_list.get(i).getText().contains("Frames")) 
			  {
				switchto_list.get(i).click();
			  }
	    }
		driver.switchTo().frame(single_outer_frame);
		frame_texter.sendKeys("This is enter in iframe text");
		driver.switchTo().defaultContent();
		multi_frame_button.click();
		driver.switchTo().frame(First_iframe);
		driver.switchTo().frame(Second_iframe);
		frame_texter.sendKeys("Text enter in second iframe");

	}
	}
