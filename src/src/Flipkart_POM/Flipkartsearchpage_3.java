package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartsearchpage_3 {
	//1
	@FindBy(xpath = ("//input[@placeholder='Search for products, brands and more']//following::a[normalize-space()='Life Amazing Secrets_Marathi']")) private WebElement Product1st;
	
	//2
	
	public Flipkartsearchpage_3(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	public void clickonproduct()
	{
		Product1st.click();
	}
}
