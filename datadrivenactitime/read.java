package datadrivenactitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read {
	
	public String test(String excelPath,String sheetName,int rowno,int cellno) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelPath);
     Workbook wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet(sheetName);
     Row row1= sh.getRow(rowno);
     Cell cell1 = row1.getCell(cellno);
     String data = cell1.getStringCellValue();
	return data;
	}
	public int test1(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelPath);
           Workbook wb = WorkbookFactory.create(fis);
           Sheet sh = wb.getSheet(sheetName);
           int cm = sh.getLastRowNum();
           return cm;
}
	

}
