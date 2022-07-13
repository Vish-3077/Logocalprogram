package POM_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class Amazon_login 
{

	//1.
	@FindBy(id = "ap_email") private WebElement Usernametab;
	@FindBy(id = "continue")private WebElement Countinuetab;
	
	//2.
		public Amazon_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
		public void sendusername(String un1)
		{
			Usernametab.sendKeys(un1);
		}
		public void clickonsubmit()
		{
			Countinuetab.click();
		}
	
}
