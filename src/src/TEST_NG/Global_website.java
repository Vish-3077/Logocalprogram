package TEST_NG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Global_website {
	SoftAssert sa = new SoftAssert();
	WebDriver driver;
	

  
@BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--incognito");
	  opt.addArguments("--disable-notifications");
	  opt.addArguments("--start-maximized");
	  driver = new ChromeDriver(opt);
	  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  }

  @Test
  public void loginbutton() throws InterruptedException
  {
	  driver.findElement(By.xpath("//button [text()='Customer Login']")).click();
	  WebElement userslist = driver.findElement(By.name("userSelect"));
	  Select S= new Select (userslist);
	  S.selectByVisibleText("Harry Potter");
	  driver.findElement(By.xpath("//button [text()='Login']")).click();
	  Thread.sleep(1000);
	  WebElement Act_user = driver.findElement(By.xpath("//span [text()='Harry Potter']"));
	  String Actualuserid = Act_user.getText();
	  String Expecteduserid = "Harry Potter";
	  
	  Assert.assertEquals(Actualuserid, Expecteduserid, "The Expcted user is is not equal!! ");  // ======= AssertEquals ========
	  Reporter.log("The Expected and Actual user is Mathced. ", true);
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].style.border='5px solid red'", Act_user);
  }
  
  @Test(dependsOnMethods = "loginbutton")
  public void Changecurrency() throws InterruptedException
  {
	  WebElement numberlist = driver.findElement(By.xpath("//select[@id='accountSelect']"));
	  Select S= new Select(numberlist);
	  S.selectByValue("number:1006");
	  Thread.sleep(1000);
	  String actcurrency = driver.findElement(By.xpath("//strong [text()='Rupee']")).getText();
	  String defaultcurrecy="dollar";
	  
	  Assert.assertNotEquals(actcurrency, defaultcurrecy, "The defualt currency is dollar");
	  Reporter.log("The selected currency is rupee",true);  	//======= AssertnotEquals ==========
	  
 }
  
  @Test(dependsOnMethods = "Changecurrency")
  public void deposit()
  {
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
	  WebElement amounttab = driver.findElement(By.xpath(" //input[@placeholder='amount']"));
	  String amount = amounttab.getText();
	  Assert.assertNotNull(amount,"The amount tab contain value");
	  Reporter.log("The Amount tab is Blank ");
	  amounttab.sendKeys("10000");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Reporter.log("The Amount get deposited successfully");
   }
  
  @Test (dependsOnMethods ="deposit")
  public void Transactions() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")).click();
	  String Table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tr[@id='anchor0'] ")).getText();
	  System.out.println(Table);
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].style.border='5px solid red'", Table);
	  
  }
  
  
  @AfterClass
  public void afterClass() 
  {
	 
  }

}
