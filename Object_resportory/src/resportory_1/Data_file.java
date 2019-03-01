package resportory_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Data_file {


public void Data_file() throws IOException{


File src=new File(".driver.properties");


FileInputStream fis=new FileInputStream(src);


Properties pro=new Properties();


pro.load(fis);

System.out.println("Property class loaded");


WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://www.facebook.com");

driver.findElement(By.xpath(pro.getProperty("facebook.login.username.xpath"))).
sendKeys("Selenium@gmail.com");


driver.findElement(By.xpath(pro.getProperty("facebook.login.password.xpath"))).
sendKeys("adsadasdas");


driver.findElement(By.xpath(pro.getProperty("facebook.login.Signup.xpath"))).click();

}

}

