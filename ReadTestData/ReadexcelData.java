package ReadTestData;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadexcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		FileInputStream fis = new FileInputStream("./Data/Test.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);
	     Sheet sh = wb.getSheet("Mark");
	     Row row= sh.getRow(0);
	     Cell cell = row.getCell(0);
	     String data = cell.getStringCellValue();
	     System.out.println(data);
		

	}
	
}
