package Excel_sheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Static_read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File fle= new File ("D:\\VELOCITY\\SELENIUM\\APACHI POI\\Sample.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(fle).getSheet("Sheet1");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String result=mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(result +" ");
			}
			System.out.println();
		}

	}

}
