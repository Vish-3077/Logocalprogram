package Amazon_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonsearchproduct {

	//1.
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']//following::span[normalize-space()='OnePlus 10R 5G (Sierra Black, 8GB RAM, 128GB Storage, 80W SuperVOOC)']")private WebElement Product;
	
	//2.
	public amazonsearchproduct(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//3.
	//scroll
	
	
	public void clickonproduct()
	{
		Product.click();
	}
	
}
