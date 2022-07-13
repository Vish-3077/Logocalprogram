package Excel_sheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamic_read_excelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File fle= new File ("D:\\VELOCITY\\SELENIUM\\APACHI POI\\Sample.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(fle).getSheet("Sheet1");
		
		int allrows = mySheet.getLastRowNum();
		int rowcount = allrows;
		short allcolumns = mySheet.getRow(allrows).getLastCellNum();
		int columncount = allcolumns - 1;
		
		for(int i = 0;i<=rowcount;i++)
		{
			for(int j=0;j<=columncount;j++)
			{
				Cell cells = mySheet.getRow(i).getCell(j);
				CellType datatype = cells.getCellType();
				
				if(datatype==CellType.STRING)
				{
					 String result = cells.getStringCellValue();
					 System.out.print(result+ " ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double result = cells.getNumericCellValue();
					System.out.print(result + " ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					boolean result = cells.getBooleanCellValue();
					System.out.print(result + " ");
				}
				else if(datatype ==CellType.BLANK )
				{
					System.out.println();
				}
				
			}
			
			System.out.println();
		}

	}


}
