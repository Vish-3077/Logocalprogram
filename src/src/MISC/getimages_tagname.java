package MISC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getimages_tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Dramatic Sunset");
		Thread.sleep(2000);
		List<WebElement> results = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println(results.size());
		String exp="dramatic sunset sky";
		
		for(WebElement R:results)
		{
			System.out.println(R.getText());
			
			if(R.getText().equals(exp))
			{
				R.click();
				break;
			}
		}
		
		
		

	}

}
