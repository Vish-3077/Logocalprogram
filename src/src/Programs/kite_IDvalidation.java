package Programs;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_IDvalidation {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		File fle= new File ("D:\\VELOCITY\\SELENIUM\\APACHI POI\\Sample.xlsx");
		Sheet ref = WorkbookFactory.create(fle).getSheet("Sheet1");
		String ID = ref.getRow(2).getCell(0).getStringCellValue();
		String pass = ref.getRow(2).getCell(1).getStringCellValue();
		String pin = ref.getRow(2).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		WebElement useridtab = driver.findElement(By.id("userid"));
		WebElement passwordtab = driver.findElement(By.id("password"));
		WebElement loginbutton=driver.findElement(By.xpath("//button [@type='submit']"));
		useridtab.sendKeys(ID);
		passwordtab.sendKeys(pass);
		loginbutton.click();
		Thread.sleep(1000);
		
		 WebElement pintab = driver.findElement(By.xpath("//input [@type='password']"));
		 WebElement	continuetab = driver.findElement(By.xpath("//button [@type='submit']"));
		 pintab.sendKeys(pin);
		 continuetab.click();
		 Thread.sleep(1000);
		 
		 
		 WebElement userID = driver.findElement(By.xpath("//span [@class='user-id']"));
		 //WebElement Logoutbutton = driver.findElement(By.xpath("//a [@target='_self']"));
		 
		 if(ID.equals(userID.getText()))
		 {
			 System.out.println("TEST CASE PASSED");
		 }
		 else
		 {
			 System.out.println("Test case failed");
		 }
		
		userID.click(); 
		//Logoutbutton.click();
	}

}
