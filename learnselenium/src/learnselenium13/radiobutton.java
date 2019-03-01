package learnselenium13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	    
	  List<WebElement> driver1 = driver.findElements(By.xpath("//input[(@type=\"radio\") and(@name=\"lang\")]"));
	  
	  
	  for(int i=0;i<driver1.size();i++)
	  {
		WebElement radio_button =  driver1.get(i);
		
		String action =radio_button.getAttribute("id");
		  
		System.out.println("The button are "+action);
		
		if(action.contains("java"))
		{
			driver1.get(i).click();
		}
	  }

	}

}
