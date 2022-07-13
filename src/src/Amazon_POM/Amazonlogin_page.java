package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonlogin_page {
	
	//1. Variables
	
	@FindBy(id="ap_email") private WebElement username;
	@FindBy(id="continue") private WebElement continuebutton;

	//2.Constructor
	
	public Amazonlogin_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void sendkeysusername()
	{
		username.sendKeys("8888010069");
	}
	public void clickoncontinue()
	{
		continuebutton.click();
	}
}
