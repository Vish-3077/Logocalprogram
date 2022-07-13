package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkarthomepage_2 {

	//1.
	@FindBy(name = "q" ) private WebElement searchtab;
	@FindBy(xpath = "//button [@type='submit']") private WebElement submitbutton;

	//2
	public Flipkarthomepage_2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void sendkeyssearchtab()
	{
		searchtab.sendKeys("Lifes amazing secrets");
	}
	public void clickonsubmit()
	{
		submitbutton.click();
	}
}
