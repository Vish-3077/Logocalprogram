package Amazonlogin_TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


public class TEST1 {
	WebDriver driver;
	
  @Test
  public void validateuserid() 
  {
	  String Username = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	  if(Username.contains("vishwa"))
	  {
		  Reporter.log("Userid is validated with ID in database",true);
	  }
	  else
	  {
		  Reporter.log("Userid is validataion FAILED with ID in database",true);
	  }
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() 
  {	
	  driver.findElement(By.id("ap_email")).sendKeys("8888010069");;
	  driver.findElement(By.id("continue")).click();
	  Reporter.log("Login id correct",true);
  }

  @BeforeMethod
  public void passwordpage()
  {
	  driver.findElement(By.id("ap_password")).sendKeys("");
	  driver.findElement(By.id("signInSubmit")).click();
	  Reporter.log("Password is correct, LOGIN SUCCESSFUL ",true);
	  
  }
  
  @BeforeClass
  public void Launchchrome() 
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		Reporter.log("Chrome is lanched using automated software",true);
  }		
		
  @AfterClass
  public void closebrowser()
  { 
	driver.quit();		
  }
  
 }
