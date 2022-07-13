package TEST_CLASS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Class.Base_properties;
import POM_AMAZON.Amazon_login;
import POM_AMAZON.Amazon_pinpage;
import POM_AMAZON.Amazonhome;
import Utility_Class.Utility_properties;
import java.awt.event.ActionListener;



@Listeners(listener1.Listener.class)

public class AMAZON_TESTCLASS extends Base_properties
{
	
	
	Amazon_login login;
	Amazon_pinpage pin;
	Amazonhome home;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		openbrowser();
		login = new Amazon_login(driver);
		pin = new Amazon_pinpage(driver);
		home = new Amazonhome(driver);
	}
	@BeforeMethod
	public void logintoAZ() throws IOException
	{
		login.sendusername(Utility_properties.DatafromResources("AZ_UN"));
		login.clickonsubmit();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendpassword(Utility_properties.DatafromResources("AZ_PWD"));
		pin.clickonsubmit();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

	
		@Test
	  public void ValidateUsername() throws IOException 
	  {
		  Assert.assertEquals(home.Getusername(),Utility_properties.DatafromResources("AZ_UN"));
	  }
	
	@Test 
	public void ValidateID()
	{
		
	}
	
	@Test(dependsOnMethods = "ValidateUsername") 
	public void SKipped() throws IOException
	{
		Assert.assertNotEquals(home.Getusername(), Utility_properties.DatafromResources("AZ_UN"));
	}
	
	
}
