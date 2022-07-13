package Excel_sheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet_read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// create file class object and pass xpath of xlsx file

		File fle= new File ("D:\\VELOCITY\\SELENIUM\\APACHI POI\\Sample.xlsx");
		
		String id = WorkbookFactory.create(fle).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue(); // to get string value from excel sheet
		System.out.println(id);
		
		double number = WorkbookFactory.create(fle).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue(); // to get numeric value from xlsx sheet
		System.out.println(number);
		
		//boolean bool = WorkbookFactory.create(fle).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue(); // to get boolean value from cell
		//System.out.println(bool);
	}

}
