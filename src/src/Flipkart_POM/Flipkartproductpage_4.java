package Flipkart_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartproductpage_4 {

	//1.\
	@FindBy(xpath = "(//div [contains(text(),'₹161')])[1]") private WebElement priceofproduct;
	@FindBy(xpath = "//button[text()='ADD TO CART']") private WebElement addtocartbutton;
	@FindBy(xpath = "//img [@title='Flipkart']") private WebElement Flipkarttitle;
	
	//2.
	
	public Flipkartproductpage_4(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	public void clickonaddtocart()
	{
		addtocartbutton.click();
	}
	public void clickonlogo()
	{
		Flipkarttitle.click();
	}
	
}

