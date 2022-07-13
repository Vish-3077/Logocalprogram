package FlipkarPOM_TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_homepage 

{
	//1.
	@FindBy(xpath="/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div") private WebElement userid;
	@FindBy(xpath = "//a [@class='_3SkBxJ']") private WebElement carttab;
	
	//2.
	
	public Flipkart_homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	public String getactualID()
	{
		String getactualuserID = userid.getText();
		return getactualuserID;
	}
	public void clickoncart()
	{
		carttab.click();
	}
}
