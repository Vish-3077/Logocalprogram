package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkarthomepagevalidation {
	
	//Homepage for validation if  (1) item is added in cart or not 
	
	//1.
	
	@FindBy(xpath="//div [text()='1']") private WebElement noofcartitems;
	@FindBy(xpath="//div [text()='VISHWAJEET']" ) private WebElement userId; 
	@FindBy(xpath="//div [text()='Logout']")private WebElement Logout;

	//2
	public Flipkarthomepagevalidation(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	//3.
	public void gettextnoofitems()
	{
		String items = noofcartitems.getText();
		
		if(items.contentEquals("1"))
		{
			System.out.println("YOUR ITEM(1) SUCCESFULLY ADDED TO CART!!!");
		}
		else
		{
			System.out.println("Your Cart is Empty!");
		}
	}
	public void clickonuserid()
	{	
		String username = userId.getText();
		
		if(username.contains("VISHWA"))
		{ 
			System.out.println("YOUR USER NAME IS CORRECT ");
			userId.click();
		
		}
	}
	public void clickonlogout()
	{
		Logout.click();
	}
}
