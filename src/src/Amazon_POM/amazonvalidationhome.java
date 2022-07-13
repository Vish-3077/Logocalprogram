package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonvalidationhome {

	//1.
	@FindBy(id="nav-logo-sprites") private WebElement Homebutton;
	@FindBy(xpath="//span [@id='nav-cart-count']") private WebElement itemincart;
	@FindBy(id="nav-cart") private WebElement Cartbutton;
	
	//2.
	public amazonvalidationhome(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	//3.
	public void clickonhome()
	{
		Homebutton.click();
	}
	public void clickoncart()
	{
		Cartbutton.click();
	}
}
