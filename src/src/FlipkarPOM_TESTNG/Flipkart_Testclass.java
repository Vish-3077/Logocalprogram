package FlipkarPOM_TESTNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_Testclass {
  
	WebDriver driver;
	Flipkart_loginpage login;
	Flipkart_homepage home;
	Sheet mysheet;
	
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		  ChromeOptions opt = new ChromeOptions();
		  opt.addArguments("--incognito");
		  opt.addArguments("--disable-notifications");
		  opt.addArguments("--start-maximized");
		  driver = new ChromeDriver(opt);
		  login= new Flipkart_loginpage(driver);
		  home = new Flipkart_homepage(driver);
		  driver.get("https://www.flipkart.com/");
		  File myfile = new File("D:\\VELOCITY\\SELENIUM\\APACHI POI\\FLIPKART.xlsx");
		  mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	}
	@BeforeMethod
  public void login() 
  {
		 String UN =mysheet.getRow(1).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
		 
		 login.SendkeysuserID(UN);
		 login.Sendkeyspassword(PWD);
		 login.clickonlogin();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 		 		   
  }
	@Test
	public void validateuserID()
	{
		String expectedID = mysheet.getRow(1).getCell(0).getStringCellValue();
		String actualID = "VISHWAJEET";
		Assert.assertEquals(expectedID, actualID, "The Expected userid is not equal to actual ID");
		Reporter.log("The expected userid is equal to actual ID");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
}
