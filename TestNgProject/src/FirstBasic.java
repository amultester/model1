
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstBasic {
	 WebDriver driver;
	 
	@Test(priority=1,description="first test case")
	public void Chromelanuch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	 
	}

	
		@Test(priority=2,description=" second test case")
	public void pageopen() 
		{
	 driver.get("https://www.spicejet.com/");
	 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
	}
		
	
	@Test(priority=3,description=" Third test case")
	public void From() {
	 List<WebElement> desinationlist =driver.findElements(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a"));
		System.out.println("the list is "+desinationlist.size());
	 for(int i=0; i<desinationlist.size(); i++)
	 {
		 WebElement inputvalue= desinationlist.get(i);
		String printedvalue = inputvalue.getText();
				
		if(printedvalue.contains("Goa"))
		{
			desinationlist.get(i).click();
			System.out.println("success");
		}
		
		else if(printedvalue.contains("Dubai"))
		{
			desinationlist.get(i).click();
			
		}
	 }
	}
	 @Test(priority=4,description="fourth test case")
	 public void To() {
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Chennai");
	 } 
	
	
	 @Test(priority=5,description="fifth test case")
	 public void Returndatecalender() throws Exception {
	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	   Thread.sleep(3000);
	   
       List <WebElement> tablevalue = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
	    for(int i=0;i<tablevalue.size();i++)
	    {
	    WebElement tabledatacollections =	tablevalue.get(i);
	    String result = tabledatacollections.getText();
	 
	    if(result.contains("26"))
	    {
	    	tablevalue.get(i).click();
	    	Thread.sleep(3000);
	    	
	    }
	   
	    }
	 }
	 @Test(priority=6,description="sixth test case")
	 public void passengerselection() throws Exception {
		  driver.findElement(By.xpath("//div[@class='row1 adult-infant-child']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@id='hrefDecChd']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		  }
	 
	 @Test(priority=7,description="seventh test case")
	 public void currency() {
		 Select a1=new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		 a1.selectByVisibleText("USD");
		 }
	 }
	




