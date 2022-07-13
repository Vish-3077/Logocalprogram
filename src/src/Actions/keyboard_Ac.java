package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_Ac {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions ac=new Actions(driver);
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
//		driver.switchTo().defaultContent();
		Thread.sleep(200);
		
		WebElement searchbar = driver.findElement(By.name("q"));
		ac.keyDown(searchbar, Keys.SHIFT).sendKeys("D").keyUp(searchbar, Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).sendKeys("ramatic").sendKeys(Keys.SPACE).sendKeys("sunset").build().perform();
		Thread.sleep(5000);
		
		for(int i=1;i<=5;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
											
		}
		ac.sendKeys(Keys.ENTER).perform();
		
		WebElement image1 = driver.findElement(By.id("dimg_1"));
		Thread.sleep(200);
		
		ac.dragAndDrop(image1, searchbar).perform();
		
	}

}
