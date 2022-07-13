package Annotations_TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Login_page {
	

	@Test (priority = -1)
  public void login() 
  {
		Reporter.log("User ID Successfully Validated",true);
  
  }
	
  @Test (priority= 1,invocationCount = 4)
  public void Refresh()
  {
	  
	  Reporter.log("Page Refreshing !!" ,true);
  }
  @BeforeClass
  
  public void Chromlaunch() throws InterruptedException
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Reporter.log("Successfully Launched browser",true);
		
  }

  @AfterClass
  public void Chromeclose()
  {
		Reporter.log("Successfully Closed browser",true);
  }
  
  @BeforeMethod
  public void Login_input()
  
  {
	  Reporter.log("LoGIN SUCCESSFUL",true);
  }

  @AfterMethod
  public void logout()
  {
	Reporter.log("User successfully LOGGED OUT, THANK YOU! ");
  } 
}
