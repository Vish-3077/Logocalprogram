package Amazon_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SAMPLEE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifaction");
		WebDriver driver= new ChromeDriver(opt);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Amazonlogin_page login = new Amazonlogin_page(driver);
		login.sendkeysusername();
		login.clickoncontinue();
		Thread.sleep(1000);
		
		Amazonpasswordpage password= new Amazonpasswordpage(driver);
		password.gettextmobno();
		Thread.sleep(300);
		password.clickonsignin();
		
		Amazonsearchpage search=new Amazonsearchpage(driver);
		search.Sendkeyssearchbar();
		search.Clicksubmitbutton();
		Thread.sleep(200);
		
		amazonsearchproduct product= new amazonsearchproduct(driver);
		product.clickonproduct();
		Thread.sleep(5000);
		
		amazonaddtocartpage cart= new amazonaddtocartpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		cart.clickonaddtocart();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		cart.clickonclosebutton();
		
		amazonvalidationhome home= new amazonvalidationhome(driver);
		home.clickonhome();
		Thread.sleep(300);
		driver.navigate().refresh();
		home.clickoncart();
		
		Thread.sleep(3000);
		
		Amazoncartpagevalidation item = new Amazoncartpagevalidation(driver);
		item.checkitemincart();
	}

}
