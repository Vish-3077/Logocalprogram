package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_act {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.create actions class element
		
		Actions ac=new Actions(driver);
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
//		//1. by 2steps
//		ac.moveToElement(rightclickbutton).perform();
//		ac.contextClick().perform();
		
		//2.multiple actions
		//ac.moveToElement(rightclickbutton).contextClick().build().perform();
		
		//3. direct action
		ac.contextClick(rightclickbutton).perform();
		
		for(int i=0;i<=5;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		
		ac.sendKeys(Keys.ENTER).perform();
		
		Alert al=driver.switchTo().alert();
		
		al.accept();
		Thread.sleep(5000);
		System.out.println("RIGHT CLICK TASK = PASS ");
		
		// =================================================
		// Double click
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		ac.doubleClick(doubleclickbutton).perform();
		
		al.accept();
		
		System.out.println("DOUBLE CLICK TASK = PASS");
				
		
	}

}
