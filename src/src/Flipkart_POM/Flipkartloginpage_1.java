package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartloginpage_1 {
	
	//1.variables
	
	@FindBy(xpath = "(//input [@type='text'])[2]") private WebElement username; 
	@FindBy(xpath = "//input [@type='password']" ) private WebElement password;
	@FindBy(xpath = "(//button [@type='submit'])[2]") private WebElement loginbutton;
	
	//2.constructor
	
	public Flipkartloginpage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void Sendkeysusername()
	{
		username.sendKeys("8888010069");
	}
	public void Sendkeyspassword()
	{
		password.sendKeys("vish3077");
	}
	public void clickonlogin()
	{
		loginbutton.click();
	}
	
}
