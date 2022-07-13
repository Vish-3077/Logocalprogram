package Base_Class;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility_Class.Utility_properties;

public class Base_properties 

{
	protected WebDriver driver;
	public void openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		  ChromeOptions opt = new ChromeOptions();
		  opt.addArguments("--incognito");
		  opt.addArguments("--disable-notifications");
		  opt.addArguments("--start-maximized");
		  driver = new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get(Utility_properties.DatafromResources("AZ_URL"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
}
