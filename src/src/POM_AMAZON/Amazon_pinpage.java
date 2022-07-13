package POM_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_pinpage
{
	//1.
		@FindBy(id = "ap_password") private WebElement passwordtab;
		@FindBy(id = "signInSubmit")private WebElement Countinuetab1;
		
		//2.
			public Amazon_pinpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.
			public void sendpassword(String pass)
			{
				passwordtab.sendKeys(pass);
			}
			public void clickonsubmit()
			{
				Countinuetab1.click();
			}
}
