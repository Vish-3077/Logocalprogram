package FlipkarPOM_TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_loginpage 
{
	//1.variables
	
	@FindBy(xpath= "(//input [@type='text'])[2]")private WebElement Username;
	@FindBy(xpath= "//input [@type='password']")private WebElement password;
	@FindBy(xpath = "(//button [@type='submit'])[2]")private WebElement Countinuebutton;
	
	//2.constructor
	
	public Flipkart_loginpage(WebDriver driver) 
	{
	
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	
	public void SendkeysuserID(String un)
	{
		Username.sendKeys(un);
	}
	
	public void Sendkeyspassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonlogin()
	{
		Countinuebutton.click();
	}

}
