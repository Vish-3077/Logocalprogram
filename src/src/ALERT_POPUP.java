import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_POPUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
/*		
		driver.findElement(By.id("timerAlertButton"));
		Thread.sleep(50000);
		alert.accept();
	*/	
		Thread.sleep(1000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(100);
		String A = "Do you confirm";
		System.out.println(alert.getText());
		String text = alert.getText();
		
		if (text.contains(A)) 
		{
			alert.accept();
			Thread.sleep(1000);
			driver.findElement(By.id("promtButton")).click();
			alert.sendKeys(text);			
			alert.accept();
			System.out.println("TASK COMPLETED");
			
		} 
		else 
		{
			alert.dismiss();
			
			
		}
		
		
	}

}
