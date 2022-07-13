import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOWHANDLES_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.makemytrip.com/");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[1]/div[2]/ul/li[1]/div")).click(); //trip ideas
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[1]/div[2]/ul/li[4]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[1]/div[2]/ul/li[5]")).click();
		Thread.sleep(1000);
		
		Set<String> IDS = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(IDS);
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[3]/span")).click();
		Thread.sleep(5000);
		driver.switchTo().window(al.get(3));
		driver.findElement(By.xpath("//label [@for='Loved Ones']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(al.get(2));
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.className("DestinationCard__Card-sc-1czmno9-0 gjMtnc")).click();
		
		
		
		
	
		

		
	}
		
	}


