package CT_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT_1 {
	//WebDriver driver;
  @Parameters("browserName")	
  @Test
  public void Crossbrowser(String name) 
  {	
	 WebDriver driver =null;
	  
	  if(name.equals("chrome")) 
	  {
	  System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
	  		driver= new ChromeDriver();
	  }
	  else if(name.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\geckodriver.exe");
		  	driver= new FirefoxDriver();
	  }
	  
	  driver.get("https://www.instagram.com/");
	  
  }
  
}
