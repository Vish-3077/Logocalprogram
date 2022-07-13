package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsearchpage {

	//1. 
	@FindBy(id="twotabsearchtextbox") private WebElement Searchbar;
	@FindBy(id="nav-search-submit-button") private WebElement Submitbutton;

	//2.
	public Amazonsearchpage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	
	//3.
	public void Sendkeyssearchbar()
	{
		Searchbar.sendKeys("one plus 10R");
	}
	public void Clicksubmitbutton()
	{
		Submitbutton.click();
	}
}
