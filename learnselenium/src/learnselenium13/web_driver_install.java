package learnselenium13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_driver_install {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		
		 driver.get("https://projects.invisionapp.com/d/main#/projects/prototypes/16020482");

	}

}
