package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazoncartpagevalidation 
{
	@FindBy(id="nav-cart" )private WebElement itemincart;
	
	public Amazoncartpagevalidation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void checkitemincart() 
	{
		if(itemincart.isDisplayed())
		{
			System.out.println("ITEM IS ADDED TO CART");
		}
		else 
		{
			System.out.println("Item is not added in cart");
		}
				
	}
}
