package Annotations_TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
 
	@Test (invocationCount = -3,priority = 1 )
  public void Mousecation() 
  {
	Reporter.log("Contextclick",true);  
  }
	@Test (priority = 2,invocationCount = 2)
	public void Keyboardaction()
	{
		Reporter.log("Sendkeys(ENTER)",true);
	}
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("--------------------------",true);
	  Reporter.log("Login page is Opened",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("Login paged closed",true);
	  Reporter.log("=========================",true);
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Chrome browser launched with selenium",true);
	  Reporter.log("Welcome to our site",true);
  }
  

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("THank you for visting site",true);
  }
  
}
