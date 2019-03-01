package learnselenium13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locator {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        
        driver.get("http://www.160by2.com/UserReg");
        
        driver.manage().window().maximize();
            
         driver.findElement(By.name("userName")).sendKeys("Pratik");
        Thread.sleep(2000);
        
        driver.findElement(By.id("mobileNo")).sendKeys("12345");
        Thread.sleep(2000);
        
        driver.findElement(By.id("emailId")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"emailId1\"]")).sendKeys("xyz@gmail.com");
        Thread.sleep(2000);
        
        String captchaValue = driver.findElement(By.xpath("//img[@id='captureImage']")).getText();  //this will read the captcha
        System.out.println(captchaValue);
        driver.findElement(By.xpath("//input[@id='capture']")).sendKeys(captchaValue);
        
        
        driver.findElement(By.id("userDOB")).click();
        Thread.sleep(2000);
        
        Select a1= new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
        a1.selectByIndex(2);
        Thread.sleep(2000);
        
        Select a2= new Select (driver.findElement(By.className("ui-datepicker-year")));
        a2.selectByValue("1927");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a")).click();
        Thread.sleep(2000);
        
             
       driver.findElement(By.xpath("//input[@id='userDOB']//following::input[@id='gender'][1]")).click();
       Thread.sleep(2000);
        
         
         Select a3= new Select(driver.findElement(By.className("redm-inpselect")));
         a3.selectByVisibleText("Coimbatore");
         Thread.sleep(2000);
         
         driver.findElement(By.name("capture")).sendKeys("Nv6ypk");
         Thread.sleep(2000);
         
         driver.findElement(By.className("setting-in")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.id("cterms")).click();
         Thread.sleep(2000);
         
        driver.findElement(By.xpath("//*[@id=\"reg_form\"]/div[10]/label/small/a")).click();
        Thread.sleep(2000);
        
      
	}

}
