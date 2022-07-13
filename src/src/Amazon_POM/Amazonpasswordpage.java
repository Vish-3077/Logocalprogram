package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpasswordpage {
	
	//1.
	
	@FindBy(xpath ="//span [text()='+918888010069']") private WebElement mobileno;
	@FindBy(id="ap_password") private WebElement password;
	@FindBy(id="signInSubmit") private WebElement signin;

	//2.
	public Amazonpasswordpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);						
	}
	
	
	//3
	public void gettextmobno()
	{
		String no = mobileno.getText();
		if(no.equals("+918888010069"))
		{
			password.sendKeys("vish3077");
			System.out.println("The User ID Validation = 1");
		}
	}
	public void clickonsignin()
	{
		signin.click();
	}
}
