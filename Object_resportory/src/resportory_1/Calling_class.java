package resportory_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling_class {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		Data_file obj = new Data_file();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\innobot-user-1.LAPTOP-9DDO4JSH\\.eclipse\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(obj.geturlpath());

	}

}
