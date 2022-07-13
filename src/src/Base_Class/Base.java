package Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	

	protected WebDriver driver;

public void openbrowser() 
{
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--incognito");
	  opt.addArguments("--disable-notifications");
	  opt.addArguments("--start-maximized");
	  driver = new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
}


	
}
