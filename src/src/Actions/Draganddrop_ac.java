package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_ac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		
		WebElement bankButton = driver.findElement(By.id("credit2"));
		WebElement salesButton = driver.findElement(By.id("credit1"));
		WebElement bankdest = driver.findElement(By.id("bank"));
		WebElement loandest = driver.findElement(By.id("loan"));
		WebElement amountbutton= driver.findElement(By.id("fourth"));
		WebElement bankamount = driver.findElement(By.id("amt7"));
		WebElement loanamount = driver.findElement(By.id("amt8"));
		
		Actions ac= new Actions(driver);
		
		ac.dragAndDrop(bankButton, bankdest).perform();
		Thread.sleep(1000);
		ac.dragAndDrop(salesButton, loandest).perform();
		System.out.println("BANK AND SALES ADDED ");
		ac.dragAndDrop(amountbutton, bankamount).perform();
		ac.dragAndDrop(amountbutton, loanamount).perform();
		
		System.out.println("TASK COMPLETED");
		
	}

}
