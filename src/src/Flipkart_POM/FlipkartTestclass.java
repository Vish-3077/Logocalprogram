package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTestclass {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY\\SELENIUM\\new folder\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//1.FOR LOGIN PAGE
		Flipkartloginpage_1 loginpage=new Flipkartloginpage_1(driver);
		loginpage.Sendkeysusername();
		loginpage.Sendkeyspassword();
		loginpage.clickonlogin();
		
		Thread.sleep(1000);
		//2. FOR HOME PAGE
		Flipkarthomepage_2 homepage=new Flipkarthomepage_2(driver);
		homepage.sendkeyssearchtab();
		homepage.clickonsubmit();
		
		Thread.sleep(500);
		//3. FOR SEARCH PAGE
		Flipkartsearchpage_3 searchpage=new Flipkartsearchpage_3(driver);
		searchpage.clickonproduct();
		
		Thread.sleep(500);
		//4. FOR ADD TO CART PAGE
		Flipkartproductpage_4 addtocart= new Flipkartproductpage_4(driver);
		addtocart.clickonaddtocart();
		addtocart.clickonlogo();
		
		
		Thread.sleep(500);
		
		//5. Validation page
		Flipkarthomepagevalidation validate= new Flipkarthomepagevalidation(driver);
		validate.gettextnoofitems();
		validate.clickonuserid();
		validate.clickonlogout();
		
		Thread.sleep(1000);
		

	}

}
