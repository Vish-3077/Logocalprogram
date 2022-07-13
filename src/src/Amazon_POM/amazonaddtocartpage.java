package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonaddtocartpage {

	//1
	//@FindBy(xpath= "(//span [text,'38,999.00'])[4]") private WebElement price; 
	@FindBy(xpath="(//form [@method='post'])[2]//following::div[@id='addToCart_feature_div'][2]") private WebElement addtocartbutton;
	@FindBy(id="attach-close_sideSheet-link") private WebElement closebutton;
	
	//2.
	
	public amazonaddtocartpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	//3.
	public void clickonaddtocart()
	{
			addtocartbutton.click();
					
	}
	public void clickonclosebutton()
	{
		closebutton.click();
	}
}


