import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPOPUP {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		Set <String> PAGEIDS =driver.getWindowHandles();
		System.out.println("ALL IDS  " + PAGEIDS );
		
		ArrayList<String> AL = new ArrayList<String>(PAGEIDS);
		Iterator<String>IT =AL.iterator();
		
		String Main=IT.next();
		String Child=IT.next();
		
		
				
		driver.switchTo().window(AL.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Contact me")).click();
		Thread.sleep(1000);
				

		driver.switchTo().window(AL.get(0));
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		

	}

}
