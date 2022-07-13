package POM_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonhome 

{
	@FindBy (id="nav-link-accountList-nav-line-1")private WebElement profilename;
	@FindBy (id="nav-link-accountList") private WebElement Profile;
	
	
	public Amazonhome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String Getusername()
	{
		String Actualusername = profilename.getText();
		return Actualusername;
		
	}
	public void clickonprofile()
	{
		Profile.click();
	}

	
}
