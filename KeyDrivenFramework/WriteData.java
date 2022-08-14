package KeyDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
public class WriteData {
      
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Flib flib = new Flib();
		for(int i=1;i<4;i++) {
		flib.writeExcelData("./Data/write.xlsx", "test1", i, 1, "Godse");
		}

	}

}
