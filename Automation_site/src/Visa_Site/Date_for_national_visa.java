package Visa_Site;


import java.sql.Driver;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Date_for_national_visa {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://service2.diplo.de/rktermin/extern/choose_category.do?locationCode=sing&realmId=67&categoryId=1317");
		//signapur
		//https://service2.diplo.de/rktermin/extern/choose_category.do?locationCode=sing&realmId=67&categoryId=1317
		
		//chennai
		//https://service2.diplo.de/rktermin/extern/choose_category.do?locationCode=chenn&realmId=407&categoryId=883
		
		driver.findElement(By.xpath("//body//div//div[@class='l-s']//div//div[@class='wrapper']//h3[1]//a[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(5000);

		/*// Appointment available( date fixed)
		driver.findElement(By.xpath("//div[@class='wrapper']//div[19]//div[2]//a[1]")).click();*/
		
		//Apppintment ( futher date)
		driver.findElement(By.xpath("//a[@class='arrow']")).click();
		
		/*//dates available
		driver.findElement(By.xpath("//font[contains(text(),'Dates available')]")).click();*/
	

		// Book appointment
		driver.findElement(By.xpath("//a[contains(text(),'Book this appointment')]")).click();
		

		// surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("1");

		// firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("2");

		// E-mail
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");

		// repeat E-mail
		driver.findElement(By.xpath("//input[@name='emailrepeat']")).sendKeys("abc@gmail.com");

		// salution

		Select salution = new Select(driver.findElement(By.id("appointment_newAppointmentForm_fields_0__content")));
		salution.selectByValue("Mr.");

		// passport number
		driver.findElement(By.xpath("//input[@name='fields[1].content']")).sendKeys("123456");

		// nationality
		driver.findElement(By.xpath("//input[@id='appointment_newAppointmentForm_fields_2__content']")).sendKeys("Indian");

		// dateofbirth
		driver.findElement(By.xpath("//input[@id='fields3content']")).click();

		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByIndex(2);

		Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("2018");

       //Select Date
		List<WebElement> date_list =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(int i=0;i<date_list.size();i++) {
			
			System.out.println(date_list.get(i).getText());
			
			if(date_list.get(i).getText().contains("13"))
				
				
			{
				
				date_list.get(i).click();
				
			}
		}
				
        //telephone number
        driver.findElement(By.xpath("//input[@name=\"fields[4].content\"]")).sendKeys("1234567899");

	}

}
