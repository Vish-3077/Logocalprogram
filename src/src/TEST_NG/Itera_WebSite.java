package TEST_NG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Itera_WebSite {
	WebDriver driver;
  
  @BeforeClass()
  public void Openingurl () 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--incognito");
	  opt.addArguments("--disable-notifications");
	  driver = new ChromeDriver(opt);
	  driver.get("https://itera-qa.azurewebsites.net/Login");
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  }
  
  @BeforeClass
  public void login()
  {
	  WebElement id=driver.findElement(By.id("Username"));;
	  id.sendKeys("admin");
	  WebElement pwd=driver.findElement(By.id("Password"));
	  pwd.sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[normalize-space()='Test Automation']")).click();
  }
  
//  @BeforeMethod
//  public void testautoclick()
//  {
//	  driver.findElement(By.xpath("//a[normalize-space()='Test Automation']")).click();
//  }
  
  @Test
  public void Register()
  {
	  WebElement username = driver.findElement(By.xpath(" //input[@id='name']"));
	  username.sendKeys("Vish3077");
	  driver.findElement(By.id("phone")).sendKeys("888888888");
	  driver.findElement(By.id("email")).sendKeys("Kolapkarvish");
	  driver.findElement(By.id("password")).sendKeys("56454211");
  }
  
  @Test (invocationCount = 4, dependsOnMethods = "Register")
  public void address() throws InterruptedException
  {
	  WebElement add = driver.findElement(By.id("address"));
	  add.sendKeys(" | AX ._. XA | ");
	  Thread.sleep(200);
	 
//	 
//	  String exp= " | AX ._. XA | ";
//	  assertEquals(act, exp , "The value in address is not equal");
//	  Reporter.log("The value in address in matched to expected results!!!");
//	  
	  
  }
  
  @Test (invocationCount = 3, dependsOnMethods = "address")
  public void submit()
  {
	  WebElement click = driver.findElement(By.name("submit"));
	  click.click();
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  String scroll = "arguments[0].scrollIntoView()";
	  js.executeScript(scroll, click);
	  js.executeScript("arguments[0].style.border='10px solid red'", click);
  }
  
  @Test (priority = 1)
  public void upload ()
  {
	  
	  driver.findElement(By.id("inputGroupFile02")).sendKeys("F:\\Paris\\makeup art\\DCIM\\100CANON\\1.JPG");
	  String scroll = "arguments[0].scrollIntoView()";
	  WebElement uploadbutton = driver.findElement(By.xpath("//span [text() ='Upload' ]"));
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript(scroll,uploadbutton);
	  js.executeScript("arguments[0].style.border='10px solid red'", uploadbutton);
	  uploadbutton.click();
	  
  }
  
}
