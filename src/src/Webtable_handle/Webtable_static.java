package Webtable_handle;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_static {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		
		//1.Get total number of columns
		int colums = driver.findElements(By.xpath("//table [@id='product']//tr/th")).size();
		System.out.println(colums);
		
		//2.Get total number of rows
		int rows = driver.findElements(By.xpath("//table [@id='product']//tr")).size();
		System.out.println(rows);
		
		//3.Retrieve Specific data from table = learn SQL practical
		String ref = driver.findElement(By.xpath("//table [@id='product']//tr[6]//td[2]")).getText();
		System.out.println(ref);
		
		//4.Retrieve all data from table
		
		List<WebElement> allrowsData =
				driver.findElements(By.xpath("//table//tr"));
				Iterator<WebElement> it = allrowsData.iterator();
				while(it.hasNext())
				{
				System.out.print(it.next().getText()+"   ");
				System.out.println();
				}
			
		}
	}


