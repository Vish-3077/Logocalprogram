package Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_properties
{
	public static String Exceldata(int i , int j) throws EncryptedDocumentException, IOException
	{
		
		 File myfile = new File("D:\\VELOCITY\\SELENIUM\\APACHI POI\\FLIPKART.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 String Value = mysheet.getRow(i).getCell(j).getStringCellValue();
		 return Value;
	}
	
	public static void getscreenshot(WebDriver driver, String TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File ("D:\\VELOCITY\\Selenium notes\\SS\\Screenshot"+ TCID + ".png ");
		FileHandler.copy(source, target);		
	}
	
	public static String DatafromResources(String key) throws IOException
	{
		Properties pt= new Properties();
		FileInputStream File1= new FileInputStream("C:\\Users\\VK\\eclipse-workspace\\SEL\\myPropertyfile.properties");
		pt.load(File1);
		String input = pt.getProperty(key);
		return input;
			
	}
}
