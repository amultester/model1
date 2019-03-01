package Demo_site;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Skip_signin {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mickey");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mouse");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Innobot.\ntidelpark.\ncoimbatore");

		/*
		 * Tooltip printing Actions Error_text = new Actions(driver);
		 * Error_text.moveToElement(driver.findElement(By.xpath("//input[@type='email']"
		 * ))).build().perform(); String val= driver.findElement(By.
		 * xpath("//div[@class='col-sm-4 col-xs-4 tooltptext']//span")).getText();
		 * System.out.println(val);
		 */

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("demomail@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		/*
		 * List<WebElement> list = driver.findElements(By.tagName("input"));
		 *  for (int i= 0; i < list.size(); i++) {
		 * 
		 * if(list.get(i).getAttribute("type").trim().equalsIgnoreCase("checkbox")) {
		 * System.out.println("CheckBox = " + i + " " +
		 * list.get(i).getAttribute("value").trim()); // Select the check box if not
		 * already selected.
		 * 
		 * if ((list.get(i).getAttribute("value").trim().equals("Movies")))  {
		 * list.get(i).click(); } } }
		 */


		

		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		 List<WebElement> list3= driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		 for(int i=0;i<list3.size();i++) 
		 { 
		 WebElement e1 = list3.get(i);
		 String f2=e1.getText();
		 
		 if(f2.equalsIgnoreCase("Danish")) 
		 { 
			 e1.click();
		 } 
}
		 

		List<WebElement> list1 = driver.findElements(By.xpath("//select[@id='Skills']//option"));
		for (int i = 0; i < list1.size(); i++)
		{
			WebElement d1 = list1.get(i);
			String d2 = d1.getText();

			if (d2.contains("AutoCAD"))
			{
				list1.get(i).click();
			}
}

		List<WebElement> list = driver.findElements(By.xpath("//select[@id='countries']//option"));
		for (int i = 0; i < list.size(); i++) 
		{
			WebElement a2 = list.get(i);
			String a3 = a2.getText();

			if (a3.contains("Zimbabwe"))
			{
				list.get(i).click();
			}
}
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		List<WebElement> country_list = driver.findElements(By.xpath("//span[@class='select2-results']"));
		for (int i = 0; i < country_list.size(); i++) 
		{
			WebElement country_text = country_list.get(i);
			String country_data = country_text.getText();
			System.out.println(country_data);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Japan");
			driver.findElement(By.xpath("//input[@type='search']")).click();

			if (country_data.equalsIgnoreCase("Japan"))
			{
				country_list.get(i).click();
			}
		}
		
		

		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByValue("1955");

		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByIndex(2);

		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByIndex(5);

		driver.findElement(By.id("firstpassword")).sendKeys("Test@2345");

		driver.findElement(By.id("secondpassword")).sendKeys("Test@2345");

		String page_title = driver.getTitle();
		System.out.println("The page title is " + page_title);

	}
}

